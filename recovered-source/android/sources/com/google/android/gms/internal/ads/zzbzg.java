package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbzg extends zzbel implements zzbzi {
    public zzbzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: F */
    public final void mo2989F() {
        m4811u0(8, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: N */
    public final void mo2990N(IObjectWrapper iObjectWrapper) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        m4811u0(13, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: Q */
    public final void mo2991Q() {
        m4811u0(7, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: Q3 */
    public final void mo2992Q3(Bundle bundle) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, bundle);
        m4811u0(1, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: a */
    public final void mo2993a() {
        m4811u0(10, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: b */
    public final void mo2994b() {
        m4811u0(14, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: c */
    public final boolean mo2995c() {
        Parcel parcelM4809k0 = m4809k0(11, m4810u());
        ClassLoader classLoader = zzben.f7689a;
        boolean z = parcelM4809k0.readInt() != 0;
        parcelM4809k0.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: h */
    public final void mo2996h() {
        m4811u0(9, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: o1 */
    public final void mo2999o1(int i2, String[] strArr, int[] iArr) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeInt(i2);
        parcelM4810u.writeStringArray(strArr);
        parcelM4810u.writeIntArray(iArr);
        m4811u0(15, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: x1 */
    public final void mo3000x1(int i2, int i3, Intent intent) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeInt(i2);
        parcelM4810u.writeInt(i3);
        zzben.m4815c(parcelM4810u, intent);
        m4811u0(12, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzi() {
        m4811u0(2, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzj() {
        m4811u0(3, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzk() {
        m4811u0(4, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzl() {
        m4811u0(5, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzo(Bundle bundle) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, bundle);
        Parcel parcelM4809k0 = m4809k0(6, parcelM4810u);
        if (parcelM4809k0.readInt() != 0) {
            bundle.readFromParcel(parcelM4809k0);
        }
        parcelM4809k0.recycle();
    }
}
