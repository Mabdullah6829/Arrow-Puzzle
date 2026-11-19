package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zzbrj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbrj> CREATOR = new zzbrk();

    /* JADX INFO: renamed from: s */
    public final String f9290s;

    /* JADX INFO: renamed from: t */
    public final String[] f9291t;

    /* JADX INFO: renamed from: u */
    public final String[] f9292u;

    public zzbrj(String str, String[] strArr, String[] strArr2) {
        this.f9290s = str;
        this.f9291t = strArr;
        this.f9292u = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 1, this.f9290s);
        SafeParcelWriter.m3584j(parcel, 2, this.f9291t);
        SafeParcelWriter.m3584j(parcel, 3, this.f9292u);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
