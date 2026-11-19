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
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzcbk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcbk> CREATOR = new zzcbl();

    /* JADX INFO: renamed from: A */
    public zzfnc f9677A;

    /* JADX INFO: renamed from: B */
    public String f9678B;

    /* JADX INFO: renamed from: C */
    public final boolean f9679C;

    /* JADX INFO: renamed from: D */
    public final boolean f9680D;

    /* JADX INFO: renamed from: E */
    public final Bundle f9681E;

    /* JADX INFO: renamed from: s */
    public final Bundle f9682s;

    /* JADX INFO: renamed from: t */
    public final VersionInfoParcel f9683t;

    /* JADX INFO: renamed from: u */
    public final ApplicationInfo f9684u;

    /* JADX INFO: renamed from: v */
    public final String f9685v;

    /* JADX INFO: renamed from: w */
    public final List f9686w;

    /* JADX INFO: renamed from: x */
    public final PackageInfo f9687x;

    /* JADX INFO: renamed from: y */
    public final String f9688y;

    /* JADX INFO: renamed from: z */
    public final String f9689z;

    public zzcbk(Bundle bundle, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, String str2, String str3, zzfnc zzfncVar, String str4, boolean z, boolean z2, Bundle bundle2) {
        this.f9682s = bundle;
        this.f9683t = versionInfoParcel;
        this.f9685v = str;
        this.f9684u = applicationInfo;
        this.f9686w = arrayList;
        this.f9687x = packageInfo;
        this.f9688y = str2;
        this.f9689z = str3;
        this.f9677A = zzfncVar;
        this.f9678B = str4;
        this.f9679C = z;
        this.f9680D = z2;
        this.f9681E = bundle2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3575a(1, this.f9682s, parcel);
        SafeParcelWriter.m3582h(parcel, 2, this.f9683t, i2);
        SafeParcelWriter.m3582h(parcel, 3, this.f9684u, i2);
        SafeParcelWriter.m3583i(parcel, 4, this.f9685v);
        SafeParcelWriter.m3585k(parcel, 5, this.f9686w);
        SafeParcelWriter.m3582h(parcel, 6, this.f9687x, i2);
        SafeParcelWriter.m3583i(parcel, 7, this.f9688y);
        SafeParcelWriter.m3583i(parcel, 9, this.f9689z);
        SafeParcelWriter.m3582h(parcel, 10, this.f9677A, i2);
        SafeParcelWriter.m3583i(parcel, 11, this.f9678B);
        SafeParcelWriter.m3588n(parcel, 12, 4);
        parcel.writeInt(this.f9679C ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 13, 4);
        parcel.writeInt(this.f9680D ? 1 : 0);
        SafeParcelWriter.m3575a(14, this.f9681E, parcel);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
