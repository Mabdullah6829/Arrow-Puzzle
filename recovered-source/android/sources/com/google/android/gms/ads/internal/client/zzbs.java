package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbgt;

/* JADX INFO: loaded from: classes.dex */
public final class zzbs extends zzbel implements zzbu {
    public zzbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: D3 */
    public final void mo2841D3(zzfw zzfwVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, zzfwVar);
        m4811u0(29, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: F0 */
    public final void mo2842F0(zzcl zzclVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, zzclVar);
        m4811u0(8, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: G2 */
    public final void mo2843G2(boolean z) {
        Parcel parcelM4810u = m4810u();
        ClassLoader classLoader = zzben.f7689a;
        parcelM4810u.writeInt(z ? 1 : 0);
        m4811u0(22, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: I3 */
    public final void mo2844I3(IObjectWrapper iObjectWrapper) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        m4811u0(44, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: M3 */
    public final void mo2845M3(zzbh zzbhVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, zzbhVar);
        m4811u0(7, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: P */
    public final long mo2846P() {
        Parcel parcelM4809k0 = m4809k0(47, m4810u());
        long j2 = parcelM4809k0.readLong();
        parcelM4809k0.recycle();
        return j2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: U0 */
    public final void mo2847U0(zzm zzmVar, zzbk zzbkVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, zzmVar);
        zzben.m4817e(parcelM4810u, zzbkVar);
        m4811u0(43, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: W3 */
    public final void mo2848W3(zzbe zzbeVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, zzbeVar);
        m4811u0(20, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: Y0 */
    public final void mo2849Y0(long j2) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeLong(j2);
        m4811u0(48, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: Z */
    public final boolean mo2850Z(zzm zzmVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, zzmVar);
        Parcel parcelM4809k0 = m4809k0(4, parcelM4810u);
        boolean z = parcelM4809k0.readInt() != 0;
        parcelM4809k0.recycle();
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: Z0 */
    public final void mo2851Z0(boolean z) {
        Parcel parcelM4810u = m4810u();
        ClassLoader classLoader = zzben.f7689a;
        parcelM4810u.writeInt(z ? 1 : 0);
        m4811u0(34, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: b */
    public final void mo2852b() {
        m4811u0(5, m4810u());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: c */
    public final void mo2853c() {
        m4811u0(6, m4810u());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: c2 */
    public final void mo2854c2(zzbgt zzbgtVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, zzbgtVar);
        m4811u0(40, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: g */
    public final zzr mo2855g() {
        Parcel parcelM4809k0 = m4809k0(12, m4810u());
        zzr zzrVar = (zzr) zzben.m4814b(parcelM4809k0, zzr.CREATOR);
        parcelM4809k0.recycle();
        return zzrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: k */
    public final String mo2856k() {
        Parcel parcelM4809k0 = m4809k0(31, m4810u());
        String string = parcelM4809k0.readString();
        parcelM4809k0.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: o2 */
    public final void mo2857o2(zzr zzrVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, zzrVar);
        m4811u0(13, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: r */
    public final zzdx mo2858r() {
        zzdx zzdvVar;
        Parcel parcelM4809k0 = m4809k0(41, m4810u());
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        if (strongBinder == null) {
            zzdvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdvVar = iInterfaceQueryLocalInterface instanceof zzdx ? (zzdx) iInterfaceQueryLocalInterface : new zzdv(strongBinder);
        }
        parcelM4809k0.recycle();
        return zzdvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: v */
    public final zzcl mo2859v() {
        zzcl zzcjVar;
        Parcel parcelM4809k0 = m4809k0(32, m4810u());
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        if (strongBinder == null) {
            zzcjVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            zzcjVar = iInterfaceQueryLocalInterface instanceof zzcl ? (zzcl) iInterfaceQueryLocalInterface : new zzcj(strongBinder);
        }
        parcelM4809k0.recycle();
        return zzcjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: w */
    public final zzea mo2860w() {
        zzea zzdyVar;
        Parcel parcelM4809k0 = m4809k0(26, m4810u());
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        if (strongBinder == null) {
            zzdyVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            zzdyVar = iInterfaceQueryLocalInterface instanceof zzea ? (zzea) iInterfaceQueryLocalInterface : new zzdy(strongBinder);
        }
        parcelM4809k0.recycle();
        return zzdyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: x3 */
    public final void mo2861x3(zzdq zzdqVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, zzdqVar);
        m4811u0(42, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: z */
    public final zzbh mo2862z() {
        zzbh zzbfVar;
        Parcel parcelM4809k0 = m4809k0(33, m4810u());
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        if (strongBinder == null) {
            zzbfVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            zzbfVar = iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbf(strongBinder);
        }
        parcelM4809k0.recycle();
        return zzbfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: z3 */
    public final void mo2863z3(zzcs zzcsVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, zzcsVar);
        m4811u0(45, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzb() {
        return AbstractC1456a.m2439f(m4809k0(1, m4810u()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzc() {
        m4811u0(2, m4810u());
    }
}
