package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbem;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzdm extends zzbem implements zzdn {
    public zzdm() {
        super("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 != 1) {
            return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
