package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class zzq implements Comparator<zzp>, Parcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzn();

    /* JADX INFO: renamed from: s */
    public final zzp[] f20587s;

    /* JADX INFO: renamed from: t */
    public int f20588t;

    /* JADX INFO: renamed from: u */
    public final String f20589u;

    /* JADX INFO: renamed from: v */
    public final int f20590v;

    public zzq(Parcel parcel) {
        this.f20589u = parcel.readString();
        zzp[] zzpVarArr = (zzp[]) parcel.createTypedArray(zzp.CREATOR);
        String str = zzfm.f16091a;
        this.f20587s = zzpVarArr;
        this.f20590v = zzpVarArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final zzq m8828a(String str) {
        return Objects.equals(this.f20589u, str) ? this : new zzq(str, false, this.f20587s);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzp zzpVar, zzp zzpVar2) {
        zzp zzpVar3 = zzpVar2;
        UUID uuid = zzg.f16874a;
        UUID uuid2 = zzpVar.f20536t;
        if (uuid.equals(uuid2)) {
            return !uuid.equals(zzpVar3.f20536t) ? 1 : 0;
        }
        return uuid2.compareTo(zzpVar3.f20536t);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzq.class == obj.getClass()) {
            zzq zzqVar = (zzq) obj;
            if (Objects.equals(this.f20589u, zzqVar.f20589u) && Arrays.equals(this.f20587s, zzqVar.f20587s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f20588t;
        if (i2 != 0) {
            return i2;
        }
        String str = this.f20589u;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f20587s);
        this.f20588t = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f20589u);
        parcel.writeTypedArray(this.f20587s, 0);
    }

    public zzq(String str, boolean z, zzp... zzpVarArr) {
        this.f20589u = str;
        zzpVarArr = z ? (zzp[]) zzpVarArr.clone() : zzpVarArr;
        this.f20587s = zzpVarArr;
        this.f20590v = zzpVarArr.length;
        Arrays.sort(zzpVarArr, this);
    }
}
