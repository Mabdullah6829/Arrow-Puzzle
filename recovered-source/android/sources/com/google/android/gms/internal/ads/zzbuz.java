package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzbuz implements zzbqn {

    /* JADX INFO: renamed from: a */
    public final zzcgd f9424a;

    public zzbuz(zzbvb zzbvbVar, zzcgd zzcgdVar) {
        this.f9424a = zzcgdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    /* JADX INFO: renamed from: m */
    public final void mo5113m(String str) {
        zzcgd zzcgdVar = this.f9424a;
        try {
            if (str == null) {
                zzcgdVar.m5398b(new zzbue());
            } else {
                zzcgdVar.m5398b(new zzbue(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    /* JADX INFO: renamed from: n */
    public final void mo5114n(JSONObject jSONObject) {
        zzcgd zzcgdVar = this.f9424a;
        try {
            zzcgdVar.m5397a(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            zzcgdVar.m5398b(e);
        }
    }
}
