package com.google.android.gms.internal.consent_sdk;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzpv extends zzpe {

    /* JADX INFO: renamed from: b */
    public static final Logger f21720b = Logger.getLogger(zzpv.class.getName());

    /* JADX INFO: renamed from: c */
    public static final boolean f21721c = zzsw.f21827e;

    /* JADX INFO: renamed from: a */
    public Object f21722a;

    private zzpv() {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static int m9183b(String str) {
        int length;
        try {
            length = zzsy.m9298b(str);
        } catch (zzsx unused) {
            length = str.getBytes(zzqs.f21747a).length;
        }
        return m9184c(length) + length;
    }

    /* JADX INFO: renamed from: c */
    public static int m9184c(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: d */
    public static int m9185d(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: e */
    public final void m9186e(String str, zzsx zzsxVar) throws zzps {
        f21720b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzsxVar);
        byte[] bytes = str.getBytes(zzqs.f21747a);
        try {
            int length = bytes.length;
            mo9176v(length);
            mo9147a(length, bytes);
        } catch (IndexOutOfBoundsException e) {
            throw new zzps(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo9160f(byte b);

    /* JADX INFO: renamed from: g */
    public abstract void mo9161g(int i2, boolean z);

    /* JADX INFO: renamed from: h */
    public abstract void mo9162h(int i2, byte[] bArr);

    /* JADX INFO: renamed from: i */
    public abstract void mo9163i(int i2, zzpm zzpmVar);

    /* JADX INFO: renamed from: j */
    public abstract void mo9164j(zzpm zzpmVar);

    /* JADX INFO: renamed from: k */
    public abstract void mo9165k(int i2, int i3);

    /* JADX INFO: renamed from: l */
    public abstract void mo9166l(int i2);

    /* JADX INFO: renamed from: m */
    public abstract void mo9167m(int i2, long j2);

    /* JADX INFO: renamed from: n */
    public abstract void mo9168n(long j2);

    /* JADX INFO: renamed from: o */
    public abstract void mo9169o(int i2, int i3);

    /* JADX INFO: renamed from: p */
    public abstract void mo9170p(int i2);

    /* JADX INFO: renamed from: q */
    public abstract void mo9171q(zzrq zzrqVar);

    /* JADX INFO: renamed from: r */
    public abstract void mo9172r(int i2, String str);

    /* JADX INFO: renamed from: s */
    public abstract void mo9173s(String str);

    /* JADX INFO: renamed from: t */
    public abstract void mo9174t(int i2, int i3);

    /* JADX INFO: renamed from: u */
    public abstract void mo9175u(int i2, int i3);

    /* JADX INFO: renamed from: v */
    public abstract void mo9176v(int i2);

    /* JADX INFO: renamed from: w */
    public abstract void mo9177w(int i2, long j2);

    /* JADX INFO: renamed from: x */
    public abstract void mo9178x(long j2);
}
