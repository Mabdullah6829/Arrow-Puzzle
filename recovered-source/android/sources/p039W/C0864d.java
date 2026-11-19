package p039W;

import java.util.Arrays;
import p033S0.C0613g;
import p033S0.C0616j;

/* JADX INFO: renamed from: W.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0864d {

    /* JADX INFO: renamed from: a */
    public final C0613g f2415a;

    /* JADX INFO: renamed from: c */
    public int f2417c;

    /* JADX INFO: renamed from: e */
    public int f2419e;

    /* JADX INFO: renamed from: b */
    public C0862b[] f2416b = new C0862b[8];

    /* JADX INFO: renamed from: d */
    public int f2418d = 7;

    public C0864d(C0613g c0613g) {
        this.f2415a = c0613g;
    }

    /* JADX INFO: renamed from: a */
    public final void m1777a(C0862b c0862b) {
        int i2;
        int i3 = c0862b.f2406c;
        if (i3 > 4096) {
            Arrays.fill(this.f2416b, (Object) null);
            this.f2418d = this.f2416b.length - 1;
            this.f2417c = 0;
            this.f2419e = 0;
            return;
        }
        int i4 = (this.f2419e + i3) - 4096;
        if (i4 > 0) {
            int length = this.f2416b.length - 1;
            int i5 = 0;
            while (true) {
                i2 = this.f2418d;
                if (length < i2 || i4 <= 0) {
                    break;
                }
                int i6 = this.f2416b[length].f2406c;
                i4 -= i6;
                this.f2419e -= i6;
                this.f2417c--;
                i5++;
                length--;
            }
            C0862b[] c0862bArr = this.f2416b;
            int i7 = i2 + 1;
            System.arraycopy(c0862bArr, i7, c0862bArr, i7 + i5, this.f2417c);
            this.f2418d += i5;
        }
        int i8 = this.f2417c + 1;
        C0862b[] c0862bArr2 = this.f2416b;
        if (i8 > c0862bArr2.length) {
            C0862b[] c0862bArr3 = new C0862b[c0862bArr2.length * 2];
            System.arraycopy(c0862bArr2, 0, c0862bArr3, c0862bArr2.length, c0862bArr2.length);
            this.f2418d = this.f2416b.length - 1;
            this.f2416b = c0862bArr3;
        }
        int i9 = this.f2418d;
        this.f2418d = i9 - 1;
        this.f2416b[i9] = c0862b;
        this.f2417c++;
        this.f2419e += i3;
    }

    /* JADX INFO: renamed from: b */
    public final void m1778b(C0616j c0616j) {
        m1779c(c0616j.mo1404e(), 127, 0);
        this.f2415a.m1386N(c0616j);
    }

    /* JADX INFO: renamed from: c */
    public final void m1779c(int i2, int i3, int i4) {
        C0613g c0613g = this.f2415a;
        if (i2 < i3) {
            c0613g.m1387O(i2 | i4);
            return;
        }
        c0613g.m1387O(i4 | i3);
        int i5 = i2 - i3;
        while (i5 >= 128) {
            c0613g.m1387O(128 | (i5 & 127));
            i5 >>>= 7;
        }
        c0613g.m1387O(i5);
    }
}
