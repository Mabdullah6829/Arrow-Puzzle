package p003C;

import androidx.webkit.ProxyConfig;
import java.io.Serializable;
import java.net.ProtocolException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0243G;
import p021M0.C0341f;
import p021M0.InterfaceC0339d;
import p029Q0.C0510j;
import p038V.EnumC0858l;

/* JADX INFO: renamed from: C.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C0118i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f172a;

    /* JADX INFO: renamed from: b */
    public Serializable f173b;

    /* JADX INFO: renamed from: c */
    public int f174c;

    /* JADX INFO: renamed from: d */
    public Object f175d;

    /* JADX INFO: renamed from: c */
    public static C0118i m197c(String str) throws ProtocolException {
        int i2;
        String strSubstring;
        boolean zStartsWith = str.startsWith("HTTP/1.");
        EnumC0858l enumC0858l = EnumC0858l.HTTP_1_0;
        if (zStartsWith) {
            i2 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                enumC0858l = EnumC0858l.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i2 = 4;
        }
        int i3 = i2 + 3;
        if (str.length() < i3) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i4 = Integer.parseInt(str.substring(i2, i3));
            if (str.length() <= i3) {
                strSubstring = "";
            } else {
                if (str.charAt(i3) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i2 + 4);
            }
            return new C0118i(enumC0858l, i4, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: a */
    public C0134y m198a(boolean z) {
        C0117h c0117h;
        C0117h c0117h2;
        if (z && (c0117h2 = (C0117h) this.f175d) != null) {
            throw c0117h2.m196a();
        }
        C0134y c0134yM211b = C0134y.m211b(this.f174c, (Object[]) this.f173b, this);
        if (!z || (c0117h = (C0117h) this.f175d) == null) {
            return c0134yM211b;
        }
        throw c0117h.m196a();
    }

    /* JADX INFO: renamed from: b */
    public String m199b() {
        StringBuilder sb = new StringBuilder("$");
        int i2 = this.f174c + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = ((Object[]) this.f173b)[i3];
            if (obj instanceof InterfaceC0339d) {
                InterfaceC0339d interfaceC0339d = (InterfaceC0339d) obj;
                if (!AbstractC6452k.m12177a(interfaceC0339d.getKind(), C0341f.f681c)) {
                    int i4 = ((int[]) this.f175d)[i3];
                    if (i4 >= 0) {
                        sb.append(".");
                        sb.append(interfaceC0339d.mo500f(i4));
                    }
                } else if (((int[]) this.f175d)[i3] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f175d)[i3]);
                    sb.append("]");
                }
            } else if (obj != C0510j.f1066a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        String string = sb.toString();
        AbstractC6452k.m12180d(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX INFO: renamed from: d */
    public void m200d(Object obj, Object obj2) {
        int i2 = (this.f174c + 1) * 2;
        Object[] objArr = (Object[]) this.f173b;
        if (i2 > objArr.length) {
            this.f173b = Arrays.copyOf(objArr, AbstractC0110a.m184b(objArr.length, i2));
        }
        AbstractC0243G.m369g(obj, obj2);
        Object[] objArr2 = (Object[]) this.f173b;
        int i3 = this.f174c;
        int i4 = i3 * 2;
        objArr2[i4] = obj;
        objArr2[i4 + 1] = obj2;
        this.f174c = i3 + 1;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX INFO: renamed from: e */
    public void m201e(Set set) {
        if (set != null) {
            int size = (set.size() + this.f174c) * 2;
            Object[] objArr = (Object[]) this.f173b;
            if (size > objArr.length) {
                this.f173b = Arrays.copyOf(objArr, AbstractC0110a.m184b(objArr.length, size));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            m200d(entry.getKey(), entry.getValue());
        }
    }

    public String toString() {
        switch (this.f172a) {
            case 1:
                return m199b();
            case 2:
                String str = (String) this.f175d;
                StringBuilder sb = new StringBuilder();
                sb.append(((EnumC0858l) this.f173b) == EnumC0858l.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
                sb.append(' ');
                sb.append(this.f174c);
                if (str != null) {
                    sb.append(' ');
                    sb.append(str);
                }
                return sb.toString();
            case 3:
                StringBuilder sb2 = new StringBuilder();
                sb2.append((String) this.f173b);
                sb2.append("://");
                int i2 = -1;
                if (((String) this.f175d).indexOf(58) != -1) {
                    sb2.append('[');
                    sb2.append((String) this.f175d);
                    sb2.append(']');
                } else {
                    sb2.append((String) this.f175d);
                }
                int i3 = this.f174c;
                if (i3 == -1) {
                    String str2 = (String) this.f173b;
                    if (str2.equals(ProxyConfig.MATCH_HTTP)) {
                        i3 = 80;
                    } else {
                        i3 = str2.equals(ProxyConfig.MATCH_HTTPS) ? 443 : -1;
                    }
                }
                String str3 = (String) this.f173b;
                if (str3.equals(ProxyConfig.MATCH_HTTP)) {
                    i2 = 80;
                } else if (str3.equals(ProxyConfig.MATCH_HTTPS)) {
                    i2 = 443;
                }
                if (i3 != i2) {
                    sb2.append(':');
                    sb2.append(i3);
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public C0118i(EnumC0858l enumC0858l, int i2, String str) {
        this.f172a = 2;
        this.f173b = enumC0858l;
        this.f174c = i2;
        this.f175d = str;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Serializable, java.lang.Object[]] */
    public C0118i(int i2) {
        this.f172a = 0;
        this.f173b = new Object[i2 * 2];
        this.f174c = 0;
    }
}
