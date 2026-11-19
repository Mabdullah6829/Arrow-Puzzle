package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class zzez extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzez> CREATOR = new zzfa();

    /* JADX INFO: renamed from: s */
    public final int f3175s;

    /* JADX INFO: renamed from: t */
    public final int f3176t;

    /* JADX INFO: renamed from: u */
    public final String f3177u;

    public zzez() {
        this(ModuleDescriptor.MODULE_VERSION, 261710000, "25.3.0");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f3175s);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f3176t);
        SafeParcelWriter.m3583i(parcel, 3, this.f3177u);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }

    public zzez(int i2, int i3, String str) {
        this.f3175s = i2;
        this.f3176t = i3;
        this.f3177u = str;
    }
}
