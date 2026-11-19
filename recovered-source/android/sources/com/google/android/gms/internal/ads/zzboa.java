package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzboa extends zzbel implements zzboc {
    @Override // com.google.android.gms.internal.ads.zzboc
    /* JADX INFO: renamed from: L */
    public final com.google.android.gms.ads.internal.client.zzdx mo5080L() {
        Parcel parcelM4809k0 = m4809k0(31, m4810u());
        com.google.android.gms.ads.internal.client.zzdx zzdxVarM2920k4 = com.google.android.gms.ads.internal.client.zzdw.m2920k4(parcelM4809k0.readStrongBinder());
        parcelM4809k0.recycle();
        return zzdxVarM2920k4;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    /* JADX INFO: renamed from: Q */
    public final void mo5081Q() {
        m4811u0(13, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    /* JADX INFO: renamed from: a */
    public final String mo5082a() {
        Parcel parcelM4809k0 = m4809k0(2, m4810u());
        String string = parcelM4809k0.readString();
        parcelM4809k0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    /* JADX INFO: renamed from: b */
    public final List mo5083b() {
        Parcel parcelM4809k0 = m4809k0(3, m4810u());
        ArrayList arrayList = parcelM4809k0.readArrayList(zzben.f7689a);
        parcelM4809k0.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    /* JADX INFO: renamed from: c */
    public final String mo5084c() {
        Parcel parcelM4809k0 = m4809k0(4, m4810u());
        String string = parcelM4809k0.readString();
        parcelM4809k0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    /* JADX INFO: renamed from: e */
    public final String mo5085e() {
        Parcel parcelM4809k0 = m4809k0(10, m4810u());
        String string = parcelM4809k0.readString();
        parcelM4809k0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    /* JADX INFO: renamed from: f */
    public final zzbme mo5086f() {
        zzbme zzbmcVar;
        Parcel parcelM4809k0 = m4809k0(14, m4810u());
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        if (strongBinder == null) {
            zzbmcVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbmcVar = iInterfaceQueryLocalInterface instanceof zzbme ? (zzbme) iInterfaceQueryLocalInterface : new zzbmc(strongBinder);
        }
        parcelM4809k0.recycle();
        return zzbmcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    /* JADX INFO: renamed from: g */
    public final com.google.android.gms.ads.internal.client.zzea mo5087g() {
        Parcel parcelM4809k0 = m4809k0(11, m4810u());
        com.google.android.gms.ads.internal.client.zzea zzeaVarM2924k4 = com.google.android.gms.ads.internal.client.zzdz.m2924k4(parcelM4809k0.readStrongBinder());
        parcelM4809k0.recycle();
        return zzeaVarM2924k4;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    /* JADX INFO: renamed from: k */
    public final IObjectWrapper mo5088k() {
        return AbstractC1456a.m2439f(m4809k0(18, m4810u()));
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    /* JADX INFO: renamed from: v */
    public final IObjectWrapper mo5089v() {
        return AbstractC1456a.m2439f(m4809k0(19, m4810u()));
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    /* JADX INFO: renamed from: w */
    public final zzbmi mo5090w() {
        zzbmi zzbmgVar;
        Parcel parcelM4809k0 = m4809k0(29, m4810u());
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        if (strongBinder == null) {
            zzbmgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbmgVar = iInterfaceQueryLocalInterface instanceof zzbmi ? (zzbmi) iInterfaceQueryLocalInterface : new zzbmg(strongBinder);
        }
        parcelM4809k0.recycle();
        return zzbmgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    /* JADX INFO: renamed from: x */
    public final List mo5091x() {
        Parcel parcelM4809k0 = m4809k0(23, m4810u());
        ArrayList arrayList = parcelM4809k0.readArrayList(zzben.f7689a);
        parcelM4809k0.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    /* JADX INFO: renamed from: y2 */
    public final void mo5092y2(Bundle bundle) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, bundle);
        m4811u0(33, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final zzbml zzh() {
        zzbml zzbmjVar;
        Parcel parcelM4809k0 = m4809k0(5, m4810u());
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        if (strongBinder == null) {
            zzbmjVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbmjVar = iInterfaceQueryLocalInterface instanceof zzbml ? (zzbml) iInterfaceQueryLocalInterface : new zzbmj(strongBinder);
        }
        parcelM4809k0.recycle();
        return zzbmjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final String zzi() {
        Parcel parcelM4809k0 = m4809k0(6, m4810u());
        String string = parcelM4809k0.readString();
        parcelM4809k0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final String zzj() {
        Parcel parcelM4809k0 = m4809k0(7, m4810u());
        String string = parcelM4809k0.readString();
        parcelM4809k0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final double zzk() {
        Parcel parcelM4809k0 = m4809k0(8, m4810u());
        double d = parcelM4809k0.readDouble();
        parcelM4809k0.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final String zzl() {
        Parcel parcelM4809k0 = m4809k0(9, m4810u());
        String string = parcelM4809k0.readString();
        parcelM4809k0.recycle();
        return string;
    }
}
