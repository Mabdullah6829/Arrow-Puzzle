package com.google.android.gms.internal.consent_sdk;

import com.google.firebase.analytics.FirebaseAnalytics;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdj {
    /* JADX INFO: renamed from: a */
    public static void m9123a(int i2, int i3) {
        String strM9129a;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                strM9129a = zzdp.m9129a("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    throw new IllegalArgumentException(AbstractC0271e0.m396d(i3, "negative size: "));
                }
                strM9129a = zzdp.m9129a("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strM9129a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m9124b(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(m9126d(i2, i3, FirebaseAnalytics.Param.INDEX));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m9125c(int i2, int i3, int i4) {
        String strM9126d;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 < 0 || i2 > i4) {
                strM9126d = m9126d(i2, i4, "start index");
            } else {
                strM9126d = (i3 < 0 || i3 > i4) ? m9126d(i3, i4, "end index") : zzdp.m9129a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM9126d);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m9126d(int i2, int i3, String str) {
        if (i2 < 0) {
            return zzdp.m9129a("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return zzdp.m9129a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(AbstractC0271e0.m396d(i3, "negative size: "));
    }
}
