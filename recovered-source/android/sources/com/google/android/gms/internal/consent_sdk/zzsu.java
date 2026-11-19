package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
final class zzsu extends zzsv {
    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    /* JADX INFO: renamed from: a */
    public final double mo9279a(long j2, Object obj) {
        return Double.longBitsToDouble(this.f21822a.getLong(obj, j2));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    /* JADX INFO: renamed from: b */
    public final float mo9280b(long j2, Object obj) {
        return Float.intBitsToFloat(this.f21822a.getInt(obj, j2));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    /* JADX INFO: renamed from: c */
    public final void mo9281c(Object obj, long j2, byte b) {
        if (zzsw.f21829g) {
            zzsw.m9285c(obj, j2, b);
        } else {
            zzsw.m9286d(obj, j2, b);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    /* JADX INFO: renamed from: d */
    public final boolean mo9282d(long j2, Object obj) {
        return zzsw.f21829g ? zzsw.m9293k(j2, obj) : zzsw.m9294l(j2, obj);
    }
}
