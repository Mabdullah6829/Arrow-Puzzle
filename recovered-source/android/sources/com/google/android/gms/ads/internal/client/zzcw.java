package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbrw;
import com.google.android.gms.internal.ads.zzbsd;
import com.google.android.gms.internal.ads.zzbvj;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzcw extends zzbel implements zzcy {
    public zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: H0 */
    public final void mo2890H0(IObjectWrapper iObjectWrapper, String str) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeString(null);
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        m4811u0(6, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: M2 */
    public final void mo2891M2(zzbvj zzbvjVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, zzbvjVar);
        m4811u0(11, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: W0 */
    public final void mo2892W0(zzbsd zzbsdVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, zzbsdVar);
        m4811u0(12, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: X2 */
    public final void mo2893X2(zzfr zzfrVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, zzfrVar);
        m4811u0(14, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: a */
    public final void mo2894a() {
        m4811u0(1, m4810u());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: c0 */
    public final void mo2895c0(String str) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeString(str);
        m4811u0(18, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: f */
    public final List mo2896f() {
        Parcel parcelM4809k0 = m4809k0(13, m4810u());
        ArrayList arrayListCreateTypedArrayList = parcelM4809k0.createTypedArrayList(zzbrw.CREATOR);
        parcelM4809k0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: z */
    public final void mo2897z() {
        m4811u0(19, m4810u());
    }
}
