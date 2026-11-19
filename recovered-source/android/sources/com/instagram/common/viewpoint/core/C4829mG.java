package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.MlltFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mG */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization("DoNotStrip")
public final class C4829mG implements InterfaceC2923H9 {
    public static byte[] A0K;
    public static String[] A0L = {"", "XN01ItT2bHY64Udo8U0rv5VGSzBxMc17", "LZob5GHcOm1BKJQ2vQEKg44UBdoAB", "Ux8BYUlKxCzUFwXHW791pvzO", "", "EYpHAHesBPuZwNRi93BVygfvwpQNuwRz", "BndnCdJGei78P0VEYjqxuWcWalVGolEJ", "FxTwI"};
    public static final InterfaceC2927HD A0M;
    public static final InterfaceC2990IE A0N;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public Metadata A06;
    public InterfaceC2924HA A07;
    public InterfaceC2953Hd A08;
    public InterfaceC2953Hd A09;
    public InterfaceC4828mF A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;
    public final long A0E;
    public final C21864v A0F;
    public final C2934HK A0G;
    public final C2936HM A0H;
    public final C2937HN A0I;
    public final InterfaceC2953Hd A0J;

    public static String A09(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0K, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A0K = new byte[]{-78, -60, -64, -47, -62, -57, -60, -61, 127, -45, -50, -50, 127, -52, -64, -51, -40, 127, -63, -40, -45, -60, -46, -115, -27, -35, -42, -33};
        if (A0L[5].charAt(24) == 'i') {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[1] = "rBULd6kp2sYKxjbrN7jKkVDhSodb4v28";
        strArr[6] = "gBWiztBtWh7JHxCzKYVaG6CraVXBuCHm";
    }

    static {
        A0B();
        A0M = new InterfaceC2927HD() { // from class: com.facebook.ads.redexgen.X.mI
            @Override // com.instagram.common.viewpoint.core.InterfaceC2927HD
            public final InterfaceC2923H9[] A5N() {
                return C4829mG.A0G();
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC2927HD
            public final /* synthetic */ InterfaceC2923H9[] A5O(Uri uri, Map map) {
                return AbstractC2926HC.A01(this, uri, map);
            }
        };
        A0N = new InterfaceC2990IE() { // from class: com.facebook.ads.redexgen.X.mH
            @Override // com.instagram.common.viewpoint.core.InterfaceC2990IE
            public final boolean A6Q(int i2, int i3, int i4, int i5, int i6) {
                return C4829mG.A0C(i2, i3, i4, i5, i6);
            }
        };
    }

    @MetaExoPlayerCustomization("DoNotStrip")
    public C4829mG() {
        this(0);
    }

    @MetaExoPlayerCustomization("DoNotStrip")
    public C4829mG(int i2) {
        this(i2, -9223372036854775807L);
    }

    @MetaExoPlayerCustomization("DoNotStrip")
    public C4829mG(int i2, long j2) {
        this.A0D = (i2 & 2) != 0 ? i2 | 1 : i2;
        this.A0E = j2;
        this.A0F = new C21864v(10);
        this.A0I = new C2937HN();
        this.A0G = new C2934HK();
        this.A02 = -9223372036854775807L;
        this.A0H = new C2936HM();
        this.A0J = new C4856mt();
        this.A08 = this.A0J;
    }

    public static int A00(C21864v c21864v, int i2) {
        if (c21864v.A0A() >= i2 + 4) {
            c21864v.A0f(i2);
            if (A0L[5].charAt(24) == 'i') {
                throw new RuntimeException();
            }
            A0L[3] = "hnNDf1WGfP5HptxyzX0WY3yEy4CiO";
            int iA0C = c21864v.A0C();
            if (iA0C == 1483304551 || iA0C == 1231971951) {
                return iA0C;
            }
        }
        if (c21864v.A0A() >= 40) {
            c21864v.A0f(36);
            return c21864v.A0C() == 1447187017 ? 1447187017 : 0;
        }
        return 0;
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private int A01(InterfaceC4855ms interfaceC4855ms) throws IOException {
        if (this.A01 == 0) {
            try {
                A0F(interfaceC4855ms, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.A0A == null) {
            this.A0A = A07(interfaceC4855ms);
            this.A07.AJ7(this.A0A);
            this.A08.A6e(new C20592p().A11(this.A0I.A06).A0h(4096).A0b(this.A0I.A01).A0m(this.A0I.A03).A0d(this.A0G.A00).A0e(this.A0G.A01).A0v((this.A0D & 8) != 0 ? null : this.A06).A14());
            this.A03 = interfaceC4855ms.A8n();
        } else if (this.A03 != 0) {
            long jA8n = interfaceC4855ms.A8n();
            if (jA8n < this.A03) {
                interfaceC4855ms.AK3((int) (this.A03 - jA8n));
            }
        }
        return A02(interfaceC4855ms);
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    private int A02(InterfaceC4855ms interfaceC4855ms) throws IOException {
        if (this.A00 == 0) {
            interfaceC4855ms.AIl();
            if (A0E(interfaceC4855ms)) {
                return -1;
            }
            this.A0F.A0f(0);
            int iA0C = this.A0F.A0C();
            int sampleHeaderData = this.A01;
            if (A0D(iA0C, sampleHeaderData)) {
                int sampleHeaderData2 = AbstractC2938HO.A00(iA0C);
                if (sampleHeaderData2 != -1) {
                    this.A0I.A00(iA0C);
                    if (this.A02 == -9223372036854775807L) {
                        this.A02 = this.A0A.A9H(interfaceC4855ms.A8n());
                        if (this.A0E != -9223372036854775807L) {
                            this.A02 += this.A0E - this.A0A.A9H(0L);
                        }
                    }
                    int sampleHeaderData3 = this.A0I.A02;
                    this.A00 = sampleHeaderData3;
                    if (this.A0A instanceof C24148b) {
                        C24148b c24148b = (C24148b) this.A0A;
                        long j2 = this.A04;
                        int sampleHeaderData4 = this.A0I.A04;
                        long jA03 = A03(j2 + ((long) sampleHeaderData4));
                        long jA8n = interfaceC4855ms.A8n();
                        int sampleHeaderData5 = this.A0I.A02;
                        c24148b.A01(jA03, jA8n + ((long) sampleHeaderData5));
                        if (this.A0C && c24148b.A02(this.A05)) {
                            this.A0C = false;
                            this.A08 = this.A09;
                        }
                    }
                }
            }
            interfaceC4855ms.AK3(1);
            this.A01 = 0;
            return 0;
        }
        int iAIp = this.A08.AIp(interfaceC4855ms, this.A00, true);
        if (iAIp == -1) {
            return -1;
        }
        int bytesAppended = this.A00;
        this.A00 = bytesAppended - iAIp;
        int bytesAppended2 = this.A00;
        if (bytesAppended2 > 0) {
            return 0;
        }
        this.A08.AIu(A03(this.A04), 1, this.A0I.A02, 0, null);
        if (A0L[5].charAt(24) == 'i') {
            throw new RuntimeException();
        }
        A0L[3] = "39D9RtME66Nzc4lHdRGQvnw";
        long j3 = this.A04;
        int bytesAppended3 = this.A0I.A04;
        this.A04 = j3 + ((long) bytesAppended3);
        this.A00 = 0;
        return 0;
    }

    private long A03(long j2) {
        return this.A02 + ((1000000 * j2) / ((long) this.A0I.A03));
    }

    public static long A04(Metadata metadata) {
        if (metadata != null) {
            int iA02 = metadata.A02();
            for (int i2 = 0; i2 < iA02; i2++) {
                Metadata.Entry entryA03 = metadata.A03(i2);
                if ((entryA03 instanceof TextInformationFrame) && ((Id3Frame) ((TextInformationFrame) entryA03)).A00.equals(A09(24, 4, 101))) {
                    return AbstractC22035C.A0O(Long.parseLong(((TextInformationFrame) entryA03).A02.get(0)));
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    private C24218i A05(InterfaceC4855ms interfaceC4855ms, boolean z) throws IOException {
        interfaceC4855ms.AGt(this.A0F.A0l(), 0, 4);
        this.A0F.A0f(0);
        this.A0I.A00(this.A0F.A0C());
        return new C24218i(interfaceC4855ms.A8O(), interfaceC4855ms.A8n(), this.A0I, z);
    }

    public static C24108X A06(Metadata metadata, long j2) {
        if (metadata != null) {
            int iA02 = metadata.A02();
            for (int i2 = 0; i2 < iA02; i2++) {
                Metadata.Entry entry = metadata.A03(i2);
                if (entry instanceof MlltFrame) {
                    return C24108X.A01(j2, (MlltFrame) entry, A04(metadata));
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0095  */
    private InterfaceC4828mF A07(InterfaceC4855ms interfaceC4855ms) throws IOException {
        long durationUs;
        InterfaceC4828mF interfaceC4828mFA08 = A08(interfaceC4855ms);
        InterfaceC4828mF seekFrameSeeker = A06(this.A06, interfaceC4855ms.A8n());
        if (this.A0B) {
            return new C24098W();
        }
        InterfaceC4828mF c24148b = null;
        if ((this.A0D & 4) != 0) {
            long jA7j = -1;
            if (seekFrameSeeker != null) {
                durationUs = seekFrameSeeker.A7t();
                jA7j = seekFrameSeeker.A7j();
            } else if (interfaceC4828mFA08 != null) {
                durationUs = interfaceC4828mFA08.A7t();
                jA7j = interfaceC4828mFA08.A7j();
            } else {
                durationUs = A04(this.A06);
            }
            c24148b = new C24148b(durationUs, interfaceC4855ms.A8n(), jA7j);
        } else if (seekFrameSeeker != null) {
            c24148b = seekFrameSeeker;
        } else if (interfaceC4828mFA08 != null) {
            c24148b = interfaceC4828mFA08;
        }
        boolean z = true;
        String[] strArr = A0L;
        if (strArr[1].charAt(10) == strArr[6].charAt(10)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0L;
        strArr2[7] = "puIT5";
        strArr2[4] = "";
        if (c24148b == null || (!c24148b.AAj() && (this.A0D & 1) != 0)) {
            int i2 = this.A0D;
            if (A0L[5].charAt(24) != 'i') {
                String[] strArr3 = A0L;
                strArr3[7] = "yAfIM";
                strArr3[4] = "";
                if ((i2 & 2) == 0) {
                    z = false;
                }
            } else {
                A0L[5] = "MGo95V6JQFDSGlQkmGWT48KfEqhrmySi";
                if ((i2 & 2) == 0) {
                    z = false;
                }
            }
            return A05(interfaceC4855ms, z);
        }
        return c24148b;
    }

    private InterfaceC4828mF A08(InterfaceC4855ms interfaceC4855ms) throws IOException {
        C21864v c21864v = new C21864v(this.A0I.A02);
        interfaceC4855ms.AGt(c21864v.A0l(), 0, this.A0I.A02);
        int i2 = 21;
        if ((this.A0I.A05 & 1) != 0) {
            if (this.A0I.A01 != 1) {
                i2 = 36;
            }
        } else if (this.A0I.A01 == 1) {
            i2 = 13;
        }
        int iA00 = A00(c21864v, i2);
        if (iA00 == 1483304551 || iA00 == 1231971951) {
            C24078U c24078uA01 = C24078U.A01(interfaceC4855ms.A8O(), interfaceC4855ms.A8n(), this.A0I, c21864v);
            if (c24078uA01 != null && !this.A0G.A03()) {
                interfaceC4855ms.AIl();
                interfaceC4855ms.A47(i2 + 141);
                C21864v frame = this.A0F;
                interfaceC4855ms.AGt(frame.A0l(), 0, 3);
                C21864v frame2 = this.A0F;
                frame2.A0f(0);
                C2934HK c2934hk = this.A0G;
                C21864v frame3 = this.A0F;
                c2934hk.A04(frame3.A0K());
            }
            interfaceC4855ms.AK3(this.A0I.A02);
            if (c24078uA01 != null && !c24078uA01.AAj() && iA00 == 1231971951) {
                C24218i c24218iA05 = A05(interfaceC4855ms, false);
                String[] strArr = A0L;
                String str = strArr[7];
                String str2 = strArr[4];
                int xingBase = str.length();
                if (xingBase == str2.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0L;
                strArr2[1] = "bGvlWKvJjPQrySHefRGmEijHbVzYOxUK";
                strArr2[6] = "fU58RXvZc6f3KsNNOCISAUQgLzoCeDCK";
                return c24218iA05;
            }
            return c24078uA01;
        }
        if (iA00 == 1447187017) {
            C24088V c24088vA00 = C24088V.A00(interfaceC4855ms.A8O(), interfaceC4855ms.A8n(), this.A0I, c21864v);
            interfaceC4855ms.AK3(this.A0I.A02);
            return c24088vA00;
        }
        interfaceC4855ms.AIl();
        return null;
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    private void A0A() {
        AbstractC21273y.A02(this.A09);
    }

    public static /* synthetic */ boolean A0C(int i2, int i3, int i4, int i5, int i6) {
        if (i3 != 67 || i4 != 79 || i5 != 77 || (i6 != 77 && i2 != 2)) {
            if (i3 == 77) {
                if (A0L[5].charAt(24) == 'i') {
                    throw new RuntimeException();
                }
                String[] strArr = A0L;
                strArr[2] = "NxAl2v4obD3CfxY1bwrYNdaYMjSl6";
                strArr[0] = "";
                if (i4 != 76 || i5 != 76 || (i6 != 84 && i2 != 2)) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A0D(int i2, long j2) {
        return ((long) ((-128000) & i2)) == ((-128000) & j2);
    }

    private boolean A0E(InterfaceC4855ms interfaceC4855ms) throws IOException {
        if (this.A0A != null) {
            long jA7j = this.A0A.A7j();
            if (jA7j != -1) {
                long dataEndPosition = interfaceC4855ms.A8i();
                if (dataEndPosition > jA7j - 4) {
                    return true;
                }
            }
        }
        try {
            return !interfaceC4855ms.AGu(this.A0F.A0l(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private boolean A0F(InterfaceC4855ms interfaceC4855ms, boolean z) throws IOException {
        int candidateSynchronizedHeaderData;
        int i2 = 0;
        int i3 = 0;
        int iA8i = 0;
        int searchedBytes = 0;
        int headerData = z ? 32768 : 131072;
        interfaceC4855ms.AIl();
        if (interfaceC4855ms.A8n() == 0) {
            int validFrameCount = this.A0D;
            int validFrameCount2 = (validFrameCount & 8) == 0 ? 1 : 0;
            this.A06 = this.A0H.A00(interfaceC4855ms, validFrameCount2 != 0 ? null : A0N);
            if (this.A06 != null) {
                this.A0G.A05(this.A06);
            }
            iA8i = (int) interfaceC4855ms.A8i();
            if (!z) {
                interfaceC4855ms.AK3(iA8i);
            }
        }
        while (true) {
            if (A0E(interfaceC4855ms)) {
                if (i2 > 0) {
                    break;
                }
                throw new EOFException();
            }
            this.A0F.A0f(0);
            int iA0C = this.A0F.A0C();
            if ((i3 != 0 && !A0D(iA0C, i3)) || (candidateSynchronizedHeaderData = AbstractC2938HO.A00(iA0C)) == -1) {
                int candidateSynchronizedHeaderData2 = searchedBytes + 1;
                if (searchedBytes == headerData) {
                    if (z) {
                        return false;
                    }
                    throw C20883K.A01(A09(0, 24, 51), null);
                }
                i2 = 0;
                i3 = 0;
                if (z) {
                    interfaceC4855ms.AIl();
                    int validFrameCount3 = iA8i + candidateSynchronizedHeaderData2;
                    interfaceC4855ms.A47(validFrameCount3);
                } else {
                    interfaceC4855ms.AK3(1);
                }
                searchedBytes = candidateSynchronizedHeaderData2;
            } else {
                i2++;
                if (i2 == 1) {
                    this.A0I.A00(iA0C);
                    i3 = iA0C;
                } else if (i2 == 4) {
                    break;
                }
                int validFrameCount4 = candidateSynchronizedHeaderData - 4;
                interfaceC4855ms.A47(validFrameCount4);
            }
        }
        if (z) {
            interfaceC4855ms.AK3(iA8i + searchedBytes);
        } else {
            interfaceC4855ms.AIl();
        }
        this.A01 = i3;
        if (A0L[5].charAt(24) == 105) {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[7] = "Yv6sT";
        strArr[4] = "";
        return true;
    }

    public static /* synthetic */ InterfaceC2923H9[] A0G() {
        return new InterfaceC2923H9[]{new C4829mG()};
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AAC(InterfaceC2924HA interfaceC2924HA) {
        this.A07 = interfaceC2924HA;
        this.A09 = this.A07.AKS(0, 1);
        this.A08 = this.A09;
        this.A07.A6O();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final int AHL(InterfaceC4855ms interfaceC4855ms, C2945HV c2945hv) throws IOException {
        A0A();
        int iA01 = A01(interfaceC4855ms);
        if (iA01 == -1 && (this.A0A instanceof C24148b)) {
            long jA03 = A03(this.A04);
            long durationUs = this.A0A.A7t();
            if (durationUs != jA03) {
                ((C24148b) this.A0A).A00(jA03);
                this.A07.AJ7(this.A0A);
            }
        }
        return iA01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AHb() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AJ6(long j2, long j3) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A04 = 0L;
        this.A00 = 0;
        this.A05 = j3;
        if ((this.A0A instanceof C24148b) && !((C24148b) this.A0A).A02(j3)) {
            this.A0C = true;
            this.A08 = this.A0J;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final boolean AK5(InterfaceC4855ms interfaceC4855ms) throws IOException {
        return A0F(interfaceC4855ms, true);
    }
}
