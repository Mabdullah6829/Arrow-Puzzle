package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzalm implements zzali {

    /* JADX INFO: renamed from: a */
    public final zzeu f5822a;

    /* JADX INFO: renamed from: b */
    public final int f5823b;

    /* JADX INFO: renamed from: c */
    public final int f5824c;

    /* JADX INFO: renamed from: d */
    public int f5825d;

    /* JADX INFO: renamed from: e */
    public int f5826e;

    public zzalm(zzga zzgaVar) {
        zzeu zzeuVar = zzgaVar.f16879b;
        this.f5822a = zzeuVar;
        zzeuVar.m6363E(12);
        this.f5824c = zzeuVar.m6382h() & 255;
        this.f5823b = zzeuVar.m6382h();
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final int zza() {
        return this.f5823b;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final int zzb() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final int zzc() {
        zzeu zzeuVar = this.f5822a;
        int i2 = this.f5824c;
        if (i2 == 8) {
            return zzeuVar.m6369K();
        }
        if (i2 == 16) {
            return zzeuVar.m6370L();
        }
        int i3 = this.f5825d;
        this.f5825d = i3 + 1;
        if (i3 % 2 != 0) {
            return this.f5826e & 15;
        }
        int iM6369K = zzeuVar.m6369K();
        this.f5826e = iM6369K;
        return (iM6369K & 240) >> 4;
    }
}
