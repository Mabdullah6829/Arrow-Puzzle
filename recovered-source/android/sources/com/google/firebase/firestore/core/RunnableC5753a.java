package com.google.firebase.firestore.core;

/* JADX INFO: renamed from: com.google.firebase.firestore.core.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5753a implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23666s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ FirestoreClient f23667t;

    public /* synthetic */ RunnableC5753a(FirestoreClient firestoreClient, int i2) {
        this.f23666s = i2;
        this.f23667t = firestoreClient;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23666s) {
            case 0:
                this.f23667t.lambda$deleteAllFieldIndexes$24();
                break;
            case 1:
                this.f23667t.lambda$enableNetwork$5();
                break;
            case 2:
                this.f23667t.lambda$terminate$6();
                break;
            default:
                this.f23667t.lambda$disableNetwork$4();
                break;
        }
    }
}
