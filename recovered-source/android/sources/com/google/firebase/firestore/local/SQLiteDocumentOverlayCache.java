package com.google.firebase.firestore.local;

import android.database.Cursor;
import androidx.annotation.Nullable;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.Overlay;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.BackgroundQueue;
import com.google.firebase.firestore.util.Consumer;
import com.google.firebase.firestore.util.Preconditions;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import p022N.C0402c1;

/* JADX INFO: loaded from: classes2.dex */
public class SQLiteDocumentOverlayCache implements DocumentOverlayCache {

    /* JADX INFO: renamed from: db */
    private final SQLitePersistence f23745db;
    private final LocalSerializer serializer;
    private final String uid;

    public SQLiteDocumentOverlayCache(SQLitePersistence sQLitePersistence, LocalSerializer localSerializer, User user) {
        this.f23745db = sQLitePersistence;
        this.serializer = localSerializer;
        this.uid = user.isAuthenticated() ? user.getUid() : "";
    }

    private Overlay decodeOverlay(byte[] bArr, int i2) {
        try {
            return Overlay.create(i2, this.serializer.decodeMutation(C0402c1.m774y(bArr)));
        } catch (InvalidProtocolBufferException e) {
            throw Assert.fail("Overlay failed to parse: %s", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Overlay lambda$getOverlay$0(Cursor cursor) {
        return decodeOverlay(cursor.getBlob(0), cursor.getInt(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getOverlays$3(int[] iArr, String[] strArr, String[] strArr2, BackgroundQueue backgroundQueue, Map map, Cursor cursor) {
        iArr[0] = cursor.getInt(1);
        strArr[0] = cursor.getString(2);
        strArr2[0] = cursor.getString(3);
        lambda$processSingleCollection$1(backgroundQueue, map, cursor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processOverlaysInBackground$5(byte[] bArr, int i2, Map map) {
        Overlay overlayDecodeOverlay = decodeOverlay(bArr, i2);
        synchronized (map) {
            map.put(overlayDecodeOverlay.getKey(), overlayDecodeOverlay);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processOverlaysInBackground, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$processSingleCollection$1(BackgroundQueue backgroundQueue, Map<DocumentKey, Overlay> map, Cursor cursor) {
        RunnableC5811t runnableC5811t = new RunnableC5811t(this, cursor.getBlob(0), cursor.getInt(1), map, 0);
        if (cursor.isFirst() && cursor.isLast()) {
            runnableC5811t.run();
        } else {
            backgroundQueue.submit(runnableC5811t);
        }
    }

    private void processSingleCollection(Map<DocumentKey, Overlay> map, BackgroundQueue backgroundQueue, ResourcePath resourcePath, List<Object> list) {
        if (list.isEmpty()) {
            return;
        }
        SQLitePersistence.LongQuery longQuery = new SQLitePersistence.LongQuery(this.f23745db, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id IN (", Arrays.asList(this.uid, EncodedPath.encode(resourcePath)), list, ")");
        while (longQuery.hasMoreSubqueries()) {
            longQuery.performNextSubquery().forEach(new C5815x(this, backgroundQueue, map, 5));
        }
    }

    private void saveOverlay(int i2, DocumentKey documentKey, Mutation mutation) {
        this.f23745db.execute("INSERT OR REPLACE INTO document_overlays (uid, collection_group, collection_path, document_id, largest_batch_id, overlay_mutation) VALUES (?, ?, ?, ?, ?, ?)", this.uid, documentKey.getCollectionGroup(), EncodedPath.encode(documentKey.getPath().popLast()), documentKey.getPath().getLastSegment(), Integer.valueOf(i2), this.serializer.encodeMutation(mutation).toByteArray());
    }

    @Override // com.google.firebase.firestore.local.DocumentOverlayCache
    @Nullable
    public Overlay getOverlay(DocumentKey documentKey) {
        return (Overlay) this.f23745db.query("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id = ?").binding(this.uid, EncodedPath.encode(documentKey.getPath().popLast()), documentKey.getPath().getLastSegment()).firstValue(new C5808q(this, 4));
    }

    @Override // com.google.firebase.firestore.local.DocumentOverlayCache
    public Map<DocumentKey, Overlay> getOverlays(SortedSet<DocumentKey> sortedSet) throws InterruptedException {
        Assert.hardAssert(sortedSet.comparator() == null, "getOverlays() requires natural order", new Object[0]);
        Map<DocumentKey, Overlay> map = new HashMap<>();
        BackgroundQueue backgroundQueue = new BackgroundQueue();
        ResourcePath collectionPath = ResourcePath.EMPTY;
        ArrayList arrayList = new ArrayList();
        for (DocumentKey documentKey : sortedSet) {
            if (!collectionPath.equals(documentKey.getCollectionPath())) {
                processSingleCollection(map, backgroundQueue, collectionPath, arrayList);
                collectionPath = documentKey.getCollectionPath();
                arrayList.clear();
            }
            arrayList.add(documentKey.getDocumentId());
        }
        processSingleCollection(map, backgroundQueue, collectionPath, arrayList);
        backgroundQueue.drain();
        return map;
    }

    @Override // com.google.firebase.firestore.local.DocumentOverlayCache
    public void removeOverlaysForBatchId(int i2) {
        this.f23745db.execute("DELETE FROM document_overlays WHERE uid = ? AND largest_batch_id = ?", this.uid, Integer.valueOf(i2));
    }

    @Override // com.google.firebase.firestore.local.DocumentOverlayCache
    public void saveOverlays(int i2, Map<DocumentKey, Mutation> map) {
        for (Map.Entry<DocumentKey, Mutation> entry : map.entrySet()) {
            DocumentKey key = entry.getKey();
            saveOverlay(i2, key, (Mutation) Preconditions.checkNotNull(entry.getValue(), "null value for key: %s", key));
        }
    }

    @Override // com.google.firebase.firestore.local.DocumentOverlayCache
    public Map<DocumentKey, Overlay> getOverlays(ResourcePath resourcePath, int i2) throws InterruptedException {
        HashMap map = new HashMap();
        BackgroundQueue backgroundQueue = new BackgroundQueue();
        this.f23745db.query("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND largest_batch_id > ?").binding(this.uid, EncodedPath.encode(resourcePath), Integer.valueOf(i2)).forEach(new C5810s(this, backgroundQueue, map, 0));
        backgroundQueue.drain();
        return map;
    }

    @Override // com.google.firebase.firestore.local.DocumentOverlayCache
    public Map<DocumentKey, Overlay> getOverlays(String str, int i2, int i3) throws InterruptedException {
        final HashMap map = new HashMap();
        final String[] strArr = new String[1];
        final String[] strArr2 = new String[1];
        final int[] iArr = new int[1];
        final BackgroundQueue backgroundQueue = new BackgroundQueue();
        this.f23745db.query("SELECT overlay_mutation, largest_batch_id, collection_path, document_id  FROM document_overlays WHERE uid = ? AND collection_group = ? AND largest_batch_id > ? ORDER BY largest_batch_id, collection_path, document_id LIMIT ?").binding(this.uid, str, Integer.valueOf(i2), Integer.valueOf(i3)).forEach(new Consumer() { // from class: com.google.firebase.firestore.local.u
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                this.f23812a.lambda$getOverlays$3(iArr, strArr, strArr2, backgroundQueue, map, (Cursor) obj);
            }
        });
        if (strArr[0] == null) {
            return map;
        }
        SQLitePersistence.Query query = this.f23745db.query("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_group = ? AND (collection_path > ? OR (collection_path = ? AND document_id > ?)) AND largest_batch_id = ?");
        String str2 = this.uid;
        String str3 = strArr[0];
        query.binding(str2, str, str3, str3, strArr2[0], Integer.valueOf(iArr[0])).forEach(new C5810s(this, backgroundQueue, map, 1));
        backgroundQueue.drain();
        return map;
    }
}
