package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbvk extends zzbel implements zzbvm {
    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: A2 */
    public final void mo5158A2(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, zzcch zzcchVar, String str) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        zzben.m4815c(parcelM4810u, zzmVar);
        parcelM4810u.writeString(null);
        zzben.m4817e(parcelM4810u, zzcchVar);
        parcelM4810u.writeString(str);
        m4811u0(10, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: B */
    public final zzbvy mo5159B() {
        zzbvy zzbvwVar;
        Parcel parcelM4809k0 = m4809k0(27, m4810u());
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        if (strongBinder == null) {
            zzbvwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbvwVar = iInterfaceQueryLocalInterface instanceof zzbvy ? (zzbvy) iInterfaceQueryLocalInterface : new zzbvw(strongBinder);
        }
        parcelM4809k0.recycle();
        return zzbvwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: J */
    public final zzbvs mo5160J() {
        zzbvs zzbvqVar;
        Parcel parcelM4809k0 = m4809k0(36, m4810u());
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        if (strongBinder == null) {
            zzbvqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbvqVar = iInterfaceQueryLocalInterface instanceof zzbvs ? (zzbvs) iInterfaceQueryLocalInterface : new zzbvq(strongBinder);
        }
        parcelM4809k0.recycle();
        return zzbvqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: K */
    public final zzbvv mo5161K() {
        zzbvv zzbvvVar;
        Parcel parcelM4809k0 = m4809k0(16, m4810u());
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        if (strongBinder == null) {
            zzbvvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbvvVar = iInterfaceQueryLocalInterface instanceof zzbvv ? (zzbvv) iInterfaceQueryLocalInterface : new zzbvv(strongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
        }
        parcelM4809k0.recycle();
        return zzbvvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: L */
    public final zzbxx mo5162L() {
        Parcel parcelM4809k0 = m4809k0(33, m4810u());
        zzbxx zzbxxVar = (zzbxx) zzben.m4814b(parcelM4809k0, zzbxx.CREATOR);
        parcelM4809k0.recycle();
        return zzbxxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: L0 */
    public final void mo5163L0(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, zzmVar);
        parcelM4810u.writeString(str);
        m4811u0(11, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: M */
    public final zzbvu mo5164M() {
        zzbvu zzbvuVar;
        Parcel parcelM4809k0 = m4809k0(15, m4810u());
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        if (strongBinder == null) {
            zzbvuVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbvuVar = iInterfaceQueryLocalInterface instanceof zzbvu ? (zzbvu) iInterfaceQueryLocalInterface : new zzbvu(strongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        }
        parcelM4809k0.recycle();
        return zzbvuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: Q */
    public final void mo5165Q() {
        m4811u0(12, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: Q1 */
    public final void mo5166Q1(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbvp zzbvpVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        zzben.m4815c(parcelM4810u, zzmVar);
        parcelM4810u.writeString(str);
        zzben.m4817e(parcelM4810u, zzbvpVar);
        m4811u0(32, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: U */
    public final zzbxx mo5167U() {
        Parcel parcelM4809k0 = m4809k0(34, m4810u());
        zzbxx zzbxxVar = (zzbxx) zzben.m4814b(parcelM4809k0, zzbxx.CREATOR);
        parcelM4809k0.recycle();
        return zzbxxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: V3 */
    public final void mo5168V3(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbvp zzbvpVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        zzben.m4815c(parcelM4810u, zzmVar);
        parcelM4810u.writeString(str);
        parcelM4810u.writeString(str2);
        zzben.m4817e(parcelM4810u, zzbvpVar);
        m4811u0(7, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: W */
    public final void mo5169W(IObjectWrapper iObjectWrapper) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        m4811u0(21, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: a2 */
    public final void mo5170a2(IObjectWrapper iObjectWrapper) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        m4811u0(30, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: b */
    public final IObjectWrapper mo5171b() {
        return AbstractC1456a.m2439f(m4809k0(2, m4810u()));
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: b2 */
    public final void mo5172b2(boolean z) {
        Parcel parcelM4810u = m4810u();
        ClassLoader classLoader = zzben.f7689a;
        parcelM4810u.writeInt(z ? 1 : 0);
        m4811u0(25, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: c4 */
    public final void mo5173c4(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbvp zzbvpVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        zzben.m4815c(parcelM4810u, zzmVar);
        parcelM4810u.writeString(str);
        zzben.m4817e(parcelM4810u, zzbvpVar);
        m4811u0(28, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: e */
    public final void mo5174e() {
        m4811u0(9, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: f */
    public final boolean mo5175f() {
        Parcel parcelM4809k0 = m4809k0(13, m4810u());
        ClassLoader classLoader = zzben.f7689a;
        boolean z = parcelM4809k0.readInt() != 0;
        parcelM4809k0.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: k1 */
    public final void mo5176k1(IObjectWrapper iObjectWrapper) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        m4811u0(37, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: k2 */
    public final void mo5177k2(IObjectWrapper iObjectWrapper) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        m4811u0(39, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: p2 */
    public final void mo5178p2(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbvp zzbvpVar, zzbma zzbmaVar, ArrayList arrayList) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        zzben.m4815c(parcelM4810u, zzmVar);
        parcelM4810u.writeString(str);
        parcelM4810u.writeString(str2);
        zzben.m4817e(parcelM4810u, zzbvpVar);
        zzben.m4815c(parcelM4810u, zzbmaVar);
        parcelM4810u.writeStringList(arrayList);
        m4811u0(14, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: r3 */
    public final void mo5179r3(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbvp zzbvpVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        zzben.m4815c(parcelM4810u, zzrVar);
        zzben.m4815c(parcelM4810u, zzmVar);
        parcelM4810u.writeString(str);
        parcelM4810u.writeString(str2);
        zzben.m4817e(parcelM4810u, zzbvpVar);
        m4811u0(35, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: s */
    public final boolean mo5180s() {
        Parcel parcelM4809k0 = m4809k0(22, m4810u());
        ClassLoader classLoader = zzben.f7689a;
        boolean z = parcelM4809k0.readInt() != 0;
        parcelM4809k0.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: s2 */
    public final void mo5181s2(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbvp zzbvpVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        zzben.m4815c(parcelM4810u, zzmVar);
        parcelM4810u.writeString(str);
        zzben.m4817e(parcelM4810u, zzbvpVar);
        m4811u0(38, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: t */
    public final com.google.android.gms.ads.internal.client.zzea mo5182t() {
        Parcel parcelM4809k0 = m4809k0(26, m4810u());
        com.google.android.gms.ads.internal.client.zzea zzeaVarM2924k4 = com.google.android.gms.ads.internal.client.zzdz.m2924k4(parcelM4809k0.readStrongBinder());
        parcelM4809k0.recycle();
        return zzeaVarM2924k4;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: v1 */
    public final void mo5183v1(IObjectWrapper iObjectWrapper, zzbsa zzbsaVar, ArrayList arrayList) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        zzben.m4817e(parcelM4810u, zzbsaVar);
        parcelM4810u.writeTypedList(arrayList);
        m4811u0(31, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: w0 */
    public final void mo5184w0(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbvp zzbvpVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        zzben.m4815c(parcelM4810u, zzrVar);
        zzben.m4815c(parcelM4810u, zzmVar);
        parcelM4810u.writeString(str);
        parcelM4810u.writeString(str2);
        zzben.m4817e(parcelM4810u, zzbvpVar);
        m4811u0(6, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: w2 */
    public final void mo5185w2(IObjectWrapper iObjectWrapper, zzcch zzcchVar, List list) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        zzben.m4817e(parcelM4810u, zzcchVar);
        parcelM4810u.writeStringList(list);
        m4811u0(23, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzh() {
        m4811u0(4, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzi() {
        m4811u0(5, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzl() {
        m4811u0(8, m4810u());
    }
}
