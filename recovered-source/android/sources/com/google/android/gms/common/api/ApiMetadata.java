package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ApiMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiMetadata> CREATOR = zza.f4380a;

    /* JADX INFO: renamed from: v */
    public static final ApiMetadata f4178v;

    /* JADX INFO: renamed from: s */
    public final ComplianceOptions f4179s;

    /* JADX INFO: renamed from: t */
    public final boolean f4180t;

    /* JADX INFO: renamed from: u */
    public boolean f4181u;

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public boolean f4182a;
    }

    static {
        Builder builder = new Builder();
        ApiMetadata apiMetadata = new ApiMetadata(null, false);
        apiMetadata.f4181u = builder.f4182a;
        f4178v = apiMetadata;
        Builder builder2 = new Builder();
        builder2.f4182a = true;
        new ApiMetadata(null, false).f4181u = builder2.f4182a;
    }

    public ApiMetadata(ComplianceOptions complianceOptions, boolean z) {
        this.f4179s = complianceOptions;
        this.f4180t = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ApiMetadata)) {
            return false;
        }
        ApiMetadata apiMetadata = (ApiMetadata) obj;
        return Objects.m3535a(this.f4179s, apiMetadata.f4179s) && this.f4181u == apiMetadata.f4181u && this.f4180t == apiMetadata.f4180t;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4179s, Boolean.valueOf(this.f4181u), Boolean.valueOf(this.f4180t)});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f4179s);
        return AbstractC1456a.m2450q(new StringBuilder(strValueOf.length() + 31), "ApiMetadata(complianceOptions=", strValueOf, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        if (this.f4181u) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3582h(parcel, 1, this.f4179s, i2);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f4180t ? 1 : 0);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
