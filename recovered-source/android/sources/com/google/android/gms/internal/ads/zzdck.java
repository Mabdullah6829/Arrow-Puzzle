package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdck implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzdcj f12033a;

    /* JADX INFO: renamed from: b */
    public final zzini f12034b;

    public zzdck(zzdcj zzdcjVar, zzini zziniVar) {
        this.f12033a = zzdcjVar;
        this.f12034b = zziniVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        String str = (String) this.f12034b.zzb();
        zzemf zzemfVar = this.f12033a.f12032f;
        return zzemfVar != null ? zzemfVar : new zzemf(str);
    }
}
