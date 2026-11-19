package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = new zaa();

    /* JADX INFO: renamed from: s */
    public final boolean f4555s;

    /* JADX INFO: renamed from: t */
    public final int f4556t;

    @Retention(RetentionPolicy.CLASS)
    public @interface AvailabilityStatus {
    }

    public ModuleAvailabilityResponse(boolean z, int i2) {
        this.f4555s = z;
        this.f4556t = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4555s ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f4556t);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
