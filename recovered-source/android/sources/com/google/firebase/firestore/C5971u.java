package com.google.firebase.firestore;

import com.google.firebase.firestore.model.Document;
import p078p0.InterfaceC6504r;

/* JADX INFO: renamed from: com.google.firebase.firestore.u */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5971u implements InterfaceC6504r {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23960s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23961t;

    public /* synthetic */ C5971u(Object obj, int i2) {
        this.f23960s = i2;
        this.f23961t = obj;
    }

    @Override // p078p0.InterfaceC6504r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f23960s) {
            case 0:
                return ((QuerySnapshot) this.f23961t).lambda$getDocumentChanges$0((Document) obj, (DocumentChange.Type) obj2, (Integer) obj3, (Integer) obj4);
            default:
                return RealtimePipeline.Snapshot.getChanges$lambda$1((RealtimePipeline.Snapshot) this.f23961t, (Document) obj, (DocumentChange.Type) obj2, ((Integer) obj3).intValue(), ((Integer) obj4).intValue());
        }
    }
}
