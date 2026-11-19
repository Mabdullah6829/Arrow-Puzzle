package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzidp {

    /* JADX INFO: renamed from: a */
    public int f19736a;

    /* JADX INFO: renamed from: b */
    public int f19737b;

    /* JADX INFO: renamed from: c */
    public Object f19738c;

    private zzidp() {
    }

    /* JADX INFO: renamed from: e */
    public static zzidp m8198e(InputStream inputStream) {
        return inputStream == null ? m8199f(zzifc.f19794a, 0, 0) : new zzido(inputStream);
    }

    /* JADX INFO: renamed from: f */
    public static zzidp m8199f(byte[] bArr, int i2, int i3) {
        zzidn zzidnVar = new zzidn(bArr, i2, i3);
        try {
            zzidnVar.mo8165a(i3);
            return zzidnVar;
        } catch (zzifh e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m8200h(int i2) {
        return (i2 >>> 1) ^ (-(i2 & 1));
    }

    /* JADX INFO: renamed from: i */
    public static long m8201i(long j2) {
        return (j2 >>> 1) ^ (-(1 & j2));
    }

    /* JADX INFO: renamed from: A */
    public abstract long mo8153A();

    /* JADX INFO: renamed from: B */
    public abstract int mo8154B();

    /* JADX INFO: renamed from: C */
    public abstract long mo8155C();

    /* JADX INFO: renamed from: a */
    public abstract int mo8165a(int i2);

    /* JADX INFO: renamed from: b */
    public abstract void mo8166b(int i2);

    /* JADX INFO: renamed from: c */
    public abstract boolean mo8167c();

    /* JADX INFO: renamed from: d */
    public abstract int mo8168d();

    /* JADX INFO: renamed from: g */
    public final void m8202g() throws zzifh {
        boolean zMo8171l;
        do {
            int iMo8169j = mo8169j();
            if (iMo8169j == 0) {
                return;
            }
            int i2 = this.f19736a;
            int i3 = this.f19737b;
            if (i2 + i3 >= 100) {
                throw new zzifh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f19737b = i3 + 1;
            zMo8171l = mo8171l(iMo8169j);
            this.f19737b--;
        } while (zMo8171l);
    }

    /* JADX INFO: renamed from: j */
    public abstract int mo8169j();

    /* JADX INFO: renamed from: k */
    public abstract void mo8170k(int i2);

    /* JADX INFO: renamed from: l */
    public abstract boolean mo8171l(int i2);

    /* JADX INFO: renamed from: m */
    public abstract double mo8172m();

    /* JADX INFO: renamed from: n */
    public abstract float mo8173n();

    /* JADX INFO: renamed from: o */
    public abstract long mo8174o();

    /* JADX INFO: renamed from: p */
    public abstract long mo8175p();

    /* JADX INFO: renamed from: q */
    public abstract int mo8176q();

    /* JADX INFO: renamed from: r */
    public abstract long mo8177r();

    /* JADX INFO: renamed from: s */
    public abstract int mo8178s();

    /* JADX INFO: renamed from: t */
    public abstract boolean mo8179t();

    /* JADX INFO: renamed from: u */
    public abstract String mo8180u();

    /* JADX INFO: renamed from: v */
    public abstract String mo8181v();

    /* JADX INFO: renamed from: w */
    public abstract zzidl mo8182w();

    /* JADX INFO: renamed from: x */
    public abstract int mo8183x();

    /* JADX INFO: renamed from: y */
    public abstract int mo8184y();

    /* JADX INFO: renamed from: z */
    public abstract int mo8185z();
}
