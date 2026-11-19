package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdqf extends zzdqg {

    /* JADX INFO: renamed from: b */
    public final JSONObject f12635b;

    /* JADX INFO: renamed from: c */
    public final boolean f12636c;

    /* JADX INFO: renamed from: d */
    public final boolean f12637d;

    /* JADX INFO: renamed from: e */
    public final boolean f12638e;

    /* JADX INFO: renamed from: f */
    public final boolean f12639f;

    /* JADX INFO: renamed from: g */
    public final String f12640g;

    /* JADX INFO: renamed from: h */
    public final JSONObject f12641h;

    public zzdqf(zzfkn zzfknVar, JSONObject jSONObject) {
        super(zzfknVar);
        String[] strArr = {"tracking_urls_and_actions", "active_view"};
        JSONObject jSONObjectM3127k = com.google.android.gms.ads.internal.util.zzbp.m3127k(jSONObject, strArr);
        this.f12635b = jSONObjectM3127k == null ? null : jSONObjectM3127k.optJSONObject(strArr[1]);
        String[] strArr2 = {"allow_pub_owned_ad_view"};
        JSONObject jSONObjectM3127k2 = com.google.android.gms.ads.internal.util.zzbp.m3127k(jSONObject, strArr2);
        this.f12636c = jSONObjectM3127k2 == null ? false : jSONObjectM3127k2.optBoolean(strArr2[0], false);
        String[] strArr3 = {"attribution", "allow_pub_rendering"};
        JSONObject jSONObjectM3127k3 = com.google.android.gms.ads.internal.util.zzbp.m3127k(jSONObject, strArr3);
        this.f12637d = jSONObjectM3127k3 == null ? false : jSONObjectM3127k3.optBoolean(strArr3[1], false);
        String[] strArr4 = {"enable_omid"};
        JSONObject jSONObjectM3127k4 = com.google.android.gms.ads.internal.util.zzbp.m3127k(jSONObject, strArr4);
        this.f12638e = jSONObjectM3127k4 == null ? false : jSONObjectM3127k4.optBoolean(strArr4[0], false);
        String[] strArr5 = {"watermark_overlay_png_base64"};
        JSONObject jSONObjectM3127k5 = com.google.android.gms.ads.internal.util.zzbp.m3127k(jSONObject, strArr5);
        this.f12640g = jSONObjectM3127k5 != null ? jSONObjectM3127k5.optString(strArr5[0], "") : "";
        this.f12639f = jSONObject.optJSONObject("overlay") != null;
        this.f12641h = jSONObject.optJSONObject("omid_settings");
    }

    @Override // com.google.android.gms.internal.ads.zzdqg
    /* JADX INFO: renamed from: a */
    public final boolean mo6014a() {
        return this.f12639f;
    }

    @Override // com.google.android.gms.internal.ads.zzdqg
    /* JADX INFO: renamed from: b */
    public final boolean mo6015b() {
        return this.f12636c;
    }

    @Override // com.google.android.gms.internal.ads.zzdqg
    /* JADX INFO: renamed from: c */
    public final boolean mo6016c() {
        return this.f12638e;
    }

    @Override // com.google.android.gms.internal.ads.zzdqg
    /* JADX INFO: renamed from: d */
    public final boolean mo6017d() {
        return this.f12637d;
    }

    @Override // com.google.android.gms.internal.ads.zzdqg
    /* JADX INFO: renamed from: e */
    public final String mo6018e() {
        return this.f12640g;
    }

    @Override // com.google.android.gms.internal.ads.zzdqg
    /* JADX INFO: renamed from: f */
    public final zzflj mo6019f() {
        JSONObject jSONObject = this.f12641h;
        return jSONObject != null ? new zzflj(jSONObject) : this.f12642a.f15911V;
    }
}
