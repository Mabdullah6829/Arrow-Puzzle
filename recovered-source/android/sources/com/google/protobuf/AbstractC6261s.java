package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.google.protobuf.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6261s {

    /* JADX INFO: renamed from: a */
    public int f24259a;

    /* JADX INFO: renamed from: b */
    public int f24260b = 100;

    /* JADX INFO: renamed from: c */
    public C6263t f24261c;

    /* JADX INFO: renamed from: b */
    public static int m11964b(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    /* JADX INFO: renamed from: c */
    public static long m11965c(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    /* JADX INFO: renamed from: f */
    public static C6253o m11966f(byte[] bArr, int i2, int i3, boolean z) {
        C6253o c6253o = new C6253o(bArr, i2, i3, z);
        try {
            c6253o.mo11916i(i3);
            return c6253o;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC6261s m11967g(InputStream inputStream) {
        if (inputStream != null) {
            return new C6257q(inputStream);
        }
        byte[] bArr = AbstractC6213a0.f24135b;
        return m11966f(bArr, 0, bArr.length, false);
    }

    /* JADX INFO: renamed from: s */
    public static int m11968s(int i2, InputStream inputStream) throws IOException {
        if ((i2 & 128) == 0) {
            return i2;
        }
        int i3 = i2 & 127;
        int i4 = 7;
        while (i4 < 32) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw InvalidProtocolBufferException.m11744h();
            }
            i3 |= (i5 & 127) << i4;
            if ((i5 & 128) == 0) {
                return i3;
            }
            i4 += 7;
        }
        while (i4 < 64) {
            int i6 = inputStream.read();
            if (i6 == -1) {
                throw InvalidProtocolBufferException.m11744h();
            }
            if ((i6 & 128) == 0) {
                return i3;
            }
            i4 += 7;
        }
        throw InvalidProtocolBufferException.m11741e();
    }

    /* JADX INFO: renamed from: A */
    public abstract int mo11902A();

    /* JADX INFO: renamed from: B */
    public abstract long mo11903B();

    /* JADX INFO: renamed from: C */
    public abstract boolean mo11904C(int i2);

    /* JADX INFO: renamed from: D */
    public final void m11969D() {
        boolean zMo11904C;
        do {
            int iMo11932z = mo11932z();
            if (iMo11932z == 0) {
                return;
            }
            int i2 = this.f24259a;
            if (i2 >= this.f24260b) {
                throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f24259a = i2 + 1;
            zMo11904C = mo11904C(iMo11932z);
            this.f24259a--;
        } while (zMo11904C);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo11912a(int i2);

    /* JADX INFO: renamed from: d */
    public abstract int mo11913d();

    /* JADX INFO: renamed from: e */
    public abstract boolean mo11914e();

    /* JADX INFO: renamed from: h */
    public abstract void mo11915h(int i2);

    /* JADX INFO: renamed from: i */
    public abstract int mo11916i(int i2);

    /* JADX INFO: renamed from: j */
    public abstract boolean mo11917j();

    /* JADX INFO: renamed from: k */
    public abstract C6248m mo11918k();

    /* JADX INFO: renamed from: l */
    public abstract double mo11919l();

    /* JADX INFO: renamed from: m */
    public abstract int mo11920m();

    /* JADX INFO: renamed from: n */
    public abstract int mo11921n();

    /* JADX INFO: renamed from: o */
    public abstract long mo11922o();

    /* JADX INFO: renamed from: p */
    public abstract float mo11923p();

    /* JADX INFO: renamed from: q */
    public abstract int mo11924q();

    /* JADX INFO: renamed from: r */
    public abstract long mo11925r();

    /* JADX INFO: renamed from: t */
    public abstract int mo11926t();

    /* JADX INFO: renamed from: u */
    public abstract long mo11927u();

    /* JADX INFO: renamed from: v */
    public abstract int mo11928v();

    /* JADX INFO: renamed from: w */
    public abstract long mo11929w();

    /* JADX INFO: renamed from: x */
    public abstract String mo11930x();

    /* JADX INFO: renamed from: y */
    public abstract String mo11931y();

    /* JADX INFO: renamed from: z */
    public abstract int mo11932z();
}
