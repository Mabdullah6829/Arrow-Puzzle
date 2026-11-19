package p036U;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import p001B.AbstractC0076b;
import p034T.AbstractC0759m0;
import p038V.C0857k;

/* JADX INFO: renamed from: U.q */
/* JADX INFO: loaded from: classes.dex */
public class C0836q {

    /* JADX INFO: renamed from: b */
    public static final Logger f2297b;

    /* JADX INFO: renamed from: c */
    public static final C0836q f2298c;

    /* JADX INFO: renamed from: a */
    public final C0857k f2299a;

    static {
        C0836q c0836q;
        Logger logger = Logger.getLogger(C0836q.class.getName());
        f2297b = logger;
        C0857k c0857k = C0857k.f2368d;
        ClassLoader classLoader = C0836q.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            logger.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                logger.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e2);
                c0836q = new C0836q(c0857k);
            }
        }
        c0836q = new C0835p(c0857k);
        f2298c = c0836q;
    }

    public C0836q(C0857k c0857k) {
        AbstractC0076b.m133h(c0857k, "platform");
        this.f2299a = c0857k;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1735c(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            AbstractC0076b.m129d("Userinfo must not be present on authority: '%s'", AbstractC0759m0.m1620a(str).getAuthority().indexOf(64) == -1, str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo1732a(SSLSocket sSLSocket, String str, List list) {
        this.f2299a.mo1766c(sSLSocket, str, list);
    }

    /* JADX INFO: renamed from: b */
    public String mo1733b(SSLSocket sSLSocket) {
        return this.f2299a.mo1767d(sSLSocket);
    }

    /* JADX INFO: renamed from: d */
    public String mo1734d(SSLSocket sSLSocket, String str, List list) {
        C0857k c0857k = this.f2299a;
        if (list != null) {
            mo1732a(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String strMo1733b = mo1733b(sSLSocket);
            if (strMo1733b != null) {
                c0857k.mo1769a(sSLSocket);
                return strMo1733b;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } catch (Throwable th) {
            c0857k.mo1769a(sSLSocket);
            throw th;
        }
    }
}
