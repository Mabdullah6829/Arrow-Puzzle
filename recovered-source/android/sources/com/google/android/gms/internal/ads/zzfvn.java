package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
final class zzfvn implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzfvo f16657s;

    public zzfvn(zzfvo zzfvoVar) {
        this.f16657s = zzfvoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfvo zzfvoVar = this.f16657s;
        AtomicBoolean atomicBoolean = zzfvoVar.f16662e;
        AudioManager audioManager = zzfvoVar.f16660c;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f2 = 0.0f;
        if (streamMaxVolume > 0 && streamVolume > 0) {
            f2 = streamVolume / streamMaxVolume;
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
        }
        atomicBoolean.set(false);
        if (((Float) zzfvoVar.f16661d.getAndSet(Float.valueOf(f2))).floatValue() != f2) {
            zzfvoVar.f16658a.post(new zzfvm(this, f2));
        }
    }
}
