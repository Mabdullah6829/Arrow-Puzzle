package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcxp implements zzden, zzbex, zzdib {

    /* JADX INFO: renamed from: s */
    public final zzfkn f11695s;

    /* JADX INFO: renamed from: t */
    public final zzddr f11696t;

    /* JADX INFO: renamed from: u */
    public final zzdew f11697u;

    /* JADX INFO: renamed from: x */
    public final zzdfs f11700x;

    /* JADX INFO: renamed from: v */
    public final AtomicBoolean f11698v = new AtomicBoolean();

    /* JADX INFO: renamed from: w */
    public final AtomicBoolean f11699w = new AtomicBoolean();

    /* JADX INFO: renamed from: y */
    public final AtomicBoolean f11701y = new AtomicBoolean();

    public zzcxp(zzfkn zzfknVar, zzddr zzddrVar, zzdew zzdewVar, zzdfs zzdfsVar) {
        this.f11695s = zzfknVar;
        this.f11696t = zzddrVar;
        this.f11697u = zzdewVar;
        this.f11700x = zzdfsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    /* JADX INFO: renamed from: c */
    public final synchronized void mo5833c() {
        int i2 = this.f11695s.f15924e;
        if (i2 == 1 || i2 == 4) {
            return;
        }
        if (this.f11698v.compareAndSet(false, true)) {
            this.f11696t.m5905u();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdib
    /* JADX INFO: renamed from: r */
    public final void mo5864r() {
        if (this.f11695s.f15924e == 4 && this.f11698v.compareAndSet(false, true)) {
            this.f11696t.m5905u();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    /* JADX INFO: renamed from: t */
    public final void mo4826t(zzbew zzbewVar) {
        int i2 = this.f11695s.f15924e;
        if (i2 == 1) {
            if (zzbewVar.f7707j && this.f11698v.compareAndSet(false, true)) {
                this.f11696t.m5905u();
            }
        } else if (i2 == 4 && zzbewVar.f7707j && this.f11701y.compareAndSet(false, true)) {
            this.f11700x.m5913u();
        }
        if (zzbewVar.f7707j && this.f11699w.compareAndSet(false, true)) {
            zzdew zzdewVar = this.f11697u;
            synchronized (zzdewVar) {
                zzdewVar.m5923J0(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdev
                    @Override // com.google.android.gms.internal.ads.zzdiw
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ void mo5900b(Object obj) {
                        ((zzdey) obj).zzl();
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdib
    /* JADX INFO: renamed from: z */
    public final void mo5865z() {
    }
}
