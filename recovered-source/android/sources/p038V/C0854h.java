package p038V;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: V.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0854h extends C0857k {

    /* JADX INFO: renamed from: e */
    public final Method f2356e;

    /* JADX INFO: renamed from: f */
    public final Method f2357f;

    public C0854h(Provider provider, Method method, Method method2) {
        super(provider);
        this.f2356e = method;
        this.f2357f = method2;
    }

    @Override // p038V.C0857k
    /* JADX INFO: renamed from: c */
    public final void mo1766c(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EnumC0858l enumC0858l = (EnumC0858l) it.next();
            if (enumC0858l != EnumC0858l.HTTP_1_0) {
                arrayList.add(enumC0858l.f2375s);
            }
        }
        try {
            this.f2356e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p038V.C0857k
    /* JADX INFO: renamed from: d */
    public final String mo1767d(SSLSocket sSLSocket) {
        try {
            return (String) this.f2357f.invoke(sSLSocket, null);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p038V.C0857k
    /* JADX INFO: renamed from: e */
    public final int mo1768e() {
        return 1;
    }
}
