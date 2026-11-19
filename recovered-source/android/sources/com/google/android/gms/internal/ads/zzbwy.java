package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbwy extends zzbem implements zzbwz {
    public zzbwy() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 2) {
            ((zzenp) ((zzeoc) this).f14371s.f14193c).zzj();
        } else if (i2 == 3) {
            String string = parcel.readString();
            zzben.m4818f(parcel);
            ((zzenp) ((zzeoc) this).f14371s.f14193c).mo5198f4(0, string);
        } else {
            if (i2 != 4) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzben.m4818f(parcel);
            ((zzeoc) this).mo5236q(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
