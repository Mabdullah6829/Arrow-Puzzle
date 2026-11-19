package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zzfyq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfyq> CREATOR = new zzfyr();

    /* JADX INFO: renamed from: s */
    public final int f16810s;

    /* JADX INFO: renamed from: t */
    public final byte[] f16811t;

    public zzfyq(int i2, byte[] bArr) {
        this.f16810s = i2;
        this.f16811t = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f16810s);
        SafeParcelWriter.m3576b(parcel, 2, this.f16811t);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
