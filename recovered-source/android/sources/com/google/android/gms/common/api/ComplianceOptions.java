package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ComplianceOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ComplianceOptions> CREATOR;

    /* JADX INFO: renamed from: s */
    public final int f4184s;

    /* JADX INFO: renamed from: t */
    public final int f4185t;

    /* JADX INFO: renamed from: u */
    public final int f4186u;

    /* JADX INFO: renamed from: v */
    public final boolean f4187v;

    public static final class Builder {
    }

    static {
        new Builder();
        new ComplianceOptions(-1, -1, 0, true);
        CREATOR = new zzc();
    }

    public ComplianceOptions(int i2, int i3, int i4, boolean z) {
        this.f4184s = i2;
        this.f4185t = i3;
        this.f4186u = i4;
        this.f4187v = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ComplianceOptions)) {
            return false;
        }
        ComplianceOptions complianceOptions = (ComplianceOptions) obj;
        return this.f4184s == complianceOptions.f4184s && this.f4185t == complianceOptions.f4185t && this.f4186u == complianceOptions.f4186u && this.f4187v == complianceOptions.f4187v;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4184s), Integer.valueOf(this.f4185t), Integer.valueOf(this.f4186u), Boolean.valueOf(this.f4187v)});
    }

    public final String toString() {
        int i2 = this.f4184s;
        int length = String.valueOf(i2).length();
        int i3 = this.f4185t;
        int length2 = String.valueOf(i3).length();
        int i4 = this.f4186u;
        int length3 = String.valueOf(i4).length();
        boolean z = this.f4187v;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z).length() + 1);
        AbstractC1456a.m2455v(sb, "ComplianceOptions{callerProductId=", i2, ", dataOwnerProductId=", i3);
        sb.append(", processingReason=");
        sb.append(i4);
        sb.append(", isUserData=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4184s);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f4185t);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f4186u);
        SafeParcelWriter.m3588n(parcel, 4, 4);
        parcel.writeInt(this.f4187v ? 1 : 0);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
