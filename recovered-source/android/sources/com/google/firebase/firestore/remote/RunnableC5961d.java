package com.google.firebase.firestore.remote;

/* JADX INFO: renamed from: com.google.firebase.firestore.remote.d */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5961d implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23936s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23937t;

    public /* synthetic */ RunnableC5961d(Object obj, int i2) {
        this.f23936s = i2;
        this.f23937t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23936s) {
            case 0:
                ((AbstractStream.StreamObserver) this.f23937t).lambda$onOpen$2();
                break;
            default:
                ((OnlineStateTracker) this.f23937t).lambda$handleWatchStreamStart$0();
                break;
        }
    }
}
