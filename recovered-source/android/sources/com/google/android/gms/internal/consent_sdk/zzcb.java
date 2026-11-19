package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzcb implements Executor {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Handler f21610s;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f21610s.post(runnable);
    }
}
