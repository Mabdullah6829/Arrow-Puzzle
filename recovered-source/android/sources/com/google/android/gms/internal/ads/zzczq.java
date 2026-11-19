package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzczq implements zzden, com.google.android.gms.ads.internal.client.zza, zzdgf, zzddt, zzdcz, zzdiq {

    /* JADX INFO: renamed from: s */
    public final Clock f11842s;

    /* JADX INFO: renamed from: t */
    public final zzcfe f11843t;

    public zzczq(Clock clock, zzcfe zzcfeVar) {
        this.f11842s = clock;
        this.f11843t = zzcfeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: G */
    public final void mo5824G() {
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    /* JADX INFO: renamed from: L */
    public final void mo5878L(zzbic.zzb zzbVar) {
        zzcfe zzcfeVar = this.f11843t;
        synchronized (zzcfeVar.f9865d) {
            zzcfp zzcfpVar = zzcfeVar.f9863b;
            synchronized (zzcfpVar.f9926s) {
                zzcfpVar.f9929v.m5391b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    /* JADX INFO: renamed from: X */
    public final void mo5879X(zzbic.zzb zzbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: a */
    public final void mo5825a() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: b */
    public final void mo5826b() {
    }

    @Override // com.google.android.gms.internal.ads.zzden
    /* JADX INFO: renamed from: c */
    public final void mo5833c() {
        zzcfe zzcfeVar = this.f11843t;
        synchronized (zzcfeVar.f9865d) {
            try {
                if (zzcfeVar.f9872k != -1) {
                    zzcfeVar.f9869h = zzcfeVar.f9862a.mo3639a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    /* JADX INFO: renamed from: g */
    public final void mo5880g(zzbic.zzb zzbVar) {
        zzcfe zzcfeVar = this.f11843t;
        synchronized (zzcfeVar.f9865d) {
            zzcfp zzcfpVar = zzcfeVar.f9863b;
            synchronized (zzcfpVar.f9926s) {
                zzcfpVar.f9929v.m5391b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    /* JADX INFO: renamed from: i */
    public final void mo5881i(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    /* JADX INFO: renamed from: j */
    public final void mo5882j() {
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    /* JADX INFO: renamed from: k */
    public final void mo2730k() {
        zzcfe zzcfeVar = this.f11843t;
        synchronized (zzcfeVar.f9865d) {
            if (zzcfeVar.f9872k != -1) {
                zzcfd zzcfdVar = new zzcfd(zzcfeVar);
                zzcfdVar.f9859a = zzcfdVar.f9861c.f9862a.mo3639a();
                zzcfeVar.f9864c.add(zzcfdVar);
                zzcfeVar.f9870i++;
                zzcfp zzcfpVar = zzcfeVar.f9863b;
                synchronized (zzcfpVar.f9926s) {
                    zzcfm zzcfmVar = zzcfpVar.f9929v;
                    synchronized (zzcfmVar.f9914f) {
                        zzcfmVar.f9918j++;
                    }
                }
                zzcfpVar.m5392a(zzcfeVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    /* JADX INFO: renamed from: n */
    public final void mo5838n() {
        zzcfe zzcfeVar = this.f11843t;
        synchronized (zzcfeVar.f9865d) {
            try {
                if (zzcfeVar.f9872k != -1 && zzcfeVar.f9868g == -1) {
                    zzcfeVar.f9868g = zzcfeVar.f9862a.mo3639a();
                    zzcfeVar.f9863b.m5392a(zzcfeVar);
                }
                zzcfp zzcfpVar = zzcfeVar.f9863b;
                synchronized (zzcfpVar.f9926s) {
                    zzcfm zzcfmVar = zzcfpVar.f9929v;
                    synchronized (zzcfmVar.f9914f) {
                        zzcfmVar.f9919k++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    /* JADX INFO: renamed from: r */
    public final void mo5883r(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    /* JADX INFO: renamed from: s */
    public final void mo5866s(zzfky zzfkyVar) {
        Clock clock = this.f11842s;
        zzcfe zzcfeVar = this.f11843t;
        long jMo3639a = clock.mo3639a();
        synchronized (zzcfeVar.f9865d) {
            try {
                zzcfeVar.f9872k = jMo3639a;
                if (jMo3639a != -1) {
                    zzcfeVar.f9863b.m5392a(zzcfeVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: u */
    public final void mo5828u() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: x */
    public final void mo5829x() {
        zzcfe zzcfeVar = this.f11843t;
        synchronized (zzcfeVar.f9865d) {
            try {
                if (zzcfeVar.f9872k != -1) {
                    LinkedList linkedList = zzcfeVar.f9864c;
                    if (!linkedList.isEmpty()) {
                        zzcfd zzcfdVar = (zzcfd) linkedList.getLast();
                        if (zzcfdVar.f9860b == -1) {
                            zzcfdVar.f9860b = zzcfdVar.f9861c.f9862a.mo3639a();
                            zzcfeVar.f9863b.m5392a(zzcfeVar);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    /* JADX INFO: renamed from: z */
    public final void mo5867z(zzcbk zzcbkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: l */
    public final void mo5827l(zzcbt zzcbtVar, String str, String str2) {
    }
}
