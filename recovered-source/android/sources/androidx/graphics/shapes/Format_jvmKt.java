package androidx.graphics.shapes;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Format_jvmKt {
    public static final String toStringWithLessPrecision(float f2) {
        return String.format("%.3f", Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
    }
}
