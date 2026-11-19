package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzada extends zzacj {

    /* JADX INFO: renamed from: b */
    public static final boolean f22004b = zzagg.f22131d;

    /* JADX INFO: renamed from: a */
    public Object f22005a;

    private zzada() {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static int m9510b(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: c */
    public static int m9511c(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: d */
    public final void m9512d() {
        if (mo9502z() > 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        if (mo9502z() < 0) {
            throw new IllegalStateException("Wrote more data than expected.");
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo9481e(int i2, int i3);

    /* JADX INFO: renamed from: f */
    public abstract void mo9482f(int i2, int i3);

    /* JADX INFO: renamed from: g */
    public abstract void mo9483g(int i2, int i3);

    /* JADX INFO: renamed from: h */
    public abstract void mo9484h(int i2, int i3);

    /* JADX INFO: renamed from: i */
    public abstract void mo9485i(int i2, long j2);

    /* JADX INFO: renamed from: j */
    public abstract void mo9486j(int i2, long j2);

    /* JADX INFO: renamed from: k */
    public abstract void mo9487k(int i2, boolean z);

    /* JADX INFO: renamed from: l */
    public abstract void mo9488l(int i2, String str);

    /* JADX INFO: renamed from: m */
    public abstract void mo9489m(int i2, zzacr zzacrVar);

    /* JADX INFO: renamed from: n */
    public abstract void mo9490n(zzacr zzacrVar);

    /* JADX INFO: renamed from: o */
    public abstract void mo9491o(int i2, byte[] bArr);

    /* JADX INFO: renamed from: p */
    public abstract void mo9492p(int i2, zzafc zzafcVar);

    /* JADX INFO: renamed from: q */
    public abstract void mo9493q(int i2, zzacr zzacrVar);

    /* JADX INFO: renamed from: r */
    public abstract void mo9494r(zzafc zzafcVar);

    /* JADX INFO: renamed from: s */
    public abstract void mo9495s(byte b);

    /* JADX INFO: renamed from: t */
    public abstract void mo9496t(int i2);

    /* JADX INFO: renamed from: u */
    public abstract void mo9497u(int i2);

    /* JADX INFO: renamed from: v */
    public abstract void mo9498v(int i2);

    /* JADX INFO: renamed from: w */
    public abstract void mo9499w(long j2);

    /* JADX INFO: renamed from: x */
    public abstract void mo9500x(long j2);

    /* JADX INFO: renamed from: y */
    public abstract void mo9501y(String str);

    /* JADX INFO: renamed from: z */
    public abstract int mo9502z();
}
