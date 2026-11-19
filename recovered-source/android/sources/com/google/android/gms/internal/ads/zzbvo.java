package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbvo extends zzbem implements zzbvp {
    public zzbvo() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* JADX INFO: renamed from: k4 */
    public static zzbvp m5204k4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface : new zzbvn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        zzccm zzcckVar;
        switch (i2) {
            case 1:
                mo5192a();
                break;
            case 2:
                mo5194b();
                break;
            case 3:
                int i3 = parcel.readInt();
                zzben.m4818f(parcel);
                mo5202p(i3);
                break;
            case 4:
                zzh();
                break;
            case 5:
                zzi();
                break;
            case 6:
                zzj();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                }
                zzben.m4818f(parcel);
                break;
            case 8:
                zzk();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzben.m4818f(parcel);
                mo5186B3(string, string2);
                break;
            case 10:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    if (iInterfaceQueryLocalInterface instanceof zzbnc) {
                    }
                }
                parcel.readString();
                zzben.m4818f(parcel);
                break;
            case 11:
                mo5197e0();
                break;
            case 12:
                parcel.readString();
                zzben.m4818f(parcel);
                break;
            case 13:
                mo5200j();
                break;
            case 14:
                zzcci zzcciVar = (zzcci) zzben.m4814b(parcel, zzcci.CREATOR);
                zzben.m4818f(parcel);
                mo5190J0(zzcciVar);
                break;
            case 15:
                mo5188F();
                break;
            case 16:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    zzcckVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    zzcckVar = iInterfaceQueryLocalInterface2 instanceof zzccm ? (zzccm) iInterfaceQueryLocalInterface2 : new zzcck(strongBinder3);
                }
                zzben.m4818f(parcel);
                mo5189H1(zzcckVar);
                break;
            case 17:
                int i4 = parcel.readInt();
                zzben.m4818f(parcel);
                mo5193a0(i4);
                break;
            case 18:
                mo5203t2();
                break;
            case 19:
                zzben.m4818f(parcel);
                break;
            case 20:
                mo5201k();
                break;
            case 21:
                String string3 = parcel.readString();
                zzben.m4818f(parcel);
                mo5196c0(string3);
                break;
            case 22:
                int i5 = parcel.readInt();
                String string4 = parcel.readString();
                zzben.m4818f(parcel);
                mo5198f4(i5, string4);
                break;
            case 23:
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzben.m4818f(parcel);
                mo5187C0(zzeVar);
                break;
            case 24:
                com.google.android.gms.ads.internal.client.zze zzeVar2 = (com.google.android.gms.ads.internal.client.zze) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzben.m4818f(parcel);
                mo5195b1(zzeVar2);
                break;
            case 25:
                mo5191Y();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
