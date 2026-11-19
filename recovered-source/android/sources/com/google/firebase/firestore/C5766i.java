package com.google.firebase.firestore;

import com.google.firebase.firestore.core.ComponentProvider;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.util.Function;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.firebase.firestore.i */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5766i implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23703a;

    public /* synthetic */ C5766i(int i2) {
        this.f23703a = i2;
    }

    @Override // com.google.firebase.firestore.util.Function
    public final Object apply(Object obj) {
        switch (this.f23703a) {
            case 0:
                return ((FirestoreClient) obj).waitForPendingWrites();
            case 1:
                return ((FirestoreClient) obj).enableNetwork();
            case 2:
                return ((FirestoreClient) obj).disableNetwork();
            case 3:
                return ComponentProvider.defaultFactory((FirebaseFirestoreSettings) obj);
            default:
                return FirebaseFirestore.lambda$clearPersistence$4((Executor) obj);
        }
    }
}
