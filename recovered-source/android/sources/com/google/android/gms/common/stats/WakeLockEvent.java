package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();

    /* JADX INFO: renamed from: A */
    public final String f4621A;

    /* JADX INFO: renamed from: B */
    public final long f4622B;

    /* JADX INFO: renamed from: C */
    public final int f4623C;

    /* JADX INFO: renamed from: D */
    public final String f4624D;

    /* JADX INFO: renamed from: E */
    public final float f4625E;

    /* JADX INFO: renamed from: F */
    public final long f4626F;

    /* JADX INFO: renamed from: G */
    public final boolean f4627G;

    /* JADX INFO: renamed from: s */
    public final int f4628s;

    /* JADX INFO: renamed from: t */
    public final long f4629t;

    /* JADX INFO: renamed from: u */
    public final int f4630u;

    /* JADX INFO: renamed from: v */
    public final String f4631v;

    /* JADX INFO: renamed from: w */
    public final String f4632w;

    /* JADX INFO: renamed from: x */
    public final String f4633x;

    /* JADX INFO: renamed from: y */
    public final int f4634y;

    /* JADX INFO: renamed from: z */
    public final List f4635z;

    public WakeLockEvent(int i2, long j2, int i3, String str, int i4, ArrayList arrayList, String str2, long j3, int i5, String str3, String str4, float f2, long j4, String str5, boolean z) {
        this.f4628s = i2;
        this.f4629t = j2;
        this.f4630u = i3;
        this.f4631v = str;
        this.f4632w = str3;
        this.f4633x = str5;
        this.f4634y = i4;
        this.f4635z = arrayList;
        this.f4621A = str2;
        this.f4622B = j3;
        this.f4623C = i5;
        this.f4624D = str4;
        this.f4625E = f2;
        this.f4626F = j4;
        this.f4627G = z;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* JADX INFO: renamed from: H */
    public final int mo3636H() {
        return this.f4630u;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* JADX INFO: renamed from: J */
    public final String mo3637J() {
        List list = this.f4635z;
        String strJoin = list == null ? "" : TextUtils.join(",", list);
        String str = this.f4631v;
        int length = String.valueOf(str).length();
        int i2 = this.f4634y;
        int length2 = String.valueOf(i2).length() + length + 2;
        int length3 = String.valueOf(strJoin).length();
        int i3 = this.f4623C;
        int length4 = String.valueOf(i3).length() + length2 + 1 + length3 + 1;
        String str2 = this.f4632w;
        if (str2 == null) {
            str2 = "";
        }
        int iM2438e = AbstractC1456a.m2438e(length4 + 1, 1, str2);
        String str3 = this.f4624D;
        if (str3 == null) {
            str3 = "";
        }
        int iM2438e2 = AbstractC1456a.m2438e(iM2438e, 1, str3);
        float f2 = this.f4625E;
        int length5 = String.valueOf(f2).length() + iM2438e2 + 1;
        String str4 = this.f4633x;
        String str5 = str4 != null ? str4 : "";
        int iM2438e3 = AbstractC1456a.m2438e(length5, 1, str5);
        boolean z = this.f4627G;
        StringBuilder sb = new StringBuilder(iM2438e3 + String.valueOf(z).length());
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(strJoin);
        sb.append("\t");
        sb.append(i3);
        AbstractC0271e0.m413u(sb, "\t", str2, "\t", str3);
        sb.append("\t");
        sb.append(f2);
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* JADX INFO: renamed from: w */
    public final long mo3638w() {
        return this.f4629t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4628s);
        SafeParcelWriter.m3588n(parcel, 2, 8);
        parcel.writeLong(this.f4629t);
        SafeParcelWriter.m3583i(parcel, 4, this.f4631v);
        SafeParcelWriter.m3588n(parcel, 5, 4);
        parcel.writeInt(this.f4634y);
        SafeParcelWriter.m3585k(parcel, 6, this.f4635z);
        SafeParcelWriter.m3588n(parcel, 8, 8);
        parcel.writeLong(this.f4622B);
        SafeParcelWriter.m3583i(parcel, 10, this.f4632w);
        SafeParcelWriter.m3588n(parcel, 11, 4);
        parcel.writeInt(this.f4630u);
        SafeParcelWriter.m3583i(parcel, 12, this.f4621A);
        SafeParcelWriter.m3583i(parcel, 13, this.f4624D);
        SafeParcelWriter.m3588n(parcel, 14, 4);
        parcel.writeInt(this.f4623C);
        SafeParcelWriter.m3588n(parcel, 15, 4);
        parcel.writeFloat(this.f4625E);
        SafeParcelWriter.m3588n(parcel, 16, 8);
        parcel.writeLong(this.f4626F);
        SafeParcelWriter.m3583i(parcel, 17, this.f4633x);
        SafeParcelWriter.m3588n(parcel, 18, 4);
        parcel.writeInt(this.f4627G ? 1 : 0);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
