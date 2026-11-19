package p001B;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import javax.net.ssl.SSLSocket;
import p030R.AbstractC0560i;
import p030R.C0559h0;
import p030R.C0588w;
import p030R.C0589w0;
import p030R.EnumC0565k0;
import p030R.EnumC0587v0;
import p034T.C0742i;
import p034T.C0783s0;
import p034T.C0790u;
import p034T.C0794v;
import p034T.C0797w;
import p034T.C0803y;
import p034T.EnumC0633A;
import p034T.InterfaceC0636B;
import p049b0.AbstractC1886b;
import p049b0.C1887c;
import p050c0.InterfaceC1888a;
import p067j.C6405n;
import p069k.C6440u;
import p074m.InterfaceC6475b;
import p077p.C6485b;
import p077p.InterfaceC6486c;
import p079q.C6510a;
import p079q.C6512c;
import p079q.C6517h;
import p079q.C6518i;
import p079q.C6519j;
import p081r.InterfaceC6525d;

/* JADX INFO: renamed from: B.l */
/* JADX INFO: loaded from: classes2.dex */
public class C0086l implements InterfaceC0636B, InterfaceC6475b {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f111s;

    /* JADX INFO: renamed from: t */
    public Object f112t;

    /* JADX INFO: renamed from: u */
    public Object f113u;

    /* JADX INFO: renamed from: v */
    public Object f114v;

    public /* synthetic */ C0086l(int i2) {
        this.f111s = i2;
    }

    /* JADX INFO: renamed from: g */
    public static Method m147g(Class cls, String str, Class[] clsArr) {
        if (cls != null) {
            try {
                if ((cls.getModifiers() & 1) == 0) {
                    return m147g(cls.getSuperclass(), str, clsArr);
                }
                Method method = cls.getMethod(str, clsArr);
                try {
                    if ((method.getModifiers() & 1) != 0) {
                        return method;
                    }
                } catch (NoSuchMethodException unused) {
                    return method;
                }
            } catch (NoSuchMethodException unused2) {
                return null;
            }
        }
        return null;
    }

