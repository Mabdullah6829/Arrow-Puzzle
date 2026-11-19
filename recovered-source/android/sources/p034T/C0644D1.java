package p034T;

import androidx.webkit.ProxyConfig;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001B.AbstractC0076b;
import p001B.InterfaceC0097w;
import p030R.C0523E;
import p030R.InterfaceC0579r0;

/* JADX INFO: renamed from: T.D1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0644D1 implements InterfaceC0579r0 {

    /* JADX INFO: renamed from: d */
    public static final Logger f1436d = Logger.getLogger(C0644D1.class.getName());

    /* JADX INFO: renamed from: e */
    public static final C0785s2 f1437e = new C0785s2(15);

    /* JADX INFO: renamed from: f */
    public static final C0785s2 f1438f = new C0785s2(16);

    /* JADX INFO: renamed from: a */
    public final InterfaceC0097w f1439a;

    /* JADX INFO: renamed from: b */
    public final C0785s2 f1440b;

    /* JADX INFO: renamed from: c */
    public final InetSocketAddress f1441c;

    public C0644D1() {
        String str = System.getenv("GRPC_PROXY_EXP");
        C0785s2 c0785s2 = f1438f;
        c0785s2.getClass();
        this.f1439a = c0785s2;
        C0785s2 c0785s3 = f1437e;
        c0785s3.getClass();
        this.f1440b = c0785s3;
        if (str == null) {
            this.f1441c = null;
            return;
        }
        String[] strArrSplit = str.split(":", 2);
        int i2 = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 80;
        f1436d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        this.f1441c = new InetSocketAddress(strArrSplit[0], i2);
    }

    @Override // p030R.InterfaceC0579r0
    /* JADX INFO: renamed from: a */
    public final C0523E mo1340a(InetSocketAddress inetSocketAddress) {
        URL url;
        C0523E c0523e;
        if (inetSocketAddress != null) {
            InetSocketAddress inetSocketAddress2 = this.f1441c;
            if (inetSocketAddress2 != null) {
                int i2 = C0523E.f1104w;
                AbstractC0076b.m133h(inetSocketAddress, "targetAddress");
                return new C0523E(inetSocketAddress2, inetSocketAddress, null, null);
            }
            Logger logger = f1436d;
            try {
                try {
                    URI uri = new URI(ProxyConfig.MATCH_HTTPS, null, AbstractC0759m0.m1623d(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                    ProxySelector proxySelector = (ProxySelector) this.f1439a.get();
                    if (proxySelector == null) {
                        logger.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                        return null;
                    }
                    List<Proxy> listSelect = proxySelector.select(uri);
                    if (listSelect.size() > 1) {
                        logger.warning("More than 1 proxy detected, gRPC will select the first one");
                    }
                    Proxy proxy = listSelect.get(0);
                    if (proxy.type() != Proxy.Type.DIRECT) {
                        InetSocketAddress inetSocketAddress3 = (InetSocketAddress) proxy.address();
                        String strM1623d = AbstractC0759m0.m1623d(inetSocketAddress3);
                        InetAddress address = inetSocketAddress3.getAddress();
                        int port = inetSocketAddress3.getPort();
                        this.f1440b.getClass();
                        try {
                            url = new URL(ProxyConfig.MATCH_HTTPS, strM1623d, port, "");
                        } catch (MalformedURLException unused) {
                            logger.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{ProxyConfig.MATCH_HTTPS, strM1623d});
                            url = null;
                        }
                        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strM1623d, address, port, ProxyConfig.MATCH_HTTPS, "", null, url, Authenticator.RequestorType.PROXY);
                        if (inetSocketAddress3.isUnresolved()) {
                            inetSocketAddress3 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress3.getHostName()), inetSocketAddress3.getPort());
                        }
                        int i3 = C0523E.f1104w;
                        if (passwordAuthenticationRequestPasswordAuthentication == null) {
                            c0523e = new C0523E(inetSocketAddress3, inetSocketAddress, null, null);
                        } else {
                            c0523e = new C0523E(inetSocketAddress3, inetSocketAddress, passwordAuthenticationRequestPasswordAuthentication.getUserName(), passwordAuthenticationRequestPasswordAuthentication.getPassword() != null ? new String(passwordAuthenticationRequestPasswordAuthentication.getPassword()) : null);
                        }
                        return c0523e;
                    }
                } catch (URISyntaxException e) {
                    logger.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e);
                    return null;
                }
            } catch (Throwable th) {
                logger.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
                return null;
            }
        }
        return null;
    }
}
