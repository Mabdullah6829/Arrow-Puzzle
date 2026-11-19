package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class zzv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new zzw();

    /* JADX INFO: renamed from: s */
    public final String f3269s;

    /* JADX INFO: renamed from: t */
    public long f3270t;

    /* JADX INFO: renamed from: u */
    public zze f3271u;

    /* JADX INFO: renamed from: v */
    public final Bundle f3272v;

    /* JADX INFO: renamed from: w */
    public final String f3273w;

    /* JADX INFO: renamed from: x */
    public final String f3274x;

    /* JADX INFO: renamed from: y */
    public final String f3275y;

    /* JADX INFO: renamed from: z */
    public final String f3276z;

    public zzv(String str, long j2, zze zzeVar, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f3269s = str;
        this.f3270t = j2;
        this.f3271u = zzeVar;
        this.f3272v = bundle;
        this.f3273w = str2;
        this.f3274x = str3;
        this.f3275y = str4;
        this.f3276z = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 1, this.f3269s);
        long j2 = this.f3270t;
        SafeParcelWriter.m3588n(parcel, 2, 8);
        parcel.writeLong(j2);
        SafeParcelWriter.m3582h(parcel, 3, this.f3271u, i2);
        SafeParcelWriter.m3575a(4, this.f3272v, parcel);
        SafeParcelWriter.m3583i(parcel, 5, this.f3273w);
        SafeParcelWriter.m3583i(parcel, 6, this.f3274x);
        SafeParcelWriter.m3583i(parcel, 7, this.f3275y);
        SafeParcelWriter.m3583i(parcel, 8, this.f3276z);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
