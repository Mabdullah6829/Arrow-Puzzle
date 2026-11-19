package com.google.android.gms.internal.ads;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbte implements zzbsw, zzbsu {

    /* JADX INFO: renamed from: s */
    public zzclb f9335s;

    /* JADX INFO: renamed from: c */
    public static final void m5132c(Runnable runnable) {
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a;
        zzgax zzgaxVar = com.google.android.gms.ads.internal.util.client.zzf.f3409b;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            com.google.android.gms.ads.internal.util.zze.m3150k("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zze.m3150k("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (com.google.android.gms.ads.internal.util.zzs.f3626l.post(runnable)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    /* JADX INFO: renamed from: n */
    public final void mo5133n(String str, zzbpx zzbpxVar) {
        zzclb zzclbVar = this.f9335s;
        if (zzclbVar != null) {
            zzclbVar.mo5570B0(str, new zzbtc(zzbpxVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    /* JADX INFO: renamed from: r */
    public final void mo5134r(String str, zzbpx zzbpxVar) {
        zzclb zzclbVar = this.f9335s;
        if (zzclbVar != null) {
            zzclbVar.mo5616v0(str, new zzbsx(this, zzbpxVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zza(final String str) {
        com.google.android.gms.ads.internal.util.zze.m3150k("invokeJavascript on adWebView from js");
        m5132c(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzclb zzclbVar = this.f9333s.f9335s;
                if (zzclbVar != null) {
                    zzclbVar.zza(str);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzj() {
        zzclb zzclbVar = this.f9335s;
        if (zzclbVar != null) {
            zzclbVar.destroy();
            this.f9335s = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final boolean zzk() {
        zzclb zzclbVar = this.f9335s;
        return zzclbVar == null || zzclbVar.mo5576F();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final zzbud zzl() {
        return new zzbud(this);
    }
}
