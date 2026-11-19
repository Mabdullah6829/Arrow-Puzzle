package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes2.dex */
final class zzfr {

    /* JADX INFO: renamed from: a */
    public final Context f16370a;

    /* JADX INFO: renamed from: b */
    public PowerManager.WakeLock f16371b;

    public zzfr(Context context) {
        this.f16370a = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m6617a(boolean z, boolean z2) {
        synchronized (this) {
            boolean z3 = false;
            if (z) {
                if (this.f16371b == null) {
                    Context context = this.f16370a;
                    if (context.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        zzeh.m6211c("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    if (powerManager == null) {
                        zzeh.m6211c("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        this.f16371b = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = this.f16371b;
            if (wakeLock == null) {
                return;
            }
            if (z && z2) {
                z3 = true;
            }
            if (z3) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }
}
