package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhao implements Serializable {

    /* JADX INFO: renamed from: u */
    public static final zzhao f18430u = new zzhao(new long[0], 0);

    /* JADX INFO: renamed from: s */
    public final long[] f18431s;

    /* JADX INFO: renamed from: t */
    public final int f18432t;

    public zzhao(long[] jArr, int i2) {
        this.f18431s = jArr;
        this.f18432t = i2;
    }

    /* JADX INFO: renamed from: a */
    public final long m7303a(int i2) {
        zzgtr.m7136i(i2, this.f18432t);
        return this.f18431s[i2];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhao)) {
            return false;
        }
        zzhao zzhaoVar = (zzhao) obj;
        int i2 = zzhaoVar.f18432t;
        int i3 = this.f18432t;
        if (i3 != i2) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (m7303a(i4) != zzhaoVar.m7303a(i4)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i2 = 0; i2 < this.f18432t; i2++) {
            iHashCode = (iHashCode * 31) + Long.hashCode(this.f18431s[i2]);
        }
        return iHashCode;
    }

    public final String toString() {
        int i2 = this.f18432t;
        if (i2 == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i2 * 5);
        sb.append('[');
        long[] jArr = this.f18431s;
        sb.append(jArr[0]);
        for (int i3 = 1; i3 < i2; i3++) {
            sb.append(", ");
            sb.append(jArr[i3]);
        }
        sb.append(']');
        return sb.toString();
    }
}
