package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzjq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjq> CREATOR = new zzjr();

    /* JADX INFO: renamed from: s */
    public final String f22559s;

    /* JADX INFO: renamed from: t */
    public final String f22560t;

    /* JADX INFO: renamed from: u */
    public final zzjo f22561u;

    /* JADX INFO: renamed from: v */
    public final boolean f22562v;

    public zzjq(String str, String str2, zzjo zzjoVar, boolean z) {
        this.f22559s = str;
        this.f22560t = str2;
        this.f22561u = zzjoVar;
        this.f22562v = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjq)) {
            return false;
        }
        zzjq zzjqVar = (zzjq) obj;
        return zzkl.m10462a(this.f22559s, zzjqVar.f22559s) && zzkl.m10462a(this.f22560t, zzjqVar.f22560t) && zzkl.m10462a(this.f22561u, zzjqVar.f22561u) && this.f22562v == zzjqVar.f22562v;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m10459w(sb);
        return sb.toString();
    }

    /* JADX INFO: renamed from: w */
    public final void m10459w(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.f22559s);
        sb.append(", ");
        sb.append(this.f22560t);
        sb.append(", ");
        this.f22561u.m10458w(sb);
        sb.append(", ");
        sb.append(this.f22562v);
        sb.append(")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 2, this.f22559s);
        SafeParcelWriter.m3583i(parcel, 3, this.f22560t);
        SafeParcelWriter.m3582h(parcel, 4, this.f22561u, i2);
        SafeParcelWriter.m3588n(parcel, 5, 4);
        parcel.writeInt(this.f22562v ? 1 : 0);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
