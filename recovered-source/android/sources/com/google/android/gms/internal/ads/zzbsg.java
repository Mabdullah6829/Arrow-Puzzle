package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zzbsg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbsg> CREATOR = new zzbsh();

    /* JADX INFO: renamed from: s */
    public final String f9313s;

    /* JADX INFO: renamed from: t */
    public final Bundle f9314t;

    public zzbsg(Bundle bundle, String str) {
        this.f9313s = str;
        this.f9314t = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 1, this.f9313s);
        SafeParcelWriter.m3575a(2, this.f9314t, parcel);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
