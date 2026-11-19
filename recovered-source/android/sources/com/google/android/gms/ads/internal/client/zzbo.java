package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzbnm;
import com.google.android.gms.internal.ads.zzbnp;
import com.google.android.gms.internal.ads.zzbnw;

/* JADX INFO: loaded from: classes.dex */
public final class zzbo extends zzbel implements zzbq {
    public zzbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    /* JADX INFO: renamed from: C2 */
    public final void mo2828C2(zzbnw zzbnwVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, zzbnwVar);
        m4811u0(10, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    /* JADX INFO: renamed from: U3 */
    public final void mo2829U3(String str, zzbnp zzbnpVar, zzbnm zzbnmVar) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeString(str);
        zzben.m4817e(parcelM4810u, zzbnpVar);
        zzben.m4817e(parcelM4810u, zzbnmVar);
        m4811u0(5, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    /* JADX INFO: renamed from: a */
    public final zzbn mo2830a() {
        zzbn zzblVar;
        Parcel parcelM4809k0 = m4809k0(1, m4810u());
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        if (strongBinder == null) {
            zzblVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzblVar = iInterfaceQueryLocalInterface instanceof zzbn ? (zzbn) iInterfaceQueryLocalInterface : new zzbl(strongBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
        }
        parcelM4809k0.recycle();
        return zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    /* JADX INFO: renamed from: t0 */
    public final void mo2831t0(zzbma zzbmaVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, zzbmaVar);
        m4811u0(6, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    /* JADX INFO: renamed from: u2 */
    public final void mo2832u2(zzbh zzbhVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, zzbhVar);
        m4811u0(2, parcelM4810u);
    }
}
