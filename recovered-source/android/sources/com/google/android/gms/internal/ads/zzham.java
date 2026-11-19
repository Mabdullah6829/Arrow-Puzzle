package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzham implements Serializable {

    /* JADX INFO: renamed from: u */
    public static final zzham f18425u = new zzham(new int[0], 0);

    /* JADX INFO: renamed from: s */
    public final int[] f18426s;

    /* JADX INFO: renamed from: t */
    public final int f18427t;

    public zzham(int[] iArr, int i2) {
        this.f18426s = iArr;
        this.f18427t = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m7301a(int i2) {
        zzgtr.m7136i(i2, this.f18427t);
        return this.f18426s[i2];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzham)) {
            return false;
        }
        zzham zzhamVar = (zzham) obj;
        int i2 = zzhamVar.f18427t;
        int i3 = this.f18427t;
        if (i3 != i2) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (m7301a(i4) != zzhamVar.m7301a(i4)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i2 = 0; i2 < this.f18427t; i2++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.f18426s[i2]);
        }
        return iHashCode;
    }

    public final String toString() {
        int i2 = this.f18427t;
        if (i2 == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i2 * 5);
        sb.append('[');
        int[] iArr = this.f18426s;
        sb.append(iArr[0]);
        for (int i3 = 1; i3 < i2; i3++) {
            sb.append(", ");
            sb.append(iArr[i3]);
        }
        sb.append(']');
        return sb.toString();
    }
}
