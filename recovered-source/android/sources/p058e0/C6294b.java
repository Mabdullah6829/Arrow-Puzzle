package p058e0;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import p011H.AbstractC0271e0;

/* JADX INFO: renamed from: e0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6294b {
    /* JADX INFO: renamed from: a */
    public static void m12077a(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(AbstractC1456a.m2443j(i2, i3, "index: ", ", size: "));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m12078b(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(AbstractC1456a.m2443j(i2, i3, "index: ", ", size: "));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m12079c(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            StringBuilder sbM409q = AbstractC0271e0.m409q("fromIndex: ", i2, ", toIndex: ", i3, ", size: ");
            sbM409q.append(i4);
            throw new IndexOutOfBoundsException(sbM409q.toString());
        }
        if (i2 > i3) {
            throw new IllegalArgumentException(AbstractC1456a.m2443j(i2, i3, "fromIndex: ", " > toIndex: "));
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m12080d(int i2, int i3) {
        int i4 = i2 + (i2 >> 1);
        if (i4 - i3 < 0) {
            i4 = i3;
        }
        if (i4 - 2147483639 > 0) {
            return i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        return i4;
    }
}
