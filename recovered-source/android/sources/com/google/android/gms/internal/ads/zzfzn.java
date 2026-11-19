package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfzn extends zzbel implements zzfzp {
    @Override // com.google.android.gms.internal.ads.zzfzp
    /* JADX INFO: renamed from: I */
    public final void mo6823I(int i2) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeInt(i2);
        m4811u0(7, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    /* JADX INFO: renamed from: a */
    public final void mo6824a() {
        m4811u0(3, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    /* JADX INFO: renamed from: e2 */
    public final void mo6825e2(ObjectWrapper objectWrapper, String str) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, objectWrapper);
        parcelM4810u.writeString(str);
        parcelM4810u.writeString(null);
        m4811u0(8, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    /* JADX INFO: renamed from: l */
    public final void mo6826l(int i2) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeInt(i2);
        m4811u0(6, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    /* JADX INFO: renamed from: l2 */
    public final void mo6827l2(byte[] bArr) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeByteArray(bArr);
        m4811u0(5, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    /* JADX INFO: renamed from: u3 */
    public final void mo6828u3() {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeIntArray(null);
        m4811u0(4, parcelM4810u);
    }
}
