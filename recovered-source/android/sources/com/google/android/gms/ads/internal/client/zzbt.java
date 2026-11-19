package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbgr;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzbjq;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzcca;
import com.google.android.gms.internal.ads.zzccc;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbt extends zzbem implements zzbu {
    public zzbt() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        zzbh zzbfVar = null;
        zzcs zzcqVar = null;
        zzbk zzbiVar = null;
        zzdq zzdoVar = null;
        zzbgt zzbgrVar = null;
        zzccc zzccaVar = null;
        zzcp zzcpVar = null;
        zzbe zzbcVar = null;
        zzbjs zzbjqVar = null;
        zzcl zzcjVar = null;
        switch (i2) {
            case 1:
                IObjectWrapper iObjectWrapperZzb = zzb();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, iObjectWrapperZzb);
                return true;
            case 2:
                zzc();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zMo2871d = mo2871d();
                parcel2.writeNoException();
                ClassLoader classLoader = zzben.f7689a;
                parcel2.writeInt(zMo2871d ? 1 : 0);
                return true;
            case 4:
                zzm zzmVar = (zzm) zzben.m4814b(parcel, zzm.CREATOR);
                zzben.m4818f(parcel);
                boolean zMo2850Z = mo2850Z(zzmVar);
                parcel2.writeNoException();
                parcel2.writeInt(zMo2850Z ? 1 : 0);
                return true;
            case 5:
                mo2852b();
                parcel2.writeNoException();
                return true;
            case 6:
                mo2853c();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbfVar = iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbf(strongBinder);
                }
                zzben.m4818f(parcel);
                mo2845M3(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzcjVar = iInterfaceQueryLocalInterface2 instanceof zzcl ? (zzcl) iInterfaceQueryLocalInterface2 : new zzcj(strongBinder2);
                }
                zzben.m4818f(parcel);
                mo2842F0(zzcjVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzl();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                mo2872e();
                parcel2.writeNoException();
                return true;
            case 12:
                zzr zzrVarMo2855g = mo2855g();
                parcel2.writeNoException();
                zzben.m4816d(parcel2, zzrVarMo2855g);
                return true;
            case 13:
                zzr zzrVar = (zzr) zzben.m4814b(parcel, zzr.CREATOR);
                zzben.m4818f(parcel);
                mo2857o2(zzrVar);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    if (iInterfaceQueryLocalInterface3 instanceof zzbzr) {
                    }
                }
                zzben.m4818f(parcel);
                mo2876i();
                parcel2.writeNoException();
                return true;
            case 15:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    if (iInterfaceQueryLocalInterface4 instanceof zzbzu) {
                    }
                }
                parcel.readString();
                zzben.m4818f(parcel);
                mo2873f();
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strMo2878n = mo2878n();
                parcel2.writeNoException();
                parcel2.writeString(strMo2878n);
                return true;
            case 19:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    zzbjqVar = iInterfaceQueryLocalInterface5 instanceof zzbjs ? (zzbjs) iInterfaceQueryLocalInterface5 : new zzbjq(strongBinder5, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                }
                zzben.m4818f(parcel);
                mo2874g1(zzbjqVar);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbcVar = iInterfaceQueryLocalInterface6 instanceof zzbe ? (zzbe) iInterfaceQueryLocalInterface6 : new zzbc(strongBinder6, "com.google.android.gms.ads.internal.client.IAdClickListener");
                }
                zzben.m4818f(parcel);
                mo2848W3(zzbcVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcpVar = iInterfaceQueryLocalInterface7 instanceof zzcp ? (zzcp) iInterfaceQueryLocalInterface7 : new zzcp(strongBinder7);
                }
                zzben.m4818f(parcel);
                mo2877l3(zzcpVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zM4813a = zzben.m4813a(parcel);
                zzben.m4818f(parcel);
                mo2843G2(zM4813a);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zMo2879t = mo2879t();
                parcel2.writeNoException();
                ClassLoader classLoader2 = zzben.f7689a;
                parcel2.writeInt(zMo2879t ? 1 : 0);
                return true;
            case 24:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzccaVar = iInterfaceQueryLocalInterface8 instanceof zzccc ? (zzccc) iInterfaceQueryLocalInterface8 : new zzcca(strongBinder8);
                }
                zzben.m4818f(parcel);
                mo2869M0(zzccaVar);
                parcel2.writeNoException();
                return true;
            case 25:
                String string = parcel.readString();
                zzben.m4818f(parcel);
                mo2870Y2(string);
                parcel2.writeNoException();
                return true;
            case 26:
                zzea zzeaVarMo2860w = mo2860w();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzeaVarMo2860w);
                return true;
            case 29:
                zzfw zzfwVar = (zzfw) zzben.m4814b(parcel, zzfw.CREATOR);
                zzben.m4818f(parcel);
                mo2841D3(zzfwVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzben.m4818f(parcel);
                mo2868L();
                parcel2.writeNoException();
                return true;
            case 31:
                String strMo2856k = mo2856k();
                parcel2.writeNoException();
                parcel2.writeString(strMo2856k);
                return true;
            case 32:
                zzcl zzclVarMo2859v = mo2859v();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzclVarMo2859v);
                return true;
            case 33:
                zzbh zzbhVarMo2862z = mo2862z();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzbhVarMo2862z);
                return true;
            case 34:
                boolean zM4813a2 = zzben.m4813a(parcel);
                zzben.m4818f(parcel);
                mo2851Z0(zM4813a2);
                parcel2.writeNoException();
                return true;
            case 35:
                String strMo2875h = mo2875h();
                parcel2.writeNoException();
                parcel2.writeString(strMo2875h);
                return true;
            case 36:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if (iInterfaceQueryLocalInterface9 instanceof zzby) {
                    }
                }
                zzben.m4818f(parcel);
                mo2866E1();
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleZzk = zzk();
                parcel2.writeNoException();
                zzben.m4816d(parcel2, bundleZzk);
                return true;
            case 38:
                parcel.readString();
                zzben.m4818f(parcel);
                mo2867H();
                parcel2.writeNoException();
                return true;
            case 39:
                zzx zzxVar = (zzx) zzben.m4814b(parcel, zzx.CREATOR);
                zzben.m4818f(parcel);
                mo2864A1(zzxVar);
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                    zzbgrVar = iInterfaceQueryLocalInterface10 instanceof zzbgt ? (zzbgt) iInterfaceQueryLocalInterface10 : new zzbgr(strongBinder10, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                }
                zzben.m4818f(parcel);
                mo2854c2(zzbgrVar);
                parcel2.writeNoException();
                return true;
            case 41:
                zzdx zzdxVarMo2858r = mo2858r();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzdxVarMo2858r);
                return true;
            case 42:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzdoVar = iInterfaceQueryLocalInterface11 instanceof zzdq ? (zzdq) iInterfaceQueryLocalInterface11 : new zzdo(strongBinder11);
                }
                zzben.m4818f(parcel);
                mo2861x3(zzdoVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzm zzmVar2 = (zzm) zzben.m4814b(parcel, zzm.CREATOR);
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzbiVar = iInterfaceQueryLocalInterface12 instanceof zzbk ? (zzbk) iInterfaceQueryLocalInterface12 : new zzbi(strongBinder12, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
                }
                zzben.m4818f(parcel);
                mo2847U0(zzmVar2, zzbiVar);
                parcel2.writeNoException();
                return true;
            case 44:
                IObjectWrapper iObjectWrapperM3696k0 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                mo2844I3(iObjectWrapperM3696k0);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzcqVar = iInterfaceQueryLocalInterface13 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface13 : new zzcq(strongBinder13, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                }
                zzben.m4818f(parcel);
                mo2863z3(zzcqVar);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zMo2865C = mo2865C();
                parcel2.writeNoException();
                ClassLoader classLoader3 = zzben.f7689a;
                parcel2.writeInt(zMo2865C ? 1 : 0);
                return true;
            case 47:
                long jMo2846P = mo2846P();
                parcel2.writeNoException();
                parcel2.writeLong(jMo2846P);
                return true;
            case 48:
                long j2 = parcel.readLong();
                zzben.m4818f(parcel);
                mo2849Y0(j2);
                parcel2.writeNoException();
                return true;
        }
    }
}
