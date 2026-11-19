package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.flac.PictureFrame;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.HH */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
public abstract class AbstractC2931HH {
    public static byte[] A00;
    public static String[] A01 = {"jaTfwC0cI533jMSLFdbnMioREeamNCq8", "oxYS1uYBjADPdRUL4vsR12VppXrr4BxP", "o9bG5hJtiKIeIPN2CaXw8mH6vllsT8Pg", "8s8MZLb5TSIkvuwEDH", "W6kvFYauQlSyWCDb8CQhWvVbWb1Alqwq", "aw37R0CiGakhFrBRrvipxmkRXRxeCTzI", "Y2zfIeYjiYIsjSkQMxD0jwTDeetOAull", "DaiobFePrAznnRWN86LDTmrCW9O2HPvR"};

    public static String A06(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 112);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{5, 34, 42, 47, 38, 39, 99, 55, 44, 99, 49, 38, 34, 39, 99, 5, 15, 2, 0, 99, 48, 55, 49, 38, 34, 46, 99, 46, 34, 49, 40, 38, 49, 109, 125, 82, 73, 72, 79, 27, 93, 73, 90, 86, 94, 27, 95, 84, 94, 72, 27, 85, 84, 79, 27, 72, 79, 90, 73, 79, 27, 76, 82, 79, 83, 27, 72, 66, 85, 88, 27, 88, 84, 95, 94, 21};
    }

    static {
        A08();
    }

    public static int A00(InterfaceC4855ms interfaceC4855ms) throws IOException {
        interfaceC4855ms.AIl();
        C21864v c21864v = new C21864v(2);
        interfaceC4855ms.AGt(c21864v.A0l(), 0, 2);
        int syncCode = c21864v.A0M();
        int frameStartMarker = syncCode >> 2;
        if (frameStartMarker == 16382) {
            interfaceC4855ms.AIl();
            return syncCode;
        }
        interfaceC4855ms.AIl();
        throw C20883K.A01(A06(34, 42, 75), null);
    }

    public static Metadata A01(InterfaceC4855ms interfaceC4855ms, boolean z) throws IOException {
        InterfaceC2990IE id3FramePredicate;
        if (z) {
            id3FramePredicate = null;
        } else {
            id3FramePredicate = C24589U.A03;
        }
        Metadata metadataA00 = new C2936HM().A00(interfaceC4855ms, id3FramePredicate);
        if (metadataA00 == null || metadataA00.A02() == 0) {
            return null;
        }
        return metadataA00;
    }

    public static Metadata A02(InterfaceC4855ms interfaceC4855ms, boolean z) throws IOException {
        interfaceC4855ms.AIl();
        long jA8i = interfaceC4855ms.A8i();
        Metadata metadataA01 = A01(interfaceC4855ms, z);
        interfaceC4855ms.AK3((int) (interfaceC4855ms.A8i() - jA8i));
        return metadataA01;
    }

    public static C2932HI A03(C21864v c21864v) {
        c21864v.A0g(1);
        int iA0K = c21864v.A0K();
        int length = c21864v.A09();
        long j2 = ((long) length) + ((long) iA0K);
        int i2 = iA0K / 18;
        long[] jArrCopyOf = new long[i2];
        long[] jArrCopyOf2 = new long[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            long jA0P = c21864v.A0P();
            if (jA0P == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i3);
                break;
            }
            jArrCopyOf[i3] = jA0P;
            jArrCopyOf2[i3] = c21864v.A0P();
            c21864v.A0g(2);
        }
        int length2 = c21864v.A09();
        c21864v.A0g((int) (j2 - ((long) length2)));
        return new C2932HI(jArrCopyOf, jArrCopyOf2);
    }

    public static C2932HI A04(InterfaceC4855ms interfaceC4855ms, int i2) throws IOException {
        C21864v c21864v = new C21864v(i2);
        interfaceC4855ms.readFully(c21864v.A0l(), 0, i2);
        return A03(c21864v);
    }

    public static C2933HJ A05(InterfaceC4855ms interfaceC4855ms) throws IOException {
        byte[] bArr = new byte[38];
        interfaceC4855ms.readFully(bArr, 0, 38);
        return new C2933HJ(bArr, 4);
    }

    public static List<String> A07(InterfaceC4855ms interfaceC4855ms, int i2) throws IOException {
        C21864v c21864v = new C21864v(i2);
        interfaceC4855ms.readFully(c21864v.A0l(), 0, i2);
        c21864v.A0g(4);
        return Arrays.asList(AbstractC2960Hk.A05(c21864v, false, false).A02);
    }

    public static void A09(InterfaceC4855ms interfaceC4855ms) throws IOException {
        C21864v c21864v = new C21864v(4);
        interfaceC4855ms.readFully(c21864v.A0l(), 0, 4);
        if (c21864v.A0Q() == 1716281667) {
        } else {
            throw C20883K.A01(A06(0, 34, 51), null);
        }
    }

    public static boolean A0A(InterfaceC4855ms interfaceC4855ms) throws IOException {
        C21864v c21864v = new C21864v(4);
        interfaceC4855ms.AGt(c21864v.A0l(), 0, 4);
        return c21864v.A0Q() == 1716281667;
    }

    public static boolean A0B(InterfaceC4855ms interfaceC4855ms, C2930HG c2930hg) throws IOException {
        interfaceC4855ms.AIl();
        C21854u c21854u = new C21854u(new byte[4]);
        interfaceC4855ms.AGt(c21854u.A00, 0, 4);
        boolean zA0H = c21854u.A0H();
        int iA04 = c21854u.A04(7);
        int iA05 = c21854u.A04(24) + 4;
        if (iA04 == 0) {
            C2933HJ c2933hjA05 = A05(interfaceC4855ms);
            String[] strArr = A01;
            if (strArr[1].charAt(0) != strArr[2].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "oF2KQg39ZEK5V6OHUZM6u4PkuH0D3J87";
            strArr2[2] = "opWNo3Pnwj2PHBTvqD8r5OWylRW508kK";
            c2930hg.A00 = c2933hjA05;
        } else {
            C2933HJ c2933hj = c2930hg.A00;
            if (c2933hj != null) {
                if (iA04 != 3) {
                    if (iA04 == 4) {
                        c2930hg.A00 = c2933hj.A0B(A07(interfaceC4855ms, iA05));
                    } else if (iA04 == 6) {
                        C21864v c21864v = new C21864v(iA05);
                        interfaceC4855ms.readFully(c21864v.A0l(), 0, iA05);
                        c21864v.A0g(4);
                        PictureFrame pictureFrame = PictureFrame.A00(c21864v);
                        c2930hg.A00 = c2933hj.A0A(MetaExoPlayerCustomizedCollections.A03(pictureFrame));
                    } else {
                        interfaceC4855ms.AK3(iA05);
                    }
                } else {
                    c2930hg.A00 = c2933hj.A09(A04(interfaceC4855ms, iA05));
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
        return zA0H;
    }
}
