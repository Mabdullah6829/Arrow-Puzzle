package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbxh extends zzbem implements zzbxi {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ int f9475s = 0;

    public zzbxh() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.google.android.gms.internal.ads.zzbxc] */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.google.android.gms.internal.ads.zzbww] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.google.android.gms.internal.ads.zzbxl] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r13v3, types: [com.google.android.gms.internal.ads.zzbxv] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.google.android.gms.internal.ads.zzbwz] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [com.google.android.gms.internal.ads.zzbxf] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [com.google.android.gms.internal.ads.zzbwt] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r16v1, types: [com.google.android.gms.internal.ads.zzbxv] */
    /* JADX WARN: Type inference failed for: r16v5, types: [com.google.android.gms.internal.ads.zzbxv] */
    /* JADX WARN: Type inference failed for: r18v1, types: [com.google.android.gms.internal.ads.zzbxf] */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.google.android.gms.internal.ads.zzbww] */
    /* JADX WARN: Type inference failed for: r21v1, types: [com.google.android.gms.internal.ads.zzbxc] */
    /* JADX WARN: Type inference failed for: r5v20, types: [com.google.android.gms.internal.ads.zzbxv] */
    /* JADX WARN: Type inference failed for: r5v27, types: [com.google.android.gms.internal.ads.zzbxv] */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.google.android.gms.internal.ads.zzbxv] */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.google.android.gms.internal.ads.zzbxv] */
    /* JADX WARN: Type inference failed for: r9v5, types: [com.google.android.gms.internal.ads.zzbxv] */
    /* JADX WARN: Type inference failed for: r9v9, types: [com.google.android.gms.internal.ads.zzbxv] */
    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) throws RemoteException {
        ?? zzbxjVar;
        ?? zzbwxVar;
        ?? zzbwrVar;
        IInterface zzbwuVar = null;
        if (i2 == 1) {
            IObjectWrapper iObjectWrapperM3696k0 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzben.m4814b(parcel, creator);
            Bundle bundle2 = (Bundle) zzben.m4814b(parcel, creator);
            com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzbxjVar = zzbwuVar;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (iInterfaceQueryLocalInterface instanceof zzbxl) {
                    zzbwuVar = (zzbxl) iInterfaceQueryLocalInterface;
                    zzbxjVar = zzbwuVar;
                } else {
                    zzbxjVar = new zzbxj(strongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                }
            }
            zzben.m4818f(parcel);
            ((zzbxv) this).mo5245b4(iObjectWrapperM3696k0, string, bundle, bundle2, zzrVar, zzbxjVar);
            parcel2.writeNoException();
            return true;
        }
        if (i2 == 2) {
            zzbxx zzbxxVarMo5244b = ((zzbxv) this).mo5244b();
            parcel2.writeNoException();
            zzben.m4816d(parcel2, zzbxxVarMo5244b);
            return true;
        }
        if (i2 == 3) {
            zzbxx zzbxxVarMo5246c = ((zzbxv) this).mo5246c();
            parcel2.writeNoException();
            zzben.m4816d(parcel2, zzbxxVarMo5246c);
            return true;
        }
        if (i2 == 5) {
            com.google.android.gms.ads.internal.client.zzea zzeaVarZzh = ((zzbxv) this).zzh();
            parcel2.writeNoException();
            zzben.m4817e(parcel2, zzeaVarZzh);
            return true;
        }
        if (i2 == 10) {
            IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
            zzben.m4818f(parcel);
            parcel2.writeNoException();
            return true;
        }
        if (i2 == 11) {
            parcel.createStringArray();
            zzben.m4818f(parcel);
            parcel2.writeNoException();
            return true;
        }
        switch (i2) {
            case 13:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IObjectWrapper iObjectWrapperM3696k1 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    zzbwuVar = iInterfaceQueryLocalInterface2 instanceof zzbww ? (zzbww) iInterfaceQueryLocalInterface2 : new zzbwu(strongBinder2);
                }
                ?? r21 = zzbwuVar;
                zzbvp zzbvpVarM5204k4 = zzbvo.m5204k4(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                zzben.m4818f(parcel);
                ((zzbxv) this).mo5242Z2(string2, string3, zzmVar, iObjectWrapperM3696k1, r21, zzbvpVarM5204k4, zzrVar2);
                parcel2.writeNoException();
                return true;
            case 14:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IObjectWrapper iObjectWrapperM3696k2 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    zzbwxVar = zzbwuVar;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    if (iInterfaceQueryLocalInterface3 instanceof zzbwz) {
                        zzbwuVar = (zzbwz) iInterfaceQueryLocalInterface3;
                        zzbwxVar = zzbwuVar;
                    } else {
                        zzbwxVar = new zzbwx(strongBinder3, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    }
                }
                zzbvp zzbvpVarM5204k5 = zzbvo.m5204k4(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                ((zzbxv) this).mo5250m2(string4, string5, zzmVar2, iObjectWrapperM3696k2, zzbwxVar, zzbvpVarM5204k5);
                parcel2.writeNoException();
                return true;
            case 15:
                IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 16:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IObjectWrapper iObjectWrapperM3696k3 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    zzbwuVar = iInterfaceQueryLocalInterface4 instanceof zzbxf ? (zzbxf) iInterfaceQueryLocalInterface4 : new zzbxd(strongBinder4);
                }
                ?? r14 = zzbwuVar;
                zzbvp zzbvpVarM5204k6 = zzbvo.m5204k4(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                ((zzbxv) this).mo5252s3(string6, string7, zzmVar3, iObjectWrapperM3696k3, r14, zzbvpVarM5204k6);
                parcel2.writeNoException();
                return true;
            case 17:
                IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 18:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IObjectWrapper iObjectWrapperM3696k4 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    zzbwuVar = iInterfaceQueryLocalInterface5 instanceof zzbxc ? (zzbxc) iInterfaceQueryLocalInterface5 : new zzbxa(strongBinder5);
                }
                ?? r10 = zzbwuVar;
                zzbvp zzbvpVarM5204k7 = zzbvo.m5204k4(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                ((zzbxv) this).mo5249k3(string8, string9, zzmVar4, iObjectWrapperM3696k4, r10, zzbvpVarM5204k7, null);
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.readString();
                zzben.m4818f(parcel);
                parcel2.writeNoException();
                return true;
            case 20:
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IObjectWrapper iObjectWrapperM3696k5 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    zzbwuVar = iInterfaceQueryLocalInterface6 instanceof zzbxf ? (zzbxf) iInterfaceQueryLocalInterface6 : new zzbxd(strongBinder6);
                }
                ?? r18 = zzbwuVar;
                zzbvp zzbvpVarM5204k8 = zzbvo.m5204k4(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                ((zzbxv) this).mo5239I1(string10, string11, zzmVar5, iObjectWrapperM3696k5, r18, zzbvpVarM5204k8);
                parcel2.writeNoException();
                return true;
            case 21:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IObjectWrapper iObjectWrapperM3696k6 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    zzbwuVar = iInterfaceQueryLocalInterface7 instanceof zzbww ? (zzbww) iInterfaceQueryLocalInterface7 : new zzbwu(strongBinder7);
                }
                ?? r11 = zzbwuVar;
                zzbvp zzbvpVarM5204k9 = zzbvo.m5204k4(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                zzben.m4818f(parcel);
                ((zzbxv) this).mo5251o3(string12, string13, zzmVar6, iObjectWrapperM3696k6, r11, zzbvpVarM5204k9, zzrVar3);
                parcel2.writeNoException();
                return true;
            case 22:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IObjectWrapper iObjectWrapperM3696k7 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    zzbwuVar = iInterfaceQueryLocalInterface8 instanceof zzbxc ? (zzbxc) iInterfaceQueryLocalInterface8 : new zzbxa(strongBinder8);
                }
                ?? r22 = zzbwuVar;
                zzbvp zzbvpVarM5204k10 = zzbvo.m5204k4(parcel.readStrongBinder());
                zzbma zzbmaVar = (zzbma) zzben.m4814b(parcel, zzbma.CREATOR);
                zzben.m4818f(parcel);
                ((zzbxv) this).mo5249k3(string14, string15, zzmVar7, iObjectWrapperM3696k7, r22, zzbvpVarM5204k10, zzbmaVar);
                parcel2.writeNoException();
                return true;
            case 23:
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IObjectWrapper iObjectWrapperM3696k8 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 == null) {
                    zzbwrVar = zzbwuVar;
                } else {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                    if (iInterfaceQueryLocalInterface9 instanceof zzbwt) {
                        zzbwuVar = (zzbwt) iInterfaceQueryLocalInterface9;
                        zzbwrVar = zzbwuVar;
                    } else {
                        zzbwrVar = new zzbwr(strongBinder9, "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                    }
                }
                zzbvp zzbvpVarM5204k11 = zzbvo.m5204k4(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                ((zzbxv) this).mo5253t3(string16, string17, zzmVar8, iObjectWrapperM3696k8, zzbwrVar, zzbvpVarM5204k11);
                parcel2.writeNoException();
                return true;
            case 24:
                IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            default:
                return false;
        }
    }
}
