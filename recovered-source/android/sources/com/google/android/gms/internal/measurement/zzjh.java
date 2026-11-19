package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzjh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjh> CREATOR = new zzji();

    /* JADX INFO: renamed from: s */
    public final String f22528s;

    /* JADX INFO: renamed from: t */
    public final byte[] f22529t;

    /* JADX INFO: renamed from: u */
    public final String f22530u;

    /* JADX INFO: renamed from: v */
    public final zzjf[] f22531v;

    /* JADX INFO: renamed from: w */
    public final TreeMap f22532w = new TreeMap();

    /* JADX INFO: renamed from: x */
    public final boolean f22533x;

    /* JADX INFO: renamed from: y */
    public final long f22534y;

    public zzjh(String str, String str2, zzjf[] zzjfVarArr, boolean z, byte[] bArr, long j2) {
        this.f22528s = str;
        this.f22530u = str2;
        this.f22531v = zzjfVarArr;
        this.f22533x = z;
        this.f22529t = bArr;
        this.f22534y = j2;
        for (zzjf zzjfVar : zzjfVarArr) {
            this.f22532w.put(Integer.valueOf(zzjfVar.f22524s), zzjfVar);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjh)) {
            return false;
        }
        zzjh zzjhVar = (zzjh) obj;
        return zzkl.m10462a(this.f22528s, zzjhVar.f22528s) && zzkl.m10462a(this.f22530u, zzjhVar.f22530u) && this.f22532w.equals(zzjhVar.f22532w) && this.f22533x == zzjhVar.f22533x && Arrays.equals(this.f22529t, zzjhVar.f22529t) && this.f22534y == zzjhVar.f22534y;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22528s, this.f22530u, this.f22532w, Boolean.valueOf(this.f22533x), this.f22529t, Long.valueOf(this.f22534y)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.f22528s);
        sb.append("', '");
        sb.append(this.f22530u);
        sb.append("', (");
        Iterator it = this.f22532w.values().iterator();
        while (it.hasNext()) {
            sb.append((zzjf) it.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.f22533x);
        sb.append(", ");
        byte[] bArr = this.f22529t;
        sb.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb.append(", ");
        sb.append(this.f22534y);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 2, this.f22528s);
        SafeParcelWriter.m3583i(parcel, 3, this.f22530u);
        SafeParcelWriter.m3586l(parcel, 4, this.f22531v, i2);
        SafeParcelWriter.m3588n(parcel, 5, 4);
        parcel.writeInt(this.f22533x ? 1 : 0);
        SafeParcelWriter.m3576b(parcel, 6, this.f22529t);
        SafeParcelWriter.m3588n(parcel, 7, 8);
        parcel.writeLong(this.f22534y);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
