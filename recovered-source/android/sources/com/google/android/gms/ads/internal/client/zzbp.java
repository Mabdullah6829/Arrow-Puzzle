package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzbne;
import com.google.android.gms.internal.ads.zzbng;
import com.google.android.gms.internal.ads.zzbnh;
import com.google.android.gms.internal.ads.zzbnj;
import com.google.android.gms.internal.ads.zzbnk;
import com.google.android.gms.internal.ads.zzbnm;
import com.google.android.gms.internal.ads.zzbnn;
import com.google.android.gms.internal.ads.zzbnp;
import com.google.android.gms.internal.ads.zzbnr;
import com.google.android.gms.internal.ads.zzbnt;
import com.google.android.gms.internal.ads.zzbnu;
import com.google.android.gms.internal.ads.zzbnw;
import com.google.android.gms.internal.ads.zzbsi;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbsr;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbp extends zzbem implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        zzbnp zzbnnVar;
        zzbh zzbfVar = null;
        zzbsr zzbspVar = null;
        zzbnw zzbnuVar = null;
        zzbnt zzbnrVar = null;
        zzcp zzcpVar = null;
        zzbnm zzbnkVar = null;
        zzbnj zzbnhVar = null;
        zzbng zzbneVar = null;
        switch (i2) {
            case 1:
                zzbn zzbnVarMo2830a = mo2830a();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzbnVarMo2830a);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbfVar = iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbf(strongBinder);
                }
                zzben.m4818f(parcel);
                mo2832u2(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    zzbneVar = iInterfaceQueryLocalInterface2 instanceof zzbng ? (zzbng) iInterfaceQueryLocalInterface2 : new zzbne(strongBinder2, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                }
                zzben.m4818f(parcel);
                mo2838r0(zzbneVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    zzbnhVar = iInterfaceQueryLocalInterface3 instanceof zzbnj ? (zzbnj) iInterfaceQueryLocalInterface3 : new zzbnh(strongBinder3, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                }
                zzben.m4818f(parcel);
                mo2839r2(zzbnhVar);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    zzbnnVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    zzbnnVar = iInterfaceQueryLocalInterface4 instanceof zzbnp ? (zzbnp) iInterfaceQueryLocalInterface4 : new zzbnn(strongBinder4, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                }
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    zzbnkVar = iInterfaceQueryLocalInterface5 instanceof zzbnm ? (zzbnm) iInterfaceQueryLocalInterface5 : new zzbnk(strongBinder5, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                }
                zzben.m4818f(parcel);
                mo2829U3(string, zzbnnVar, zzbnkVar);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbma zzbmaVar = (zzbma) zzben.m4814b(parcel, zzbma.CREATOR);
                zzben.m4818f(parcel);
                mo2831t0(zzbmaVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcpVar = iInterfaceQueryLocalInterface6 instanceof zzcp ? (zzcp) iInterfaceQueryLocalInterface6 : new zzcp(strongBinder6);
                }
                zzben.m4818f(parcel);
                mo2834R3(zzcpVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    zzbnrVar = iInterfaceQueryLocalInterface7 instanceof zzbnt ? (zzbnt) iInterfaceQueryLocalInterface7 : new zzbnr(strongBinder7, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                }
                zzr zzrVar = (zzr) zzben.m4814b(parcel, zzr.CREATOR);
                zzben.m4818f(parcel);
                mo2835S2(zzbnrVar, zzrVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzben.m4814b(parcel, PublisherAdViewOptions.CREATOR);
                zzben.m4818f(parcel);
                mo2836i2(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    zzbnuVar = iInterfaceQueryLocalInterface8 instanceof zzbnw ? (zzbnw) iInterfaceQueryLocalInterface8 : new zzbnu(strongBinder8, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                }
                zzben.m4818f(parcel);
                mo2828C2(zzbnuVar);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbsi zzbsiVar = (zzbsi) zzben.m4814b(parcel, zzbsi.CREATOR);
                zzben.m4818f(parcel);
                mo2840y3(zzbsiVar);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                    zzbspVar = iInterfaceQueryLocalInterface9 instanceof zzbsr ? (zzbsr) iInterfaceQueryLocalInterface9 : new zzbsp(strongBinder9, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                }
                zzben.m4818f(parcel);
                mo2837m3(zzbspVar);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) zzben.m4814b(parcel, AdManagerAdViewOptions.CREATOR);
                zzben.m4818f(parcel);
                mo2833N1(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
