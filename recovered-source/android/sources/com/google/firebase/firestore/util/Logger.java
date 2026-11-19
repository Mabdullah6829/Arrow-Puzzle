package com.google.firebase.firestore.util;

import android.util.Log;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public class Logger {
    private static Level logLevel = Level.WARN;

    /* JADX INFO: renamed from: com.google.firebase.firestore.util.Logger$1 */
    public static /* synthetic */ class C59741 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$firestore$util$Logger$Level;

        static {
            int[] iArr = new int[Level.values().length];
            $SwitchMap$com$google$firebase$firestore$util$Logger$Level = iArr;
            try {
                iArr[Level.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$util$Logger$Level[Level.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$util$Logger$Level[Level.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum Level {
        DEBUG,
        WARN,
        NONE
    }

    public static void debug(String str, String str2, Object... objArr) {
        doLog(Level.DEBUG, str, str2, objArr);
    }

    private static void doLog(Level level, String str, String str2, Object... objArr) {
        if (level.ordinal() >= logLevel.ordinal()) {
            String strM399g = AbstractC0271e0.m399g("(26.3.0) [", str, "]: ");
            if (objArr.length > 0) {
                str2 = String.format(str2, objArr);
            }
            String strM414v = AbstractC0271e0.m414v(strM399g, str2);
            int i2 = C59741.$SwitchMap$com$google$firebase$firestore$util$Logger$Level[level.ordinal()];
            if (i2 == 1) {
                Log.i("Firestore", strM414v);
            } else if (i2 == 2) {
                Log.w("Firestore", strM414v);
            } else if (i2 == 3) {
                throw new IllegalStateException("Trying to log something on level NONE");
            }
        }
    }

    public static boolean isDebugEnabled() {
        return logLevel.ordinal() >= Level.DEBUG.ordinal();
    }

    public static void setLogLevel(Level level) {
        logLevel = level;
    }

    public static void warn(String str, String str2, Object... objArr) {
        doLog(Level.WARN, str, str2, objArr);
    }
}
