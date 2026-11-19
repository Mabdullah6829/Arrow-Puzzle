package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Js */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3091Js {
    public static byte[] A00;
    public static String[] A01 = {"igoOoy3NY4UMRHdpx9h3UlwGdvMc0fc9", "i1My3cIv2txc6hnpPF2N9ufK5yKqcDwp", "ZPKM82HH2UhiHuE6c", "N8bcPF6", "fP1uMJr9juYIT", "Q74KZy4WGIwm3", "kYmec6ZLKDIoPLbK3wnMb68OSlbBsX7E", "P2I33wOyCa7MBOFZieFJQqH5gMHCVrks"};

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 63);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-17, 17, 13, 1, 32, 21, 24, -41, -17, -19, -12, -12, -19, -14, -21, -92, -10, -23, -15, -27, -19, -14, -24, -23, -10, -92, -13, -22, -92, -15, -27, -16, -22, -13, -10, -15, -23, -24, -92, -41, -55, -51, -92, -46, -59, -48, -92, -7, -14, -19, -8, -78};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A04(long j2, C21864v c21864v, InterfaceC2953Hd[] interfaceC2953HdArr) {
        int iA0I = c21864v.A0I();
        if ((iA0I & 64) != 0) {
            c21864v.A0g(1);
            int i2 = (iA0I & 31) * 3;
            int iA09 = c21864v.A09();
            for (InterfaceC2953Hd interfaceC2953Hd : interfaceC2953HdArr) {
                c21864v.A0f(iA09);
                interfaceC2953Hd.AIr(c21864v, i2);
                interfaceC2953Hd.AIu(j2, 1, i2, 0, null);
            }
        }
    }

    static {
        A02();
    }

    public static int A00(C21864v c21864v) {
        int i2 = 0;
        while (value != 0) {
            int iA0I = c21864v.A0I();
            i2 += iA0I;
            int b = A01[3].length();
            if (b == 4) {
                throw new RuntimeException();
            }
            A01[2] = "hfDUXVNQknc2urmlb";
            if (iA0I != 255) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public static void A03(long j2, C21864v c21864v, InterfaceC2953Hd[] interfaceC2953HdArr) {
        while (true) {
            if (c21864v.A07() > 1) {
                int iA00 = A00(c21864v);
                int iA01 = A00(c21864v);
                int iA09 = c21864v.A09() + iA01;
                if (iA01 != -1) {
                    int payloadType = c21864v.A07();
                    if (iA01 > payloadType) {
                        AbstractC21714g.A07(A01(0, 7, 109), A01(7, 45, 69));
                        iA09 = c21864v.A0A();
                    } else if (iA00 == 4 && iA01 >= 8) {
                        int userIdentifier = c21864v.A0I();
                        int providerCode = c21864v.A0M();
                        int countryCode = 0;
                        if (providerCode == 49) {
                            countryCode = c21864v.A0C();
                        }
                        int iA0I = c21864v.A0I();
                        if (providerCode == 47) {
                            c21864v.A0g(1);
                        }
                        int i2 = (userIdentifier == 181 && (providerCode == 49 || providerCode == 47) && iA0I == 3) ? 1 : 0;
                        if (providerCode == 49) {
                            int userDataTypeCode = countryCode != 1195456820 ? 0 : 1;
                            i2 &= userDataTypeCode;
                        }
                        if (i2 != 0) {
                            A04(j2, c21864v, interfaceC2953HdArr);
                        }
                    }
                } else {
                    AbstractC21714g.A07(A01(0, 7, 109), A01(7, 45, 69));
                    iA09 = c21864v.A0A();
                }
                c21864v.A0f(iA09);
            } else {
                return;
            }
        }
    }
}
