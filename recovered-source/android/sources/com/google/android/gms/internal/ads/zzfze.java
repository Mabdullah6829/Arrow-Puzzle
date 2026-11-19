package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zzfze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfze> CREATOR = new zzfzf();

    /* JADX INFO: renamed from: s */
    public final int f16841s;

    /* JADX INFO: renamed from: t */
    public final byte[] f16842t;

    /* JADX INFO: renamed from: u */
    public final int f16843u;

    public zzfze(byte[] bArr, int i2, int i3) {
        this.f16841s = i2;
        this.f16842t = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f16843u = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f16841s);
        SafeParcelWriter.m3576b(parcel, 2, this.f16842t);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f16843u);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }

    public zzfze() {
        this(null, 1, 1);
    }
}
