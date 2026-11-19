package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzidl implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: t */
    public static final zzidl f19719t = new zzidj(zzifc.f19794a);

    /* JADX INFO: renamed from: s */
    public int f19720s = 0;

    static {
        int i2 = zzicy.f19697a;
    }

    /* JADX INFO: renamed from: B */
    public static zzidl m8145B(ArrayList arrayList) {
        int size;
        if (arrayList == null) {
            int size2 = arrayList.size();
            size = 0;
            int i2 = 0;
            while (i2 < size2) {
                arrayList.get(i2);
                i2++;
                size++;
            }
        } else {
            size = arrayList.size();
        }
        return size == 0 ? f19719t : m8148s(arrayList.iterator(), size);
    }

    /* JADX INFO: renamed from: b */
    public static int m8146b(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(AbstractC1456a.m2448o(new StringBuilder(String.valueOf(i2).length() + 21), "Beginning index: ", i2, " < 0"));
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException(AbstractC1456a.m2449p(new StringBuilder(String.valueOf(i2).length() + 44 + String.valueOf(i3).length()), "Beginning index larger than ending index: ", i2, ", ", i3));
        }
        throw new IndexOutOfBoundsException(AbstractC1456a.m2449p(new StringBuilder(String.valueOf(i3).length() + 15 + String.valueOf(i4).length()), "End index: ", i3, " >= ", i4));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m8147d(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        int i5 = i2 + i4;
        m8146b(i2, i5, bArr.length);
        m8146b(i3, i4 + i3, bArr2.length);
        while (i2 < i5) {
            if (bArr[i2] != bArr2[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public static zzidl m8148s(Iterator it, int i2) {
        if (i2 <= 0) {
            Locale locale = Locale.ROOT;
            throw new IllegalArgumentException(AbstractC0271e0.m397e(i2, "length (", ") must be >= 1"));
        }
        if (i2 == 1) {
            return (zzidl) it.next();
        }
        int i3 = i2 >>> 1;
        zzidl zzidlVarM8148s = m8148s(it, i3);
        zzidl zzidlVarM8148s2 = m8148s(it, i2 - i3);
        if (Integer.MAX_VALUE - zzidlVarM8148s.mo8132h() < zzidlVarM8148s2.mo8132h()) {
            int iMo8132h = zzidlVarM8148s.mo8132h();
            int iMo8132h2 = zzidlVarM8148s2.mo8132h();
            throw new IllegalArgumentException(AbstractC1456a.m2449p(new StringBuilder(String.valueOf(iMo8132h).length() + 31 + String.valueOf(iMo8132h2).length()), "ByteString would be too long: ", iMo8132h, "+", iMo8132h2));
        }
        if (zzidlVarM8148s2.mo8132h() == 0) {
            return zzidlVarM8148s;
        }
        if (zzidlVarM8148s.mo8132h() == 0) {
            return zzidlVarM8148s2;
        }
        int iMo8132h3 = zzidlVarM8148s2.mo8132h() + zzidlVarM8148s.mo8132h();
        zzidl zzidjVar = f19719t;
        if (iMo8132h3 < 128) {
            int iMo8132h4 = zzidlVarM8148s.mo8132h();
            int iMo8132h5 = zzidlVarM8148s2.mo8132h();
            int i4 = iMo8132h4 + iMo8132h5;
            byte[] bArr = new byte[i4];
            m8146b(0, iMo8132h4, zzidlVarM8148s.mo8132h());
            m8146b(0, iMo8132h4, i4);
            if (iMo8132h4 > 0) {
                zzidlVarM8148s.mo8135m(0, bArr, 0, iMo8132h4);
            }
            m8146b(0, iMo8132h5, zzidlVarM8148s2.mo8132h());
            m8146b(iMo8132h4, i4, i4);
            if (iMo8132h5 > 0) {
                zzidlVarM8148s2.mo8135m(0, bArr, iMo8132h4, iMo8132h5);
            }
            if (i4 == 0) {
                return zzidjVar;
            }
            try {
                return new zzidj(bArr);
            } catch (zzifh e) {
                throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
            }
        }
        if (zzidlVarM8148s instanceof zzigq) {
            zzigq zzigqVar = (zzigq) zzidlVarM8148s;
            zzidl zzidlVar = zzigqVar.f19877v;
            zzidl zzidlVar2 = zzigqVar.f19878w;
            if (zzidlVarM8148s2.mo8132h() + zzidlVar2.mo8132h() < 128) {
                int iMo8132h6 = zzidlVar2.mo8132h();
                int iMo8132h7 = zzidlVarM8148s2.mo8132h();
                int i5 = iMo8132h6 + iMo8132h7;
                byte[] bArr2 = new byte[i5];
                m8146b(0, iMo8132h6, zzidlVar2.mo8132h());
                m8146b(0, iMo8132h6, i5);
                if (iMo8132h6 > 0) {
                    zzidlVar2.mo8135m(0, bArr2, 0, iMo8132h6);
                }
                m8146b(0, iMo8132h7, zzidlVarM8148s2.mo8132h());
                m8146b(iMo8132h6, i5, i5);
                if (iMo8132h7 > 0) {
                    zzidlVarM8148s2.mo8135m(0, bArr2, iMo8132h6, iMo8132h7);
                }
                if (i5 != 0) {
                    try {
                        zzidjVar = new zzidj(bArr2);
                    } catch (zzifh e2) {
                        throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
                    }
                }
                return new zzigq(zzidlVar, zzidjVar);
            }
            if (zzidlVar.mo8141v() > zzidlVar2.mo8141v() && zzigqVar.f19880y > zzidlVarM8148s2.mo8141v()) {
                return new zzigq(zzidlVar, new zzigq(zzidlVar2, zzidlVarM8148s2));
            }
        }
        if (iMo8132h3 >= zzigq.m8417C(Math.max(zzidlVarM8148s.mo8141v(), zzidlVarM8148s2.mo8141v()) + 1)) {
            return new zzigq(zzidlVarM8148s, zzidlVarM8148s2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        zzigo.m8415a(zzidlVarM8148s, arrayDeque);
        zzigo.m8415a(zzidlVarM8148s2, arrayDeque);
        zzidl zzigqVar2 = (zzidl) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            zzigqVar2 = new zzigq((zzidl) arrayDeque.pop(), zzigqVar2);
        }
        return zzigqVar2;
    }

    /* JADX INFO: renamed from: y */
    public static zzidl m8149y(byte[] bArr, int i2, int i3) {
        try {
            return m8150z(bArr, i2, i3);
        } catch (zzifh e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    /* JADX INFO: renamed from: z */
    public static zzidl m8150z(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return f19719t;
        }
        m8146b(i2, i2 + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new zzidj(bArr2);
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m8151a() {
        int iMo8132h = mo8132h();
        if (iMo8132h == 0) {
            return zzifc.f19794a;
        }
        byte[] bArr = new byte[iMo8132h];
        mo8135m(0, bArr, 0, iMo8132h);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzidl)) {
            return false;
        }
        zzidl zzidlVar = (zzidl) obj;
        int iMo8132h = mo8132h();
        if (iMo8132h != zzidlVar.mo8132h()) {
            return false;
        }
        if (iMo8132h == 0) {
            return true;
        }
        int i2 = this.f19720s;
        int i3 = zzidlVar.f19720s;
        if (i2 == 0 || i3 == 0 || i2 == i3) {
            return mo8138r(zzidlVar);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public abstract byte mo8131g(int i2);

    /* JADX INFO: renamed from: h */
    public abstract int mo8132h();

    public final int hashCode() {
        int iMo8139t = this.f19720s;
        if (iMo8139t == 0) {
            int iMo8132h = mo8132h();
            iMo8139t = mo8139t(iMo8132h, 0, iMo8132h);
            if (iMo8139t == 0) {
                iMo8139t = 1;
            }
            this.f19720s = iMo8139t;
        }
        return iMo8139t;
    }

    /* JADX INFO: renamed from: j */
    public abstract zzidl mo8133j(int i2, int i3);

    /* JADX INFO: renamed from: k */
    public abstract zzidl mo8134k(int i2, int i3);

    /* JADX INFO: renamed from: m */
    public abstract void mo8135m(int i2, byte[] bArr, int i3, int i4);

    /* JADX INFO: renamed from: n */
    public abstract ByteBuffer mo8136n();

    /* JADX INFO: renamed from: q */
    public abstract void mo8137q(zzidu zziduVar);

    /* JADX INFO: renamed from: r */
    public abstract boolean mo8138r(zzidl zzidlVar);

    /* JADX INFO: renamed from: t */
    public abstract int mo8139t(int i2, int i3, int i4);

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iMo8132h = mo8132h();
        String strM8442a = mo8132h() <= 50 ? zzigz.m8442a(m8151a()) : zzigz.m8442a(mo8134k(0, 47).m8151a()).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iMo8132h);
        sb.append(" contents=\"");
        return AbstractC0271e0.m403k(sb, strM8442a, "\">");
    }

    /* JADX INFO: renamed from: u */
    public abstract zzidp mo8140u();

    /* JADX INFO: renamed from: v */
    public abstract int mo8141v();

    /* JADX INFO: renamed from: w */
    public abstract boolean mo8142w();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public zzidg iterator() {
        return new zzidd(this);
    }
}
