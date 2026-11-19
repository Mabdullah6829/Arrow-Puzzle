package p058e0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0243G;
import p022N.AbstractC0355G;
import p037U0.AbstractC0846b;
import p078p0.InterfaceC6498l;
import p089x0.C6559b;
import p089x0.InterfaceC6563f;

/* JADX INFO: renamed from: e0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6302j extends AbstractC0355G {
    /* JADX INFO: renamed from: A */
    public static void m12090A(Object[] objArr, int i2, int i3) {
        AbstractC6452k.m12181e(objArr, "<this>");
        Arrays.fill(objArr, i2, i3, (Object) null);
    }

    /* JADX INFO: renamed from: B */
    public static void m12091B(long[] jArr) {
        int length = jArr.length;
        AbstractC6452k.m12181e(jArr, "<this>");
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }

    /* JADX INFO: renamed from: C */
    public static int m12092C(Object[] objArr, Object obj) {
        AbstractC6452k.m12181e(objArr, "<this>");
        int i2 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i2 < length) {
                if (objArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i2 < length2) {
            if (obj.equals(objArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: D */
    public static String m12093D(Object[] objArr, InterfaceC6498l interfaceC6498l) {
        AbstractC6452k.m12181e(objArr, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) ",");
            }
            AbstractC0243G.m366d(sb, obj, interfaceC6498l);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    /* JADX INFO: renamed from: E */
    public static List m12094E(Object[] objArr) {
        AbstractC6452k.m12181e(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? new ArrayList(new C6300h(objArr, false)) : AbstractC0846b.m1752k(objArr[0]);
        }
        return C6313u.f24338s;
    }

    /* JADX INFO: renamed from: q */
    public static List m12095q(Object[] objArr) {
        AbstractC6452k.m12181e(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        AbstractC6452k.m12180d(listAsList, "asList(...)");
        return listAsList;
    }

    /* JADX INFO: renamed from: r */
    public static InterfaceC6563f m12096r(Object[] objArr) {
        AbstractC6452k.m12181e(objArr, "<this>");
        return objArr.length == 0 ? C6559b.f24777a : new C6303k(objArr, 0);
    }

    /* JADX INFO: renamed from: s */
    public static void m12097s(int i2, int i3, int i4, Object[] objArr, Object[] destination) {
        AbstractC6452k.m12181e(objArr, "<this>");
        AbstractC6452k.m12181e(destination, "destination");
        System.arraycopy(objArr, i3, destination, i2, i4 - i3);
    }

    /* JADX INFO: renamed from: t */
    public static void m12098t(int i2, int i3, int[] iArr, int[] destination, int i4) {
        AbstractC6452k.m12181e(iArr, "<this>");
        AbstractC6452k.m12181e(destination, "destination");
        System.arraycopy(iArr, i3, destination, i2, i4 - i3);
    }

    /* JADX INFO: renamed from: u */
    public static void m12099u(byte[] bArr, int i2, byte[] destination, int i3, int i4) {
        AbstractC6452k.m12181e(bArr, "<this>");
        AbstractC6452k.m12181e(destination, "destination");
        System.arraycopy(bArr, i3, destination, i2, i4 - i3);
    }

    /* JADX INFO: renamed from: v */
    public static void m12100v(float[] fArr, int i2, float[] destination, int i3, int i4) {
        AbstractC6452k.m12181e(fArr, "<this>");
        AbstractC6452k.m12181e(destination, "destination");
        System.arraycopy(fArr, i3, destination, i2, i4 - i3);
    }

    /* JADX INFO: renamed from: w */
    public static void m12101w(long[] jArr, long[] destination, int i2, int i3, int i4) {
        AbstractC6452k.m12181e(jArr, "<this>");
        AbstractC6452k.m12181e(destination, "destination");
        System.arraycopy(jArr, i3, destination, i2, i4 - i3);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m12102x(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        m12098t(i2, 0, iArr, iArr2, i3);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m12103y(Object[] objArr, Object[] objArr2, int i2, int i3, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = objArr.length;
        }
        m12097s(i2, i3, i4, objArr, objArr2);
    }

    /* JADX INFO: renamed from: z */
    public static Object[] m12104z(Object[] objArr, int i2, int i3) {
        AbstractC6452k.m12181e(objArr, "<this>");
        AbstractC0355G.m552e(i3, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i2, i3);
        AbstractC6452k.m12180d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }
}
