package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;

/* JADX INFO: loaded from: classes2.dex */
public interface zznc extends zzmx {
    /* JADX INFO: renamed from: A */
    default void mo3978A() {
    }

    /* JADX INFO: renamed from: G */
    boolean mo3982G();

    /* JADX INFO: renamed from: Q */
    boolean mo3994Q();

    /* JADX INFO: renamed from: R */
    void mo8582R();

    /* JADX INFO: renamed from: S */
    void mo3995S(long j2, long j3);

    /* JADX INFO: renamed from: T */
    void mo8583T(zznf zznfVar, zzv[] zzvVarArr, zzzd zzzdVar, boolean z, boolean z2, long j2, long j3, zzxl zzxlVar);

    /* JADX INFO: renamed from: U */
    default long mo8767U(long j2, long j3) {
        if (mo8587a() != 1) {
            return WorkRequest.MIN_BACKOFF_MILLIS;
        }
        if (mo3994Q() || mo3982G()) {
            return 1000000L;
        }
        return WorkRequest.MIN_BACKOFF_MILLIS;
    }

    /* JADX INFO: renamed from: V */
    void mo8584V(zzbf zzbfVar);

    /* JADX INFO: renamed from: W */
    default boolean mo3999W(long j2) {
        return false;
    }

    /* JADX INFO: renamed from: X */
    default void mo4000X(float f2, float f3) {
    }

    /* JADX INFO: renamed from: Y */
    void mo8585Y(boolean z, long j2);

    /* JADX INFO: renamed from: Z */
    void mo8586Z(zzv[] zzvVarArr, zzzd zzzdVar, long j2, long j3, zzxl zzxlVar);

    /* JADX INFO: renamed from: a */
    int mo8587a();

    /* JADX INFO: renamed from: a0 */
    zzzd mo8588a0();

    /* JADX INFO: renamed from: b0 */
    void mo8589b0(int i2, zzqh zzqhVar, zzdp zzdpVar);

    /* JADX INFO: renamed from: c0 */
    boolean mo8590c0();

    /* JADX INFO: renamed from: d */
    zzmd mo8591d();

    /* JADX INFO: renamed from: e */
    boolean mo8592e();

    /* JADX INFO: renamed from: f */
    void mo8593f();

    /* JADX INFO: renamed from: g */
    void mo8594g();

    /* JADX INFO: renamed from: h */
    void mo8595h();

    /* JADX INFO: renamed from: n */
    void mo8598n();

    /* JADX INFO: renamed from: o */
    String mo4011o();

    /* JADX INFO: renamed from: r */
    default void mo8599r() {
    }

    int zza();

    zziz zzb();

    long zzk();

    void zzl();
}
