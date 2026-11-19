package p011H;

import kotlin.jvm.internal.AbstractC6452k;
import p078p0.InterfaceC6498l;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: H.e0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0271e0 {
    /* JADX INFO: renamed from: a */
    public static double m393a(double d, double d2, double d3) {
        return (Math.sin(d) * d2) + d3;
    }

    /* JADX INFO: renamed from: b */
    public static float m394b(float f2, float f3, float f4, float f5) {
        return ((f2 - f3) * f4) + f5;
    }

    /* JADX INFO: renamed from: c */
    public static int m395c(int i2, int i3, int i4, int i5) {
        return i2 + i3 + i4 + i5;
    }

    /* JADX INFO: renamed from: d */
    public static String m396d(int i2, String str) {
        return str + i2;
    }

    /* JADX INFO: renamed from: e */
    public static String m397e(int i2, String str, String str2) {
        return str + i2 + str2;
    }

    /* JADX INFO: renamed from: f */
    public static String m398f(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: g */
    public static String m399g(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: h */
    public static String m400h(StringBuilder sb, char c, String str) {
        sb.append(c);
        String string = sb.toString();
        AbstractC6452k.m12180d(string, str);
        return string;
    }

    /* JADX INFO: renamed from: i */
    public static String m401i(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public static String m402j(StringBuilder sb, String str, int i2) {
        sb.append(i2);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: k */
    public static String m403k(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: l */
    public static StringBuilder m404l(int i2, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i2);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: m */
    public static StringBuilder m405m(CharSequence charSequence, String str, CharSequence charSequence2, String str2, CharSequence charSequence3) {
        AbstractC6452k.m12181e(charSequence, str);
        AbstractC6452k.m12181e(charSequence2, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence3);
        return sb;
    }

    /* JADX INFO: renamed from: n */
    public static StringBuilder m406n(CharSequence charSequence, String str, InterfaceC6498l interfaceC6498l, String str2, CharSequence charSequence2) {
        AbstractC6452k.m12181e(charSequence, str);
        AbstractC6452k.m12181e(interfaceC6498l, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        return sb;
    }

    /* JADX INFO: renamed from: o */
    public static StringBuilder m407o(CharSequence charSequence, String str, InterfaceC6502p interfaceC6502p, String str2, CharSequence charSequence2) {
        AbstractC6452k.m12181e(charSequence, str);
        AbstractC6452k.m12181e(interfaceC6502p, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        return sb;
    }

    /* JADX INFO: renamed from: p */
    public static StringBuilder m408p(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* JADX INFO: renamed from: q */
    public static StringBuilder m409q(String str, int i2, String str2, int i3, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i3);
        sb.append(str3);
        return sb;
    }

    /* JADX INFO: renamed from: r */
    public static StringBuilder m410r(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: s */
    public static StringBuilder m411s(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    /* JADX INFO: renamed from: t */
    public static void m412t(int i2, int i3, InterfaceC6498l interfaceC6498l) {
        interfaceC6498l.invoke(Integer.valueOf(i2 + i3));
    }

    /* JADX INFO: renamed from: u */
    public static void m413u(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    /* JADX INFO: renamed from: v */
    public static String m414v(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: w */
    public static String m415w(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ String m416x(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? "null" : "PLAINTEXT";
        }
        return "TLS";
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ String m417y(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? "null" : "OUTBOUND";
        }
        return "INBOUND";
    }
}
