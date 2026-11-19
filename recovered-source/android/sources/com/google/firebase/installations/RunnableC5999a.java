package com.google.firebase.installations;

/* JADX INFO: renamed from: com.google.firebase.installations.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5999a implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23989s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ FirebaseInstallations f23990t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ boolean f23991u;

    public /* synthetic */ RunnableC5999a(FirebaseInstallations firebaseInstallations, boolean z, int i2) {
        this.f23989s = i2;
        this.f23990t = firebaseInstallations;
        this.f23991u = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23989s) {
            case 0:
                this.f23990t.lambda$doRegistrationOrRefresh$3(this.f23991u);
                break;
            default:
                this.f23990t.lambda$getToken$2(this.f23991u);
                break;
        }
    }
}
