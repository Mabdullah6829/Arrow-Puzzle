package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbmn extends zzbel implements zzbmp {
    public zzbmn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    /* JADX INFO: renamed from: D */
    public final IObjectWrapper mo2951D(String str) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeString(str);
        return AbstractC1456a.m2439f(m4809k0(2, parcelM4810u));
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    /* JADX INFO: renamed from: L2 */
    public final void mo2952L2(IObjectWrapper iObjectWrapper) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        m4811u0(6, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    /* JADX INFO: renamed from: X1 */
    public final void mo2953X1(IObjectWrapper iObjectWrapper) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        m4811u0(7, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    /* JADX INFO: renamed from: f0 */
    public final void mo2955f0(IObjectWrapper iObjectWrapper, int i2) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        parcelM4810u.writeInt(i2);
        m4811u0(5, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    /* JADX INFO: renamed from: j2 */
    public final void mo2956j2(zzbmi zzbmiVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, zzbmiVar);
        m4811u0(8, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    /* JADX INFO: renamed from: p3 */
    public final void mo2957p3(IObjectWrapper iObjectWrapper) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        m4811u0(3, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    /* JADX INFO: renamed from: s0 */
    public final void mo2958s0(IObjectWrapper iObjectWrapper, String str) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeString(str);
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        m4811u0(1, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    /* JADX INFO: renamed from: z1 */
    public final void mo2959z1(IObjectWrapper iObjectWrapper) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        m4811u0(9, parcelM4810u);
    }
}
