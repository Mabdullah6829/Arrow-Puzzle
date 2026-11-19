package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdbs implements zzdcz, zzdkl, zzdib, zzddp, zzbex {

    /* JADX INFO: renamed from: A */
    public final String f11957A;

    /* JADX INFO: renamed from: s */
    public final zzddr f11958s;

    /* JADX INFO: renamed from: t */
    public final zzdfs f11959t;

    /* JADX INFO: renamed from: u */
    public final zzfkn f11960u;

    /* JADX INFO: renamed from: v */
    public final ScheduledExecutorService f11961v;

    /* JADX INFO: renamed from: w */
    public final Executor f11962w;

    /* JADX INFO: renamed from: y */
    public ScheduledFuture f11964y;

    /* JADX INFO: renamed from: x */
    public final zzhcy f11963x = zzhcy.m7389q();

    /* JADX INFO: renamed from: z */
    public final AtomicBoolean f11965z = new AtomicBoolean();

    public zzdbs(zzddr zzddrVar, zzfkn zzfknVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, zzdfs zzdfsVar) {
        this.f11958s = zzddrVar;
        this.f11960u = zzfknVar;
        this.f11961v = scheduledExecutorService;
        this.f11962w = executor;
        this.f11957A = str;
        this.f11959t = zzdfsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: G */
    public final void mo5824G() {
        zzfkn zzfknVar = this.f11960u;
        if (zzfknVar.f15924e == 3) {
            return;
        }
        int i2 = zzfknVar.f15914Y;
        if (i2 == 0 || i2 == 1) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8353Uc)).booleanValue() && this.f11957A.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return;
            }
            this.f11958s.m5905u();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: a */
    public final void mo5825a() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: b */
    public final void mo5826b() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    /* JADX INFO: renamed from: c */
    public final void mo5890c() {
        zzfkn zzfknVar = this.f11960u;
        int i2 = zzfknVar.f15924e;
        if (i2 == 3) {
            return;
        }
        if (i2 == 4) {
            this.f11959t.m5913u();
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8490d2)).booleanValue() && zzfknVar.f15914Y == 2) {
            int i3 = zzfknVar.f15948q;
            if (i3 == 0) {
                this.f11958s.m5905u();
                return;
            }
            zzdbq zzdbqVar = new zzdbq(this);
            zzhcy zzhcyVar = this.f11963x;
            zzhcyVar.addListener(new zzhcd(zzhcyVar, zzdbqVar), this.f11962w);
            this.f11964y = this.f11961v.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdbr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdbs zzdbsVar = this.f11956s;
                    synchronized (zzdbsVar) {
                        try {
                            zzhcy zzhcyVar2 = zzdbsVar.f11963x;
                            if (zzhcyVar2.isDone()) {
                                return;
                            }
                            zzhcyVar2.m7320c(Boolean.TRUE);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }, i3, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    /* JADX INFO: renamed from: j */
    public final synchronized void mo5837j(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            zzhcy zzhcyVar = this.f11963x;
            if (zzhcyVar.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f11964y;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            zzhcyVar.m7321d(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdib
    /* JADX INFO: renamed from: r */
    public final synchronized void mo5864r() {
        if (this.f11960u.f15924e == 4) {
            this.f11958s.m5905u();
            return;
        }
        zzhcy zzhcyVar = this.f11963x;
        if (zzhcyVar.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f11964y;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzhcyVar.m7320c(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    /* JADX INFO: renamed from: t */
    public final void mo4826t(zzbew zzbewVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8353Uc)).booleanValue() && this.f11957A.equals("com.google.ads.mediation.admob.AdMobAdapter") && zzbewVar.f7707j && this.f11965z.compareAndSet(false, true) && this.f11960u.f15924e != 3) {
            com.google.android.gms.ads.internal.util.zze.m3150k("Full screen 1px impression occurred");
            this.f11958s.m5905u();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: u */
    public final void mo5828u() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: x */
    public final void mo5829x() {
    }

    @Override // com.google.android.gms.internal.ads.zzdib
    /* JADX INFO: renamed from: z */
    public final void mo5865z() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: l */
    public final void mo5827l(zzcbt zzcbtVar, String str, String str2) {
    }
}
