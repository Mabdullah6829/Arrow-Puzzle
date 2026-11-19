package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeoo implements zzemg {

    /* JADX INFO: renamed from: a */
    public final Context f14408a;

    /* JADX INFO: renamed from: b */
    public final zzdok f14409b;

    /* JADX INFO: renamed from: c */
    public final Executor f14410c;

    public zzeoo(Context context, zzdok zzdokVar, Executor executor) {
        this.f14408a = context;
        this.f14409b = zzdokVar;
        this.f14410c = executor;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m6296c(zzfky zzfkyVar, int i2) {
        return zzfkyVar.f16005a.f15998a.f16044h.contains(Integer.toString(i2));
    }

    /* JADX WARN: Code duplicated, block: B:91:0x0528  */
    /* JADX WARN: Code duplicated, block: B:93:0x053e  */
    @Override // com.google.android.gms.internal.ads.zzemg
    /* JADX INFO: renamed from: a */
    public final Object mo6291a(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzepp, zzfln {
        zzfme zzfmeVar;
        zzbvu zzbvuVar;
        zzbvy zzbvyVar;
        zzbvv zzbvvVar;
        zzdqb zzdqbVarM5996m;
        zzbvv zzbvvVar2;
        zzfme zzfmeVar2 = (zzfme) zzemdVar.f14192b;
        zzbvm zzbvmVar = zzfmeVar2.f16105a;
        try {
            zzbvu zzbvuVarMo5164M = zzbvmVar.mo5164M();
            try {
                zzbvv zzbvvVarMo5161K = zzbvmVar.mo5161K();
                try {
                    zzbvy zzbvyVarMo5159B = zzbvmVar.mo5159B();
                    if (zzbvyVarMo5159B == null || !m6296c(zzfkyVar, 6)) {
                        if (zzbvuVarMo5164M != null && m6296c(zzfkyVar, 6)) {
                            try {
                                Parcel parcelM4809k0 = zzbvuVarMo5164M.m4809k0(17, zzbvuVarMo5164M.m4810u());
                                com.google.android.gms.ads.internal.client.zzea zzeaVarM2924k4 = com.google.android.gms.ads.internal.client.zzdz.m2924k4(parcelM4809k0.readStrongBinder());
                                parcelM4809k0.recycle();
                                zzdqa zzdqaVar = zzeaVarM2924k4 == null ? null : new zzdqa(zzeaVarM2924k4, null);
                                Parcel parcelM4809k1 = zzbvuVarMo5164M.m4809k0(19, zzbvuVarMo5164M.m4810u());
                                zzbme zzbmeVarM5064k4 = zzbmd.m5064k4(parcelM4809k1.readStrongBinder());
                                parcelM4809k1.recycle();
                                Parcel parcelM4809k2 = zzbvuVarMo5164M.m4809k0(18, zzbvuVarMo5164M.m4810u());
                                IObjectWrapper iObjectWrapperM3696k0 = IObjectWrapper.Stub.m3696k0(parcelM4809k2.readStrongBinder());
                                parcelM4809k2.recycle();
                                View view = (View) zzdqb.m5997n(iObjectWrapperM3696k0);
                                Parcel parcelM4809k3 = zzbvuVarMo5164M.m4809k0(2, zzbvuVarMo5164M.m4810u());
                                String string = parcelM4809k3.readString();
                                parcelM4809k3.recycle();
                                Parcel parcelM4809k4 = zzbvuVarMo5164M.m4809k0(3, zzbvuVarMo5164M.m4810u());
                                ArrayList arrayList = parcelM4809k4.readArrayList(zzben.f7689a);
                                parcelM4809k4.recycle();
                                Parcel parcelM4809k5 = zzbvuVarMo5164M.m4809k0(4, zzbvuVarMo5164M.m4810u());
                                String string2 = parcelM4809k5.readString();
                                parcelM4809k5.recycle();
                                Parcel parcelM4809k6 = zzbvuVarMo5164M.m4809k0(15, zzbvuVarMo5164M.m4810u());
                                Bundle bundle = (Bundle) zzben.m4814b(parcelM4809k6, Bundle.CREATOR);
                                parcelM4809k6.recycle();
                                Parcel parcelM4809k7 = zzbvuVarMo5164M.m4809k0(6, zzbvuVarMo5164M.m4810u());
                                String string3 = parcelM4809k7.readString();
                                parcelM4809k7.recycle();
                                View view2 = (View) zzdqb.m5997n(zzbvuVarMo5164M.m5207D0());
                                Parcel parcelM4809k8 = zzbvuVarMo5164M.m4809k0(21, zzbvuVarMo5164M.m4810u());
                                IObjectWrapper iObjectWrapperM3696k1 = IObjectWrapper.Stub.m3696k0(parcelM4809k8.readStrongBinder());
                                parcelM4809k8.recycle();
                                Parcel parcelM4809k9 = zzbvuVarMo5164M.m4809k0(8, zzbvuVarMo5164M.m4810u());
                                String string4 = parcelM4809k9.readString();
                                parcelM4809k9.recycle();
                                Parcel parcelM4809k10 = zzbvuVarMo5164M.m4809k0(9, zzbvuVarMo5164M.m4810u());
                                String string5 = parcelM4809k10.readString();
                                parcelM4809k10.recycle();
                                Parcel parcelM4809k11 = zzbvuVarMo5164M.m4809k0(7, zzbvuVarMo5164M.m4810u());
                                double d = parcelM4809k11.readDouble();
                                parcelM4809k11.recycle();
                                Parcel parcelM4809k12 = zzbvuVarMo5164M.m4809k0(5, zzbvuVarMo5164M.m4810u());
                                zzbml zzbmlVarM5066k4 = zzbmk.m5066k4(parcelM4809k12.readStrongBinder());
                                parcelM4809k12.recycle();
                                zzdqbVarM5996m = zzdqb.m5996m(zzdqaVar, zzbmeVarM5064k4, view, string, arrayList, string2, bundle, string3, view2, iObjectWrapperM3696k1, string4, string5, d, zzbmlVarM5066k4, null, 0.0f);
                            } catch (RemoteException e) {
                                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                com.google.android.gms.ads.internal.util.client.zzo.m3074g("Failed to get native ad assets from app install ad mapper", e);
                                zzdqbVarM5996m = null;
                            }
                        } else if (zzbvuVarMo5164M == null || !m6296c(zzfkyVar, 2)) {
                            zzfmeVar = zzfmeVar2;
                            zzbvuVar = zzbvuVarMo5164M;
                            zzbvyVar = zzbvyVarMo5159B;
                            if (zzbvvVarMo5161K != null && m6296c(zzfkyVar, 6)) {
                                try {
                                    zzbvvVar2 = zzbvvVarMo5161K;
                                    try {
                                        Parcel parcelM4809k13 = zzbvvVar2.m4809k0(16, zzbvvVarMo5161K.m4810u());
                                        com.google.android.gms.ads.internal.client.zzea zzeaVarM2924k5 = com.google.android.gms.ads.internal.client.zzdz.m2924k4(parcelM4809k13.readStrongBinder());
                                        parcelM4809k13.recycle();
                                        zzdqa zzdqaVar2 = zzeaVarM2924k5 == null ? null : new zzdqa(zzeaVarM2924k5, null);
                                        Parcel parcelM4809k14 = zzbvvVar2.m4809k0(19, zzbvvVar2.m4810u());
                                        zzbme zzbmeVarM5064k5 = zzbmd.m5064k4(parcelM4809k14.readStrongBinder());
                                        parcelM4809k14.recycle();
                                        Parcel parcelM4809k15 = zzbvvVar2.m4809k0(15, zzbvvVar2.m4810u());
                                        IObjectWrapper iObjectWrapperM3696k2 = IObjectWrapper.Stub.m3696k0(parcelM4809k15.readStrongBinder());
                                        parcelM4809k15.recycle();
                                        View view3 = (View) zzdqb.m5997n(iObjectWrapperM3696k2);
                                        Parcel parcelM4809k16 = zzbvvVar2.m4809k0(2, zzbvvVar2.m4810u());
                                        String string6 = parcelM4809k16.readString();
                                        parcelM4809k16.recycle();
                                        Parcel parcelM4809k17 = zzbvvVar2.m4809k0(3, zzbvvVar2.m4810u());
                                        ArrayList arrayList2 = parcelM4809k17.readArrayList(zzben.f7689a);
                                        parcelM4809k17.recycle();
                                        Parcel parcelM4809k18 = zzbvvVar2.m4809k0(4, zzbvvVar2.m4810u());
                                        String string7 = parcelM4809k18.readString();
                                        parcelM4809k18.recycle();
                                        Parcel parcelM4809k19 = zzbvvVar2.m4809k0(13, zzbvvVar2.m4810u());
                                        Bundle bundle2 = (Bundle) zzben.m4814b(parcelM4809k19, Bundle.CREATOR);
                                        parcelM4809k19.recycle();
                                        Parcel parcelM4809k20 = zzbvvVar2.m4809k0(6, zzbvvVar2.m4810u());
                                        String string8 = parcelM4809k20.readString();
                                        parcelM4809k20.recycle();
                                        View view4 = (View) zzdqb.m5997n(zzbvvVar2.m5208k());
                                        Parcel parcelM4809k21 = zzbvvVar2.m4809k0(21, zzbvvVar2.m4810u());
                                        IObjectWrapper iObjectWrapperM3696k3 = IObjectWrapper.Stub.m3696k0(parcelM4809k21.readStrongBinder());
                                        parcelM4809k21.recycle();
                                        Parcel parcelM4809k22 = zzbvvVar2.m4809k0(5, zzbvvVar2.m4810u());
                                        zzbml zzbmlVarM5066k5 = zzbmk.m5066k4(parcelM4809k22.readStrongBinder());
                                        parcelM4809k22.recycle();
                                        Parcel parcelM4809k23 = zzbvvVar2.m4809k0(7, zzbvvVar2.m4810u());
                                        String string9 = parcelM4809k23.readString();
                                        parcelM4809k23.recycle();
                                        zzdqbVarM5996m = zzdqb.m5996m(zzdqaVar2, zzbmeVarM5064k5, view3, string6, arrayList2, string7, bundle2, string8, view4, iObjectWrapperM3696k3, null, null, -1.0d, zzbmlVarM5066k5, string9, 0.0f);
                                    } catch (RemoteException e2) {
                                        e = e2;
                                        int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                        com.google.android.gms.ads.internal.util.client.zzo.m3074g("Failed to get native ad assets from content ad mapper", e);
                                        zzdqbVarM5996m = null;
                                    }
                                } catch (RemoteException e3) {
                                    e = e3;
                                    zzbvvVar2 = zzbvvVarMo5161K;
                                }
                                zzbvvVar = zzbvvVar2;
                            } else {
                                if (zzbvvVarMo5161K == null || !m6296c(zzfkyVar, 1)) {
                                    throw new zzepp(1, "No native ad mappers");
                                }
                                try {
                                    Parcel parcelM4809k24 = zzbvvVarMo5161K.m4809k0(16, zzbvvVarMo5161K.m4810u());
                                    com.google.android.gms.ads.internal.client.zzea zzeaVarM2924k6 = com.google.android.gms.ads.internal.client.zzdz.m2924k4(parcelM4809k24.readStrongBinder());
                                    parcelM4809k24.recycle();
                                    zzdqa zzdqaVar3 = zzeaVarM2924k6 == null ? null : new zzdqa(zzeaVarM2924k6, null);
                                    Parcel parcelM4809k25 = zzbvvVarMo5161K.m4809k0(19, zzbvvVarMo5161K.m4810u());
                                    zzbme zzbmeVarM5064k6 = zzbmd.m5064k4(parcelM4809k25.readStrongBinder());
                                    parcelM4809k25.recycle();
                                    Parcel parcelM4809k26 = zzbvvVarMo5161K.m4809k0(15, zzbvvVarMo5161K.m4810u());
                                    IObjectWrapper iObjectWrapperM3696k4 = IObjectWrapper.Stub.m3696k0(parcelM4809k26.readStrongBinder());
                                    parcelM4809k26.recycle();
                                    View view5 = (View) zzdqb.m5997n(iObjectWrapperM3696k4);
                                    Parcel parcelM4809k27 = zzbvvVarMo5161K.m4809k0(2, zzbvvVarMo5161K.m4810u());
                                    String string10 = parcelM4809k27.readString();
                                    parcelM4809k27.recycle();
                                    Parcel parcelM4809k28 = zzbvvVarMo5161K.m4809k0(3, zzbvvVarMo5161K.m4810u());
                                    ArrayList arrayList3 = parcelM4809k28.readArrayList(zzben.f7689a);
                                    parcelM4809k28.recycle();
                                    Parcel parcelM4809k29 = zzbvvVarMo5161K.m4809k0(4, zzbvvVarMo5161K.m4810u());
                                    String string11 = parcelM4809k29.readString();
                                    parcelM4809k29.recycle();
                                    Parcel parcelM4809k30 = zzbvvVarMo5161K.m4809k0(13, zzbvvVarMo5161K.m4810u());
                                    Bundle bundle3 = (Bundle) zzben.m4814b(parcelM4809k30, Bundle.CREATOR);
                                    parcelM4809k30.recycle();
                                    Parcel parcelM4809k31 = zzbvvVarMo5161K.m4809k0(6, zzbvvVarMo5161K.m4810u());
                                    String string12 = parcelM4809k31.readString();
                                    parcelM4809k31.recycle();
                                    View view6 = (View) zzdqb.m5997n(zzbvvVarMo5161K.m5208k());
                                    Parcel parcelM4809k32 = zzbvvVarMo5161K.m4809k0(21, zzbvvVarMo5161K.m4810u());
                                    IObjectWrapper iObjectWrapperM3696k5 = IObjectWrapper.Stub.m3696k0(parcelM4809k32.readStrongBinder());
                                    parcelM4809k32.recycle();
                                    Parcel parcelM4809k33 = zzbvvVarMo5161K.m4809k0(7, zzbvvVarMo5161K.m4810u());
                                    String string13 = parcelM4809k33.readString();
                                    parcelM4809k33.recycle();
                                    Parcel parcelM4809k34 = zzbvvVarMo5161K.m4809k0(5, zzbvvVarMo5161K.m4810u());
                                    zzbml zzbmlVarM5066k6 = zzbmk.m5066k4(parcelM4809k34.readStrongBinder());
                                    parcelM4809k34.recycle();
                                    zzdqb zzdqbVar = new zzdqb();
                                    zzbvvVar = zzbvvVarMo5161K;
                                    try {
                                        zzdqbVar.f12610a = 1;
                                        zzdqbVar.f12611b = zzdqaVar3;
                                        zzdqbVar.f12612c = zzbmeVarM5064k6;
                                        zzdqbVar.f12613d = view5;
                                        zzdqbVar.m6009o("headline", string10);
                                        zzdqbVar.f12614e = arrayList3;
                                        zzdqbVar.m6009o("body", string11);
                                        zzdqbVar.f12617h = bundle3;
                                        zzdqbVar.m6009o("call_to_action", string12);
                                        zzdqbVar.f12624o = view6;
                                        zzdqbVar.f12626q = iObjectWrapperM3696k5;
                                        zzdqbVar.m6009o("advertiser", string13);
                                        zzdqbVar.f12629t = zzbmlVarM5066k6;
                                        zzdqbVarM5996m = zzdqbVar;
                                    } catch (RemoteException e4) {
                                        e = e4;
                                        int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                        com.google.android.gms.ads.internal.util.client.zzo.m3074g("Failed to get native ad from content ad mapper", e);
                                        zzdqbVarM5996m = null;
                                    }
                                } catch (RemoteException e5) {
                                    e = e5;
                                    zzbvvVar = zzbvvVarMo5161K;
                                }
                            }
                        } else {
                            try {
                                Parcel parcelM4809k35 = zzbvuVarMo5164M.m4809k0(17, zzbvuVarMo5164M.m4810u());
                                com.google.android.gms.ads.internal.client.zzea zzeaVarM2924k7 = com.google.android.gms.ads.internal.client.zzdz.m2924k4(parcelM4809k35.readStrongBinder());
                                parcelM4809k35.recycle();
                                zzdqa zzdqaVar4 = zzeaVarM2924k7 == null ? null : new zzdqa(zzeaVarM2924k7, null);
                                Parcel parcelM4809k36 = zzbvuVarMo5164M.m4809k0(19, zzbvuVarMo5164M.m4810u());
                                zzbme zzbmeVarM5064k7 = zzbmd.m5064k4(parcelM4809k36.readStrongBinder());
                                parcelM4809k36.recycle();
                                Parcel parcelM4809k37 = zzbvuVarMo5164M.m4809k0(18, zzbvuVarMo5164M.m4810u());
                                IObjectWrapper iObjectWrapperM3696k6 = IObjectWrapper.Stub.m3696k0(parcelM4809k37.readStrongBinder());
                                parcelM4809k37.recycle();
                                View view7 = (View) zzdqb.m5997n(iObjectWrapperM3696k6);
                                Parcel parcelM4809k38 = zzbvuVarMo5164M.m4809k0(2, zzbvuVarMo5164M.m4810u());
                                String string14 = parcelM4809k38.readString();
                                parcelM4809k38.recycle();
                                Parcel parcelM4809k39 = zzbvuVarMo5164M.m4809k0(3, zzbvuVarMo5164M.m4810u());
                                ArrayList arrayList4 = parcelM4809k39.readArrayList(zzben.f7689a);
                                parcelM4809k39.recycle();
                                zzfmeVar = zzfmeVar2;
                                try {
                                    Parcel parcelM4809k40 = zzbvuVarMo5164M.m4809k0(4, zzbvuVarMo5164M.m4810u());
                                    String string15 = parcelM4809k40.readString();
                                    parcelM4809k40.recycle();
                                    Parcel parcelM4809k41 = zzbvuVarMo5164M.m4809k0(15, zzbvuVarMo5164M.m4810u());
                                    Bundle bundle4 = (Bundle) zzben.m4814b(parcelM4809k41, Bundle.CREATOR);
                                    parcelM4809k41.recycle();
                                    zzbvyVar = zzbvyVarMo5159B;
                                    try {
                                        Parcel parcelM4809k42 = zzbvuVarMo5164M.m4809k0(6, zzbvuVarMo5164M.m4810u());
                                        String string16 = parcelM4809k42.readString();
                                        parcelM4809k42.recycle();
                                        View view8 = (View) zzdqb.m5997n(zzbvuVarMo5164M.m5207D0());
                                        zzbvvVar = zzbvvVarMo5161K;
                                        try {
                                            Parcel parcelM4809k43 = zzbvuVarMo5164M.m4809k0(21, zzbvuVarMo5164M.m4810u());
                                            IObjectWrapper iObjectWrapperM3696k7 = IObjectWrapper.Stub.m3696k0(parcelM4809k43.readStrongBinder());
                                            parcelM4809k43.recycle();
                                            Parcel parcelM4809k44 = zzbvuVarMo5164M.m4809k0(8, zzbvuVarMo5164M.m4810u());
                                            String string17 = parcelM4809k44.readString();
                                            parcelM4809k44.recycle();
                                            Parcel parcelM4809k45 = zzbvuVarMo5164M.m4809k0(9, zzbvuVarMo5164M.m4810u());
                                            String string18 = parcelM4809k45.readString();
                                            parcelM4809k45.recycle();
                                            Parcel parcelM4809k46 = zzbvuVarMo5164M.m4809k0(7, zzbvuVarMo5164M.m4810u());
                                            double d2 = parcelM4809k46.readDouble();
                                            parcelM4809k46.recycle();
                                            Parcel parcelM4809k47 = zzbvuVarMo5164M.m4809k0(5, zzbvuVarMo5164M.m4810u());
                                            zzbml zzbmlVarM5066k7 = zzbmk.m5066k4(parcelM4809k47.readStrongBinder());
                                            parcelM4809k47.recycle();
                                            zzdqb zzdqbVar2 = new zzdqb();
                                            zzbvuVar = zzbvuVarMo5164M;
                                            try {
                                                zzdqbVar2.f12610a = 2;
                                                zzdqbVar2.f12611b = zzdqaVar4;
                                                zzdqbVar2.f12612c = zzbmeVarM5064k7;
                                                zzdqbVar2.f12613d = view7;
                                                zzdqbVar2.m6009o("headline", string14);
                                                zzdqbVar2.f12614e = arrayList4;
                                                zzdqbVar2.m6009o("body", string15);
                                                zzdqbVar2.f12617h = bundle4;
                                                zzdqbVar2.m6009o("call_to_action", string16);
                                                zzdqbVar2.f12624o = view8;
                                                zzdqbVar2.f12626q = iObjectWrapperM3696k7;
                                                zzdqbVar2.m6009o("store", string17);
                                                zzdqbVar2.m6009o(FirebaseAnalytics.Param.PRICE, string18);
                                                zzdqbVar2.f12627r = d2;
                                                zzdqbVar2.f12628s = zzbmlVarM5066k7;
                                                zzdqbVarM5996m = zzdqbVar2;
                                            } catch (RemoteException e6) {
                                                e = e6;
                                                int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                com.google.android.gms.ads.internal.util.client.zzo.m3074g("Failed to get native ad from app install ad mapper", e);
                                                zzdqbVarM5996m = null;
                                            }
                                        } catch (RemoteException e7) {
                                            e = e7;
                                            zzbvuVar = zzbvuVarMo5164M;
                                        }
                                    } catch (RemoteException e8) {
                                        e = e8;
                                        zzbvuVar = zzbvuVarMo5164M;
                                        zzbvvVar = zzbvvVarMo5161K;
                                    }
                                } catch (RemoteException e9) {
                                    e = e9;
                                    zzbvuVar = zzbvuVarMo5164M;
                                    zzbvvVar = zzbvvVarMo5161K;
                                    zzbvyVar = zzbvyVarMo5159B;
                                    int i6 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                    com.google.android.gms.ads.internal.util.client.zzo.m3074g("Failed to get native ad from app install ad mapper", e);
                                    zzdqbVarM5996m = null;
                                    if (zzdqbVarM5996m != null) {
                                        if (zzfkyVar.f16005a.f15998a.f16044h.contains(Integer.toString(zzdqbVarM5996m.m6011q()))) {
                                            zzdqd zzdqdVarMo5728d = this.f14409b.mo5728d(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.f14191a), new zzdqm(zzdqbVarM5996m), new zzdsf(zzbvvVar, zzbvuVar, zzbvyVar));
                                            ((zzenp) zzemdVar.f14193c).m6294l4(zzdqdVarMo5728d.mo5735e());
                                            zzdqdVarMo5728d.mo5733a().m5924Y(new zzctg(zzfmeVar), this.f14410c);
                                            return zzdqdVarMo5728d.mo5761g();
                                        }
                                    }
                                    throw new zzepp(1, "No corresponding native ad listener");
                                }
                            } catch (RemoteException e10) {
                                e = e10;
                                zzfmeVar = zzfmeVar2;
                            }
                        }
                        if (zzdqbVarM5996m != null) {
                            if (zzfkyVar.f16005a.f15998a.f16044h.contains(Integer.toString(zzdqbVarM5996m.m6011q()))) {
                                zzdqd zzdqdVarMo5728d2 = this.f14409b.mo5728d(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.f14191a), new zzdqm(zzdqbVarM5996m), new zzdsf(zzbvvVar, zzbvuVar, zzbvyVar));
                                ((zzenp) zzemdVar.f14193c).m6294l4(zzdqdVarMo5728d2.mo5735e());
                                zzdqdVarMo5728d2.mo5733a().m5924Y(new zzctg(zzfmeVar), this.f14410c);
                                return zzdqdVarMo5728d2.mo5761g();
                            }
                        }
                        throw new zzepp(1, "No corresponding native ad listener");
                    }
                    zzdqbVarM5996m = zzdqb.m5995l(zzbvyVarMo5159B);
                    zzfmeVar = zzfmeVar2;
                    zzbvuVar = zzbvuVarMo5164M;
                    zzbvvVar = zzbvvVarMo5161K;
                    zzbvyVar = zzbvyVarMo5159B;
                    if (zzdqbVarM5996m != null) {
                        if (zzfkyVar.f16005a.f15998a.f16044h.contains(Integer.toString(zzdqbVarM5996m.m6011q()))) {
                            zzdqd zzdqdVarMo5728d3 = this.f14409b.mo5728d(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.f14191a), new zzdqm(zzdqbVarM5996m), new zzdsf(zzbvvVar, zzbvuVar, zzbvyVar));
                            ((zzenp) zzemdVar.f14193c).m6294l4(zzdqdVarMo5728d3.mo5735e());
                            zzdqdVarMo5728d3.mo5733a().m5924Y(new zzctg(zzfmeVar), this.f14410c);
                            return zzdqdVarMo5728d3.mo5761g();
                        }
                    }
                    throw new zzepp(1, "No corresponding native ad listener");
                } catch (Throwable th) {
                    throw new zzfln(th);
                }
            } catch (Throwable th2) {
                throw new zzfln(th2);
            }
        } catch (Throwable th3) {
            throw new zzfln(th3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    /* JADX INFO: renamed from: b */
    public final void mo6292b(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        zzfme zzfmeVar = (zzfme) zzemdVar.f14192b;
        zzflg zzflgVar = zzfkyVar.f16005a.f15998a;
        String string = zzfknVar.f15958v.toString();
        String strM3125i = com.google.android.gms.ads.internal.util.zzbp.m3125i(zzfknVar.f15952s);
        Context context = this.f14408a;
        zzbvp zzbvpVar = (zzbvp) zzemdVar.f14193c;
        zzbma zzbmaVar = zzflgVar.f16046j;
        ArrayList arrayList = zzflgVar.f16044h;
        try {
            zzfmeVar.f16105a.mo5178p2(new ObjectWrapper(context), zzflgVar.f16040d, string, strM3125i, zzbvpVar, zzbmaVar, arrayList);
        } catch (Throwable th) {
            throw new zzfln(th);
        }
    }
}
