package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzev {

    /* JADX INFO: renamed from: c */
    public static final zzev f14942c = new zzev(-1, -1);

    /* JADX INFO: renamed from: a */
    public final int f14943a;

    /* JADX INFO: renamed from: b */
    public final int f14944b;

    static {
        new zzev(0, 0);
        String str = zzfm.f16091a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzev(int i2, int i3) {
        boolean z = false;
        if ((i2 == -1 || i2 >= 0) && (i3 == -1 || i3 >= 0)) {
            z = true;
        }
        zzgtr.m7128a(z);
        this.f14943a = i2;
        this.f14944b = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzev) {
            zzev zzevVar = (zzev) obj;
            if (this.f14943a == zzevVar.f14943a && this.f14944b == zzevVar.f14944b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f14943a;
        return ((i2 >>> 16) | (i2 << 16)) ^ this.f14944b;
    }

    public final String toString() {
        int i2 = this.f14943a;
        int length = String.valueOf(i2).length();
        int i3 = this.f14944b;
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(i3).length());
        sb.append(i2);
        sb.append("x");
        sb.append(i3);
        return sb.toString();
    }
}
