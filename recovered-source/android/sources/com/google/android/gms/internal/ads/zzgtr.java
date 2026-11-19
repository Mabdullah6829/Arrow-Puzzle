package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgtr {
    /* JADX INFO: renamed from: a */
    public static void m7128a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7129b(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m7130c(int i2, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(zzgui.m7149b(str, Integer.valueOf(i2)));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m7131d(long j2, boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(zzgui.m7149b(str, Long.valueOf(j2)));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m7132e(String str, boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(zzgui.m7149b(str, obj));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m7133f(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m7134g(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m7135h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m7136i(int i2, int i3) {
        String strM7149b;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                strM7149b = zzgui.m7149b("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    throw new IllegalArgumentException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i3).length() + 15), "negative size: ", i3));
                }
                strM7149b = zzgui.m7149b("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strM7149b);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m7137j(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(m7139l(i2, i3, FirebaseAnalytics.Param.INDEX));
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m7138k(int i2, int i3, int i4) {
        String strM7139l;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 < 0 || i2 > i4) {
                strM7139l = m7139l(i2, i4, "start index");
            } else {
                strM7139l = (i3 < 0 || i3 > i4) ? m7139l(i3, i4, "end index") : zzgui.m7149b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM7139l);
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m7139l(int i2, int i3, String str) {
        if (i2 < 0) {
            return zzgui.m7149b("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return zzgui.m7149b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i3).length() + 15), "negative size: ", i3));
    }
}
