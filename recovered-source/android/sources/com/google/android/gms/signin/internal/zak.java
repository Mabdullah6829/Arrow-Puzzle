package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zay;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new zal();

    /* JADX INFO: renamed from: s */
    public final int f23191s;

    /* JADX INFO: renamed from: t */
    public final ConnectionResult f23192t;

    /* JADX INFO: renamed from: u */
    public final zay f23193u;

    public zak(int i2, ConnectionResult connectionResult, zay zayVar) {
        this.f23191s = i2;
        this.f23192t = connectionResult;
        this.f23193u = zayVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f23191s);
        SafeParcelWriter.m3582h(parcel, 2, this.f23192t, i2);
        SafeParcelWriter.m3582h(parcel, 3, this.f23193u, i2);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
