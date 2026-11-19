package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zzbma extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbma> CREATOR = new zzbmb();

    /* JADX INFO: renamed from: A */
    public final int f9163A;

    /* JADX INFO: renamed from: B */
    public final boolean f9164B;

    /* JADX INFO: renamed from: C */
    public final int f9165C;

    /* JADX INFO: renamed from: s */
    public final int f9166s;

    /* JADX INFO: renamed from: t */
    public final boolean f9167t;

    /* JADX INFO: renamed from: u */
    public final int f9168u;

    /* JADX INFO: renamed from: v */
    public final boolean f9169v;

    /* JADX INFO: renamed from: w */
    public final int f9170w;

    /* JADX INFO: renamed from: x */
    public final com.google.android.gms.ads.internal.client.zzfw f9171x;

    /* JADX INFO: renamed from: y */
    public final boolean f9172y;

    /* JADX INFO: renamed from: z */
    public final int f9173z;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzbma(NativeAdOptions nativeAdOptions) {
        boolean z = nativeAdOptions.f2996a;
        int i2 = nativeAdOptions.f2997b;
        boolean z2 = nativeAdOptions.f2999d;
        int i3 = nativeAdOptions.f3000e;
        VideoOptions videoOptions = nativeAdOptions.f3001f;
        this(4, z, i2, z2, i3, videoOptions != null ? new com.google.android.gms.ads.internal.client.zzfw(videoOptions) : null, nativeAdOptions.f3002g, nativeAdOptions.f2998c, 0, false, 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f9166s);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f9167t ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f9168u);
        SafeParcelWriter.m3588n(parcel, 4, 4);
        parcel.writeInt(this.f9169v ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 5, 4);
        parcel.writeInt(this.f9170w);
        SafeParcelWriter.m3582h(parcel, 6, this.f9171x, i2);
        SafeParcelWriter.m3588n(parcel, 7, 4);
        parcel.writeInt(this.f9172y ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 8, 4);
        parcel.writeInt(this.f9173z);
        SafeParcelWriter.m3588n(parcel, 9, 4);
        parcel.writeInt(this.f9163A);
        SafeParcelWriter.m3588n(parcel, 10, 4);
        parcel.writeInt(this.f9164B ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 11, 4);
        parcel.writeInt(this.f9165C);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }

    public zzbma(int i2, boolean z, int i3, boolean z2, int i4, com.google.android.gms.ads.internal.client.zzfw zzfwVar, boolean z3, int i5, int i6, boolean z4, int i7) {
        this.f9166s = i2;
        this.f9167t = z;
        this.f9168u = i3;
        this.f9169v = z2;
        this.f9170w = i4;
        this.f9171x = zzfwVar;
        this.f9172y = z3;
        this.f9173z = i5;
        this.f9164B = z4;
        this.f9163A = i6;
        this.f9165C = i7;
    }
}
