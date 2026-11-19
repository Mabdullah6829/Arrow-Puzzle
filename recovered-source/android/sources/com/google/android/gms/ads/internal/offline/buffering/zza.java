package com.google.android.gms.ads.internal.offline.buffering;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();

    /* JADX INFO: renamed from: s */
    public final String f3282s;

    /* JADX INFO: renamed from: t */
    public final String f3283t;

    /* JADX INFO: renamed from: u */
    public final String f3284u;

    public zza(String str, String str2, String str3) {
        this.f3282s = str;
        this.f3283t = str2;
        this.f3284u = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 1, this.f3282s);
        SafeParcelWriter.m3583i(parcel, 2, this.f3283t);
        SafeParcelWriter.m3583i(parcel, 3, this.f3284u);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
