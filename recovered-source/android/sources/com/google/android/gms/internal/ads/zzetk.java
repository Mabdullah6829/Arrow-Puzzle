package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzetk implements AppEventListener, zzdgf, zzden, zzddc, zzddt, com.google.android.gms.ads.internal.client.zza, zzdcz, zzdfq, zzddp, zzdlg {

    /* JADX INFO: renamed from: B */
    public final zzdzt f14838B;

    /* JADX INFO: renamed from: s */
    public final AtomicReference f14840s = new AtomicReference();

    /* JADX INFO: renamed from: t */
    public final AtomicReference f14841t = new AtomicReference();

    /* JADX INFO: renamed from: u */
    public final AtomicReference f14842u = new AtomicReference();

    /* JADX INFO: renamed from: v */
    public final AtomicReference f14843v = new AtomicReference();

    /* JADX INFO: renamed from: w */
    public final AtomicReference f14844w = new AtomicReference();

    /* JADX INFO: renamed from: x */
    public final AtomicBoolean f14845x = new AtomicBoolean(true);

    /* JADX INFO: renamed from: y */
    public final AtomicBoolean f14846y = new AtomicBoolean(false);

    /* JADX INFO: renamed from: z */
    public final AtomicBoolean f14847z = new AtomicBoolean(false);

    /* JADX INFO: renamed from: A */
    public final AtomicReference f14837A = new AtomicReference();

    /* JADX INFO: renamed from: C */
    public final ArrayBlockingQueue f14839C = new ArrayBlockingQueue(((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8566ha)).intValue());

    public zzetk(zzdzt zzdztVar) {
        this.f14838B = zzdztVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    /* JADX INFO: renamed from: C */
    public final void mo5626C() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8551gc)).booleanValue()) {
            zzfht.m6452a(this.f14840s, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzetb
                @Override // com.google.android.gms.internal.ads.zzfhs
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6337b(Object obj) {
                    ((com.google.android.gms.ads.internal.client.zzbh) obj).zzh();
                }
            });
        }
        zzfht.m6452a(this.f14844w, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzeth
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcs) obj).mo2814b();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    /* JADX INFO: renamed from: F0 */
    public final void mo5627F0() {
        zzfht.m6452a(this.f14840s, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzeta
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzi();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: G */
    public final void mo5824G() {
        zzfht.m6452a(this.f14840s, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzesy
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).mo2821c();
            }
        });
        zzetf zzetfVar = new zzfhs() { // from class: com.google.android.gms.internal.ads.zzetf
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcs) obj).zzc();
            }
        };
        AtomicReference atomicReference = this.f14844w;
        zzfht.m6452a(atomicReference, zzetfVar);
        zzfht.m6452a(atomicReference, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzetg
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcs) obj).mo2813a();
            }
        });
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
    public final synchronized void mo5833c() {
        zzfht.m6452a(this.f14840s, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzesx
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).mo2820b();
            }
        });
        zzfht.m6452a(this.f14843v, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzete
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzb();
            }
        });
        this.f14847z.set(true);
        m6353m();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized com.google.android.gms.ads.internal.client.zzbh m6351d() {
        return (com.google.android.gms.ads.internal.client.zzbh) this.f14840s.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdfq
    /* JADX INFO: renamed from: e */
    public final void mo5912e(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfht.m6452a(this.f14842u, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzesr
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdq) obj).mo2913g3(zztVar);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m6352g(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        this.f14841t.set(zzclVar);
        this.f14846y.set(true);
        m6353m();
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    /* JADX INFO: renamed from: i */
    public final synchronized void mo2729i(final String str, final String str2) {
        if (!this.f14845x.get()) {
            zzfht.m6452a(this.f14841t, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzess
                @Override // com.google.android.gms.internal.ads.zzfhs
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6337b(Object obj) {
                    ((com.google.android.gms.ads.internal.client.zzcl) obj).mo2889n0(str, str2);
                }
            });
            return;
        }
        if (!this.f14839C.offer(new Pair(str, str2))) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3068a("The queue for app events is full, dropping the new event.");
            zzdzt zzdztVar = this.f14838B;
            if (zzdztVar != null) {
                zzdzs zzdzsVarM6111a = zzdztVar.m6111a();
                zzdzsVarM6111a.m6107b("action", "dae_action");
                zzdzsVarM6111a.m6107b("dae_name", str);
                zzdzsVarM6111a.m6107b("dae_data", str2);
                zzdzsVarM6111a.m6108c();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    /* JADX INFO: renamed from: j */
    public final void mo5837j(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfht.m6452a(this.f14844w, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzest
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcs) obj).mo2816z2(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    /* JADX INFO: renamed from: k */
    public final void mo2730k() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8551gc)).booleanValue()) {
            return;
        }
        zzfht.m6452a(this.f14840s, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzesz
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzh();
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m6353m() {
        if (this.f14846y.get() && this.f14847z.get()) {
            ArrayBlockingQueue<Pair> arrayBlockingQueue = this.f14839C;
            for (final Pair pair : arrayBlockingQueue) {
                zzfht.m6452a(this.f14841t, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzesu
                    @Override // com.google.android.gms.internal.ads.zzfhs
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ void mo6337b(Object obj) {
                        Pair pair2 = pair;
                        ((com.google.android.gms.ads.internal.client.zzcl) obj).mo2889n0((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            arrayBlockingQueue.clear();
            this.f14845x.set(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    /* JADX INFO: renamed from: n */
    public final void mo5838n() {
        zzfht.m6452a(this.f14840s, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzetc
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzj();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    /* JADX INFO: renamed from: s */
    public final void mo5866s(zzfky zzfkyVar) {
        this.f14845x.set(true);
        this.f14847z.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: u */
    public final void mo5828u() {
        zzfht.m6452a(this.f14840s, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzesw
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).mo2819a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    /* JADX INFO: renamed from: v */
    public final void mo5830v(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfhs zzfhsVar = new zzfhs() { // from class: com.google.android.gms.internal.ads.zzesv
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).mo2822d0(zzeVar);
            }
        };
        AtomicReference atomicReference = this.f14840s;
        zzfht.m6452a(atomicReference, zzfhsVar);
        zzfht.m6452a(atomicReference, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzesp
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).mo2818A(zzeVar.f3106s);
            }
        });
        zzfht.m6452a(this.f14843v, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzesq
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).mo2823l0(zzeVar);
            }
        });
        this.f14845x.set(false);
        this.f14839C.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: x */
    public final void mo5829x() {
        zzfht.m6452a(this.f14840s, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzetd
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzb();
            }
        });
        zzfht.m6452a(this.f14844w, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzeti
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcs) obj).mo2815d();
            }
        });
        zzfht.m6452a(this.f14837A, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzetj
            @Override // com.google.android.gms.internal.ads.zzfhs
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6337b(Object obj) {
                ((zzfti) obj).m6668a();
            }
        });
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
