package com.google.firebase.firestore.local;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.Timestamp;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.bundle.BundleCallback;
import com.google.firebase.firestore.bundle.BundleMetadata;
import com.google.firebase.firestore.bundle.NamedQuery;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.core.QueryOrPipeline;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.core.TargetIdGenerator;
import com.google.firebase.firestore.core.TargetOrPipeline;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.model.mutation.MutationBatchResult;
import com.google.firebase.firestore.model.mutation.PatchMutation;
import com.google.firebase.firestore.model.mutation.Precondition;
import com.google.firebase.firestore.remote.RemoteEvent;
import com.google.firebase.firestore.remote.TargetChange;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Supplier;
import com.google.firebase.firestore.util.Util;
import com.google.protobuf.AbstractC6251n;
import com.google.protobuf.C6248m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalStore implements BundleCallback {
    private static final long RESUME_TOKEN_MAX_AGE_SECONDS = TimeUnit.MINUTES.toSeconds(5);
    private final BundleCache bundleCache;
    private DocumentOverlayCache documentOverlayCache;
    private GlobalsCache globalsCache;
    private IndexManager indexManager;
    private LocalDocumentsView localDocuments;
    private final ReferenceSet localViewReferences;
    private MutationQueue mutationQueue;
    private final Persistence persistence;
    private final SparseArray<TargetData> queryDataByTarget;
    private final QueryEngine queryEngine;
    private final RemoteDocumentCache remoteDocuments;
    private final TargetCache targetCache;
    private final Map<TargetOrPipeline, Integer> targetIdByTarget;
    private final TargetIdGenerator targetIdGenerator;

    public static class AllocateQueryHolder {
        TargetData cached;
        int targetId;

        private AllocateQueryHolder() {
        }
    }

    public static class DocumentChangeResult {
        private final Map<DocumentKey, MutableDocument> changedDocuments;
        private final Set<DocumentKey> existenceChangedKeys;

        private DocumentChangeResult(Map<DocumentKey, MutableDocument> map, Set<DocumentKey> set) {
            this.changedDocuments = map;
            this.existenceChangedKeys = set;
        }
    }

    public LocalStore(Persistence persistence, QueryEngine queryEngine, User user) {
        Assert.hardAssert(persistence.isStarted(), "LocalStore was passed an unstarted persistence implementation", new Object[0]);
        this.persistence = persistence;
        this.queryEngine = queryEngine;
        this.globalsCache = persistence.getGlobalsCache();
        TargetCache targetCache = persistence.getTargetCache();
        this.targetCache = targetCache;
        this.bundleCache = persistence.getBundleCache();
        this.targetIdGenerator = TargetIdGenerator.forTargetCache(targetCache.getHighestTargetId());
        this.remoteDocuments = persistence.getRemoteDocumentCache();
        ReferenceSet referenceSet = new ReferenceSet();
        this.localViewReferences = referenceSet;
        this.queryDataByTarget = new SparseArray<>();
        this.targetIdByTarget = new HashMap();
        persistence.getReferenceDelegate().setInMemoryPins(referenceSet);
        initializeUserComponents(user);
    }

    private void applyWriteToRemoteDocuments(MutationBatchResult mutationBatchResult) {
        MutationBatch batch = mutationBatchResult.getBatch();
        for (DocumentKey documentKey : batch.getKeys()) {
            MutableDocument mutableDocument = this.remoteDocuments.get(documentKey);
            SnapshotVersion snapshotVersion = mutationBatchResult.getDocVersions().get(documentKey);
            Assert.hardAssert(snapshotVersion != null, "docVersions should contain every doc in the write.", new Object[0]);
            if (mutableDocument.getVersion().compareTo(snapshotVersion) < 0) {
                batch.applyToRemoteDocument(mutableDocument, mutationBatchResult);
                if (mutableDocument.isValidDocument()) {
                    this.remoteDocuments.add(mutableDocument, mutationBatchResult.getCommitVersion());
                }
            }
        }
        this.mutationQueue.removeMutationBatch(batch);
    }

    @NonNull
    private Set<DocumentKey> getKeysWithTransformResults(MutationBatchResult mutationBatchResult) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < mutationBatchResult.getMutationResults().size(); i2++) {
            if (!mutationBatchResult.getMutationResults().get(i2).getTransformResults().isEmpty()) {
                hashSet.add(mutationBatchResult.getBatch().getMutations().get(i2).getKey());
            }
        }
        return hashSet;
    }

    private void initializeUserComponents(User user) {
        IndexManager indexManager = this.persistence.getIndexManager(user);
        this.indexManager = indexManager;
        this.mutationQueue = this.persistence.getMutationQueue(user, indexManager);
        DocumentOverlayCache documentOverlayCache = this.persistence.getDocumentOverlayCache(user);
        this.documentOverlayCache = documentOverlayCache;
        this.localDocuments = new LocalDocumentsView(this.remoteDocuments, this.mutationQueue, documentOverlayCache, this.indexManager);
        this.remoteDocuments.setIndexManager(this.indexManager);
        this.queryEngine.initialize(this.localDocuments, this.indexManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ImmutableSortedMap lambda$acknowledgeBatch$3(MutationBatchResult mutationBatchResult) {
        MutationBatch batch = mutationBatchResult.getBatch();
        this.mutationQueue.acknowledgeBatch(batch, mutationBatchResult.getStreamToken());
        applyWriteToRemoteDocuments(mutationBatchResult);
        this.mutationQueue.performConsistencyCheck();
        this.documentOverlayCache.removeOverlaysForBatchId(mutationBatchResult.getBatch().getBatchId());
        this.localDocuments.recalculateAndSaveOverlays(getKeysWithTransformResults(mutationBatchResult));
        return this.localDocuments.getDocuments(batch.getKeys());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$allocateTarget$8(AllocateQueryHolder allocateQueryHolder, TargetOrPipeline targetOrPipeline) {
        int iNextId = this.targetIdGenerator.nextId();
        allocateQueryHolder.targetId = iNextId;
        TargetData targetData = new TargetData(targetOrPipeline, iNextId, this.persistence.getReferenceDelegate().getCurrentSequenceNumber(), QueryPurpose.LISTEN);
        allocateQueryHolder.cached = targetData;
        this.targetCache.addTargetData(targetData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ImmutableSortedMap lambda$applyBundledDocuments$11(ImmutableSortedMap immutableSortedMap, TargetData targetData) {
        ImmutableSortedSet<DocumentKey> immutableSortedSetEmptyKeySet = DocumentKey.emptyKeySet();
        HashMap map = new HashMap();
        Iterator it = immutableSortedMap.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            DocumentKey documentKey = (DocumentKey) entry.getKey();
            MutableDocument mutableDocument = (MutableDocument) entry.getValue();
            if (mutableDocument.isFoundDocument()) {
                immutableSortedSetEmptyKeySet = immutableSortedSetEmptyKeySet.insert(documentKey);
            }
            map.put(documentKey, mutableDocument);
        }
        this.targetCache.removeMatchingKeysForTargetId(targetData.getTargetId());
        this.targetCache.addMatchingKeys(immutableSortedSetEmptyKeySet, targetData.getTargetId());
        DocumentChangeResult documentChangeResultPopulateDocumentChanges = populateDocumentChanges(map);
        return this.localDocuments.getLocalViewOfDocuments(documentChangeResultPopulateDocumentChanges.changedDocuments, documentChangeResultPopulateDocumentChanges.existenceChangedKeys);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ImmutableSortedMap lambda$applyRemoteEvent$6(RemoteEvent remoteEvent, SnapshotVersion snapshotVersion) {
        Map<Integer, TargetChange> targetChanges = remoteEvent.getTargetChanges();
        long currentSequenceNumber = this.persistence.getReferenceDelegate().getCurrentSequenceNumber();
        for (Map.Entry<Integer, TargetChange> entry : targetChanges.entrySet()) {
            Integer key = entry.getKey();
            int iIntValue = key.intValue();
            TargetChange value = entry.getValue();
            TargetData targetData = this.queryDataByTarget.get(iIntValue);
            if (targetData != null) {
                this.targetCache.removeMatchingKeys(value.getRemovedDocuments(), iIntValue);
                this.targetCache.addMatchingKeys(value.getAddedDocuments(), iIntValue);
                TargetData targetDataWithSequenceNumber = targetData.withSequenceNumber(currentSequenceNumber);
                if (remoteEvent.getTargetMismatches().containsKey(key)) {
                    C6248m c6248m = AbstractC6251n.f24219t;
                    SnapshotVersion snapshotVersion2 = SnapshotVersion.NONE;
                    targetDataWithSequenceNumber = targetDataWithSequenceNumber.withResumeToken(c6248m, snapshotVersion2).withLastLimboFreeSnapshotVersion(snapshotVersion2);
                } else if (!value.getResumeToken().isEmpty()) {
                    targetDataWithSequenceNumber = targetDataWithSequenceNumber.withResumeToken(value.getResumeToken(), remoteEvent.getSnapshotVersion());
                }
                this.queryDataByTarget.put(iIntValue, targetDataWithSequenceNumber);
                if (shouldPersistTargetData(targetData, targetDataWithSequenceNumber, value)) {
                    this.targetCache.updateTargetData(targetDataWithSequenceNumber);
                }
            }
        }
        Map<DocumentKey, MutableDocument> documentUpdates = remoteEvent.getDocumentUpdates();
        Set<DocumentKey> resolvedLimboDocuments = remoteEvent.getResolvedLimboDocuments();
        for (DocumentKey documentKey : documentUpdates.keySet()) {
            if (resolvedLimboDocuments.contains(documentKey)) {
                this.persistence.getReferenceDelegate().updateLimboDocument(documentKey);
            }
        }
        DocumentChangeResult documentChangeResultPopulateDocumentChanges = populateDocumentChanges(documentUpdates);
        Map<DocumentKey, MutableDocument> map = documentChangeResultPopulateDocumentChanges.changedDocuments;
        SnapshotVersion lastRemoteSnapshotVersion = this.targetCache.getLastRemoteSnapshotVersion();
        if (!snapshotVersion.equals(SnapshotVersion.NONE)) {
            Assert.hardAssert(snapshotVersion.compareTo(lastRemoteSnapshotVersion) >= 0, "Watch stream reverted to previous snapshot?? (%s < %s)", snapshotVersion, lastRemoteSnapshotVersion);
            this.targetCache.setLastRemoteSnapshotVersion(snapshotVersion);
        }
        return this.localDocuments.getLocalViewOfDocuments(map, documentChangeResultPopulateDocumentChanges.existenceChangedKeys);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ LruGarbageCollector.Results lambda$collectGarbage$18(LruGarbageCollector lruGarbageCollector) {
        return lruGarbageCollector.collect(this.queryDataByTarget);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$configureFieldIndexes$15(List list) {
        Collection<FieldIndex> fieldIndexes = this.indexManager.getFieldIndexes();
        Comparator<FieldIndex> comparator = FieldIndex.SEMANTIC_COMPARATOR;
        final IndexManager indexManager = this.indexManager;
        Objects.requireNonNull(indexManager);
        final int i2 = 0;
        Consumer consumer = new Consumer() { // from class: com.google.firebase.firestore.local.d
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        indexManager.addFieldIndex((FieldIndex) obj);
                        break;
                    default:
                        indexManager.deleteFieldIndex((FieldIndex) obj);
                        break;
                }
            }
        };
        final IndexManager indexManager2 = this.indexManager;
        Objects.requireNonNull(indexManager2);
        final int i3 = 1;
        Util.diffCollections(fieldIndexes, list, comparator, consumer, new Consumer() { // from class: com.google.firebase.firestore.local.d
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        indexManager2.addFieldIndex((FieldIndex) obj);
                        break;
                    default:
                        indexManager2.deleteFieldIndex((FieldIndex) obj);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteAllFieldIndexes$16() {
        this.indexManager.deleteAllFieldIndexes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Collection lambda$getFieldIndexes$14() {
        return this.indexManager.getFieldIndexes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ NamedQuery lambda$getNamedQuery$13(String str) {
        return this.bundleCache.getNamedQuery(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$hasNewerBundle$9(BundleMetadata bundleMetadata) {
        BundleMetadata bundleMetadata2 = this.bundleCache.getBundleMetadata(bundleMetadata.getBundleId());
        return Boolean.valueOf(bundleMetadata2 != null && bundleMetadata2.getCreateTime().compareTo(bundleMetadata.getCreateTime()) >= 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyLocalViewChanges$7(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LocalViewChanges localViewChanges = (LocalViewChanges) it.next();
            int targetId = localViewChanges.getTargetId();
            this.localViewReferences.addReferences(localViewChanges.getAdded(), targetId);
            ImmutableSortedSet<DocumentKey> removed = localViewChanges.getRemoved();
            Iterator<DocumentKey> it2 = removed.iterator();
            while (it2.hasNext()) {
                this.persistence.getReferenceDelegate().removeReference(it2.next());
            }
            this.localViewReferences.removeReferences(removed, targetId);
            if (!localViewChanges.isFromCache()) {
                TargetData targetData = this.queryDataByTarget.get(targetId);
                Assert.hardAssert(targetData != null, "Can't set limbo-free snapshot version for unknown target: %s", Integer.valueOf(targetId));
                TargetData targetDataWithLastLimboFreeSnapshotVersion = targetData.withLastLimboFreeSnapshotVersion(targetData.getSnapshotVersion());
                this.queryDataByTarget.put(targetId, targetDataWithLastLimboFreeSnapshotVersion);
                if (shouldPersistTargetData(targetData, targetDataWithLastLimboFreeSnapshotVersion, null)) {
                    this.targetCache.updateTargetData(targetDataWithLastLimboFreeSnapshotVersion);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ImmutableSortedMap lambda$rejectBatch$4(int i2) {
        MutationBatch mutationBatchLookupMutationBatch = this.mutationQueue.lookupMutationBatch(i2);
        Assert.hardAssert(mutationBatchLookupMutationBatch != null, "Attempt to reject nonexistent batch!", new Object[0]);
        this.mutationQueue.removeMutationBatch(mutationBatchLookupMutationBatch);
        this.mutationQueue.performConsistencyCheck();
        this.documentOverlayCache.removeOverlaysForBatchId(i2);
        this.localDocuments.recalculateAndSaveOverlays(mutationBatchLookupMutationBatch.getKeys());
        return this.localDocuments.getDocuments(mutationBatchLookupMutationBatch.getKeys());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseTarget$17(int i2) {
        TargetData targetData = this.queryDataByTarget.get(i2);
        Assert.hardAssert(targetData != null, "Tried to release nonexistent target: %s", Integer.valueOf(i2));
        Iterator<DocumentKey> it = this.localViewReferences.removeReferencesForId(i2).iterator();
        while (it.hasNext()) {
            this.persistence.getReferenceDelegate().removeReference(it.next());
        }
        this.persistence.getReferenceDelegate().removeTarget(targetData);
        this.queryDataByTarget.remove(i2);
        this.targetIdByTarget.remove(targetData.getTarget());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveBundle$10(BundleMetadata bundleMetadata) {
        this.bundleCache.saveBundleMetadata(bundleMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveNamedQuery$12(NamedQuery namedQuery, TargetData targetData, int i2, ImmutableSortedSet immutableSortedSet) {
        if (namedQuery.getReadTime().compareTo(targetData.getSnapshotVersion()) > 0) {
            TargetData targetDataWithResumeToken = targetData.withResumeToken(AbstractC6251n.f24219t, namedQuery.getReadTime());
            this.queryDataByTarget.append(i2, targetDataWithResumeToken);
            this.targetCache.updateTargetData(targetDataWithResumeToken);
            this.targetCache.removeMatchingKeysForTargetId(i2);
            this.targetCache.addMatchingKeys(immutableSortedSet, i2);
        }
        this.bundleCache.saveNamedQuery(namedQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setLastStreamToken$5(AbstractC6251n abstractC6251n) {
        this.mutationQueue.setLastStreamToken(abstractC6251n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startIndexManager$0() {
        this.indexManager.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startMutationQueue$1() {
        this.mutationQueue.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ LocalDocumentsResult lambda$writeLocally$2(Set set, List list, Timestamp timestamp) {
        Map<DocumentKey, MutableDocument> all = this.remoteDocuments.getAll(set);
        HashSet hashSet = new HashSet();
        for (Map.Entry<DocumentKey, MutableDocument> entry : all.entrySet()) {
            if (!entry.getValue().isValidDocument()) {
                hashSet.add(entry.getKey());
            }
        }
        Map<DocumentKey, OverlayedDocument> overlayedDocuments = this.localDocuments.getOverlayedDocuments(all);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Mutation mutation = (Mutation) it.next();
            ObjectValue objectValueExtractTransformBaseValue = mutation.extractTransformBaseValue(overlayedDocuments.get(mutation.getKey()).getDocument());
            if (objectValueExtractTransformBaseValue != null) {
                arrayList.add(new PatchMutation(mutation.getKey(), objectValueExtractTransformBaseValue, objectValueExtractTransformBaseValue.getFieldMask(), Precondition.exists(true)));
            }
        }
        MutationBatch mutationBatchAddMutationBatch = this.mutationQueue.addMutationBatch(timestamp, arrayList, list);
        this.documentOverlayCache.saveOverlays(mutationBatchAddMutationBatch.getBatchId(), mutationBatchAddMutationBatch.applyToLocalDocumentSet(overlayedDocuments, hashSet));
        return LocalDocumentsResult.fromOverlayedDocuments(mutationBatchAddMutationBatch.getBatchId(), overlayedDocuments);
    }

    private static Target newUmbrellaTarget(String str) {
        return Query.atPath(ResourcePath.fromString("__bundle__/docs/" + str)).toTarget();
    }

    private DocumentChangeResult populateDocumentChanges(Map<DocumentKey, MutableDocument> map) {
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Map<DocumentKey, MutableDocument> all = this.remoteDocuments.getAll(map.keySet());
        for (Map.Entry<DocumentKey, MutableDocument> entry : map.entrySet()) {
            DocumentKey key = entry.getKey();
            MutableDocument value = entry.getValue();
            MutableDocument mutableDocument = all.get(key);
            if (value.isFoundDocument() != mutableDocument.isFoundDocument()) {
                hashSet.add(key);
            }
            if (value.isNoDocument() && value.getVersion().equals(SnapshotVersion.NONE)) {
                arrayList.add(value.getKey());
                map2.put(key, value);
            } else if (!mutableDocument.isValidDocument() || value.getVersion().compareTo(mutableDocument.getVersion()) > 0 || (value.getVersion().compareTo(mutableDocument.getVersion()) == 0 && mutableDocument.hasPendingWrites())) {
                Assert.hardAssert(!SnapshotVersion.NONE.equals(value.getReadTime()), "Cannot add a document when the remote version is zero", new Object[0]);
                this.remoteDocuments.add(value, value.getReadTime());
                map2.put(key, value);
            } else {
                Logger.debug("LocalStore", "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s", key, mutableDocument.getVersion(), value.getVersion());
            }
        }
        this.remoteDocuments.removeAll(arrayList);
        return new DocumentChangeResult(map2, hashSet);
    }

    private static boolean shouldPersistTargetData(TargetData targetData, TargetData targetData2, @Nullable TargetChange targetChange) {
        if (targetData.getResumeToken().isEmpty()) {
            return true;
        }
        long seconds = targetData2.getSnapshotVersion().getTimestamp().getSeconds() - targetData.getSnapshotVersion().getTimestamp().getSeconds();
        long j2 = RESUME_TOKEN_MAX_AGE_SECONDS;
        if (seconds >= j2 || targetData2.getLastLimboFreeSnapshotVersion().getTimestamp().getSeconds() - targetData.getLastLimboFreeSnapshotVersion().getTimestamp().getSeconds() >= j2) {
            return true;
        }
        if (targetChange == null) {
            return false;
        }
        return targetChange.getRemovedDocuments().size() + (targetChange.getModifiedDocuments().size() + targetChange.getAddedDocuments().size()) > 0;
    }

    private void startIndexManager() {
        this.persistence.runTransaction("Start IndexManager", new RunnableC5797f(this, 0));
    }

    private void startMutationQueue() {
        this.persistence.runTransaction("Start MutationQueue", new RunnableC5797f(this, 1));
    }

    public ImmutableSortedMap<DocumentKey, Document> acknowledgeBatch(MutationBatchResult mutationBatchResult) {
        return (ImmutableSortedMap) this.persistence.runTransaction("Acknowledge batch", new C5796e(this, mutationBatchResult, 1));
    }

    public TargetData allocateTarget(final TargetOrPipeline targetOrPipeline) {
        int targetId;
        TargetData targetDataWithTarget;
        TargetData targetData = this.targetCache.getTargetData(targetOrPipeline);
        if (targetData != null) {
            targetId = targetData.getTargetId();
            targetDataWithTarget = targetData.withTarget(targetOrPipeline);
        } else {
            final AllocateQueryHolder allocateQueryHolder = new AllocateQueryHolder();
            this.persistence.runTransaction("Allocate target", new Runnable() { // from class: com.google.firebase.firestore.local.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23791s.lambda$allocateTarget$8(allocateQueryHolder, targetOrPipeline);
                }
            });
            targetId = allocateQueryHolder.targetId;
            targetDataWithTarget = allocateQueryHolder.cached;
        }
        if (this.queryDataByTarget.get(targetId) == null) {
            this.queryDataByTarget.put(targetId, targetDataWithTarget);
            this.targetIdByTarget.put(targetOrPipeline, Integer.valueOf(targetId));
        }
        return targetDataWithTarget;
    }

    @Override // com.google.firebase.firestore.bundle.BundleCallback
    public ImmutableSortedMap<DocumentKey, Document> applyBundledDocuments(ImmutableSortedMap<DocumentKey, MutableDocument> immutableSortedMap, String str) {
        return (ImmutableSortedMap) this.persistence.runTransaction("Apply bundle documents", new C5804m(this, immutableSortedMap, allocateTarget(new TargetOrPipeline.TargetWrapper(newUmbrellaTarget(str))), 1));
    }

    public ImmutableSortedMap<DocumentKey, Document> applyRemoteEvent(RemoteEvent remoteEvent) {
        return (ImmutableSortedMap) this.persistence.runTransaction("Apply remote event", new C5804m(this, remoteEvent, remoteEvent.getSnapshotVersion(), 0));
    }

    public LruGarbageCollector.Results collectGarbage(LruGarbageCollector lruGarbageCollector) {
        return (LruGarbageCollector.Results) this.persistence.runTransaction("Collect garbage", new C5796e(this, lruGarbageCollector, 2));
    }

    public void configureFieldIndexes(List<FieldIndex> list) {
        this.persistence.runTransaction("Configure indexes", new RunnableC5802k(this, list, 1));
    }

    public void deleteAllFieldIndexes() {
        this.persistence.runTransaction("Delete All Indexes", new RunnableC5797f(this, 2));
    }

    public QueryResult executeQuery(QueryOrPipeline queryOrPipeline, boolean z) {
        ImmutableSortedSet<DocumentKey> matchingKeysForTargetId;
        SnapshotVersion lastLimboFreeSnapshotVersion;
        TargetData targetData = getTargetData(queryOrPipeline.toTargetOrPipeline());
        SnapshotVersion snapshotVersion = SnapshotVersion.NONE;
        ImmutableSortedSet<DocumentKey> immutableSortedSetEmptyKeySet = DocumentKey.emptyKeySet();
        if (targetData != null) {
            lastLimboFreeSnapshotVersion = targetData.getLastLimboFreeSnapshotVersion();
            matchingKeysForTargetId = this.targetCache.getMatchingKeysForTargetId(targetData.getTargetId());
        } else {
            matchingKeysForTargetId = immutableSortedSetEmptyKeySet;
            lastLimboFreeSnapshotVersion = snapshotVersion;
        }
        QueryEngine queryEngine = this.queryEngine;
        if (z) {
            snapshotVersion = lastLimboFreeSnapshotVersion;
        }
        return new QueryResult(queryEngine.getDocumentsMatchingQuery(queryOrPipeline, snapshotVersion, matchingKeysForTargetId), matchingKeysForTargetId);
    }

    @VisibleForTesting
    public Collection<FieldIndex> getFieldIndexes() {
        return (Collection) this.persistence.runTransaction("Get indexes", new C5793b(this, 2));
    }

    public int getHighestUnacknowledgedBatchId() {
        return this.mutationQueue.getHighestUnacknowledgedBatchId();
    }

    public IndexManager getIndexManagerForCurrentUser() {
        return this.indexManager;
    }

    public SnapshotVersion getLastRemoteSnapshotVersion() {
        return this.targetCache.getLastRemoteSnapshotVersion();
    }

    public AbstractC6251n getLastStreamToken() {
        return this.mutationQueue.getLastStreamToken();
    }

    public LocalDocumentsView getLocalDocumentsForCurrentUser() {
        return this.localDocuments;
    }

    @Nullable
    public NamedQuery getNamedQuery(String str) {
        return (NamedQuery) this.persistence.runTransaction("Get named query", new C5796e(this, str, 0));
    }

    @Nullable
    public MutationBatch getNextMutationBatch(int i2) {
        return this.mutationQueue.getNextMutationBatchAfterBatchId(i2);
    }

    public ImmutableSortedSet<DocumentKey> getRemoteDocumentKeys(int i2) {
        return this.targetCache.getMatchingKeysForTargetId(i2);
    }

    public AbstractC6251n getSessionToken() {
        return this.globalsCache.getSessionsToken();
    }

    @Nullable
    @VisibleForTesting
    public TargetData getTargetData(TargetOrPipeline targetOrPipeline) {
        Integer num = this.targetIdByTarget.get(targetOrPipeline);
        return num != null ? this.queryDataByTarget.get(num.intValue()) : this.targetCache.getTargetData(targetOrPipeline);
    }

    public ImmutableSortedMap<DocumentKey, Document> handleUserChange(User user) {
        List<MutationBatch> allMutationBatches = this.mutationQueue.getAllMutationBatches();
        initializeUserComponents(user);
        startIndexManager();
        startMutationQueue();
        List<MutationBatch> allMutationBatches2 = this.mutationQueue.getAllMutationBatches();
        ImmutableSortedSet<DocumentKey> immutableSortedSetEmptyKeySet = DocumentKey.emptyKeySet();
        Iterator it = Arrays.asList(allMutationBatches, allMutationBatches2).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                Iterator<Mutation> it3 = ((MutationBatch) it2.next()).getMutations().iterator();
                while (it3.hasNext()) {
                    immutableSortedSetEmptyKeySet = immutableSortedSetEmptyKeySet.insert(it3.next().getKey());
                }
            }
        }
        return this.localDocuments.getDocuments(immutableSortedSetEmptyKeySet);
    }

    public boolean hasNewerBundle(BundleMetadata bundleMetadata) {
        return ((Boolean) this.persistence.runTransaction("Has newer bundle", new C5796e(this, bundleMetadata, 3))).booleanValue();
    }

    public void notifyLocalViewChanges(List<LocalViewChanges> list) {
        this.persistence.runTransaction("notifyLocalViewChanges", new RunnableC5802k(this, list, 0));
    }

    public Document readDocument(DocumentKey documentKey) {
        return this.localDocuments.getDocument(documentKey);
    }

    public ImmutableSortedMap<DocumentKey, Document> rejectBatch(final int i2) {
        return (ImmutableSortedMap) this.persistence.runTransaction("Reject batch", new Supplier() { // from class: com.google.firebase.firestore.local.j
            @Override // com.google.firebase.firestore.util.Supplier
            public final Object get() {
                return this.f23778s.lambda$rejectBatch$4(i2);
            }
        });
    }

    public void releaseTarget(final int i2) {
        this.persistence.runTransaction("Release target", new Runnable() { // from class: com.google.firebase.firestore.local.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f23768s.lambda$releaseTarget$17(i2);
            }
        });
    }

    @Override // com.google.firebase.firestore.bundle.BundleCallback
    public void saveBundle(BundleMetadata bundleMetadata) {
        this.persistence.runTransaction("Save bundle", new RunnableC5800i(this, bundleMetadata, 0));
    }

    @Override // com.google.firebase.firestore.bundle.BundleCallback
    public void saveNamedQuery(final NamedQuery namedQuery, final ImmutableSortedSet<DocumentKey> immutableSortedSet) {
        final TargetData targetDataAllocateTarget = allocateTarget(new TargetOrPipeline.TargetWrapper(namedQuery.getBundledQuery().getTarget()));
        final int targetId = targetDataAllocateTarget.getTargetId();
        this.persistence.runTransaction("Saved named query", new Runnable() { // from class: com.google.firebase.firestore.local.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f23770s.lambda$saveNamedQuery$12(namedQuery, targetDataAllocateTarget, targetId, immutableSortedSet);
            }
        });
    }

    public void setIndexAutoCreationEnabled(boolean z) {
        this.queryEngine.setIndexAutoCreationEnabled(z);
    }

    public void setLastStreamToken(AbstractC6251n abstractC6251n) {
        this.persistence.runTransaction("Set stream token", new RunnableC5800i(this, abstractC6251n, 1));
    }

    public void setSessionsToken(AbstractC6251n abstractC6251n) {
        this.globalsCache.setSessionToken(abstractC6251n);
    }

    public void start() {
        this.persistence.getOverlayMigrationManager().run();
        startIndexManager();
        startMutationQueue();
    }

    public LocalDocumentsResult writeLocally(final List<Mutation> list) {
        final Timestamp timestampNow = Timestamp.now();
        final HashSet hashSet = new HashSet();
        Iterator<Mutation> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getKey());
        }
        return (LocalDocumentsResult) this.persistence.runTransaction("Locally write mutations", new Supplier() { // from class: com.google.firebase.firestore.local.l
            @Override // com.google.firebase.firestore.util.Supplier
            public final Object get() {
                return this.f23783s.lambda$writeLocally$2(hashSet, list, timestampNow);
            }
        });
    }
}
