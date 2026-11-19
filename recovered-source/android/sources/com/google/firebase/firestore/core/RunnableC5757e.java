package com.google.firebase.firestore.core;

/* JADX INFO: renamed from: com.google.firebase.firestore.core.e */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5757e implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23678s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ FirestoreClient f23679t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ QueryListener f23680u;

    public /* synthetic */ RunnableC5757e(FirestoreClient firestoreClient, QueryListener queryListener, int i2) {
        this.f23678s = i2;
        this.f23679t = firestoreClient;
        this.f23680u = queryListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23678s) {
            case 0:
                this.f23679t.lambda$stopListening$8(this.f23680u);
                break;
            default:
                this.f23679t.lambda$listen$7(this.f23680u);
                break;
        }
    }
}
