package com.google.firebase.firestore.local;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.firebase.Timestamp;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.core.PipelineUtilKt;
import com.google.firebase.firestore.core.QueryOrPipeline;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentCollections;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.proto.MaybeDocument;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.BackgroundQueue;
import com.google.firebase.firestore.util.Function;
import com.google.firebase.firestore.util.Util;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
final class SQLiteRemoteDocumentCache implements RemoteDocumentCache {

    @VisibleForTesting
    static final int BINDS_PER_STATEMENT = 9;

    /* JADX INFO: renamed from: db */
    private final SQLitePersistence f23753db;
    private final DocumentTypeBackfiller documentTypeBackfiller = new DocumentTypeBackfiller();
    private IndexManager indexManager;
    private final LocalSerializer serializer;

    public enum DocumentType {
        NO_DOCUMENT(1),
        FOUND_DOCUMENT(2),
        UNKNOWN_DOCUMENT(3),
        INVALID_DOCUMENT(4);

        final int dbValue;

        DocumentType(int i2) {
            this.dbValue = i2;
        }

        public static DocumentType forMutableDocument(MutableDocument mutableDocument) {
            if (mutableDocument.isNoDocument()) {
                return NO_DOCUMENT;
            }
            if (mutableDocument.isFoundDocument()) {
                return FOUND_DOCUMENT;
            }
            if (mutableDocument.isUnknownDocument()) {
                return UNKNOWN_DOCUMENT;
            }
            Assert.hardAssert(!mutableDocument.isValidDocument(), "MutableDocument has an unknown type", new Object[0]);
            return INVALID_DOCUMENT;
        }
    }

    public static class DocumentTypeBackfiller {
        private final ConcurrentHashMap<BackfillKey, DocumentType> documentTypeByBackfillKey;

        public static class BackfillKey {
            final String path;
            final int readTimeNanos;
            final int readTimeSeconds;

            public BackfillKey(String str, int i2, int i3) {
                this.path = str;
                this.readTimeSeconds = i2;
                this.readTimeNanos = i3;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof BackfillKey)) {
                    return false;
                }
                BackfillKey backfillKey = (BackfillKey) obj;
                return this.readTimeSeconds == backfillKey.readTimeSeconds && this.readTimeNanos == backfillKey.readTimeNanos && Objects.equals(this.path, backfillKey.path);
            }

            public int hashCode() {
                return Objects.hash(this.path, Integer.valueOf(this.readTimeSeconds), Integer.valueOf(this.readTimeNanos));
            }

