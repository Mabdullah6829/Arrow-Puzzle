package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzccl extends zzbem implements zzccm {
    public zzccl() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(((zzcdg) this).f9760s);
            return true;
        }
        if (i2 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(((zzcdg) this).f9761t);
        return true;
    }
}
