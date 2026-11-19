package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzccd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzccd> CREATOR = new zzcce();

    /* JADX INFO: renamed from: s */
    public final com.google.android.gms.ads.internal.client.zzm f9738s;

    /* JADX INFO: renamed from: t */
    public final String f9739t;

    public zzccd(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) {
        this.f9738s = zzmVar;
        this.f9739t = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3582h(parcel, 2, this.f9738s, i2);
        SafeParcelWriter.m3583i(parcel, 3, this.f9739t);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