    @Override // p034T.InterfaceC0636B
    /* JADX INFO: renamed from: a */
    public void mo148a(C0589w0 c0589w0, EnumC0633A enumC0633A, C0559h0 c0559h0) {
        AbstractC1886b.m2715c();
        try {
            AbstractC1886b.m2713a();
            m152e(c0589w0, c0559h0);
            AbstractC1886b.f2862a.getClass();
        } catch (Throwable th) {
            try {
                AbstractC1886b.f2862a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p034T.InterfaceC0636B
    /* JADX INFO: renamed from: b */
    public void mo149b(C0559h0 c0559h0) {
        C0803y c0803y = (C0803y) this.f114v;
        AbstractC1886b.m2715c();
        try {
            AbstractC1886b.m2713a();
            AbstractC1886b.m2714b();
            c0803y.f2096b.execute(new C0790u(this, c0559h0));
            AbstractC1886b.f2862a.getClass();
        } catch (Throwable th) {
            try {
                AbstractC1886b.f2862a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p034T.InterfaceC0636B
    /* JADX INFO: renamed from: c */
    public void mo150c(C0092r c0092r) {
        C0803y c0803y = (C0803y) this.f114v;
        AbstractC1886b.m2715c();
        try {
            AbstractC1886b.m2713a();
            AbstractC1886b.m2714b();
            c0803y.f2096b.execute(new C0790u(this, c0092r));
            AbstractC1886b.f2862a.getClass();
        } catch (Throwable th) {
            try {
                AbstractC1886b.f2862a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p034T.InterfaceC0636B
    /* JADX INFO: renamed from: d */
    public void mo151d() {
        C0803y c0803y = (C0803y) this.f114v;
        EnumC0565k0 enumC0565k0 = c0803y.f2095a.f1200a;
        enumC0565k0.getClass();
        if (enumC0565k0 == EnumC0565k0.f1196s || enumC0565k0 == EnumC0565k0.f1197t) {
            return;
        }
        AbstractC1886b.m2715c();
        try {
            AbstractC1886b.m2713a();
            AbstractC1886b.m2714b();
            c0803y.f2096b.execute(new C0797w(this));
            AbstractC1886b.f2862a.getClass();
        } catch (Throwable th) {
            try {
                AbstractC1886b.f2862a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m152e(C0589w0 c0589w0, C0559h0 c0559h0) {
        C0803y c0803y = (C0803y) this.f114v;
        C0588w c0588w = c0803y.f2102h.f1175a;
        c0803y.f2099e.getClass();
        if (c0588w == null) {
            c0588w = null;
        }
        if (c0589w0.f1287a == EnumC0587v0.CANCELLED && c0588w != null && c0588w.m1346b()) {
            C0783s0 c0783s0 = new C0783s0(0, (byte) 0);
            c0803y.f2103i.mo1543e(c0783s0);
            c0589w0 = C0589w0.f1278h.m1351a("ClientCall was cancelled at or after deadline. " + c0783s0);
            c0559h0 = new C0559h0();
        }
        AbstractC1886b.m2714b();
        c0803y.f2096b.execute(new C0794v(this, c0589w0, c0559h0));
    }

    /* JADX INFO: renamed from: f */
    public Method m153f(Class cls) {
        Class cls2;
        Method methodM147g = m147g(cls, (String) this.f112t, (Class[]) this.f114v);
        if (methodM147g == null || (cls2 = (Class) this.f113u) == null || cls2.isAssignableFrom(methodM147g.getReturnType())) {
            return methodM147g;
        }
        return null;
    }

    @Override // p050c0.InterfaceC1888a
    public Object get() {
        switch (this.f111s) {
            case 8:
                return new C6440u(new C1887c(11), new C1887c(10), (InterfaceC6486c) ((C6485b) this.f112t).get(), (C6517h) ((C6518i) this.f113u).get(), (C6519j) ((C0742i) this.f114v).get());
            default:
                return new C6512c((Context) ((InterfaceC1888a) this.f112t).get(), (InterfaceC6525d) ((InterfaceC1888a) this.f113u).get(), (C6510a) ((C1887c) this.f114v).get());
        }
    }

    /* JADX INFO: renamed from: h */
    public Object m154h(SSLSocket sSLSocket, Object... objArr) {
        Method methodM153f = m153f(sSLSocket.getClass());
        if (methodM153f == null) {
            throw new AssertionError("Method " + ((String) this.f112t) + " not supported for object " + sSLSocket);
        }
        try {
            return methodM153f.invoke(sSLSocket, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodM153f);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m155i(SSLSocket sSLSocket, Object... objArr) {
        try {
            Method methodM153f = m153f(sSLSocket.getClass());
            if (methodM153f == null) {
                return;
            }
            try {
                methodM153f.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* JADX INFO: renamed from: j */
    public Object m156j(SSLSocket sSLSocket, Object... objArr) {
        try {
            return m154h(sSLSocket, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public /* synthetic */ C0086l(Object obj, Object obj2, Object obj3, int i2) {
        this.f111s = i2;
        this.f112t = obj;
        this.f113u = obj2;
        this.f114v = obj3;
    }

    public C0086l(Class cls, String str, Class[] clsArr) {
        this.f111s = 5;
        this.f113u = cls;
        this.f112t = str;
        this.f114v = clsArr;
    }

    public C0086l(URL url, C6405n c6405n, String str) {
        this.f111s = 6;
        this.f113u = url;
        this.f114v = c6405n;
        this.f112t = str;
    }

    public C0086l(C0803y c0803y, AbstractC0560i abstractC0560i) {
        this.f111s = 2;
        this.f114v = c0803y;
        AbstractC0076b.m133h(abstractC0560i, "observer");
        this.f112t = abstractC0560i;
    }
}
