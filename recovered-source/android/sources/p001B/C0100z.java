package p001B;

/* JADX INFO: renamed from: B.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C0100z implements InterfaceC0097w {

    /* JADX INFO: renamed from: u */
    public static final C0099y f145u = new C0099y(0);

    /* JADX INFO: renamed from: s */
    public volatile InterfaceC0097w f146s;

    /* JADX INFO: renamed from: t */
    public Object f147t;

    @Override // p001B.InterfaceC0097w
    public final Object get() {
        InterfaceC0097w interfaceC0097w = this.f146s;
        C0099y c0099y = f145u;
        if (interfaceC0097w != c0099y) {
            synchronized (this) {
                try {
                    if (this.f146s != c0099y) {
                        Object obj = this.f146s.get();
                        this.f147t = obj;
                        this.f146s = c0099y;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f147t;
    }

    public final String toString() {
        Object obj = this.f146s;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == f145u) {
            obj = "<supplier that returned " + this.f147t + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
