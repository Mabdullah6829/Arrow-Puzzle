package com.google.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p011H.AbstractC0271e0;

/* JADX INFO: renamed from: com.google.protobuf.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6251n implements Iterable, Serializable {

    /* JADX INFO: renamed from: t */
    public static final C6248m f24219t = new C6248m(AbstractC6213a0.f24135b);

    /* JADX INFO: renamed from: u */
    public static final C6242k f24220u;

    /* JADX INFO: renamed from: s */
    public int f24221s = 0;

    static {
        f24220u = AbstractC6224e.m11876a() ? new C6242k(1) : new C6242k(0);
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC6251n m11893b(Iterator it, int i2) {
        if (i2 < 1) {
            throw new IllegalArgumentException(AbstractC0271e0.m397e(i2, "length (", ") must be >= 1"));
        }
        if (i2 == 1) {
            return (AbstractC6251n) it.next();
        }
        int i3 = i2 >>> 1;
        AbstractC6251n abstractC6251nM11893b = m11893b(it, i3);
        AbstractC6251n abstractC6251nM11893b2 = m11893b(it, i2 - i3);
        if (Integer.MAX_VALUE - abstractC6251nM11893b.size() < abstractC6251nM11893b2.size()) {
            throw new IllegalArgumentException("ByteString would be too long: " + abstractC6251nM11893b.size() + "+" + abstractC6251nM11893b2.size());
        }
        if (abstractC6251nM11893b2.size() == 0) {
            return abstractC6251nM11893b;
        }
        if (abstractC6251nM11893b.size() == 0) {
            return abstractC6251nM11893b2;
        }
        int size = abstractC6251nM11893b2.size() + abstractC6251nM11893b.size();
        if (size < 128) {
            int size2 = abstractC6251nM11893b.size();
            int size3 = abstractC6251nM11893b2.size();
            int i4 = size2 + size3;
            byte[] bArr = new byte[i4];
            m11895h(0, size2, abstractC6251nM11893b.size());
            m11895h(0, size2, i4);
            if (size2 > 0) {
                abstractC6251nM11893b.mo11720k(bArr, 0, 0, size2);
            }
            m11895h(0, size3, abstractC6251nM11893b2.size());
            m11895h(size2, i4, i4);
            if (size3 > 0) {
                abstractC6251nM11893b2.mo11720k(bArr, 0, size2, size3);
            }
            return new C6248m(bArr);
        }
        if (abstractC6251nM11893b instanceof C6176H0) {
            C6176H0 c6176h0 = (C6176H0) abstractC6251nM11893b;
            AbstractC6251n abstractC6251n = c6176h0.f24083w;
            AbstractC6251n abstractC6251n2 = c6176h0.f24084x;
            if (abstractC6251nM11893b2.size() + abstractC6251n2.size() < 128) {
                int size4 = abstractC6251n2.size();
                int size5 = abstractC6251nM11893b2.size();
                int i5 = size4 + size5;
                byte[] bArr2 = new byte[i5];
                m11895h(0, size4, abstractC6251n2.size());
                m11895h(0, size4, i5);
                if (size4 > 0) {
                    abstractC6251n2.mo11720k(bArr2, 0, 0, size4);
                }
                m11895h(0, size5, abstractC6251nM11893b2.size());
                m11895h(size4, i5, i5);
                if (size5 > 0) {
                    abstractC6251nM11893b2.mo11720k(bArr2, 0, size4, size5);
                }
                return new C6176H0(abstractC6251n, new C6248m(bArr2));
            }
            if (abstractC6251n.mo11721m() > abstractC6251n2.mo11721m() && c6176h0.f24086z > abstractC6251nM11893b2.mo11721m()) {
                return new C6176H0(abstractC6251n, new C6176H0(abstractC6251n2, abstractC6251nM11893b2));
            }
        }
        if (size >= C6176H0.m11717B(Math.max(abstractC6251nM11893b.mo11721m(), abstractC6251nM11893b2.mo11721m()) + 1)) {
            return new C6176H0(abstractC6251nM11893b, abstractC6251nM11893b2);
        }
        C6243k0 c6243k0 = new C6243k0(2);
        c6243k0.m11889a(abstractC6251nM11893b);
        c6243k0.m11889a(abstractC6251nM11893b2);
        ArrayDeque arrayDeque = (ArrayDeque) c6243k0.f24193a;
        AbstractC6251n c6176h1 = (AbstractC6251n) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            c6176h1 = new C6176H0((AbstractC6251n) arrayDeque.pop(), c6176h1);
        }
        return c6176h1;
    }

    /* JADX INFO: renamed from: g */
    public static void m11894g(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) < 0) {
            if (i2 >= 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC1456a.m2443j(i2, i3, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC0271e0.m396d(i2, "Index < 0: "));
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m11895h(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0271e0.m397e(i2, "Beginning index: ", " < 0"));
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException(AbstractC1456a.m2443j(i2, i3, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC1456a.m2443j(i3, i4, "End index: ", " >= "));
    }

    /* JADX INFO: renamed from: j */
    public static C6248m m11896j(byte[] bArr, int i2, int i3) {
        byte[] bArrCopyOfRange;
        m11895h(i2, i2 + i3, bArr.length);
        switch (f24220u.f24191a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i2, i3 + i2);
                break;
            default:
                bArrCopyOfRange = new byte[i3];
                System.arraycopy(bArr, i2, bArrCopyOfRange, 0, i3);
                break;
        }
        return new C6248m(bArrCopyOfRange);
    }

    /* JADX INFO: renamed from: a */
    public abstract ByteBuffer mo11718a();

    /* JADX INFO: renamed from: d */
    public abstract byte mo11719d(int i2);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iMo11726t = this.f24221s;
        if (iMo11726t == 0) {
            int size = size();
            iMo11726t = mo11726t(size, 0, size);
            if (iMo11726t == 0) {
                iMo11726t = 1;
            }
            this.f24221s = iMo11726t;
        }
        return iMo11726t;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo11720k(byte[] bArr, int i2, int i3, int i4);

    /* JADX INFO: renamed from: m */
    public abstract int mo11721m();

    /* JADX INFO: renamed from: n */
    public abstract byte mo11722n(int i2);

    /* JADX INFO: renamed from: q */
    public abstract boolean mo11723q();

    /* JADX INFO: renamed from: r */
    public abstract boolean mo11724r();

    /* JADX INFO: renamed from: s */
    public abstract AbstractC6261s mo11725s();

    public abstract int size();

    /* JADX INFO: renamed from: t */
    public abstract int mo11726t(int i2, int i3, int i4);

    public final String toString() {
        String strM11795r;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strM11795r = AbstractC6188N0.m11795r(this);
        } else {
            strM11795r = AbstractC6188N0.m11795r(mo11728v(0, 47)) + "...";
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return AbstractC0271e0.m403k(sb, strM11795r, "\">");
    }

    /* JADX INFO: renamed from: u */
    public abstract int mo11727u(int i2, int i3, int i4);

    /* JADX INFO: renamed from: v */
    public abstract AbstractC6251n mo11728v(int i2, int i3);

    /* JADX INFO: renamed from: w */
    public final byte[] m11897w() {
        int size = size();
        if (size == 0) {
            return AbstractC6213a0.f24135b;
        }
        byte[] bArr = new byte[size];
        mo11720k(bArr, 0, 0, size);
        return bArr;
    }

    /* JADX INFO: renamed from: x */
    public abstract String mo11729x(Charset charset);

    /* JADX INFO: renamed from: y */
    public final String m11898y() {
        return size() == 0 ? "" : mo11729x(AbstractC6213a0.f24134a);
    }

    /* JADX INFO: renamed from: z */
    public abstract void mo11730z(AbstractC6269w abstractC6269w);
}
