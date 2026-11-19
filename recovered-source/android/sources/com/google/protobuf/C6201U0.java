package com.google.protobuf;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.protobuf.U0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6201U0 {

    /* JADX INFO: renamed from: f */
    public static final C6201U0 f24124f = new C6201U0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f24125a;

    /* JADX INFO: renamed from: b */
    public int[] f24126b;

    /* JADX INFO: renamed from: c */
    public Object[] f24127c;

    /* JADX INFO: renamed from: d */
    public int f24128d;

    /* JADX INFO: renamed from: e */
    public boolean f24129e;

    public C6201U0() {
        this(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: e */
    public static C6201U0 m11823e(C6201U0 c6201u0, C6201U0 c6201u1) {
        int i2 = c6201u0.f24125a + c6201u1.f24125a;
        int[] iArrCopyOf = Arrays.copyOf(c6201u0.f24126b, i2);
        System.arraycopy(c6201u1.f24126b, 0, iArrCopyOf, c6201u0.f24125a, c6201u1.f24125a);
        Object[] objArrCopyOf = Arrays.copyOf(c6201u0.f24127c, i2);
        System.arraycopy(c6201u1.f24127c, 0, objArrCopyOf, c6201u0.f24125a, c6201u1.f24125a);
        return new C6201U0(i2, iArrCopyOf, objArrCopyOf, true);
    }

    /* JADX INFO: renamed from: a */
    public final void m11824a() {
        if (!this.f24129e) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11825b(int i2) {
        int[] iArr = this.f24126b;
        if (i2 > iArr.length) {
            int i3 = this.f24125a;
            int i4 = (i3 / 2) + i3;
            if (i4 >= i2) {
                i2 = i4;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.f24126b = Arrays.copyOf(iArr, i2);
            this.f24127c = Arrays.copyOf(this.f24127c, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m11826c() {
        int iM12069D;
        int iM12071F;
        int iM12069D2;
        int i2 = this.f24128d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f24125a; i4++) {
            int i5 = this.f24126b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 == 1) {
                    ((Long) this.f24127c[i4]).getClass();
                    iM12069D2 = AbstractC6269w.m12069D(i6) + 8;
                } else if (i7 == 2) {
                    iM12069D2 = AbstractC6269w.m12072z(i6, (AbstractC6251n) this.f24127c[i4]);
                } else if (i7 == 3) {
                    iM12069D = AbstractC6269w.m12069D(i6) * 2;
                    iM12071F = ((C6201U0) this.f24127c[i4]).m11826c();
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.m11740d());
                    }
                    ((Integer) this.f24127c[i4]).getClass();
                    iM12069D2 = AbstractC6269w.m12069D(i6) + 4;
                }
                i3 = iM12069D2 + i3;
            } else {
                long jLongValue = ((Long) this.f24127c[i4]).longValue();
                iM12069D = AbstractC6269w.m12069D(i6);
                iM12071F = AbstractC6269w.m12071F(jLongValue);
            }
            i3 = iM12071F + iM12069D + i3;
        }
        this.f24128d = i3;
        return i3;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m11827d(int i2, AbstractC6261s abstractC6261s) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo11932z;
        m11824a();
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            m11828f(i2, Long.valueOf(abstractC6261s.mo11925r()));
            return true;
        }
        if (i4 == 1) {
            m11828f(i2, Long.valueOf(abstractC6261s.mo11922o()));
            return true;
        }
        if (i4 == 2) {
            m11828f(i2, abstractC6261s.mo11918k());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw InvalidProtocolBufferException.m11740d();
            }
            m11828f(i2, Integer.valueOf(abstractC6261s.mo11921n()));
            return true;
        }
        C6201U0 c6201u0 = new C6201U0();
        do {
            iMo11932z = abstractC6261s.mo11932z();
            if (iMo11932z == 0) {
                break;
            }
        } while (c6201u0.m11827d(iMo11932z, abstractC6261s));
        abstractC6261s.mo11912a((i3 << 3) | 4);
        m11828f(i2, c6201u0);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C6201U0)) {
            return false;
        }
        C6201U0 c6201u0 = (C6201U0) obj;
        int i2 = this.f24125a;
        if (i2 == c6201u0.f24125a) {
            int[] iArr = this.f24126b;
            int[] iArr2 = c6201u0.f24126b;
            for (int i3 = 0; i3 < i2; i3++) {
                if (iArr[i3] == iArr2[i3]) {
                }
            }
            Object[] objArr = this.f24127c;
            Object[] objArr2 = c6201u0.f24127c;
            int i4 = this.f24125a;
            for (int i5 = 0; i5 < i4; i5++) {
                if (objArr[i5].equals(objArr2[i5])) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m11828f(int i2, Object obj) {
        m11824a();
        m11825b(this.f24125a + 1);
        int[] iArr = this.f24126b;
        int i3 = this.f24125a;
        iArr[i3] = i2;
        this.f24127c[i3] = obj;
        this.f24125a = i3 + 1;
    }

    /* JADX INFO: renamed from: g */
    public final void m11829g(C6243k0 c6243k0) {
        if (this.f24125a == 0) {
            return;
        }
        c6243k0.getClass();
        AbstractC6269w abstractC6269w = (AbstractC6269w) c6243k0.f24193a;
        for (int i2 = 0; i2 < this.f24125a; i2++) {
            int i3 = this.f24126b[i2];
            Object obj = this.f24127c[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                abstractC6269w.mo12014Z(i4, ((Long) obj).longValue());
            } else if (i5 == 1) {
                abstractC6269w.mo12003O(i4, ((Long) obj).longValue());
            } else if (i5 == 2) {
                abstractC6269w.mo11999K(i4, (AbstractC6251n) obj);
            } else if (i5 == 3) {
                abstractC6269w.mo12011W(i4, 3);
                ((C6201U0) obj).m11829g(c6243k0);
                abstractC6269w.mo12011W(i4, 4);
            } else {
                if (i5 != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.m11740d());
                }
                abstractC6269w.mo12001M(i4, ((Integer) obj).intValue());
            }
        }
    }

    public final int hashCode() {
        int i2 = this.f24125a;
        int i3 = (527 + i2) * 31;
        int[] iArr = this.f24126b;
        int iHashCode = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i3 + i4) * 31;
        Object[] objArr = this.f24127c;
        int i7 = this.f24125a;
        for (int i8 = 0; i8 < i7; i8++) {
            iHashCode = (iHashCode * 31) + objArr[i8].hashCode();
        }
        return i6 + iHashCode;
    }

    public C6201U0(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f24128d = -1;
        this.f24125a = i2;
        this.f24126b = iArr;
        this.f24127c = objArr;
        this.f24129e = z;
    }
}
