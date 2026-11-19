package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbyz extends zzbel implements zzbzb {
    public zzbyz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* JADX INFO: renamed from: P3 */
    public final void mo5273P3(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeStringArray(strArr);
        parcelM4810u.writeIntArray(iArr);
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        m4811u0(5, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* JADX INFO: renamed from: X3 */
    public final void mo5274X3(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        zzben.m4815c(parcelM4810u, zzaVar);
        m4811u0(6, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* JADX INFO: renamed from: b0 */
    public final void mo5275b0(IObjectWrapper iObjectWrapper) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        m4811u0(4, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* JADX INFO: renamed from: c */
    public final void mo5276c() {
        m4811u0(3, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* JADX INFO: renamed from: q0 */
    public final void mo5277q0(Intent intent) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, intent);
        m4811u0(1, parcelM4810u);
    }
}
