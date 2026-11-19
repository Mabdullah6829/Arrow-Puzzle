package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzage extends zzagf {
    @Override // com.google.android.gms.internal.measurement.zzagf
    /* JADX INFO: renamed from: a */
    public final void mo9691a(Object obj, long j2, byte b) {
        if (zzagg.f22133f) {
            zzagg.m9699b(obj, j2, b);
        } else {
            zzagg.m9700c(obj, j2, b);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzagf
    /* JADX INFO: renamed from: b */
    public final boolean mo9692b(long j2, Object obj) {
        return zzagg.f22133f ? zzagg.m9711n(j2, obj) : zzagg.m9712o(j2, obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzagf
    /* JADX INFO: renamed from: c */
    public final void mo9693c(Object obj, long j2, boolean z) {
        if (zzagg.f22133f) {
            zzagg.m9699b(obj, j2, z ? (byte) 1 : (byte) 0);
        } else {
            zzagg.m9700c(obj, j2, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzagf
    /* JADX INFO: renamed from: d */
    public final float mo9694d(long j2, Object obj) {
        return Float.intBitsToFloat(this.f22127a.getInt(obj, j2));
    }

    @Override // com.google.android.gms.internal.measurement.zzagf
    /* JADX INFO: renamed from: e */
    public final void mo9695e(Object obj, long j2, float f2) {
        this.f22127a.putInt(obj, j2, Float.floatToIntBits(f2));
    }

    @Override // com.google.android.gms.internal.measurement.zzagf
    /* JADX INFO: renamed from: f */
    public final double mo9696f(long j2, Object obj) {
        return Double.longBitsToDouble(this.f22127a.getLong(obj, j2));
    }

    @Override // com.google.android.gms.internal.measurement.zzagf
    /* JADX INFO: renamed from: g */
    public final void mo9697g(Object obj, long j2, double d) {
        this.f22127a.putLong(obj, j2, Double.doubleToLongBits(d));
    }
}
