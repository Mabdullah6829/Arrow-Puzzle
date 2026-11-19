package com.google.firebase.firestore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.core.UserData;
import com.google.firebase.firestore.model.mutation.DeleteMutation;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.Precondition;
import com.google.firebase.firestore.util.Preconditions;
import com.google.firebase.firestore.util.Util;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class WriteBatch {
    private final FirebaseFirestore firestore;
    private final ArrayList<Mutation> mutations = new ArrayList<>();
    private boolean committed = false;

    public interface Function {
        void apply(@NonNull WriteBatch writeBatch);
    }

    public WriteBatch(FirebaseFirestore firebaseFirestore) {
        this.firestore = (FirebaseFirestore) Preconditions.checkNotNull(firebaseFirestore);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$commit$0(FirestoreClient firestoreClient) {
        return firestoreClient.write(this.mutations);
    }

    private void verifyNotCommitted() {
        if (this.committed) {
            throw new IllegalStateException("A write batch can no longer be used after commit() has been called.");
        }
    }

    @NonNull
    public Task<Void> commit() {
        verifyNotCommitted();
        this.committed = true;
        return !this.mutations.isEmpty() ? (Task) this.firestore.callClient(new C5739a(this, 5)) : Tasks.m10776f(null);
    }

    @NonNull
    public WriteBatch delete(@NonNull DocumentReference documentReference) {
        this.firestore.validateReference(documentReference);
        verifyNotCommitted();
        this.mutations.add(new DeleteMutation(documentReference.getKey(), Precondition.NONE));
        return this;
    }

    @NonNull
    public WriteBatch set(@NonNull DocumentReference documentReference, @NonNull Object obj) {
        return set(documentReference, obj, SetOptions.OVERWRITE);
    }

    @NonNull
    public WriteBatch update(@NonNull DocumentReference documentReference, @NonNull Map<String, Object> map) {
        return update(documentReference, this.firestore.getUserDataReader().parseUpdateData(map));
    }

    @NonNull
    public WriteBatch set(@NonNull DocumentReference documentReference, @NonNull Object obj, @NonNull SetOptions setOptions) {
        this.firestore.validateReference(documentReference);
        Preconditions.checkNotNull(obj, "Provided data must not be null.");
        Preconditions.checkNotNull(setOptions, "Provided options must not be null.");
        verifyNotCommitted();
        this.mutations.add((setOptions.isMerge() ? this.firestore.getUserDataReader().parseMergeData(obj, setOptions.getFieldMask()) : this.firestore.getUserDataReader().parseSetData(obj)).toMutation(documentReference.getKey(), Precondition.NONE));
        return this;
    }

    @NonNull
    public WriteBatch update(@NonNull DocumentReference documentReference, @NonNull String str, @Nullable Object obj, Object... objArr) {
        return update(documentReference, this.firestore.getUserDataReader().parseUpdateData(Util.collectUpdateArguments(1, str, obj, objArr)));
    }

    @NonNull
    public WriteBatch update(@NonNull DocumentReference documentReference, @NonNull FieldPath fieldPath, @Nullable Object obj, Object... objArr) {
        return update(documentReference, this.firestore.getUserDataReader().parseUpdateData(Util.collectUpdateArguments(1, fieldPath, obj, objArr)));
    }

    private WriteBatch update(@NonNull DocumentReference documentReference, @NonNull UserData.ParsedUpdateData parsedUpdateData) {
        this.firestore.validateReference(documentReference);
        verifyNotCommitted();
        this.mutations.add(parsedUpdateData.toMutation(documentReference.getKey(), Precondition.exists(true)));
        return this;
    }
}
