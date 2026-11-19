package p033S0;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0271e0;
import p035T0.AbstractC0810b;
import p058e0.AbstractC6302j;

/* JADX INFO: renamed from: S0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0632z extends C0616j {

    /* JADX INFO: renamed from: w */
    public final transient byte[][] f1389w;

    /* JADX INFO: renamed from: x */
    public final transient int[] f1390x;

    public C0632z(byte[][] bArr, int[] iArr) {
        super(C0616j.f1343v.f1344s);
        this.f1389w = bArr;
        this.f1390x = iArr;
    }

    @Override // p033S0.C0616j
    /* JADX INFO: renamed from: b */
    public final String mo1402b() {
        throw null;
    }

    @Override // p033S0.C0616j
    /* JADX INFO: renamed from: e */
    public final int mo1404e() {
        return this.f1390x[this.f1389w.length - 1];
    }

    @Override // p033S0.C0616j
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0616j) {
            C0616j c0616j = (C0616j) obj;
            if (c0616j.mo1404e() == mo1404e() && mo1410n(0, c0616j, mo1404e())) {
                return true;
            }
        }
        return false;
    }

    @Override // p033S0.C0616j
    /* JADX INFO: renamed from: f */
    public final String mo1405f() {
        return m1478v().mo1405f();
    }

    @Override // p033S0.C0616j
    /* JADX INFO: renamed from: g */
    public final int mo1406g(int i2, byte[] other) {
        AbstractC6452k.m12181e(other, "other");
        return m1478v().mo1406g(i2, other);
    }

    @Override // p033S0.C0616j
    public final int hashCode() {
        int i2 = this.f1345t;
        if (i2 != 0) {
            return i2;
        }
        byte[][] bArr = this.f1389w;
        int length = bArr.length;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i3 < length) {
            int[] iArr = this.f1390x;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            byte[] bArr2 = bArr[i3];
            int i8 = (i7 - i5) + i6;
            while (i6 < i8) {
                i4 = (i4 * 31) + bArr2[i6];
                i6++;
            }
            i3++;
            i5 = i7;
        }
        this.f1345t = i4;
        return i4;
    }

    @Override // p033S0.C0616j
    /* JADX INFO: renamed from: i */
    public final byte[] mo1407i() {
        return mo1414s();
    }

    @Override // p033S0.C0616j
    /* JADX INFO: renamed from: j */
    public final byte mo1408j(int i2) {
        byte[][] bArr = this.f1389w;
        int length = bArr.length - 1;
        int[] iArr = this.f1390x;
        AbstractC0608b.m1370c(iArr[length], i2, 1L);
        int iM1688f = AbstractC0810b.m1688f(this, i2);
        return bArr[iM1688f][(i2 - (iM1688f == 0 ? 0 : iArr[iM1688f - 1])) + iArr[bArr.length + iM1688f]];
    }

    @Override // p033S0.C0616j
    /* JADX INFO: renamed from: k */
    public final int mo1409k(byte[] other) {
        AbstractC6452k.m12181e(other, "other");
        return m1478v().mo1409k(other);
    }

    @Override // p033S0.C0616j
    /* JADX INFO: renamed from: n */
    public final boolean mo1410n(int i2, C0616j other, int i3) {
        AbstractC6452k.m12181e(other, "other");
        if (i2 >= 0 && i2 <= mo1404e() - i3) {
            int i4 = i3 + i2;
            int iM1688f = AbstractC0810b.m1688f(this, i2);
            int i5 = 0;
            while (i2 < i4) {
                int[] iArr = this.f1390x;
                int i6 = iM1688f == 0 ? 0 : iArr[iM1688f - 1];
                int i7 = iArr[iM1688f] - i6;
                byte[][] bArr = this.f1389w;
                int i8 = iArr[bArr.length + iM1688f];
                int iMin = Math.min(i4, i7 + i6) - i2;
                if (other.mo1411o(i5, bArr[iM1688f], (i2 - i6) + i8, iMin)) {
                    i5 += iMin;
                    i2 += iMin;
                    iM1688f++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // p033S0.C0616j
    /* JADX INFO: renamed from: o */
    public final boolean mo1411o(int i2, byte[] other, int i3, int i4) {
        AbstractC6452k.m12181e(other, "other");
        if (i2 < 0 || i2 > mo1404e() - i4 || i3 < 0 || i3 > other.length - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int iM1688f = AbstractC0810b.m1688f(this, i2);
        while (i2 < i5) {
            int[] iArr = this.f1390x;
            int i6 = iM1688f == 0 ? 0 : iArr[iM1688f - 1];
            int i7 = iArr[iM1688f] - i6;
            byte[][] bArr = this.f1389w;
            int i8 = iArr[bArr.length + iM1688f];
            int iMin = Math.min(i5, i7 + i6) - i2;
            if (!AbstractC0608b.m1368a(bArr[iM1688f], (i2 - i6) + i8, other, i3, iMin)) {
                return false;
            }
            i3 += iMin;
            i2 += iMin;
            iM1688f++;
        }
        return true;
    }

    @Override // p033S0.C0616j
    /* JADX INFO: renamed from: p */
    public final C0616j mo1412p(int i2, int i3) {
        if (i3 == -1234567890) {
            i3 = mo1404e();
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0271e0.m397e(i2, "beginIndex=", " < 0").toString());
        }
        if (i3 > mo1404e()) {
            StringBuilder sbM404l = AbstractC0271e0.m404l(i3, "endIndex=", " > length(");
            sbM404l.append(mo1404e());
            sbM404l.append(')');
            throw new IllegalArgumentException(sbM404l.toString().toString());
        }
        int i4 = i3 - i2;
        if (i4 < 0) {
            throw new IllegalArgumentException(AbstractC1456a.m2443j(i3, i2, "endIndex=", " < beginIndex=").toString());
        }
        if (i2 == 0 && i3 == mo1404e()) {
            return this;
        }
        if (i2 == i3) {
            return C0616j.f1343v;
        }
        int iM1688f = AbstractC0810b.m1688f(this, i2);
        int iM1688f2 = AbstractC0810b.m1688f(this, i3 - 1);
        byte[][] bArr = this.f1389w;
        byte[][] bArr2 = (byte[][]) AbstractC6302j.m12104z(bArr, iM1688f, iM1688f2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f1390x;
        if (iM1688f <= iM1688f2) {
            int i5 = iM1688f;
            int i6 = 0;
            while (true) {
                iArr[i6] = Math.min(iArr2[i5] - i2, i4);
                int i7 = i6 + 1;
                iArr[i6 + bArr2.length] = iArr2[bArr.length + i5];
                if (i5 == iM1688f2) {
                    break;
                }
                i5++;
                i6 = i7;
            }
        }
        int i8 = iM1688f != 0 ? iArr2[iM1688f - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i2 - i8) + iArr[length];
        return new C0632z(bArr2, iArr);
    }

    @Override // p033S0.C0616j
    /* JADX INFO: renamed from: r */
    public final C0616j mo1413r() {
        return m1478v().mo1413r();
    }

    @Override // p033S0.C0616j
    /* JADX INFO: renamed from: s */
    public final byte[] mo1414s() {
        byte[] bArr = new byte[mo1404e()];
        byte[][] bArr2 = this.f1389w;
        int length = bArr2.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f1390x;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = i6 - i3;
            AbstractC6302j.m12099u(bArr2[i2], i4, bArr, i5, i5 + i7);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    @Override // p033S0.C0616j
    public final String toString() {
        return m1478v().toString();
    }

    @Override // p033S0.C0616j
    /* JADX INFO: renamed from: u */
    public final void mo1416u(C0613g c0613g, int i2) {
        int iM1688f = AbstractC0810b.m1688f(this, 0);
        int i3 = 0;
        while (i3 < i2) {
            int[] iArr = this.f1390x;
            int i4 = iM1688f == 0 ? 0 : iArr[iM1688f - 1];
            int i5 = iArr[iM1688f] - i4;
            byte[][] bArr = this.f1389w;
            int i6 = iArr[bArr.length + iM1688f];
            int iMin = Math.min(i2, i5 + i4) - i3;
            int i7 = (i3 - i4) + i6;
            C0630x c0630x = new C0630x(bArr[iM1688f], i7, i7 + iMin, true);
            C0630x c0630x2 = c0613g.f1341s;
            if (c0630x2 == null) {
                c0630x.f1385g = c0630x;
                c0630x.f1384f = c0630x;
                c0613g.f1341s = c0630x;
            } else {
                C0630x c0630x3 = c0630x2.f1385g;
                AbstractC6452k.m12178b(c0630x3);
                c0630x3.m1473b(c0630x);
            }
            i3 += iMin;
            iM1688f++;
        }
        c0613g.f1342t += (long) i2;
    }

    /* JADX INFO: renamed from: v */
    public final C0616j m1478v() {
        return new C0616j(mo1414s());
    }
}
