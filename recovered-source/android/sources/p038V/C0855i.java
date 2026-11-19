package p038V;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: V.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0855i extends C0857k {

    /* JADX INFO: renamed from: e */
    public final Method f2358e;

    /* JADX INFO: renamed from: f */
    public final Method f2359f;

    /* JADX INFO: renamed from: g */
    public final Method f2360g;

    /* JADX INFO: renamed from: h */
    public final Class f2361h;

    /* JADX INFO: renamed from: i */
    public final Class f2362i;

    public C0855i(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
        super(provider);
        this.f2358e = method;
        this.f2359f = method2;
        this.f2360g = method3;
        this.f2361h = cls;
        this.f2362i = cls2;
    }

    @Override // p038V.C0857k
    /* JADX INFO: renamed from: a */
    public final void mo1769a(SSLSocket sSLSocket) {
        try {
            this.f2360g.invoke(null, sSLSocket);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException e) {
            C0857k.f2366b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e);
        }
    }

    @Override // p038V.C0857k
    /* JADX INFO: renamed from: c */
    public final void mo1766c(SSLSocket sSLSocket, String str, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            EnumC0858l enumC0858l = (EnumC0858l) list.get(i2);
            if (enumC0858l != EnumC0858l.HTTP_1_0) {
                arrayList.add(enumC0858l.f2375s);
            }
        }
        try {
            this.f2358e.invoke(null, sSLSocket, Proxy.newProxyInstance(C0857k.class.getClassLoader(), new Class[]{this.f2361h, this.f2362i}, new C0856j(arrayList)));
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // p038V.C0857k
    /* JADX INFO: renamed from: d */
    public final String mo1767d(SSLSocket sSLSocket) {
        try {
            C0856j c0856j = (C0856j) Proxy.getInvocationHandler(this.f2359f.invoke(null, sSLSocket));
            boolean z = c0856j.f2364b;
            if (!z && c0856j.f2365c == null) {
                C0857k.f2366b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                return null;
            }
            if (z) {
                return null;
            }
            return c0856j.f2365c;
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException unused2) {
            throw new AssertionError();
        }
    }

    @Override // p038V.C0857k
    /* JADX INFO: renamed from: e */
    public final int mo1768e() {
        return 1;
    }
}
