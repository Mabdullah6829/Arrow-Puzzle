package p036U;

import androidx.browser.trusted.sharing.ShareTarget;
import androidx.webkit.ProxyConfig;
import p033S0.C0616j;
import p034T.AbstractC0759m0;
import p039W.C0862b;

/* JADX INFO: renamed from: U.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0824e {

    /* JADX INFO: renamed from: a */
    public static final C0862b f2173a;

    /* JADX INFO: renamed from: b */
    public static final C0862b f2174b;

    /* JADX INFO: renamed from: c */
    public static final C0862b f2175c;

    /* JADX INFO: renamed from: d */
    public static final C0862b f2176d;

    /* JADX INFO: renamed from: e */
    public static final C0862b f2177e;

    /* JADX INFO: renamed from: f */
    public static final C0862b f2178f;

    static {
        C0616j c0616j = C0862b.f2402g;
        f2173a = new C0862b(c0616j, ProxyConfig.MATCH_HTTPS);
        f2174b = new C0862b(c0616j, ProxyConfig.MATCH_HTTP);
        C0616j c0616j2 = C0862b.f2400e;
        f2175c = new C0862b(c0616j2, ShareTarget.METHOD_POST);
        f2176d = new C0862b(c0616j2, ShareTarget.METHOD_GET);
        f2177e = new C0862b(AbstractC0759m0.f1927i.f1162a, "application/grpc");
        f2178f = new C0862b("te", "trailers");
    }
}
