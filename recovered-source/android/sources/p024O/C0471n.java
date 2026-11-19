package p024O;

/* JADX INFO: renamed from: O.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0471n {

    /* JADX INFO: renamed from: a */
    public C0462e[] f834a;

    /* JADX INFO: renamed from: b */
    public int f835b;

    /* JADX INFO: renamed from: c */
    public int f836c;

    /* JADX INFO: renamed from: d */
    public int f837d;

    /* JADX INFO: renamed from: a */
    public final int m1031a(int i2, int i3) {
        C0462e c0462e;
        int i4;
        if (i2 == 0) {
            return i3;
        }
        if (i3 == 0) {
            return i2;
        }
        int i5 = i2;
        while (true) {
            c0462e = this.f834a[i5 >> 1];
            i4 = i5 & 1;
            int i6 = i4 == 0 ? c0462e.f795b : c0462e.f796c;
            if (i6 == 0) {
                break;
            }
            i5 = i6;
        }
        if (i4 == 0) {
            c0462e.f795b = i3;
            return i2;
        }
        c0462e.f796c = i3;
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public final void m1032b(int i2, int i3) {
        while (i2 != 0) {
            C0462e c0462e = this.f834a[i2 >> 1];
            if ((i2 & 1) == 0) {
                i2 = c0462e.f795b;
                c0462e.f795b = i3;
            } else {
                i2 = c0462e.f796c;
                c0462e.f796c = i3;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < this.f835b; i2++) {
            int length = sb.length();
            sb.append(i2);
            if (i2 == this.f836c) {
                sb.append('*');
            }
            sb.append("        ".substring(sb.length() - length));
            sb.append(this.f834a[i2]);
            sb.append('\n');
        }
        return sb.toString();
    }
}
