package com.google.firebase.firestore.core;

import androidx.annotation.Nullable;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.DocumentSet;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.remote.TargetChange;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class View {
    private boolean current;
    private DocumentSet documentSet;
    private final QueryOrPipeline query;
    private ImmutableSortedSet<DocumentKey> syncedDocuments;
    private ViewSnapshot.SyncState syncState = ViewSnapshot.SyncState.NONE;
    private ImmutableSortedSet<DocumentKey> limboDocuments = DocumentKey.emptyKeySet();
    private ImmutableSortedSet<DocumentKey> mutatedKeys = DocumentKey.emptyKeySet();

    /* JADX INFO: renamed from: com.google.firebase.firestore.core.View$1 */
    public static /* synthetic */ class C57521 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$firebase$firestore$core$DocumentViewChange$Type */
        static final /* synthetic */ int[] f23665x33862af7;

        static {
            int[] iArr = new int[DocumentViewChange.Type.values().length];
            f23665x33862af7 = iArr;
            try {
                iArr[DocumentViewChange.Type.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23665x33862af7[DocumentViewChange.Type.MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23665x33862af7[DocumentViewChange.Type.METADATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23665x33862af7[DocumentViewChange.Type.REMOVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class DocumentChanges {
        final DocumentViewChangeSet changeSet;
        final DocumentSet documentSet;
        final ImmutableSortedSet<DocumentKey> mutatedKeys;
        private final boolean needsRefill;

        public /* synthetic */ DocumentChanges(DocumentSet documentSet, DocumentViewChangeSet documentViewChangeSet, ImmutableSortedSet immutableSortedSet, boolean z, C57521 c57521) {
            this(documentSet, documentViewChangeSet, immutableSortedSet, z);
        }

        public boolean needsRefill() {
            return this.needsRefill;
        }

        private DocumentChanges(DocumentSet documentSet, DocumentViewChangeSet documentViewChangeSet, ImmutableSortedSet<DocumentKey> immutableSortedSet, boolean z) {
            this.documentSet = documentSet;
            this.changeSet = documentViewChangeSet;
            this.mutatedKeys = immutableSortedSet;
            this.needsRefill = z;
        }
    }

    public static class LimitEdges {

        @Nullable
        final Document first;

        @Nullable
        final Document second;

        public LimitEdges(@Nullable Document document, @Nullable Document document2) {
            this.first = document;
            this.second = document2;
        }
    }

    public View(QueryOrPipeline queryOrPipeline, ImmutableSortedSet<DocumentKey> immutableSortedSet) {
        this.query = queryOrPipeline;
        this.documentSet = DocumentSet.emptySet(queryOrPipeline.comparator());
        this.syncedDocuments = immutableSortedSet;
    }

    private void applyTargetChange(TargetChange targetChange) {
        if (targetChange != null) {
            Iterator<DocumentKey> it = targetChange.getAddedDocuments().iterator();
            while (it.hasNext()) {
                this.syncedDocuments = this.syncedDocuments.insert(it.next());
            }
            for (DocumentKey documentKey : targetChange.getModifiedDocuments()) {
                Assert.hardAssert(this.syncedDocuments.contains(documentKey), "Modified document %s not found in view.", documentKey);
            }
            Iterator<DocumentKey> it2 = targetChange.getRemovedDocuments().iterator();
            while (it2.hasNext()) {
                this.syncedDocuments = this.syncedDocuments.remove(it2.next());
            }
            this.current = targetChange.isCurrent();
        }
    }

    private static int changeTypeOrder(DocumentViewChange documentViewChange) {
        int i2 = C57521.f23665x33862af7[documentViewChange.getType().ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2 && i2 != 3) {
                if (i2 == 4) {
                    return 0;
                }
                throw new IllegalArgumentException("Unknown change type: " + documentViewChange.getType());
            }
        }
        return i3;
    }

    @Nullable
    private static Long getLimit(QueryOrPipeline queryOrPipeline) {
        if (queryOrPipeline.isPipeline()) {
            Integer lastEffectiveLimit = PipelineUtilKt.getLastEffectiveLimit(queryOrPipeline.pipeline$com_google_firebase_firebase_firestore());
            if (lastEffectiveLimit == null) {
                return null;
            }
            return Long.valueOf(lastEffectiveLimit.intValue());
        }
        Query query = queryOrPipeline.query();
        if (query.hasLimit()) {
            return Long.valueOf(query.getLimit());
        }
        return null;
    }

    private static LimitEdges getLimitEdges(QueryOrPipeline queryOrPipeline, DocumentSet documentSet) {
        Long limit = getLimit(queryOrPipeline);
        if (limit == null) {
            return new LimitEdges(null, null);
        }
        if (!queryOrPipeline.isPipeline()) {
            Query query = queryOrPipeline.query();
            if (query.getLimitType() == Query.LimitType.LIMIT_TO_FIRST && documentSet.size() == query.getLimit()) {
                return new LimitEdges(documentSet.getLastDocument(), null);
            }
            if (query.getLimitType() == Query.LimitType.LIMIT_TO_LAST && documentSet.size() == query.getLimit()) {
                return new LimitEdges(null, documentSet.getFirstDocument());
            }
        } else {
            if (limit.longValue() > 0 && documentSet.size() == limit.longValue()) {
                return new LimitEdges(documentSet.getLastDocument(), null);
            }
            if (limit.longValue() < 0 && documentSet.size() == (-limit.longValue())) {
                return new LimitEdges(null, documentSet.getFirstDocument());
            }
        }
        return new LimitEdges(null, null);
    }

    private static Query.LimitType getLimitType(QueryOrPipeline queryOrPipeline) {
        if (!queryOrPipeline.isPipeline()) {
            return queryOrPipeline.query().getLimitType();
        }
        Long limit = getLimit(queryOrPipeline);
        return (limit == null || limit.longValue() <= 0) ? Query.LimitType.LIMIT_TO_LAST : Query.LimitType.LIMIT_TO_FIRST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$applyChanges$0(Comparator comparator, DocumentViewChange documentViewChange, DocumentViewChange documentViewChange2) {
        int iCompare = Integer.compare(changeTypeOrder(documentViewChange), changeTypeOrder(documentViewChange2));
        return iCompare != 0 ? iCompare : comparator.compare(documentViewChange.getDocument(), documentViewChange2.getDocument());
    }

    private boolean shouldBeLimboDoc(DocumentKey documentKey) {
        Document document;
        return (this.syncedDocuments.contains(documentKey) || (document = this.documentSet.getDocument(documentKey)) == null || document.hasLocalMutations()) ? false : true;
    }

    private boolean shouldWaitForSyncedDocument(Document document, Document document2) {
        return document.hasLocalMutations() && document2.hasCommittedMutations() && !document2.hasLocalMutations();
    }

    private List<LimboDocumentChange> updateLimboDocuments() {
        if (!this.current) {
            return Collections.EMPTY_LIST;
        }
        ImmutableSortedSet<DocumentKey> immutableSortedSet = this.limboDocuments;
        this.limboDocuments = DocumentKey.emptyKeySet();
        for (Document document : this.documentSet) {
            if (shouldBeLimboDoc(document.getKey())) {
                this.limboDocuments = this.limboDocuments.insert(document.getKey());
            }
        }
        ArrayList arrayList = new ArrayList(this.limboDocuments.size() + immutableSortedSet.size());
        for (DocumentKey documentKey : immutableSortedSet) {
            if (!this.limboDocuments.contains(documentKey)) {
                arrayList.add(new LimboDocumentChange(LimboDocumentChange.Type.REMOVED, documentKey));
            }
        }
        for (DocumentKey documentKey2 : this.limboDocuments) {
            if (!immutableSortedSet.contains(documentKey2)) {
                arrayList.add(new LimboDocumentChange(LimboDocumentChange.Type.ADDED, documentKey2));
            }
        }
        return arrayList;
    }

    public ViewChange applyChanges(DocumentChanges documentChanges) {
        return applyChanges(documentChanges, null);
    }

    public ViewChange applyOnlineStateChange(OnlineState onlineState) {
        if (!this.current || onlineState != OnlineState.OFFLINE) {
            return new ViewChange(null, Collections.EMPTY_LIST);
        }
        this.current = false;
        return applyChanges(new DocumentChanges(this.documentSet, new DocumentViewChangeSet(), this.mutatedKeys, false, null));
    }

    public DocumentChanges computeDocChanges(ImmutableSortedMap<DocumentKey, Document> immutableSortedMap) {
        return computeDocChanges(immutableSortedMap, null);
    }

    public ImmutableSortedSet<DocumentKey> getLimboDocuments() {
        return this.limboDocuments;
    }

    public ViewSnapshot.SyncState getSyncState() {
        return this.syncState;
    }

    public ImmutableSortedSet<DocumentKey> getSyncedDocuments() {
        return this.syncedDocuments;
    }

    public ViewChange applyChanges(DocumentChanges documentChanges, TargetChange targetChange) {
        return applyChanges(documentChanges, targetChange, false);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f1  */
    public DocumentChanges computeDocChanges(ImmutableSortedMap<DocumentKey, Document> immutableSortedMap, @Nullable DocumentChanges documentChanges) {
        ImmutableSortedSet<DocumentKey> immutableSortedSet;
        DocumentSet documentSet;
        boolean z;
        ImmutableSortedSet<DocumentKey> immutableSortedSetRemove;
        DocumentViewChangeSet documentViewChangeSet = documentChanges != null ? documentChanges.changeSet : new DocumentViewChangeSet();
        DocumentSet documentSet2 = documentChanges != null ? documentChanges.documentSet : this.documentSet;
        ImmutableSortedSet<DocumentKey> immutableSortedSetRemove2 = documentChanges != null ? documentChanges.mutatedKeys : this.mutatedKeys;
        LimitEdges limitEdges = getLimitEdges(this.query, documentSet2);
        Document document = limitEdges.first;
        Document document2 = limitEdges.second;
        DocumentSet documentSetRemove = documentSet2;
        boolean z2 = false;
        for (Map.Entry<DocumentKey, Document> entry : immutableSortedMap) {
            DocumentKey key = entry.getKey();
            Document document3 = documentSet2.getDocument(key);
            Document value = this.query.matches(entry.getValue()) ? entry.getValue() : null;
            boolean z3 = document3 != null && this.mutatedKeys.contains(document3.getKey());
            boolean z4 = value != null && (value.hasLocalMutations() || (this.mutatedKeys.contains(value.getKey()) && value.hasCommittedMutations()));
            if (document3 == null || value == null) {
                if (document3 == null && value != null) {
                    documentViewChangeSet.addChange(DocumentViewChange.create(DocumentViewChange.Type.ADDED, value));
                } else if (document3 == null || value != null) {
                    z = false;
                } else {
                    documentViewChangeSet.addChange(DocumentViewChange.create(DocumentViewChange.Type.REMOVED, document3));
                    if (document != null || document2 != null) {
                        z2 = true;
                    }
                }
                z = true;
            } else if (document3.getData().equals(value.getData())) {
                if (z3 != z4) {
                    documentViewChangeSet.addChange(DocumentViewChange.create(DocumentViewChange.Type.METADATA, value));
                    z = true;
                } else {
                    z = false;
                }
            } else if (shouldWaitForSyncedDocument(document3, value)) {
                z = false;
            } else {
                documentViewChangeSet.addChange(DocumentViewChange.create(DocumentViewChange.Type.MODIFIED, value));
                Comparator<Document> comparator = this.query.comparator();
                if ((document != null && comparator.compare(value, document) > 0) || (document2 != null && comparator.compare(value, document2) < 0)) {
                    z2 = true;
                }
                z = true;
            }
            if (z) {
                if (value != null) {
                    documentSetRemove = documentSetRemove.add(value);
                    immutableSortedSetRemove = value.hasLocalMutations() ? immutableSortedSetRemove2.insert(value.getKey()) : immutableSortedSetRemove2.remove(value.getKey());
                } else {
                    documentSetRemove = documentSetRemove.remove(key);
                    immutableSortedSetRemove = immutableSortedSetRemove2.remove(key);
                }
                immutableSortedSetRemove2 = immutableSortedSetRemove;
            }
        }
        Long limit = getLimit(this.query);
        if (limit == null) {
            immutableSortedSet = immutableSortedSetRemove2;
            documentSet = documentSetRemove;
        } else if (this.query.isPipeline()) {
            ArrayList arrayList = new ArrayList();
            Iterator<Document> it = documentSetRemove.iterator();
            while (it.hasNext()) {
                arrayList.add((MutableDocument) it.next());
            }
            List<MutableDocument> listEvaluate$com_google_firebase_firebase_firestore = this.query.pipeline$com_google_firebase_firebase_firestore().evaluate$com_google_firebase_firebase_firestore(arrayList);
            DocumentSet documentSetEmptySet = DocumentSet.emptySet(this.query.comparator());
            Iterator<MutableDocument> it2 = listEvaluate$com_google_firebase_firebase_firestore.iterator();
            while (it2.hasNext()) {
                documentSetEmptySet = documentSetEmptySet.add(it2.next());
            }
            for (Document document4 : documentSetRemove) {
                if (!documentSetEmptySet.contains(document4.getKey())) {
                    immutableSortedSetRemove2 = immutableSortedSetRemove2.remove(document4.getKey());
                    documentViewChangeSet.addChange(DocumentViewChange.create(DocumentViewChange.Type.REMOVED, document4));
                }
            }
            documentSet = documentSetEmptySet;
            immutableSortedSet = immutableSortedSetRemove2;
        } else {
            long jAbs = Math.abs(limit.longValue());
            Query.LimitType limitType = getLimitType(this.query);
            long size = documentSetRemove.size();
            while (true) {
                size -= jAbs;
                if (size <= 0) {
                    break;
                }
                Document lastDocument = limitType == Query.LimitType.LIMIT_TO_FIRST ? documentSetRemove.getLastDocument() : documentSetRemove.getFirstDocument();
                documentSetRemove = documentSetRemove.remove(lastDocument.getKey());
                immutableSortedSetRemove2 = immutableSortedSetRemove2.remove(lastDocument.getKey());
                documentViewChangeSet.addChange(DocumentViewChange.create(DocumentViewChange.Type.REMOVED, lastDocument));
                jAbs = 1;
            }
            immutableSortedSet = immutableSortedSetRemove2;
            documentSet = documentSetRemove;
        }
        Assert.hardAssert(!z2 || documentChanges == null, "View was refilled using docs that themselves needed refilling.", new Object[0]);
        return new DocumentChanges(documentSet, documentViewChangeSet, immutableSortedSet, z2, null);
    }

    public ViewChange applyChanges(DocumentChanges documentChanges, TargetChange targetChange, boolean z) {
        ViewSnapshot viewSnapshot;
        Assert.hardAssert(!documentChanges.needsRefill, "Cannot apply changes that need a refill", new Object[0]);
        DocumentSet documentSet = this.documentSet;
        this.documentSet = documentChanges.documentSet;
        this.mutatedKeys = documentChanges.mutatedKeys;
        List<DocumentViewChange> changes = documentChanges.changeSet.getChanges();
        Collections.sort(changes, new C5760h(this.query.comparator(), 0));
        applyTargetChange(targetChange);
        List<LimboDocumentChange> listUpdateLimboDocuments = z ? Collections.EMPTY_LIST : updateLimboDocuments();
        ViewSnapshot.SyncState syncState = (this.limboDocuments.size() == 0 && this.current && !z) ? ViewSnapshot.SyncState.SYNCED : ViewSnapshot.SyncState.LOCAL;
        boolean z2 = syncState != this.syncState;
        this.syncState = syncState;
        if (changes.size() != 0 || z2) {
            viewSnapshot = new ViewSnapshot(this.query, documentChanges.documentSet, documentSet, changes, syncState == ViewSnapshot.SyncState.LOCAL, documentChanges.mutatedKeys, z2, false, (targetChange == null || targetChange.getResumeToken().isEmpty()) ? false : true);
        } else {
            viewSnapshot = null;
        }
        return new ViewChange(viewSnapshot, listUpdateLimboDocuments);
    }
}
