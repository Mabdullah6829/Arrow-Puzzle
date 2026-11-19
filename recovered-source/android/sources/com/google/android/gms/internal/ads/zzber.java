package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzber extends zzbel implements zzbet {
    @Override // com.google.android.gms.internal.ads.zzbet
    /* JADX INFO: renamed from: I */
    public final void mo4820I(int i2) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeInt(0);
        m4811u0(6, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    /* JADX INFO: renamed from: O2 */
    public final void mo4821O2(ObjectWrapper objectWrapper) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, objectWrapper);
        parcelM4810u.writeString("GMA_SDK");
        m4811u0(2, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    /* JADX INFO: renamed from: P2 */
    public final void mo4822P2(byte[] bArr) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeByteArray(bArr);
        m4811u0(5, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    /* JADX INFO: renamed from: R */
    public final void mo4823R(int i2) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeInt(i2);
        m4811u0(7, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    /* JADX INFO: renamed from: S0 */
    public final void mo4824S0() {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeIntArray(null);
        m4811u0(4, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    /* JADX INFO: renamed from: b */
    public final void mo4825b() {
        m4811u0(3, m4810u());
    }
}
