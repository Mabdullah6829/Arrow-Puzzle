package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbmn;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbqx;
import com.google.android.gms.internal.ads.zzbqy;
import com.google.android.gms.internal.ads.zzbqz;
import com.google.android.gms.internal.ads.zzbra;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzb;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzcco;
import com.google.android.gms.internal.ads.zzccp;
import com.google.android.gms.internal.ads.zzcer;
import com.google.android.gms.internal.ads.zzces;
import com.google.android.gms.internal.ads.zzcet;

/* JADX INFO: loaded from: classes.dex */
public final class zzcm extends zzbel implements zzco {
    @Override // com.google.android.gms.ads.internal.client.zzco
    /* JADX INFO: renamed from: F3 */
    public final zzcy mo2783F3(IObjectWrapper iObjectWrapper, int i2) {
        zzcy zzcwVar;
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        parcelM4810u.writeInt(261710000);
        Parcel parcelM4809k0 = m4809k0(9, parcelM4810u);
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        if (strongBinder == null) {
            zzcwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcwVar = iInterfaceQueryLocalInterface instanceof zzcy ? (zzcy) iInterfaceQueryLocalInterface : new zzcw(strongBinder);
        }
        parcelM4809k0.recycle();
        return zzcwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    /* JADX INFO: renamed from: J1 */
    public final zzccp mo2784J1(IObjectWrapper iObjectWrapper, String str, zzbvj zzbvjVar, int i2) {
        zzccp zzccnVar;
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        parcelM4810u.writeString(str);
        zzben.m4817e(parcelM4810u, zzbvjVar);
        parcelM4810u.writeInt(261710000);
        Parcel parcelM4809k0 = m4809k0(12, parcelM4810u);
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        int i3 = zzcco.f9742s;
        if (strongBinder == null) {
            zzccnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            zzccnVar = iInterfaceQueryLocalInterface instanceof zzccp ? (zzccp) iInterfaceQueryLocalInterface : new zzccn(strongBinder);
        }
        parcelM4809k0.recycle();
        return zzccnVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    /* JADX INFO: renamed from: L1 */
    public final zzbu mo2785L1(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbvj zzbvjVar, int i2) {
        zzbu zzbsVar;
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        zzben.m4815c(parcelM4810u, zzrVar);
        parcelM4810u.writeString(str);
        zzben.m4817e(parcelM4810u, zzbvjVar);
        parcelM4810u.writeInt(261710000);
        Parcel parcelM4809k0 = m4809k0(1, parcelM4810u);
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelM4809k0.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    /* JADX INFO: renamed from: O3 */
    public final zzbu mo2786O3(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbvj zzbvjVar, int i2) {
        zzbu zzbsVar;
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        zzben.m4815c(parcelM4810u, zzrVar);
        parcelM4810u.writeString(str);
        zzben.m4817e(parcelM4810u, zzbvjVar);
        parcelM4810u.writeInt(261710000);
        Parcel parcelM4809k0 = m4809k0(13, parcelM4810u);
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelM4809k0.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    /* JADX INFO: renamed from: P0 */
    public final zzcet mo2787P0(IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, int i2) {
        zzcet zzcerVar;
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        zzben.m4817e(parcelM4810u, zzbvjVar);
        parcelM4810u.writeInt(261710000);
        Parcel parcelM4809k0 = m4809k0(14, parcelM4810u);
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        int i3 = zzces.f9849s;
        if (strongBinder == null) {
            zzcerVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzcerVar = iInterfaceQueryLocalInterface instanceof zzcet ? (zzcet) iInterfaceQueryLocalInterface : new zzcer(strongBinder);
        }
        parcelM4809k0.recycle();
        return zzcerVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    /* JADX INFO: renamed from: P1 */
    public final zzbq mo2788P1(IObjectWrapper iObjectWrapper, String str, zzbvj zzbvjVar, int i2) {
        zzbq zzboVar;
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        parcelM4810u.writeString(str);
        zzben.m4817e(parcelM4810u, zzbvjVar);
        parcelM4810u.writeInt(261710000);
        Parcel parcelM4809k0 = m4809k0(3, parcelM4810u);
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        if (strongBinder == null) {
            zzboVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzboVar = iInterfaceQueryLocalInterface instanceof zzbq ? (zzbq) iInterfaceQueryLocalInterface : new zzbo(strongBinder);
        }
        parcelM4809k0.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    /* JADX INFO: renamed from: T2 */
    public final zzch mo2789T2(IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, int i2) {
        zzch zzcfVar;
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        zzben.m4817e(parcelM4810u, zzbvjVar);
        parcelM4810u.writeInt(261710000);
        Parcel parcelM4809k0 = m4809k0(18, parcelM4810u);
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        if (strongBinder == null) {
            zzcfVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            zzcfVar = iInterfaceQueryLocalInterface instanceof zzch ? (zzch) iInterfaceQueryLocalInterface : new zzcf(strongBinder);
        }
        parcelM4809k0.recycle();
        return zzcfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    /* JADX INFO: renamed from: e4 */
    public final zzbzb mo2790e4(IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, int i2) {
        zzbzb zzbyzVar;
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        zzben.m4817e(parcelM4810u, zzbvjVar);
        parcelM4810u.writeInt(261710000);
        Parcel parcelM4809k0 = m4809k0(15, parcelM4810u);
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        int i3 = zzbza.f9562s;
        if (strongBinder == null) {
            zzbyzVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbyzVar = iInterfaceQueryLocalInterface instanceof zzbzb ? (zzbzb) iInterfaceQueryLocalInterface : new zzbyz(strongBinder);
        }
        parcelM4809k0.recycle();
        return zzbyzVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    /* JADX INFO: renamed from: f3 */
    public final zzdt mo2791f3(IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, int i2) {
        zzdt zzdrVar;
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        zzben.m4817e(parcelM4810u, zzbvjVar);
        parcelM4810u.writeInt(261710000);
        Parcel parcelM4809k0 = m4809k0(17, parcelM4810u);
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        if (strongBinder == null) {
            zzdrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdrVar = iInterfaceQueryLocalInterface instanceof zzdt ? (zzdt) iInterfaceQueryLocalInterface : new zzdr(strongBinder);
        }
        parcelM4809k0.recycle();
        return zzdrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    /* JADX INFO: renamed from: g0 */
    public final zzbzi mo2792g0(IObjectWrapper iObjectWrapper) {
        zzbzi zzbzgVar;
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        Parcel parcelM4809k0 = m4809k0(8, parcelM4810u);
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        int i2 = zzbzh.f9564s;
        if (strongBinder == null) {
            zzbzgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            zzbzgVar = iInterfaceQueryLocalInterface instanceof zzbzi ? (zzbzi) iInterfaceQueryLocalInterface : new zzbzg(strongBinder);
        }
        parcelM4809k0.recycle();
        return zzbzgVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    /* JADX INFO: renamed from: i1 */
    public final zzbu mo2793i1(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbvj zzbvjVar, int i2) {
        zzbu zzbsVar;
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        zzben.m4815c(parcelM4810u, zzrVar);
        parcelM4810u.writeString(str);
        zzben.m4817e(parcelM4810u, zzbvjVar);
        parcelM4810u.writeInt(261710000);
        Parcel parcelM4809k0 = m4809k0(2, parcelM4810u);
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelM4809k0.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    /* JADX INFO: renamed from: n3 */
    public final zzbra mo2794n3(IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, int i2, zzbqx zzbqxVar) {
        zzbra zzbqyVar;
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        zzben.m4817e(parcelM4810u, zzbvjVar);
        parcelM4810u.writeInt(261710000);
        zzben.m4817e(parcelM4810u, zzbqxVar);
        Parcel parcelM4809k0 = m4809k0(16, parcelM4810u);
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        int i3 = zzbqz.f9287s;
        if (strongBinder == null) {
            zzbqyVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbqyVar = iInterfaceQueryLocalInterface instanceof zzbra ? (zzbra) iInterfaceQueryLocalInterface : new zzbqy(strongBinder);
        }
        parcelM4809k0.recycle();
        return zzbqyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    /* JADX INFO: renamed from: v0 */
    public final zzbmp mo2795v0(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        zzbmp zzbmnVar;
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        zzben.m4817e(parcelM4810u, iObjectWrapper2);
        Parcel parcelM4809k0 = m4809k0(5, parcelM4810u);
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        int i2 = zzbmo.f9182s;
        if (strongBinder == null) {
            zzbmnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            zzbmnVar = iInterfaceQueryLocalInterface instanceof zzbmp ? (zzbmp) iInterfaceQueryLocalInterface : new zzbmn(strongBinder);
        }
        parcelM4809k0.recycle();
        return zzbmnVar;
    }
}
