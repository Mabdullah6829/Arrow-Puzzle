package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lR */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4778lR implements InterfaceC2923H9 {
    public static byte[] A0C;
    public static String[] A0D = {"Jp9jYTsvX0byW8PsTh8WCsi4kS5THTDZ", "u9JmQf2RUpXkbwKGcH1ldYLO1OaAnoG0", "zVRI5h7vLNN08I5W1BFePAuDidXDjkLB", "GupX0AjjIH906l5opBlPCY0Mrv7mkKOY", "YLyM9aD6SKjNKerJ1EloHyT", "oAaNr5RuznTKLecZmpLN", "Q5WjYzMQ2NaCiwYPtyRn68zXUmvTXGHf", "bi8dQH0GL9bk2fQxVP7KQMQdOg6RbrhP"};
    public static final InterfaceC2927HD A0E;
    public int A00;
    public long A01;
    public long A02;
    public InterfaceC2924HA A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final C21854u A08;
    public final C21864v A09;
    public final C21864v A0A;
    public final C4777lQ A0B;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{39, 11, 6, 12, 5, 24, 7, 15, 14, 74, 43, 46, 62, 57, 74, 25, 30, 24, 15, 11, 7};
    }

    static {
        A04();
        A0E = new InterfaceC2927HD() { // from class: com.facebook.ads.redexgen.X.lS
            @Override // com.instagram.common.viewpoint.core.InterfaceC2927HD
            public final InterfaceC2923H9[] A5N() {
                return C4778lR.A07();
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC2927HD
            public final /* synthetic */ InterfaceC2923H9[] A5O(Uri uri, Map map) {
                return AbstractC2926HC.A01(this, uri, map);
            }
        };
    }

    public C4778lR() {
        this(0);
    }

    public C4778lR(int i2) {
        this.A07 = (i2 & 2) != 0 ? i2 | 1 : i2;
        this.A0B = new C4777lQ(true);
        this.A09 = new C21864v(2048);
        this.A00 = -1;
        this.A01 = -1L;
        this.A0A = new C21864v(10);
        this.A08 = new C21854u(this.A0A.A0l());
    }

    public static int A00(int i2, long j2) {
        return (int) (((((long) i2) * 8) * 1000000) / j2);
    }

    private int A01(InterfaceC4855ms interfaceC4855ms) throws IOException {
        int i2 = 0;
        while (true) {
            interfaceC4855ms.AGt(this.A0A.A0l(), 0, 10);
            this.A0A.A0f(0);
            if (this.A0A.A0K() != 4801587) {
                break;
            }
            this.A0A.A0g(3);
            int length = this.A0A.A0H();
            int firstFramePosition = length + 10;
            i2 += firstFramePosition;
            interfaceC4855ms.A47(length);
        }
        interfaceC4855ms.AIl();
        interfaceC4855ms.A47(i2);
        if (this.A01 == -1) {
            this.A01 = i2;
        }
        return i2;
    }

    private C4859mx A02(long j2, boolean z) {
        return new C4859mx(j2, this.A01, A00(this.A00, this.A0B.A0J()), this.A00, z);
    }

    @RequiresNonNull({"extractorOutput"})
    private void A05(long j2, boolean z) {
        if (this.A05) {
            return;
        }
        boolean z2 = (this.A07 & 1) != 0 && this.A00 > 0;
        String[] strArr = A0D;
        if (strArr[2].charAt(14) != strArr[3].charAt(14)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[0] = "wRCLGMQDqXZHrYOEljE7cvu367IJP6qz";
        strArr2[1] = "FofxBB8LpAk5nYyyotl0uMBanfu6Lq1A";
        if (z2 && this.A0B.A0J() == -9223372036854775807L && !z) {
            return;
        }
        if (!z2 || this.A0B.A0J() == -9223372036854775807L) {
            this.A03.AJ7(new C4850mn(-9223372036854775807L));
        } else {
            this.A03.AJ7(A02(j2, (this.A07 & 2) != 0));
        }
        this.A05 = true;
    }

    private void A06(InterfaceC4855ms interfaceC4855ms) throws IOException {
        int iA04;
        if (this.A04) {
            return;
        }
        this.A00 = -1;
        interfaceC4855ms.AIl();
        if (interfaceC4855ms.A8n() == 0) {
            A01(interfaceC4855ms);
        }
        int currentFrameSize = 0;
        long j2 = 0;
        do {
            try {
                if (!interfaceC4855ms.AGu(this.A0A.A0l(), 0, 2, true)) {
                    break;
                }
                this.A0A.A0f(0);
                if (C4777lQ.A0F(this.A0A.A0M())) {
                    if (!interfaceC4855ms.AGu(this.A0A.A0l(), 0, 4, true)) {
                        break;
                    }
                    this.A08.A08(14);
                    iA04 = this.A08.A04(13);
                    int numValidFrames = A0D[7].charAt(7);
                    if (numValidFrames != 114) {
                        A0D[4] = "EiGF";
                        if (iA04 > 6) {
                            j2 += (long) iA04;
                            currentFrameSize++;
                            if (currentFrameSize == 1000) {
                                break;
                            }
                        } else {
                            this.A04 = true;
                            throw C20883K.A01(A03(0, 21, 88), null);
                        }
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    currentFrameSize = 0;
                    break;
                }
            } catch (EOFException unused) {
            }
        } while (interfaceC4855ms.A48(iA04 - 6, true));
        interfaceC4855ms.AIl();
        if (currentFrameSize > 0) {
            this.A00 = (int) (j2 / ((long) currentFrameSize));
        } else {
            this.A00 = -1;
        }
        this.A04 = true;
    }

    public static /* synthetic */ InterfaceC2923H9[] A07() {
        return new InterfaceC2923H9[]{new C4778lR()};
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AAC(InterfaceC2924HA interfaceC2924HA) {
        this.A03 = interfaceC2924HA;
        this.A0B.A5c(interfaceC2924HA, new C3177LG(0, 1));
        interfaceC2924HA.A6O();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final int AHL(InterfaceC4855ms interfaceC4855ms, C2945HV c2945hv) throws IOException {
        AbstractC21273y.A02(this.A03);
        long jA8O = interfaceC4855ms.A8O();
        if (((this.A07 & 2) == 0 && ((this.A07 & 1) == 0 || jA8O == -1)) ? false : true) {
            A06(interfaceC4855ms);
        }
        int bytesRead = interfaceC4855ms.read(this.A09.A0l(), 0, 2048);
        boolean z = bytesRead == -1;
        A05(jA8O, z);
        if (z) {
            return -1;
        }
        this.A09.A0f(0);
        this.A09.A0e(bytesRead);
        if (!this.A06) {
            this.A0B.AGq(this.A02, 4);
            this.A06 = true;
        }
        this.A0B.A5A(this.A09);
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AHb() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AJ6(long j2, long j3) {
        this.A06 = false;
        this.A0B.AJ5();
        this.A02 = j3;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final boolean AK5(InterfaceC4855ms interfaceC4855ms) throws IOException {
        int headerPosition;
        int iA01 = A01(interfaceC4855ms);
        int i2 = iA01;
        int frameSize = 0;
        int syncBytes = 0;
        do {
            interfaceC4855ms.AGt(this.A0A.A0l(), 0, 2);
            this.A0A.A0f(0);
            int startPosition = this.A0A.A0M();
            if (!C4777lQ.A0F(startPosition)) {
                syncBytes = 0;
                frameSize = 0;
                i2++;
                interfaceC4855ms.AIl();
                interfaceC4855ms.A47(i2);
            } else {
                syncBytes++;
                String[] strArr = A0D;
                String str = strArr[2];
                String str2 = strArr[3];
                int headerPosition2 = str.charAt(14);
                int startPosition2 = str2.charAt(14);
                if (headerPosition2 != startPosition2) {
                    throw new RuntimeException();
                }
                A0D[7] = "vlF0iwwjiK26GT4HTqGcAOiXXpcsHbpg";
                if (syncBytes >= 4 && frameSize > 188) {
                    return true;
                }
                interfaceC4855ms.AGt(this.A0A.A0l(), 0, 4);
                this.A08.A08(14);
                C21854u c21854u = this.A08;
                int headerPosition3 = A0D[5].length();
                if (headerPosition3 == 4) {
                    throw new RuntimeException();
                }
                A0D[4] = "LrBCAcAc8FKB1NeW";
                int headerPosition4 = c21854u.A04(13);
                if (headerPosition4 <= 6) {
                    syncBytes = 0;
                    frameSize = 0;
                    i2++;
                    interfaceC4855ms.AIl();
                    interfaceC4855ms.A47(i2);
                } else {
                    int startPosition3 = headerPosition4 - 6;
                    interfaceC4855ms.A47(startPosition3);
                    frameSize += headerPosition4;
                }
            }
            headerPosition = i2 - iA01;
        } while (headerPosition < 8192);
        return false;
    }
}
