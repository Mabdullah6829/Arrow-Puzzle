package com.google.firebase.firestore;

import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.util.Function;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.firebase.firestore.k */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC5770k implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23706a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23707b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f23708c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f23709d;

    public /* synthetic */ CallableC5770k(Object obj, Object obj2, Object obj3, int i2) {
        this.f23706a = i2;
        this.f23707b = obj;
        this.f23708c = obj2;
        this.f23709d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f23706a) {
            case 0:
                return ((FirebaseFirestore) this.f23707b).lambda$runTransaction$1((Transaction.Function) this.f23708c, (com.google.firebase.firestore.core.Transaction) this.f23709d);
            default:
                return ((FirestoreClient) this.f23707b).lambda$transaction$13((TransactionOptions) this.f23708c, (Function) this.f23709d);
        }
    }
}
