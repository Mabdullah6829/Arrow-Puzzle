package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new zzo();

    /* JADX INFO: renamed from: A */
    public final String f3206A;

    /* JADX INFO: renamed from: B */
    public final zzft f3207B;

    /* JADX INFO: renamed from: C */
    public final Location f3208C;

    /* JADX INFO: renamed from: D */
    public final String f3209D;

    /* JADX INFO: renamed from: E */
    public final Bundle f3210E;

    /* JADX INFO: renamed from: F */
    public final Bundle f3211F;

    /* JADX INFO: renamed from: G */
    public final List f3212G;

    /* JADX INFO: renamed from: H */
    public final String f3213H;

    /* JADX INFO: renamed from: I */
    public final String f3214I;

    /* JADX INFO: renamed from: J */
    public final boolean f3215J;

    /* JADX INFO: renamed from: K */
    public final zzc f3216K;

    /* JADX INFO: renamed from: L */
    public final int f3217L;

    /* JADX INFO: renamed from: M */
    public final String f3218M;

    /* JADX INFO: renamed from: N */
    public final List f3219N;

    /* JADX INFO: renamed from: O */
    public final int f3220O;

    /* JADX INFO: renamed from: P */
    public final String f3221P;

    /* JADX INFO: renamed from: Q */
    public final int f3222Q;

    /* JADX INFO: renamed from: R */
    public final long f3223R;

    /* JADX INFO: renamed from: S */
    public final long f3224S;

    /* JADX INFO: renamed from: T */
    public final int f3225T;

    /* JADX INFO: renamed from: U */
    public final Bundle f3226U = new Bundle();

    /* JADX INFO: renamed from: s */
    public final int f3227s;

    /* JADX INFO: renamed from: t */
    public final long f3228t;

    /* JADX INFO: renamed from: u */
    public final Bundle f3229u;

    /* JADX INFO: renamed from: v */
    public final int f3230v;

    /* JADX INFO: renamed from: w */
    public final List f3231w;

    /* JADX INFO: renamed from: x */
    public final boolean f3232x;

    /* JADX INFO: renamed from: y */
    public final int f3233y;

    /* JADX INFO: renamed from: z */
    public final boolean f3234z;

    public zzm(int i2, long j2, Bundle bundle, int i3, List list, boolean z, int i4, boolean z2, String str, zzft zzftVar, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z3, zzc zzcVar, int i5, String str5, List list3, int i6, String str6, int i7, long j3, long j4, int i8) {
        this.f3227s = i2;
        this.f3228t = j2;
        this.f3229u = bundle == null ? new Bundle() : bundle;
        this.f3230v = i3;
        this.f3231w = list;
        this.f3232x = z;
        this.f3233y = i4;
        this.f3234z = z2;
        this.f3206A = str;
        this.f3207B = zzftVar;
        this.f3208C = location;
        this.f3209D = str2;
        this.f3210E = bundle2 == null ? new Bundle() : bundle2;
        this.f3211F = bundle3;
        this.f3212G = list2;
        this.f3213H = str3;
        this.f3214I = str4;
        this.f3215J = z3;
        this.f3216K = zzcVar;
        this.f3217L = i5;
        this.f3218M = str5;
        this.f3219N = list3 == null ? new ArrayList() : list3;
        this.f3220O = i6;
        this.f3221P = str6;
        this.f3222Q = i7;
        this.f3223R = j3;
        this.f3224S = j4;
        this.f3225T = i8;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m2976H() {
        Bundle bundle = this.f3229u;
        return bundle.getBoolean("is_sdk_preload", false) || bundle.getBoolean("zenith_v2", false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzm) {
            return m2977w((zzm) obj) && this.f3223R == ((zzm) obj).f3223R;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3227s), Long.valueOf(this.f3228t), this.f3229u, Integer.valueOf(this.f3230v), this.f3231w, Boolean.valueOf(this.f3232x), Integer.valueOf(this.f3233y), Boolean.valueOf(this.f3234z), this.f3206A, this.f3207B, this.f3208C, this.f3209D, this.f3210E, this.f3211F, this.f3212G, this.f3213H, this.f3214I, Boolean.valueOf(this.f3215J), Integer.valueOf(this.f3217L), this.f3218M, this.f3219N, Integer.valueOf(this.f3220O), this.f3221P, Integer.valueOf(this.f3222Q), Long.valueOf(this.f3223R), Long.valueOf(this.f3224S), Integer.valueOf(this.f3225T)});
    }

    /* JADX INFO: renamed from: w */
    public final boolean m2977w(zzm zzmVar) {
        return zzmVar != null && this.f3227s == zzmVar.f3227s && this.f3228t == zzmVar.f3228t && com.google.android.gms.ads.internal.util.client.zzp.m3078a(this.f3229u, zzmVar.f3229u) && this.f3230v == zzmVar.f3230v && Objects.m3535a(this.f3231w, zzmVar.f3231w) && this.f3232x == zzmVar.f3232x && this.f3233y == zzmVar.f3233y && this.f3234z == zzmVar.f3234z && Objects.m3535a(this.f3206A, zzmVar.f3206A) && Objects.m3535a(this.f3207B, zzmVar.f3207B) && Objects.m3535a(this.f3208C, zzmVar.f3208C) && Objects.m3535a(this.f3209D, zzmVar.f3209D) && com.google.android.gms.ads.internal.util.client.zzp.m3078a(this.f3210E, zzmVar.f3210E) && com.google.android.gms.ads.internal.util.client.zzp.m3078a(this.f3211F, zzmVar.f3211F) && Objects.m3535a(this.f3212G, zzmVar.f3212G) && Objects.m3535a(this.f3213H, zzmVar.f3213H) && Objects.m3535a(this.f3214I, zzmVar.f3214I) && this.f3215J == zzmVar.f3215J && this.f3217L == zzmVar.f3217L && Objects.m3535a(this.f3218M, zzmVar.f3218M) && Objects.m3535a(this.f3219N, zzmVar.f3219N) && this.f3220O == zzmVar.f3220O && Objects.m3535a(this.f3221P, zzmVar.f3221P) && this.f3222Q == zzmVar.f3222Q && this.f3225T == zzmVar.f3225T;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f3227s);
        SafeParcelWriter.m3588n(parcel, 2, 8);
        parcel.writeLong(this.f3228t);
        SafeParcelWriter.m3575a(3, this.f3229u, parcel);
        SafeParcelWriter.m3588n(parcel, 4, 4);
        parcel.writeInt(this.f3230v);
        SafeParcelWriter.m3585k(parcel, 5, this.f3231w);
        SafeParcelWriter.m3588n(parcel, 6, 4);
        parcel.writeInt(this.f3232x ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 7, 4);
        parcel.writeInt(this.f3233y);
        SafeParcelWriter.m3588n(parcel, 8, 4);
        parcel.writeInt(this.f3234z ? 1 : 0);
        SafeParcelWriter.m3583i(parcel, 9, this.f3206A);
        SafeParcelWriter.m3582h(parcel, 10, this.f3207B, i2);
        SafeParcelWriter.m3582h(parcel, 11, this.f3208C, i2);
        SafeParcelWriter.m3583i(parcel, 12, this.f3209D);
        SafeParcelWriter.m3575a(13, this.f3210E, parcel);
        SafeParcelWriter.m3575a(14, this.f3211F, parcel);
        SafeParcelWriter.m3585k(parcel, 15, this.f3212G);
        SafeParcelWriter.m3583i(parcel, 16, this.f3213H);
        SafeParcelWriter.m3583i(parcel, 17, this.f3214I);
        SafeParcelWriter.m3588n(parcel, 18, 4);
        parcel.writeInt(this.f3215J ? 1 : 0);
        SafeParcelWriter.m3582h(parcel, 19, this.f3216K, i2);
        SafeParcelWriter.m3588n(parcel, 20, 4);
        parcel.writeInt(this.f3217L);
        SafeParcelWriter.m3583i(parcel, 21, this.f3218M);
        SafeParcelWriter.m3585k(parcel, 22, this.f3219N);
        SafeParcelWriter.m3588n(parcel, 23, 4);
        parcel.writeInt(this.f3220O);
        SafeParcelWriter.m3583i(parcel, 24, this.f3221P);
        SafeParcelWriter.m3588n(parcel, 25, 4);
        parcel.writeInt(this.f3222Q);
        SafeParcelWriter.m3588n(parcel, 26, 8);
        parcel.writeLong(this.f3223R);
        SafeParcelWriter.m3588n(parcel, 27, 8);
        parcel.writeLong(this.f3224S);
        SafeParcelWriter.m3588n(parcel, 28, 4);
        parcel.writeInt(this.f3225T);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
