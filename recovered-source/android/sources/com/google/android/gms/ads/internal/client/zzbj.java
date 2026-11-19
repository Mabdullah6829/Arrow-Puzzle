package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbj extends zzbem implements zzbk {
    public zzbj() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            zzb();
        } else {
            if (i2 != 2) {
                return false;
            }
            zze zzeVar = (zze) zzben.m4814b(parcel, zze.CREATOR);
            zzben.m4818f(parcel);
            mo2823l0(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
