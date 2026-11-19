package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
final class zzfwz implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = zzfxc.f16737i;
        if (handler != null) {
            handler.post(zzfxc.f16738j);
            zzfxc.f16737i.postDelayed(zzfxc.f16739k, 200L);
        }
    }
}
