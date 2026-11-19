package com.google.firebase.firestore;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.content.C1163a;

/* JADX INFO: loaded from: classes2.dex */
public final class PersistentCacheIndexManager {

    @NonNull
    private FirestoreClientProvider client;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public PersistentCacheIndexManager(FirestoreClientProvider firestoreClientProvider) {
        this.client = firestoreClientProvider;
    }

    public void deleteAllIndexes() {
        this.client.procedure(new C1163a(4));
    }

    public void disableIndexAutoCreation() {
        this.client.procedure(new C1163a(3));
    }

    public void enableIndexAutoCreation() {
        this.client.procedure(new C1163a(2));
    }
}
