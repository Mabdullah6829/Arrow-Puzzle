package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzza {

    /* JADX INFO: renamed from: d */
    public static final long f23131d;

    /* JADX INFO: renamed from: e */
    public static final zzza f23132e;

    /* JADX INFO: renamed from: a */
    public final int f23133a;

    /* JADX INFO: renamed from: b */
    public final int f23134b;

    /* JADX INFO: renamed from: c */
    public final int f23135c;

    static {
        long jCharAt = 0;
        for (int i2 = 0; i2 < 7; i2++) {
            jCharAt |= (((long) i2) + 1) << ((int) (((long) (" #(+,-0".charAt(i2) - ' ')) * 3));
        }
        f23131d = jCharAt;
        f23132e = new zzza(0, -1, -1);
    }

    public zzza(int i2, int i3, int i4) {
        this.f23133a = i2;
        this.f23134b = i3;
        this.f23135c = i4;
    }

    /* JADX INFO: renamed from: e */
    public static int m10739e(int i2, int i3, String str) {
        if (i2 == i3) {
            throw zzabo.m9331b(i2 - 1, "missing precision", str);
        }
        int i4 = 0;
        for (int i5 = i2; i5 < i3; i5++) {
            char cCharAt = (char) (str.charAt(i5) - '0');
            if (cCharAt >= '\n') {
                throw zzabo.m9331b(i5, "invalid precision character", str);
            }
            i4 = (i4 * 10) + cCharAt;
            if (i4 > 999999) {
                throw zzabo.m9330a(i2, i3, "precision too large", str);
            }
        }
        if (i4 != 0) {
            return i4;
        }
        if (i3 == i2 + 1) {
            return 0;
        }
        throw zzabo.m9330a(i2, i3, "invalid precision", str);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10740a() {
        return this == f23132e;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10741b(int i2, boolean z) {
        int i3;
        if (m10740a()) {
            return true;
        }
        int i4 = ~i2;
        int i5 = this.f23133a;
        if ((i4 & i5) != 0) {
            return false;
        }
        if ((!z && this.f23135c != -1) || (i5 & 9) == 9 || (i3 = i5 & 96) == 96) {
            return false;
        }
        return i3 == 0 || this.f23134b != -1;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10742c() {
        return (this.f23133a & 128) != 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m10743d(StringBuilder sb) {
        if (m10740a()) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = this.f23133a & (-129);
            int i4 = 1 << i2;
            if (i4 > i3) {
                break;
            }
            if ((i3 & i4) != 0) {
                sb.append(" #(+,-0".charAt(i2));
            }
            i2++;
        }
        int i5 = this.f23134b;
        if (i5 != -1) {
            sb.append(i5);
        }
        int i6 = this.f23135c;
        if (i6 != -1) {
            sb.append('.');
            sb.append(i6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzza) {
            zzza zzzaVar = (zzza) obj;
            if (zzzaVar.f23133a == this.f23133a && zzzaVar.f23134b == this.f23134b && zzzaVar.f23135c == this.f23135c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f23133a * 31) + this.f23134b) * 31) + this.f23135c;
    }
}
