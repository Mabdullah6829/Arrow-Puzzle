package p029Q0;

/* JADX INFO: renamed from: Q0.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0514n {

    /* JADX INFO: renamed from: a */
    public static final String[] f1086a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f1087b;

    static {
        String[] strArr = new String[93];
        for (int i2 = 0; i2 < 32; i2++) {
            strArr[i2] = "\\u" + m1231a(i2 >> 12) + m1231a(i2 >> 8) + m1231a(i2 >> 4) + m1231a(i2);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f1086a = strArr;
        byte[] bArr = new byte[93];
        for (int i3 = 0; i3 < 32; i3++) {
            bArr[i3] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f1087b = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static final char m1231a(int i2) {
        int i3 = i2 & 15;
        return (char) (i3 < 10 ? i3 + 48 : i3 + 87);
    }
}
