package com.google.firebase.crashlytics.internal.common;

import java.util.Map;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.c */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5646c implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23590s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23591t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f23592u;

    public /* synthetic */ RunnableC5646c(int i2, Object obj, Object obj2) {
        this.f23590s = i2;
        this.f23591t = obj;
        this.f23592u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23590s) {
            case 0:
                ((CrashlyticsController) this.f23591t).lambda$openSession$1((String) this.f23592u);
                break;
            case 1:
                ((CrashlyticsCore) this.f23591t).lambda$setCustomKeys$6((Map) this.f23592u);
                break;
            case 2:
                ((CrashlyticsCore) this.f23591t).lambda$logFatalException$8((Throwable) this.f23592u);
                break;
            default:
                ((CrashlyticsCore) this.f23591t).lambda$setUserId$4((String) this.f23592u);
                break;
        }
    }
}
