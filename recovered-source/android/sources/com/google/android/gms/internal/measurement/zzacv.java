package com.google.android.gms.internal.measurement;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzacv {

    /* JADX INFO: renamed from: a */
    public int f21988a;

    /* JADX INFO: renamed from: b */
    public int f21989b;

    /* JADX INFO: renamed from: c */
    public Object f21990c;

    private zzacv() {
    }

    /* JADX INFO: renamed from: h */
    public static zzacv m9430h(int i2, InputStream inputStream) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        }
        if (inputStream != null) {
            return new zzacu(inputStream, i2);
        }
        zzact zzactVar = new zzact(zzaed.f22038a);
        try {
            zzactVar.mo9399a(0);
            return zzactVar;
        } catch (zzaeh e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m9431j(int i2) {
        return (i2 >>> 1) ^ (-(i2 & 1));
    }

    /* JADX INFO: renamed from: k */
    public static long m9432k(long j2) {
        return (j2 >>> 1) ^ (-(1 & j2));
    }

    /* JADX INFO: renamed from: A */
    public abstract int mo9384A();

    /* JADX INFO: renamed from: B */
    public abstract int mo9385B();

    /* JADX INFO: renamed from: C */
    public abstract int mo9386C();

    /* JADX INFO: renamed from: D */
    public abstract long mo9387D();

    /* JADX INFO: renamed from: E */
    public abstract int mo9388E();

    /* JADX INFO: renamed from: F */
    public abstract long mo9389F();

    /* JADX INFO: renamed from: G */
    public abstract int mo9390G();

    /* JADX INFO: renamed from: H */
    public abstract long mo9391H();

    /* JADX INFO: renamed from: a */
    public abstract int mo9399a(int i2);

    /* JADX INFO: renamed from: b */
    public abstract void mo9400b(int i2);

    /* JADX INFO: renamed from: c */
    public abstract int mo9401c();

    /* JADX INFO: renamed from: d */
    public abstract boolean mo9402d();

    /* JADX INFO: renamed from: e */
    public abstract int mo9403e();

    /* JADX INFO: renamed from: f */
    public abstract int mo9404f(byte[] bArr, int i2, int i3);

    /* JADX INFO: renamed from: g */
    public abstract void mo9405g(int i2);

    /* JADX INFO: renamed from: i */
    public final void m9433i() {
        boolean zMo9408n;
        do {
            int iMo9406l = mo9406l();
            if (iMo9406l == 0) {
                return;
            }
            int i2 = this.f21988a;
            int i3 = this.f21989b;
            if (i2 + i3 >= 100) {
                throw new zzaeh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f21989b = i3 + 1;
            zMo9408n = mo9408n(iMo9406l);
            this.f21989b--;
        } while (zMo9408n);
    }

    /* JADX INFO: renamed from: l */
    public abstract int mo9406l();

    /* JADX INFO: renamed from: m */
    public abstract void mo9407m(int i2);

    /* JADX INFO: renamed from: n */
    public abstract boolean mo9408n(int i2);

    /* JADX INFO: renamed from: o */
    public abstract double mo9409o();

    /* JADX INFO: renamed from: p */
    public abstract float mo9410p();

    /* JADX INFO: renamed from: q */
    public abstract long mo9411q();

    /* JADX INFO: renamed from: r */
    public abstract long mo9412r();

    /* JADX INFO: renamed from: s */
    public abstract int mo9413s();

    /* JADX INFO: renamed from: t */
    public abstract long mo9414t();

    /* JADX INFO: renamed from: u */
    public abstract int mo9415u();

    /* JADX INFO: renamed from: v */
    public abstract boolean mo9416v();

    /* JADX INFO: renamed from: w */
    public abstract String mo9417w();

    /* JADX INFO: renamed from: x */
    public abstract String mo9418x();

    /* JADX INFO: renamed from: y */
    public abstract zzacr mo9419y();

    /* JADX INFO: renamed from: z */
    public abstract byte[] mo9420z();
}
