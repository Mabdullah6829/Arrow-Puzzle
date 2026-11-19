package p036U;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p001B.C0086l;
import p038V.AbstractC0860n;
import p038V.C0857k;
import p038V.EnumC0858l;

/* JADX INFO: renamed from: U.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0835p extends C0836q {

    /* JADX INFO: renamed from: d */
    public static final C0086l f2284d;

    /* JADX INFO: renamed from: e */
    public static final C0086l f2285e;

    /* JADX INFO: renamed from: f */
    public static final C0086l f2286f;

    /* JADX INFO: renamed from: g */
    public static final C0086l f2287g;

    /* JADX INFO: renamed from: h */
    public static final C0086l f2288h;

    /* JADX INFO: renamed from: i */
    public static final C0086l f2289i;

    /* JADX INFO: renamed from: j */
    public static final Method f2290j;

    /* JADX INFO: renamed from: k */
    public static final Method f2291k;

    /* JADX INFO: renamed from: l */
    public static final Method f2292l;

    /* JADX INFO: renamed from: m */
    public static final Method f2293m;

    /* JADX INFO: renamed from: n */
    public static final Method f2294n;

    /* JADX INFO: renamed from: o */
    public static final Method f2295o;

    /* JADX INFO: renamed from: p */
    public static final Constructor f2296p;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Logger logger = C0836q.f2297b;
        Class cls = Boolean.TYPE;
        Constructor<?> constructor = null;
        f2284d = new C0086l((Class) null, "setUseSessionTickets", new Class[]{cls});
        f2285e = new C0086l((Class) null, "setHostname", new Class[]{String.class});
        f2286f = new C0086l(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
        f2287g = new C0086l((Class) null, "setAlpnProtocols", new Class[]{byte[].class});
        f2288h = new C0086l(byte[].class, "getNpnSelectedProtocol", new Class[0]);
        f2289i = new C0086l((Class) null, "setNpnProtocols", new Class[]{byte[].class});
        try {
            method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            try {
                method2 = SSLParameters.class.getMethod("getApplicationProtocols", null);
                try {
                    method3 = SSLSocket.class.getMethod("getApplicationProtocol", null);
                    try {
                        Class<?> cls2 = Class.forName("android.net.ssl.SSLSockets");
                        method4 = cls2.getMethod("isSupportedSocket", SSLSocket.class);
                        try {
                            method5 = cls2.getMethod("setUseSessionTickets", SSLSocket.class, cls);
                        } catch (ClassNotFoundException e) {
                            e = e;
                            logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                            method5 = null;
                        } catch (NoSuchMethodException e2) {
                            e = e2;
                            logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                            method5 = null;
                        }
                    } catch (ClassNotFoundException e3) {
                        e = e3;
                        method4 = null;
                    } catch (NoSuchMethodException e4) {
                        e = e4;
                        method4 = null;
                    }
                } catch (ClassNotFoundException e5) {
                    e = e5;
                    method3 = null;
                    method4 = method3;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f2292l = method;
                    f2293m = method2;
                    f2294n = method3;
                    f2290j = method4;
                    f2291k = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f2295o = method6;
                    f2296p = constructor;
                } catch (NoSuchMethodException e6) {
                    e = e6;
                    method3 = null;
                    method4 = method3;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f2292l = method;
                    f2293m = method2;
                    f2294n = method3;
                    f2290j = method4;
                    f2291k = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f2295o = method6;
                    f2296p = constructor;
                }
            } catch (ClassNotFoundException e7) {
                e = e7;
                method2 = null;
                method3 = method2;
                method4 = method3;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f2292l = method;
                f2293m = method2;
                f2294n = method3;
                f2290j = method4;
                f2291k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f2295o = method6;
                f2296p = constructor;
            } catch (NoSuchMethodException e8) {
                e = e8;
                method2 = null;
                method3 = method2;
                method4 = method3;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f2292l = method;
                f2293m = method2;
                f2294n = method3;
                f2290j = method4;
                f2291k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f2295o = method6;
                f2296p = constructor;
            }
        } catch (ClassNotFoundException e9) {
            e = e9;
            method = null;
            method2 = null;
        } catch (NoSuchMethodException e10) {
            e = e10;
            method = null;
            method2 = null;
        }
        f2292l = method;
        f2293m = method2;
        f2294n = method3;
        f2290j = method4;
        f2291k = method5;
        try {
            method6 = SSLParameters.class.getMethod("setServerNames", List.class);
            try {
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            } catch (ClassNotFoundException e11) {
                e = e11;
                logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
            } catch (NoSuchMethodException e12) {
                e = e12;
                logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
            }
        } catch (ClassNotFoundException e13) {
            e = e13;
            method6 = null;
        } catch (NoSuchMethodException e14) {
            e = e14;
            method6 = null;
        }
        f2295o = method6;
        f2296p = constructor;
    }

    @Override // p036U.C0836q
    /* JADX INFO: renamed from: a */
    public final void mo1732a(SSLSocket sSLSocket, String str, List list) {
        Constructor constructor;
        Method method;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((EnumC0858l) it.next()).f2375s);
        }
        boolean z = false;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (str != null) {
            try {
                try {
                    if (C0836q.m1735c(str)) {
                        Method method2 = f2290j;
                        if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                            f2284d.m155i(sSLSocket, Boolean.TRUE);
                        } else {
                            f2291k.invoke(null, sSLSocket, Boolean.TRUE);
                        }
                        Method method3 = f2295o;
                        if (method3 == null || (constructor = f2296p) == null) {
                            f2285e.m155i(sSLSocket, str);
                        } else {
                            method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                        }
                    }
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException(e3);
            }
        }
        Method method4 = f2294n;
        if (method4 != null) {
            try {
                method4.invoke(sSLSocket, null);
                f2292l.invoke(sSLParameters, strArr);
                z = true;
            } catch (InvocationTargetException e4) {
                if (!(e4.getTargetException() instanceof UnsupportedOperationException)) {
                    throw e4;
                }
                C0836q.f2297b.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
            }
        }
        sSLSocket.setSSLParameters(sSLParameters);
        if (z && (method = f2293m) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
            return;
        }
        Object[] objArr = {C0857k.m1770b(list)};
        C0857k c0857k = this.f2299a;
        if (c0857k.mo1768e() == 1) {
            f2287g.m156j(sSLSocket, objArr);
        }
        if (c0857k.mo1768e() == 3) {
            throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
        }
        f2289i.m156j(sSLSocket, objArr);
    }

    @Override // p036U.C0836q
    /* JADX INFO: renamed from: b */
    public final String mo1733b(SSLSocket sSLSocket) {
        Logger logger = C0836q.f2297b;
        Method method = f2294n;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, null);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                if (!(e2.getTargetException() instanceof UnsupportedOperationException)) {
                    throw new RuntimeException(e2);
                }
                logger.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
            }
        }
        C0857k c0857k = this.f2299a;
        if (c0857k.mo1768e() == 1) {
            try {
                byte[] bArr = (byte[]) f2286f.m156j(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, AbstractC0860n.f2384b);
                }
            } catch (Exception e3) {
                logger.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e3);
            }
        }
        if (c0857k.mo1768e() != 3) {
            try {
                byte[] bArr2 = (byte[]) f2288h.m156j(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, AbstractC0860n.f2384b);
                }
            } catch (Exception e4) {
                logger.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e4);
            }
        }
        return null;
    }

    @Override // p036U.C0836q
    /* JADX INFO: renamed from: d */
    public final String mo1734d(SSLSocket sSLSocket, String str, List list) {
        String strMo1733b = mo1733b(sSLSocket);
        return strMo1733b == null ? super.mo1734d(sSLSocket, str, list) : strMo1733b;
    }
}
