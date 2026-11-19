package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbvi extends zzbem implements zzbvj {
    public zzbvi() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* JADX INFO: renamed from: k4 */
    public static zzbvj m5157k4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof zzbvj ? (zzbvj) iInterfaceQueryLocalInterface : new zzbvh(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i2 == 1) {
            String string = parcel.readString();
            zzben.m4818f(parcel);
            zzbvm zzbvmVarMo5154m = ((zzbvf) this).mo5154m(string);
            parcel2.writeNoException();
            zzben.m4817e(parcel2, zzbvmVarMo5154m);
            return true;
        }
        if (i2 == 2) {
            String string2 = parcel.readString();
            zzben.m4818f(parcel);
            boolean zMo5152D = ((zzbvf) this).mo5152D(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zMo5152D ? 1 : 0);
            return true;
        }
        if (i2 == 3) {
            String string3 = parcel.readString();
            zzben.m4818f(parcel);
            zzbxi zzbxiVarMo5155y = ((zzbvf) this).mo5155y(string3);
            parcel2.writeNoException();
            zzben.m4817e(parcel2, zzbxiVarMo5155y);
            return true;
        }
        if (i2 != 4) {
            return false;
        }
        String string4 = parcel.readString();
        zzben.m4818f(parcel);
        boolean zMo5153G = ((zzbvf) this).mo5153G(string4);
        parcel2.writeNoException();
        parcel2.writeInt(zMo5153G ? 1 : 0);
        return true;
    }
}
