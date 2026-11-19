package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzbpe implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5095a(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        if (zzclbVar.mo5600f0() != null) {
            zzclbVar.mo5600f0().mo4870u();
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVarMo5585O = zzclbVar.mo5585O();
        if (zzmVarMo5585O != null) {
            zzmVarMo5585O.zzb();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVarMo5589S = zzclbVar.mo5589S();
        if (zzmVarMo5589S != null) {
            zzmVarMo5589S.zzb();
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
