package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbvh extends zzbel implements zzbvj {
    @Override // com.google.android.gms.internal.ads.zzbvj
    /* JADX INFO: renamed from: D */
    public final boolean mo5152D(String str) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeString(str);
        Parcel parcelM4809k0 = m4809k0(2, parcelM4810u);
        ClassLoader classLoader = zzben.f7689a;
        boolean z = parcelM4809k0.readInt() != 0;
        parcelM4809k0.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    /* JADX INFO: renamed from: G */
    public final boolean mo5153G(String str) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeString(str);
        Parcel parcelM4809k0 = m4809k0(4, parcelM4810u);
        ClassLoader classLoader = zzben.f7689a;
        boolean z = parcelM4809k0.readInt() != 0;
        parcelM4809k0.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    /* JADX INFO: renamed from: m */
    public final zzbvm mo5154m(String str) {
        zzbvm zzbvkVar;
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeString(str);
        Parcel parcelM4809k0 = m4809k0(1, parcelM4810u);
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        if (strongBinder == null) {
            zzbvkVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzbvkVar = iInterfaceQueryLocalInterface instanceof zzbvm ? (zzbvm) iInterfaceQueryLocalInterface : new zzbvk(strongBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        }
        parcelM4809k0.recycle();
        return zzbvkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    /* JADX INFO: renamed from: y */
    public final zzbxi mo5155y(String str) {
        zzbxi zzbxgVar;
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeString(str);
        Parcel parcelM4809k0 = m4809k0(3, parcelM4810u);
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        int i2 = zzbxh.f9475s;
        if (strongBinder == null) {
            zzbxgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
            zzbxgVar = iInterfaceQueryLocalInterface instanceof zzbxi ? (zzbxi) iInterfaceQueryLocalInterface : new zzbxg(strongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        }
        parcelM4809k0.recycle();
        return zzbxgVar;
    }
}
