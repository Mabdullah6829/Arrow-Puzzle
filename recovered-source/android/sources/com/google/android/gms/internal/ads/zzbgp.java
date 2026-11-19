package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbgp extends zzbem implements zzbgq {
    public zzbgp() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        zzdbv zzdbvVar;
        zzdbv zzdbvVar2;
        zzbgx zzbgvVar = null;
        String strMo2856k = null;
        switch (i2) {
            case 2:
                parcel2.writeNoException();
                zzben.m4817e(parcel2, ((zzcvn) this).f11575t);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (iInterfaceQueryLocalInterface instanceof zzbgu) {
                    }
                }
                zzben.m4818f(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper iObjectWrapperM3696k0 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzbgvVar = iInterfaceQueryLocalInterface2 instanceof zzbgx ? (zzbgx) iInterfaceQueryLocalInterface2 : new zzbgv(strongBinder2, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                }
                zzben.m4818f(parcel);
                ((zzcvn) this).mo4879i4(iObjectWrapperM3696k0, zzbgvVar);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.ads.internal.client.zzdx zzdxVarMo4878c = ((zzcvn) this).mo4878c();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzdxVarMo4878c);
                return true;
            case 6:
                boolean zM4813a = zzben.m4813a(parcel);
                zzben.m4818f(parcel);
                ((zzcvn) this).f11577v = zM4813a;
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdq zzdqVarM2914k4 = com.google.android.gms.ads.internal.client.zzdp.m2914k4(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                zzcvn zzcvnVar = (zzcvn) this;
                Preconditions.m3540d("setOnPaidEventListener must be called on the main UI thread.");
                zzfgm zzfgmVar = zzcvnVar.f11576u;
                if (zzfgmVar != null) {
                    try {
                        if (!zzdqVarM2914k4.mo2912b()) {
                            zzcvnVar.f11578w.m6112b();
                        }
                    } catch (RemoteException e) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3069b("Error in making CSI ping for reporting paid event callback", e);
                    }
                    zzfgmVar.f15629y.set(zzdqVarM2914k4);
                    break;
                }
                parcel2.writeNoException();
                return true;
            case 8:
                try {
                    strMo2856k = ((zzcvn) this).f11575t.mo2856k();
                    break;
                } catch (RemoteException e2) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e2);
                }
                parcel2.writeNoException();
                parcel2.writeString(strMo2856k);
                return true;
            case 9:
                zzcvm zzcvmVar = ((zzcvn) this).f11574s;
                long j2 = (zzcvmVar == null || (zzdbvVar = zzcvmVar.f11768j) == null) ? 0L : zzdbvVar.f11972a.get();
                parcel2.writeNoException();
                parcel2.writeLong(j2);
                return true;
            case 10:
                long j3 = parcel.readLong();
                zzben.m4818f(parcel);
                zzcvm zzcvmVar2 = ((zzcvn) this).f11574s;
                if (zzcvmVar2 != null && (zzdbvVar2 = zzcvmVar2.f11768j) != null) {
                    zzdbvVar2.m5891a(j3);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
