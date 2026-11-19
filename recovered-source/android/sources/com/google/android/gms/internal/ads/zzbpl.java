package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzbpl implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5095a(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        if (map.containsKey("start")) {
            zzclbVar.mo5615t0(true);
        }
        if (map.containsKey("stop")) {
            zzclbVar.mo5615t0(false);
        }
    }
}
