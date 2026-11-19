package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new zaa();

    /* JADX INFO: renamed from: s */
    public final int f4578s;

    /* JADX INFO: renamed from: t */
    public final String f4579t;

    /* JADX INFO: renamed from: u */
    public final int f4580u;

    public FavaDiagnosticsEntity(int i2, String str, int i3) {
        this.f4578s = i2;
        this.f4579t = str;
        this.f4580u = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4578s);
        SafeParcelWriter.m3583i(parcel, 2, this.f4579t);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f4580u);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
