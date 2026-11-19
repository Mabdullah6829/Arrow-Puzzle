package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzcr extends zzbem implements zzcs {
    public zzcr() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            zze zzeVar = (zze) zzben.m4814b(parcel, zze.CREATOR);
            zzben.m4818f(parcel);
            ((zzbb) this).mo2816z2(zzeVar);
        } else if (i2 == 2) {
            ((zzbb) this).zzc();
        } else if (i2 == 3) {
            ((zzbb) this).mo2815d();
        } else if (i2 != 4 && i2 != 5) {
            return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
