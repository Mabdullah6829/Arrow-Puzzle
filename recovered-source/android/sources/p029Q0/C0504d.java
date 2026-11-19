package p029Q0;

import androidx.constraintlayout.widget.C1137R;

/* JADX INFO: renamed from: Q0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0504d {

    /* JADX INFO: renamed from: a */
    public static final char[] f1057a = new char[C1137R.styleable.ConstraintSet_pivotAnchor];

    /* JADX INFO: renamed from: b */
    public static final byte[] f1058b = new byte[126];

    static {
        for (int i2 = 0; i2 < 32; i2++) {
        }
        m1192a(8, 'b');
        m1192a(9, 't');
        m1192a(10, 'n');
        m1192a(12, 'f');
        m1192a(13, 'r');
        m1192a(47, '/');
        m1192a(34, '\"');
        m1192a(92, '\\');
        byte[] bArr = f1058b;
        for (int i3 = 0; i3 < 33; i3++) {
            bArr[i3] = 127;
        }
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
    }

    /* JADX INFO: renamed from: a */
    public static void m1192a(int i2, char c) {
        if (c != 'u') {
            f1057a[c] = (char) i2;
        }
    }
}
