package p074m;

import p050c0.InterfaceC1888a;

/* JADX INFO: renamed from: m.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6474a implements InterfaceC1888a {

    /* JADX INFO: renamed from: u */
    public static final Object f24656u = new Object();

    /* JADX INFO: renamed from: s */
    public volatile InterfaceC6475b f24657s;

    /* JADX INFO: renamed from: t */
    public volatile Object f24658t;

    /* JADX INFO: renamed from: a */
    public static InterfaceC1888a m12196a(InterfaceC6475b interfaceC6475b) {
        if (interfaceC6475b instanceof C6474a) {
            return interfaceC6475b;
        }
        C6474a c6474a = new C6474a();
        c6474a.f24658t = f24656u;
        c6474a.f24657s = interfaceC6475b;
        return c6474a;
    }

    @Override // p050c0.InterfaceC1888a
    public final Object get() {
        Object obj;
        Object obj2 = this.f24658t;
        Object obj3 = f24656u;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f24658t;
                if (obj == obj3) {
                    obj = this.f24657s.get();
                    Object obj4 = this.f24658t;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f24658t = obj;
                    this.f24657s = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
