package com.google.firebase.firestore;

import com.google.firebase.firestore.core.AsyncEventListener;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.util.Function;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.firebase.firestore.o */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5820o implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23839a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23840b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f23841c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f23842d;

    public /* synthetic */ C5820o(Object obj, Object obj2, Object obj3, int i2) {
        this.f23839a = i2;
        this.f23840b = obj;
        this.f23841c = obj2;
        this.f23842d = obj3;
    }

    @Override // com.google.firebase.firestore.util.Function
    public final Object apply(Object obj) {
        switch (this.f23839a) {
            case 0:
                return ((FirebaseFirestore) this.f23840b).lambda$runTransaction$2((Executor) this.f23841c, (Transaction.Function) this.f23842d, (com.google.firebase.firestore.core.Transaction) obj);
            default:
                return RealtimePipeline.addSnapshotListener$lambda$3((RealtimePipeline) this.f23840b, (RealtimePipeline.ListenOptions) this.f23841c, (AsyncEventListener) this.f23842d, (FirestoreClient) obj);
        }
    }
}
