package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzccg extends zzbem implements zzcch {
    public zzccg() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        switch (i2) {
            case 1:
                IObjectWrapper iObjectWrapperM3696k0 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                mo5319R0(iObjectWrapperM3696k0);
                break;
            case 2:
                IObjectWrapper iObjectWrapperM3696k1 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                zzben.m4818f(parcel);
                mo5328f0(iObjectWrapperM3696k1, i3);
                break;
            case 3:
                IObjectWrapper iObjectWrapperM3696k2 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                mo5324g0(iObjectWrapperM3696k2);
                break;
            case 4:
                IObjectWrapper iObjectWrapperM3696k3 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                mo5322b0(iObjectWrapperM3696k3);
                break;
            case 5:
                IObjectWrapper iObjectWrapperM3696k4 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                mo5320R2(iObjectWrapperM3696k4);
                break;
            case 6:
                IObjectWrapper iObjectWrapperM3696k5 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                mo5323d3(iObjectWrapperM3696k5);
                break;
            case 7:
                IObjectWrapper iObjectWrapperM3696k6 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzcci zzcciVar = (zzcci) zzben.m4814b(parcel, zzcci.CREATOR);
                zzben.m4818f(parcel);
                mo5326g4(iObjectWrapperM3696k6, zzcciVar);
                break;
            case 8:
                IObjectWrapper iObjectWrapperM3696k7 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                mo5321Y3(iObjectWrapperM3696k7);
                break;
            case 9:
                IObjectWrapper iObjectWrapperM3696k8 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                zzben.m4818f(parcel);
                mo5317M1(iObjectWrapperM3696k8, i4);
                break;
            case 10:
                IObjectWrapper iObjectWrapperM3696k9 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                mo5327N(iObjectWrapperM3696k9);
                break;
            case 11:
                IObjectWrapper iObjectWrapperM3696k10 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                mo5318Q0(iObjectWrapperM3696k10);
                break;
            case 12:
                zzben.m4818f(parcel);
                break;
            case 13:
                IObjectWrapper iObjectWrapperM3696k11 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                mo5325g2(iObjectWrapperM3696k11);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
