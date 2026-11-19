package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzbot implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5095a(Object obj, Map map) {
        JSONObject jSONObjectMo5063d;
        zzclb zzclbVar = (zzclb) obj;
        zzbly zzblyVarMo5593Z = zzclbVar.mo5593Z();
        if (zzblyVarMo5593Z == null || (jSONObjectMo5063d = zzblyVarMo5593Z.mo5063d()) == null) {
            zzclbVar.mo5128a(new JSONObject(), "nativeClickMetaReady");
        } else {
            zzclbVar.mo5128a(jSONObjectMo5063d, "nativeClickMetaReady");
        }
    }
}
