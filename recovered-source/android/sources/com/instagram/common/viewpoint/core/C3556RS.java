package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.RS */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3556RS {
    public static byte[] A02;
    public static String[] A03 = {"TTkBeT", "dgqPpyxawDBTokVKz6usds7DGGljbLlG", "Om", "1", "lOfLhIubd0jJyTpTkNltmpZf14oHCLV9", "yX0qRkYxaN2cv8t3SuJSwpxSeia", "n9D4XHOOTGgVdLWa6Wuko3wZCERnKgc", "NKR9b6EIrIhl49GaATLNKeLdYiLud"};
    public final C4578i7<AbstractC3548RK, C3554RQ> A00 = new C4578i7<>();
    public final C3414P6<AbstractC3548RK> A01 = new C3414P6<>();

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 13);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {78, 118, 112, 119, 35, 115, 113, 108, 117, 106, 103, 102, 35, 101, 111, 98, 100, 35, 83, 81, 70, 35, 108, 113, 35, 83, 76, 80, 87};
        if (A03[1].charAt(27) != 'j') {
            throw new RuntimeException();
        }
        A03[0] = "DMTuNl";
        A02 = bArr;
    }

    static {
        A02();
    }

    private C3525Qx A00(AbstractC3548RK abstractC3548RK, int i2) {
        C3554RQ c3554rqA0B;
        C3525Qx info;
        int iA08 = this.A00.A08(abstractC3548RK);
        if (iA08 >= 0 && (c3554rqA0B = this.A00.A0B(iA08)) != null) {
            int i3 = c3554rqA0B.A00;
            if (A03[2].length() != 2) {
                throw new RuntimeException();
            }
            A03[2] = "6x";
            if ((i3 & i2) != 0) {
                int i4 = c3554rqA0B.A00;
                int index = ~i2;
                c3554rqA0B.A00 = i4 & index;
                if (i2 == 4) {
                    info = c3554rqA0B.A02;
                } else if (i2 == 8) {
                    info = c3554rqA0B.A01;
                } else {
                    throw new IllegalArgumentException(A01(0, 29, 14));
                }
                int index2 = c3554rqA0B.A00;
                if ((index2 & 12) == 0) {
                    this.A00.A0A(iA08);
                    C3554RQ.A02(c3554rqA0B);
                }
                return info;
            }
        }
        return null;
    }

    public final C3525Qx A03(AbstractC3548RK abstractC3548RK) {
        return A00(abstractC3548RK, 8);
    }

    public final C3525Qx A04(AbstractC3548RK abstractC3548RK) {
        return A00(abstractC3548RK, 4);
    }

    public final AbstractC3548RK A05(long j2) {
        return this.A01.A08(j2);
    }

    public final void A06() {
        this.A00.clear();
        this.A01.A09();
    }

    public final void A07() {
        C3554RQ.A01();
    }

    public final void A08(long j2, AbstractC3548RK abstractC3548RK) {
        this.A01.A0B(j2, abstractC3548RK);
    }

    public final void A09(AbstractC3548RK abstractC3548RK) {
        C3554RQ c3554rqA00 = this.A00.get(abstractC3548RK);
        if (c3554rqA00 == null) {
            c3554rqA00 = C3554RQ.A00();
            this.A00.put(abstractC3548RK, c3554rqA00);
        }
        c3554rqA00.A00 |= 1;
    }

    public final void A0A(AbstractC3548RK abstractC3548RK) {
        C3554RQ c3554rq = this.A00.get(abstractC3548RK);
        if (c3554rq == null) {
            return;
        }
        c3554rq.A00 &= -2;
    }

    public final void A0B(AbstractC3548RK abstractC3548RK) {
        for (int iA06 = this.A01.A06() - 1; iA06 >= 0; iA06--) {
            if (abstractC3548RK == this.A01.A07(iA06)) {
                this.A01.A0A(iA06);
                break;
            }
        }
        C3554RQ info = this.A00.remove(abstractC3548RK);
        if (info != null) {
            C3554RQ.A02(info);
        }
    }

    public final void A0C(AbstractC3548RK abstractC3548RK) {
        A0A(abstractC3548RK);
    }

    public final void A0D(AbstractC3548RK abstractC3548RK, C3525Qx c3525Qx) {
        C3554RQ c3554rqA00 = this.A00.get(abstractC3548RK);
        if (c3554rqA00 == null) {
            c3554rqA00 = C3554RQ.A00();
            this.A00.put(abstractC3548RK, c3554rqA00);
        }
        c3554rqA00.A00 |= 2;
        c3554rqA00.A02 = c3525Qx;
    }

    public final void A0E(AbstractC3548RK abstractC3548RK, C3525Qx c3525Qx) {
        C3554RQ c3554rqA00 = this.A00.get(abstractC3548RK);
        if (c3554rqA00 == null) {
            c3554rqA00 = C3554RQ.A00();
            this.A00.put(abstractC3548RK, c3554rqA00);
        }
        c3554rqA00.A01 = c3525Qx;
        c3554rqA00.A00 |= 8;
    }

    public final void A0F(AbstractC3548RK abstractC3548RK, C3525Qx c3525Qx) {
        C3554RQ c3554rqA00 = this.A00.get(abstractC3548RK);
        if (c3554rqA00 == null) {
            c3554rqA00 = C3554RQ.A00();
            this.A00.put(abstractC3548RK, c3554rqA00);
        }
        c3554rqA00.A02 = c3525Qx;
        c3554rqA00.A00 |= 4;
    }

    public final void A0G(InterfaceC3555RR interfaceC3555RR) {
        for (int size = this.A00.size() - 1; size >= 0; size--) {
            AbstractC3548RK abstractC3548RKA09 = this.A00.A09(size);
            C3554RQ c3554rqA0A = this.A00.A0A(size);
            if ((c3554rqA0A.A00 & 3) == 3) {
                interfaceC3555RR.AKZ(abstractC3548RKA09);
            } else {
                int index = c3554rqA0A.A00;
                if ((index & 1) != 0) {
                    if (c3554rqA0A.A02 == null) {
                        interfaceC3555RR.AKZ(abstractC3548RKA09);
                    } else {
                        interfaceC3555RR.AHB(abstractC3548RKA09, c3554rqA0A.A02, c3554rqA0A.A01);
                    }
                } else if ((c3554rqA0A.A00 & 14) == 14) {
                    interfaceC3555RR.AH9(abstractC3548RKA09, c3554rqA0A.A02, c3554rqA0A.A01);
                } else if ((c3554rqA0A.A00 & 12) == 12) {
                    interfaceC3555RR.AHD(abstractC3548RKA09, c3554rqA0A.A02, c3554rqA0A.A01);
                } else {
                    int index2 = c3554rqA0A.A00;
                    if ((index2 & 4) != 0) {
                        interfaceC3555RR.AHB(abstractC3548RKA09, c3554rqA0A.A02, null);
                    } else {
                        int index3 = c3554rqA0A.A00;
                        if ((index3 & 8) != 0) {
                            C3525Qx c3525Qx = c3554rqA0A.A02;
                            if (A03[4].charAt(6) == 'y') {
                                throw new RuntimeException();
                            }
                            A03[7] = "pRTOxDzzIVV0VuKMKqyuKOShfW9n8";
                            interfaceC3555RR.AH9(abstractC3548RKA09, c3525Qx, c3554rqA0A.A01);
                        } else {
                            continue;
                        }
                    }
                }
            }
            C3554RQ.A02(c3554rqA0A);
        }
    }

    public final boolean A0H(AbstractC3548RK abstractC3548RK) {
        C3554RQ record = this.A00.get(abstractC3548RK);
        return (record == null || (record.A00 & 1) == 0) ? false : true;
    }

    public final boolean A0I(AbstractC3548RK abstractC3548RK) {
        C3554RQ record = this.A00.get(abstractC3548RK);
        return (record == null || (record.A00 & 4) == 0) ? false : true;
    }
}
