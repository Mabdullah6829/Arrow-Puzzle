package com.google.firebase.firestore.remote;

import androidx.annotation.Nullable;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.DocumentViewChange;
import com.google.firebase.firestore.local.QueryPurpose;
import com.google.firebase.firestore.local.TargetData;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p011H.AbstractC0271e0;
import p022N.C0423k;

/* JADX INFO: loaded from: classes2.dex */
public class WatchChangeAggregator {
    private static final String LOG_TAG = "WatchChangeAggregator";
    private final DatabaseId databaseId;
    private final TargetMetadataProvider targetMetadataProvider;
    private final Map<Integer, TargetState> targetStates = new HashMap();
    private Map<DocumentKey, MutableDocument> pendingDocumentUpdates = new HashMap();
    private Map<DocumentKey, Set<Integer>> pendingDocumentTargetMapping = new HashMap();
    private Map<Integer, QueryPurpose> pendingTargetResets = new HashMap();

    /* JADX INFO: renamed from: com.google.firebase.firestore.remote.WatchChangeAggregator$1 */
    public static /* synthetic */ class C59571 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$firebase$firestore$remote$WatchChange$WatchTargetChangeType */
        static final /* synthetic */ int[] f23927x3bf9e295;

        static {
            int[] iArr = new int[WatchChange.WatchTargetChangeType.values().length];
            f23927x3bf9e295 = iArr;
            try {
                iArr[WatchChange.WatchTargetChangeType.NoChange.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23927x3bf9e295[WatchChange.WatchTargetChangeType.Added.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23927x3bf9e295[WatchChange.WatchTargetChangeType.Removed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23927x3bf9e295[WatchChange.WatchTargetChangeType.Current.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23927x3bf9e295[WatchChange.WatchTargetChangeType.Reset.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum BloomFilterApplicationStatus {
        SUCCESS,
        SKIPPED,
        FALSE_POSITIVE
    }

    public interface TargetMetadataProvider {
        ImmutableSortedSet<DocumentKey> getRemoteKeysForTarget(int i2);

        @Nullable
        TargetData getTargetDataForTarget(int i2);
    }

    public WatchChangeAggregator(DatabaseId databaseId, TargetMetadataProvider targetMetadataProvider) {
        this.databaseId = databaseId;
        this.targetMetadataProvider = targetMetadataProvider;
    }

    private void addDocumentToTarget(int i2, MutableDocument mutableDocument) {
        if (isActiveTarget(i2)) {
            ensureTargetState(i2).addDocumentChange(mutableDocument.getKey(), targetContainsDocument(i2, mutableDocument.getKey()) ? DocumentViewChange.Type.MODIFIED : DocumentViewChange.Type.ADDED);
            this.pendingDocumentUpdates.put(mutableDocument.getKey(), mutableDocument);
            ensureDocumentTargetMapping(mutableDocument.getKey()).add(Integer.valueOf(i2));
        }
    }

    private BloomFilterApplicationStatus applyBloomFilter(BloomFilter bloomFilter, WatchChange.ExistenceFilterWatchChange existenceFilterWatchChange, int i2) {
        return existenceFilterWatchChange.getExistenceFilter().getCount() == i2 - filterRemovedDocuments(bloomFilter, existenceFilterWatchChange.getTargetId()) ? BloomFilterApplicationStatus.SUCCESS : BloomFilterApplicationStatus.FALSE_POSITIVE;
    }

    private Set<Integer> ensureDocumentTargetMapping(DocumentKey documentKey) {
        Set<Integer> set = this.pendingDocumentTargetMapping.get(documentKey);
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        this.pendingDocumentTargetMapping.put(documentKey, hashSet);
        return hashSet;
    }

    private TargetState ensureTargetState(int i2) {
        TargetState targetState = this.targetStates.get(Integer.valueOf(i2));
        if (targetState != null) {
            return targetState;
        }
        TargetState targetState2 = new TargetState();
        this.targetStates.put(Integer.valueOf(i2), targetState2);
        return targetState2;
    }

    private int filterRemovedDocuments(BloomFilter bloomFilter, int i2) {
        ImmutableSortedSet<DocumentKey> remoteKeysForTarget = this.targetMetadataProvider.getRemoteKeysForTarget(i2);
        String str = "projects/" + this.databaseId.getProjectId() + "/databases/" + this.databaseId.getDatabaseId() + "/documents/";
        int i3 = 0;
        for (DocumentKey documentKey : remoteKeysForTarget) {
            StringBuilder sbM408p = AbstractC0271e0.m408p(str);
            sbM408p.append(documentKey.getPath().canonicalString());
            if (!bloomFilter.mightContain(sbM408p.toString())) {
                removeDocumentFromTarget(i2, documentKey, null);
                i3++;
            }
        }
        return i3;
    }

    private int getCurrentDocumentCountForTarget(int i2) {
        TargetChange targetChange = ensureTargetState(i2).toTargetChange();
        return (targetChange.getAddedDocuments().size() + this.targetMetadataProvider.getRemoteKeysForTarget(i2).size()) - targetChange.getRemovedDocuments().size();
    }

    private Collection<Integer> getTargetIds(WatchChange.WatchTargetChange watchTargetChange) {
        List<Integer> targetIds = watchTargetChange.getTargetIds();
        if (!targetIds.isEmpty()) {
            return targetIds;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.targetStates.keySet()) {
            if (isActiveTarget(num.intValue())) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }

    private boolean isActiveTarget(int i2) {
        return queryDataForActiveTarget(i2) != null;
    }

    @Nullable
    private BloomFilter parseBloomFilter(WatchChange.ExistenceFilterWatchChange existenceFilterWatchChange) {
        C0423k unchangedNames = existenceFilterWatchChange.getExistenceFilter().getUnchangedNames();
        if (unchangedNames != null && unchangedNames.m848h()) {
            try {
                BloomFilter bloomFilterCreate = BloomFilter.create(unchangedNames.m846e().m841e(), unchangedNames.m846e().m842g(), unchangedNames.m847g());
                if (bloomFilterCreate.getBitCount() != 0) {
                    return bloomFilterCreate;
                }
            } catch (BloomFilter.BloomFilterCreateException e) {
                Logger.warn(LOG_TAG, "Applying bloom filter failed: (" + e.getMessage() + "); ignoring the bloom filter and falling back to full re-query.", new Object[0]);
            }
        }
        return null;
    }

    @Nullable
    private TargetData queryDataForActiveTarget(int i2) {
        TargetState targetState = this.targetStates.get(Integer.valueOf(i2));
        if (targetState == null || !targetState.isPending()) {
            return this.targetMetadataProvider.getTargetDataForTarget(i2);
        }
        return null;
    }

    private void removeDocumentFromTarget(int i2, DocumentKey documentKey, @Nullable MutableDocument mutableDocument) {
        if (isActiveTarget(i2)) {
            TargetState targetStateEnsureTargetState = ensureTargetState(i2);
            if (targetContainsDocument(i2, documentKey)) {
                targetStateEnsureTargetState.addDocumentChange(documentKey, DocumentViewChange.Type.REMOVED);
            } else {
                targetStateEnsureTargetState.removeDocumentChange(documentKey);
            }
            ensureDocumentTargetMapping(documentKey).add(Integer.valueOf(i2));
            if (mutableDocument != null) {
                this.pendingDocumentUpdates.put(documentKey, mutableDocument);
            }
        }
    }

    private void resetTarget(int i2) {
        Assert.hardAssert((this.targetStates.get(Integer.valueOf(i2)) == null || this.targetStates.get(Integer.valueOf(i2)).isPending()) ? false : true, "Should only reset active targets", new Object[0]);
        this.targetStates.put(Integer.valueOf(i2), new TargetState());
        Iterator<DocumentKey> it = this.targetMetadataProvider.getRemoteKeysForTarget(i2).iterator();
        while (it.hasNext()) {
            removeDocumentFromTarget(i2, it.next(), null);
        }
    }

    private boolean targetContainsDocument(int i2, DocumentKey documentKey) {
        return this.targetMetadataProvider.getRemoteKeysForTarget(i2).contains(documentKey);
    }

    public RemoteEvent createRemoteEvent(SnapshotVersion snapshotVersion) {
        HashMap map = new HashMap();
        for (Map.Entry<Integer, TargetState> entry : this.targetStates.entrySet()) {
            Integer key = entry.getKey();
            int iIntValue = key.intValue();
            TargetState value = entry.getValue();
            TargetData targetDataQueryDataForActiveTarget = queryDataForActiveTarget(iIntValue);
            if (targetDataQueryDataForActiveTarget != null) {
                ResourcePath singleDocPath = targetDataQueryDataForActiveTarget.getTarget().getSingleDocPath();
                if (value.isCurrent() && singleDocPath != null) {
                    DocumentKey documentKeyFromPath = DocumentKey.fromPath(singleDocPath);
                    if (this.pendingDocumentUpdates.get(documentKeyFromPath) == null && !targetContainsDocument(iIntValue, documentKeyFromPath)) {
                        removeDocumentFromTarget(iIntValue, documentKeyFromPath, MutableDocument.newNoDocument(documentKeyFromPath, snapshotVersion));
                    }
                }
                if (value.hasChanges()) {
                    map.put(key, value.toTargetChange());
                    value.clearChanges();
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry<DocumentKey, Set<Integer>> entry2 : this.pendingDocumentTargetMapping.entrySet()) {
            DocumentKey key2 = entry2.getKey();
            Iterator<Integer> it = entry2.getValue().iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.add(key2);
                    break;
                }
                TargetData targetDataQueryDataForActiveTarget2 = queryDataForActiveTarget(it.next().intValue());
                if (targetDataQueryDataForActiveTarget2 != null && !targetDataQueryDataForActiveTarget2.getPurpose().equals(QueryPurpose.LIMBO_RESOLUTION)) {
                    break;
                }
            }
        }
        Iterator<MutableDocument> it2 = this.pendingDocumentUpdates.values().iterator();
        while (it2.hasNext()) {
            it2.next().setReadTime(snapshotVersion);
        }
        RemoteEvent remoteEvent = new RemoteEvent(snapshotVersion, Collections.unmodifiableMap(map), Collections.unmodifiableMap(this.pendingTargetResets), Collections.unmodifiableMap(this.pendingDocumentUpdates), Collections.unmodifiableSet(hashSet));
        this.pendingDocumentUpdates = new HashMap();
        this.pendingDocumentTargetMapping = new HashMap();
        this.pendingTargetResets = new HashMap();
        return remoteEvent;
    }

    public void handleDocumentChange(WatchChange.DocumentChange documentChange) {
        MutableDocument newDocument = documentChange.getNewDocument();
        DocumentKey documentKey = documentChange.getDocumentKey();
        Iterator<Integer> it = documentChange.getUpdatedTargetIds().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (newDocument == null || !newDocument.isFoundDocument()) {
                removeDocumentFromTarget(iIntValue, documentKey, newDocument);
            } else {
                addDocumentToTarget(iIntValue, newDocument);
            }
        }
        Iterator<Integer> it2 = documentChange.getRemovedTargetIds().iterator();
        while (it2.hasNext()) {
            removeDocumentFromTarget(it2.next().intValue(), documentKey, documentChange.getNewDocument());
        }
    }

    public void handleExistenceFilter(WatchChange.ExistenceFilterWatchChange existenceFilterWatchChange) {
        int targetId = existenceFilterWatchChange.getTargetId();
        int count = existenceFilterWatchChange.getExistenceFilter().getCount();
        TargetData targetDataQueryDataForActiveTarget = queryDataForActiveTarget(targetId);
        if (targetDataQueryDataForActiveTarget != null) {
            ResourcePath singleDocPath = targetDataQueryDataForActiveTarget.getTarget().getSingleDocPath();
            if (singleDocPath != null) {
                if (count != 0) {
                    Assert.hardAssert(count == 1, "Single document existence filter with count: %d", Integer.valueOf(count));
                    return;
                } else {
                    DocumentKey documentKeyFromPath = DocumentKey.fromPath(singleDocPath);
                    removeDocumentFromTarget(targetId, documentKeyFromPath, MutableDocument.newNoDocument(documentKeyFromPath, SnapshotVersion.NONE));
                    return;
                }
            }
            int currentDocumentCountForTarget = getCurrentDocumentCountForTarget(targetId);
            if (currentDocumentCountForTarget != count) {
                BloomFilter bloomFilter = parseBloomFilter(existenceFilterWatchChange);
                BloomFilterApplicationStatus bloomFilterApplicationStatusApplyBloomFilter = bloomFilter != null ? applyBloomFilter(bloomFilter, existenceFilterWatchChange, currentDocumentCountForTarget) : BloomFilterApplicationStatus.SKIPPED;
                if (bloomFilterApplicationStatusApplyBloomFilter != BloomFilterApplicationStatus.SUCCESS) {
                    resetTarget(targetId);
                    this.pendingTargetResets.put(Integer.valueOf(targetId), bloomFilterApplicationStatusApplyBloomFilter == BloomFilterApplicationStatus.FALSE_POSITIVE ? QueryPurpose.EXISTENCE_FILTER_MISMATCH_BLOOM : QueryPurpose.EXISTENCE_FILTER_MISMATCH);
                }
                TestingHooks.getInstance().notifyOnExistenceFilterMismatch(TestingHooks.ExistenceFilterMismatchInfo.from(currentDocumentCountForTarget, existenceFilterWatchChange.getExistenceFilter(), this.databaseId, bloomFilter, bloomFilterApplicationStatusApplyBloomFilter));
            }
        }
    }

    public void handleTargetChange(WatchChange.WatchTargetChange watchTargetChange) {
        Iterator<Integer> it = getTargetIds(watchTargetChange).iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            TargetState targetStateEnsureTargetState = ensureTargetState(iIntValue);
            int i2 = C59571.f23927x3bf9e295[watchTargetChange.getChangeType().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    targetStateEnsureTargetState.recordTargetResponse();
                    if (!targetStateEnsureTargetState.isPending()) {
                        targetStateEnsureTargetState.clearChanges();
                    }
                    targetStateEnsureTargetState.updateResumeToken(watchTargetChange.getResumeToken());
                } else if (i2 == 3) {
                    targetStateEnsureTargetState.recordTargetResponse();
                    if (!targetStateEnsureTargetState.isPending()) {
                        removeTarget(iIntValue);
                    }
                    Assert.hardAssert(watchTargetChange.getCause() == null, "WatchChangeAggregator does not handle errored targets", new Object[0]);
                } else if (i2 != 4) {
                    if (i2 != 5) {
                        throw Assert.fail("Unknown target watch change state: %s", watchTargetChange.getChangeType());
                    }
                    if (isActiveTarget(iIntValue)) {
                        resetTarget(iIntValue);
                        targetStateEnsureTargetState.updateResumeToken(watchTargetChange.getResumeToken());
                    }
                } else if (isActiveTarget(iIntValue)) {
                    targetStateEnsureTargetState.markCurrent();
                    targetStateEnsureTargetState.updateResumeToken(watchTargetChange.getResumeToken());
                }
            } else if (isActiveTarget(iIntValue)) {
                targetStateEnsureTargetState.updateResumeToken(watchTargetChange.getResumeToken());
            }
        }
    }

    public void recordPendingTargetRequest(int i2) {
        ensureTargetState(i2).recordPendingTargetRequest();
    }

    public void removeTarget(int i2) {
        this.targetStates.remove(Integer.valueOf(i2));
    }
}
