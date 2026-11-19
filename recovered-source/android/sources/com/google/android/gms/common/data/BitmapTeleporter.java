package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new zaa();

    /* JADX INFO: renamed from: s */
    public final int f4381s;

    /* JADX INFO: renamed from: t */
    public ParcelFileDescriptor f4382t;

    /* JADX INFO: renamed from: u */
    public final int f4383u;

    public BitmapTeleporter(int i2, ParcelFileDescriptor parcelFileDescriptor, int i3) {
        this.f4381s = i2;
        this.f4382t = parcelFileDescriptor;
        this.f4383u = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        if (this.f4382t == null) {
            Preconditions.m3544h(null);
            throw null;
        }
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4381s);
        SafeParcelWriter.m3582h(parcel, 2, this.f4382t, i2 | 1);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f4383u);
        SafeParcelWriter.m3590p(iM3589o, parcel);
        this.f4382t = null;
    }
}
