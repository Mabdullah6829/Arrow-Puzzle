package com.google.android.gms.internal.measurement;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaal {
    /* JADX INFO: renamed from: a */
    public static String m9311a(String str) {
        if (str.length() > 23) {
            int i2 = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char cCharAt = str.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i2 = length;
                    break;
                }
            }
            str = str.substring(i2 + 1);
        }
        String strConcat = "".concat(String.valueOf(str));
        return strConcat.substring(0, Math.min(strConcat.length(), 23));
    }

    /* JADX INFO: renamed from: b */
    public static int m9312b(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (iIntValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (iIntValue >= Level.INFO.intValue()) {
            return 4;
        }
        return iIntValue >= Level.FINE.intValue() ? 3 : 2;
    }
}
