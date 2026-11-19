package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzdz extends zzbem implements zzea {
    public zzdz() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* JADX INFO: renamed from: k4 */
    public static zzea m2924k4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof zzea ? (zzea) iInterfaceQueryLocalInterface : new zzdy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        zzed zzebVar;
        switch (i2) {
            case 1:
                mo2928a();
                parcel2.writeNoException();
                return true;
            case 2:
                mo2929b();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zM4813a = zzben.m4813a(parcel);
                zzben.m4818f(parcel);
                mo2932o0(zM4813a);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zZzh = zzh();
                parcel2.writeNoException();
                ClassLoader classLoader = zzben.f7689a;
                parcel2.writeInt(zZzh ? 1 : 0);
                return true;
            case 5:
                int iZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeInt(iZzi);
                return true;
            case 6:
                float fZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzj);
                return true;
            case 7:
                float fZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzk);
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzebVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    zzebVar = iInterfaceQueryLocalInterface instanceof zzed ? (zzed) iInterfaceQueryLocalInterface : new zzeb(strongBinder);
                }
                zzben.m4818f(parcel);
                mo2921K2(zzebVar);
                parcel2.writeNoException();
                return true;
            case 9:
                float fMo2922e = mo2922e();
                parcel2.writeNoException();
                parcel2.writeFloat(fMo2922e);
                return true;
            case 10:
                boolean zMo2930g = mo2930g();
                parcel2.writeNoException();
                ClassLoader classLoader2 = zzben.f7689a;
                parcel2.writeInt(zMo2930g ? 1 : 0);
                return true;
            case 11:
                zzed zzedVarMo2923j = mo2923j();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzedVarMo2923j);
                return true;
            case 12:
                boolean zMo2931i = mo2931i();
                parcel2.writeNoException();
                ClassLoader classLoader3 = zzben.f7689a;
                parcel2.writeInt(zMo2931i ? 1 : 0);
                return true;
            case 13:
                mo2927F();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
