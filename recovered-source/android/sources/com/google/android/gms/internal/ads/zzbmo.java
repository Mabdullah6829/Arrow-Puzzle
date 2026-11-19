package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbmo extends zzbem implements zzbmp {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ int f9182s = 0;

    public zzbmo() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        zzbmi zzbmgVar;
        switch (i2) {
            case 1:
                String string = parcel.readString();
                IObjectWrapper iObjectWrapperM3696k0 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                mo2958s0(iObjectWrapperM3696k0, string);
                parcel2.writeNoException();
                return true;
            case 2:
                String string2 = parcel.readString();
                zzben.m4818f(parcel);
                IObjectWrapper iObjectWrapperMo2951D = mo2951D(string2);
                parcel2.writeNoException();
                zzben.m4817e(parcel2, iObjectWrapperMo2951D);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperM3696k1 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                mo2957p3(iObjectWrapperM3696k1);
                parcel2.writeNoException();
                return true;
            case 4:
                mo2954a();
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                parcel.readInt();
                zzben.m4818f(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper iObjectWrapperM3696k2 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                mo2952L2(iObjectWrapperM3696k2);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper iObjectWrapperM3696k3 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                mo2953X1(iObjectWrapperM3696k3);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbmgVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    zzbmgVar = iInterfaceQueryLocalInterface instanceof zzbmi ? (zzbmi) iInterfaceQueryLocalInterface : new zzbmg(strongBinder);
                }
                zzben.m4818f(parcel);
                mo2956j2(zzbmgVar);
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper iObjectWrapperM3696k4 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                mo2959z1(iObjectWrapperM3696k4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
