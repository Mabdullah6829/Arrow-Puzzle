package com.google.firebase.firestore.remote;

/* JADX INFO: renamed from: com.google.firebase.firestore.remote.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5958a implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23928s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ AbstractStream f23929t;

    public /* synthetic */ RunnableC5958a(AbstractStream abstractStream, int i2) {
        this.f23928s = i2;
        this.f23929t = abstractStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23928s) {
            case 0:
                this.f23929t.lambda$performBackoff$1();
                break;
            default:
                this.f23929t.lambda$onOpen$0();
                break;
        }
    }
}
