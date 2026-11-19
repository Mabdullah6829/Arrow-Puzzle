package p038V;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p011H.AbstractC0271e0;

/* JADX INFO: renamed from: V.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0849c {

    /* JADX INFO: renamed from: e */
    public static final C0849c f2336e;

    /* JADX INFO: renamed from: a */
    public final boolean f2337a;

    /* JADX INFO: renamed from: b */
    public final String[] f2338b;

    /* JADX INFO: renamed from: c */
    public final String[] f2339c;

    /* JADX INFO: renamed from: d */
    public final boolean f2340d;

    static {
        EnumC0847a[] enumC0847aArr = {EnumC0847a.f2320G, EnumC0847a.f2321H, EnumC0847a.f2322I, EnumC0847a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, EnumC0847a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, EnumC0847a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, EnumC0847a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, EnumC0847a.f2319F, EnumC0847a.f2318E, EnumC0847a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, EnumC0847a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, EnumC0847a.TLS_RSA_WITH_AES_128_GCM_SHA256, EnumC0847a.TLS_RSA_WITH_AES_256_GCM_SHA384, EnumC0847a.TLS_RSA_WITH_AES_128_CBC_SHA, EnumC0847a.TLS_RSA_WITH_AES_256_CBC_SHA, EnumC0847a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        C0848b c0848b = new C0848b(true);
        c0848b.m1758a(enumC0847aArr);
        EnumC0859m enumC0859m = EnumC0859m.TLS_1_3;
        EnumC0859m enumC0859m2 = EnumC0859m.TLS_1_2;
        c0848b.m1759b(enumC0859m, enumC0859m2);
        if (!c0848b.f2332a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        c0848b.f2335d = true;
        C0849c c0849c = new C0849c(c0848b);
        f2336e = c0849c;
        EnumC0859m[] enumC0859mArr = {enumC0859m, enumC0859m2, EnumC0859m.TLS_1_1, EnumC0859m.TLS_1_0};
        boolean z = c0849c.f2337a;
        if (!z) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (enumC0859mArr.length == 0) {
            throw new IllegalArgumentException("At least one TlsVersion is required");
        }
        String[] strArr = new String[enumC0859mArr.length];
        for (int i2 = 0; i2 < enumC0859mArr.length; i2++) {
            strArr[i2] = enumC0859mArr[i2].f2382s;
        }
        if (!z) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
    }

    public C0849c(C0848b c0848b) {
        this.f2337a = c0848b.f2332a;
        this.f2338b = c0848b.f2333b;
        this.f2339c = c0848b.f2334c;
        this.f2340d = c0848b.f2335d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0849c)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0849c c0849c = (C0849c) obj;
        boolean z = c0849c.f2337a;
        boolean z2 = this.f2337a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.f2338b, c0849c.f2338b) && Arrays.equals(this.f2339c, c0849c.f2339c) && this.f2340d == c0849c.f2340d;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f2337a) {
            return ((((527 + Arrays.hashCode(this.f2338b)) * 31) + Arrays.hashCode(this.f2339c)) * 31) + (!this.f2340d ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List listUnmodifiableList;
        EnumC0859m enumC0859m;
        if (!this.f2337a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f2338b;
        if (strArr == null) {
            listUnmodifiableList = null;
        } else {
            EnumC0847a[] enumC0847aArr = new EnumC0847a[strArr.length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                String str = strArr[i2];
                enumC0847aArr[i2] = str.startsWith("SSL_") ? EnumC0847a.valueOf("TLS_" + str.substring(4)) : EnumC0847a.valueOf(str);
            }
            String[] strArr2 = AbstractC0860n.f2383a;
            listUnmodifiableList = Collections.unmodifiableList(Arrays.asList((Object[]) enumC0847aArr.clone()));
        }
        StringBuilder sbM411s = AbstractC0271e0.m411s("ConnectionSpec(cipherSuites=", listUnmodifiableList == null ? "[use default]" : listUnmodifiableList.toString(), ", tlsVersions=");
        String[] strArr3 = this.f2339c;
        EnumC0859m[] enumC0859mArr = new EnumC0859m[strArr3.length];
        for (int i3 = 0; i3 < strArr3.length; i3++) {
            String str2 = strArr3[i3];
            if ("TLSv1.3".equals(str2)) {
                enumC0859m = EnumC0859m.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                enumC0859m = EnumC0859m.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                enumC0859m = EnumC0859m.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                enumC0859m = EnumC0859m.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    throw new IllegalArgumentException(AbstractC0271e0.m398f("Unexpected TLS version: ", str2));
                }
                enumC0859m = EnumC0859m.SSL_3_0;
            }
            enumC0859mArr[i3] = enumC0859m;
        }
        String[] strArr4 = AbstractC0860n.f2383a;
        sbM411s.append(Collections.unmodifiableList(Arrays.asList((Object[]) enumC0859mArr.clone())));
        sbM411s.append(", supportsTlsExtensions=");
        sbM411s.append(this.f2340d);
        sbM411s.append(")");
        return sbM411s.toString();
    }
}
