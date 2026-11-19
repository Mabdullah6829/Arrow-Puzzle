package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zag extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zag> CREATOR = new zah();

    /* JADX INFO: renamed from: s */
    public final List f23187s;

    /* JADX INFO: renamed from: t */
    public final String f23188t;

    public zag(String str, ArrayList arrayList) {
        this.f23187s = arrayList;
        this.f23188t = str;
    }

    @Override // com.google.android.gms.common.api.Result
    /* JADX INFO: renamed from: n */
    public final Status mo3424n() {
        return this.f23188t != null ? Status.f4207w : Status.f4209y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3585k(parcel, 1, this.f23187s);
        SafeParcelWriter.m3583i(parcel, 2, this.f23188t);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
