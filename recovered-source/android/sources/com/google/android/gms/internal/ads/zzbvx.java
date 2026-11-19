package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbvx extends zzbem implements zzbvy {
    public zzbvx() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        switch (i2) {
            case 2:
                String strMo5216a = mo5216a();
                parcel2.writeNoException();
                parcel2.writeString(strMo5216a);
                return true;
            case 3:
                List listMo5217b = mo5217b();
                parcel2.writeNoException();
                parcel2.writeList(listMo5217b);
                return true;
            case 4:
                String strMo5218c = mo5218c();
                parcel2.writeNoException();
                parcel2.writeString(strMo5218c);
                return true;
            case 5:
                zzbml zzbmlVarZzh = zzh();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzbmlVarZzh);
                return true;
            case 6:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 7:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 8:
                double dZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzk);
                return true;
            case 9:
                String strZzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                return true;
            case 10:
                String strMo5219e = mo5219e();
                parcel2.writeNoException();
                parcel2.writeString(strMo5219e);
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzea zzeaVarMo5221g = mo5221g();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzeaVarMo5221g);
                return true;
            case 12:
                parcel2.writeNoException();
                ClassLoader classLoader = zzben.f7689a;
                parcel2.writeStrongBinder(null);
                return true;
            case 13:
                IObjectWrapper iObjectWrapperMo5222i = mo5222i();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, iObjectWrapperMo5222i);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperMo5220f = mo5220f();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, iObjectWrapperMo5220f);
                return true;
            case 15:
                IObjectWrapper iObjectWrapperMo5224n = mo5224n();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, iObjectWrapperMo5224n);
                return true;
            case 16:
                Bundle bundleMo5209A3 = mo5209A3();
                parcel2.writeNoException();
                zzben.m4816d(parcel2, bundleMo5209A3);
                return true;
            case 17:
                boolean zMo5225r = mo5225r();
                parcel2.writeNoException();
                ClassLoader classLoader2 = zzben.f7689a;
                parcel2.writeInt(zMo5225r ? 1 : 0);
                return true;
            case 18:
                boolean zMo5212F1 = mo5212F1();
                parcel2.writeNoException();
                ClassLoader classLoader3 = zzben.f7689a;
                parcel2.writeInt(zMo5212F1 ? 1 : 0);
                return true;
            case 19:
                mo5227v();
                parcel2.writeNoException();
                return true;
            case 20:
                IObjectWrapper iObjectWrapperM3696k0 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                mo5214W(iObjectWrapperM3696k0);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper iObjectWrapperM3696k1 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperM3696k2 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperM3696k3 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                mo5215X0(iObjectWrapperM3696k1, iObjectWrapperM3696k2, iObjectWrapperM3696k3);
                parcel2.writeNoException();
                return true;
            case 22:
                IObjectWrapper iObjectWrapperM3696k4 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                mo5213G1(iObjectWrapperM3696k4);
                parcel2.writeNoException();
                return true;
            case 23:
                float fMo5228x = mo5228x();
                parcel2.writeNoException();
                parcel2.writeFloat(fMo5228x);
                return true;
            case 24:
                float fMo5211C = mo5211C();
                parcel2.writeNoException();
                parcel2.writeFloat(fMo5211C);
                return true;
            case 25:
                float fMo5226t = mo5226t();
                parcel2.writeNoException();
                parcel2.writeFloat(fMo5226t);
                return true;
            case 26:
                mo5210B();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
