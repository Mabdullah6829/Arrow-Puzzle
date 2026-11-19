package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbny extends zzbem implements zzbnz {
    public zzbny() {
        super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 != 1) {
            if (i2 != 2) {
                return false;
            }
            throw null;
        }
        parcel.readString();
        zzben.m4818f(parcel);
        throw null;
    }
}
