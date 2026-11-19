package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zzcat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcat> CREATOR = new zzcau();

    /* JADX INFO: renamed from: s */
    public final String f9661s;

    public zzcat(String str) {
        this.f9661s = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 1, this.f9661s);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
