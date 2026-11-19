package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzala {

    /* JADX INFO: renamed from: a */
    public final zzagx f5782a;

    /* JADX INFO: renamed from: b */
    public final long f5783b;

    public zzala(zzagx zzagxVar, long j2, long j3, long[] jArr, zzakw zzakwVar, int i2, int i3) {
        zzagx zzagxVar2 = new zzagx();
        zzagxVar2.f5289a = zzagxVar.f5289a;
        zzagxVar2.f5290b = zzagxVar.f5290b;
        zzagxVar2.f5291c = zzagxVar.f5291c;
        zzagxVar2.f5292d = zzagxVar.f5292d;
        zzagxVar2.f5293e = zzagxVar.f5293e;
        zzagxVar2.f5294f = zzagxVar.f5294f;
        zzagxVar2.f5295g = zzagxVar.f5295g;
        this.f5782a = zzagxVar2;
        this.f5783b = j2;
    }

    /* JADX INFO: renamed from: a */
    public final long m4189a() {
        long j2 = this.f5783b;
        if (j2 == -1 || j2 == 0) {
            return -9223372036854775807L;
        }
        zzagx zzagxVar = this.f5782a;
        return zzfm.m6520v(zzagxVar.f5292d, (j2 * ((long) zzagxVar.f5295g)) - 1);
    }
}
