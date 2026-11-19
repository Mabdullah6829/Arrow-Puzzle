package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbsb;
import com.google.android.gms.internal.ads.zzbsd;
import com.google.android.gms.internal.ads.zzbvi;
import com.google.android.gms.internal.ads.zzbvj;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzcx extends zzbem implements zzcy {
    public zzcx() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        zzbsd zzbsbVar = null;
        zzdk zzdiVar = null;
        switch (i2) {
            case 1:
                mo2894a();
                parcel2.writeNoException();
                return true;
            case 2:
                float f2 = parcel.readFloat();
                zzben.m4818f(parcel);
                mo2905w1(f2);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                zzben.m4818f(parcel);
                mo2900c3(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zM4813a = zzben.m4813a(parcel);
                zzben.m4818f(parcel);
                mo2903i0(zM4813a);
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper iObjectWrapperM3696k0 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                String string2 = parcel.readString();
                zzben.m4818f(parcel);
                mo2904q1(iObjectWrapperM3696k0, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                IObjectWrapper iObjectWrapperM3696k1 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                mo2890H0(iObjectWrapperM3696k1, string3);
                parcel2.writeNoException();
                return true;
            case 7:
                float fZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzk);
                return true;
            case 8:
                boolean zZzl = zzl();
                parcel2.writeNoException();
                ClassLoader classLoader = zzben.f7689a;
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 9:
                String strMo2901e = mo2901e();
                parcel2.writeNoException();
                parcel2.writeString(strMo2901e);
                return true;
            case 10:
                String string4 = parcel.readString();
                zzben.m4818f(parcel);
                zzn(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbvj zzbvjVarM5157k4 = zzbvi.m5157k4(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                mo2891M2(zzbvjVarM5157k4);
                parcel2.writeNoException();
                return true;
            case 12:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
                    zzbsbVar = iInterfaceQueryLocalInterface instanceof zzbsd ? (zzbsd) iInterfaceQueryLocalInterface : new zzbsb(strongBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
                }
                zzben.m4818f(parcel);
                mo2892W0(zzbsbVar);
                parcel2.writeNoException();
                return true;
            case 13:
                List listMo2896f = mo2896f();
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo2896f);
                return true;
            case 14:
                zzfr zzfrVar = (zzfr) zzben.m4814b(parcel, zzfr.CREATOR);
                zzben.m4818f(parcel);
                mo2893X2(zzfrVar);
                parcel2.writeNoException();
                return true;
            case 15:
                mo2902h();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    zzdiVar = iInterfaceQueryLocalInterface2 instanceof zzdk ? (zzdk) iInterfaceQueryLocalInterface2 : new zzdi(strongBinder2, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                }
                zzben.m4818f(parcel);
                mo2898C1(zzdiVar);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zM4813a2 = zzben.m4813a(parcel);
                zzben.m4818f(parcel);
                mo2899V(zM4813a2);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                zzben.m4818f(parcel);
                mo2895c0(string5);
                parcel2.writeNoException();
                return true;
            case 19:
                mo2897z();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
