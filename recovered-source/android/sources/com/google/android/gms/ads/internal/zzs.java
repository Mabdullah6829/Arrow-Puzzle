package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzcp;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.client.zzfw;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzbkj;
import com.google.android.gms.internal.ads.zzccc;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzs extends zzbt {

    /* JADX INFO: renamed from: s */
    public final VersionInfoParcel f3691s;

    /* JADX INFO: renamed from: t */
    public final com.google.android.gms.ads.internal.client.zzr f3692t;

    /* JADX INFO: renamed from: u */
    public final Context f3693u;

    /* JADX INFO: renamed from: v */
    public final zzr f3694v;

    /* JADX INFO: renamed from: w */
    public WebView f3695w;

    /* JADX INFO: renamed from: x */
    public zzbh f3696x;

    /* JADX INFO: renamed from: y */
    public AsyncTask f3697y;

    public zzs(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, VersionInfoParcel versionInfoParcel) {
        this.f3693u = context;
        this.f3691s = versionInfoParcel;
        this.f3692t = zzrVar;
        this.f3695w = new WebView(context);
        this.f3694v = new zzr(context, str);
        m3271k4(0);
        this.f3695w.setVerticalScrollBarEnabled(false);
        this.f3695w.getSettings().setJavaScriptEnabled(true);
        this.f3695w.setWebViewClient(new zzo(this));
        this.f3695w.setOnTouchListener(new zzp());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: A1 */
    public final void mo2864A1(zzx zzxVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: C */
    public final boolean mo2865C() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: D3 */
    public final void mo2841D3(zzfw zzfwVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: E1 */
    public final void mo2866E1() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: F0 */
    public final void mo2842F0(zzcl zzclVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: G2 */
    public final void mo2843G2(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: H */
    public final void mo2867H() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: I3 */
    public final void mo2844I3(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: L */
    public final void mo2868L() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: M0 */
    public final void mo2869M0(zzccc zzcccVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: M3 */
    public final void mo2845M3(zzbh zzbhVar) {
        this.f3696x = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: P */
    public final long mo2846P() {
        return 0L;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: U0 */
    public final void mo2847U0(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: W3 */
    public final void mo2848W3(zzbe zzbeVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: Y0 */
    public final void mo2849Y0(long j2) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: Y2 */
    public final void mo2870Y2(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: Z */
    public final boolean mo2850Z(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Preconditions.m3545i(this.f3695w, "This Search Ad has already been torn down");
        zzr zzrVar = this.f3694v;
        TreeMap treeMap = zzrVar.f3687c;
        zzft zzftVar = zzmVar.f3207B;
        if (zzftVar != null) {
            zzrVar.f3688d = zzftVar.f3196s;
        }
        Bundle bundle = zzmVar.f3210E;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) zzbkj.f8978c.m5057c();
            for (String str2 : bundle2.keySet()) {
                if (str.equals(str2)) {
                    zzrVar.f3689e = bundle2.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    treeMap.put(str2.substring(4), bundle2.getString(str2));
                }
            }
            treeMap.put("SDKVersion", this.f3691s.f3396s);
            if (((Boolean) zzbkj.f8976a.m5057c()).booleanValue()) {
                Bundle bundleM3089b = zzac.m3089b(zzrVar.f3685a, (String) zzbkj.f8977b.m5057c());
                for (String str3 : bundleM3089b.keySet()) {
                    treeMap.put(str3, bundleM3089b.get(str3).toString());
                }
            }
        }
        this.f3697y = new zzq(this).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: Z0 */
    public final void mo2851Z0(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: b */
    public final void mo2852b() {
        Preconditions.m3540d("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: c */
    public final void mo2853c() {
        Preconditions.m3540d("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: c2 */
    public final void mo2854c2(zzbgt zzbgtVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: d */
    public final boolean mo2871d() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: e */
    public final void mo2872e() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: f */
    public final void mo2873f() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: g */
    public final com.google.android.gms.ads.internal.client.zzr mo2855g() {
        return this.f3692t;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: g1 */
    public final void mo2874g1(zzbjs zzbjsVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: h */
    public final String mo2875h() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: i */
    public final void mo2876i() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: k */
    public final String mo2856k() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3271k4(int i2) {
        if (this.f3695w == null) {
            return;
        }
        this.f3695w.setLayoutParams(new ViewGroup.LayoutParams(-1, i2));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: l3 */
    public final void mo2877l3(zzcp zzcpVar) {
        throw new IllegalStateException("Unused method");
    }

    /* JADX INFO: renamed from: l4 */
    public final String m3272l4() {
        String str = this.f3694v.f3689e;
        if (true == TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        String str2 = (String) zzbkj.f8979d.m5057c();
        return AbstractC1456a.m2450q(new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length()), "https://", str, str2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: n */
    public final String mo2878n() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: o2 */
    public final void mo2857o2(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: r */
    public final zzdx mo2858r() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: t */
    public final boolean mo2879t() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: v */
    public final zzcl mo2859v() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: w */
    public final zzea mo2860w() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: x3 */
    public final void mo2861x3(zzdq zzdqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: z */
    public final zzbh mo2862z() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: z3 */
    public final void mo2863z3(zzcs zzcsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzb() {
        Preconditions.m3540d("getAdFrame must be called on the main UI thread.");
        return new ObjectWrapper(this.f3695w);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzc() {
        Preconditions.m3540d("destroy must be called on the main UI thread.");
        this.f3697y.cancel(true);
        this.f3695w.destroy();
        this.f3695w = null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzk() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl() {
        throw new IllegalStateException("Unused method");
    }
}
