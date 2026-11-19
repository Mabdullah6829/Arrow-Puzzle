package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzcfg extends com.google.android.gms.ads.internal.util.zzb {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzcfk f9883b;

    public zzcfg(zzcfk zzcfkVar) {
        Objects.requireNonNull(zzcfkVar);
        this.f9883b = zzcfkVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    /* JADX INFO: renamed from: a */
    public final void mo3002a() {
        zzcfk zzcfkVar = this.f9883b;
        zzbja zzbjaVar = new zzbja(zzcfkVar.f9893e, zzcfkVar.f9894f.f3396s);
        synchronized (zzcfkVar.f9889a) {
            try {
                zzbjd zzbjdVar = com.google.android.gms.ads.internal.zzt.f3698C.f3713m;
                zzbjd.m5037a(zzcfkVar.f9896h, zzbjaVar);
            } catch (IllegalArgumentException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3074g("Cannot config CSI reporter.", e);
            }
        }
    }
}
