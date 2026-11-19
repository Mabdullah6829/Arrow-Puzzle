package p035T0;

import java.io.EOFException;
import kotlin.jvm.internal.AbstractC6452k;
import p033S0.C0613g;
import p091y0.AbstractC6571a;

/* JADX INFO: renamed from: T0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0809a {

    /* JADX INFO: renamed from: a */
    public static final byte[] f2118a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC6571a.f24799a);
        AbstractC6452k.m12180d(bytes, "this as java.lang.String).getBytes(charset)");
        f2118a = bytes;
    }

    /* JADX INFO: renamed from: a */
    public static final String m1682a(C0613g c0613g, long j2) throws EOFException {
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (c0613g.m1392i(j3) == 13) {
                String strM1381I = c0613g.m1381I(j3, AbstractC6571a.f24799a);
                c0613g.m1382J(2L);
                return strM1381I;
            }
        }
        String strM1381I2 = c0613g.m1381I(j2, AbstractC6571a.f24799a);
        c0613g.m1382J(1L);
        return strM1381I2;
    }
}
