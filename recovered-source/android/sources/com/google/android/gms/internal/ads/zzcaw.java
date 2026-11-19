package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcaw extends zzbem implements zzcax {
    public zzcaw() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) throws RemoteException {
        zzcbb zzcazVar = null;
        zzcbc zzcbcVar = null;
        zzcbb zzcazVar2 = null;
        zzcbb zzcazVar3 = null;
        zzcbb zzcazVar4 = null;
        switch (i2) {
            case 1:
                zzben.m4818f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (iInterfaceQueryLocalInterface instanceof zzcay) {
                    }
                }
                zzben.m4818f(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                zzcbk zzcbkVar = (zzcbk) zzben.m4814b(parcel, zzcbk.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcazVar = iInterfaceQueryLocalInterface2 instanceof zzcbb ? (zzcbb) iInterfaceQueryLocalInterface2 : new zzcaz(strongBinder2);
                }
                zzben.m4818f(parcel);
                ((zzeiq) this).mo5295O0(zzcbkVar, zzcazVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzcbk zzcbkVar2 = (zzcbk) zzben.m4814b(parcel, zzcbk.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcazVar4 = iInterfaceQueryLocalInterface3 instanceof zzcbb ? (zzcbb) iInterfaceQueryLocalInterface3 : new zzcaz(strongBinder3);
                }
                zzben.m4818f(parcel);
                ((zzeiq) this).mo5297f2(zzcbkVar2, zzcazVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzcbk zzcbkVar3 = (zzcbk) zzben.m4814b(parcel, zzcbk.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcazVar3 = iInterfaceQueryLocalInterface4 instanceof zzcbb ? (zzcbb) iInterfaceQueryLocalInterface4 : new zzcaz(strongBinder4);
                }
                zzben.m4818f(parcel);
                ((zzeiq) this).mo5296O1(zzcbkVar3, zzcazVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcazVar2 = iInterfaceQueryLocalInterface5 instanceof zzcbb ? (zzcbb) iInterfaceQueryLocalInterface5 : new zzcaz(strongBinder5);
                }
                zzben.m4818f(parcel);
                ((zzeiq) this).mo5298h3(string, zzcazVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                zzcat zzcatVar = (zzcat) zzben.m4814b(parcel, zzcat.CREATOR);
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    zzcbcVar = iInterfaceQueryLocalInterface6 instanceof zzcbc ? (zzcbc) iInterfaceQueryLocalInterface6 : new zzcbc(strongBinder6, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                }
                zzben.m4818f(parcel);
                zzeiq zzeiqVar = (zzeiq) this;
                if (!((Boolean) zzblm.f9134a.m5057c()).booleanValue()) {
                    try {
                        Parcel parcelM4810u = zzcbcVar.m4810u();
                        parcelM4810u.writeString("");
                        zzben.m4815c(parcelM4810u, zzcatVar);
                        zzcbcVar.m4811u0(1, parcelM4810u);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.zze.m3151l("Service can't call client", e);
                    }
                    break;
                } else {
                    zzeiqVar.f13976v.mo5687e();
                    String str = zzcatVar.f9661s;
                    ListenableFuture listenableFuture = zzhcj.f18518t;
                    zzehz zzehzVar = new zzehz(zzeiqVar, zzcbcVar, zzcatVar);
                    ((zzhcj) listenableFuture).addListener(new zzhcd(listenableFuture, zzehzVar), zzcfy.f9953h);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                String string2 = parcel.readString();
                zzben.m4818f(parcel);
                ((zzeiq) this).mo5299p0(string2);
                parcel2.writeNoException();
                return true;
        }
    }
}
