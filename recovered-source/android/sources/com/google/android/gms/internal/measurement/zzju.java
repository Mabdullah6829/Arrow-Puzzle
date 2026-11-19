package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@SafeParcelable.Class
public final class zzju extends AbstractSafeParcelable implements Comparable<zzju> {
    public static final Parcelable.Creator<zzju> CREATOR = new zzjv();

    /* JADX INFO: renamed from: s */
    public final int f22564s;

    /* JADX INFO: renamed from: t */
    public final int f22565t;

    public zzju(int i2, int i3) {
        this.f22564s = i2;
        this.f22565t = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(zzju zzjuVar) {
        zzju zzjuVar2 = zzjuVar;
        int i2 = zzjuVar2.f22564s;
        int i3 = this.f22564s;
        if (i3 < i2) {
            return -1;
        }
        if (i3 > i2) {
            return 1;
        }
        int i4 = zzjuVar2.f22565t;
        int i5 = this.f22565t;
        if (i5 < i4) {
            return -1;
        }
        return i5 > i4 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
    
        r0 = (r3 = (com.google.android.gms.internal.measurement.zzju) r3).f22564s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
    
        r3 = r3.f22565t;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.zzju
            if (r0 == 0) goto L1c
            com.google.android.gms.internal.measurement.zzju r3 = (com.google.android.gms.internal.measurement.zzju) r3
            int r0 = r3.f22564s
            int r1 = r2.f22564s
            if (r1 >= r0) goto Ld
            goto L1c
        Ld:
            if (r1 <= r0) goto L10
            goto L1c
        L10:
            int r3 = r3.f22565t
            int r0 = r2.f22565t
            if (r0 >= r3) goto L17
            goto L1c
        L17:
            if (r0 <= r3) goto L1a
            goto L1c
        L1a:
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzju.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (this.f22564s * 31) + this.f22565t;
    }

    public final String toString() {
        int i2 = this.f22564s;
        int length = String.valueOf(i2).length();
        int i3 = this.f22565t;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(i3).length() + 1);
        AbstractC1456a.m2455v(sb, "GenericDimension(", i2, ", ", i3);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f22564s);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f22565t);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
