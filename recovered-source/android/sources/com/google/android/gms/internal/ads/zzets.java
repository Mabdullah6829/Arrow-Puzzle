package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzets extends com.google.android.gms.ads.internal.client.zzbt {

    /* JADX INFO: renamed from: A */
    public final zzdzt f14854A;

    /* JADX INFO: renamed from: B */
    public zzdmh f14855B;

    /* JADX INFO: renamed from: C */
    public boolean f14856C;

    /* JADX INFO: renamed from: s */
    public final com.google.android.gms.ads.internal.client.zzr f14857s;

    /* JADX INFO: renamed from: t */
    public final Context f14858t;

    /* JADX INFO: renamed from: u */
    public final zzfiq f14859u;

    /* JADX INFO: renamed from: v */
    public final String f14860v;

    /* JADX INFO: renamed from: w */
    public final VersionInfoParcel f14861w;

    /* JADX INFO: renamed from: x */
    public final zzetk f14862x;

    /* JADX INFO: renamed from: y */
    public final zzfjr f14863y;

    /* JADX INFO: renamed from: z */
    public final zzbaw f14864z;

    public zzets(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzfiq zzfiqVar, zzetk zzetkVar, zzfjr zzfjrVar, VersionInfoParcel versionInfoParcel, zzbaw zzbawVar, zzdzt zzdztVar) {
        this.f14857s = zzrVar;
        this.f14860v = str;
        this.f14858t = context;
        this.f14859u = zzfiqVar;
        this.f14862x = zzetkVar;
        this.f14863y = zzfjrVar;
        this.f14861w = versionInfoParcel;
        zzbio zzbioVar = zzbix.f8641m1;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (!((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() || Build.VERSION.SDK_INT < 35) {
            this.f14856C = ((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8624l1)).booleanValue();
        } else {
            this.f14856C = true;
        }
        this.f14864z = zzbawVar;
        this.f14854A = zzdztVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: A1 */
    public final void mo2864A1(com.google.android.gms.ads.internal.client.zzx zzxVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: C */
    public final synchronized boolean mo2865C() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: D3 */
    public final void mo2841D3(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: E1 */
    public final void mo2866E1() {
        Preconditions.m3540d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: F0 */
    public final void mo2842F0(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        Preconditions.m3540d("setAppEventListener must be called on the main UI thread.");
        this.f14862x.m6352g(zzclVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: G2 */
    public final void mo2843G2(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: I3 */
    public final synchronized void mo2844I3(IObjectWrapper iObjectWrapper) {
        if (this.f14855B == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Interstitial can not be shown before loaded.");
            this.f14862x.mo5837j(zzfmi.m6535d(9, null, null));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8040C3)).booleanValue()) {
                this.f14864z.f7501b.mo3258e(new Throwable().getStackTrace());
            }
            this.f14855B.m5938c((Activity) ObjectWrapper.m3697u0(iObjectWrapper), this.f14856C);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: M0 */
    public final void mo2869M0(zzccc zzcccVar) {
        this.f14863y.f15813w.set(zzcccVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: M3 */
    public final void mo2845M3(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        Preconditions.m3540d("setAdListener must be called on the main UI thread.");
        this.f14862x.f14840s.set(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: P */
    public final synchronized long mo2846P() {
        zzdbv zzdbvVar;
        zzdmh zzdmhVar = this.f14855B;
        if (zzdmhVar == null || (zzdbvVar = zzdmhVar.f11768j) == null) {
            return 0L;
        }
        return zzdbvVar.f11972a.get();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: U0 */
    public final void mo2847U0(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.f14862x.f14843v.set(zzbkVar);
        mo2850Z(zzmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: W3 */
    public final void mo2848W3(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: Y0 */
    public final synchronized void mo2849Y0(long j2) {
        zzdbv zzdbvVar;
        zzdmh zzdmhVar = this.f14855B;
        if (zzdmhVar == null || (zzdbvVar = zzdmhVar.f11768j) == null) {
            return;
        }
        zzdbvVar.m5891a(j2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: Y2 */
    public final void mo2870Y2(String str) {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: Z */
    public final synchronized boolean mo2850Z(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        boolean z;
        try {
            if (!zzmVar.m2976H()) {
                if (((Boolean) zzbkv.f9047i.m5057c()).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8049Cc)).booleanValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (this.f14861w.f3398u < ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8066Dc)).intValue() || !z) {
                    Preconditions.m3540d("loadAd must be called on the main UI thread.");
                }
            }
            com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
            Context context = this.f14858t;
            if (com.google.android.gms.ads.internal.util.zzs.m3209h(context) && zzmVar.f3216K == null) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3070c("Failed to load the ad because app ID is missing.");
                zzetk zzetkVar = this.f14862x;
                if (zzetkVar != null) {
                    zzetkVar.mo5830v(zzfmi.m6535d(4, null, null));
                }
            } else if (!m6354k4()) {
                zzfmd.m6527b(context, zzmVar.f3232x);
                this.f14855B = null;
                return this.f14859u.m6462a(zzmVar, this.f14860v, new zzfij(this.f14857s), new zzetr(this));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: Z0 */
    public final synchronized void mo2851Z0(boolean z) {
        Preconditions.m3540d("setImmersiveMode must be called on the main UI thread.");
        this.f14856C = z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: b */
    public final synchronized void mo2852b() {
        Preconditions.m3540d("pause must be called on the main UI thread.");
        zzdmh zzdmhVar = this.f14855B;
        if (zzdmhVar != null) {
            zzddy zzddyVar = zzdmhVar.f11761c;
            zzddyVar.getClass();
            zzddyVar.m5923J0(new zzddx(null));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: c */
    public final synchronized void mo2853c() {
        Preconditions.m3540d("resume must be called on the main UI thread.");
        zzdmh zzdmhVar = this.f14855B;
        if (zzdmhVar != null) {
            zzddy zzddyVar = zzdmhVar.f11761c;
            zzddyVar.getClass();
            zzddyVar.m5923J0(new zzddv(null));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: c2 */
    public final void mo2854c2(zzbgt zzbgtVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: d */
    public final synchronized boolean mo2871d() {
        Preconditions.m3540d("isLoaded must be called on the main UI thread.");
        return m6354k4();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: e */
    public final void mo2872e() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: g */
    public final com.google.android.gms.ads.internal.client.zzr mo2855g() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: g1 */
    public final synchronized void mo2874g1(zzbjs zzbjsVar) {
        Preconditions.m3540d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f14859u.f15767f = zzbjsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: h */
    public final synchronized String mo2875h() {
        zzdcs zzdcsVar;
        zzdmh zzdmhVar = this.f14855B;
        if (zzdmhVar == null || (zzdcsVar = zzdmhVar.f11764f) == null) {
            return null;
        }
        return zzdcsVar.f12046s;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: k */
    public final synchronized String mo2856k() {
        return this.f14860v;
    }

    /* JADX INFO: renamed from: k4 */
    public final synchronized boolean m6354k4() {
        zzdmh zzdmhVar = this.f14855B;
        return (zzdmhVar == null || zzdmhVar.f12337p.f11796t.get()) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: l3 */
    public final void mo2877l3(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: n */
    public final synchronized String mo2878n() {
        zzdcs zzdcsVar;
        zzdmh zzdmhVar = this.f14855B;
        if (zzdmhVar == null || (zzdcsVar = zzdmhVar.f11764f) == null) {
            return null;
        }
        return zzdcsVar.f12046s;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: o2 */
    public final void mo2857o2(com.google.android.gms.ads.internal.client.zzr zzrVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: r */
    public final synchronized com.google.android.gms.ads.internal.client.zzdx mo2858r() {
        zzdmh zzdmhVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8095F7)).booleanValue() && (zzdmhVar = this.f14855B) != null) {
            return zzdmhVar.f11764f;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: t */
    public final synchronized boolean mo2879t() {
        return this.f14859u.m6463b();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: v */
    public final com.google.android.gms.ads.internal.client.zzcl mo2859v() {
        com.google.android.gms.ads.internal.client.zzcl zzclVar;
        zzetk zzetkVar = this.f14862x;
        synchronized (zzetkVar) {
            zzclVar = (com.google.android.gms.ads.internal.client.zzcl) zzetkVar.f14841t.get();
        }
        return zzclVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: w */
    public final com.google.android.gms.ads.internal.client.zzea mo2860w() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: x3 */
    public final void mo2861x3(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Preconditions.m3540d("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdqVar.mo2912b()) {
                this.f14854A.m6112b();
            }
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3069b("Error in making CSI ping for reporting paid event callback", e);
        }
        this.f14862x.f14842u.set(zzdqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: z */
    public final com.google.android.gms.ads.internal.client.zzbh mo2862z() {
        return this.f14862x.m6351d();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: z3 */
    public final void mo2863z3(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.f14862x.f14844w.set(zzcsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzb() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzc() {
        Preconditions.m3540d("destroy must be called on the main UI thread.");
        zzdmh zzdmhVar = this.f14855B;
        if (zzdmhVar != null) {
            zzddy zzddyVar = zzdmhVar.f11761c;
            zzddyVar.getClass();
            zzddyVar.m5923J0(new zzddw(null));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzk() {
        Preconditions.m3540d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzl() {
        Preconditions.m3540d("showInterstitial must be called on the main UI thread.");
        if (this.f14855B == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Interstitial can not be shown before loaded.");
            this.f14862x.mo5837j(zzfmi.m6535d(9, null, null));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8040C3)).booleanValue()) {
                this.f14864z.f7501b.mo3258e(new Throwable().getStackTrace());
            }
            this.f14855B.m5938c(null, this.f14856C);
        }
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
