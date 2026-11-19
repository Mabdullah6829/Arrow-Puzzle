package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbvw extends zzbel implements zzbvy {
    public zzbvw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: A3 */
    public final Bundle mo5209A3() {
        Parcel parcelM4809k0 = m4809k0(16, m4810u());
        Bundle bundle = (Bundle) zzben.m4814b(parcelM4809k0, Bundle.CREATOR);
        parcelM4809k0.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: B */
    public final void mo5210B() {
        m4811u0(26, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: C */
    public final float mo5211C() {
        Parcel parcelM4809k0 = m4809k0(24, m4810u());
        float f2 = parcelM4809k0.readFloat();
        parcelM4809k0.recycle();
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: F1 */
    public final boolean mo5212F1() {
        Parcel parcelM4809k0 = m4809k0(18, m4810u());
        ClassLoader classLoader = zzben.f7689a;
        boolean z = parcelM4809k0.readInt() != 0;
        parcelM4809k0.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: G1 */
    public final void mo5213G1(IObjectWrapper iObjectWrapper) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        m4811u0(22, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: W */
    public final void mo5214W(IObjectWrapper iObjectWrapper) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        m4811u0(20, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: X0 */
    public final void mo5215X0(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        zzben.m4817e(parcelM4810u, iObjectWrapper2);
        zzben.m4817e(parcelM4810u, iObjectWrapper3);
        m4811u0(21, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: a */
    public final String mo5216a() {
        Parcel parcelM4809k0 = m4809k0(2, m4810u());
        String string = parcelM4809k0.readString();
        parcelM4809k0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: b */
    public final List mo5217b() {
        Parcel parcelM4809k0 = m4809k0(3, m4810u());
        ArrayList arrayList = parcelM4809k0.readArrayList(zzben.f7689a);
        parcelM4809k0.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: c */
    public final String mo5218c() {
        Parcel parcelM4809k0 = m4809k0(4, m4810u());
        String string = parcelM4809k0.readString();
        parcelM4809k0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: e */
    public final String mo5219e() {
        Parcel parcelM4809k0 = m4809k0(10, m4810u());
        String string = parcelM4809k0.readString();
        parcelM4809k0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: f */
    public final IObjectWrapper mo5220f() {
        return AbstractC1456a.m2439f(m4809k0(14, m4810u()));
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: g */
    public final com.google.android.gms.ads.internal.client.zzea mo5221g() {
        Parcel parcelM4809k0 = m4809k0(11, m4810u());
        com.google.android.gms.ads.internal.client.zzea zzeaVarM2924k4 = com.google.android.gms.ads.internal.client.zzdz.m2924k4(parcelM4809k0.readStrongBinder());
        parcelM4809k0.recycle();
        return zzeaVarM2924k4;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: i */
    public final IObjectWrapper mo5222i() {
        return AbstractC1456a.m2439f(m4809k0(13, m4810u()));
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: j */
    public final zzbme mo5223j() {
        Parcel parcelM4809k0 = m4809k0(12, m4810u());
        zzbme zzbmeVarM5064k4 = zzbmd.m5064k4(parcelM4809k0.readStrongBinder());
        parcelM4809k0.recycle();
        return zzbmeVarM5064k4;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: n */
    public final IObjectWrapper mo5224n() {
        return AbstractC1456a.m2439f(m4809k0(15, m4810u()));
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: r */
    public final boolean mo5225r() {
        Parcel parcelM4809k0 = m4809k0(17, m4810u());
        ClassLoader classLoader = zzben.f7689a;
        boolean z = parcelM4809k0.readInt() != 0;
        parcelM4809k0.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: t */
    public final float mo5226t() {
        Parcel parcelM4809k0 = m4809k0(25, m4810u());
        float f2 = parcelM4809k0.readFloat();
        parcelM4809k0.recycle();
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: v */
    public final void mo5227v() {
        m4811u0(19, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: x */
    public final float mo5228x() {
        Parcel parcelM4809k0 = m4809k0(23, m4810u());
        float f2 = parcelM4809k0.readFloat();
        parcelM4809k0.recycle();
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final zzbml zzh() {
        Parcel parcelM4809k0 = m4809k0(5, m4810u());
        zzbml zzbmlVarM5066k4 = zzbmk.m5066k4(parcelM4809k0.readStrongBinder());
        parcelM4809k0.recycle();
        return zzbmlVarM5066k4;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final String zzi() {
        Parcel parcelM4809k0 = m4809k0(6, m4810u());
        String string = parcelM4809k0.readString();
        parcelM4809k0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final String zzj() {
        Parcel parcelM4809k0 = m4809k0(7, m4810u());
        String string = parcelM4809k0.readString();
        parcelM4809k0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final double zzk() {
        Parcel parcelM4809k0 = m4809k0(8, m4810u());
        double d = parcelM4809k0.readDouble();
        parcelM4809k0.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final String zzl() {
        Parcel parcelM4809k0 = m4809k0(9, m4810u());
        String string = parcelM4809k0.readString();
        parcelM4809k0.recycle();
        return string;
    }
}
