package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbvl extends zzbem implements zzbvm {
    public zzbvl() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) throws RemoteException {
        zzcch zzccfVar;
        zzbnd zzbndVar;
        zzbvp zzbvnVar = null;
        zzbvp zzbvnVar2 = null;
        zzbvp zzbvnVar3 = null;
        zzbvp zzbvnVar4 = null;
        zzbsa zzbryVar = null;
        zzbvp zzbvnVar5 = null;
        zzbncVar = null;
        zzbnc zzbncVar = null;
        zzbvp zzbvnVar6 = null;
        zzcch zzccfVar2 = null;
        zzbvp zzbvnVar7 = null;
        zzbvp zzbvnVar8 = null;
        zzbvp zzbvnVar9 = null;
        switch (i2) {
            case 1:
                IObjectWrapper iObjectWrapperM3696k0 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar = iInterfaceQueryLocalInterface instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface : new zzbvn(strongBinder);
                }
                zzbvp zzbvpVar = zzbvnVar;
                zzben.m4818f(parcel);
                ((zzbwk) this).mo5184w0(iObjectWrapperM3696k0, zzrVar, zzmVar, string, null, zzbvpVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper iObjectWrapperMo5171b = ((zzbwk) this).mo5171b();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, iObjectWrapperMo5171b);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperM3696k1 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar9 = iInterfaceQueryLocalInterface2 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface2 : new zzbvn(strongBinder2);
                }
                zzbvp zzbvpVar2 = zzbvnVar9;
                zzben.m4818f(parcel);
                ((zzbwk) this).mo5168V3(iObjectWrapperM3696k1, zzmVar2, string2, null, zzbvpVar2);
                parcel2.writeNoException();
                return true;
            case 4:
                ((zzbwk) this).zzh();
                parcel2.writeNoException();
                return true;
            case 5:
                ((zzbwk) this).zzi();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper iObjectWrapperM3696k2 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar8 = iInterfaceQueryLocalInterface3 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface3 : new zzbvn(strongBinder3);
                }
                zzbvp zzbvpVar3 = zzbvnVar8;
                zzben.m4818f(parcel);
                ((zzbwk) this).mo5184w0(iObjectWrapperM3696k2, zzrVar2, zzmVar3, string3, string4, zzbvpVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper iObjectWrapperM3696k3 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar7 = iInterfaceQueryLocalInterface4 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface4 : new zzbvn(strongBinder4);
                }
                zzbvp zzbvpVar4 = zzbvnVar7;
                zzben.m4818f(parcel);
                ((zzbwk) this).mo5168V3(iObjectWrapperM3696k3, zzmVar4, string5, string6, zzbvpVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                ((zzbwk) this).zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                ((zzbwk) this).mo5174e();
                parcel2.writeNoException();
                return true;
            case 10:
                IObjectWrapper iObjectWrapperM3696k4 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    zzccfVar2 = iInterfaceQueryLocalInterface5 instanceof zzcch ? (zzcch) iInterfaceQueryLocalInterface5 : new zzccf(strongBinder5, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                }
                String string7 = parcel.readString();
                zzben.m4818f(parcel);
                ((zzbwk) this).mo5158A2(iObjectWrapperM3696k4, zzmVar5, zzccfVar2, string7);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string8 = parcel.readString();
                zzben.m4818f(parcel);
                ((zzbwk) this).m5233o4(zzmVar6, string8);
                parcel2.writeNoException();
                return true;
            case 12:
                ((zzbwk) this).mo5165Q();
                throw null;
            case 13:
                boolean zMo5175f = ((zzbwk) this).mo5175f();
                parcel2.writeNoException();
                ClassLoader classLoader = zzben.f7689a;
                parcel2.writeInt(zMo5175f ? 1 : 0);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperM3696k5 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar6 = iInterfaceQueryLocalInterface6 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface6 : new zzbvn(strongBinder6);
                }
                zzbvp zzbvpVar5 = zzbvnVar6;
                zzbma zzbmaVar = (zzbma) zzben.m4814b(parcel, zzbma.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                zzben.m4818f(parcel);
                ((zzbwk) this).mo5178p2(iObjectWrapperM3696k5, zzmVar7, string9, string10, zzbvpVar5, zzbmaVar, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                ClassLoader classLoader2 = zzben.f7689a;
                parcel2.writeStrongBinder(null);
                return true;
            case 16:
                parcel2.writeNoException();
                ClassLoader classLoader3 = zzben.f7689a;
                parcel2.writeStrongBinder(null);
                return true;
            case 17:
                Bundle bundle = new Bundle();
                parcel2.writeNoException();
                zzben.m4816d(parcel2, bundle);
                return true;
            case 18:
                Bundle bundle2 = new Bundle();
                parcel2.writeNoException();
                zzben.m4816d(parcel2, bundle2);
                return true;
            case 19:
                Bundle bundle3 = new Bundle();
                parcel2.writeNoException();
                zzben.m4816d(parcel2, bundle3);
                return true;
            case 20:
                com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string11 = parcel.readString();
                parcel.readString();
                zzben.m4818f(parcel);
                ((zzbwk) this).m5233o4(zzmVar8, string11);
                parcel2.writeNoException();
                return true;
            case 21:
                ((zzbwk) this).mo5169W(AbstractC1456a.m2440g(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                ClassLoader classLoader4 = zzben.f7689a;
                parcel2.writeInt(0);
                return true;
            case 23:
                IObjectWrapper iObjectWrapperM3696k6 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    zzccfVar = iInterfaceQueryLocalInterface7 instanceof zzcch ? (zzcch) iInterfaceQueryLocalInterface7 : new zzccf(strongBinder7, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                } else {
                    zzccfVar = null;
                }
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                zzben.m4818f(parcel);
                ((zzbwk) this).mo5185w2(iObjectWrapperM3696k6, zzccfVar, arrayListCreateStringArrayList2);
                throw null;
            case 24:
                zzbwm zzbwmVar = ((zzbwk) this).f9458t;
                if (zzbwmVar != null && (zzbndVar = zzbwmVar.f9463c) != null) {
                    zzbncVar = zzbndVar.f9186a;
                }
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzbncVar);
                return true;
            case 25:
                boolean zM4813a = zzben.m4813a(parcel);
                zzben.m4818f(parcel);
                ((zzbwk) this).mo5172b2(zM4813a);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzea zzeaVarMo5182t = ((zzbwk) this).mo5182t();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzeaVarMo5182t);
                return true;
            case 27:
                zzbvy zzbvyVarMo5159B = ((zzbwk) this).mo5159B();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzbvyVarMo5159B);
                return true;
            case 28:
                IObjectWrapper iObjectWrapperM3696k7 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar9 = (com.google.android.gms.ads.internal.client.zzm) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string12 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar5 = iInterfaceQueryLocalInterface8 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface8 : new zzbvn(strongBinder8);
                }
                zzben.m4818f(parcel);
                ((zzbwk) this).mo5173c4(iObjectWrapperM3696k7, zzmVar9, string12, zzbvnVar5);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                ((zzbwk) this).mo5170a2(AbstractC1456a.m2440g(parcel, parcel));
                throw null;
            case 31:
                IObjectWrapper iObjectWrapperM3696k8 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                    zzbryVar = iInterfaceQueryLocalInterface9 instanceof zzbsa ? (zzbsa) iInterfaceQueryLocalInterface9 : new zzbry(strongBinder9, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                }
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzbsg.CREATOR);
                zzben.m4818f(parcel);
                ((zzbwk) this).mo5183v1(iObjectWrapperM3696k8, zzbryVar, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                IObjectWrapper iObjectWrapperM3696k9 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar10 = (com.google.android.gms.ads.internal.client.zzm) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string13 = parcel.readString();
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar4 = iInterfaceQueryLocalInterface10 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface10 : new zzbvn(strongBinder10);
                }
                zzben.m4818f(parcel);
                ((zzbwk) this).mo5166Q1(iObjectWrapperM3696k9, zzmVar10, string13, zzbvnVar4);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbxx zzbxxVarMo5162L = ((zzbwk) this).mo5162L();
                parcel2.writeNoException();
                zzben.m4816d(parcel2, zzbxxVarMo5162L);
                return true;
            case 34:
                zzbxx zzbxxVarMo5167U = ((zzbwk) this).mo5167U();
                parcel2.writeNoException();
                zzben.m4816d(parcel2, zzbxxVarMo5167U);
                return true;
            case 35:
                IObjectWrapper iObjectWrapperM3696k10 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar11 = (com.google.android.gms.ads.internal.client.zzm) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar3 = iInterfaceQueryLocalInterface11 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface11 : new zzbvn(strongBinder11);
                }
                zzbvp zzbvpVar6 = zzbvnVar3;
                zzben.m4818f(parcel);
                ((zzbwk) this).mo5179r3(iObjectWrapperM3696k10, zzrVar3, zzmVar11, string14, string15, zzbvpVar6);
                parcel2.writeNoException();
                return true;
            case 36:
                parcel2.writeNoException();
                ClassLoader classLoader5 = zzben.f7689a;
                parcel2.writeStrongBinder(null);
                return true;
            case 37:
                ((zzbwk) this).mo5176k1(AbstractC1456a.m2440g(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 38:
                IObjectWrapper iObjectWrapperM3696k11 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar12 = (com.google.android.gms.ads.internal.client.zzm) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string16 = parcel.readString();
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar2 = iInterfaceQueryLocalInterface12 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface12 : new zzbvn(strongBinder12);
                }
                zzben.m4818f(parcel);
                ((zzbwk) this).mo5181s2(iObjectWrapperM3696k11, zzmVar12, string16, zzbvnVar2);
                parcel2.writeNoException();
                return true;
            case 39:
                ((zzbwk) this).mo5177k2(AbstractC1456a.m2440g(parcel, parcel));
                throw null;
        }
    }
}
