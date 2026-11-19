package com.google.firebase.firestore.local;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.f */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5797f implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23766s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ LocalStore f23767t;

    public /* synthetic */ RunnableC5797f(LocalStore localStore, int i2) {
        this.f23766s = i2;
        this.f23767t = localStore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23766s) {
            case 0:
                this.f23767t.lambda$startIndexManager$0();
                break;
            case 1:
                this.f23767t.lambda$startMutationQueue$1();
                break;
            default:
                this.f23767t.lambda$deleteAllFieldIndexes$16();
                break;
        }
    }
}
