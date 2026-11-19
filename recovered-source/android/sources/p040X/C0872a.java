package p040X;

import androidx.webkit.ProxyConfig;
import p003C.C0118i;

/* JADX INFO: renamed from: X.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0872a {

    /* JADX INFO: renamed from: a */
    public final String f2446a;

    /* JADX INFO: renamed from: b */
    public final int f2447b;

    /* JADX INFO: renamed from: c */
    public final String f2448c;

    public C0872a(C0118i c0118i) {
        String str = (String) c0118i.f173b;
        this.f2446a = (String) c0118i.f175d;
        int i2 = c0118i.f174c;
        this.f2447b = i2 == -1 ? str.equals(ProxyConfig.MATCH_HTTP) ? 80 : str.equals(ProxyConfig.MATCH_HTTPS) ? 443 : -1 : i2;
        this.f2448c = c0118i.toString();
    }

    /* JADX INFO: renamed from: a */
    public static int m1794a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0872a) && ((C0872a) obj).f2448c.equals(this.f2448c);
    }

    public final int hashCode() {
        return this.f2448c.hashCode();
    }

    public final String toString() {
        return this.f2448c;
    }
}
