package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbsn extends zzbem implements zzbso {
    public zzbsn() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 != 1) {
            if (i2 != 2) {
                return false;
            }
            parcel.readInt();
            zzben.m4818f(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
