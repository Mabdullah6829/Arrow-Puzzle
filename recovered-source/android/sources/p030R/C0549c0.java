package p030R;

import p001B.AbstractC0076b;
import p001B.AbstractC0081g;

/* JADX INFO: renamed from: R.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0549c0 extends AbstractC0553e0 {

    /* JADX INFO: renamed from: e */
    public final InterfaceC0551d0 f1160e;

    public C0549c0(String str, InterfaceC0551d0 interfaceC0551d0) {
        super(str, false, interfaceC0551d0);
        if (str.endsWith("-bin")) {
            throw new IllegalArgumentException(AbstractC0076b.m141p("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
        }
        AbstractC0076b.m133h(interfaceC0551d0, "marshaller");
        this.f1160e = interfaceC0551d0;
    }

    @Override // p030R.AbstractC0553e0
    /* JADX INFO: renamed from: a */
    public final Object mo1285a(byte[] bArr) {
        return this.f1160e.mo1288f(new String(bArr, AbstractC0081g.f107a));
    }

    @Override // p030R.AbstractC0553e0
    /* JADX INFO: renamed from: b */
    public final byte[] mo1286b(Object obj) {
        String strMo1287a = this.f1160e.mo1287a(obj);
        AbstractC0076b.m133h(strMo1287a, "null marshaller.toAsciiString()");
        return strMo1287a.getBytes(AbstractC0081g.f107a);
    }
}
