package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new zaa();

    /* JADX INFO: renamed from: s */
    public final int f4068s;

    /* JADX INFO: renamed from: t */
    public final int f4069t;

    /* JADX INFO: renamed from: u */
    public final Bundle f4070u;

    public GoogleSignInOptionsExtensionParcelable(int i2, int i3, Bundle bundle) {
        this.f4068s = i2;
        this.f4069t = i3;
        this.f4070u = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4068s);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f4069t);
        SafeParcelWriter.m3575a(3, this.f4070u, parcel);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
