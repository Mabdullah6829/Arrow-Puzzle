package com.google.firebase.firestore;

import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Function;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.firebase.firestore.l */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5771l implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23710a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FirebaseFirestore f23711b;

    public /* synthetic */ C5771l(FirebaseFirestore firebaseFirestore, int i2) {
        this.f23710a = i2;
        this.f23711b = firebaseFirestore;
    }

    @Override // com.google.firebase.firestore.util.Function
    public final Object apply(Object obj) {
        switch (this.f23710a) {
            case 0:
                return this.f23711b.newClient((AsyncQueue) obj);
            default:
                return this.f23711b.clearPersistence((Executor) obj);
        }
    }
}
