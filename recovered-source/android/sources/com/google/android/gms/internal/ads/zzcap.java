package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zzcap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcap> CREATOR = new zzcaq();

    /* JADX INFO: renamed from: A */
    public final String f9601A;

    /* JADX INFO: renamed from: B */
    public final String f9602B;

    /* JADX INFO: renamed from: C */
    public final VersionInfoParcel f9603C;

    /* JADX INFO: renamed from: D */
    public final Bundle f9604D;

    /* JADX INFO: renamed from: E */
    public final int f9605E;

    /* JADX INFO: renamed from: F */
    public final List f9606F;

    /* JADX INFO: renamed from: G */
    public final Bundle f9607G;

    /* JADX INFO: renamed from: H */
    public final boolean f9608H;

    /* JADX INFO: renamed from: I */
    public final int f9609I;

    /* JADX INFO: renamed from: J */
    public final int f9610J;

    /* JADX INFO: renamed from: K */
    public final float f9611K;

    /* JADX INFO: renamed from: L */
    public final String f9612L;

    /* JADX INFO: renamed from: M */
    public final long f9613M;

    /* JADX INFO: renamed from: N */
    public final String f9614N;

    /* JADX INFO: renamed from: O */
    public final List f9615O;

    /* JADX INFO: renamed from: P */
    public final String f9616P;

    /* JADX INFO: renamed from: Q */
    public final zzbma f9617Q;

    /* JADX INFO: renamed from: R */
    public final List f9618R;

    /* JADX INFO: renamed from: S */
    public final long f9619S;

    /* JADX INFO: renamed from: T */
    public final String f9620T;

    /* JADX INFO: renamed from: U */
    public final float f9621U;

    /* JADX INFO: renamed from: V */
    public final int f9622V;

    /* JADX INFO: renamed from: W */
    public final int f9623W;

    /* JADX INFO: renamed from: X */
    public final boolean f9624X;

    /* JADX INFO: renamed from: Y */
    public final String f9625Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f9626Z;

    /* JADX INFO: renamed from: a0 */
    public final String f9627a0;

    /* JADX INFO: renamed from: b0 */
    public final boolean f9628b0;

    /* JADX INFO: renamed from: c0 */
    public final int f9629c0;

    /* JADX INFO: renamed from: d0 */
    public final Bundle f9630d0;

    /* JADX INFO: renamed from: e0 */
    public final String f9631e0;

    /* JADX INFO: renamed from: f0 */
    public final com.google.android.gms.ads.internal.client.zzee f9632f0;

    /* JADX INFO: renamed from: g0 */
    public final boolean f9633g0;

    /* JADX INFO: renamed from: h0 */
    public final Bundle f9634h0;

    /* JADX INFO: renamed from: i0 */
    public final String f9635i0;

    /* JADX INFO: renamed from: j0 */
    public final String f9636j0;

    /* JADX INFO: renamed from: k0 */
    public final String f9637k0;

    /* JADX INFO: renamed from: l0 */
    public final boolean f9638l0;

    /* JADX INFO: renamed from: m0 */
    public final List f9639m0;

    /* JADX INFO: renamed from: n0 */
    public final String f9640n0;

    /* JADX INFO: renamed from: o0 */
    public final List f9641o0;

    /* JADX INFO: renamed from: p0 */
    public final int f9642p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f9643q0;

    /* JADX INFO: renamed from: r0 */
    public final boolean f9644r0;

    /* JADX INFO: renamed from: s */
    public final int f9645s;

    /* JADX INFO: renamed from: s0 */
    public final boolean f9646s0;

    /* JADX INFO: renamed from: t */
    public final Bundle f9647t;

    /* JADX INFO: renamed from: t0 */
    public final ArrayList f9648t0;

    /* JADX INFO: renamed from: u */
    public final com.google.android.gms.ads.internal.client.zzm f9649u;

    /* JADX INFO: renamed from: u0 */
    public final String f9650u0;

    /* JADX INFO: renamed from: v */
    public final com.google.android.gms.ads.internal.client.zzr f9651v;

    /* JADX INFO: renamed from: v0 */
    public final zzbsi f9652v0;

    /* JADX INFO: renamed from: w */
    public final String f9653w;

    /* JADX INFO: renamed from: w0 */
    public final String f9654w0;

    /* JADX INFO: renamed from: x */
    public final ApplicationInfo f9655x;

    /* JADX INFO: renamed from: x0 */
    public final Bundle f9656x0;

    /* JADX INFO: renamed from: y */
    public final PackageInfo f9657y;

    /* JADX INFO: renamed from: z */
    public final String f9658z;

    public zzcap(int i2, Bundle bundle, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, VersionInfoParcel versionInfoParcel, Bundle bundle2, int i3, ArrayList arrayList, Bundle bundle3, boolean z, int i4, int i5, float f2, String str5, long j2, String str6, ArrayList arrayList2, String str7, zzbma zzbmaVar, ArrayList arrayList3, long j3, String str8, float f3, boolean z2, int i6, int i7, boolean z3, String str9, String str10, boolean z4, int i8, Bundle bundle4, String str11, com.google.android.gms.ads.internal.client.zzee zzeeVar, boolean z5, Bundle bundle5, String str12, String str13, String str14, boolean z6, ArrayList arrayList4, String str15, ArrayList arrayList5, int i9, boolean z7, boolean z8, boolean z9, ArrayList arrayList6, String str16, zzbsi zzbsiVar, String str17, Bundle bundle6) {
        this.f9645s = i2;
        this.f9647t = bundle;
        this.f9649u = zzmVar;
        this.f9651v = zzrVar;
        this.f9653w = str;
        this.f9655x = applicationInfo;
        this.f9657y = packageInfo;
        this.f9658z = str2;
        this.f9601A = str3;
        this.f9602B = str4;
        this.f9603C = versionInfoParcel;
        this.f9604D = bundle2;
        this.f9605E = i3;
        this.f9606F = arrayList;
        this.f9618R = arrayList3 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList3);
        this.f9607G = bundle3;
        this.f9608H = z;
        this.f9609I = i4;
        this.f9610J = i5;
        this.f9611K = f2;
        this.f9612L = str5;
        this.f9613M = j2;
        this.f9614N = str6;
        this.f9615O = arrayList2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList2);
        this.f9616P = str7;
        this.f9617Q = zzbmaVar;
        this.f9619S = j3;
        this.f9620T = str8;
        this.f9621U = f3;
        this.f9626Z = z2;
        this.f9622V = i6;
        this.f9623W = i7;
        this.f9624X = z3;
        this.f9625Y = str9;
        this.f9627a0 = str10;
        this.f9628b0 = z4;
        this.f9629c0 = i8;
        this.f9630d0 = bundle4;
        this.f9631e0 = str11;
        this.f9632f0 = zzeeVar;
        this.f9633g0 = z5;
        this.f9634h0 = bundle5;
        this.f9635i0 = str12;
        this.f9636j0 = str13;
        this.f9637k0 = str14;
        this.f9638l0 = z6;
        this.f9639m0 = arrayList4;
        this.f9640n0 = str15;
        this.f9641o0 = arrayList5;
        this.f9642p0 = i9;
        this.f9643q0 = z7;
        this.f9644r0 = z8;
        this.f9646s0 = z9;
        this.f9648t0 = arrayList6;
        this.f9650u0 = str16;
        this.f9652v0 = zzbsiVar;
        this.f9654w0 = str17;
        this.f9656x0 = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f9645s);
        SafeParcelWriter.m3575a(2, this.f9647t, parcel);
        SafeParcelWriter.m3582h(parcel, 3, this.f9649u, i2);
        SafeParcelWriter.m3582h(parcel, 4, this.f9651v, i2);
        SafeParcelWriter.m3583i(parcel, 5, this.f9653w);
        SafeParcelWriter.m3582h(parcel, 6, this.f9655x, i2);
        SafeParcelWriter.m3582h(parcel, 7, this.f9657y, i2);
        SafeParcelWriter.m3583i(parcel, 8, this.f9658z);
        SafeParcelWriter.m3583i(parcel, 9, this.f9601A);
        SafeParcelWriter.m3583i(parcel, 10, this.f9602B);
        SafeParcelWriter.m3582h(parcel, 11, this.f9603C, i2);
        SafeParcelWriter.m3575a(12, this.f9604D, parcel);
        SafeParcelWriter.m3588n(parcel, 13, 4);
        parcel.writeInt(this.f9605E);
        SafeParcelWriter.m3585k(parcel, 14, this.f9606F);
        SafeParcelWriter.m3575a(15, this.f9607G, parcel);
        SafeParcelWriter.m3588n(parcel, 16, 4);
        parcel.writeInt(this.f9608H ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 18, 4);
        parcel.writeInt(this.f9609I);
        SafeParcelWriter.m3588n(parcel, 19, 4);
        parcel.writeInt(this.f9610J);
        SafeParcelWriter.m3588n(parcel, 20, 4);
        parcel.writeFloat(this.f9611K);
        SafeParcelWriter.m3583i(parcel, 21, this.f9612L);
        SafeParcelWriter.m3588n(parcel, 25, 8);
        parcel.writeLong(this.f9613M);
        SafeParcelWriter.m3583i(parcel, 26, this.f9614N);
        SafeParcelWriter.m3585k(parcel, 27, this.f9615O);
        SafeParcelWriter.m3583i(parcel, 28, this.f9616P);
        SafeParcelWriter.m3582h(parcel, 29, this.f9617Q, i2);
        SafeParcelWriter.m3585k(parcel, 30, this.f9618R);
        SafeParcelWriter.m3588n(parcel, 31, 8);
        parcel.writeLong(this.f9619S);
        SafeParcelWriter.m3583i(parcel, 33, this.f9620T);
        SafeParcelWriter.m3588n(parcel, 34, 4);
        parcel.writeFloat(this.f9621U);
        SafeParcelWriter.m3588n(parcel, 35, 4);
        parcel.writeInt(this.f9622V);
        SafeParcelWriter.m3588n(parcel, 36, 4);
        parcel.writeInt(this.f9623W);
        SafeParcelWriter.m3588n(parcel, 37, 4);
        parcel.writeInt(this.f9624X ? 1 : 0);
        SafeParcelWriter.m3583i(parcel, 39, this.f9625Y);
        SafeParcelWriter.m3588n(parcel, 40, 4);
        parcel.writeInt(this.f9626Z ? 1 : 0);
        SafeParcelWriter.m3583i(parcel, 41, this.f9627a0);
        SafeParcelWriter.m3588n(parcel, 42, 4);
        parcel.writeInt(this.f9628b0 ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 43, 4);
        parcel.writeInt(this.f9629c0);
        SafeParcelWriter.m3575a(44, this.f9630d0, parcel);
        SafeParcelWriter.m3583i(parcel, 45, this.f9631e0);
        SafeParcelWriter.m3582h(parcel, 46, this.f9632f0, i2);
        SafeParcelWriter.m3588n(parcel, 47, 4);
        parcel.writeInt(this.f9633g0 ? 1 : 0);
        SafeParcelWriter.m3575a(48, this.f9634h0, parcel);
        SafeParcelWriter.m3583i(parcel, 49, this.f9635i0);
        SafeParcelWriter.m3583i(parcel, 50, this.f9636j0);
        SafeParcelWriter.m3583i(parcel, 51, this.f9637k0);
        SafeParcelWriter.m3588n(parcel, 52, 4);
        parcel.writeInt(this.f9638l0 ? 1 : 0);
        SafeParcelWriter.m3580f(parcel, 53, this.f9639m0);
        SafeParcelWriter.m3583i(parcel, 54, this.f9640n0);
        SafeParcelWriter.m3585k(parcel, 55, this.f9641o0);
        SafeParcelWriter.m3588n(parcel, 56, 4);
        parcel.writeInt(this.f9642p0);
        SafeParcelWriter.m3588n(parcel, 57, 4);
        parcel.writeInt(this.f9643q0 ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 58, 4);
        parcel.writeInt(this.f9644r0 ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 59, 4);
        parcel.writeInt(this.f9646s0 ? 1 : 0);
        SafeParcelWriter.m3585k(parcel, 60, this.f9648t0);
        SafeParcelWriter.m3583i(parcel, 61, this.f9650u0);
        SafeParcelWriter.m3582h(parcel, 63, this.f9652v0, i2);
        SafeParcelWriter.m3583i(parcel, 64, this.f9654w0);
        SafeParcelWriter.m3575a(65, this.f9656x0, parcel);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
