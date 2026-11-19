package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new zzde();

    /* JADX INFO: renamed from: s */
    public final int f22358s;

    /* JADX INFO: renamed from: t */
    public final String f22359t;

    /* JADX INFO: renamed from: u */
    public final Intent f22360u;

    public zzdd(int i2, String str, Intent intent) {
        this.f22358s = i2;
        this.f22359t = str;
        this.f22360u = intent;
    }

    /* JADX INFO: renamed from: w */
    public static zzdd m9836w(Activity activity) {
        return new zzdd(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdd)) {
            return false;
        }
        zzdd zzddVar = (zzdd) obj;
        return this.f22358s == zzddVar.f22358s && Objects.equals(this.f22359t, zzddVar.f22359t) && Objects.equals(this.f22360u, zzddVar.f22360u);
    }

    public final int hashCode() {
        return this.f22358s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f22358s);
        SafeParcelWriter.m3583i(parcel, 2, this.f22359t);
        SafeParcelWriter.m3582h(parcel, 3, this.f22360u, i2);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
