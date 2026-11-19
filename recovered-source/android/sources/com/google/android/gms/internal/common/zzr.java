package com.google.android.gms.internal.common;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes2.dex */
public final class zzr {
    /* JADX INFO: renamed from: a */
    public static void m9108a(int i2, int i3) {
        String strM9114a;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                strM9114a = zzx.m9114a("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    throw new IllegalArgumentException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i3).length() + 15), "negative size: ", i3));
                }
                strM9114a = zzx.m9114a("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strM9114a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m9109b(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(m9111d(i2, i3, FirebaseAnalytics.Param.INDEX));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m9110c(int i2, int i3, int i4) {
        String strM9111d;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 < 0 || i2 > i4) {
                strM9111d = m9111d(i2, i4, "start index");
            } else {
                strM9111d = (i3 < 0 || i3 > i4) ? m9111d(i3, i4, "end index") : zzx.m9114a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM9111d);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m9111d(int i2, int i3, String str) {
        if (i2 < 0) {
            return zzx.m9114a("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return zzx.m9114a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i3).length() + 15), "negative size: ", i3));
    }
}
