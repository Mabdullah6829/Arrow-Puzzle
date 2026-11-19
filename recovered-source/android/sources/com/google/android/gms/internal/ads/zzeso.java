package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeso extends com.google.android.gms.ads.internal.client.zzbt implements zzdfv {

    /* JADX INFO: renamed from: A */
    public zzcvs f14802A;

    /* JADX INFO: renamed from: s */
    public final Context f14803s;

    /* JADX INFO: renamed from: t */
    public final zzfha f14804t;

    /* JADX INFO: renamed from: u */
    public final String f14805u;

    /* JADX INFO: renamed from: v */
    public final zzetk f14806v;

    /* JADX INFO: renamed from: w */
    public com.google.android.gms.ads.internal.client.zzr f14807w;

    /* JADX INFO: renamed from: x */
    public final zzflf f14808x;

    /* JADX INFO: renamed from: y */
    public final VersionInfoParcel f14809y;

    /* JADX INFO: renamed from: z */
    public final zzdzt f14810z;

    public zzeso(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzfha zzfhaVar, zzetk zzetkVar, VersionInfoParcel versionInfoParcel, zzdzt zzdztVar) {
        this.f14803s = context;
        this.f14804t = zzfhaVar;
        this.f14807w = zzrVar;
        this.f14805u = str;
        this.f14806v = zzetkVar;
        this.f14808x = zzfhaVar.f15679k;
        this.f14809y = versionInfoParcel;
        this.f14810z = zzdztVar;
        zzfhaVar.f15676h.m5924Y(this, zzfhaVar.f15670b);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: A1 */
    public final void mo2864A1(com.google.android.gms.ads.internal.client.zzx zzxVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: C */
    public final synchronized boolean mo2865C() {
        zzcvs zzcvsVar = this.f14802A;
        return zzcvsVar != null && zzcvsVar.f11760b.f15949q0;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: D3 */
    public final synchronized void mo2841D3(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
        try {
            if (m6336l4()) {
                Preconditions.m3540d("setVideoOptions must be called on the main UI thread.");
            }
            this.f14808x.f16016d = zzfwVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: E1 */
    public final void mo2866E1() {
        Preconditions.m3540d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: F0 */
    public final void mo2842F0(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        if (m6336l4()) {
            Preconditions.m3540d("setAppEventListener must be called on the main UI thread.");
        }
        this.f14806v.m6352g(zzclVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: G2 */
    public final synchronized void mo2843G2(boolean z) {
        try {
            if (m6336l4()) {
                Preconditions.m3540d("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.f14808x.f16017e = z;
        } catch (Throwable th) {
            throw th;
        }
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
        if (m6336l4()) {
            Preconditions.m3540d("setAdListener must be called on the main UI thread.");
        }
        this.f14806v.f14840s.set(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: P */
    public final synchronized long mo2846P() {
        zzdbv zzdbvVar;
        zzcvs zzcvsVar = this.f14802A;
        return (zzcvsVar == null || (zzdbvVar = zzcvsVar.f11768j) == null) ? this.f14808x.f16033u.get() : zzdbvVar.f11972a.get();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: U0 */
    public final void mo2847U0(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: W3 */
    public final void mo2848W3(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        if (m6336l4()) {
            Preconditions.m3540d("setAdListener must be called on the main UI thread.");
        }
        zzeto zzetoVar = this.f14804t.f15673e;
        synchronized (zzetoVar) {
            zzetoVar.f14851s = zzbeVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: Y0 */
    public final synchronized void mo2849Y0(long j2) {
        zzdbv zzdbvVar;
        this.f14808x.f16033u.set(j2);
        zzcvs zzcvsVar = this.f14802A;
        if (zzcvsVar == null || (zzdbvVar = zzcvsVar.f11768j) == null) {
            return;
        }
        zzdbvVar.m5891a(j2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: Y2 */
    public final void mo2870Y2(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: Z */
    public final synchronized boolean mo2850Z(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.f14807w;
        synchronized (this) {
            zzflf zzflfVar = this.f14808x;
            zzflfVar.f16014b = zzrVar;
            zzflfVar.f16029q = this.f14807w.f3254F;
        }
        return m6335k4(zzmVar);
        return m6335k4(zzmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: Z0 */
    public final void mo2851Z0(boolean z) {
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: b */
    public final synchronized void mo2852b() {
        try {
            if (((Boolean) zzbkv.f9045g.m5057c()).booleanValue()) {
                zzbio zzbioVar = zzbix.f8015Ac;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                    if (this.f14809y.f3398u < ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8083Ec)).intValue()) {
                        Preconditions.m3540d("pause must be called on the main UI thread.");
                    }
                } else {
                    Preconditions.m3540d("pause must be called on the main UI thread.");
                }
            } else {
                Preconditions.m3540d("pause must be called on the main UI thread.");
            }
            zzcvs zzcvsVar = this.f14802A;
            if (zzcvsVar != null) {
                zzddy zzddyVar = zzcvsVar.f11761c;
                zzddyVar.getClass();
                zzddyVar.m5923J0(new zzddx(null));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: c */
    public final synchronized void mo2853c() {
        try {
            if (((Boolean) zzbkv.f9046h.m5057c()).booleanValue()) {
                zzbio zzbioVar = zzbix.f8856yc;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                    if (this.f14809y.f3398u < ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8083Ec)).intValue()) {
                        Preconditions.m3540d("resume must be called on the main UI thread.");
                    }
                } else {
                    Preconditions.m3540d("resume must be called on the main UI thread.");
                }
            } else {
                Preconditions.m3540d("resume must be called on the main UI thread.");
            }
            zzcvs zzcvsVar = this.f14802A;
            if (zzcvsVar != null) {
                zzddy zzddyVar = zzcvsVar.f11761c;
                zzddyVar.getClass();
                zzddyVar.m5923J0(new zzddv(null));
            }
        } catch (Throwable th) {
            throw th;
        }
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
    public final synchronized void mo2872e() {
        Preconditions.m3540d("recordManualImpression must be called on the main UI thread.");
        zzcvs zzcvsVar = this.f14802A;
        if (zzcvsVar != null) {
            zzcvsVar.mo5854k();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: g */
    public final synchronized com.google.android.gms.ads.internal.client.zzr mo2855g() {
        Preconditions.m3540d("getAdSize must be called on the main UI thread.");
        zzcvs zzcvsVar = this.f14802A;
        if (zzcvsVar != null) {
            return zzflm.m6490a(this.f14803s, Collections.singletonList(zzcvsVar.mo5850g()));
        }
        return this.f14808x.f16014b;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: g1 */
    public final synchronized void mo2874g1(zzbjs zzbjsVar) {
        Preconditions.m3540d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f14804t.f15675g = zzbjsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: h */
    public final synchronized String mo2875h() {
        zzdcs zzdcsVar;
        zzcvs zzcvsVar = this.f14802A;
        if (zzcvsVar == null || (zzdcsVar = zzcvsVar.f11764f) == null) {
            return null;
        }
        return zzdcsVar.f12046s;
    }

    @Override // com.google.android.gms.internal.ads.zzdfv
    /* JADX INFO: renamed from: h2 */
    public final synchronized void mo5914h2() {
        int i2;
        zzfha zzfhaVar = this.f14804t;
        if (zzfhaVar.m6445d()) {
            zzfhaVar.m6444c();
            return;
        }
        zzdif zzdifVar = zzfhaVar.f15678j;
        zzdga zzdgaVar = zzfhaVar.f15676h;
        synchronized (zzdifVar) {
            i2 = zzdifVar.f12209t;
        }
        zzdgaVar.m5917L0(i2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: k */
    public final synchronized String mo2856k() {
        return this.f14805u;
    }

    /* JADX INFO: renamed from: k4 */
    public final synchronized boolean m6335k4(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            if (m6336l4()) {
                Preconditions.m3540d("loadAd must be called on the main UI thread.");
            }
            com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
            Context context = this.f14803s;
            if (!com.google.android.gms.ads.internal.util.zzs.m3209h(context) || zzmVar.f3216K != null) {
                zzfmd.m6527b(context, zzmVar.f3232x);
                return this.f14804t.m6442a(zzmVar, this.f14805u, null, new zzesn(this));
            }
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3070c("Failed to load the ad because app ID is missing.");
            zzetk zzetkVar = this.f14806v;
            if (zzetkVar != null) {
                zzetkVar.mo5830v(zzfmi.m6535d(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: l3 */
    public final synchronized void mo2877l3(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
        Preconditions.m3540d("setCorrelationIdProvider must be called on the main UI thread");
        this.f14808x.f16036x = zzcpVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    /* JADX INFO: renamed from: l4 */
    public final boolean m6336l4() {
        boolean z;
        if (((Boolean) zzbkv.f9044f.m5057c()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8049Cc)).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return this.f14809y.f3398u < ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8066Dc)).intValue() || !z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: n */
    public final synchronized String mo2878n() {
        zzdcs zzdcsVar;
        zzcvs zzcvsVar = this.f14802A;
        if (zzcvsVar == null || (zzdcsVar = zzcvsVar.f11764f) == null) {
            return null;
        }
        return zzdcsVar.f12046s;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: o2 */
    public final synchronized void mo2857o2(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        Preconditions.m3540d("setAdSize must be called on the main UI thread.");
        this.f14808x.f16014b = zzrVar;
        this.f14807w = zzrVar;
        zzcvs zzcvsVar = this.f14802A;
        if (zzcvsVar != null) {
            zzcvsVar.mo5848d(this.f14804t.f15674f, zzrVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: r */
    public final synchronized com.google.android.gms.ads.internal.client.zzdx mo2858r() {
        zzcvs zzcvsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8095F7)).booleanValue() && (zzcvsVar = this.f14802A) != null) {
            return zzcvsVar.f11764f;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: t */
    public final synchronized boolean mo2879t() {
        return this.f14804t.m6443b();
    }

    @Override // com.google.android.gms.internal.ads.zzdfv
    /* JADX INFO: renamed from: u */
    public final synchronized void mo5915u() {
        int i2;
        try {
            if (!this.f14804t.m6445d()) {
                zzfha zzfhaVar = this.f14804t;
                zzdif zzdifVar = zzfhaVar.f15678j;
                zzdga zzdgaVar = zzfhaVar.f15676h;
                synchronized (zzdifVar) {
                    i2 = zzdifVar.f12208s;
                }
                zzdgaVar.m5916K0(i2);
                return;
            }
            zzflf zzflfVar = this.f14808x;
            com.google.android.gms.ads.internal.client.zzr zzrVarM6490a = zzflfVar.f16014b;
            zzcvs zzcvsVar = this.f14802A;
            if (zzcvsVar != null && zzflfVar.f16029q) {
                zzrVarM6490a = zzflm.m6490a(this.f14803s, Collections.singletonList(zzcvsVar.mo5851h()));
            }
            synchronized (this) {
                zzflf zzflfVar2 = this.f14808x;
                zzflfVar2.f16014b = zzrVarM6490a;
                zzflfVar2.f16029q = this.f14807w.f3254F;
                zzflfVar.f16028p = true;
                try {
                    m6335k4(zzflfVar.f16013a);
                } catch (RemoteException unused) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("Failed to refresh the banner ad.");
                }
                this.f14808x.f16028p = false;
            }
            return;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: v */
    public final com.google.android.gms.ads.internal.client.zzcl mo2859v() {
        com.google.android.gms.ads.internal.client.zzcl zzclVar;
        zzetk zzetkVar = this.f14806v;
        synchronized (zzetkVar) {
            zzclVar = (com.google.android.gms.ads.internal.client.zzcl) zzetkVar.f14841t.get();
        }
        return zzclVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: w */
    public final synchronized com.google.android.gms.ads.internal.client.zzea mo2860w() {
        Preconditions.m3540d("getVideoController must be called from the main thread.");
        zzcvs zzcvsVar = this.f14802A;
        if (zzcvsVar == null) {
            return null;
        }
        return zzcvsVar.mo5849f();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: x3 */
    public final void mo2861x3(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        if (m6336l4()) {
            Preconditions.m3540d("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zzdqVar.mo2912b()) {
                this.f14810z.m6112b();
            }
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3069b("Error in making CSI ping for reporting paid event callback", e);
        }
        this.f14806v.f14842u.set(zzdqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: z */
    public final com.google.android.gms.ads.internal.client.zzbh mo2862z() {
        return this.f14806v.m6351d();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: z3 */
    public final void mo2863z3(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzb() {
        if (m6336l4()) {
            Preconditions.m3540d("getAdFrame must be called on the main UI thread.");
        }
        return new ObjectWrapper(this.f14804t.f15674f);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzc() {
        try {
            if (((Boolean) zzbkv.f9043e.m5057c()).booleanValue()) {
                zzbio zzbioVar = zzbix.f8873zc;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                    if (this.f14809y.f3398u < ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8083Ec)).intValue()) {
                        Preconditions.m3540d("destroy must be called on the main UI thread.");
                    }
                } else {
                    Preconditions.m3540d("destroy must be called on the main UI thread.");
                }
            } else {
                Preconditions.m3540d("destroy must be called on the main UI thread.");
            }
            zzcvs zzcvsVar = this.f14802A;
            if (zzcvsVar != null) {
                zzddy zzddyVar = zzcvsVar.f11761c;
                zzddyVar.getClass();
                zzddyVar.m5923J0(new zzddw(null));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzk() {
        Preconditions.m3540d("getAdMetadata must be called on the main UI thread.");
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
