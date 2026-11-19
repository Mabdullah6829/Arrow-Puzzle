package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;

/* JADX INFO: loaded from: classes2.dex */
public class zzere extends zzbvo {

    /* JADX INFO: renamed from: A */
    public final zzdhz f14700A;

    /* JADX INFO: renamed from: B */
    public final zzddm f14701B;

    /* JADX INFO: renamed from: s */
    public final zzdcx f14702s;

    /* JADX INFO: renamed from: t */
    public final zzdle f14703t;

    /* JADX INFO: renamed from: u */
    public final zzddr f14704u;

    /* JADX INFO: renamed from: v */
    public final zzdeg f14705v;

    /* JADX INFO: renamed from: w */
    public final zzdel f14706w;

    /* JADX INFO: renamed from: x */
    public final zzdid f14707x;

    /* JADX INFO: renamed from: y */
    public final zzdfk f14708y;

    /* JADX INFO: renamed from: z */
    public final zzdmc f14709z;

    public zzere(zzdcx zzdcxVar, zzdle zzdleVar, zzddr zzddrVar, zzdeg zzdegVar, zzdel zzdelVar, zzdid zzdidVar, zzdfk zzdfkVar, zzdmc zzdmcVar, zzdhz zzdhzVar, zzddm zzddmVar) {
        this.f14702s = zzdcxVar;
        this.f14703t = zzdleVar;
        this.f14704u = zzddrVar;
        this.f14705v = zzdegVar;
        this.f14706w = zzdelVar;
        this.f14707x = zzdidVar;
        this.f14708y = zzdfkVar;
        this.f14709z = zzdmcVar;
        this.f14700A = zzdhzVar;
        this.f14701B = zzddmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: B3 */
    public final void mo5186B3(String str, String str2) {
        this.f14707x.mo5097n0(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: C0 */
    public final void mo5187C0(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: F */
    public final void mo5188F() {
        zzdmc zzdmcVar = this.f14709z;
        zzdmcVar.getClass();
        zzdmcVar.m5923J0(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdmb
            @Override // com.google.android.gms.internal.ads.zzdiw
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo5900b(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).mo2763b();
            }
        });
    }

    /* JADX INFO: renamed from: H1 */
    public void mo5189H1(zzccm zzccmVar) {
    }

    /* JADX INFO: renamed from: J0 */
    public void mo5190J0(zzcci zzcciVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: a */
    public final void mo5192a() {
        this.f14702s.mo2730k();
        this.f14703t.mo5626C();
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: a0 */
    public final void mo5193a0(int i2) {
        mo5195b1(new com.google.android.gms.ads.internal.client.zze(i2, "", "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: b */
    public final void mo5194b() {
        this.f14708y.mo3021c1(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: b1 */
    public final void mo5195b1(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.f14701B.mo5903l0(zzfmi.m6534c(8, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: c0 */
    public final void mo5196c0(String str) {
        mo5195b1(new com.google.android.gms.ads.internal.client.zze(0, str, "undefined", null, null));
    }

    /* JADX INFO: renamed from: e0 */
    public void mo5197e0() {
        zzdmc zzdmcVar = this.f14709z;
        zzdmcVar.getClass();
        zzdmcVar.m5923J0(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdlx
            @Override // com.google.android.gms.internal.ads.zzdiw
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo5900b(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).mo2762a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: f4 */
    public final void mo5198f4(int i2, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: h1 */
    public final void mo5199h1(zzbnc zzbncVar, String str) {
    }

    /* JADX INFO: renamed from: j */
    public void mo5200j() {
        zzdmc zzdmcVar = this.f14709z;
        synchronized (zzdmcVar) {
            zzdmcVar.m5923J0(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdly
                @Override // com.google.android.gms.internal.ads.zzdiw
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo5900b(Object obj) {
                    ((VideoController.VideoLifecycleCallbacks) obj).mo2764c();
                }
            });
            zzdmcVar.f12325t = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: k */
    public final void mo5201k() {
        zzdmc zzdmcVar = this.f14709z;
        synchronized (zzdmcVar) {
            try {
                if (!zzdmcVar.f12325t) {
                    zzdmcVar.m5923J0(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdma
                        @Override // com.google.android.gms.internal.ads.zzdiw
                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ void mo5900b(Object obj) {
                            ((VideoController.VideoLifecycleCallbacks) obj).mo2764c();
                        }
                    });
                    zzdmcVar.f12325t = true;
                }
                zzdmcVar.m5923J0(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdlz
                    @Override // com.google.android.gms.internal.ads.zzdiw
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ void mo5900b(Object obj) {
                        ((VideoController.VideoLifecycleCallbacks) obj).getClass();
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: p */
    public final void mo5202p(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzh() {
        this.f14705v.m5907K0();
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzi() {
        this.f14708y.zzh();
        zzdhz zzdhzVar = this.f14700A;
        zzdhzVar.getClass();
        zzdhzVar.m5923J0(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdhx
            @Override // com.google.android.gms.internal.ads.zzdiw
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo5900b(Object obj) {
                ((zzdib) obj).mo5865z();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzj() {
        this.f14706w.mo5833c();
    }

    public void zzk() {
        this.f14704u.m5905u();
        zzdhz zzdhzVar = this.f14700A;
        zzdhzVar.getClass();
        zzdhzVar.m5923J0(zzdhy.f12202a);
    }

    /* JADX INFO: renamed from: Y */
    public void mo5191Y() {
    }

    /* JADX INFO: renamed from: t2 */
    public void mo5203t2() {
    }
}
