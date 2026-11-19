package com.instagram.common.viewpoint.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bp */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public final class C2596Bp<F, T> extends AbstractC5066qK<F> implements Serializable {
    public static byte[] A02;
    public static String[] A03 = {"qP7uN3CTeBtugcvn4iscvs4NawNVw3hj", "uACvKKD4Xh814PQzJz7fno8Y0d2htzTr", "OaGwUL0wruZXrmXuBUYR8eOdlsWVX5jO", "JY9GX7tPgJ", "UJNVJd39Mn7RrVqRZr4HQjubetYZ2pJj", "tP9Bx5HW1SG5GbSCFf4kAQmgB2SyEv9b", "xcsG1NfXHnFrLoKWAotfCT6bqQ3ToZXO", "wDWfKnr2Hnyq67FaxNzVQD5A0FwwfXbW"};
    public static final long serialVersionUID = 0;
    public final InterfaceC4715kO<F, ? extends T> A00;
    public final AbstractC5066qK<T> A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A03;
            if (strArr[2].charAt(0) == strArr[6].charAt(0)) {
                throw new RuntimeException();
            }
            A03[1] = "UOsr4mSSP3XVk2xA78tBNfMlPB0RSTkt";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 5);
            i5++;
        }
    }

    public static void A01() {
        A02 = new byte[]{78, 122, 59, 58, 6, 49, 39, 33, 56, 32, 27, 50, 124};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof C2596Bp)) {
            return false;
        }
        C2596Bp c2596Bp = (C2596Bp) object;
        return this.A00.equals(c2596Bp.A00) && this.A01.equals(c2596Bp.A01);
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bp != com.google.common.collect.ByFunctionOrdering<F, T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kO != com.google.common.base.Function<F, ? extends T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qK != com.google.common.collect.Ordering<T> */
    public C2596Bp(InterfaceC4715kO<F, ? extends T> function, AbstractC5066qK<T> ordering) {
        this.A00 = (InterfaceC4715kO) AbstractC4734ki.A04(function);
        this.A01 = (AbstractC5066qK) AbstractC4734ki.A04(ordering);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bp != com.google.common.collect.ByFunctionOrdering<F, T> */
    @Override // com.instagram.common.viewpoint.core.AbstractC5066qK, java.util.Comparator
    public final int compare(@ParametricNullness F f2, @ParametricNullness F f3) {
        return this.A01.compare(this.A00.A4B(f2), this.A00.A4B(f3));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bp != com.google.common.collect.ByFunctionOrdering<F, T> */
    public final int hashCode() {
        return AbstractC2617CB.A00(this.A00, this.A01);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bp != com.google.common.collect.ByFunctionOrdering<F, T> */
    public final String toString() {
        return this.A01 + A00(1, 12, 81) + this.A00 + A00(0, 1, 98);
    }
}
