package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ApiFeatureRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new zac();

    /* JADX INFO: renamed from: s */
    public final List f4565s;

    /* JADX INFO: renamed from: t */
    public final boolean f4566t;

    /* JADX INFO: renamed from: u */
    public final String f4567u;

    /* JADX INFO: renamed from: v */
    public final String f4568v;

    static {
        int i2 = zab.f4569s;
    }

    public ApiFeatureRequest(ArrayList arrayList, boolean z, String str, String str2) {
        Preconditions.m3544h(arrayList);
        this.f4565s = arrayList;
        this.f4566t = z;
        this.f4567u = str;
        this.f4568v = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        return this.f4566t == apiFeatureRequest.f4566t && Objects.m3535a(this.f4565s, apiFeatureRequest.f4565s) && Objects.m3535a(this.f4567u, apiFeatureRequest.f4567u) && Objects.m3535a(this.f4568v, apiFeatureRequest.f4568v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4566t), this.f4565s, this.f4567u, this.f4568v});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3587m(parcel, 1, this.f4565s);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f4566t ? 1 : 0);
        SafeParcelWriter.m3583i(parcel, 3, this.f4567u);
        SafeParcelWriter.m3583i(parcel, 4, this.f4568v);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
