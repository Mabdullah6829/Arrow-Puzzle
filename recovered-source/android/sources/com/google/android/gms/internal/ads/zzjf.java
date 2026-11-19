package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjf {

    /* JADX INFO: renamed from: a */
    public final long f20093a;

    /* JADX INFO: renamed from: b */
    public final long f20094b;

    /* JADX INFO: renamed from: c */
    public long f20095c = -9223372036854775807L;

    /* JADX INFO: renamed from: d */
    public long f20096d = -9223372036854775807L;

    /* JADX INFO: renamed from: f */
    public long f20098f = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f20099g = -9223372036854775807L;

    /* JADX INFO: renamed from: i */
    public float f20101i = 1.0f;

    /* JADX INFO: renamed from: j */
    public long f20102j = -9223372036854775807L;

    /* JADX INFO: renamed from: e */
    public long f20097e = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f20100h = -9223372036854775807L;

    /* JADX INFO: renamed from: k */
    public long f20103k = -9223372036854775807L;

    /* JADX INFO: renamed from: l */
    public long f20104l = -9223372036854775807L;

    public /* synthetic */ zzjf(long j2, long j3) {
        this.f20093a = j2;
        this.f20094b = j3;
    }

    /* JADX INFO: renamed from: a */
    public final void m8610a() {
        long j2 = this.f20100h;
        if (j2 == -9223372036854775807L) {
            return;
        }
        long j3 = j2 + this.f20094b;
        this.f20100h = j3;
        long j4 = this.f20099g;
        if (j4 != -9223372036854775807L && j3 > j4) {
            this.f20100h = j4;
        }
        this.f20102j = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: b */
    public final long m8611b() {
        return this.f20100h;
    }

    /* JADX INFO: renamed from: c */
    public final void m8612c() {
        long j2;
        long j3 = this.f20095c;
        if (j3 != -9223372036854775807L) {
            j2 = this.f20096d;
            if (j2 == -9223372036854775807L) {
                long j4 = this.f20098f;
                if (j4 != -9223372036854775807L && j3 < j4) {
                    j3 = j4;
                }
                j2 = this.f20099g;
                if (j2 == -9223372036854775807L || j3 <= j2) {
                    j2 = j3;
                }
            }
        } else {
            j2 = -9223372036854775807L;
        }
        if (this.f20097e == j2) {
            return;
        }
        this.f20097e = j2;
        this.f20100h = j2;
        this.f20103k = -9223372036854775807L;
        this.f20104l = -9223372036854775807L;
        this.f20102j = -9223372036854775807L;
    }
}
