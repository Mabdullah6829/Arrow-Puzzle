package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zaa extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();

    /* JADX INFO: renamed from: s */
    public final int f23184s;

    /* JADX INFO: renamed from: t */
    public final int f23185t;

    /* JADX INFO: renamed from: u */
    public final Intent f23186u;

    public zaa() {
        this(2, 0, null);
    }

    @Override // com.google.android.gms.common.api.Result
    /* JADX INFO: renamed from: n */
    public final Status mo3424n() {
        return this.f23185t == 0 ? Status.f4207w : Status.f4209y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f23184s);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f23185t);
        SafeParcelWriter.m3582h(parcel, 3, this.f23186u, i2);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }

    public zaa(int i2, int i3, Intent intent) {
        this.f23184s = i2;
        this.f23185t = i3;
        this.f23186u = intent;
    }
}
