package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.l8 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4759l8 implements InterfaceC2915H1 {
    public static String[] A04 = {"sdKdmhexVnrlWGhX9TH5KtuHBxlX2", "B98Zkm438dg3YkwTFsWcwjYsIqopE2cW", "q7DFl2FydsE0DWNk8QJk98tFdBPGU17r", "uw89PlDwsU5CTp5ALy1o", "HmpI", "x0Unc4LQNUVImDERNKiE", "Klo4tVDdc3zNBBgsT3eAMryjwXw3w", "mmy2vPNb8zCZX"};
    public final int A00;
    public final int A01;
    public final C21864v A02 = new C21864v();
    public final C219453 A03;

    public C4759l8(int i2, C219453 c219453, int i3) {
        this.A00 = i2;
        this.A03 = c219453;
        this.A01 = i3;
    }

    private C2913Gz A00(C21864v c21864v, long j2, long j3) {
        int iA00;
        int iA01;
        int iA0A = c21864v.A0A();
        long j4 = -1;
        long j5 = -1;
        long lastPcrTimeUsInRange = -9223372036854775807L;
        while (c21864v.A07() >= 188 && (iA01 = (iA00 = AbstractC3179LI.A00(c21864v.A0l(), c21864v.A09(), iA0A)) + 188) <= iA0A) {
            long jA01 = AbstractC3179LI.A01(c21864v, iA00, this.A00);
            if (jA01 != -9223372036854775807L) {
                long jA06 = this.A03.A06(jA01);
                if (jA06 > j2) {
                    String[] strArr = A04;
                    if (strArr[1].charAt(12) == strArr[2].charAt(12)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[3] = "aExFpEIrb6zE8t35yvld";
                    strArr2[5] = "jMLoot3yN0lnttWSwPI3";
                    if (lastPcrTimeUsInRange == -9223372036854775807L) {
                        return C2913Gz.A04(jA06, j3);
                    }
                    return C2913Gz.A03(j3 + j4);
                }
                long j6 = jA06 + 100000;
                String[] strArr3 = A04;
                if (strArr3[1].charAt(12) != strArr3[2].charAt(12)) {
                    String[] strArr4 = A04;
                    strArr4[3] = "ZHgwZuqrkfLn2FTfbKUV";
                    strArr4[5] = "99YI6qOyfmrUQVvNk1ZB";
                    if (j6 > j2) {
                        return C2913Gz.A03(((long) iA00) + j3);
                    }
                    j4 = iA00;
                    lastPcrTimeUsInRange = jA06;
                } else {
                    A04[4] = "5ynNf";
                    if (j6 > j2) {
                        return C2913Gz.A03(((long) iA00) + j3);
                    }
                    j4 = iA00;
                    lastPcrTimeUsInRange = jA06;
                }
            }
            c21864v.A0f(iA01);
            j5 = iA01;
        }
        if (lastPcrTimeUsInRange != -9223372036854775807L) {
            return C2913Gz.A05(lastPcrTimeUsInRange, j3 + j5);
        }
        return C2913Gz.A03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2915H1
    public final void AFs() {
        this.A02.A0i(AbstractC22035C.A07);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2915H1
    public final C2913Gz AIw(InterfaceC4855ms interfaceC4855ms, long j2) throws IOException {
        long jA8n = interfaceC4855ms.A8n();
        int iMin = (int) Math.min(this.A01, interfaceC4855ms.A8O() - jA8n);
        this.A02.A0d(iMin);
        interfaceC4855ms.AGt(this.A02.A0l(), 0, iMin);
        return A00(this.A02, j2, jA8n);
    }
}
