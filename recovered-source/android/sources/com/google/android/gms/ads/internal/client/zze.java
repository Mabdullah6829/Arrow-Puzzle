package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();

    /* JADX INFO: renamed from: s */
    public final int f3106s;

    /* JADX INFO: renamed from: t */
    public final String f3107t;

    /* JADX INFO: renamed from: u */
    public final String f3108u;

    /* JADX INFO: renamed from: v */
    public zze f3109v;

    /* JADX INFO: renamed from: w */
    public IBinder f3110w;

    public zze(int i2, String str, String str2, zze zzeVar, IBinder iBinder) {
        this.f3106s = i2;
        this.f3107t = str;
        this.f3108u = str2;
        this.f3109v = zzeVar;
        this.f3110w = iBinder;
    }

    /* JADX INFO: renamed from: H */
    public final LoadAdError m2925H() {
        AdError adError;
        zzdx zzdvVar;
        zze zzeVar = this.f3109v;
        if (zzeVar == null) {
            adError = null;
        } else {
            adError = new AdError(zzeVar.f3106s, zzeVar.f3107t, zzeVar.f3108u, null);
        }
        IBinder iBinder = this.f3110w;
        if (iBinder == null) {
            zzdvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdvVar = iInterfaceQueryLocalInterface instanceof zzdx ? (zzdx) iInterfaceQueryLocalInterface : new zzdv(iBinder);
        }
        return new LoadAdError(this.f3106s, this.f3107t, this.f3108u, adError, zzdvVar != null ? new ResponseInfo(zzdvVar) : null);
    }

    /* JADX INFO: renamed from: w */
    public final AdError m2926w() {
        zze zzeVar = this.f3109v;
        AdError adError = null;
        if (zzeVar != null) {
            String str = zzeVar.f3108u;
            adError = new AdError(zzeVar.f3106s, zzeVar.f3107t, str, null);
        }
        return new AdError(this.f3106s, this.f3107t, this.f3108u, adError);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f3106s);
        SafeParcelWriter.m3583i(parcel, 2, this.f3107t);
        SafeParcelWriter.m3583i(parcel, 3, this.f3108u);
        SafeParcelWriter.m3582h(parcel, 4, this.f3109v, i2);
        SafeParcelWriter.m3578d(parcel, 5, this.f3110w);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
