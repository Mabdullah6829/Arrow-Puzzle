package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbgw extends zzbem implements zzbgx {
    public zzbgw() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            ((zzbgn) this).zzc();
        } else if (i2 == 2) {
            ((zzbgn) this).mo4876d();
        } else if (i2 == 3) {
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzben.m4818f(parcel);
            ((zzbgn) this).mo4877h0(zzeVar);
        } else if (i2 != 4 && i2 != 5) {
            return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
