package com.google.android.gms.common.util.concurrent;

import android.os.Looper;
import com.google.android.gms.internal.common.zzg;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class HandlerExecutor implements Executor {

    /* JADX INFO: renamed from: s */
    public final zzg f4652s;

    public HandlerExecutor(Looper looper) {
        this.f4652s = new zzg(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f4652s.post(runnable);
    }
}
