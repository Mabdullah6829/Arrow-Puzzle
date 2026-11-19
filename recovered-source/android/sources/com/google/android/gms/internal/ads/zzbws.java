package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbws extends zzbem implements zzbwt {
    public zzbws() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 2) {
            ((zzenp) ((zzemr) this).f14243s.f14193c).zzj();
        } else if (i2 == 3) {
            String string = parcel.readString();
            zzben.m4818f(parcel);
            ((zzenp) ((zzemr) this).f14243s.f14193c).mo5198f4(0, string);
        } else {
            if (i2 != 4) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzben.m4818f(parcel);
            ((zzemr) this).mo5234q(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
