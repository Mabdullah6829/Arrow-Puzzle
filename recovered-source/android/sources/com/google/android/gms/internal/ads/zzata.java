package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzata implements Executor {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Handler f6867s;

    public zzata(zzatc zzatcVar, Handler handler) {
        this.f6867s = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f6867s.post(runnable);
    }
}
