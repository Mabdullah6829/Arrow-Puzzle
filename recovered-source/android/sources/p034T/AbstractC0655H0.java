package p034T;

import androidx.core.location.LocationRequestCompat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p011H.AbstractC0242F;

/* JADX INFO: renamed from: T.H0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0655H0 {

    /* JADX INFO: renamed from: a */
    public static final long f1459a = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: a */
    public static void m1505a(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!(list.get(i2) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i2), Integer.valueOf(i2), list));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m1506b(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    /* JADX INFO: renamed from: c */
    public static List m1507c(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    /* JADX INFO: renamed from: d */
    public static List m1508d(String str, Map map) {
        List listM1507c = m1507c(str, map);
        if (listM1507c == null) {
            return null;
        }
        for (int i2 = 0; i2 < listM1507c.size(); i2++) {
            if (!(listM1507c.get(i2) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", listM1507c.get(i2), Integer.valueOf(i2), listM1507c));
            }
        }
        return listM1507c;
    }

    /* JADX INFO: renamed from: e */
    public static Double m1509e(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
        }
    }

    /* JADX INFO: renamed from: f */
    public static Integer m1510f(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        Double d = (Double) obj;
        int iIntValue = d.intValue();
        if (iIntValue == d.doubleValue()) {
            return Integer.valueOf(iIntValue);
        }
        throw new ClassCastException("Number expected to be integer: " + d);
    }

    /* JADX INFO: renamed from: g */
    public static Map m1511g(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    /* JADX INFO: renamed from: h */
    public static String m1512h(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    /* JADX INFO: renamed from: i */
    public static Long m1513i(String str, Map map) {
        String strM1512h = m1512h(str, map);
        if (strM1512h == null) {
            return null;
        }
        try {
            return Long.valueOf(m1515k(strM1512h));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: j */
    public static long m1514j(int i2, long j2) {
        long j3 = i2;
        long j4 = f1459a;
        if (j3 <= (-j4) || j3 >= j4) {
            j2 = AbstractC0242F.m347b(j2, j3 / j4);
            i2 = (int) (j3 % j4);
        }
        if (j2 > 0 && i2 < 0) {
            i2 = (int) (((long) i2) + j4);
            j2--;
        }
        if (j2 < 0 && i2 > 0) {
            i2 = (int) (((long) i2) - j4);
            j2++;
        }
        if (j2 >= -315576000000L && j2 <= 315576000000L) {
            long j5 = i2;
            if (j5 >= -999999999 && j5 < j4 && ((j2 >= 0 && i2 >= 0) || (j2 <= 0 && i2 <= 0))) {
                long nanos = TimeUnit.SECONDS.toNanos(j2);
                long j6 = i2;
                long j7 = nanos + j6;
                return (((j6 ^ nanos) > 0L ? 1 : ((j6 ^ nanos) == 0L ? 0 : -1)) < 0) | ((nanos ^ j7) >= 0) ? j7 : ((j7 >>> 63) ^ 1) + LocationRequestCompat.PASSIVE_INTERVAL;
            }
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + j2 + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + i2 + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }

    /* JADX INFO: renamed from: k */
    public static long m1515k(String str) throws ParseException {
        boolean z;
        String strSubstring;
        int iCharAt;
        if (str.isEmpty() || str.charAt(str.length() - 1) != 's') {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            z = true;
        } else {
            z = false;
        }
        String strSubstring2 = str.substring(0, str.length() - 1);
        int iIndexOf = strSubstring2.indexOf(46);
        if (iIndexOf != -1) {
            strSubstring = strSubstring2.substring(iIndexOf + 1);
            strSubstring2 = strSubstring2.substring(0, iIndexOf);
        } else {
            strSubstring = "";
        }
        long j2 = Long.parseLong(strSubstring2);
        if (strSubstring.isEmpty()) {
            iCharAt = 0;
        } else {
            iCharAt = 0;
            for (int i2 = 0; i2 < 9; i2++) {
                iCharAt *= 10;
                if (i2 < strSubstring.length()) {
                    if (strSubstring.charAt(i2) < '0' || strSubstring.charAt(i2) > '9') {
                        throw new ParseException("Invalid nanoseconds.", 0);
                    }
                    iCharAt = (strSubstring.charAt(i2) - '0') + iCharAt;
                }
            }
        }
        if (j2 < 0) {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (z) {
            j2 = -j2;
            iCharAt = -iCharAt;
        }
        try {
            return m1514j(iCharAt, j2);
        } catch (IllegalArgumentException unused) {
            throw new ParseException("Duration value is out of range.", 0);
        }
    }
}
