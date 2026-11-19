package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzca extends zzbem implements zzcb {
    public zzca() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            zzfp zzfpVar = (zzfp) zzben.m4814b(parcel, zzfp.CREATOR);
            zzben.m4818f(parcel);
            ((zzen) this).mo2882Z1(zzfpVar);
        } else {
            if (i2 != 2) {
                return false;
            }
            zzfp zzfpVar2 = (zzfp) zzben.m4814b(parcel, zzfp.CREATOR);
            zzben.m4818f(parcel);
            ((zzen) this).mo2883z0(zzfpVar2);
        }
        parcel2.writeNoException();
        return true;
    }
}
