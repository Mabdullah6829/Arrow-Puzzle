package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzakp extends zzafq implements zzaky {

    /* JADX INFO: renamed from: h */
    public final long f5742h;

    /* JADX INFO: renamed from: i */
    public final int f5743i;

    /* JADX INFO: renamed from: j */
    public final int f5744j;

    /* JADX INFO: renamed from: k */
    public final long f5745k;

    public zzakp(long j2, long j3, int i2, int i3, boolean z) {
        super(j2, j3, i2, i3, z);
        long j4 = j2;
        this.f5742h = j3;
        this.f5743i = i2;
        this.f5744j = i3;
        this.f5745k = j4 == -1 ? -1L : j4;
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    /* JADX INFO: renamed from: b */
    public final long mo4181b(long j2) {
        return (Math.max(0L, j2 - this.f5205b) * 8000000) / ((long) this.f5208e);
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    /* JADX INFO: renamed from: c */
    public final long mo4182c() {
        return this.f5745k;
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    public final int zzh() {
        return this.f5743i;
    }
}
