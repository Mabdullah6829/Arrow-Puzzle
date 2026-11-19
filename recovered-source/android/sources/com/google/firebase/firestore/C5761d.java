package com.google.firebase.firestore;

import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.util.Function;
import java.util.List;

/* JADX INFO: renamed from: com.google.firebase.firestore.d */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5761d implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23685a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f23686b;

    public /* synthetic */ C5761d(List list, int i2) {
        this.f23685a = i2;
        this.f23686b = list;
    }

    @Override // com.google.firebase.firestore.util.Function
    public final Object apply(Object obj) {
        switch (this.f23685a) {
            case 0:
                return DocumentReference.lambda$delete$2(this.f23686b, (FirestoreClient) obj);
            case 1:
                return DocumentReference.lambda$set$0(this.f23686b, (FirestoreClient) obj);
            default:
                return DocumentReference.lambda$update$1(this.f23686b, (FirestoreClient) obj);
        }
    }
}
