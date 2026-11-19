package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzdv extends zzbel implements zzdx {
    public zzdv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    /* JADX INFO: renamed from: a */
    public final String mo2917a() {
        Parcel parcelM4809k0 = m4809k0(1, m4810u());
        String string = parcelM4809k0.readString();
        parcelM4809k0.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    /* JADX INFO: renamed from: b */
    public final String mo2918b() {
        Parcel parcelM4809k0 = m4809k0(2, m4810u());
        String string = parcelM4809k0.readString();
        parcelM4809k0.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    /* JADX INFO: renamed from: c */
    public final List mo2919c() {
        Parcel parcelM4809k0 = m4809k0(3, m4810u());
        ArrayList arrayListCreateTypedArrayList = parcelM4809k0.createTypedArrayList(zzv.CREATOR);
        parcelM4809k0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final zzv zzh() {
        Parcel parcelM4809k0 = m4809k0(4, m4810u());
        zzv zzvVar = (zzv) zzben.m4814b(parcelM4809k0, zzv.CREATOR);
        parcelM4809k0.recycle();
        return zzvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final Bundle zzi() {
        Parcel parcelM4809k0 = m4809k0(5, m4810u());
        Bundle bundle = (Bundle) zzben.m4814b(parcelM4809k0, Bundle.CREATOR);
        parcelM4809k0.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zzj() {
        Parcel parcelM4809k0 = m4809k0(6, m4810u());
        String string = parcelM4809k0.readString();
        parcelM4809k0.recycle();
        return string;
    }
}
