package p038V;

import androidx.webkit.ProxyConfig;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: V.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0851e implements HostnameVerifier {

    /* JADX INFO: renamed from: a */
    public static final C0851e f2348a = new C0851e();

    /* JADX INFO: renamed from: b */
    public static final Pattern f2349b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* JADX INFO: renamed from: a */
    public static List m1763a(X509Certificate x509Certificate, int i2) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i2 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX INFO: renamed from: b */
    public static boolean m1764b(String str, X509Certificate x509Certificate) {
        boolean z;
        boolean z2;
        String str2;
        char[] cArr;
        char c;
        int i2;
        char c2;
        boolean z3 = false;
        boolean z4 = true;
        if (f2349b.matcher(str).matches()) {
            List listM1763a = m1763a(x509Certificate, 7);
            int size = listM1763a.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (str.equalsIgnoreCase((String) listM1763a.get(i3))) {
                    return true;
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        char c3 = 2;
        List listM1763a2 = m1763a(x509Certificate, 2);
        int size2 = listM1763a2.size();
        int i4 = 0;
        boolean z5 = false;
        while (i4 < size2) {
            if (m1765c(lowerCase, (String) listM1763a2.get(i4))) {
                return true;
            }
            i4++;
            z5 = true;
        }
        if (!z5) {
            C0850d c0850d = new C0850d(x509Certificate.getSubjectX500Principal());
            c0850d.f2343c = 0;
            c0850d.f2344d = 0;
            c0850d.f2345e = 0;
            c0850d.f2346f = 0;
            String str3 = c0850d.f2341a;
            c0850d.f2347g = str3.toCharArray();
            String strM1762c = c0850d.m1762c();
            String str4 = null;
            if (strM1762c == null) {
                z = z3;
            } else {
                while (true) {
                    int i5 = c0850d.f2343c;
                    int i6 = c0850d.f2342b;
                    if (i5 == i6) {
                        break;
                    }
                    char c4 = c0850d.f2347g[i5];
                    char c5 = c3;
                    z = z3;
                    if (c4 == '\"') {
                        z2 = z4;
                        int i7 = i5 + 1;
                        c0850d.f2343c = i7;
                        c0850d.f2344d = i7;
                        c0850d.f2345e = i7;
                        while (true) {
                            int i8 = c0850d.f2343c;
                            if (i8 == i6) {
                                throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                            }
                            char[] cArr2 = c0850d.f2347g;
                            char c6 = cArr2[i8];
                            if (c6 == '\"') {
                                c0850d.f2343c = i8 + 1;
                                while (true) {
                                    int i9 = c0850d.f2343c;
                                    if (i9 >= i6 || c0850d.f2347g[i9] != ' ') {
                                        break;
                                    }
                                    c0850d.f2343c = i9 + 1;
                                }
                                char[] cArr3 = c0850d.f2347g;
                                int i10 = c0850d.f2344d;
                                str2 = new String(cArr3, i10, c0850d.f2345e - i10);
                                break;
                            }
                            if (c6 == '\\') {
                                cArr2[c0850d.f2345e] = c0850d.m1761b();
                            } else {
                                cArr2[c0850d.f2345e] = c6;
                            }
                            c0850d.f2343c++;
                            c0850d.f2345e++;
                        }
                    } else if (c4 == '#') {
                        z2 = z4;
                        if (i5 + 4 >= i6) {
                            throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                        }
                        c0850d.f2344d = i5;
                        c0850d.f2343c = i5 + 1;
                        while (true) {
                            int i11 = c0850d.f2343c;
                            if (i11 == i6 || (c = (cArr = c0850d.f2347g)[i11]) == '+' || c == ',' || c == ';') {
                                c0850d.f2345e = i11;
                                break;
                            }
                            if (c == ' ') {
                                c0850d.f2345e = i11;
                                c0850d.f2343c = i11 + 1;
                                while (true) {
                                    int i12 = c0850d.f2343c;
                                    if (i12 >= i6 || c0850d.f2347g[i12] != ' ') {
                                        break;
                                    }
                                    c0850d.f2343c = i12 + 1;
                                }
                            } else {
                                if (c >= 'A' && c <= 'F') {
                                    cArr[i11] = (char) (c + ' ');
                                }
                                c0850d.f2343c = i11 + 1;
                            }
                        }
                        int i13 = c0850d.f2345e;
                        int i14 = c0850d.f2344d;
                        int i15 = i13 - i14;
                        if (i15 < 5 || (i15 & 1) == 0) {
                            throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                        }
                        int i16 = i15 / 2;
                        byte[] bArr = new byte[i16];
                        int i17 = i14 + 1;
                        for (?? r12 = z; r12 < i16; r12++) {
                            bArr[r12] = (byte) c0850d.m1760a(i17);
                            i17 += 2;
                        }
                        str2 = new String(c0850d.f2347g, c0850d.f2344d, i15);
                    } else if (c4 == '+' || c4 == ',' || c4 == ';') {
                        z2 = z4;
                        str2 = "";
                    } else {
                        c0850d.f2344d = i5;
                        c0850d.f2345e = i5;
                        while (true) {
                            int i18 = c0850d.f2343c;
                            if (i18 >= i6) {
                                char[] cArr4 = c0850d.f2347g;
                                int i19 = c0850d.f2344d;
                                str2 = new String(cArr4, i19, c0850d.f2345e - i19);
                                z2 = z4;
                            } else {
                                char[] cArr5 = c0850d.f2347g;
                                char c7 = cArr5[i18];
                                if (c7 != ' ') {
                                    if (c7 != ';') {
                                        if (c7 == '\\') {
                                            z2 = z4;
                                            int i20 = c0850d.f2345e;
                                            c0850d.f2345e = i20 + 1;
                                            cArr5[i20] = c0850d.m1761b();
                                            c0850d.f2343c++;
                                        } else if (c7 != '+' && c7 != ',') {
                                            int i21 = c0850d.f2345e;
                                            z2 = z4;
                                            c0850d.f2345e = i21 + 1;
                                            cArr5[i21] = c7;
                                            c0850d.f2343c = i18 + 1;
                                        }
                                        z4 = z2;
                                    }
                                    z2 = z4;
                                    int i22 = c0850d.f2344d;
                                    str2 = new String(cArr5, i22, c0850d.f2345e - i22);
                                } else {
                                    z2 = z4;
                                    int i23 = c0850d.f2345e;
                                    c0850d.f2346f = i23;
                                    c0850d.f2343c = i18 + 1;
                                    c0850d.f2345e = i23 + 1;
                                    cArr5[i23] = ' ';
                                    while (true) {
                                        i2 = c0850d.f2343c;
                                        if (i2 >= i6) {
                                            break;
                                        }
                                        char[] cArr6 = c0850d.f2347g;
                                        if (cArr6[i2] != ' ') {
                                            break;
                                        }
                                        int i24 = c0850d.f2345e;
                                        c0850d.f2345e = i24 + 1;
                                        cArr6[i24] = ' ';
                                        c0850d.f2343c = i2 + 1;
                                    }
                                    if (i2 == i6 || (c2 = c0850d.f2347g[i2]) == ',' || c2 == '+' || c2 == ';') {
                                        char[] cArr7 = c0850d.f2347g;
                                        int i25 = c0850d.f2344d;
                                        str2 = new String(cArr7, i25, c0850d.f2346f - i25);
                                    } else {
                                        z4 = z2;
                                    }
                                }
                            }
                        }
                    }
                    if ("cn".equalsIgnoreCase(strM1762c)) {
                        str4 = str2;
                    } else {
                        int i26 = c0850d.f2343c;
                        if (i26 < i6) {
                            char c8 = c0850d.f2347g[i26];
                            if (c8 != ',' && c8 != ';' && c8 != '+') {
                                throw new IllegalStateException("Malformed DN: ".concat(str3));
                            }
                            c0850d.f2343c = i26 + 1;
                            strM1762c = c0850d.m1762c();
                            if (strM1762c == null) {
                                throw new IllegalStateException("Malformed DN: ".concat(str3));
                            }
                            c3 = c5;
                            z3 = z;
                            z4 = z2;
                        }
                    }
                }
                z = z3;
            }
            return str4 != null ? m1765c(lowerCase, str4) : z;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1765c(String str, String str2) {
        if (str == null || str.length() == 0 || str.startsWith(".") || str.endsWith("..") || str2 == null || str2.length() == 0 || str2.startsWith(".") || str2.endsWith("..")) {
            return false;
        }
        if (!str.endsWith(".")) {
            str = str.concat(".");
        }
        if (!str2.endsWith(".")) {
            str2 = str2.concat(".");
        }
        String lowerCase = str2.toLowerCase(Locale.US);
        if (!lowerCase.contains(ProxyConfig.MATCH_ALL_SCHEMES)) {
            return str.equals(lowerCase);
        }
        if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
            return false;
        }
        String strSubstring = lowerCase.substring(1);
        if (!str.endsWith(strSubstring)) {
            return false;
        }
        int length = str.length() - strSubstring.length();
        return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return m1764b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
