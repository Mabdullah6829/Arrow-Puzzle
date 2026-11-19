package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbxb extends zzbem implements zzbxc {
    public zzbxb() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        zzbvy zzbvwVar;
        if (i2 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzbvwVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
                zzbvwVar = iInterfaceQueryLocalInterface instanceof zzbvy ? (zzbvy) iInterfaceQueryLocalInterface : new zzbvw(strongBinder);
            }
            zzben.m4818f(parcel);
            zzeoq zzeoqVar = (zzeoq) this;
            zzeoqVar.f14415t.f14418c = zzbvwVar;
            ((zzenp) zzeoqVar.f14414s.f14193c).zzj();
        } else if (i2 == 2) {
            String string = parcel.readString();
            zzben.m4818f(parcel);
            ((zzenp) ((zzeoq) this).f14414s.f14193c).mo5198f4(0, string);
        } else {
            if (i2 != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzben.m4818f(parcel);
            ((zzeoq) this).mo5237q(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
