package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzdcs;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzdw extends zzbem implements zzdx {
    public zzdw() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    /* JADX INFO: renamed from: k4 */
    public static zzdx m2920k4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return iInterfaceQueryLocalInterface instanceof zzdx ? (zzdx) iInterfaceQueryLocalInterface : new zzdv(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        switch (i2) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeString(((zzdcs) this).f12046s);
                return true;
            case 2:
                parcel2.writeNoException();
                parcel2.writeString(((zzdcs) this).f12047t);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeTypedList(((zzdcs) this).f12050w);
                return true;
            case 4:
                zzv zzvVarZzh = ((zzdcs) this).zzh();
                parcel2.writeNoException();
                zzben.m4816d(parcel2, zzvVarZzh);
                return true;
            case 5:
                parcel2.writeNoException();
                zzben.m4816d(parcel2, ((zzdcs) this).f12043A);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeString(((zzdcs) this).f12048u);
                return true;
            default:
                return false;
        }
    }
}
