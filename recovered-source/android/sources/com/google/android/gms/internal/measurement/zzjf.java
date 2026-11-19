package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
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
public final class zzjf extends AbstractSafeParcelable implements Comparable<zzjf> {
    public static final Parcelable.Creator<zzjf> CREATOR = new zzjg();

    /* JADX INFO: renamed from: s */
    public final int f22524s;

    /* JADX INFO: renamed from: t */
    public final zzjo[] f22525t;

    /* JADX INFO: renamed from: u */
    public final String[] f22526u;

    /* JADX INFO: renamed from: v */
    public final TreeMap f22527v = new TreeMap();

    public zzjf(int i2, zzjo[] zzjoVarArr, String[] strArr) {
        this.f22524s = i2;
        this.f22525t = zzjoVarArr;
        for (zzjo zzjoVar : zzjoVarArr) {
            this.f22527v.put(zzjoVar.f22551s, zzjoVar);
        }
        this.f22526u = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzjf zzjfVar) {
        return this.f22524s - zzjfVar.f22524s;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjf)) {
            return false;
        }
        zzjf zzjfVar = (zzjf) obj;
        return this.f22524s == zzjfVar.f22524s && zzkl.m10462a(this.f22527v, zzjfVar.f22527v) && Arrays.equals(this.f22526u, zzjfVar.f22526u);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.f22524s);
        sb.append(", (");
        Iterator it = this.f22527v.values().iterator();
        while (it.hasNext()) {
            sb.append((zzjo) it.next());
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.f22526u;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f22524s);
        SafeParcelWriter.m3586l(parcel, 3, this.f22525t, i2);
        SafeParcelWriter.m3584j(parcel, 4, this.f22526u);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
