package com.google.firebase.messaging;

/* JADX INFO: renamed from: com.google.firebase.messaging.p */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6024p implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f24030s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f24031t;

    public /* synthetic */ RunnableC6024p(Object obj, int i2) {
        this.f24030s = i2;
        this.f24031t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24030s) {
            case 0:
                ((SharedPreferencesQueue) this.f24031t).syncState();
                break;
            default:
                ((WithinAppServiceConnection.BindRequest) this.f24031t).lambda$arrangeTimeout$0();
                break;
        }
    }
}
