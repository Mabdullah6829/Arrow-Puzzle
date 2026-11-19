package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzehz implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzcat f13937a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzcbc f13938b;

    public zzehz(zzeiq zzeiqVar, zzcbc zzcbcVar, zzcat zzcatVar) {
        this.f13938b = zzcbcVar;
        this.f13937a = zzcatVar;
        Objects.requireNonNull(zzeiqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        String str = (String) obj;
        try {
            zzcbc zzcbcVar = this.f13938b;
            zzcat zzcatVar = this.f13937a;
            Parcel parcelM4810u = zzcbcVar.m4810u();
            parcelM4810u.writeString(str);
            zzben.m4815c(parcelM4810u, zzcatVar);
            zzcbcVar.m4811u0(1, parcelM4810u);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.m3151l("Service can't call client", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        try {
            zzcbc zzcbcVar = this.f13938b;
            Parcelable.Creator<com.google.android.gms.ads.internal.util.zzba> creator = com.google.android.gms.ads.internal.util.zzba.CREATOR;
            com.google.android.gms.ads.internal.client.zze zzeVarM6532a = zzfmi.m6532a(th);
            com.google.android.gms.ads.internal.util.zzba zzbaVar = new com.google.android.gms.ads.internal.util.zzba(zzgui.m7148a(th.getMessage()) ? zzeVarM6532a.f3107t : th.getMessage(), zzeVarM6532a.f3106s);
            Parcel parcelM4810u = zzcbcVar.m4810u();
            zzben.m4815c(parcelM4810u, zzbaVar);
            zzcbcVar.m4811u0(2, parcelM4810u);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.m3151l("Service can't call client", e);
        }
    }
}
