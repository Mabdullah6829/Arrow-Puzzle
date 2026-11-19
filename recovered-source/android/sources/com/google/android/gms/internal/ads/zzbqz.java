package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbqz extends zzbem implements zzbra {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ int f9287s = 0;

    public zzbqz() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            String string = parcel.readString();
            zzben.m4818f(parcel);
            mo5119y(string);
        } else {
            if (i2 != 2) {
                return false;
            }
            mo5120b();
        }
        parcel2.writeNoException();
        return true;
    }
}
