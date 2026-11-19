package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfdb implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final boolean f15453a;

    /* JADX INFO: renamed from: b */
    public final boolean f15454b;

    /* JADX INFO: renamed from: c */
    public final String f15455c;

    /* JADX INFO: renamed from: d */
    public final boolean f15456d;

    /* JADX INFO: renamed from: e */
    public final boolean f15457e;

    /* JADX INFO: renamed from: f */
    public final boolean f15458f;

    /* JADX INFO: renamed from: g */
    public final String f15459g;

    /* JADX INFO: renamed from: h */
    public final String f15460h;

    /* JADX INFO: renamed from: i */
    public final String f15461i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f15462j;

    /* JADX INFO: renamed from: k */
    public final String f15463k;

    /* JADX INFO: renamed from: l */
    public final String f15464l;

    /* JADX INFO: renamed from: m */
    public final boolean f15465m;

    /* JADX INFO: renamed from: n */
    public final long f15466n;

    /* JADX INFO: renamed from: o */
    public final boolean f15467o;

    /* JADX INFO: renamed from: p */
    public final String f15468p;

    /* JADX INFO: renamed from: q */
    public final int f15469q;

    /* JADX INFO: renamed from: r */
    public final String f15470r;

    public zzfdb(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList arrayList, String str3, String str4, boolean z6, long j2, boolean z7, String str5, int i2, String str6, String str7, String str8) {
        String str9 = Build.FINGERPRINT;
        String str10 = Build.MODEL;
        this.f15453a = z;
        this.f15454b = z2;
        this.f15455c = str;
        this.f15456d = z3;
        this.f15457e = z4;
        this.f15458f = z5;
        this.f15459g = str2;
        this.f15460h = str6;
        this.f15462j = arrayList;
        this.f15463k = str3;
        this.f15464l = str4;
        this.f15465m = z6;
        this.f15466n = j2;
        this.f15467o = z7;
        this.f15468p = str5;
        this.f15469q = i2;
        this.f15470r = str8;
        this.f15461i = str7;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final void mo6399b(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.f15453a);
        bundle.putBoolean("coh", this.f15454b);
        bundle.putString("gl", this.f15455c);
        bundle.putBoolean("simulator", this.f15456d);
        bundle.putBoolean("is_latchsky", this.f15457e);
        bundle.putInt("build_api_level", this.f15469q);
        zzbio zzbioVar = zzbix.f8805vc;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        if (!((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f15458f);
        }
        bundle.putString("hl", this.f15459g);
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8339Te)).booleanValue() || ((Boolean) zzbivVar2.m5030a(zzbix.f8355Ue)).booleanValue()) {
            bundle.putString("dlc", this.f15460h);
        }
        ArrayList<String> arrayList = this.f15462j;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        String str2 = this.f15461i;
        if (str2 != null) {
            bundle.putString("dgl", str2);
        }
        bundle.putString("mv", this.f15463k);
        bundle.putString("submodel", Build.MODEL);
        Bundle bundleM6493a = zzflv.m6493a(bundle, "device");
        bundle.putBundle("device", bundleM6493a);
        bundleM6493a.putString("build", Build.FINGERPRINT);
        bundleM6493a.putLong("remaining_data_partition_space", this.f15466n);
        Bundle bundleM6493a2 = zzflv.m6493a(bundleM6493a, "browser");
        bundleM6493a.putBundle("browser", bundleM6493a2);
        bundleM6493a2.putBoolean("is_browser_custom_tabs_capable", this.f15465m);
        String str3 = this.f15464l;
        if (!TextUtils.isEmpty(str3)) {
            Bundle bundleM6493a3 = zzflv.m6493a(bundleM6493a, "play_store");
            bundleM6493a.putBundle("play_store", bundleM6493a3);
            bundleM6493a3.putString("package_version", str3);
        }
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8202Lc)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f15467o);
        }
        String str4 = this.f15468p;
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("v_unity", str4);
        }
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8100Fc)).booleanValue()) {
            zzflv.m6496d(bundle, "gotmt_l", true, ((Boolean) zzbivVar2.m5030a(zzbix.f8049Cc)).booleanValue());
            zzflv.m6496d(bundle, "gotmt_i", true, ((Boolean) zzbivVar2.m5030a(zzbix.f8032Bc)).booleanValue());
        }
        if (!((Boolean) zzbivVar2.m5030a(zzbix.f8188Kf)).booleanValue() || (str = this.f15470r) == null) {
            return;
        }
        bundle.putString("sdk_i_s", str);
    }
}
