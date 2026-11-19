package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import p011H.AbstractC0271e0;

/* JADX INFO: renamed from: com.google.protobuf.m */
/* JADX INFO: loaded from: classes.dex */
public class C6248m extends AbstractC6251n {

    /* JADX INFO: renamed from: v */
    public final byte[] f24205v;

    public C6248m(byte[] bArr) {
        bArr.getClass();
        this.f24205v = bArr;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m11892B(C6248m c6248m, int i2, int i3) {
        if (i3 > c6248m.size()) {
            throw new IllegalArgumentException("Length too large: " + i3 + size());
        }
        int i4 = i2 + i3;
        if (i4 > c6248m.size()) {
            StringBuilder sbM409q = AbstractC0271e0.m409q("Ran off end of other: ", i2, ", ", i3, ", ");
            sbM409q.append(c6248m.size());
            throw new IllegalArgumentException(sbM409q.toString());
        }
        if (!(c6248m instanceof C6248m)) {
            return c6248m.mo11728v(i2, i4).equals(mo11728v(0, i3));
        }
        byte[] bArr = c6248m.f24205v;
        int iMo11891C = mo11891C() + i3;
        int iMo11891C2 = mo11891C();
        int iMo11891C3 = c6248m.mo11891C() + i2;
        while (iMo11891C2 < iMo11891C) {
            if (this.f24205v[iMo11891C2] != bArr[iMo11891C3]) {
                return false;
            }
            iMo11891C2++;
            iMo11891C3++;
        }
        return true;
    }

    /* JADX INFO: renamed from: C */
    public int mo11891C() {
        return 0;
    }

    @Override // com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: a */
    public final ByteBuffer mo11718a() {
        return ByteBuffer.wrap(this.f24205v, mo11891C(), size()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: d */
    public byte mo11719d(int i2) {
        return this.f24205v[i2];
    }

    @Override // com.google.protobuf.AbstractC6251n
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC6251n) && size() == ((AbstractC6251n) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C6248m)) {
                return obj.equals(this);
            }
            C6248m c6248m = (C6248m) obj;
            int i2 = this.f24221s;
            int i3 = c6248m.f24221s;
            if (i2 == 0 || i3 == 0 || i2 == i3) {
                return m11892B(c6248m, 0, size());
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6236i(this);
    }

    @Override // com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: k */
    public void mo11720k(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.f24205v, i2, bArr, i3, i4);
    }

    @Override // com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: m */
    public final int mo11721m() {
        return 0;
    }

    @Override // com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: n */
    public byte mo11722n(int i2) {
        return this.f24205v[i2];
    }

    @Override // com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: q */
    public final boolean mo11723q() {
        return true;
    }

    @Override // com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: r */
    public final boolean mo11724r() {
        int iMo11891C = mo11891C();
        return AbstractC6232g1.f24178a.m11803t(this.f24205v, iMo11891C, size() + iMo11891C);
    }

    @Override // com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: s */
    public final AbstractC6261s mo11725s() {
        return AbstractC6261s.m11966f(this.f24205v, mo11891C(), size(), true);
    }

    @Override // com.google.protobuf.AbstractC6251n
    public int size() {
        return this.f24205v.length;
    }

    @Override // com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: t */
    public final int mo11726t(int i2, int i3, int i4) {
        int iMo11891C = mo11891C() + i3;
        Charset charset = AbstractC6213a0.f24134a;
        for (int i5 = iMo11891C; i5 < iMo11891C + i4; i5++) {
            i2 = (i2 * 31) + this.f24205v[i5];
        }
        return i2;
    }

    @Override // com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: u */
    public final int mo11727u(int i2, int i3, int i4) {
        int iMo11891C = mo11891C() + i3;
        return AbstractC6232g1.f24178a.mo11804w(i2, this.f24205v, iMo11891C, i4 + iMo11891C);
    }

    @Override // com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: v */
    public final AbstractC6251n mo11728v(int i2, int i3) {
        int iM11895h = AbstractC6251n.m11895h(i2, i3, size());
        if (iM11895h == 0) {
            return AbstractC6251n.f24219t;
        }
        return new C6245l(this.f24205v, mo11891C() + i2, iM11895h);
    }

    @Override // com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: x */
    public final String mo11729x(Charset charset) {
        return new String(this.f24205v, mo11891C(), size(), charset);
    }

    @Override // com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: z */
    public final void mo11730z(AbstractC6269w abstractC6269w) {
        abstractC6269w.mo11805y(this.f24205v, mo11891C(), size());
    }
}
