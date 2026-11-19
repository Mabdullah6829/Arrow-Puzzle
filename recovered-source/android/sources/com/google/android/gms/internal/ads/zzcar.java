package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzcar extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcar> CREATOR = new zzcas();

    /* JADX INFO: renamed from: s */
    public final boolean f9659s;

    /* JADX INFO: renamed from: t */
    public final List f9660t;

    public zzcar() {
        this(Collections.EMPTY_LIST, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f9659s ? 1 : 0);
        SafeParcelWriter.m3585k(parcel, 3, this.f9660t);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }

    public zzcar(List list, boolean z) {
        this.f9659s = z;
        this.f9660t = list;
    }
}
