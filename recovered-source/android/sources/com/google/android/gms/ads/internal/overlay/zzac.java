package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbfr;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbiv;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzdlg;

/* JADX INFO: loaded from: classes.dex */
public final class zzac extends zzbzh implements zzbfr {

    /* JADX INFO: renamed from: t */
    public final AdOverlayInfoParcel f3313t;

    /* JADX INFO: renamed from: u */
    public final Activity f3314u;

    /* JADX INFO: renamed from: y */
    public final boolean f3318y;

    /* JADX INFO: renamed from: v */
    public boolean f3315v = false;

    /* JADX INFO: renamed from: w */
    public boolean f3316w = false;

    /* JADX INFO: renamed from: x */
    public boolean f3317x = false;

    /* JADX INFO: renamed from: z */
    public boolean f3319z = false;

    /* JADX INFO: renamed from: A */
    public boolean f3312A = false;

    public zzac(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzcVar;
        boolean z = false;
        this.f3313t = adOverlayInfoParcel;
        this.f3314u = activity;
        zzbio zzbioVar = zzbix.f8127H5;
        zzba zzbaVar = zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        if ((((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue() || ((Boolean) zzbivVar2.m5030a(zzbix.f8144I5)).booleanValue() || ((Boolean) zzbivVar2.m5030a(zzbix.f8212M5)).booleanValue()) && (zzcVar = adOverlayInfoParcel.f3303s) != null && zzcVar.f3321B && Build.MANUFACTURER.matches((String) zzbivVar2.m5030a(zzbix.f8178K5)) && Build.MODEL.matches((String) zzbivVar2.m5030a(zzbix.f8195L5))) {
            z = true;
        }
        this.f3318y = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: F */
    public final void mo2989F() {
        if (this.f3314u.isFinishing()) {
            m2998k4();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: N */
    public final void mo2990N(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: Q */
    public final void mo2991Q() {
        if (this.f3314u.isFinishing()) {
            m2998k4();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: Q3 */
    public final void mo2992Q3(Bundle bundle) {
        zzr zzrVar;
        zzbio zzbioVar = zzbix.f8583ia;
        zzba zzbaVar = zzba.f3095e;
        boolean zBooleanValue = ((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue();
        Activity activity = this.f3314u;
        if (zBooleanValue && !this.f3317x) {
            activity.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3313t;
        if (adOverlayInfoParcel == null) {
            activity.finish();
            return;
        }
        if (z) {
            activity.finish();
            return;
        }
        if (bundle == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.f3304t;
            if (zzaVar != null) {
                zzaVar.mo2730k();
            }
            zzdlg zzdlgVar = adOverlayInfoParcel.f3299M;
            if (zzdlgVar != null) {
                zzdlgVar.mo5626C();
            }
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzrVar = adOverlayInfoParcel.f3305u) != null) {
                zzrVar.zzh();
            }
        }
        if (this.f3318y) {
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8212M5)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3707g.m4852b(this);
            }
        }
        zzc zzcVar = adOverlayInfoParcel.f3303s;
        zzad zzadVar = adOverlayInfoParcel.f3287A;
        zza zzaVar2 = com.google.android.gms.ads.internal.zzt.f3698C.f3701a;
        zzaa zzaaVar = zzcVar.f3320A;
        Activity activity2 = this.f3314u;
        if (zza.m2986b(activity2, zzcVar, zzadVar, zzaaVar, null, "")) {
            return;
        }
        activity2.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: a */
    public final void mo2993a() {
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: b */
    public final void mo2994b() {
        zzr zzrVar = this.f3313t.f3305u;
        if (zzrVar != null) {
            zzrVar.mo3020a3();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: c */
    public final boolean mo2995c() {
        return ((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8144I5)).booleanValue() && this.f3318y && this.f3319z;
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: h */
    public final void mo2996h() {
        this.f3317x = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbfr
    /* JADX INFO: renamed from: k0 */
    public final void mo2997k0(boolean z) {
        if (!z) {
            this.f3312A = true;
        } else if (this.f3312A) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Foregrounded: finishing activity from LauncherOverlay");
            this.f3314u.finish();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final synchronized void m2998k4() {
        try {
            if (!this.f3316w) {
                zzr zzrVar = this.f3313t.f3305u;
                if (zzrVar != null) {
                    zzrVar.mo3021c1(4);
                }
                this.f3316w = true;
                if (this.f3318y) {
                    if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8212M5)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.f3698C.f3707g.m4853c(this);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: o1 */
    public final void mo2999o1(int i2, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: x1 */
    public final void mo3000x1(int i2, int i3, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzk() {
        if (this.f3315v) {
            com.google.android.gms.ads.internal.util.zze.m3150k("LauncherOverlay finishing activity");
            this.f3314u.finish();
            return;
        }
        this.f3315v = true;
        this.f3319z = true;
        zzr zzrVar = this.f3313t.f3305u;
        if (zzrVar != null) {
            zzrVar.mo3022d2();
        }
        if (this.f3318y) {
            zzbio zzbioVar = zzbix.f8127H5;
            zzba zzbaVar = zzba.f3095e;
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzs.f3626l.postDelayed(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzab
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzac zzacVar = this.f3311s;
                        if (zzacVar.f3319z) {
                            zzacVar.f3314u.finish();
                        }
                    }
                }, ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8161J5)).intValue());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzl() {
        this.f3319z = false;
        zzr zzrVar = this.f3313t.f3305u;
        if (zzrVar != null) {
            zzrVar.mo3017K1();
        }
        if (this.f3314u.isFinishing()) {
            m2998k4();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzo(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f3315v);
    }
}
