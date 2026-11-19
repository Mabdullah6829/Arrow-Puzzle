package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzeqz implements zzdei {

    /* JADX INFO: renamed from: a */
    public boolean f14680a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzemd f14681b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzcgd f14682c;

    public zzeqz(zzerc zzercVar, zzemd zzemdVar, zzcgd zzcgdVar) {
        this.f14681b = zzemdVar;
        this.f14682c = zzcgdVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6316a(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i2 = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8816w6)).booleanValue()) {
            i2 = 3;
        }
        this.f14682c.m5398b(new zzeme(i2, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    /* JADX INFO: renamed from: b */
    public final synchronized void mo5908b(int i2) {
        if (this.f14680a) {
            return;
        }
        this.f14680a = true;
        m6316a(new com.google.android.gms.ads.internal.client.zze(i2, zzerc.m6317c(i2, this.f14681b.f14191a), "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final synchronized void zza() {
        this.f14682c.m5397a(null);
    }
}
