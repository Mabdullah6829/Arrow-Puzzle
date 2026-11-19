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
public final class zzfke extends zzcco {

    /* JADX INFO: renamed from: A */
    public final zzdzt f15847A;

    /* JADX INFO: renamed from: B */
    public zzdvu f15848B;

    /* JADX INFO: renamed from: C */
    public boolean f15849C;

    /* JADX INFO: renamed from: t */
    public final zzfka f15850t;

    /* JADX INFO: renamed from: u */
    public final zzfjr f15851u;

    /* JADX INFO: renamed from: v */
    public final String f15852v;

    /* JADX INFO: renamed from: w */
    public final zzfkz f15853w;

    /* JADX INFO: renamed from: x */
    public final Context f15854x;

    /* JADX INFO: renamed from: y */
    public final VersionInfoParcel f15855y;

    /* JADX INFO: renamed from: z */
    public final zzbaw f15856z;

    public zzfke(String str, zzfka zzfkaVar, Context context, zzfjr zzfjrVar, zzfkz zzfkzVar, VersionInfoParcel versionInfoParcel, zzbaw zzbawVar, zzdzt zzdztVar) {
        this.f15852v = str;
        this.f15850t = zzfkaVar;
        this.f15851u = zzfjrVar;
        this.f15853w = zzfkzVar;
        this.f15854x = context;
        this.f15855y = versionInfoParcel;
        zzbio zzbioVar = zzbix.f8641m1;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (!((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() || Build.VERSION.SDK_INT < 35) {
            this.f15849C = ((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8624l1)).booleanValue();
        } else {
            this.f15849C = true;
        }
        this.f15856z = zzbawVar;
        this.f15847A = zzdztVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    /* JADX INFO: renamed from: A0 */
    public final synchronized void mo2960A0(IObjectWrapper iObjectWrapper, boolean z) {
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        if (this.f15848B == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Rewarded can not be shown before loaded");
            this.f15851u.mo5837j(zzfmi.m6535d(9, null, null));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8040C3)).booleanValue()) {
                this.f15856z.f7501b.mo3258e(new Throwable().getStackTrace());
            }
            this.f15848B.m6072c((Activity) ObjectWrapper.m3697u0(iObjectWrapper), z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    /* JADX INFO: renamed from: H2 */
    public final synchronized void mo2961H2(long j2) {
        zzdbv zzdbvVar;
        zzdvu zzdvuVar = this.f15848B;
        if (zzdvuVar == null || (zzdbvVar = zzdvuVar.f11768j) == null) {
            return;
        }
        zzdbvVar.m5891a(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    /* JADX INFO: renamed from: J3 */
    public final void mo2962J3(zzccx zzccxVar) {
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        this.f15851u.f15814x.set(zzccxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    /* JADX INFO: renamed from: K3 */
    public final synchronized void mo2963K3(zzcdd zzcddVar) {
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        zzfkz zzfkzVar = this.f15853w;
        zzfkzVar.f16007a = zzcddVar.f9758s;
        zzfkzVar.f16008b = zzcddVar.f9759t;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    /* JADX INFO: renamed from: S1 */
    public final synchronized void mo2964S1(com.google.android.gms.ads.internal.client.zzm zzmVar, zzccw zzccwVar) {
        m6471k4(zzmVar, zzccwVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    /* JADX INFO: renamed from: U1 */
    public final void mo2965U1(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Preconditions.m3540d("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdqVar.mo2912b()) {
                this.f15847A.m6112b();
            }
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3069b("Error in making CSI ping for reporting paid event callback", e);
        }
        this.f15851u.f15816z.set(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    /* JADX INFO: renamed from: c */
    public final Bundle mo2966c() {
        Bundle bundle;
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        zzdvu zzdvuVar = this.f15848B;
        if (zzdvuVar == null) {
            return new Bundle();
        }
        zzdet zzdetVar = zzdvuVar.f13131q;
        synchronized (zzdetVar) {
            bundle = new Bundle(zzdetVar.f12104t);
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    /* JADX INFO: renamed from: e */
    public final com.google.android.gms.ads.internal.client.zzdx mo2967e() {
        zzdvu zzdvuVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8095F7)).booleanValue() && (zzdvuVar = this.f15848B) != null) {
            return zzdvuVar.f11764f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    /* JADX INFO: renamed from: f */
    public final synchronized long mo2968f() {
        zzdbv zzdbvVar;
        zzdvu zzdvuVar = this.f15848B;
        if (zzdvuVar == null || (zzdbvVar = zzdvuVar.f11768j) == null) {
            return 0L;
        }
        return zzdbvVar.f11972a.get();
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    /* JADX INFO: renamed from: g */
    public final String mo2969g() {
        return this.f15852v;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    /* JADX INFO: renamed from: h4 */
    public final synchronized void mo2970h4(boolean z) {
        Preconditions.m3540d("setImmersiveMode must be called on the main UI thread.");
        this.f15849C = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final synchronized void m6471k4(com.google.android.gms.ads.internal.client.zzm zzmVar, zzccw zzccwVar, int i2) {
        try {
            if (!zzmVar.m2976H()) {
                boolean z = false;
                if (((Boolean) zzbkv.f9049k.m5057c()).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8049Cc)).booleanValue()) {
                        z = true;
                    }
                }
                if (this.f15855y.f3398u < ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8066Dc)).intValue() || !z) {
                    Preconditions.m3540d("#008 Must be called on the main UI thread.");
                }
            }
            zzfjr zzfjrVar = this.f15851u;
            zzfjrVar.f15811u.set(zzccwVar);
            com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
            if (com.google.android.gms.ads.internal.util.zzs.m3209h(this.f15854x) && zzmVar.f3216K == null) {
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3070c("Failed to load the ad because app ID is missing.");
                zzfjrVar.mo5830v(zzfmi.m6535d(4, null, null));
            } else {
                if (this.f15848B != null) {
                    return;
                }
                zzfjt zzfjtVar = new zzfjt();
                zzfka zzfkaVar = this.f15850t;
                zzfkaVar.f15836h.f16027o.f15996a = i2;
                zzfkaVar.m6469a(zzmVar, this.f15852v, zzfjtVar, new zzfkd(this));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    /* JADX INFO: renamed from: n2 */
    public final synchronized void mo2971n2(IObjectWrapper iObjectWrapper) {
        mo2960A0(iObjectWrapper, this.f15849C);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    /* JADX INFO: renamed from: q2 */
    public final void mo2972q2(com.google.android.gms.ads.internal.client.zzdn zzdnVar) {
        zzfjr zzfjrVar = this.f15851u;
        if (zzdnVar == null) {
            zzfjrVar.f15810t.set(null);
        } else {
            zzfjrVar.f15810t.set(new zzfkc(this, zzdnVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    /* JADX INFO: renamed from: t1 */
    public final synchronized void mo2973t1(com.google.android.gms.ads.internal.client.zzm zzmVar, zzccw zzccwVar) {
        m6471k4(zzmVar, zzccwVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    /* JADX INFO: renamed from: u1 */
    public final void mo2974u1(zzccs zzccsVar) {
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        this.f15851u.f15812v.set(zzccsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final boolean zzi() {
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        zzdvu zzdvuVar = this.f15848B;
        return (zzdvuVar == null || zzdvuVar.f13137w) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final synchronized String zzj() {
        zzdcs zzdcsVar;
        zzdvu zzdvuVar = this.f15848B;
        if (zzdvuVar == null || (zzdcsVar = zzdvuVar.f11764f) == null) {
            return null;
        }
        return zzdcsVar.f12046s;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final zzccm zzl() {
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        zzdvu zzdvuVar = this.f15848B;
        if (zzdvuVar != null) {
            return zzdvuVar.f13133s;
        }
        return null;
    }
}
