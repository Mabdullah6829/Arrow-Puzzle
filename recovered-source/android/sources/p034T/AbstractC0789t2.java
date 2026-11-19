package p034T;

import java.util.logging.Logger;
import p001B.AbstractC0081g;

/* JADX INFO: renamed from: T.t2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0789t2 {

    /* JADX INFO: renamed from: a */
    public static final Logger f2047a = Logger.getLogger(AbstractC0789t2.class.getName());

    /* JADX INFO: renamed from: b */
    public static final byte[] f2048b = "-bin".getBytes(AbstractC0081g.f107a);

    /* JADX INFO: renamed from: a */
    public static boolean m1665a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i2 = length; i2 < bArr.length; i2++) {
            if (bArr[i2] != bArr2[i2 - length]) {
                return false;
            }
        }
        return true;
    }
}
