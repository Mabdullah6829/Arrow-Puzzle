package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdsy implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzcgd f12854a;

    public zzdsy(zzdtk zzdtkVar, zzcgd zzcgdVar) {
        this.f12854a = zzcgdVar;
        Objects.requireNonNull(zzdtkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        zzclb zzclbVar = (zzclb) obj;
        zzcgd zzcgdVar = this.f12854a;
        if (zzclbVar == null) {
            zzcgdVar.m5398b(new zzepp(1, "Missing webview from video view future."));
        } else {
            zzclbVar.mo5616v0("/video", new zzcit(new zzdsx(zzcgdVar)));
            zzclbVar.mo5598e0();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3070c("Failed to load media data due to video view load failure.");
        this.f12854a.m5398b(th);
    }
}
