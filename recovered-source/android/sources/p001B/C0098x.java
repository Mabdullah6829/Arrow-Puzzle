package p001B;

import java.io.Serializable;

/* JADX INFO: renamed from: B.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C0098x implements InterfaceC0097w, Serializable {

    /* JADX INFO: renamed from: s */
    public final InterfaceC0097w f141s;

    /* JADX INFO: renamed from: t */
    public volatile transient boolean f142t;

    /* JADX INFO: renamed from: u */
    public transient Object f143u;

    public C0098x(InterfaceC0097w interfaceC0097w) {
        interfaceC0097w.getClass();
        this.f141s = interfaceC0097w;
    }

    @Override // p001B.InterfaceC0097w
    public final Object get() {
        if (!this.f142t) {
            synchronized (this) {
                try {
                    if (!this.f142t) {
                        Object obj = this.f141s.get();
                        this.f143u = obj;
                        this.f142t = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f143u;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f142t) {
            obj = "<supplier that returned " + this.f143u + ">";
        } else {
            obj = this.f141s;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
