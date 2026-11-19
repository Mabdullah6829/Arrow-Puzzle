package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbqv;
import com.google.android.gms.internal.ads.zzbqx;
import com.google.android.gms.internal.ads.zzbra;
import com.google.android.gms.internal.ads.zzbvi;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzbzb;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzccp;
import com.google.android.gms.internal.ads.zzcet;
import com.google.android.gms.internal.ads.zzcnq;
import com.google.android.gms.internal.ads.zzdqu;
import com.google.android.gms.internal.ads.zzfkg;
import com.google.android.gms.internal.ads.zzfkk;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzcn extends zzbem implements zzco {
    public zzcn() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        zzbqx zzbqvVar = null;
        switch (i2) {
            case 1:
                IObjectWrapper iObjectWrapperM3696k0 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzben.m4814b(parcel, zzr.CREATOR);
                String string = parcel.readString();
                zzbvj zzbvjVarM5157k4 = zzbvi.m5157k4(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                zzben.m4818f(parcel);
                zzbu zzbuVarMo2785L1 = ((ClientApi) this).mo2785L1(iObjectWrapperM3696k0, zzrVar, string, zzbvjVarM5157k4, i3);
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzbuVarMo2785L1);
                return true;
            case 2:
                IObjectWrapper iObjectWrapperM3696k1 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzr zzrVar2 = (zzr) zzben.m4814b(parcel, zzr.CREATOR);
                String string2 = parcel.readString();
                zzbvj zzbvjVarM5157k5 = zzbvi.m5157k4(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                zzben.m4818f(parcel);
                zzbu zzbuVarMo2793i1 = ((ClientApi) this).mo2793i1(iObjectWrapperM3696k1, zzrVar2, string2, zzbvjVarM5157k5, i4);
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzbuVarMo2793i1);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperM3696k2 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                String string3 = parcel.readString();
                zzbvj zzbvjVarM5157k6 = zzbvi.m5157k4(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                zzben.m4818f(parcel);
                zzbq zzbqVarMo2788P1 = ((ClientApi) this).mo2788P1(iObjectWrapperM3696k2, string3, zzbvjVarM5157k6, i5);
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzbqVarMo2788P1);
                return true;
            case 4:
                IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                zzbmp zzbmpVarMo2795v0 = ((ClientApi) this).mo2795v0(IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder()), AbstractC1456a.m2440g(parcel, parcel));
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzbmpVarMo2795v0);
                return true;
            case 6:
                IObjectWrapper iObjectWrapperM3696k3 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzbvj zzbvjVarM5157k7 = zzbvi.m5157k4(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                zzben.m4818f(parcel);
                Context context = (Context) ObjectWrapper.m3697u0(iObjectWrapperM3696k3);
                zzfkg zzfkgVarMo5701t = zzcnq.m5679f(context, zzbvjVarM5157k7, i6).mo5701t();
                zzfkgVarMo5701t.mo5786d(context);
                zzfkk zzfkkVarZza = zzfkgVarMo5701t.zza().zza();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzfkkVarZza);
                return true;
            case 7:
                IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 8:
                zzbzi zzbziVarMo2792g0 = ((ClientApi) this).mo2792g0(AbstractC1456a.m2440g(parcel, parcel));
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzbziVarMo2792g0);
                return true;
            case 9:
                IObjectWrapper iObjectWrapperM3696k4 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                int i7 = parcel.readInt();
                zzben.m4818f(parcel);
                zzcy zzcyVarMo2783F3 = ((ClientApi) this).mo2783F3(iObjectWrapperM3696k4, i7);
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzcyVarMo2783F3);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperM3696k5 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzr zzrVar3 = (zzr) zzben.m4814b(parcel, zzr.CREATOR);
                String string4 = parcel.readString();
                int i8 = parcel.readInt();
                zzben.m4818f(parcel);
                com.google.android.gms.ads.internal.zzs zzsVar = new com.google.android.gms.ads.internal.zzs((Context) ObjectWrapper.m3697u0(iObjectWrapperM3696k5), zzrVar3, string4, new VersionInfoParcel(261710000, i8, 0, true, false));
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzsVar);
                return true;
            case 11:
                zzdqu zzdquVar = new zzdqu((View) ObjectWrapper.m3697u0(IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder())), (HashMap) ObjectWrapper.m3697u0(IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder())), (HashMap) ObjectWrapper.m3697u0(AbstractC1456a.m2440g(parcel, parcel)));
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzdquVar);
                return true;
            case 12:
                IObjectWrapper iObjectWrapperM3696k6 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                String string5 = parcel.readString();
                zzbvj zzbvjVarM5157k8 = zzbvi.m5157k4(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                zzben.m4818f(parcel);
                zzccp zzccpVarMo2784J1 = ((ClientApi) this).mo2784J1(iObjectWrapperM3696k6, string5, zzbvjVarM5157k8, i9);
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzccpVarMo2784J1);
                return true;
            case 13:
                IObjectWrapper iObjectWrapperM3696k7 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzr zzrVar4 = (zzr) zzben.m4814b(parcel, zzr.CREATOR);
                String string6 = parcel.readString();
                zzbvj zzbvjVarM5157k9 = zzbvi.m5157k4(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                zzben.m4818f(parcel);
                zzbu zzbuVarMo2786O3 = ((ClientApi) this).mo2786O3(iObjectWrapperM3696k7, zzrVar4, string6, zzbvjVarM5157k9, i10);
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzbuVarMo2786O3);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperM3696k8 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzbvj zzbvjVarM5157k10 = zzbvi.m5157k4(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                zzben.m4818f(parcel);
                zzcet zzcetVarMo2787P0 = ((ClientApi) this).mo2787P0(iObjectWrapperM3696k8, zzbvjVarM5157k10, i11);
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzcetVarMo2787P0);
                return true;
            case 15:
                IObjectWrapper iObjectWrapperM3696k9 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzbvj zzbvjVarM5157k11 = zzbvi.m5157k4(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                zzben.m4818f(parcel);
                zzbzb zzbzbVarMo2790e4 = ((ClientApi) this).mo2790e4(iObjectWrapperM3696k9, zzbvjVarM5157k11, i12);
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzbzbVarMo2790e4);
                return true;
            case 16:
                IObjectWrapper iObjectWrapperM3696k10 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzbvj zzbvjVarM5157k12 = zzbvi.m5157k4(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                    zzbqvVar = iInterfaceQueryLocalInterface instanceof zzbqx ? (zzbqx) iInterfaceQueryLocalInterface : new zzbqv(strongBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                }
                zzben.m4818f(parcel);
                zzbra zzbraVarMo2794n3 = ((ClientApi) this).mo2794n3(iObjectWrapperM3696k10, zzbvjVarM5157k12, i13, zzbqvVar);
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzbraVarMo2794n3);
                return true;
            case 17:
                IObjectWrapper iObjectWrapperM3696k11 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzbvj zzbvjVarM5157k13 = zzbvi.m5157k4(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                zzben.m4818f(parcel);
                zzdt zzdtVarMo2791f3 = ((ClientApi) this).mo2791f3(iObjectWrapperM3696k11, zzbvjVarM5157k13, i14);
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzdtVarMo2791f3);
                return true;
            case 18:
                IObjectWrapper iObjectWrapperM3696k12 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzbvj zzbvjVarM5157k14 = zzbvi.m5157k4(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                zzben.m4818f(parcel);
                zzch zzchVarMo2789T2 = ((ClientApi) this).mo2789T2(iObjectWrapperM3696k12, zzbvjVarM5157k14, i15);
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzchVarMo2789T2);
                return true;
            default:
                return false;
        }
    }
}
