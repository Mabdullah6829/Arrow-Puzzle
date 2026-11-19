package p007E;

import java.util.ArrayDeque;
import java.util.Arrays;
import p022N.AbstractC0355G;
import p041Y.C0873a;

/* JADX INFO: renamed from: E.f */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0197f {
    static {
        new C0196e();
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m290a(ArrayDeque arrayDeque, int i2) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i2) {
            return bArr;
        }
        int length = i2 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i2 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m291b(C0873a c0873a) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i2 = 0;
        while (i2 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i2);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < iMin2) {
                int i4 = c0873a.read(bArr, i3, iMin2 - i3);
                if (i4 == -1) {
                    return m290a(arrayDeque, i2);
                }
                i3 += i4;
                i2 += i4;
            }
            iMin = AbstractC0355G.m559m(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        if (c0873a.read() == -1) {
            return m290a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
