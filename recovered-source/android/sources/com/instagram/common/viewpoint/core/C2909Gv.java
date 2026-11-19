package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gv */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2909Gv {
    public static byte[] A06;
    public static String[] A07 = {"f", "7N0kip4m3flPJ4wRylUb66l3ycty4bLO", "ZrqOCWQk631j6sxAoqisBRdwge9gr5QF", "2DRaKiCosA9Zs551XHqRbpaUmywwD6L7", "dzNr4lbarI8PqRX9M2ICRMrM1SnLdD", "nBYqh81NM1tC", "zWHuac", "46iX5XNzwkY5yhjGLtKEm3XHMbBVctSm"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final List<byte[]> A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C2909Gv A00(C21864v c21864v) throws C20883K {
        try {
            c21864v.A0g(4);
            int iA0I = (c21864v.A0I() & 3) + 1;
            if (iA0I == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iA0I2 = c21864v.A0I() & 31;
            for (int i2 = 0; i2 < iA0I2; i2++) {
                arrayList.add(A03(c21864v));
            }
            int iA0I3 = c21864v.A0I();
            String[] strArr = A07;
            if (strArr[4].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A07[1] = "rQ6g8gs4UtzNEdd6WIb5nHQ3c92ce055";
            for (int i3 = 0; i3 < iA0I3; i3++) {
                arrayList.add(A03(c21864v));
            }
            int i4 = -1;
            int i5 = -1;
            float f2 = 1.0f;
            String strA01 = null;
            if (iA0I2 > 0) {
                C2941HR c2941hrA09 = AbstractC2942HS.A09((byte[]) arrayList.get(0), iA0I, ((byte[]) arrayList.get(0)).length);
                i4 = c2941hrA09.A0A;
                i5 = c2941hrA09.A03;
                f2 = c2941hrA09.A00;
                strA01 = AbstractC213546.A01(c2941hrA09.A08, c2941hrA09.A01, c2941hrA09.A04);
            }
            return new C2909Gv(arrayList, iA0I, i4, i5, f2, strA01);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C20883K.A01(A01(0, 24, 51), e);
        }
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 30);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-106, -61, -61, -64, -61, 113, -63, -78, -61, -60, -70, -65, -72, 113, -110, -89, -108, 113, -76, -64, -65, -73, -70, -72};
    }

    static {
        A02();
    }

    public C2909Gv(List<byte[]> initializationData, int i2, int i3, int i4, float f2, String str) {
        this.A05 = initializationData;
        this.A02 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A00 = f2;
        this.A04 = str;
    }

    public static byte[] A03(C21864v c21864v) {
        int iA0M = c21864v.A0M();
        int offset = c21864v.A09();
        c21864v.A0g(iA0M);
        return AbstractC213546.A07(c21864v.A0l(), offset, iA0M);
    }
}
