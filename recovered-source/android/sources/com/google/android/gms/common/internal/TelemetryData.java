package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new zaae();

    /* JADX INFO: renamed from: s */
    public final int f4467s;

    /* JADX INFO: renamed from: t */
    public List f4468t;

    public TelemetryData(int i2, List list) {
        this.f4467s = i2;
        this.f4468t = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4467s);
        SafeParcelWriter.m3587m(parcel, 2, this.f4468t);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
