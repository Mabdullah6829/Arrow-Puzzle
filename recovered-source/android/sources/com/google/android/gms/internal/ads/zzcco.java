package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcco extends zzbem implements zzccp {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ int f9742s = 0;

    public zzcco() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        zzccw zzccuVar = null;
        zzccw zzccuVar2 = null;
        com.google.android.gms.ads.internal.client.zzdn zzdlVar = null;
        zzccx zzccxVar = null;
        zzccs zzccqVar = null;
        switch (i2) {
            case 1:
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzccuVar = iInterfaceQueryLocalInterface instanceof zzccw ? (zzccw) iInterfaceQueryLocalInterface : new zzccu(strongBinder);
                }
                zzben.m4818f(parcel);
                mo2964S1(zzmVar, zzccuVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzccqVar = iInterfaceQueryLocalInterface2 instanceof zzccs ? (zzccs) iInterfaceQueryLocalInterface2 : new zzccq(strongBinder2, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                }
                zzben.m4818f(parcel);
                mo2974u1(zzccqVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzi = zzi();
                parcel2.writeNoException();
                ClassLoader classLoader = zzben.f7689a;
                parcel2.writeInt(zZzi ? 1 : 0);
                return true;
            case 4:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 5:
                IObjectWrapper iObjectWrapperM3696k0 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                mo2971n2(iObjectWrapperM3696k0);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzccxVar = iInterfaceQueryLocalInterface3 instanceof zzccx ? (zzccx) iInterfaceQueryLocalInterface3 : new zzccx(strongBinder3, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                }
                zzben.m4818f(parcel);
                mo2962J3(zzccxVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzcdd zzcddVar = (zzcdd) zzben.m4814b(parcel, zzcdd.CREATOR);
                zzben.m4818f(parcel);
                mo2963K3(zzcddVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                    zzdlVar = iInterfaceQueryLocalInterface4 instanceof com.google.android.gms.ads.internal.client.zzdn ? (com.google.android.gms.ads.internal.client.zzdn) iInterfaceQueryLocalInterface4 : new com.google.android.gms.ads.internal.client.zzdl(strongBinder4, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                }
                zzben.m4818f(parcel);
                mo2972q2(zzdlVar);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleMo2966c = mo2966c();
                parcel2.writeNoException();
                zzben.m4816d(parcel2, bundleMo2966c);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperM3696k1 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                ClassLoader classLoader2 = zzben.f7689a;
                boolean z = parcel.readInt() != 0;
                zzben.m4818f(parcel);
                mo2960A0(iObjectWrapperM3696k1, z);
                parcel2.writeNoException();
                return true;
            case 11:
                zzccm zzccmVarZzl = zzl();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzccmVarZzl);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzdx zzdxVarMo2967e = mo2967e();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzdxVarMo2967e);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdq zzdqVarM2914k4 = com.google.android.gms.ads.internal.client.zzdp.m2914k4(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                mo2965U1(zzdqVarM2914k4);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzccuVar2 = iInterfaceQueryLocalInterface5 instanceof zzccw ? (zzccw) iInterfaceQueryLocalInterface5 : new zzccu(strongBinder5);
                }
                zzben.m4818f(parcel);
                mo2973t1(zzmVar2, zzccuVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zM4813a = zzben.m4813a(parcel);
                zzben.m4818f(parcel);
                mo2970h4(zM4813a);
                parcel2.writeNoException();
                return true;
            case 16:
                String strMo2969g = mo2969g();
                parcel2.writeNoException();
                parcel2.writeString(strMo2969g);
                return true;
            case 17:
                long jMo2968f = mo2968f();
                parcel2.writeNoException();
                parcel2.writeLong(jMo2968f);
                return true;
            case 18:
                long j2 = parcel.readLong();
                zzben.m4818f(parcel);
                mo2961H2(j2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
