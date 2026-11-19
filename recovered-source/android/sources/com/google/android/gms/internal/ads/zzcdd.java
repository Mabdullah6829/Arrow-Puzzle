package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zzcdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcdd> CREATOR = new zzcde();

    /* JADX INFO: renamed from: s */
    public final String f9758s;

    /* JADX INFO: renamed from: t */
    public final String f9759t;

    public zzcdd(String str, String str2) {
        this.f9758s = str;
        this.f9759t = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 1, this.f9758s);
        SafeParcelWriter.m3583i(parcel, 2, this.f9759t);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
