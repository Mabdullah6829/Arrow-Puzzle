package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbsc extends zzbem implements zzbsd {
    public zzbsc() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 != 1) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzbrw.CREATOR);
        zzben.m4818f(parcel);
        mo2942i3(arrayListCreateTypedArrayList);
        parcel2.writeNoException();
        return true;
    }
}
