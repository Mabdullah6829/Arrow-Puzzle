package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class zzp implements Parcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new zzo();

    /* JADX INFO: renamed from: s */
    public int f20535s;

    /* JADX INFO: renamed from: t */
    public final UUID f20536t;

    /* JADX INFO: renamed from: u */
    public final String f20537u;

    /* JADX INFO: renamed from: v */
    public final String f20538v;

    /* JADX INFO: renamed from: w */
    public final byte[] f20539w;

    public zzp(Parcel parcel) {
        this.f20536t = new UUID(parcel.readLong(), parcel.readLong());
        this.f20537u = parcel.readString();
        String string = parcel.readString();
        String str = zzfm.f16091a;
        this.f20538v = string;
        this.f20539w = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzp)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzp zzpVar = (zzp) obj;
        return Objects.equals(this.f20537u, zzpVar.f20537u) && Objects.equals(this.f20538v, zzpVar.f20538v) && Objects.equals(this.f20536t, zzpVar.f20536t) && Arrays.equals(this.f20539w, zzpVar.f20539w);
    }

    public final int hashCode() {
        int i2 = this.f20535s;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = this.f20536t.hashCode() * 31;
        String str = this.f20537u;
        int iHashCode2 = Arrays.hashCode(this.f20539w) + ((this.f20538v.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        this.f20535s = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        UUID uuid = this.f20536t;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f20537u);
        parcel.writeString(this.f20538v);
        parcel.writeByteArray(this.f20539w);
    }

    public zzp(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.f20536t = uuid;
        this.f20537u = null;
        this.f20538v = zzas.m4356h(str);
        this.f20539w = bArr;
    }
}
