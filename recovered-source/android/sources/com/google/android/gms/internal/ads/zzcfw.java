package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.util.CrashUtils;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzcfw implements Executor {

    /* JADX INFO: renamed from: s */
    public final com.google.android.gms.ads.internal.util.zzf f9944s = new com.google.android.gms.ads.internal.util.zzf(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.f9944s.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
            Context context = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.f9893e;
            com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzs.f3626l;
            if (context != null) {
                try {
                    if (((Boolean) zzblg.f9124b.m5057c()).booleanValue()) {
                        CrashUtils.m3642a(context, th);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th;
        }
    }
}
