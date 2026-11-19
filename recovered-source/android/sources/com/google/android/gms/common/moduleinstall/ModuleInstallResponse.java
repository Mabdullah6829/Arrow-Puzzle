package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public class ModuleInstallResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new zac();

    /* JADX INFO: renamed from: s */
    public final int f4558s;

    /* JADX INFO: renamed from: t */
    public final boolean f4559t;

    public ModuleInstallResponse(int i2, boolean z) {
        this.f4558s = i2;
        this.f4559t = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4558s);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f4559t ? 1 : 0);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
