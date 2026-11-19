package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzidu extends zzidc {

    /* JADX INFO: renamed from: b */
    public static final boolean f19750b = zzihk.f19906d;

    /* JADX INFO: renamed from: a */
    public Object f19751a;

    private zzidu() {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static int m8280b(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: c */
    public static int m8281c(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: d */
    public final void m8282d() {
        if (mo8272z() > 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        if (mo8272z() < 0) {
            throw new IllegalStateException("Wrote more data than expected.");
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo8251e(int i2, int i3);

    /* JADX INFO: renamed from: f */
    public abstract void mo8252f(int i2, int i3);

    /* JADX INFO: renamed from: g */
    public abstract void mo8253g(int i2, int i3);

    /* JADX INFO: renamed from: h */
    public abstract void mo8254h(int i2, int i3);

    /* JADX INFO: renamed from: i */
    public abstract void mo8255i(int i2, long j2);

    /* JADX INFO: renamed from: j */
    public abstract void mo8256j(int i2, long j2);

    /* JADX INFO: renamed from: k */
    public abstract void mo8257k(int i2, boolean z);

    /* JADX INFO: renamed from: l */
    public abstract void mo8258l(int i2, String str);

    /* JADX INFO: renamed from: m */
    public abstract void mo8259m(int i2, zzidl zzidlVar);

    /* JADX INFO: renamed from: n */
    public abstract void mo8260n(zzidl zzidlVar);

    /* JADX INFO: renamed from: o */
    public abstract void mo8261o(int i2, byte[] bArr);

    /* JADX INFO: renamed from: p */
    public abstract void mo8262p(int i2, zzifz zzifzVar);

    /* JADX INFO: renamed from: q */
    public abstract void mo8263q(int i2, zzidl zzidlVar);

    /* JADX INFO: renamed from: r */
    public abstract void mo8264r(zzifz zzifzVar);

    /* JADX INFO: renamed from: s */
    public abstract void mo8265s(byte b);

    /* JADX INFO: renamed from: t */
    public abstract void mo8266t(int i2);

    /* JADX INFO: renamed from: u */
    public abstract void mo8267u(int i2);

    /* JADX INFO: renamed from: v */
    public abstract void mo8268v(int i2);

    /* JADX INFO: renamed from: w */
    public abstract void mo8269w(long j2);

    /* JADX INFO: renamed from: x */
    public abstract void mo8270x(long j2);

    /* JADX INFO: renamed from: y */
    public abstract void mo8271y(String str);

    /* JADX INFO: renamed from: z */
    public abstract int mo8272z();
}
