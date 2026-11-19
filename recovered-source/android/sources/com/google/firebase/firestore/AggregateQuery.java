package com.google.firebase.firestore;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Preconditions;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class AggregateQuery {

    @NonNull
    private final List<AggregateField> aggregateFieldList;

    @NonNull
    private final Query query;

    public AggregateQuery(@NonNull Query query, @NonNull List<AggregateField> list) {
        this.query = query;
        this.aggregateFieldList = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$get$0(FirestoreClient firestoreClient) {
        return firestoreClient.runAggregateQuery(this.query.query, this.aggregateFieldList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$get$1(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.m10768b(new AggregateQuerySnapshot(this, (Map) task.getResult()));
            return null;
        }
        taskCompletionSource.m10767a(task.getException());
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AggregateQuery)) {
            return false;
        }
        AggregateQuery aggregateQuery = (AggregateQuery) obj;
        return this.query.equals(aggregateQuery.query) && this.aggregateFieldList.equals(aggregateQuery.aggregateFieldList);
    }

    @NonNull
    public Task<AggregateQuerySnapshot> get(@NonNull AggregateSource aggregateSource) {
        Preconditions.checkNotNull(aggregateSource, "AggregateSource must not be null");
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ((Task) this.query.firestore.callClient(new C5739a(this, 0))).continueWith(Executors.DIRECT_EXECUTOR, new Continuation() { // from class: com.google.firebase.firestore.b
            @Override // com.google.android.gms.tasks.Continuation
            /* JADX INFO: renamed from: a */
            public final Object mo170a(Task task) {
                return this.f23653s.lambda$get$1(taskCompletionSource, task);
            }
        });
        return taskCompletionSource.f23216a;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public List<AggregateField> getAggregateFields() {
        return this.aggregateFieldList;
    }

    @NonNull
    public Query getQuery() {
        return this.query;
    }

    public int hashCode() {
        return Objects.hash(this.query, this.aggregateFieldList);
    }
}