            @NonNull
            public String toString() {
                StringBuilder sb = new StringBuilder("DocumentTypeBackfiller.BackfillKey(path=");
                sb.append(this.path);
                sb.append(", readTimeSeconds=");
                sb.append(this.readTimeSeconds);
                sb.append(", readTimeNanos=");
                return AbstractC0271e0.m402j(sb, ")", this.readTimeNanos);
            }
        }

        public static class BackfillSqlInfo {
            final Object[] bindings;
            final int numDocumentsAffected;
            final String sql;

            public BackfillSqlInfo(String str, Object[] objArr, int i2) {
                this.sql = str;
                this.bindings = objArr;
                this.numDocumentsAffected = i2;
            }
        }

        private DocumentTypeBackfiller() {
            this.documentTypeByBackfillKey = new ConcurrentHashMap<>();
        }

        public void backfill(SQLitePersistence sQLitePersistence) {
            while (true) {
                BackfillSqlInfo backfillSqlInfoCalculateBackfillSql = calculateBackfillSql();
                if (backfillSqlInfoCalculateBackfillSql == null) {
                    return;
                } else {
                    sQLitePersistence.execute(backfillSqlInfoCalculateBackfillSql.sql, backfillSqlInfoCalculateBackfillSql.bindings);
                }
            }
        }

        public BackfillSqlInfo calculateBackfillSql() {
            if (this.documentTypeByBackfillKey.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            Iterator<BackfillKey> it = this.documentTypeByBackfillKey.keySet().iterator();
            int i2 = 0;
            while (it.hasNext() && arrayList.size() < 900) {
                BackfillKey next = it.next();
                DocumentType documentTypeRemove = this.documentTypeByBackfillKey.remove(next);
                if (documentTypeRemove != null) {
                    i2++;
                    arrayList.add(next.path);
                    int size = arrayList.size();
                    arrayList.add(Integer.valueOf(next.readTimeSeconds));
                    int size2 = arrayList.size();
                    arrayList.add(Integer.valueOf(next.readTimeNanos));
                    int size3 = arrayList.size();
                    arrayList.add(Integer.valueOf(documentTypeRemove.dbValue));
                    int size4 = arrayList.size();
                    sb.append(" WHEN path=?");
                    sb.append(size);
                    AbstractC1456a.m2455v(sb, " AND read_time_seconds=?", size2, " AND read_time_nanos=?", size3);
                    sb.append(" THEN ?");
                    sb.append(size4);
                    if (sb2.length() > 0) {
                        sb2.append(" OR");
                    }
                    AbstractC1456a.m2455v(sb2, " (path=?", size, " AND read_time_seconds=?", size2);
                    sb2.append(" AND read_time_nanos=?");
                    sb2.append(size3);
                    sb2.append(')');
                }
            }
            if (i2 == 0) {
                return null;
            }
            return new BackfillSqlInfo("UPDATE remote_documents SET document_type = CASE" + ((Object) sb) + " ELSE NULL END WHERE" + ((Object) sb2), arrayList.toArray(), i2);
        }

        public void enqueue(String str, int i2, int i3, MutableDocument mutableDocument) {
            this.documentTypeByBackfillKey.putIfAbsent(new BackfillKey(str, i2, i3), DocumentType.forMutableDocument(mutableDocument));
        }
    }

    public SQLiteRemoteDocumentCache(SQLitePersistence sQLitePersistence, LocalSerializer localSerializer) {
        this.f23753db = sQLitePersistence;
        this.serializer = localSerializer;
    }

    private MutableDocument decodeMaybeDocument(byte[] bArr, int i2, int i3) {
        try {
            return this.serializer.decodeMaybeDocument(MaybeDocument.parseFrom(bArr)).setReadTime(new SnapshotVersion(new Timestamp(i2, i3)));
        } catch (InvalidProtocolBufferException e) {
            throw Assert.fail("MaybeDocument failed to parse: %s", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAll$0(BackgroundQueue backgroundQueue, Map map, Cursor cursor) {
        lambda$getAll$1(backgroundQueue, map, cursor, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$getDocumentsMatchingQuery$3(QueryOrPipeline queryOrPipeline, Set set, MutableDocument mutableDocument) {
        return Boolean.valueOf(queryOrPipeline.matches(mutableDocument) || set.contains(mutableDocument.getKey()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processRowInBackground$2(byte[] bArr, int i2, int i3, boolean z, String str, Function function, Map map) {
        MutableDocument mutableDocumentDecodeMaybeDocument = decodeMaybeDocument(bArr, i2, i3);
        if (z) {
            this.documentTypeBackfiller.enqueue(str, i2, i3, mutableDocumentDecodeMaybeDocument);
        }
        if (function == null || ((Boolean) function.apply(mutableDocumentDecodeMaybeDocument)).booleanValue()) {
            synchronized (map) {
                map.put(mutableDocumentDecodeMaybeDocument.getKey(), mutableDocumentDecodeMaybeDocument);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processRowInBackground, reason: merged with bridge method [inline-methods] */
    public void lambda$getAll$1(BackgroundQueue backgroundQueue, final Map<DocumentKey, MutableDocument> map, Cursor cursor, final Function<MutableDocument, Boolean> function) {
        final byte[] blob = cursor.getBlob(0);
        final int i2 = cursor.getInt(1);
        final int i3 = cursor.getInt(2);
        final boolean zIsNull = cursor.isNull(3);
        final String string = cursor.getString(4);
        Runnable runnable = new Runnable() { // from class: com.google.firebase.firestore.local.G
            @Override // java.lang.Runnable
            public final void run() {
                this.f23724s.lambda$processRowInBackground$2(blob, i2, i3, zIsNull, string, function, map);
            }
        };
        if (cursor.isFirst() && cursor.isLast()) {
            runnable.run();
        } else {
            backgroundQueue.submit(runnable);
        }
    }

    @Override // com.google.firebase.firestore.local.RemoteDocumentCache
    public void add(MutableDocument mutableDocument, SnapshotVersion snapshotVersion) {
        Assert.hardAssert(!snapshotVersion.equals(SnapshotVersion.NONE), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        DocumentKey key = mutableDocument.getKey();
        Timestamp timestamp = snapshotVersion.getTimestamp();
        this.f23753db.execute("INSERT OR REPLACE INTO remote_documents (path, path_length, read_time_seconds, read_time_nanos, document_type, contents) VALUES (?, ?, ?, ?, ?, ?)", EncodedPath.encode(key.getPath()), Integer.valueOf(key.getPath().length()), Long.valueOf(timestamp.getSeconds()), Integer.valueOf(timestamp.getNanoseconds()), Integer.valueOf(DocumentType.forMutableDocument(mutableDocument).dbValue), this.serializer.encodeMaybeDocument(mutableDocument).toByteArray());
        this.indexManager.addToCollectionParentIndex(mutableDocument.getKey().getCollectionPath());
    }

    @Override // com.google.firebase.firestore.local.RemoteDocumentCache
    public MutableDocument get(DocumentKey documentKey) {
        return getAll(Collections.singletonList(documentKey)).get(documentKey);
    }

    @Override // com.google.firebase.firestore.local.RemoteDocumentCache
    public Map<DocumentKey, MutableDocument> getAll(Iterable<DocumentKey> iterable) throws InterruptedException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (DocumentKey documentKey : iterable) {
            arrayList.add(EncodedPath.encode(documentKey.getPath()));
            map.put(documentKey, MutableDocument.newInvalidDocument(documentKey));
        }
        SQLitePersistence.LongQuery longQuery = new SQLitePersistence.LongQuery(this.f23753db, "SELECT contents, read_time_seconds, read_time_nanos, document_type, path FROM remote_documents WHERE path IN (", arrayList, ") ORDER BY path");
        BackgroundQueue backgroundQueue = new BackgroundQueue();
        while (longQuery.hasMoreSubqueries()) {
            longQuery.performNextSubquery().forEach(new C5815x(this, backgroundQueue, map, 2));
        }
        backgroundQueue.drain();
        this.documentTypeBackfiller.backfill(this.f23753db);
        synchronized (map) {
        }
        return map;
    }

    @Override // com.google.firebase.firestore.local.RemoteDocumentCache
    public Map<DocumentKey, MutableDocument> getDocumentsMatchingQuery(QueryOrPipeline queryOrPipeline, FieldIndex.IndexOffset indexOffset, Set<DocumentKey> set) {
        return getDocumentsMatchingQuery(queryOrPipeline, indexOffset, set, null);
    }

    @Override // com.google.firebase.firestore.local.RemoteDocumentCache
    public void removeAll(Collection<DocumentKey> collection) {
        if (collection.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ImmutableSortedMap<DocumentKey, Document> immutableSortedMapEmptyDocumentMap = DocumentCollections.emptyDocumentMap();
        for (DocumentKey documentKey : collection) {
            arrayList.add(EncodedPath.encode(documentKey.getPath()));
            immutableSortedMapEmptyDocumentMap = immutableSortedMapEmptyDocumentMap.insert(documentKey, MutableDocument.newNoDocument(documentKey, SnapshotVersion.NONE));
        }
        SQLitePersistence.LongQuery longQuery = new SQLitePersistence.LongQuery(this.f23753db, "DELETE FROM remote_documents WHERE path IN (", arrayList, ")");
        while (longQuery.hasMoreSubqueries()) {
            longQuery.executeNextSubquery();
        }
        this.indexManager.updateIndexEntries(immutableSortedMapEmptyDocumentMap);
    }

    @Override // com.google.firebase.firestore.local.RemoteDocumentCache
    public void setIndexManager(IndexManager indexManager) {
        this.indexManager = indexManager;
    }

    @Override // com.google.firebase.firestore.local.RemoteDocumentCache
    public Map<DocumentKey, MutableDocument> getDocumentsMatchingQuery(QueryOrPipeline queryOrPipeline, FieldIndex.IndexOffset indexOffset, Set<DocumentKey> set, QueryContext queryContext) {
        ResourcePath resourcePathFromString;
        ResourcePath resourcePath = ResourcePath.EMPTY;
        int i2 = 1;
        if (queryOrPipeline.isQuery()) {
            resourcePathFromString = queryOrPipeline.query().getPath();
        } else {
            String pipelineCollection = PipelineUtilKt.getPipelineCollection(queryOrPipeline.pipeline$com_google_firebase_firebase_firestore());
            Assert.hardAssert(pipelineCollection != null, "SQLiteRemoteDocumentCache.getDocumentsMatchingQuery receives pipeline without collection source.", new Object[0]);
            resourcePathFromString = ResourcePath.fromString(pipelineCollection);
        }
        return getAll(Collections.singletonList(resourcePathFromString), indexOffset, Integer.MAX_VALUE, DocumentType.FOUND_DOCUMENT, new C5809r(i2, queryOrPipeline, set), queryContext);
    }

    @Override // com.google.firebase.firestore.local.RemoteDocumentCache
    public Map<DocumentKey, MutableDocument> getAll(String str, FieldIndex.IndexOffset indexOffset, int i2) {
        List<ResourcePath> collectionParents = this.indexManager.getCollectionParents(str);
        ArrayList arrayList = new ArrayList(collectionParents.size());
        Iterator<ResourcePath> it = collectionParents.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().append(str));
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        if (arrayList.size() * 9 < 900) {
            return getAll(arrayList, indexOffset, i2, null);
        }
        HashMap map = new HashMap();
        int i3 = 0;
        while (i3 < arrayList.size()) {
            int i4 = i3 + 100;
            map.putAll(getAll(arrayList.subList(i3, Math.min(arrayList.size(), i4)), indexOffset, i2, null));
            i3 = i4;
        }
        return Util.firstNEntries(map, i2, FieldIndex.IndexOffset.DOCUMENT_COMPARATOR);
    }

    private Map<DocumentKey, MutableDocument> getAll(List<ResourcePath> list, FieldIndex.IndexOffset indexOffset, int i2, DocumentType documentType, Function<MutableDocument, Boolean> function, QueryContext queryContext) throws InterruptedException {
        String str;
        Timestamp timestamp = indexOffset.getReadTime().getTimestamp();
        DocumentKey documentKey = indexOffset.getDocumentKey();
        StringBuilder sb = new StringBuilder("SELECT contents, read_time_seconds, read_time_nanos, document_type, path FROM remote_documents WHERE path >= ? AND path < ? AND path_length = ? ");
        if (documentType == null) {
            str = "";
        } else {
            str = " AND (document_type IS NULL OR document_type = ?) ";
        }
        StringBuilder sbRepeatSequence = Util.repeatSequence(AbstractC0271e0.m403k(sb, str, "AND (read_time_seconds > ? OR ( read_time_seconds = ? AND read_time_nanos > ?) OR ( read_time_seconds = ? AND read_time_nanos = ? and path > ?)) "), list.size(), " UNION ");
        sbRepeatSequence.append("ORDER BY read_time_seconds, read_time_nanos, path LIMIT ?");
        int i3 = 0;
        Object[] objArr = new Object[(list.size() * ((documentType != null ? 1 : 0) + 9)) + 1];
        for (ResourcePath resourcePath : list) {
            String strEncode = EncodedPath.encode(resourcePath);
            objArr[i3] = strEncode;
            objArr[i3 + 1] = EncodedPath.prefixSuccessor(strEncode);
            int i4 = i3 + 3;
            objArr[i3 + 2] = Integer.valueOf(resourcePath.length() + 1);
            if (documentType != null) {
                objArr[i4] = Integer.valueOf(documentType.dbValue);
                i4 = i3 + 4;
            }
            objArr[i4] = Long.valueOf(timestamp.getSeconds());
            objArr[i4 + 1] = Long.valueOf(timestamp.getSeconds());
            objArr[i4 + 2] = Integer.valueOf(timestamp.getNanoseconds());
            objArr[i4 + 3] = Long.valueOf(timestamp.getSeconds());
            objArr[i4 + 4] = Integer.valueOf(timestamp.getNanoseconds());
            objArr[i4 + 5] = EncodedPath.encode(documentKey.getPath());
            i3 = i4 + 6;
        }
        objArr[i3] = Integer.valueOf(i2);
        BackgroundQueue backgroundQueue = new BackgroundQueue();
        HashMap map = new HashMap();
        int iForEach = this.f23753db.query(sbRepeatSequence.toString()).binding(objArr).forEach(new C5817z(this, backgroundQueue, map, function, 1));
        if (queryContext != null) {
            queryContext.incrementDocumentReadCount(iForEach);
        }
        backgroundQueue.drain();
        this.documentTypeBackfiller.backfill(this.f23753db);
        synchronized (map) {
        }
        return map;
    }

    private Map<DocumentKey, MutableDocument> getAll(List<ResourcePath> list, FieldIndex.IndexOffset indexOffset, int i2, Function<MutableDocument, Boolean> function) {
        return getAll(list, indexOffset, i2, null, function, null);
    }
}
