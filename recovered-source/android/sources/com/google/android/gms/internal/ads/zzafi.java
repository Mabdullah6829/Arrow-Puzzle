package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafi {

    /* JADX INFO: renamed from: a */
    public final long f5181a;

    /* JADX INFO: renamed from: b */
    public final long f5182b;

    /* JADX INFO: renamed from: c */
    public final long f5183c;

    /* JADX INFO: renamed from: d */
    public long f5184d = 0;

    /* JADX INFO: renamed from: e */
    public long f5185e;

    /* JADX INFO: renamed from: f */
    public long f5186f;

    /* JADX INFO: renamed from: g */
    public long f5187g;

    /* JADX INFO: renamed from: h */
    public long f5188h;

    public zzafi(long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f5181a = j2;
        this.f5182b = j3;
        this.f5185e = j4;
        this.f5186f = j5;
        this.f5187g = j6;
        this.f5183c = j7;
        this.f5188h = m4066a(j3, 0L, j4, j5, j6, j7);
    }

    /* JADX INFO: renamed from: a */
    public static long m4066a(long j2, long j3, long j4, long j5, long j6, long j7) {
        if (j5 + 1 >= j6 || 1 + j3 >= j4) {
            return j5;
        }
        long j8 = (long) (((j6 - j5) / (j4 - j3)) * (j2 - j3));
        String str = zzfm.f16091a;
        return Math.max(j5, Math.min(((j5 + j8) - j7) - (j8 / 20), j6 - 1));
    }
}
