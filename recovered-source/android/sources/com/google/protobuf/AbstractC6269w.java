package com.google.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.protobuf.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6269w extends AbstractC6188N0 {

    /* JADX INFO: renamed from: d */
    public static final Logger f24289d = Logger.getLogger(AbstractC6269w.class.getName());

    /* JADX INFO: renamed from: e */
    public static final boolean f24290e = AbstractC6223d1.f24166e;

    /* JADX INFO: renamed from: c */
    public C6243k0 f24291c;

    /* JADX INFO: renamed from: A */
    public static int m12066A(AbstractC6251n abstractC6251n) {
        int size = abstractC6251n.size();
        return m12070E(size) + size;
    }

    /* JADX INFO: renamed from: B */
    public static int m12067B(int i2) {
        if (i2 >= 0) {
            return m12070E(i2);
        }
        return 10;
    }

    /* JADX INFO: renamed from: C */
    public static int m12068C(String str) {
        int length;
        try {
            length = AbstractC6232g1.m11884c(str);
        } catch (C6229f1 unused) {
            length = str.getBytes(AbstractC6213a0.f24134a).length;
        }
        return m12070E(length) + length;
    }

    /* JADX INFO: renamed from: D */
    public static int m12069D(int i2) {
        return m12070E(i2 << 3);
    }

    /* JADX INFO: renamed from: E */
    public static int m12070E(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: F */
    public static int m12071F(long j2) {
        int i2;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            j2 >>>= 28;
            i2 = 6;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i2 + 1 : i2;
    }

    /* JADX INFO: renamed from: z */
    public static int m12072z(int i2, AbstractC6251n abstractC6251n) {
        return m12066A(abstractC6251n) + m12069D(i2);
    }

    /* JADX INFO: renamed from: G */
    public final void m12073G(String str, C6229f1 c6229f1) throws CodedOutputStream$OutOfSpaceException {
        f24289d.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c6229f1);
        byte[] bytes = str.getBytes(AbstractC6213a0.f24134a);
        try {
            mo12013Y(bytes.length);
            mo11805y(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(e);
        }
    }

    /* JADX INFO: renamed from: H */
    public abstract void mo11996H(byte b);

    /* JADX INFO: renamed from: I */
    public abstract void mo11997I(int i2, boolean z);

    /* JADX INFO: renamed from: J */
    public abstract void mo11998J(int i2, byte[] bArr);

    /* JADX INFO: renamed from: K */
    public abstract void mo11999K(int i2, AbstractC6251n abstractC6251n);

    /* JADX INFO: renamed from: L */
    public abstract void mo12000L(AbstractC6251n abstractC6251n);

    /* JADX INFO: renamed from: M */
    public abstract void mo12001M(int i2, int i3);

    /* JADX INFO: renamed from: N */
    public abstract void mo12002N(int i2);

    /* JADX INFO: renamed from: O */
    public abstract void mo12003O(int i2, long j2);

    /* JADX INFO: renamed from: P */
    public abstract void mo12004P(long j2);

    /* JADX INFO: renamed from: Q */
    public abstract void mo12005Q(int i2, int i3);

    /* JADX INFO: renamed from: R */
    public abstract void mo12006R(int i2);

    /* JADX INFO: renamed from: S */
    public abstract void mo12007S(int i2, InterfaceC6262s0 interfaceC6262s0, InterfaceC6178I0 interfaceC6178I0);

    /* JADX INFO: renamed from: T */
    public abstract void mo12008T(InterfaceC6262s0 interfaceC6262s0);

    /* JADX INFO: renamed from: U */
    public abstract void mo12009U(int i2, String str);

    /* JADX INFO: renamed from: V */
    public abstract void mo12010V(String str);

    /* JADX INFO: renamed from: W */
    public abstract void mo12011W(int i2, int i3);

    /* JADX INFO: renamed from: X */
    public abstract void mo12012X(int i2, int i3);

    /* JADX INFO: renamed from: Y */
    public abstract void mo12013Y(int i2);

    /* JADX INFO: renamed from: Z */
    public abstract void mo12014Z(int i2, long j2);

    /* JADX INFO: renamed from: a0 */
    public abstract void mo12015a0(long j2);
}
