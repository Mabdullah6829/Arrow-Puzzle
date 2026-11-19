package com.instagram.common.viewpoint.core;

import androidx.constraintlayout.widget.C1137R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.XZ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3928XZ implements InvocationHandler {
    public static byte[] A03;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C3659T8 A01;
    public final /* synthetic */ LinkedBlockingQueue A02;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{40, 42, 33, 42, 61, 38, 44, 43, 41, 56, 31, 60, 32, 37, 56, 2, 45, 33, 41, 43, 41, 56, 24, 53, 60, 41, 73, 75, 90, 120, 79, 66, 91, 75, 29, 28, 49, 26, 23, 17, 25, 1, 7, 31, 1, 32, 23, 19, 22, 11};
    }

    public C3928XZ(int i2, LinkedBlockingQueue linkedBlockingQueue, C3659T8 c3659t8) {
        this.A00 = i2;
        this.A02 = linkedBlockingQueue;
        this.A01 = c3659t8;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            if (method.getName().equals(A00(34, 16, 70)) && objArr.length == 1 && (objArr[0] instanceof List)) {
                for (Object c : (List) objArr[0]) {
                    String str = (String) c.getClass().getMethod(A00(7, 12, C1137R.styleable.ConstraintSet_stateLabels), new Class[0]).invoke(c, new Object[0]);
                    int iIntValue = ((Integer) c.getClass().getMethod(A00(19, 7, C1137R.styleable.ConstraintSet_stateLabels), new Class[0]).invoke(c, new Object[0])).intValue();
                    if (str == null && iIntValue == this.A00) {
                        byte[] value = (byte[]) c.getClass().getMethod(A00(26, 8, 26), new Class[0]).invoke(c, new Object[0]);
                        this.A02.put(value);
                        return null;
                    }
                }
                this.A02.put(null);
            }
        } catch (Throwable t) {
            this.A01.A08().ABC(A00(0, 7, 123), AbstractC3690Td.A1G, new C3691Te(t));
        }
        return null;
    }
}
