package p036U;

import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p001B.AbstractC0076b;
import p038V.AbstractC0860n;
import p038V.C0848b;
import p038V.C0849c;
import p038V.C0851e;
import p038V.EnumC0858l;

/* JADX INFO: renamed from: U.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0839t {

    /* JADX INFO: renamed from: a */
    public static final List f2301a = Collections.unmodifiableList(Arrays.asList(EnumC0858l.HTTP_2));

    /* JADX INFO: renamed from: a */
    public static SSLSocket m1736a(SSLSocketFactory sSLSocketFactory, Socket socket, String str, int i2, C0849c c0849c) throws IOException {
        EnumC0858l enumC0858l;
        AbstractC0076b.m133h(sSLSocketFactory, "sslSocketFactory");
        AbstractC0076b.m133h(socket, "socket");
        AbstractC0076b.m133h(c0849c, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i2, true);
        String[] strArr = c0849c.f2338b;
        String[] strArr2 = strArr != null ? (String[]) AbstractC0860n.m1771a(strArr, sSLSocket.getEnabledCipherSuites()) : null;
        String[] strArr3 = (String[]) AbstractC0860n.m1771a(c0849c.f2339c, sSLSocket.getEnabledProtocols());
        C0848b c0848b = new C0848b(c0849c);
        if (!c0848b.f2332a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr2 == null) {
            c0848b.f2333b = null;
        } else {
            c0848b.f2333b = (String[]) strArr2.clone();
        }
        if (!c0848b.f2332a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr3 == null) {
            c0848b.f2334c = null;
        } else {
            c0848b.f2334c = (String[]) strArr3.clone();
        }
        C0849c c0849c2 = new C0849c(c0848b);
        sSLSocket.setEnabledProtocols(c0849c2.f2339c);
        String[] strArr4 = c0849c2.f2338b;
        if (strArr4 != null) {
            sSLSocket.setEnabledCipherSuites(strArr4);
        }
        C0836q c0836q = C0836q.f2298c;
        boolean z = c0849c.f2340d;
        List list = f2301a;
        String strMo1734d = c0836q.mo1734d(sSLSocket, str, z ? list : null);
        if (strMo1734d.equals("http/1.0")) {
            enumC0858l = EnumC0858l.HTTP_1_0;
        } else if (strMo1734d.equals("http/1.1")) {
            enumC0858l = EnumC0858l.HTTP_1_1;
        } else if (strMo1734d.equals("h2")) {
            enumC0858l = EnumC0858l.HTTP_2;
        } else {
            if (!strMo1734d.equals("spdy/3.1")) {
                throw new IOException("Unexpected protocol: ".concat(strMo1734d));
            }
            enumC0858l = EnumC0858l.SPDY_3;
        }
        AbstractC0076b.m137l("Only " + list + " are supported, but negotiated protocol is %s", list.contains(enumC0858l), strMo1734d);
        if (C0851e.f2348a.verify((str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str, sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(str));
    }
}
