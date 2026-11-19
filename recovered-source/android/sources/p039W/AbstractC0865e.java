package p039W;

import androidx.browser.trusted.sharing.ShareTarget;
import androidx.webkit.ProxyConfig;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p033S0.AbstractC0608b;
import p033S0.C0616j;

/* JADX INFO: renamed from: W.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0865e {

    /* JADX INFO: renamed from: a */
    public static final C0616j f2420a;

    /* JADX INFO: renamed from: b */
    public static final C0862b[] f2421b;

    /* JADX INFO: renamed from: c */
    public static final Map f2422c;

    static {
        C0616j c0616j = C0616j.f1343v;
        f2420a = AbstractC0608b.m1371d(":");
        C0862b c0862b = new C0862b(C0862b.f2403h, "");
        C0616j c0616j2 = C0862b.f2400e;
        C0862b c0862b2 = new C0862b(c0616j2, ShareTarget.METHOD_GET);
        C0862b c0862b3 = new C0862b(c0616j2, ShareTarget.METHOD_POST);
        C0616j c0616j3 = C0862b.f2401f;
        C0862b c0862b4 = new C0862b(c0616j3, "/");
        C0862b c0862b5 = new C0862b(c0616j3, "/index.html");
        C0616j c0616j4 = C0862b.f2402g;
        C0862b c0862b6 = new C0862b(c0616j4, ProxyConfig.MATCH_HTTP);
        C0862b c0862b7 = new C0862b(c0616j4, ProxyConfig.MATCH_HTTPS);
        C0616j c0616j5 = C0862b.f2399d;
        C0862b[] c0862bArr = {c0862b, c0862b2, c0862b3, c0862b4, c0862b5, c0862b6, c0862b7, new C0862b(c0616j5, "200"), new C0862b(c0616j5, "204"), new C0862b(c0616j5, "206"), new C0862b(c0616j5, "304"), new C0862b(c0616j5, "400"), new C0862b(c0616j5, "404"), new C0862b(c0616j5, "500"), new C0862b("accept-charset", ""), new C0862b("accept-encoding", "gzip, deflate"), new C0862b("accept-language", ""), new C0862b("accept-ranges", ""), new C0862b("accept", ""), new C0862b("access-control-allow-origin", ""), new C0862b("age", ""), new C0862b("allow", ""), new C0862b("authorization", ""), new C0862b("cache-control", ""), new C0862b("content-disposition", ""), new C0862b("content-encoding", ""), new C0862b("content-language", ""), new C0862b("content-length", ""), new C0862b("content-location", ""), new C0862b("content-range", ""), new C0862b("content-type", ""), new C0862b("cookie", ""), new C0862b("date", ""), new C0862b("etag", ""), new C0862b("expect", ""), new C0862b("expires", ""), new C0862b("from", ""), new C0862b("host", ""), new C0862b("if-match", ""), new C0862b("if-modified-since", ""), new C0862b("if-none-match", ""), new C0862b("if-range", ""), new C0862b("if-unmodified-since", ""), new C0862b("last-modified", ""), new C0862b("link", ""), new C0862b(FirebaseAnalytics.Param.LOCATION, ""), new C0862b("max-forwards", ""), new C0862b("proxy-authenticate", ""), new C0862b("proxy-authorization", ""), new C0862b("range", ""), new C0862b("referer", ""), new C0862b("refresh", ""), new C0862b("retry-after", ""), new C0862b("server", ""), new C0862b("set-cookie", ""), new C0862b("strict-transport-security", ""), new C0862b("transfer-encoding", ""), new C0862b("user-agent", ""), new C0862b("vary", ""), new C0862b("via", ""), new C0862b("www-authenticate", "")};
        f2421b = c0862bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i2 = 0; i2 < 61; i2++) {
            if (!linkedHashMap.containsKey(c0862bArr[i2].f2404a)) {
                linkedHashMap.put(c0862bArr[i2].f2404a, Integer.valueOf(i2));
            }
        }
        f2422c = Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: a */
    public static void m1780a(C0616j c0616j) throws IOException {
        int iMo1404e = c0616j.mo1404e();
        for (int i2 = 0; i2 < iMo1404e; i2++) {
            byte bMo1408j = c0616j.mo1408j(i2);
            if (bMo1408j >= 65 && bMo1408j <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c0616j.m1415t()));
            }
        }
    }
}
