package com.google.protobuf;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.protobuf.H0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6176H0 extends AbstractC6251n {

    /* JADX INFO: renamed from: A */
    public static final int[] f24081A = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: v */
    public final int f24082v;

    /* JADX INFO: renamed from: w */
    public final AbstractC6251n f24083w;

    /* JADX INFO: renamed from: x */
    public final AbstractC6251n f24084x;

    /* JADX INFO: renamed from: y */
    public final int f24085y;

    /* JADX INFO: renamed from: z */
    public final int f24086z;

    public C6176H0(AbstractC6251n abstractC6251n, AbstractC6251n abstractC6251n2) {
        this.f24083w = abstractC6251n;
        this.f24084x = abstractC6251n2;
        int size = abstractC6251n.size();
        this.f24085y = size;
        this.f24082v = abstractC6251n2.size() + size;
        this.f24086z = Math.max(abstractC6251n.mo11721m(), abstractC6251n2.mo11721m()) + 1;
    }

    /* JADX INFO: renamed from: B */
    public static int m11717B(int i2) {
        if (i2 >= 47) {
            return Integer.MAX_VALUE;
        }
        return f24081A[i2];
    }

    @Override // com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: a */
    public final ByteBuffer mo11718a() {
        return ByteBuffer.wrap(m11897w()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: d */
    public final byte mo11719d(int i2) {
        AbstractC6251n.m11894g(i2, this.f24082v);
        return mo11722n(i2);
    }

    @Override // com.google.protobuf.AbstractC6251n
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6251n) {
            AbstractC6251n abstractC6251n = (AbstractC6251n) obj;
            int size = abstractC6251n.size();
            int i2 = this.f24082v;
            if (i2 == size) {
                if (i2 == 0) {
                    return true;
                }
                int i3 = this.f24221s;
                int i4 = abstractC6251n.f24221s;
                if (i3 == 0 || i4 == 0 || i3 == i4) {
                    C6174G0 c6174g0 = new C6174G0(this);
                    C6248m c6248mM11716a = c6174g0.next();
                    C6174G0 c6174g1 = new C6174G0(abstractC6251n);
                    C6248m c6248mM11716a2 = c6174g1.next();
                    int i5 = 0;
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        int size2 = c6248mM11716a.size() - i5;
                        int size3 = c6248mM11716a2.size() - i6;
                        int iMin = Math.min(size2, size3);
                        if (!(i5 == 0 ? c6248mM11716a.m11892B(c6248mM11716a2, i6, iMin) : c6248mM11716a2.m11892B(c6248mM11716a, i5, iMin))) {
                            break;
                        }
                        i7 += iMin;
                        if (i7 >= i2) {
                            if (i7 == i2) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == size2) {
                            c6248mM11716a = c6174g0.next();
                            i5 = 0;
                        } else {
                            i5 += iMin;
                        }
                        if (iMin == size3) {
                            c6248mM11716a2 = c6174g1.next();
                            i6 = 0;
                        } else {
                            i6 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6172F0(this);
    }

    @Override // com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: k */
    public final void mo11720k(byte[] bArr, int i2, int i3, int i4) {
        int i5 = i2 + i4;
        AbstractC6251n abstractC6251n = this.f24083w;
        int i6 = this.f24085y;
        if (i5 <= i6) {
            abstractC6251n.mo11720k(bArr, i2, i3, i4);
            return;
        }
        AbstractC6251n abstractC6251n2 = this.f24084x;
        if (i2 >= i6) {
            abstractC6251n2.mo11720k(bArr, i2 - i6, i3, i4);
            return;
        }
        int i7 = i6 - i2;
        abstractC6251n.mo11720k(bArr, i2, i3, i7);
        abstractC6251n2.mo11720k(bArr, 0, i3 + i7, i4 - i7);
    }

    @Override // com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: m */
    public final int mo11721m() {
        return this.f24086z;
    }

    @Override // com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: n */
    public final byte mo11722n(int i2) {
        int i3 = this.f24085y;
        return i2 < i3 ? this.f24083w.mo11722n(i2) : this.f24084x.mo11722n(i2 - i3);
    }

    @Override // com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: q */
    public final boolean mo11723q() {
        return this.f24082v >= m11717B(this.f24086z);
    }

    @Override // com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: r */
    public final boolean mo11724r() {
        int iMo11727u = this.f24083w.mo11727u(0, 0, this.f24085y);
        AbstractC6251n abstractC6251n = this.f24084x;
        return abstractC6251n.mo11727u(iMo11727u, 0, abstractC6251n.size()) == 0;
    }

    @Override // com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: s */
    public final AbstractC6261s mo11725s() {
        C6248m c6248m;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.f24086z);
        arrayDeque.push(this);
        AbstractC6251n abstractC6251n = this.f24083w;
        while (abstractC6251n instanceof C6176H0) {
            C6176H0 c6176h0 = (C6176H0) abstractC6251n;
            arrayDeque.push(c6176h0);
            abstractC6251n = c6176h0.f24083w;
        }
        C6248m c6248m2 = (C6248m) abstractC6251n;
        while (true) {
            if (!(c6248m2 != null)) {
                int size = arrayList.size();
                int i2 = 0;
                int iRemaining = 0;
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ByteBuffer byteBuffer = (ByteBuffer) obj;
                    iRemaining += byteBuffer.remaining();
                    if (byteBuffer.hasArray()) {
                        i2 |= 1;
                    } else {
                        i2 = byteBuffer.isDirect() ? i2 | 2 : i2 | 4;
                    }
                }
                if (i2 == 2) {
                    return new C6255p(arrayList, iRemaining);
                }
                C6216b0 c6216b0 = new C6216b0();
                c6216b0.f24139s = arrayList.iterator();
                c6216b0.f24141u = 0;
                int size2 = arrayList.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    c6216b0.f24141u++;
                }
                c6216b0.f24142v = -1;
                if (!c6216b0.m11846c()) {
                    c6216b0.f24140t = AbstractC6213a0.f24136c;
                    c6216b0.f24142v = 0;
                    c6216b0.f24143w = 0;
                    c6216b0.f24138A = 0L;
                }
                return AbstractC6261s.m11967g(c6216b0);
            }
            if (c6248m2 == null) {
                throw new NoSuchElementException();
            }
            do {
                if (arrayDeque.isEmpty()) {
                    c6248m = null;
                    break;
                }
                AbstractC6251n abstractC6251n2 = ((C6176H0) arrayDeque.pop()).f24084x;
                while (abstractC6251n2 instanceof C6176H0) {
                    C6176H0 c6176h1 = (C6176H0) abstractC6251n2;
                    arrayDeque.push(c6176h1);
                    abstractC6251n2 = c6176h1.f24083w;
                }
                c6248m = (C6248m) abstractC6251n2;
            } while (c6248m.isEmpty());
            arrayList.add(c6248m2.mo11718a());
            c6248m2 = c6248m;
        }
    }

    @Override // com.google.protobuf.AbstractC6251n
    public final int size() {
        return this.f24082v;
    }

    @Override // com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: t */
    public final int mo11726t(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        AbstractC6251n abstractC6251n = this.f24083w;
        int i6 = this.f24085y;
        if (i5 <= i6) {
            return abstractC6251n.mo11726t(i2, i3, i4);
        }
        AbstractC6251n abstractC6251n2 = this.f24084x;
        if (i3 >= i6) {
            return abstractC6251n2.mo11726t(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return abstractC6251n2.mo11726t(abstractC6251n.mo11726t(i2, i3, i7), 0, i4 - i7);
    }

    @Override // com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: u */
    public final int mo11727u(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        AbstractC6251n abstractC6251n = this.f24083w;
        int i6 = this.f24085y;
        if (i5 <= i6) {
            return abstractC6251n.mo11727u(i2, i3, i4);
        }
        AbstractC6251n abstractC6251n2 = this.f24084x;
        if (i3 >= i6) {
            return abstractC6251n2.mo11727u(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return abstractC6251n2.mo11727u(abstractC6251n.mo11727u(i2, i3, i7), 0, i4 - i7);
    }

    @Override // com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: v */
    public final AbstractC6251n mo11728v(int i2, int i3) {
        int i4 = this.f24082v;
        int iM11895h = AbstractC6251n.m11895h(i2, i3, i4);
        if (iM11895h == 0) {
            return AbstractC6251n.f24219t;
        }
        if (iM11895h == i4) {
            return this;
        }
        AbstractC6251n abstractC6251n = this.f24083w;
        int i5 = this.f24085y;
        if (i3 <= i5) {
            return abstractC6251n.mo11728v(i2, i3);
        }
        AbstractC6251n abstractC6251n2 = this.f24084x;
        return i2 >= i5 ? abstractC6251n2.mo11728v(i2 - i5, i3 - i5) : new C6176H0(abstractC6251n.mo11728v(i2, abstractC6251n.size()), abstractC6251n2.mo11728v(0, i3 - i5));
    }

    @Override // com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: x */
    public final String mo11729x(Charset charset) {
        return new String(m11897w(), charset);
    }

    @Override // com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: z */
    public final void mo11730z(AbstractC6269w abstractC6269w) {
        this.f24083w.mo11730z(abstractC6269w);
        this.f24084x.mo11730z(abstractC6269w);
    }
}
