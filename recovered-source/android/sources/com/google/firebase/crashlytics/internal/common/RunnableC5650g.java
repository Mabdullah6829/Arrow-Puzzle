package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.g */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5650g implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23600s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ CrashlyticsCore f23601t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ String f23602u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ String f23603v;

    public /* synthetic */ RunnableC5650g(CrashlyticsCore crashlyticsCore, String str, String str2, int i2) {
        this.f23600s = i2;
        this.f23601t = crashlyticsCore;
        this.f23602u = str;
        this.f23603v = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23600s) {
            case 0:
                this.f23601t.lambda$setCustomKey$5(this.f23602u, this.f23603v);
                break;
            default:
                this.f23601t.lambda$setInternalKey$7(this.f23602u, this.f23603v);
                break;
        }
    }
}
