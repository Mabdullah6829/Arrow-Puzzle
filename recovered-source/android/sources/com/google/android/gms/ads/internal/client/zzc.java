package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zzd();

    /* JADX INFO: renamed from: s */
    public final String f3101s;

    /* JADX INFO: renamed from: t */
    public final String f3102t;

    public zzc(String str, String str2) {
        this.f3101s = str;
        this.f3102t = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 1, this.f3101s);
        SafeParcelWriter.m3583i(parcel, 2, this.f3102t);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
