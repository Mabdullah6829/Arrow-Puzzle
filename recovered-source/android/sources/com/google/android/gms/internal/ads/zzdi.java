package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdi {

    /* JADX INFO: renamed from: a */
    public static ExecutorService f12203a;

    /* JADX INFO: renamed from: a */
    public static synchronized Executor m5922a() {
        try {
            if (f12203a == null) {
                String str = zzfm.f16091a;
                f12203a = Executors.newSingleThreadExecutor(new zzfl("ExoPlayer:BackgroundExecutor"));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f12203a;
    }
}
