package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeri implements com.google.android.gms.ads.internal.zzg {

    /* JADX INFO: renamed from: a */
    public final zzdcx f14713a;

    /* JADX INFO: renamed from: b */
    public final zzddr f14714b;

    /* JADX INFO: renamed from: c */
    public final zzdli f14715c;

    /* JADX INFO: renamed from: d */
    public final zzdla f14716d;

    /* JADX INFO: renamed from: e */
    public final zzcun f14717e;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f14718f = new AtomicBoolean(false);

    public zzeri(zzdcx zzdcxVar, zzddr zzddrVar, zzdli zzdliVar, zzdla zzdlaVar, zzcun zzcunVar) {
        this.f14713a = zzdcxVar;
        this.f14714b = zzddrVar;
        this.f14715c = zzdliVar;
        this.f14716d = zzdlaVar;
        this.f14717e = zzcunVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    /* JADX INFO: renamed from: a */
    public final synchronized void mo3251a(View view) {
        if (this.f14718f.compareAndSet(false, true)) {
            this.f14717e.mo5838n();
            this.f14716d.m5935K0(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        if (this.f14718f.get()) {
            this.f14713a.mo2730k();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        if (this.f14718f.get()) {
            this.f14714b.m5905u();
            zzdli zzdliVar = this.f14715c;
            synchronized (zzdliVar) {
                zzdliVar.m5923J0(zzdlh.f12305a);
            }
        }
    }
}
