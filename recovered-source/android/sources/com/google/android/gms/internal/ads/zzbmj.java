package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbmj extends zzbel implements zzbml {
    public zzbmj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    /* JADX INFO: renamed from: a */
    public final int mo5058a() {
        Parcel parcelM4809k0 = m4809k0(4, m4810u());
        int i2 = parcelM4809k0.readInt();
        parcelM4809k0.recycle();
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    /* JADX INFO: renamed from: b */
    public final int mo5059b() {
        Parcel parcelM4809k0 = m4809k0(5, m4810u());
        int i2 = parcelM4809k0.readInt();
        parcelM4809k0.recycle();
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    /* JADX INFO: renamed from: c */
    public final Map mo5060c() {
        Parcel parcelM4809k0 = m4809k0(6, m4810u());
        HashMap hashMap = parcelM4809k0.readHashMap(zzben.f7689a);
        parcelM4809k0.recycle();
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    /* JADX INFO: renamed from: d */
    public final double mo5061d() {
        Parcel parcelM4809k0 = m4809k0(3, m4810u());
        double d = parcelM4809k0.readDouble();
        parcelM4809k0.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final IObjectWrapper zzb() {
        return AbstractC1456a.m2439f(m4809k0(1, m4810u()));
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final Uri zzc() {
        Parcel parcelM4809k0 = m4809k0(2, m4810u());
        Uri uri = (Uri) zzben.m4814b(parcelM4809k0, Uri.CREATOR);
        parcelM4809k0.recycle();
        return uri;
    }
}
