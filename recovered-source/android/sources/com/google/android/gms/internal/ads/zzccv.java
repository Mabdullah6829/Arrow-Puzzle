package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzccv extends zzbem implements zzccw {
    public zzccv() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            mo5338a();
        } else if (i2 == 2) {
            int i3 = parcel.readInt();
            zzben.m4818f(parcel);
            mo5339o(i3);
        } else {
            if (i2 != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzben.m4818f(parcel);
            mo5340q(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
