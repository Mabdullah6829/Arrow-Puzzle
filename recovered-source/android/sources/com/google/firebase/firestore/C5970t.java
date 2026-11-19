package com.google.firebase.firestore;

import android.app.Activity;
import com.google.firebase.firestore.core.AsyncEventListener;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.util.Function;
import p022N.C0349D;

/* JADX INFO: renamed from: com.google.firebase.firestore.t */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5970t implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23957a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23958b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f23959c;

    public /* synthetic */ C5970t(int i2, Object obj, Object obj2) {
        this.f23957a = i2;
        this.f23958b = obj;
        this.f23959c = obj2;
    }

    @Override // com.google.firebase.firestore.util.Function
    public final Object apply(Object obj) {
        switch (this.f23957a) {
            case 0:
                return Pipeline.execute$lambda$2((C0349D) this.f23958b, (Pipeline.ObserverSnapshotTask) this.f23959c, (FirestoreClient) obj);
            case 1:
                return FirebaseFirestore.lambda$runTransaction$3((TransactionOptions) this.f23958b, (C5820o) this.f23959c, (FirestoreClient) obj);
            default:
                return FirebaseFirestore.lambda$addSnapshotsInSyncListener$11((AsyncEventListener) this.f23958b, (Activity) this.f23959c, (FirestoreClient) obj);
        }
    }
}
