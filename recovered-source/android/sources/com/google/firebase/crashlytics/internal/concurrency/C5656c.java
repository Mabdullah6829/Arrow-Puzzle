package com.google.firebase.crashlytics.internal.concurrency;

import com.google.firebase.sessions.SessionData;
import p078p0.InterfaceC6487a;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.concurrency.c */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5656c implements InterfaceC6487a {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23618s;

    public /* synthetic */ C5656c(int i2) {
        this.f23618s = i2;
    }

    @Override // p078p0.InterfaceC6487a
    public final Object invoke() {
        switch (this.f23618s) {
            case 0:
                return CrashlyticsWorkers.Companion.checkBackgroundThread$lambda$2();
            case 1:
                return CrashlyticsWorkers.Companion.checkNotMainThread$lambda$0();
            case 2:
                return CrashlyticsWorkers.Companion.checkBlockingThread$lambda$1();
            default:
                return SessionData._childSerializers$_anonymous_();
        }
    }
}
