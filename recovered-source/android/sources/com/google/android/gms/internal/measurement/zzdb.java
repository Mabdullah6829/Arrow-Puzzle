package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzdb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdb> CREATOR = new zzdc();

    /* JADX INFO: renamed from: s */
    public final long f22353s;

    /* JADX INFO: renamed from: t */
    public final long f22354t;

    /* JADX INFO: renamed from: u */
    public final boolean f22355u;

    /* JADX INFO: renamed from: v */
    public final Bundle f22356v;

    /* JADX INFO: renamed from: w */
    public final String f22357w;

    public zzdb(long j2, long j3, boolean z, Bundle bundle, String str) {
        this.f22353s = j2;
        this.f22354t = j3;
        this.f22355u = z;
        this.f22356v = bundle;
        this.f22357w = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 8);
        parcel.writeLong(this.f22353s);
        SafeParcelWriter.m3588n(parcel, 2, 8);
        parcel.writeLong(this.f22354t);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f22355u ? 1 : 0);
        SafeParcelWriter.m3575a(7, this.f22356v, parcel);
        SafeParcelWriter.m3583i(parcel, 8, this.f22357w);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
