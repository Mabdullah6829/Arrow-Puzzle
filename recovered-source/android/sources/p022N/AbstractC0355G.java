package p022N;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0039h;
import p001B.C0092r;
import p011H.AbstractC0243G;
import p016J0.ExecutorC0323a;
import p030R.C0567l0;
import p037U0.AbstractC0846b;
import p043a.AbstractC0878a;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p092z0.AbstractC6584b;
import p092z0.C6583a;
import p092z0.EnumC6585c;

/* JADX INFO: renamed from: N.G */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0355G {

    /* JADX INFO: renamed from: A */
    public static String f689A = "";

    /* JADX INFO: renamed from: B */
    public static String f690B = "";

    /* JADX INFO: renamed from: C */
    public static String f691C = "";

    /* JADX INFO: renamed from: D */
    public static String f692D = "";

    /* JADX INFO: renamed from: E */
    public static String f693E = "";

    /* JADX INFO: renamed from: F */
    public static String f694F = "";

    /* JADX INFO: renamed from: G */
    public static String f695G = "";

    /* JADX INFO: renamed from: t */
    public static volatile C0567l0 f696t = null;

    /* JADX INFO: renamed from: u */
    public static volatile C0567l0 f697u = null;

    /* JADX INFO: renamed from: v */
    public static volatile C0567l0 f698v = null;

    /* JADX INFO: renamed from: w */
    public static volatile C0567l0 f699w = null;

    /* JADX INFO: renamed from: x */
    public static volatile C0567l0 f700x = null;

    /* JADX INFO: renamed from: y */
    public static volatile C0567l0 f701y = null;

    /* JADX INFO: renamed from: z */
    public static String f702z = "";

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f703s;

    /* JADX INFO: renamed from: b */
    public static Object m550b(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final Object m551c(Task task, InterfaceC6348c interfaceC6348c) throws Exception {
        if (!task.isComplete()) {
            C0039h c0039h = new C0039h(1, AbstractC0878a.m1802m(interfaceC6348c));
            c0039h.m86r();
            task.addOnCompleteListener(ExecutorC0323a.f650s, new C0092r(c0039h, 2));
            Object objM85q = c0039h.m85q();
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            return objM85q;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    /* JADX INFO: renamed from: e */
    public static final void m552e(int i2, int i3) {
        if (i2 <= i3) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + i3 + ").");
    }

    /* JADX INFO: renamed from: g */
    public static final long m553g(long j2) {
        long j3 = (j2 << 1) + 1;
        int i2 = C6583a.f24808v;
        int i3 = AbstractC6584b.f24810a;
        return j3;
    }

    /* JADX INFO: renamed from: h */
    public static final long m554h(long j2) {
        long j3 = j2 << 1;
        int i2 = C6583a.f24808v;
        int i3 = AbstractC6584b.f24810a;
        return j3;
    }

    /* JADX INFO: renamed from: i */
    public static final int m555i(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 < i3) {
                int i5 = i3 % i4;
                if (i5 < 0) {
                    i5 += i4;
                }
                int i6 = i2 % i4;
                if (i6 < 0) {
                    i6 += i4;
                }
                int i7 = (i5 - i6) % i4;
                if (i7 < 0) {
                    i7 += i4;
                }
                return i3 - i7;
            }
        } else {
            if (i4 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i2 > i3) {
                int i8 = -i4;
                int i9 = i2 % i8;
                if (i9 < 0) {
                    i9 += i8;
                }
                int i10 = i3 % i8;
                if (i10 < 0) {
                    i10 += i8;
                }
                int i11 = (i9 - i10) % i8;
                if (i11 < 0) {
                    i11 += i8;
                }
                return i11 + i3;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: j */
    public static int m556j(Set set) {
        Iterator it = set.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i2 = ~(~(i2 + (next != null ? next.hashCode() : 0)));
        }
        return i2;
    }

    /* JADX INFO: renamed from: k */
    public static double m557k(double d, double d2) {
        if (d2 <= 0.0d || d2 == 1.0d) {
            return Double.NaN;
        }
        return Math.log(d) / Math.log(d2);
    }

    /* JADX INFO: renamed from: l */
    public static HashSet m558l(int i2) {
        int iCeil;
        if (i2 < 3) {
            AbstractC0243G.m371i(i2, "expectedSize");
            iCeil = i2 + 1;
        } else {
            iCeil = i2 < 1073741824 ? (int) Math.ceil(((double) i2) / 0.75d) : Integer.MAX_VALUE;
        }
        return new HashSet(iCeil);
    }

    /* JADX INFO: renamed from: m */
    public static int m559m(long j2) {
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }

    /* JADX INFO: renamed from: n */
    public static final long m560n(int i2, EnumC6585c unit) {
        AbstractC6452k.m12181e(unit, "unit");
        return unit.compareTo(EnumC6585c.SECONDS) <= 0 ? m554h(AbstractC0846b.m1746e(i2, unit, EnumC6585c.NANOSECONDS)) : m561o(i2, unit);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a A[PHI: r0
  0x003a: PHI (r0v6 long) = (r0v4 long), (r0v5 long) binds: [B:9:0x0038, B:12:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: o */
    public static final long m561o(long j2, EnumC6585c unit) {
        AbstractC6452k.m12181e(unit, "unit");
        EnumC6585c enumC6585c = EnumC6585c.NANOSECONDS;
        long jM1746e = AbstractC0846b.m1746e(4611686018426999999L, enumC6585c, unit);
        if ((-jM1746e) <= j2 && j2 <= jM1746e) {
            return m554h(AbstractC0846b.m1746e(j2, unit, enumC6585c));
        }
        EnumC6585c targetUnit = EnumC6585c.MILLISECONDS;
        AbstractC6452k.m12181e(targetUnit, "targetUnit");
        long jConvert = targetUnit.f24818s.convert(j2, unit.f24818s);
        long j3 = -4611686018427387903L;
        if (jConvert < -4611686018427387903L) {
            jConvert = j3;
        } else {
            j3 = 4611686018427387903L;
            if (jConvert > 4611686018427387903L) {
                jConvert = j3;
            }
        }
        return m553g(jConvert);
    }

    /* JADX INFO: renamed from: p */
    public static void m562p(Parcel parcel, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i2);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract Object mo390f();

    public String toString() {
        switch (this.f703s) {
            case 1:
                return mo390f().toString();
            default:
                return super.toString();
        }
    }
}
