package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.facebook.ads.androidx.media3.common.Metadata;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mg */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4843mg implements InterfaceC2923H9 {
    public static String[] A0E = {"CA5tgyD1ft6jPQScHcEKxijdDn8CpaAj", "rrvFpoycxrr9C", "qEVAWkTuIpwlYdd7u09", "zGu", "r98", "bvJEUCblPMa4rVVBIUxYNVrIzXUNKtA9", "0YPJWJVAuNzanCV2KA", "Ww61LKXhC9Y0aL9N3LYwjUph3RiaOuui"};
    public static final InterfaceC2927HD A0F = new InterfaceC2927HD() { // from class: com.facebook.ads.redexgen.X.mh
        @Override // com.instagram.common.viewpoint.core.InterfaceC2927HD
        public final InterfaceC2923H9[] A5N() {
            return C4843mg.A09();
        }

        @Override // com.instagram.common.viewpoint.core.InterfaceC2927HD
        public final /* synthetic */ InterfaceC2923H9[] A5O(Uri uri, Map map) {
            return AbstractC2926HC.A01(this, uri, map);
        }
    };
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public Metadata A05;
    public InterfaceC2924HA A06;
    public C2933HJ A07;
    public InterfaceC2953Hd A08;
    public C4845mi A09;
    public final C21864v A0A;
    public final C2928HE A0B;
    public final boolean A0C;
    public final byte[] A0D;

    public C4843mg() {
        this(0);
    }

    public C4843mg(int i2) {
        this.A0D = new byte[42];
        this.A0A = new C21864v(new byte[32768], 0);
        this.A0C = (i2 & 1) != 0;
        this.A0B = new C2928HE();
        this.A03 = 0;
    }

    private int A00(InterfaceC4855ms interfaceC4855ms, C2945HV c2945hv) throws IOException {
        AbstractC21273y.A01(this.A08);
        AbstractC21273y.A01(this.A07);
        if (this.A09 != null && this.A09.A09()) {
            return this.A09.A06(interfaceC4855ms, c2945hv);
        }
        long j2 = this.A04;
        if (A0E[2].length() == 19) {
            A0E[2] = "5vsaEOzV8f26KwvJg69";
            if (j2 == -1) {
                this.A04 = AbstractC2929HF.A01(interfaceC4855ms, this.A07);
                return 0;
            }
            int iA0A = this.A0A.A0A();
            String[] strArr = A0E;
            if (strArr[6].length() != strArr[1].length()) {
                String[] strArr2 = A0E;
                strArr2[6] = "dF6ALNUNBXQAeyaZgj";
                strArr2[1] = "WrJkmBjBZcK3S";
                boolean z = false;
                if (iA0A < 32768) {
                    int currentLimit = 32768 - iA0A;
                    int i2 = interfaceC4855ms.read(this.A0A.A0l(), iA0A, currentLimit);
                    z = i2 == -1;
                    if (!z) {
                        this.A0A.A0e(iA0A + i2);
                    } else {
                        int currentLimit2 = this.A0A.A07();
                        if (currentLimit2 == 0) {
                            A03();
                            return -1;
                        }
                    }
                }
                int iA09 = this.A0A.A09();
                int i3 = this.A00;
                int currentLimit3 = this.A02;
                if (i3 < currentLimit3) {
                    C21864v c21864v = this.A0A;
                    int i4 = this.A02;
                    int currentLimit4 = this.A00;
                    int i5 = i4 - currentLimit4;
                    int currentLimit5 = this.A0A.A07();
                    c21864v.A0g(Math.min(i5, currentLimit5));
                }
                long jA01 = A01(this.A0A, z);
                int iA010 = this.A0A.A09() - iA09;
                this.A0A.A0f(iA09);
                this.A08.AIr(this.A0A, iA010);
                int currentLimit6 = this.A00;
                this.A00 = currentLimit6 + iA010;
                if (jA01 != -1) {
                    A03();
                    String[] strArr3 = A0E;
                    String str = strArr3[6];
                    String str2 = strArr3[1];
                    int length = str.length();
                    int currentLimit7 = str2.length();
                    if (length != currentLimit7) {
                        String[] strArr4 = A0E;
                        strArr4[3] = "m1G";
                        strArr4[4] = "pgV";
                        this.A00 = 0;
                        this.A04 = jA01;
                    }
                }
                if (this.A0A.A07() < 16) {
                    int iA07 = this.A0A.A07();
                    System.arraycopy(this.A0A.A0l(), this.A0A.A09(), this.A0A.A0l(), 0, iA07);
                    this.A0A.A0f(0);
                    this.A0A.A0e(iA07);
                }
                return 0;
            }
        }
        throw new RuntimeException();
    }

    private long A01(C21864v c21864v, boolean z) {
        boolean zA07;
        AbstractC21273y.A01(this.A07);
        int iA09 = c21864v.A09();
        while (iA09 <= frameOffset - 16) {
            c21864v.A0f(iA09);
            if (AbstractC2929HF.A07(c21864v, this.A07, this.A01, this.A0B)) {
                c21864v.A0f(iA09);
                return this.A0B.A00;
            }
            iA09++;
        }
        if (z) {
            while (iA09 <= iA0A - frameOffset) {
                c21864v.A0f(iA09);
                try {
                    zA07 = AbstractC2929HF.A07(c21864v, this.A07, this.A01, this.A0B);
                } catch (IndexOutOfBoundsException unused) {
                    zA07 = false;
                }
                int iA010 = c21864v.A09();
                int frameOffset = c21864v.A0A();
                if (iA010 > frameOffset) {
                    zA07 = false;
                }
                if (zA07) {
                    c21864v.A0f(iA09);
                    return this.A0B.A00;
                }
                iA09++;
            }
            int frameOffset2 = c21864v.A0A();
            c21864v.A0f(frameOffset2);
        } else {
            c21864v.A0f(iA09);
        }
        String[] strArr = A0E;
        String str = strArr[3];
        String str2 = strArr[4];
        int length = str.length();
        int frameOffset3 = str2.length();
        if (length != frameOffset3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[7] = "ocsB3wUrjHvCq2LiV7qRqPCVLxbY4c1N";
        strArr2[5] = "pwt2z55mSaXVkRisABTZleFgLF4gxvRK";
        return -1L;
    }

    private InterfaceC2948HY A02(long j2, long j3) {
        AbstractC21273y.A01(this.A07);
        if (this.A07.A0A != null) {
            return new C4852mp(this.A07, j2);
        }
        if (j3 != -1 && this.A07.A09 > 0) {
            this.A09 = new C4845mi(this.A07, this.A01, j2, j3);
            return this.A09.A07();
        }
        return new C4850mn(this.A07.A06());
    }

    private void A03() {
        ((InterfaceC2953Hd) AbstractC22035C.A0f(this.A08)).AIu((this.A04 * 1000000) / ((long) ((C2933HJ) AbstractC22035C.A0f(this.A07)).A07), 1, this.A00, 0, null);
    }

    private void A04(InterfaceC4855ms interfaceC4855ms) throws IOException {
        this.A01 = AbstractC2931HH.A00(interfaceC4855ms);
        ((InterfaceC2924HA) AbstractC22035C.A0f(this.A06)).AJ7(A02(interfaceC4855ms.A8n(), interfaceC4855ms.A8O()));
        this.A03 = 5;
    }

    private void A05(InterfaceC4855ms interfaceC4855ms) throws IOException {
        interfaceC4855ms.AGt(this.A0D, 0, this.A0D.length);
        interfaceC4855ms.AIl();
        this.A03 = 2;
    }

    private void A06(InterfaceC4855ms interfaceC4855ms) throws IOException {
        this.A05 = AbstractC2931HH.A02(interfaceC4855ms, !this.A0C);
        this.A03 = 1;
    }

    private void A07(InterfaceC4855ms interfaceC4855ms) throws IOException {
        boolean zA0B = false;
        C2930HG metadataHolder = new C2930HG(this.A07);
        while (!zA0B) {
            zA0B = AbstractC2931HH.A0B(interfaceC4855ms, metadataHolder);
            this.A07 = (C2933HJ) AbstractC22035C.A0f(metadataHolder.A00);
        }
        AbstractC21273y.A01(this.A07);
        this.A02 = Math.max(this.A07.A06, 6);
        ((InterfaceC2953Hd) AbstractC22035C.A0f(this.A08)).A6e(this.A07.A08(this.A0D, this.A05));
        this.A03 = 4;
    }

    private void A08(InterfaceC4855ms interfaceC4855ms) throws IOException {
        AbstractC2931HH.A09(interfaceC4855ms);
        this.A03 = 3;
    }

    public static /* synthetic */ InterfaceC2923H9[] A09() {
        return new InterfaceC2923H9[]{new C4843mg()};
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AAC(InterfaceC2924HA interfaceC2924HA) {
        this.A06 = interfaceC2924HA;
        this.A08 = interfaceC2924HA.AKS(0, 1);
        interfaceC2924HA.A6O();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final int AHL(InterfaceC4855ms interfaceC4855ms, C2945HV c2945hv) throws IOException {
        switch (this.A03) {
            case 0:
                A06(interfaceC4855ms);
                return 0;
            case 1:
                A05(interfaceC4855ms);
                return 0;
            case 2:
                A08(interfaceC4855ms);
                return 0;
            case 3:
                A07(interfaceC4855ms);
                return 0;
            case 4:
                A04(interfaceC4855ms);
                return 0;
            case 5:
                return A00(interfaceC4855ms, c2945hv);
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AHb() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AJ6(long j2, long j3) {
        if (j2 == 0) {
            this.A03 = 0;
        } else {
            C4845mi c4845mi = this.A09;
            if (A0E[2].length() != 19) {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[3] = "FHi";
            strArr[4] = "3pT";
            if (c4845mi != null) {
                this.A09.A08(j3);
            }
        }
        this.A04 = j3 != 0 ? -1L : 0L;
        this.A00 = 0;
        this.A0A.A0d(0);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final boolean AK5(InterfaceC4855ms interfaceC4855ms) throws IOException {
        AbstractC2931HH.A01(interfaceC4855ms, false);
        return AbstractC2931HH.A0A(interfaceC4855ms);
    }
}
