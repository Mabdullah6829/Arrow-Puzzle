package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.util.Pair;
import androidx.constraintlayout.widget.C1137R;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kz */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4750kz implements InterfaceC2923H9 {
    public static byte[] A07;
    public static String[] A08 = {"DwCwNe", "sWjhkz5Jk0aFlWxF8RAhYepliqmDVBH5", "fJB4aZ6fjAPSNUZta8hrgw0qJ7r8hoM5", "QGFmFhkJVom57VKObFa8uqUV9", "rnOb7nHa90E2wPIfOCxC", "at6D0iA1D4bxl", "SWjjSn0lfORi", "B3tBBFyQt38AAQleoY5s"};
    public static final InterfaceC2927HD A09;
    public InterfaceC2924HA A04;
    public InterfaceC2953Hd A05;
    public InterfaceC3182LL A06;
    public int A01 = 0;
    public long A03 = -1;
    public int A00 = -1;
    public long A02 = -1;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 34);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{87, 91, 2, 39, 50, 39, 102, 35, 62, 37, 35, 35, 34, 53, 102, 47, 40, 54, 51, 50, 102, 42, 35, 40, 33, 50, 46, 124, 102, 39, 28, 1, 7, 2, 2, 29, 0, 6, 23, 22, 82, 37, 51, 36, 82, 20, 29, 0, 31, 19, 6, 82, 6, 11, 2, 23, 72, 82, 127, 68, 89, 95, 90, 90, 69, 88, 94, 79, 78, 10, 69, 88, 10, 95, 68, 88, 79, 73, 69, 77, 68, 67, 80, 79, 78, 10, 93, 75, 92, 10, 76, 67, 70, 79, 10, 94, 83, 90, 79, 4, 103, 81, 70, 117, 72, 68, 66, 81, 83, 68, 95, 66, 17, 5, 20, 25, 31, 95, 23, 71, 65, 65, 93, 17, 28, 17, 7, 127, 107, 122, 119, 113, 49, 121, 41, 47, 47, 51, 115, 114, 127, 105, 55, 35, 50, 63, 57, 121, 36, 55, 33};
    }

    static {
        A03();
        A09 = new InterfaceC2927HD() { // from class: com.facebook.ads.redexgen.X.l2
            @Override // com.instagram.common.viewpoint.core.InterfaceC2927HD
            public final InterfaceC2923H9[] A5N() {
                return C4750kz.A08();
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC2927HD
            public final /* synthetic */ InterfaceC2923H9[] A5O(Uri uri, Map map) {
                return AbstractC2926HC.A01(this, uri, map);
            }
        };
    }

    private int A00(InterfaceC4855ms interfaceC4855ms) throws IOException {
        AbstractC21273y.A08(this.A02 != -1);
        return ((InterfaceC3182LL) AbstractC21273y.A01(this.A06)).AIt(interfaceC4855ms, this.A02 - interfaceC4855ms.A8n()) ? -1 : 0;
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void A02() {
        AbstractC21273y.A02(this.A05);
    }

    private void A04(InterfaceC4855ms interfaceC4855ms) throws IOException {
        AbstractC21273y.A08(interfaceC4855ms.A8n() == 0);
        int i2 = this.A00;
        if (A08[5].length() != 13) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[7] = "oJOrgM3DzNUfWcxP3ghI";
        strArr[4] = "cZhhMb4kvP2y4vGeSU9A";
        if (i2 != -1) {
            interfaceC4855ms.AK3(this.A00);
            this.A01 = 4;
        } else {
            if (AbstractC3186LP.A06(interfaceC4855ms)) {
                interfaceC4855ms.AK3((int) (interfaceC4855ms.A8i() - interfaceC4855ms.A8n()));
                this.A01 = 1;
                return;
            }
            throw C20883K.A01(A01(58, 42, 8), null);
        }
    }

    @RequiresNonNull({"extractorOutput", "trackOutput"})
    private void A05(InterfaceC4855ms interfaceC4855ms) throws IOException {
        C3184LN wavFormat = AbstractC3186LP.A02(interfaceC4855ms);
        if (wavFormat.A03 == 17) {
            this.A06 = new C4752l1(this.A04, this.A05, wavFormat);
        } else if (wavFormat.A03 == 6) {
            this.A06 = new C4751l0(this.A04, this.A05, wavFormat, A01(112, 15, 82), -1);
        } else if (wavFormat.A03 == 7) {
            this.A06 = new C4751l0(this.A04, this.A05, wavFormat, A01(127, 15, 60), -1);
        } else {
            int iA00 = AbstractC2961Hl.A00(wavFormat.A03, wavFormat.A01);
            if (iA00 != 0) {
                this.A06 = new C4751l0(this.A04, this.A05, wavFormat, A01(142, 9, C1137R.styleable.ConstraintSet_pathMotionArc), iA00);
            } else {
                throw C20883K.A00(A01(29, 29, 80) + wavFormat.A03);
            }
        }
        this.A01 = 3;
    }

    private void A06(InterfaceC4855ms interfaceC4855ms) throws IOException {
        this.A03 = AbstractC3186LP.A00(interfaceC4855ms);
        this.A01 = 2;
    }

    private void A07(InterfaceC4855ms interfaceC4855ms) throws IOException {
        Pair<Long, Long> pairA01 = AbstractC3186LP.A01(interfaceC4855ms);
        this.A00 = ((Long) pairA01.first).intValue();
        long jLongValue = ((Long) pairA01.second).longValue();
        if (this.A03 != -1) {
            String[] strArr = A08;
            if (strArr[7].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "zD8CpsX01ISLh3RSws8RgUnhS";
            strArr2[6] = "h3zG6U6JIHw0";
            if (jLongValue == 4294967295L) {
                jLongValue = this.A03;
            }
        }
        this.A02 = ((long) this.A00) + jLongValue;
        long jA8O = interfaceC4855ms.A8O();
        if (jA8O != -1 && this.A02 > jA8O) {
            AbstractC21714g.A07(A01(100, 12, 18), A01(2, 27, 100) + this.A02 + A01(0, 2, 89) + jA8O);
            this.A02 = jA8O;
        }
        ((InterfaceC3182LL) AbstractC21273y.A01(this.A06)).AA8(this.A00, this.A02);
        this.A01 = 4;
    }

    public static /* synthetic */ InterfaceC2923H9[] A08() {
        return new InterfaceC2923H9[]{new C4750kz()};
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AAC(InterfaceC2924HA interfaceC2924HA) {
        this.A04 = interfaceC2924HA;
        this.A05 = interfaceC2924HA.AKS(0, 1);
        interfaceC2924HA.A6O();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final int AHL(InterfaceC4855ms interfaceC4855ms, C2945HV c2945hv) throws IOException {
        A02();
        switch (this.A01) {
            case 0:
                A04(interfaceC4855ms);
                return 0;
            case 1:
                A06(interfaceC4855ms);
                if (A08[5].length() != 13) {
                    throw new RuntimeException();
                }
                String[] strArr = A08;
                strArr[3] = "VLLh2GyvdfrrOjqYmUQdrqO3c";
                strArr[6] = "Miu4m4vLnYY2";
                return 0;
            case 2:
                A05(interfaceC4855ms);
                return 0;
            case 3:
                A07(interfaceC4855ms);
                return 0;
            case 4:
                return A00(interfaceC4855ms);
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AHb() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AJ6(long j2, long j3) {
        this.A01 = j2 == 0 ? 0 : 4;
        if (this.A06 != null) {
            this.A06.AIk(j3);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final boolean AK5(InterfaceC4855ms interfaceC4855ms) throws IOException {
        return AbstractC3186LP.A06(interfaceC4855ms);
    }
}
