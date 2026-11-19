package p038V;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import p001B.C0086l;
import p033S0.C0613g;

/* JADX INFO: renamed from: V.k */
/* JADX INFO: loaded from: classes.dex */
public class C0857k {

    /* JADX INFO: renamed from: b */
    public static final Logger f2366b;

    /* JADX INFO: renamed from: c */
    public static final String[] f2367c;

    /* JADX INFO: renamed from: d */
    public static final C0857k f2368d;

    /* JADX INFO: renamed from: a */
    public final Provider f2369a;

    static {
        Provider provider;
        Provider provider2;
        C0857k c0857k;
        int i2;
        Logger logger = Logger.getLogger(C0857k.class.getName());
        f2366b = logger;
        f2367c = new String[]{"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i3 = 0;
        loop0: while (true) {
            if (i3 >= length) {
                logger.log(Level.WARNING, "Unable to find Conscrypt");
                provider = null;
                break;
            }
            Provider provider3 = providers[i3];
            for (String str : f2367c) {
                if (str.equals(provider3.getClass().getName())) {
                    logger.log(Level.FINE, "Found registered provider {0}", str);
                    provider = provider3;
                    break loop0;
                }
            }
            i3++;
        }
        int i4 = 2;
        if (provider != null) {
            C0086l c0086l = new C0086l((Class) null, "setUseSessionTickets", new Class[]{Boolean.TYPE});
            C0086l c0086l2 = new C0086l((Class) null, "setHostname", new Class[]{String.class});
            C0086l c0086l3 = new C0086l(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            C0086l c0086l4 = new C0086l((Class) null, "setAlpnProtocols", new Class[]{byte[].class});
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                cls.getMethod("tagSocket", Socket.class);
                cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (!provider.getName().equals("GmsCore_OpenSSL") && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
                try {
                    C0857k.class.getClassLoader().loadClass("android.net.Network");
                } catch (ClassNotFoundException e) {
                    logger.log(Level.FINE, "Can't find class", (Throwable) e);
                    try {
                        C0857k.class.getClassLoader().loadClass("android.app.ActivityOptions");
                    } catch (ClassNotFoundException e2) {
                        logger.log(Level.FINE, "Can't find class", (Throwable) e2);
                        i4 = 3;
                    }
                    i2 = i4;
                }
            }
            i2 = 1;
            c0857k = new C0853g(c0086l, c0086l2, c0086l3, c0086l4, provider, i2);
        } else {
            try {
                Provider provider4 = SSLContext.getDefault().getProvider();
                try {
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS", provider4);
                        sSLContext.init(null, null, null);
                        ((Method) AccessController.doPrivileged(new C0852f(0))).invoke(sSLContext.createSSLEngine(), null);
                        c0857k = new C0854h(provider4, (Method) AccessController.doPrivileged(new C0852f(1)), (Method) AccessController.doPrivileged(new C0852f(2)));
                    } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                        provider2 = provider4;
                        c0857k = new C0857k(provider2);
                    }
                } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused3) {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    try {
                        c0857k = new C0855i(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider4);
                    } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                        provider2 = provider4;
                        c0857k = new C0857k(provider2);
                    }
                }
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(e3);
            }
        }
        f2368d = c0857k;
    }

    public C0857k(Provider provider) {
        this.f2369a = provider;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m1770b(List list) {
        C0613g c0613g = new C0613g();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            EnumC0858l enumC0858l = (EnumC0858l) list.get(i2);
            if (enumC0858l != EnumC0858l.HTTP_1_0) {
                c0613g.m1387O(enumC0858l.f2375s.length());
                c0613g.m1389Q(enumC0858l.f2375s);
            }
        }
        return c0613g.m1396r(c0613g.f1342t);
    }

    /* JADX INFO: renamed from: d */
    public String mo1767d(SSLSocket sSLSocket) {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public int mo1768e() {
        return 3;
    }

    /* JADX INFO: renamed from: a */
    public void mo1769a(SSLSocket sSLSocket) {
    }

    /* JADX INFO: renamed from: c */
    public void mo1766c(SSLSocket sSLSocket, String str, List list) {
    }
}
