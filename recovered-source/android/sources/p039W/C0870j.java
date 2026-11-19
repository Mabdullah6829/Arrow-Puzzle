package p039W;

import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;
import p033S0.AbstractC0608b;
import p033S0.C0616j;
import p033S0.C0629w;

/* JADX INFO: renamed from: W.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0870j {

    /* JADX INFO: renamed from: a */
    public static final Logger f2440a = Logger.getLogger(AbstractC0867g.class.getName());

    /* JADX INFO: renamed from: b */
    public static final C0616j f2441b;

    static {
        C0616j c0616j = C0616j.f1343v;
        f2441b = AbstractC0608b.m1371d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    /* JADX INFO: renamed from: a */
    public static int m1791a(C0629w c0629w) {
        return (c0629w.m1463e() & 255) | ((c0629w.m1463e() & 255) << 16) | ((c0629w.m1463e() & 255) << 8);
    }

    /* JADX INFO: renamed from: b */
    public static int m1792b(int i2, byte b, short s2) throws IOException {
        if ((b & 8) != 0) {
            i2--;
        }
        if (s2 <= i2) {
            return (short) (i2 - s2);
        }
        m1793c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s2), Integer.valueOf(i2));
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static void m1793c(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }
}
