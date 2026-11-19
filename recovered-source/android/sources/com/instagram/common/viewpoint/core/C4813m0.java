package com.instagram.common.viewpoint.core;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.m0 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4813m0 implements InterfaceC3071JY {
    public static byte[] A0C;
    public static String[] A0D = {"jRj2ugi7SPR", "MNKsBNeD8MF1tCUmeU2P5Nj3hkdjoOc", "XMkmXaTlrOCX5lXmL6kh3TwHyWbdiNoj", "CqZnv6WT0ufq4g7hl2oSYE9w8", "bGEXSwT2dmCwLmvORXS7whQ8v", "55313totkqX4mBMXvHmYF6PzdsDv8MD", "C0ywJUyDCeWGQi9DxnjwsD3coqyGffR", "BhHq3twmKlbS1H4hpApJBSGHB"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public final long A08;
    public final long A09;
    public final C3070JX A0A;
    public final AbstractC3074Jb A0B;

    public static String A07(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0C = new byte[]{-68, -35, -114, -35, -43, -43, -114, -34, -49, -43, -45, -114, -47, -49, -36, -114, -48, -45, -114, -44, -35, -29, -36, -46, -100};
    }

    static {
        A08();
    }

    public C4813m0(AbstractC3074Jb abstractC3074Jb, long j2, long j3, long j4, long j5, boolean z) {
        AbstractC21273y.A07(j2 >= 0 && j3 > j2);
        this.A0B = abstractC3074Jb;
        this.A09 = j2;
        this.A08 = j3;
        if (j4 == j3 - j2 || z) {
            this.A07 = j5;
            this.A00 = 4;
        } else {
            this.A00 = 0;
        }
        this.A0A = new C3070JX();
    }

    private long A00(InterfaceC4855ms interfaceC4855ms) throws IOException {
        if (this.A04 == this.A01) {
            return -1L;
        }
        long jA8n = interfaceC4855ms.A8n();
        if (!this.A0A.A04(interfaceC4855ms, this.A01)) {
            if (this.A04 != jA8n) {
                return this.A04;
            }
            throw new IOException(A07(0, 25, 27));
        }
        this.A0A.A05(interfaceC4855ms, false);
        interfaceC4855ms.AIl();
        long currentPosition = this.A06 - this.A0A.A05;
        int i2 = this.A0A.A01 + this.A0A.A00;
        if (0 <= currentPosition && currentPosition < 72000) {
            return -1L;
        }
        if (currentPosition >= 0) {
            this.A04 = interfaceC4855ms.A8n() + ((long) i2);
            this.A05 = this.A0A.A05;
        } else {
            this.A01 = jA8n;
            C3070JX c3070jx = this.A0A;
            String[] strArr = A0D;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[3] = "rTnMeKP9Ntef56gYj2I82A9Og";
            strArr2[7] = "Ns8cmH2a0bzEbJPPC1zDKlbsv";
            this.A02 = c3070jx.A05;
        }
        if (this.A01 - this.A04 < 100000) {
            this.A01 = this.A04;
            return this.A04;
        }
        long offset = ((long) i2) * (currentPosition <= 0 ? 2L : 1L);
        long jA8n2 = interfaceC4855ms.A8n() - offset;
        long offset2 = this.A01;
        return AbstractC22035C.A0T(jA8n2 + (((offset2 - this.A04) * currentPosition) / (this.A02 - this.A05)), this.A04, this.A01 - 1);
    }

    private final long A01(InterfaceC4855ms interfaceC4855ms) throws IOException {
        this.A0A.A02();
        if (this.A0A.A03(interfaceC4855ms)) {
            this.A0A.A05(interfaceC4855ms, false);
            interfaceC4855ms.AK3(this.A0A.A01 + this.A0A.A00);
            C3070JX c3070jx = this.A0A;
            String[] strArr = A0D;
            if (strArr[0].length() != strArr[1].length()) {
                String[] strArr2 = A0D;
                strArr2[3] = "I2mhjjmoE8ZJ2Dg0LzbNmT9WC";
                strArr2[7] = "IEpLWq2gVTEx0SVSUh2piystZ";
                long j2 = c3070jx.A05;
                while ((this.A0A.A04 & 4) != 4 && this.A0A.A03(interfaceC4855ms) && interfaceC4855ms.A8n() < this.A08) {
                    if (this.A0A.A05(interfaceC4855ms, true)) {
                        C3070JX c3070jx2 = this.A0A;
                        String[] strArr3 = A0D;
                        if (strArr3[6].length() == strArr3[5].length()) {
                            A0D[2] = "1J9QEDZvjIULKx6bD2w0xEMzJBfvilpU";
                            if (AbstractC2925HB.A02(interfaceC4855ms, c3070jx2.A01 + this.A0A.A00)) {
                                j2 = this.A0A.A05;
                            }
                        }
                    }
                    return j2;
                }
                return j2;
            }
            throw new RuntimeException();
        }
        throw new EOFException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.InterfaceC3071JY
    /* JADX INFO: renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C4814m1 A5Z() {
        C3068JV c3068jv = null;
        if (this.A07 != 0) {
            return new C4814m1(this);
        }
        return null;
    }

    private void A09(InterfaceC4855ms interfaceC4855ms) throws IOException {
        while (true) {
            this.A0A.A03(interfaceC4855ms);
            this.A0A.A05(interfaceC4855ms, false);
            if (this.A0A.A05 > this.A06) {
                interfaceC4855ms.AIl();
                return;
            } else {
                interfaceC4855ms.AK3(this.A0A.A01 + this.A0A.A00);
                this.A04 = interfaceC4855ms.A8n();
                this.A05 = this.A0A.A05;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3071JY
    public final long AHN(InterfaceC4855ms interfaceC4855ms) throws IOException {
        switch (this.A00) {
            case 0:
                this.A03 = interfaceC4855ms.A8n();
                this.A00 = 1;
                long j2 = this.A08 - 65307;
                if (j2 > this.A03) {
                    return j2;
                }
            case 1:
                long lastPageSearchPosition = A01(interfaceC4855ms);
                this.A07 = lastPageSearchPosition;
                String[] strArr = A0D;
                if (strArr[6].length() != strArr[5].length()) {
                    A0D[4] = "Q";
                    this.A00 = 4;
                    return this.A03;
                }
                A0D[2] = "zPL0M1I0YHefEI7ePcrxVR039vnXiGQX";
                this.A00 = 4;
                return this.A03;
            case 2:
                long position = A00(interfaceC4855ms);
                if (A0D[2].charAt(28) == 'i') {
                    A0D[4] = "EIP7mTXqLgr9aPVawFNgKKAemnhenv";
                    if (position != -1) {
                        return position;
                    }
                    this.A00 = 3;
                    break;
                } else {
                    throw new RuntimeException();
                }
            case 3:
                A09(interfaceC4855ms);
                this.A00 = 4;
                return -(this.A05 + 2);
            case 4:
                return -1L;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3071JY
    public final void AKC(long j2) {
        this.A06 = AbstractC22035C.A0T(j2, 0L, this.A07 - 1);
        this.A00 = 2;
        this.A04 = this.A09;
        this.A01 = this.A08;
        this.A05 = 0L;
        this.A02 = this.A07;
    }
}
