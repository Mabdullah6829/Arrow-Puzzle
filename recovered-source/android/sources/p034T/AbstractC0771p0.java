package p034T;

import java.nio.charset.Charset;
import java.util.Locale;
import p001B.AbstractC0081g;
import p030R.AbstractC0530L;
import p030R.C0555f0;
import p030R.C0559h0;
import p030R.C0589w0;

/* JADX INFO: renamed from: T.p0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0771p0 extends AbstractC0714b {

    /* JADX INFO: renamed from: u */
    public static final C0555f0 f1994u = AbstractC0530L.m1255a(":status", new C0785s2(13));

    /* JADX INFO: renamed from: q */
    public C0589w0 f1995q;

    /* JADX INFO: renamed from: r */
    public C0559h0 f1996r;

    /* JADX INFO: renamed from: s */
    public Charset f1997s;

    /* JADX INFO: renamed from: t */
    public boolean f1998t;

    /* JADX INFO: renamed from: h */
    public static Charset m1649h(C0559h0 c0559h0) {
        String str = (String) c0559h0.m1307c(AbstractC0759m0.f1927i);
        if (str != null) {
            String[] strArrSplit = str.split("charset=", 2);
            try {
                return Charset.forName(strArrSplit[strArrSplit.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return AbstractC0081g.f108b;
    }

    /* JADX INFO: renamed from: i */
    public static C0589w0 m1650i(C0559h0 c0559h0) {
        char cCharAt;
        Integer num = (Integer) c0559h0.m1307c(f1994u);
        if (num == null) {
            return C0589w0.f1283m.m1354g("Missing HTTP status code");
        }
        String str = (String) c0559h0.m1307c(AbstractC0759m0.f1927i);
        if (str != null && 16 <= str.length()) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';')) {
                return null;
            }
        }
        return AbstractC0759m0.m1626g(num.intValue()).m1351a("invalid content-type: " + str);
    }
}
