package com.google.android.gms.internal.ads;

import libcore.io.Memory;

/* JADX INFO: loaded from: classes2.dex */
final class zzihh extends zzihj {
    @Override // com.google.android.gms.internal.ads.zzihj
    /* JADX INFO: renamed from: a */
    public final void mo8459a(Object obj, long j2, byte b) {
        if (zzihk.f19909g) {
            zzihk.m8470d(obj, j2, b);
        } else {
            zzihk.m8471e(obj, j2, b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    /* JADX INFO: renamed from: b */
    public final boolean mo8460b(long j2, Object obj) {
        return zzihk.f19909g ? zzihk.m8483q(j2, obj) : zzihk.m8484r(j2, obj);
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    /* JADX INFO: renamed from: c */
    public final void mo8461c(Object obj, long j2, boolean z) {
        if (zzihk.f19909g) {
            zzihk.m8470d(obj, j2, z ? (byte) 1 : (byte) 0);
        } else {
            zzihk.m8471e(obj, j2, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    /* JADX INFO: renamed from: d */
    public final float mo8462d(long j2, Object obj) {
        return Float.intBitsToFloat(this.f19902a.getInt(obj, j2));
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    /* JADX INFO: renamed from: e */
    public final void mo8463e(Object obj, long j2, float f2) {
        this.f19902a.putInt(obj, j2, Float.floatToIntBits(f2));
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    /* JADX INFO: renamed from: f */
    public final double mo8464f(long j2, Object obj) {
        return Double.longBitsToDouble(this.f19902a.getLong(obj, j2));
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    /* JADX INFO: renamed from: g */
    public final void mo8465g(Object obj, long j2, double d) {
        this.f19902a.putLong(obj, j2, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    /* JADX INFO: renamed from: h */
    public final byte mo8466h(long j2) {
        return Memory.peekByte((int) j2);
    }
}
