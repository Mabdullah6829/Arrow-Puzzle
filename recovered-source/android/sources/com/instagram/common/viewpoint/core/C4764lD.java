package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4764lD implements InterfaceC2915H1 {
    public static String[] A02 = {"icMuAGNUwG3qooMsLkIelsXOgqR", "wZwGdqwzUfLFhHeDnVqZXfrekI2t19Nm", "6NjHclQwJEhKen4shQzzT38fKShvFJl3", "cwvHChui6ScrilPVLNLxDwwq1RZibmTM", "KGSyfhH5I6lVnEy0NkdKQy5Ija", "JgLMaajFBM7mBqcCk", "W9ygPHkeZ", ""};
    public final C21864v A00;
    public final C219453 A01;

    public C4764lD(C219453 c219453) {
        this.A01 = c219453;
        this.A00 = new C21864v();
    }

    private C2913Gz A00(C21864v c21864v, long scrValue, long scrTimeUs) {
        int iA09 = -1;
        int iA010 = -1;
        long j2 = -9223372036854775807L;
        while (c21864v.A07() >= 4) {
            if (C4763lC.A00(c21864v.A0l(), c21864v.A09()) != 442) {
                c21864v.A0g(1);
            } else {
                c21864v.A0g(4);
                long jA06 = C3167L6.A06(c21864v);
                if (jA06 != -9223372036854775807L) {
                    long jA07 = this.A01.A06(jA06);
                    if (jA07 > scrValue) {
                        if (j2 == -9223372036854775807L) {
                            return C2913Gz.A04(jA07, scrTimeUs);
                        }
                        return C2913Gz.A03(((long) iA09) + scrTimeUs);
                    }
                    int startOfLastPacketPosition = A02[1].charAt(26);
                    if (startOfLastPacketPosition == 113) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A02;
                    strArr[3] = "JRu5yfiOOmZm3e1j9KGmxzziCqUEhgmX";
                    strArr[2] = "rPvZuTIICj36zhJU166yjphfEhohU7nm";
                    long lastScrTimeUsInRange = 100000 + jA07;
                    if (lastScrTimeUsInRange > scrValue) {
                        return C2913Gz.A03(((long) c21864v.A09()) + scrTimeUs);
                    }
                    j2 = jA07;
                    iA09 = c21864v.A09();
                }
                A01(c21864v);
                iA010 = c21864v.A09();
            }
        }
        if (j2 != -9223372036854775807L) {
            return C2913Gz.A05(j2, ((long) iA010) + scrTimeUs);
        }
        return C2913Gz.A03;
    }

    public static void A01(C21864v c21864v) {
        int systemHeaderLength = c21864v.A0A();
        if (c21864v.A07() < 10) {
            c21864v.A0f(systemHeaderLength);
            return;
        }
        c21864v.A0g(9);
        int limit = c21864v.A0I();
        int packStuffingLength = limit & 7;
        int limit2 = c21864v.A07();
        if (limit2 < packStuffingLength) {
            c21864v.A0f(systemHeaderLength);
            return;
        }
        c21864v.A0g(packStuffingLength);
        int limit3 = c21864v.A07();
        if (limit3 < 4) {
            c21864v.A0f(systemHeaderLength);
            return;
        }
        byte[] bArrA0l = c21864v.A0l();
        int limit4 = c21864v.A09();
        if (C4763lC.A00(bArrA0l, limit4) == 443) {
            c21864v.A0g(4);
            int packStuffingLength2 = c21864v.A0M();
            int limit5 = c21864v.A07();
            if (limit5 < packStuffingLength2) {
                c21864v.A0f(systemHeaderLength);
                return;
            }
            c21864v.A0g(packStuffingLength2);
        }
        while (limit >= 4) {
            byte[] bArrA0l2 = c21864v.A0l();
            int limit6 = c21864v.A09();
            int packStuffingLength3 = C4763lC.A00(bArrA0l2, limit6);
            if (packStuffingLength3 == 442 || packStuffingLength3 == 441 || (packStuffingLength3 >>> 8) != 1) {
                return;
            }
            c21864v.A0g(4);
            if (c21864v.A07() < 2) {
                c21864v.A0f(systemHeaderLength);
                return;
            }
            int nextStartCode = c21864v.A0M();
            int packStuffingLength4 = c21864v.A0A();
            int limit7 = c21864v.A09();
            c21864v.A0f(Math.min(packStuffingLength4, limit7 + nextStartCode));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2915H1
    public final void AFs() {
        this.A00.A0i(AbstractC22035C.A07);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2915H1
    public final C2913Gz AIw(InterfaceC4855ms interfaceC4855ms, long j2) throws IOException {
        long jA8n = interfaceC4855ms.A8n();
        int iMin = (int) Math.min(20000L, interfaceC4855ms.A8O() - jA8n);
        this.A00.A0d(iMin);
        interfaceC4855ms.AGt(this.A00.A0l(), 0, iMin);
        return A00(this.A00, j2, jA8n);
    }
}
