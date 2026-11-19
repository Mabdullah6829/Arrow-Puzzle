package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbmk extends zzbem implements zzbml {
    public zzbmk() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* JADX INFO: renamed from: k4 */
    public static zzbml m5066k4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof zzbml ? (zzbml) iInterfaceQueryLocalInterface : new zzbmj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        switch (i2) {
            case 1:
                IObjectWrapper iObjectWrapperZzb = ((zzblw) this).zzb();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, iObjectWrapperZzb);
                return true;
            case 2:
                parcel2.writeNoException();
                zzben.m4816d(parcel2, ((zzblw) this).f9153t);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeDouble(((zzblw) this).f9154u);
                return true;
            case 4:
                parcel2.writeNoException();
                parcel2.writeInt(((zzblw) this).f9155v);
                return true;
            case 5:
                parcel2.writeNoException();
                parcel2.writeInt(((zzblw) this).f9156w);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeMap(((zzblw) this).f9157x);
                return true;
            default:
                return false;
        }
    }
}
