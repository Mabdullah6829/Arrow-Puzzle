package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR;

    /* JADX INFO: renamed from: w */
    public static final Status f4207w;

    /* JADX INFO: renamed from: x */
    public static final Status f4208x;

    /* JADX INFO: renamed from: y */
    public static final Status f4209y;

    /* JADX INFO: renamed from: s */
    public final int f4210s;

    /* JADX INFO: renamed from: t */
    public final String f4211t;

    /* JADX INFO: renamed from: u */
    public final PendingIntent f4212u;

    /* JADX INFO: renamed from: v */
    public final ConnectionResult f4213v;

    static {
        new Status(-1, null, null, null);
        f4207w = new Status(0, null, null, null);
        new Status(14, null, null, null);
        new Status(8, null, null, null);
        f4208x = new Status(15, null, null, null);
        f4209y = new Status(16, null, null, null);
        new Status(17, null, null, null);
        new Status(18, null, null, null);
        CREATOR = new zze();
    }

    public Status(int i2, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f4210s = i2;
        this.f4211t = str;
        this.f4212u = pendingIntent;
        this.f4213v = connectionResult;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f4210s == status.f4210s && Objects.m3535a(this.f4211t, status.f4211t) && Objects.m3535a(this.f4212u, status.f4212u) && Objects.m3535a(this.f4213v, status.f4213v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4210s), this.f4211t, this.f4212u, this.f4213v});
    }

    @Override // com.google.android.gms.common.api.Result
    /* JADX INFO: renamed from: n */
    public final Status mo3424n() {
        return this;
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        String strM3425a = this.f4211t;
        if (strM3425a == null) {
            strM3425a = CommonStatusCodes.m3425a(this.f4210s);
        }
        toStringHelper.m3536a(strM3425a, "statusCode");
        toStringHelper.m3536a(this.f4212u, "resolution");
        return toStringHelper.toString();
    }

    /* JADX INFO: renamed from: w */
    public final boolean m3433w() {
        return this.f4210s <= 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4210s);
        SafeParcelWriter.m3583i(parcel, 2, this.f4211t);
        SafeParcelWriter.m3582h(parcel, 3, this.f4212u, i2);
        SafeParcelWriter.m3582h(parcel, 4, this.f4213v, i2);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
