package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zzb();

    /* JADX INFO: renamed from: A */
    public final zzaa f3320A;

    /* JADX INFO: renamed from: B */
    public final boolean f3321B;

    /* JADX INFO: renamed from: C */
    public final Bundle f3322C;

    /* JADX INFO: renamed from: s */
    public final String f3323s;

    /* JADX INFO: renamed from: t */
    public final String f3324t;

    /* JADX INFO: renamed from: u */
    public final String f3325u;

    /* JADX INFO: renamed from: v */
    public final String f3326v;

    /* JADX INFO: renamed from: w */
    public final String f3327w;

    /* JADX INFO: renamed from: x */
    public final String f3328x;

    /* JADX INFO: renamed from: y */
    public final String f3329y;

    /* JADX INFO: renamed from: z */
    public final Intent f3330z;

    public zzc(Intent intent, zzaa zzaaVar) {
        this(null, null, null, null, null, null, null, intent, new ObjectWrapper(zzaaVar), false, new Bundle());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 2, this.f3323s);
        SafeParcelWriter.m3583i(parcel, 3, this.f3324t);
        SafeParcelWriter.m3583i(parcel, 4, this.f3325u);
        SafeParcelWriter.m3583i(parcel, 5, this.f3326v);
        SafeParcelWriter.m3583i(parcel, 6, this.f3327w);
        SafeParcelWriter.m3583i(parcel, 7, this.f3328x);
        SafeParcelWriter.m3583i(parcel, 8, this.f3329y);
        SafeParcelWriter.m3582h(parcel, 9, this.f3330z, i2);
        SafeParcelWriter.m3578d(parcel, 10, new ObjectWrapper(this.f3320A));
        SafeParcelWriter.m3588n(parcel, 11, 4);
        parcel.writeInt(this.f3321B ? 1 : 0);
        SafeParcelWriter.m3575a(12, this.f3322C, parcel);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, zzaa zzaaVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, new ObjectWrapper(zzaaVar), false, new Bundle());
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z, Bundle bundle) {
        this.f3323s = str;
        this.f3324t = str2;
        this.f3325u = str3;
        this.f3326v = str4;
        this.f3327w = str5;
        this.f3328x = str6;
        this.f3329y = str7;
        this.f3330z = intent;
        this.f3320A = (zzaa) ObjectWrapper.m3697u0(IObjectWrapper.Stub.m3696k0(iBinder));
        this.f3321B = z;
        this.f3322C = bundle;
    }
}
