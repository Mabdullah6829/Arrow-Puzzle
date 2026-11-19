package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new zzd();

    /* JADX INFO: renamed from: s */
    public final int f4205s;

    /* JADX INFO: renamed from: t */
    public final String f4206t;

    public Scope(int i2, String str) {
        Preconditions.m3542f(str, "scopeUri must not be null or empty");
        this.f4205s = i2;
        this.f4206t = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f4206t.equals(((Scope) obj).f4206t);
    }

    public final int hashCode() {
        return this.f4206t.hashCode();
    }

    public final String toString() {
        return this.f4206t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4205s);
        SafeParcelWriter.m3583i(parcel, 2, this.f4206t);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
