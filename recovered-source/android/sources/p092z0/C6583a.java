package p092z0;

import androidx.core.location.LocationRequestCompat;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0271e0;
import p022N.AbstractC0355G;

/* JADX INFO: renamed from: z0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6583a implements Comparable {

    /* JADX INFO: renamed from: t */
    public static final long f24806t;

    /* JADX INFO: renamed from: u */
    public static final long f24807u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ int f24808v = 0;

    /* JADX INFO: renamed from: s */
    public final long f24809s;

    static {
        int i2 = AbstractC6584b.f24810a;
        f24806t = AbstractC0355G.m553g(4611686018427387903L);
        f24807u = AbstractC0355G.m553g(-4611686018427387903L);
    }

    /* JADX INFO: renamed from: b */
    public static final void m12237b(StringBuilder sb, int i2, int i3, int i4, String str, boolean z) {
        CharSequence charSequenceSubSequence;
        sb.append(i2);
        if (i3 != 0) {
            sb.append('.');
            String strValueOf = String.valueOf(i3);
            AbstractC6452k.m12181e(strValueOf, "<this>");
            if (i4 < 0) {
                throw new IllegalArgumentException(AbstractC0271e0.m397e(i4, "Desired length ", " is less than zero."));
            }
            if (i4 <= strValueOf.length()) {
                charSequenceSubSequence = strValueOf.subSequence(0, strValueOf.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i4);
                int length = i4 - strValueOf.length();
                int i5 = 1;
                if (1 <= length) {
                    while (true) {
                        sb2.append('0');
                        if (i5 == length) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                sb2.append((CharSequence) strValueOf);
                charSequenceSubSequence = sb2;
            }
            String string = charSequenceSubSequence.toString();
            int i6 = -1;
            int length2 = string.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i7 = length2 - 1;
                    if (string.charAt(length2) != '0') {
                        i6 = length2;
                        break;
                    } else if (i7 < 0) {
                        break;
                    } else {
                        length2 = i7;
                    }
                }
            }
            int i8 = i6 + 1;
            if (z || i8 >= 3) {
                sb.append((CharSequence) string, 0, ((i6 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) string, 0, i8);
            }
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: c */
    public static int m12238c(long j2, long j3) {
        long j4 = j2 ^ j3;
        if (j4 >= 0 && (((int) j4) & 1) != 0) {
            int i2 = (((int) j2) & 1) - (((int) j3) & 1);
            return j2 < 0 ? -i2 : i2;
        }
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m12239e(long j2) {
        return j2 == f24806t || j2 == f24807u;
    }

    /* JADX INFO: renamed from: f */
    public static final long m12240f(long j2, EnumC6585c unit) {
        AbstractC6452k.m12181e(unit, "unit");
        if (j2 == f24806t) {
            return LocationRequestCompat.PASSIVE_INTERVAL;
        }
        if (j2 == f24807u) {
            return Long.MIN_VALUE;
        }
        long j3 = j2 >> 1;
        EnumC6585c sourceUnit = (((int) j2) & 1) == 0 ? EnumC6585c.NANOSECONDS : EnumC6585c.MILLISECONDS;
        AbstractC6452k.m12181e(sourceUnit, "sourceUnit");
        return unit.f24818s.convert(j3, sourceUnit.f24818s);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m12238c(this.f24809s, ((C6583a) obj).f24809s);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6583a) {
            return this.f24809s == ((C6583a) obj).f24809s;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f24809s);
    }

    public final String toString() {
        int i2;
        long j2;
        int i3;
        int i4;
        long j3 = this.f24809s;
        if (j3 == 0) {
            return "0s";
        }
        if (j3 == f24806t) {
            return "Infinity";
        }
        if (j3 == f24807u) {
            return "-Infinity";
        }
        boolean z = j3 < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (j3 < 0) {
            j3 = ((long) (((int) j3) & 1)) + ((-(j3 >> 1)) << 1);
            int i5 = AbstractC6584b.f24810a;
        }
        long jM12240f = m12240f(j3, EnumC6585c.DAYS);
        int iM12240f = m12239e(j3) ? 0 : (int) (m12240f(j3, EnumC6585c.HOURS) % ((long) 24));
        int iM12240f2 = m12239e(j3) ? 0 : (int) (m12240f(j3, EnumC6585c.MINUTES) % ((long) 60));
        int iM12240f3 = m12239e(j3) ? 0 : (int) (m12240f(j3, EnumC6585c.SECONDS) % ((long) 60));
        if (m12239e(j3)) {
            i2 = 1;
            i3 = 0;
        } else {
            if ((((int) j3) & 1) == 1) {
                i2 = 1;
                j2 = ((j3 >> 1) % ((long) 1000)) * ((long) 1000000);
            } else {
                i2 = 1;
                j2 = (j3 >> 1) % ((long) 1000000000);
            }
            i3 = (int) j2;
        }
        int i6 = jM12240f != 0 ? i2 : 0;
        int i7 = iM12240f != 0 ? i2 : 0;
        int i8 = iM12240f2 != 0 ? i2 : 0;
        int i9 = (iM12240f3 == 0 && i3 == 0) ? 0 : i2;
        if (i6 != 0) {
            sb.append(jM12240f);
            sb.append('d');
            i4 = i2;
        } else {
            i4 = 0;
        }
        if (i7 != 0 || (i6 != 0 && (i8 != 0 || i9 != 0))) {
            int i10 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            sb.append(iM12240f);
            sb.append('h');
            i4 = i10;
        }
        if (i8 != 0 || (i9 != 0 && (i7 != 0 || i6 != 0))) {
            int i11 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            sb.append(iM12240f2);
            sb.append('m');
            i4 = i11;
        }
        if (i9 != 0) {
            int i12 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            if (iM12240f3 != 0 || i6 != 0 || i7 != 0 || i8 != 0) {
                m12237b(sb, iM12240f3, i3, 9, "s", false);
            } else if (i3 >= 1000000) {
                m12237b(sb, i3 / 1000000, i3 % 1000000, 6, "ms", false);
            } else if (i3 >= 1000) {
                m12237b(sb, i3 / 1000, i3 % 1000, 3, "us", false);
            } else {
                sb.append(i3);
                sb.append("ns");
            }
            i4 = i12;
        }
        if (z && i4 > i2) {
            sb.insert(i2, '(').append(')');
        }
        return sb.toString();
    }
}
