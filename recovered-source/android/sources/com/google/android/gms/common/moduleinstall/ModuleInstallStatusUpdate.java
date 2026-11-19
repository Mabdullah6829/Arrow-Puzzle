package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new zad();

    /* JADX INFO: renamed from: s */
    public final int f4560s;

    /* JADX INFO: renamed from: t */
    public final int f4561t;

    /* JADX INFO: renamed from: u */
    public final Long f4562u;

    /* JADX INFO: renamed from: v */
    public final Long f4563v;

    /* JADX INFO: renamed from: w */
    public final int f4564w;

    @Retention(RetentionPolicy.CLASS)
    public @interface InstallState {
    }

    public static class ProgressInfo {
    }

    public ModuleInstallStatusUpdate(int i2, int i3, Long l2, Long l3, int i4) {
        this.f4560s = i2;
        this.f4561t = i3;
        this.f4562u = l2;
        this.f4563v = l3;
        this.f4564w = i4;
        if (l2 != null && l3 != null && l3.longValue() != 0 && l3.longValue() == 0) {
            throw new IllegalArgumentException("Given Long is zero");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4560s);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f4561t);
        SafeParcelWriter.m3581g(parcel, 3, this.f4562u);
        SafeParcelWriter.m3581g(parcel, 4, this.f4563v);
        SafeParcelWriter.m3588n(parcel, 5, 4);
        parcel.writeInt(this.f4564w);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
