package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzfp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfp> CREATOR = new zzfq();

    /* JADX INFO: renamed from: s */
    public final String f3189s;

    /* JADX INFO: renamed from: t */
    public final int f3190t;

    /* JADX INFO: renamed from: u */
    public final zzm f3191u;

    /* JADX INFO: renamed from: v */
    public final int f3192v;

    /* JADX INFO: renamed from: w */
    public final boolean f3193w;

    public zzfp(String str, int i2, zzm zzmVar, int i3, boolean z) {
        this.f3189s = str;
        this.f3190t = i2;
        this.f3191u = zzmVar;
        this.f3192v = i3;
        this.f3193w = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfp)) {
            return false;
        }
        zzfp zzfpVar = (zzfp) obj;
        return this.f3189s.equals(zzfpVar.f3189s) && this.f3190t == zzfpVar.f3190t && this.f3191u.m2977w(zzfpVar.f3191u);
    }

    public final int hashCode() {
        return Objects.hash(this.f3189s, Integer.valueOf(this.f3190t), this.f3191u);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 1, this.f3189s);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f3190t);
        SafeParcelWriter.m3582h(parcel, 3, this.f3191u, i2);
        SafeParcelWriter.m3588n(parcel, 4, 4);
        parcel.writeInt(this.f3192v);
        SafeParcelWriter.m3588n(parcel, 5, 4);
        parcel.writeInt(this.f3193w ? 1 : 0);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
