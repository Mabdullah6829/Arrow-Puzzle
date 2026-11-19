package p001B;

import com.google.common.base.VerifyException;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import p011H.AbstractC0271e0;

/* JADX INFO: renamed from: B.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0076b {
    /* JADX INFO: renamed from: a */
    public static String m126a(int i2, int i3, String str) {
        if (i2 < 0) {
            return m141p("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return m141p("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(AbstractC0271e0.m396d(i3, "negative size: "));
    }

    /* JADX INFO: renamed from: b */
    public static void m127b(int i2, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(m141p(str, Integer.valueOf(i2)));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m128c(long j2, boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(m141p(str, Long.valueOf(j2)));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m129d(String str, boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(m141p(str, obj));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m130e(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m131f(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m132g(int i2, int i3) {
        String strM141p;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                strM141p = m141p("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    throw new IllegalArgumentException(AbstractC0271e0.m396d(i3, "negative size: "));
                }
                strM141p = m141p("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strM141p);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m133h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m134i(Object obj, String str, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(m141p(str, obj2));
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m135j(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(m126a(i2, i3, FirebaseAnalytics.Param.INDEX));
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m136k(int i2, int i3, int i4) {
        String strM126a;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 < 0 || i2 > i4) {
                strM126a = m126a(i2, i4, "start index");
            } else {
                strM126a = (i3 < 0 || i3 > i4) ? m126a(i3, i4, "end index") : m141p("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM126a);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m137l(String str, boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(m141p(str, obj));
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m138m(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m139n(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    /* JADX INFO: renamed from: o */
    public static boolean m140o(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public static String m141p(String str, Object... objArr) {
        int iIndexOf;
        String string;
        String strValueOf = String.valueOf(str);
        int i2 = 0;
        for (int i3 = 0; i3 < objArr.length; i3++) {
            Object obj = objArr[i3];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e);
                    StringBuilder sbM411s = AbstractC0271e0.m411s("<", str2, " threw ");
                    sbM411s.append(e.getClass().getName());
                    sbM411s.append(">");
                    string = sbM411s.toString();
                }
            }
            objArr[i3] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i4 = 0;
        while (i2 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i4)) != -1) {
            sb.append((CharSequence) strValueOf, i4, iIndexOf);
            sb.append(objArr[i2]);
            i4 = iIndexOf + 2;
            i2++;
        }
        sb.append((CharSequence) strValueOf, i4, strValueOf.length());
        if (i2 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb.append(", ");
                sb.append(objArr[i5]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: r */
    public static InterfaceC0097w m142r(InterfaceC0097w interfaceC0097w) {
        if ((interfaceC0097w instanceof C0100z) || (interfaceC0097w instanceof C0098x)) {
            return interfaceC0097w;
        }
        if (interfaceC0097w instanceof Serializable) {
            return new C0098x(interfaceC0097w);
        }
        C0100z c0100z = new C0100z();
        interfaceC0097w.getClass();
        c0100z.f146s = interfaceC0097w;
        return c0100z;
    }

    /* JADX INFO: renamed from: s */
    public static C0087m m143s(Object obj) {
        return new C0087m(obj.getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: t */
    public static void m144t(String str, boolean z, Object obj) {
        if (!z) {
            throw new VerifyException(m141p(str, obj));
        }
    }

    /* JADX INFO: renamed from: q */
    public abstract boolean mo145q(char c);
}
