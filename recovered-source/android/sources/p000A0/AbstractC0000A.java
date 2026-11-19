package p000A0;

import p002B0.C0104d;
import p010F0.AbstractC0227m;
import p010F0.AbstractC0234t;
import p012H0.C0302e;

/* JADX INFO: renamed from: A0.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0000A {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0003D f0a;

    static {
        String property;
        C0104d c0104d;
        InterfaceC0003D interfaceC0003D;
        int i2 = AbstractC0234t.f468a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C0302e c0302e = AbstractC0007H.f4a;
            c0104d = AbstractC0227m.f459a;
            C0104d c0104d2 = c0104d.f153u;
            if (c0104d == null) {
                interfaceC0003D = c0104d;
                interfaceC0003D = RunnableC0070z.f97z;
            }
        } else {
            interfaceC0003D = RunnableC0070z.f97z;
        }
        interfaceC0003D = c0104d;
        f0a = interfaceC0003D;
    }
}
