package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.settings.SettingsProvider;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.d */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5647d implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23593s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ CrashlyticsCore f23594t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ SettingsProvider f23595u;

    public /* synthetic */ RunnableC5647d(CrashlyticsCore crashlyticsCore, SettingsProvider settingsProvider, int i2) {
        this.f23593s = i2;
        this.f23594t = crashlyticsCore;
        this.f23595u = settingsProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23593s) {
            case 0:
                this.f23594t.lambda$doBackgroundInitializationAsync$0(this.f23595u);
                break;
            default:
                this.f23594t.lambda$finishInitSynchronously$9(this.f23595u);
                break;
        }
    }
}
