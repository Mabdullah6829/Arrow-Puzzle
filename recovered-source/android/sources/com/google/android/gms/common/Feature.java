package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new zzb();

    /* JADX INFO: renamed from: s */
    public final String f4149s;

    /* JADX INFO: renamed from: t */
    public final int f4150t;

    /* JADX INFO: renamed from: u */
    public final long f4151u;

    /* JADX INFO: renamed from: v */
    public final boolean f4152v;

    public Feature(String str, int i2, long j2, boolean z) {
        this.f4149s = str;
        this.f4150t = i2;
        this.f4151u = j2;
        this.f4152v = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (Objects.m3535a(this.f4149s, feature.f4149s) && m3395w() == feature.m3395w() && this.f4152v == feature.f4152v) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4149s, Long.valueOf(m3395w()), Boolean.valueOf(this.f4152v)});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.m3536a(this.f4149s, AppMeasurementSdk.ConditionalUserProperty.NAME);
        toStringHelper.m3536a(Long.valueOf(m3395w()), "version");
        toStringHelper.m3536a(Boolean.valueOf(this.f4152v), "is_fully_rolled_out");
        return toStringHelper.toString();
    }

    /* JADX INFO: renamed from: w */
    public final long m3395w() {
        long j2 = this.f4151u;
        return j2 == -1 ? this.f4150t : j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 1, this.f4149s);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f4150t);
        long jM3395w = m3395w();
        SafeParcelWriter.m3588n(parcel, 3, 8);
        parcel.writeLong(jM3395w);
        SafeParcelWriter.m3588n(parcel, 4, 4);
        parcel.writeInt(this.f4152v ? 1 : 0);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }

    public Feature(String str, long j2) {
        this(str, -1, j2, false);
    }
}
