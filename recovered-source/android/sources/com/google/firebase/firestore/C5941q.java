package com.google.firebase.firestore;

import p004C0.InterfaceC0152q;

/* JADX INFO: renamed from: com.google.firebase.firestore.q */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5941q implements EventListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23912a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23913b;

    public /* synthetic */ C5941q(Object obj, int i2) {
        this.f23912a = i2;
        this.f23913b = obj;
    }

    @Override // com.google.firebase.firestore.EventListener
    public final void onEvent(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        switch (this.f23912a) {
            case 0:
                FirestoreKt.C57261.invokeSuspend$lambda$0((InterfaceC0152q) this.f23913b, (DocumentSnapshot) obj, firebaseFirestoreException);
                break;
            case 1:
                FirestoreKt.C57272.invokeSuspend$lambda$0((InterfaceC0152q) this.f23913b, (QuerySnapshot) obj, firebaseFirestoreException);
                break;
            case 2:
                RealtimePipeline.C57351.invokeSuspend$lambda$0((InterfaceC0152q) this.f23913b, (RealtimePipeline.Snapshot) obj, firebaseFirestoreException);
                break;
            default:
                FirebaseFirestore.lambda$addSnapshotsInSyncListener$9((Runnable) this.f23913b, (Void) obj, firebaseFirestoreException);
                break;
        }
    }
}
