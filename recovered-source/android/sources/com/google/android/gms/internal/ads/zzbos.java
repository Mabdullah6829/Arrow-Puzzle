package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzbos implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5095a(Object obj, Map map) {
        JSONObject jSONObjectZzc;
        zzclb zzclbVar = (zzclb) obj;
        zzbly zzblyVarMo5593Z = zzclbVar.mo5593Z();
        if (zzblyVarMo5593Z == null || (jSONObjectZzc = zzblyVarMo5593Z.zzc()) == null) {
            zzclbVar.mo5128a(new JSONObject(), "nativeAdViewSignalsReady");
        } else {
            zzclbVar.mo5128a(jSONObjectZzc, "nativeAdViewSignalsReady");
        }
    }
}
