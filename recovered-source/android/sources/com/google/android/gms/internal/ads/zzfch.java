package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfch implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final boolean f15404a;

    /* JADX INFO: renamed from: b */
    public final boolean f15405b;

    /* JADX INFO: renamed from: c */
    public final String f15406c;

    /* JADX INFO: renamed from: d */
    public final boolean f15407d;

    /* JADX INFO: renamed from: e */
    public final int f15408e;

    /* JADX INFO: renamed from: f */
    public final int f15409f;

    /* JADX INFO: renamed from: g */
    public final int f15410g;

    /* JADX INFO: renamed from: h */
    public final String f15411h;

    public zzfch(boolean z, boolean z2, String str, boolean z3, int i2, int i3, int i4, String str2) {
        this.f15404a = z;
        this.f15405b = z2;
        this.f15406c = str;
        this.f15407d = z3;
        this.f15408e = i2;
        this.f15409f = i3;
        this.f15410g = i4;
        this.f15411h = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final void mo6399b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.f15406c);
        bundle.putBoolean("is_nonagon", true);
        zzbio zzbioVar = zzbix.f8058D4;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        bundle.putString("extra_caps", (String) zzbaVar.f3098c.m5030a(zzbioVar));
        bundle.putInt("target_api", this.f15408e);
        bundle.putInt("dv", this.f15409f);
        bundle.putInt("lv", this.f15410g);
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8281Q6)).booleanValue()) {
            String str = this.f15411h;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("ev", str);
            }
        }
        Bundle bundleM6493a = zzflv.m6493a(bundle, "sdk_env");
        bundleM6493a.putBoolean("mf", ((Boolean) zzbkx.f9065g.m5057c()).booleanValue());
        bundleM6493a.putBoolean("instant_app", this.f15404a);
        bundleM6493a.putBoolean("lite", this.f15405b);
        bundleM6493a.putBoolean("is_privileged_process", this.f15407d);
        bundle.putBundle("sdk_env", bundleM6493a);
        Bundle bundleM6493a2 = zzflv.m6493a(bundleM6493a, "build_meta");
        bundleM6493a2.putString("cl", "910357297");
        bundleM6493a2.putString("rapid_rc", "dev");
        bundleM6493a2.putString("rapid_rollup", "HEAD");
        bundleM6493a.putBundle("build_meta", bundleM6493a2);
    }
}
