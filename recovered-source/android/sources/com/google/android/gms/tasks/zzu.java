package com.google.android.gms.tasks;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzu implements Executor {

    /* JADX INFO: renamed from: s */
    public final com.google.android.gms.internal.tasks.zza f23268s;

    public zzu() {
        com.google.android.gms.internal.tasks.zza zzaVar = new com.google.android.gms.internal.tasks.zza(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f23268s = zzaVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f23268s.post(runnable);
    }
}
