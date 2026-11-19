package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcbv extends zzbem implements zzcbw {
    public zzcbv() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(((zzcbt) this).f9736s);
            return true;
        }
        if (i2 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(((zzcbt) this).f9737t);
        return true;
    }
}
