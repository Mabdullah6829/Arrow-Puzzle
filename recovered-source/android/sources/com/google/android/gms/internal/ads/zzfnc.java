package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zzfnc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfnc> CREATOR = new zzfnd();

    /* JADX INFO: renamed from: A */
    public final int f16145A;

    /* JADX INFO: renamed from: B */
    public final int f16146B;

    /* JADX INFO: renamed from: s */
    public final Context f16147s;

    /* JADX INFO: renamed from: t */
    public final int f16148t;

    /* JADX INFO: renamed from: u */
    public final zzfmz f16149u;

    /* JADX INFO: renamed from: v */
    public final int f16150v;

    /* JADX INFO: renamed from: w */
    public final int f16151w;

    /* JADX INFO: renamed from: x */
    public final int f16152x;

    /* JADX INFO: renamed from: y */
    public final String f16153y;

    /* JADX INFO: renamed from: z */
    public final int f16154z;

    public zzfnc(int i2, int i3, int i4, int i5, String str, int i6, int i7) {
        zzfmz[] zzfmzVarArrValues = zzfmz.values();
        this.f16147s = null;
        this.f16148t = i2;
        this.f16149u = zzfmzVarArrValues[i2];
        this.f16150v = i3;
        this.f16151w = i4;
        this.f16152x = i5;
        this.f16153y = str;
        this.f16154z = i6;
        this.f16146B = new int[]{1, 2, 3}[i6];
        this.f16145A = i7;
        int i8 = new int[]{1}[i7];
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f16148t);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f16150v);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f16151w);
        SafeParcelWriter.m3588n(parcel, 4, 4);
        parcel.writeInt(this.f16152x);
        SafeParcelWriter.m3583i(parcel, 5, this.f16153y);
        SafeParcelWriter.m3588n(parcel, 6, 4);
        parcel.writeInt(this.f16154z);
        SafeParcelWriter.m3588n(parcel, 7, 4);
        parcel.writeInt(this.f16145A);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }

    public zzfnc(Context context, zzfmz zzfmzVar, int i2, int i3, int i4, String str, String str2) {
        zzfmz.values();
        this.f16147s = context;
        this.f16148t = zzfmzVar.ordinal();
        this.f16149u = zzfmzVar;
        this.f16150v = i2;
        this.f16151w = i3;
        this.f16152x = i4;
        this.f16153y = str;
        int i5 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.f16146B = i5;
        this.f16154z = i5 - 1;
        this.f16145A = 0;
    }
}
