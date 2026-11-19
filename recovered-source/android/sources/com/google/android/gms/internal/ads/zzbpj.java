package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzbpj implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5095a(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzclbVar.mo3270u0();
        } else if ("resume".equals(str)) {
            zzclbVar.mo3269L();
        }
    }
}
