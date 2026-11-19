package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zzbrl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbrl> CREATOR = new zzbrm();

    /* JADX INFO: renamed from: s */
    public final boolean f9293s;

    /* JADX INFO: renamed from: t */
    public final String f9294t;

    /* JADX INFO: renamed from: u */
    public final int f9295u;

    /* JADX INFO: renamed from: v */
    public final byte[] f9296v;

    /* JADX INFO: renamed from: w */
    public final String[] f9297w;

    /* JADX INFO: renamed from: x */
    public final String[] f9298x;

    /* JADX INFO: renamed from: y */
    public final boolean f9299y;

    /* JADX INFO: renamed from: z */
    public final long f9300z;

    public zzbrl(boolean z, String str, int i2, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j2) {
        this.f9293s = z;
        this.f9294t = str;
        this.f9295u = i2;
        this.f9296v = bArr;
        this.f9297w = strArr;
        this.f9298x = strArr2;
        this.f9299y = z2;
        this.f9300z = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f9293s ? 1 : 0);
        SafeParcelWriter.m3583i(parcel, 2, this.f9294t);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f9295u);
        SafeParcelWriter.m3576b(parcel, 4, this.f9296v);
        SafeParcelWriter.m3584j(parcel, 5, this.f9297w);
        SafeParcelWriter.m3584j(parcel, 6, this.f9298x);
        SafeParcelWriter.m3588n(parcel, 7, 4);
        parcel.writeInt(this.f9299y ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 8, 8);
        parcel.writeLong(this.f9300z);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
