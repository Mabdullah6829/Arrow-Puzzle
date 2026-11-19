package androidx.core.util;

import android.util.Half;

/* JADX INFO: loaded from: classes.dex */
public final class HalfKt {
    public static final Half toHalf(short s2) {
        return Half.valueOf(s2);
    }

    public static final Half toHalf(float f2) {
        return Half.valueOf(f2);
    }

    public static final Half toHalf(String str) {
        return Half.valueOf(str);
    }

    public static final Half toHalf(double d) {
        return Half.valueOf((float) d);
    }
}
