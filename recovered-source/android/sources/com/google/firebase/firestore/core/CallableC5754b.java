package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.DocumentKey;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.firebase.firestore.core.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC5754b implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23668a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FirestoreClient f23669b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f23670c;

    public /* synthetic */ CallableC5754b(FirestoreClient firestoreClient, Object obj, int i2) {
        this.f23668a = i2;
        this.f23669b = firestoreClient;
        this.f23670c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f23668a) {
            case 0:
                return this.f23669b.lambda$getDocumentFromLocalCache$9((DocumentKey) this.f23670c);
            default:
                return this.f23669b.lambda$getDocumentsFromLocalCache$11((QueryOrPipeline) this.f23670c);
        }
    }
}
