package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbrn extends zzbem implements zzbro {
    public zzbrn() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzben.m4814b(parcel, ParcelFileDescriptor.CREATOR);
        zzben.m4818f(parcel);
        ((zzbrq) this).f9301s.m5397a(parcelFileDescriptor);
        return true;
    }
}
