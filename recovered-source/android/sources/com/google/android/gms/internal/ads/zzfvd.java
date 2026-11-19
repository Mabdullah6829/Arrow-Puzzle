package com.google.android.gms.internal.ads;

import androidx.webkit.WebViewCompat;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
final class zzfvd extends TimerTask {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzfvf f16639s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Timer f16640t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzfvg f16641u;

    public zzfvd(zzfvg zzfvgVar, zzfvf zzfvfVar, Timer timer) {
        this.f16639s = zzfvfVar;
        this.f16640t = timer;
        Objects.requireNonNull(zzfvgVar);
        this.f16641u = zzfvgVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        WebViewCompat.removeWebMessageListener(this.f16641u.f16644b, "omidJsSessionService");
        final zzclb zzclbVar = ((zzclv) this.f16639s).f10481a.f10483s;
        com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzs.f3626l;
        Objects.requireNonNull(zzclbVar);
        zzfVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcls
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzclbVar.destroy();
            }
        });
        this.f16640t.cancel();
    }
}
