package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class zzesj extends com.google.android.gms.ads.internal.client.zzbt {

    /* JADX INFO: renamed from: s */
    public final Context f14784s;

    /* JADX INFO: renamed from: t */
    public final com.google.android.gms.ads.internal.client.zzbh f14785t;

    /* JADX INFO: renamed from: u */
    public final zzflg f14786u;

    /* JADX INFO: renamed from: v */
    public final zzcvs f14787v;

    /* JADX INFO: renamed from: w */
    public final FrameLayout f14788w;

    /* JADX INFO: renamed from: x */
    public final zzdzt f14789x;

    public zzesj(Context context, com.google.android.gms.ads.internal.client.zzbh zzbhVar, zzflg zzflgVar, zzcvs zzcvsVar, zzdzt zzdztVar) {
        this.f14784s = context;
        this.f14785t = zzbhVar;
        this.f14786u = zzflgVar;
        this.f14787v = zzcvsVar;
        this.f14789x = zzdztVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View view = ((zzcvv) zzcvsVar).f11586m;
        com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(mo2855g().f3259u);
        frameLayout.setMinimumWidth(mo2855g().f3262x);
        this.f14788w = frameLayout;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: A1 */
    public final void mo2864A1(com.google.android.gms.ads.internal.client.zzx zzxVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: C */
    public final boolean mo2865C() {
        zzcvs zzcvsVar = this.f14787v;
        return zzcvsVar != null && zzcvsVar.f11760b.f15949q0;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: D3 */
    public final void mo2841D3(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3072e("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: E1 */
    public final void mo2866E1() {
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3072e("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: F0 */
    public final void mo2842F0(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        zzetk zzetkVar = this.f14786u.f16039c;
        if (zzetkVar != null) {
            zzetkVar.m6352g(zzclVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: G2 */
    public final void mo2843G2(boolean z) {
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3072e("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: I3 */
    public final void mo2844I3(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: M0 */
    public final void mo2869M0(zzccc zzcccVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: M3 */
    public final void mo2845M3(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3072e("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: P */
    public final long mo2846P() {
        zzdbv zzdbvVar;
        zzcvs zzcvsVar = this.f14787v;
        if (zzcvsVar == null || (zzdbvVar = zzcvsVar.f11768j) == null) {
            return 0L;
        }
        return zzdbvVar.f11972a.get();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: U0 */
    public final void mo2847U0(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: W3 */
    public final void mo2848W3(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3072e("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: Y0 */
    public final void mo2849Y0(long j2) {
        zzdbv zzdbvVar = this.f14787v.f11768j;
        if (zzdbvVar != null) {
            zzdbvVar.m5891a(j2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: Y2 */
    public final void mo2870Y2(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: Z */
    public final boolean mo2850Z(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3072e("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: Z0 */
    public final void mo2851Z0(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: b */
    public final void mo2852b() {
        Preconditions.m3540d("destroy must be called on the main UI thread.");
        zzddy zzddyVar = this.f14787v.f11761c;
        zzddyVar.getClass();
        zzddyVar.m5923J0(new zzddx(null));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: c */
    public final void mo2853c() {
        Preconditions.m3540d("destroy must be called on the main UI thread.");
        zzddy zzddyVar = this.f14787v.f11761c;
        zzddyVar.getClass();
        zzddyVar.m5923J0(new zzddv(null));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: c2 */
    public final void mo2854c2(zzbgt zzbgtVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: d */
    public final boolean mo2871d() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: e */
    public final void mo2872e() {
        this.f14787v.mo5854k();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: g */
    public final com.google.android.gms.ads.internal.client.zzr mo2855g() {
        Preconditions.m3540d("getAdSize must be called on the main UI thread.");
        return zzflm.m6490a(this.f14784s, Collections.singletonList(this.f14787v.mo5850g()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: g1 */
    public final void mo2874g1(zzbjs zzbjsVar) {
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3072e("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: h */
    public final String mo2875h() {
        zzdcs zzdcsVar = this.f14787v.f11764f;
        if (zzdcsVar != null) {
            return zzdcsVar.f12046s;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: k */
    public final String mo2856k() {
        return this.f14786u.f16043g;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: l3 */
    public final void mo2877l3(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3072e("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: n */
    public final String mo2878n() {
        zzdcs zzdcsVar = this.f14787v.f11764f;
        if (zzdcsVar != null) {
            return zzdcsVar.f12046s;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: o2 */
    public final void mo2857o2(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        Preconditions.m3540d("setAdSize must be called on the main UI thread.");
        zzcvs zzcvsVar = this.f14787v;
        if (zzcvsVar != null) {
            zzcvsVar.mo5848d(this.f14788w, zzrVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: r */
    public final com.google.android.gms.ads.internal.client.zzdx mo2858r() {
        return this.f14787v.f11764f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: t */
    public final boolean mo2879t() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: v */
    public final com.google.android.gms.ads.internal.client.zzcl mo2859v() {
        return this.f14786u.f16051o;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: w */
    public final com.google.android.gms.ads.internal.client.zzea mo2860w() {
        return this.f14787v.mo5849f();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: x3 */
    public final void mo2861x3(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8417Yc)).booleanValue()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3072e("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        zzetk zzetkVar = this.f14786u.f16039c;
        if (zzetkVar != null) {
            try {
                if (!zzdqVar.mo2912b()) {
                    this.f14789x.m6112b();
                }
            } catch (RemoteException e) {
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3069b("Error in making CSI ping for reporting paid event callback", e);
            }
            zzetkVar.f14842u.set(zzdqVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: z */
    public final com.google.android.gms.ads.internal.client.zzbh mo2862z() {
        return this.f14785t;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: z3 */
    public final void mo2863z3(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzb() {
        return new ObjectWrapper(this.f14788w);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzc() {
        Preconditions.m3540d("destroy must be called on the main UI thread.");
        zzddy zzddyVar = this.f14787v.f11761c;
        zzddyVar.getClass();
        zzddyVar.m5923J0(new zzddw(null));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzk() {
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3072e("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: H */
    public final void mo2867H() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: L */
    public final void mo2868L() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: f */
    public final void mo2873f() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: i */
    public final void mo2876i() {
    }
}
