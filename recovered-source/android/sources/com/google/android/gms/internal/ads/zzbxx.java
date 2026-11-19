package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zzbxx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbxx> CREATOR = new zzbxy();

    /* JADX INFO: renamed from: s */
    public final int f9492s;

    /* JADX INFO: renamed from: t */
    public final int f9493t;

    /* JADX INFO: renamed from: u */
    public final int f9494u;

    public zzbxx(int i2, int i3, int i4) {
        this.f9492s = i2;
        this.f9493t = i3;
        this.f9494u = i4;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbxx)) {
            zzbxx zzbxxVar = (zzbxx) obj;
            if (zzbxxVar.f9494u == this.f9494u && zzbxxVar.f9493t == this.f9493t && zzbxxVar.f9492s == this.f9492s) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f9492s, this.f9493t, this.f9494u});
    }

    public final String toString() {
        int i2 = this.f9492s;
        int length = String.valueOf(i2).length();
        int i3 = this.f9493t;
        int length2 = String.valueOf(i3).length();
        int i4 = this.f9494u;
        StringBuilder sb = new StringBuilder(AbstractC1456a.m2437d(length, 1, length2, 1, String.valueOf(i4).length()));
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        sb.append(".");
        sb.append(i4);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f9492s);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f9493t);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f9494u);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
