package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lv */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4808lv extends AbstractC3074Jb {
    public static byte[] A01;
    public static String[] A02 = {"llfHvvp5w7AsdcfCf5e", "amqCmPcUyTwYr5NdTloeCtiw", "0NAIhycYLxj75", "dj34azdkZPKXRKaV6TbpL4Sg", "ijcAEj6S85lKiCQyoflHjypUMqTEGqRn", "eY0hdp8", "jqGnWXF3Z8AkxtecEpgwxV1mUEmkJWKs", "4zwbE0EN4gXO5y3Vp0p"};
    public static final byte[] A03;
    public static final byte[] A04;
    public boolean A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 125);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-1, 19, 2, 7, 13, -51, 13, 14, 19, 17};
    }

    static {
        A01();
        A04 = new byte[]{79, 112, 117, 115, 72, 101, 97, 100};
        A03 = new byte[]{79, 112, 117, 115, 84, 97, 103, 115};
    }

    public static boolean A02(C21864v c21864v) {
        return A03(c21864v, A04);
    }

    public static boolean A03(C21864v c21864v, byte[] bArr) {
        if (c21864v.A07() < bArr.length) {
            return false;
        }
        int iA09 = c21864v.A09();
        int startPosition = bArr.length;
        byte[] header = new byte[startPosition];
        int startPosition2 = bArr.length;
        c21864v.A0k(header, 0, startPosition2);
        c21864v.A0f(iA09);
        return Arrays.equals(header, bArr);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3074Jb
    public final long A09(C21864v c21864v) {
        return A06(AbstractC2943HT.A05(c21864v.A0l()));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3074Jb
    public final void A0B(boolean z) {
        super.A0B(z);
        if (z) {
            this.A00 = false;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3074Jb
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    @MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
    public final boolean A0C(C21864v c21864v, long j2, C3073Ja c3073Ja) throws C20883K {
        if (A03(c21864v, A04)) {
            byte[] headerBytes = Arrays.copyOf(c21864v.A0l(), c21864v.A0A());
            int iA01 = AbstractC2943HT.A01(headerBytes);
            List<byte[]> listA06 = AbstractC2943HT.A06(headerBytes);
            if (c3073Ja.A00 != null) {
                return true;
            }
            c3073Ja.A00 = new C20592p().A11(A00(0, 10, 33)).A0b(iA01).A0m(48000).A12(listA06).A14();
            return true;
        }
        if (A03(c21864v, A03)) {
            AbstractC21273y.A02(c3073Ja.A00);
            if (this.A00) {
                return true;
            }
            this.A00 = true;
            c21864v.A0g(A03.length);
            C2957Hh commentHeader = AbstractC2960Hk.A05(c21864v, false, false);
            Metadata metadataA02 = AbstractC2960Hk.A02(MetaExoPlayerCustomizedCollections.A02(commentHeader.A02));
            if (metadataA02 == null) {
                return true;
            }
            C20592p c20592pA07 = c3073Ja.A00.A07();
            String[] strArr = A02;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "80vtnZ0VGuLh5BtNytGnkcmL";
            strArr2[1] = "kfnMkjsOg47yHVBMKsSTRfGb";
            c3073Ja.A00 = c20592pA07.A0v(metadataA02.A04(c3073Ja.A00.A0P)).A14();
            return true;
        }
        AbstractC21273y.A02(c3073Ja.A00);
        return false;
    }
}
