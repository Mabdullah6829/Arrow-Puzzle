package p039W;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import p033S0.AbstractC0608b;
import p033S0.C0616j;
import p033S0.C0629w;
import p034T.C0807z0;

/* JADX INFO: renamed from: W.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0863c {

    /* JADX INFO: renamed from: b */
    public final C0629w f2408b;

    /* JADX INFO: renamed from: a */
    public final ArrayList f2407a = new ArrayList();

    /* JADX INFO: renamed from: e */
    public C0862b[] f2411e = new C0862b[8];

    /* JADX INFO: renamed from: f */
    public int f2412f = 7;

    /* JADX INFO: renamed from: g */
    public int f2413g = 0;

    /* JADX INFO: renamed from: h */
    public int f2414h = 0;

    /* JADX INFO: renamed from: c */
    public int f2409c = 4096;

    /* JADX INFO: renamed from: d */
    public int f2410d = 4096;

    public C0863c(C0866f c0866f) {
        this.f2408b = AbstractC0608b.m1369b(c0866f);
    }

    /* JADX INFO: renamed from: a */
    public final int m1772a(int i2) {
        int i3;
        int i4 = 0;
        if (i2 > 0) {
            int length = this.f2411e.length;
            while (true) {
                length--;
                i3 = this.f2412f;
                if (length < i3 || i2 <= 0) {
                    break;
                }
                int i5 = this.f2411e[length].f2406c;
                i2 -= i5;
                this.f2414h -= i5;
                this.f2413g--;
                i4++;
            }
            C0862b[] c0862bArr = this.f2411e;
            System.arraycopy(c0862bArr, i3 + 1, c0862bArr, i3 + 1 + i4, this.f2413g);
            this.f2412f += i4;
        }
        return i4;
    }

    /* JADX INFO: renamed from: b */
    public final C0616j m1773b(int i2) throws IOException {
        if (i2 >= 0) {
            C0862b[] c0862bArr = AbstractC0865e.f2421b;
            if (i2 <= c0862bArr.length - 1) {
                return c0862bArr[i2].f2404a;
            }
        }
        int length = this.f2412f + 1 + (i2 - AbstractC0865e.f2421b.length);
        if (length >= 0) {
            C0862b[] c0862bArr2 = this.f2411e;
            if (length < c0862bArr2.length) {
                return c0862bArr2[length].f2404a;
            }
        }
        throw new IOException("Header index too large " + (i2 + 1));
    }

    /* JADX INFO: renamed from: c */
    public final void m1774c(C0862b c0862b) {
        this.f2407a.add(c0862b);
        int i2 = c0862b.f2406c;
        int i3 = this.f2410d;
        if (i2 > i3) {
            Arrays.fill(this.f2411e, (Object) null);
            this.f2412f = this.f2411e.length - 1;
            this.f2413g = 0;
            this.f2414h = 0;
            return;
        }
        m1772a((this.f2414h + i2) - i3);
        int i4 = this.f2413g + 1;
        C0862b[] c0862bArr = this.f2411e;
        if (i4 > c0862bArr.length) {
            C0862b[] c0862bArr2 = new C0862b[c0862bArr.length * 2];
            System.arraycopy(c0862bArr, 0, c0862bArr2, c0862bArr.length, c0862bArr.length);
            this.f2412f = this.f2411e.length - 1;
            this.f2411e = c0862bArr2;
        }
        int i5 = this.f2412f;
        this.f2412f = i5 - 1;
        this.f2411e[i5] = c0862b;
        this.f2413g++;
        this.f2414h += i2;
    }

    /* JADX INFO: renamed from: d */
    public final C0616j m1775d() {
        C0629w c0629w = this.f2408b;
        byte bM1463e = c0629w.m1463e();
        int i2 = bM1463e & 255;
        boolean z = (bM1463e & 128) == 128;
        int iM1776e = m1776e(i2, 127);
        if (!z) {
            return c0629w.m1464h(iM1776e);
        }
        C0871k c0871k = C0871k.f2444d;
        long j2 = iM1776e;
        c0629w.m1470p(j2);
        byte[] bArrM1396r = c0629w.f1377t.m1396r(j2);
        c0871k.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C0807z0 c0807z0 = c0871k.f2445a;
        C0807z0 c0807z1 = c0807z0;
        int i3 = 0;
        int i4 = 0;
        for (byte b : bArrM1396r) {
            i3 = (i3 << 8) | (b & 255);
            i4 += 8;
            while (i4 >= 8) {
                c0807z1 = ((C0807z0[]) c0807z1.f2113a)[(i3 >>> (i4 - 8)) & 255];
                if (((C0807z0[]) c0807z1.f2113a) == null) {
                    byteArrayOutputStream.write(c0807z1.f2114b);
                    i4 -= c0807z1.f2115c;
                    c0807z1 = c0807z0;
                } else {
                    i4 -= 8;
                }
            }
        }
        while (i4 > 0) {
            C0807z0 c0807z2 = ((C0807z0[]) c0807z1.f2113a)[(i3 << (8 - i4)) & 255];
            C0807z0[] c0807z0Arr = (C0807z0[]) c0807z2.f2113a;
            int i5 = c0807z2.f2115c;
            if (c0807z0Arr != null || i5 > i4) {
                break;
            }
            byteArrayOutputStream.write(c0807z2.f2114b);
            i4 -= i5;
            c0807z1 = c0807z0;
        }
        return C0616j.m1400m(byteArrayOutputStream.toByteArray());
    }

    /* JADX INFO: renamed from: e */
    public final int m1776e(int i2, int i3) {
        int i4 = i2 & i3;
        if (i4 < i3) {
            return i4;
        }
        int i5 = 0;
        while (true) {
            byte bM1463e = this.f2408b.m1463e();
            int i6 = bM1463e & 255;
            if ((bM1463e & 128) == 0) {
                return i3 + (i6 << i5);
            }
            i3 += (bM1463e & 127) << i5;
            i5 += 7;
        }
    }
}
