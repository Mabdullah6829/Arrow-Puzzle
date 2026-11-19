package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzbpk implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        if (map.containsKey("start")) {
            zzclm zzclmVarMo5582K = zzclbVar.mo5582K();
            synchronized (zzclmVarMo5582K.f10447v) {
            }
            zzclmVarMo5582K.f10439V++;
            zzclmVarMo5582K.m5630U();
            return;
        }
        if (map.containsKey("stop")) {
            zzclm zzclmVarMo5582K2 = zzclbVar.mo5582K();
            zzclmVarMo5582K2.f10439V--;
            zzclmVarMo5582K2.m5630U();
        } else if (map.containsKey("cancel")) {
            zzclm zzclmVarMo5582K3 = zzclbVar.mo5582K();
            zzbhw zzbhwVar = zzclmVarMo5582K3.f10445t;
            if (zzbhwVar != null) {
                zzbhwVar.m4895c(10005);
            }
            zzclmVarMo5582K3.f10438U = true;
            zzclmVarMo5582K3.f10423F = 10004;
            zzclmVarMo5582K3.f10424G = "Page loaded delay cancel.";
            zzclmVarMo5582K3.m5630U();
            zzclmVarMo5582K3.f10444s.destroy();
        }
    }
}
