package com.google.firebase.firestore.local;

import androidx.annotation.Nullable;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.protobuf.AbstractC6251n;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
interface MutationQueue {
    void acknowledgeBatch(MutationBatch mutationBatch, AbstractC6251n abstractC6251n);

    MutationBatch addMutationBatch(Timestamp timestamp, List<Mutation> list, List<Mutation> list2);

    List<MutationBatch> getAllMutationBatches();

    List<MutationBatch> getAllMutationBatchesAffectingDocumentKey(DocumentKey documentKey);

    List<MutationBatch> getAllMutationBatchesAffectingDocumentKeys(Iterable<DocumentKey> iterable);

    List<MutationBatch> getAllMutationBatchesAffectingQuery(Query query);

    int getHighestUnacknowledgedBatchId();

    AbstractC6251n getLastStreamToken();

    @Nullable
    MutationBatch getNextMutationBatchAfterBatchId(int i2);

    boolean isEmpty();

    @Nullable
    MutationBatch lookupMutationBatch(int i2);

    void performConsistencyCheck();

    void removeMutationBatch(MutationBatch mutationBatch);

    void setLastStreamToken(AbstractC6251n abstractC6251n);

    void start();
}
