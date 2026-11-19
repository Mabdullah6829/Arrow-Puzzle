package p011H;

import android.os.Build;
import android.util.Log;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6463v;
import p000A0.AbstractC0069y;
import p003C.AbstractC0116g;
import p003C.C0124o;
import p003C.C0126q;
import p004C0.C0144i;
import p004C0.C0145j;
import p004C0.C0147l;
import p004C0.InterfaceC0154s;
import p057d0.C6286h;
import p057d0.C6287i;
import p057d0.C6288j;
import p057d0.EnumC6282d;
import p057d0.InterfaceC6281c;
import p078p0.InterfaceC6487a;
import p087v0.C6545d;

/* JADX INFO: renamed from: H.F */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0242F {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f482a;

    public /* synthetic */ AbstractC0242F(int i2) {
        this.f482a = i2;
    }

    /* JADX INFO: renamed from: a */
    public static void m346a(int i2) {
        if (2 > i2 || i2 >= 37) {
            StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "radix ", " was not in valid range ");
            sbM404l.append(new C6545d(2, 36, 1));
            throw new IllegalArgumentException(sbM404l.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m347b(long j2, long j3) {
        long j4 = j2 + j3;
        AbstractC0243G.m370h(((j2 ^ j3) < 0) | ((j2 ^ j4) >= 0), "checkedAdd", j2, j3);
        return j4;
    }

    /* JADX INFO: renamed from: c */
    public static long m348c(long j2, long j3) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j3) + Long.numberOfLeadingZeros(j3) + Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2);
        if (iNumberOfLeadingZeros > 65) {
            return j2 * j3;
        }
        AbstractC0243G.m370h(iNumberOfLeadingZeros >= 64, "checkedMultiply", j2, j3);
        AbstractC0243G.m370h((j2 >= 0) | (j3 != Long.MIN_VALUE), "checkedMultiply", j2, j3);
        long j4 = j2 * j3;
        AbstractC0243G.m370h(j2 == 0 || j4 / j2 == j3, "checkedMultiply", j2, j3);
        return j4;
    }

    /* JADX INFO: renamed from: d */
    public static long m349d(long j2, long j3) {
        long j4 = j2 - j3;
        AbstractC0243G.m370h(((j2 ^ j3) >= 0) | ((j2 ^ j4) >= 0), "checkedSubtract", j2, j3);
        return j4;
    }

    /* JADX INFO: renamed from: f */
    public static void m350f(String str, String str2, Object obj) {
        String strM355l = m355l(str);
        if (Log.isLoggable(strM355l, 3)) {
            Log.d(strM355l, String.format(str2, obj));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m351h(String str, String str2, Exception exc) {
        String strM355l = m355l(str);
        if (Log.isLoggable(strM355l, 6)) {
            Log.e(strM355l, str2, exc);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m352i(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX INFO: renamed from: j */
    public static int m353j(double d, long j2) {
        if (Double.isNaN(d) || d < -9.223372036854776E18d) {
            return -1;
        }
        if (d >= 9.223372036854776E18d) {
            return 1;
        }
        int iCompare = Long.compare((long) d, j2);
        return iCompare != 0 ? iCompare : m354k(d, j2);
    }

    /* JADX INFO: renamed from: k */
    public static int m354k(double d, double d2) {
        if (d < d2) {
            return -1;
        }
        if (d > d2) {
            return 1;
        }
        if (d == d2) {
            return 0;
        }
        if (Double.isNaN(d2)) {
            return !Double.isNaN(d) ? 1 : 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public static String m355l(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    /* JADX INFO: renamed from: m */
    public static InterfaceC6281c m356m(InterfaceC6487a interfaceC6487a) {
        EnumC6282d[] enumC6282dArr = EnumC6282d.f24307s;
        C6288j c6288j = C6288j.f24317a;
        C6286h c6286h = new C6286h();
        c6286h.f24312s = interfaceC6487a;
        c6286h.f24313t = c6288j;
        return c6286h;
    }

    /* JADX INFO: renamed from: n */
    public static C6287i m357n(InterfaceC6487a initializer) {
        AbstractC6452k.m12181e(initializer, "initializer");
        return new C6287i(initializer);
    }

    /* JADX INFO: renamed from: o */
    public static String m358o(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(str.charAt(i2));
            if (str2.length() > i2) {
                sb.append(str2.charAt(i2));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: p */
    public static List m359p(List list) {
        if (list instanceof AbstractC0116g) {
            return ((AbstractC0116g) list).mo189t();
        }
        if (list instanceof C0126q) {
            return ((C0126q) list).f190s;
        }
        return list instanceof RandomAccess ? new C0124o(list) : new C0126q(list);
    }

    /* JADX INFO: renamed from: q */
    public static final void m360q(InterfaceC0154s interfaceC0154s, Object obj) {
        Object objMo227g = interfaceC0154s.mo227g(obj);
        if (objMo227g instanceof C0144i) {
            Object obj2 = ((C0145j) AbstractC0069y.m115n(new C0147l(interfaceC0154s, obj, null))).f257a;
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo361e(C0241E c0241e, Set set);

    /* JADX INFO: renamed from: g */
    public abstract int mo362g(C0241E c0241e);

    public int hashCode() {
        switch (this.f482a) {
            case 6:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f482a) {
            case 6:
                String strM12176b = AbstractC6463v.m12189a(getClass()).m12176b();
                AbstractC6452k.m12178b(strM12176b);
                return strM12176b;
            default:
                return super.toString();
        }
    }
}
