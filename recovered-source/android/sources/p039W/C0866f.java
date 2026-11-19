package p039W;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p033S0.C0613g;
import p033S0.C0629w;
import p033S0.InterfaceC0603C;

/* JADX INFO: renamed from: W.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0866f implements InterfaceC0603C {

    /* JADX INFO: renamed from: s */
    public final C0629w f2423s;

    /* JADX INFO: renamed from: t */
    public int f2424t;

    /* JADX INFO: renamed from: u */
    public byte f2425u;

    /* JADX INFO: renamed from: v */
    public int f2426v;

    /* JADX INFO: renamed from: w */
    public int f2427w;

    /* JADX INFO: renamed from: x */
    public short f2428x;

    public C0866f(C0629w c0629w) {
        this.f2423s = c0629w;
    }

    @Override // p033S0.InterfaceC0603C
    /* JADX INFO: renamed from: m */
    public final long mo1359m(C0613g c0613g, long j2) throws IOException {
        int i2;
        int iM1465i;
        do {
            int i3 = this.f2427w;
            C0629w c0629w = this.f2423s;
            if (i3 == 0) {
                c0629w.m1471r(this.f2428x);
                this.f2428x = (short) 0;
                if ((this.f2425u & 4) == 0) {
                    i2 = this.f2426v;
                    int iM1791a = C0870j.m1791a(c0629w);
                    this.f2427w = iM1791a;
                    this.f2424t = iM1791a;
                    byte bM1463e = (byte) (c0629w.m1463e() & 255);
                    this.f2425u = (byte) (c0629w.m1463e() & 255);
                    Logger logger = C0870j.f2440a;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(AbstractC0867g.m1781a(true, this.f2426v, this.f2424t, bM1463e, this.f2425u));
                    }
                    iM1465i = c0629w.m1465i() & Integer.MAX_VALUE;
                    this.f2426v = iM1465i;
                    if (bM1463e != 9) {
                        C0870j.m1793c("%s != TYPE_CONTINUATION", Byte.valueOf(bM1463e));
                        throw null;
                    }
                }
            } else {
                long jMo1359m = c0629w.mo1359m(c0613g, Math.min(j2, i3));
                if (jMo1359m != -1) {
                    this.f2427w -= (int) jMo1359m;
                    return jMo1359m;
                }
            }
            return -1L;
        } while (iM1465i == i2);
        C0870j.m1793c("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
