package p030R;

import p001B.AbstractC0076b;

/* JADX INFO: renamed from: R.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0555f0 extends AbstractC0553e0 {

    /* JADX INFO: renamed from: e */
    public final InterfaceC0557g0 f1173e;

    public C0555f0(String str, boolean z, InterfaceC0557g0 interfaceC0557g0) {
        super(str, z, interfaceC0557g0);
        if (str.endsWith("-bin")) {
            throw new IllegalArgumentException(AbstractC0076b.m141p("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
        }
        this.f1173e = interfaceC0557g0;
    }

    @Override // p030R.AbstractC0553e0
    /* JADX INFO: renamed from: a */
    public final Object mo1285a(byte[] bArr) {
        return this.f1173e.mo1293g(bArr);
    }

    @Override // p030R.AbstractC0553e0
    /* JADX INFO: renamed from: b */
    public final byte[] mo1286b(Object obj) {
        byte[] bArrMo1292a = this.f1173e.mo1292a(obj);
        AbstractC0076b.m133h(bArrMo1292a, "null marshaller.toAsciiString()");
        return bArrMo1292a;
    }
}
