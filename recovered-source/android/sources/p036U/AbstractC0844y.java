package p036U;

import java.util.ArrayList;
import java.util.logging.Logger;
import p001B.AbstractC0081g;
import p007E.C0195d;
import p034T.AbstractC0789t2;
import p039W.C0862b;

/* JADX INFO: renamed from: U.y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0844y {
    static {
        Logger.getLogger(AbstractC0844y.class.getName());
    }

    /* JADX INFO: renamed from: a */
    public static byte[][] m1741a(ArrayList arrayList) {
        int size = arrayList.size() * 2;
        byte[][] bArr = new byte[size][];
        int size2 = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            C0862b c0862b = (C0862b) obj;
            int i4 = i2 + 1;
            bArr[i2] = c0862b.f2404a.mo1414s();
            i2 += 2;
            bArr[i4] = c0862b.f2405b.mo1414s();
        }
        byte[] bArr2 = AbstractC0789t2.f2048b;
        int i5 = 0;
        while (i5 < size) {
            byte[] bArr3 = bArr[i5];
            int i6 = i5 + 1;
            byte[] bArr4 = bArr[i6];
            if (AbstractC0789t2.m1665a(bArr3, bArr2)) {
                for (byte b : bArr4) {
                    if (b == 44) {
                        ArrayList arrayList2 = new ArrayList(size + 10);
                        for (int i7 = 0; i7 < i5; i7++) {
                            arrayList2.add(bArr[i7]);
                        }
                        while (i5 < size) {
                            byte[] bArr5 = bArr[i5];
                            byte[] bArr6 = bArr[i5 + 1];
                            if (AbstractC0789t2.m1665a(bArr5, bArr2)) {
                                int i8 = 0;
                                for (int i9 = 0; i9 <= bArr6.length; i9++) {
                                    if (i9 == bArr6.length || bArr6[i9] == 44) {
                                        byte[] bArrM286a = C0195d.f387c.m286a(new String(bArr6, i8, i9 - i8, AbstractC0081g.f107a));
                                        arrayList2.add(bArr5);
                                        arrayList2.add(bArrM286a);
                                        i8 = i9 + 1;
                                    }
                                }
                            } else {
                                arrayList2.add(bArr5);
                                arrayList2.add(bArr6);
                            }
                            i5 += 2;
                        }
                        return (byte[][]) arrayList2.toArray(new byte[0][]);
                    }
                }
                bArr[i6] = C0195d.f387c.m286a(new String(bArr4, AbstractC0081g.f107a));
            }
            i5 += 2;
        }
        return bArr;
    }
}
