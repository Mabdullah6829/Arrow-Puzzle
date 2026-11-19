package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzcex extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcex> CREATOR = new zzcey();

    /* JADX INFO: renamed from: s */
    public final String f9851s;

    /* JADX INFO: renamed from: t */
    public final String f9852t;

    /* JADX INFO: renamed from: u */
    public final com.google.android.gms.ads.internal.client.zzr f9853u;

    /* JADX INFO: renamed from: v */
    public final com.google.android.gms.ads.internal.client.zzm f9854v;

    public zzcex(String str, String str2, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.f9851s = str;
        this.f9852t = str2;
        this.f9853u = zzrVar;
        this.f9854v = zzmVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 1, this.f9851s);
        SafeParcelWriter.m3583i(parcel, 2, this.f9852t);
        SafeParcelWriter.m3582h(parcel, 3, this.f9853u, i2);
        SafeParcelWriter.m3582h(parcel, 4, this.f9854v, i2);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
