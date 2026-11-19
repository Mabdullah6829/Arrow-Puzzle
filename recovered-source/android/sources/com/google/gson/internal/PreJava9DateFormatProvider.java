package com.google.gson.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public class PreJava9DateFormatProvider {
    private PreJava9DateFormatProvider() {
    }

    private static String getDatePartOfDateTimePattern(int i2) {
        if (i2 == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i2 == 1) {
            return "MMMM d, yyyy";
        }
        if (i2 == 2) {
            return "MMM d, yyyy";
        }
        if (i2 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException(AbstractC0271e0.m396d(i2, "Unknown DateFormat style: "));
    }

    private static String getTimePartOfDateTimePattern(int i2) {
        if (i2 == 0 || i2 == 1) {
            return "h:mm:ss a z";
        }
        if (i2 == 2) {
            return "h:mm:ss a";
        }
        if (i2 == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException(AbstractC0271e0.m396d(i2, "Unknown DateFormat style: "));
    }

    public static DateFormat getUsDateTimeFormat(int i2, int i3) {
        return new SimpleDateFormat(getDatePartOfDateTimePattern(i2) + " " + getTimePartOfDateTimePattern(i3), Locale.US);
    }
}
