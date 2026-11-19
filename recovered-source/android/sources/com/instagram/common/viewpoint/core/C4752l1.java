package com.instagram.common.viewpoint.core;

import androidx.constraintlayout.widget.C1137R;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.l1 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4752l1 implements InterfaceC3182LL {
    public static byte[] A0C;
    public static String[] A0D = {"bYPw9lwZ90LIMnDVrWR9nivpaP", "yFs6hGP2BjxCIYW4vwAvQB", "ThDP9clSa9Dn", "ZJ8KrZKjZ6YsWfu6TvhIHbPrHjBQXt73", "tonD2drFJKLGWlZx83XdaJTA2vW", "BxtbVLMcuUKNP9oDIvLT", "q4ZypHVOEkKJ", "0njOXKHdBu5kWS0YMUnz8"};
    public static final int[] A0E;
    public static final int[] A0F;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public final int A04;
    public final int A05;
    public final C5064qI A06;
    public final C21864v A07;
    public final InterfaceC2924HA A08;
    public final InterfaceC2953Hd A09;
    public final C3184LN A0A;
    public final byte[] A0B;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 69);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{-120, 109, -76, -68, -63, -121, 109, -51, 0, -8, -19, -21, -4, -19, -20, -88, -18, -6, -23, -11, -19, -5, -88, -8, -19, -6, -88, -22, -12, -9, -21, -13, -62, -88, -7, 13, -4, 1, 7, -57, 10, -7, 15};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A06(byte[] bArr, int i2, int i3, byte[] bArr2) {
        int i4 = this.A0A.A02;
        int i5 = this.A0A.A05;
        int i6 = (i3 * 4) + (i2 * i4);
        int i7 = (i5 * 4) + i6;
        int i8 = (i4 / i5) - 4;
        int iA07 = ((bArr[i6 + 1] & 255) << 8) | (bArr[i6] & 255);
        int iMin = Math.min(bArr[i6 + 2] & 255, 88);
        int i9 = A0F[iMin];
        int i10 = ((this.A04 * i2 * i5) + i3) * 2;
        bArr2[i10] = (byte) (iA07 & 255);
        bArr2[i10 + 1] = (byte) (iA07 >> 8);
        for (int i11 = 0; i11 < i8 * 2; i11++) {
            int i12 = bArr[((i11 / 8) * i5 * 4) + i7 + ((i11 / 2) % 4)] & 255;
            int i13 = i11 % 2 == 0 ? i12 & 15 : i12 >> 4;
            int i14 = ((((i13 & 7) * 2) + 1) * i9) >> 3;
            if ((i13 & 8) != 0) {
                i14 = -i14;
            }
            iA07 = AbstractC22035C.A07(iA07 + i14, -32768, 32767);
            i10 += i5 * 2;
            bArr2[i10] = (byte) (iA07 & 255);
            bArr2[i10 + 1] = (byte) (iA07 >> 8);
            iMin = AbstractC22035C.A07(iMin + A0E[i13], 0, A0F.length - 1);
            i9 = A0F[iMin];
        }
    }

    static {
        A04();
        A0E = new int[]{-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        A0F = new int[]{7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, C1137R.styleable.ConstraintSet_polarRelativeTo, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    }

    public C4752l1(InterfaceC2924HA interfaceC2924HA, InterfaceC2953Hd interfaceC2953Hd, C3184LN c3184ln) throws C20883K {
        this.A08 = interfaceC2924HA;
        this.A09 = interfaceC2953Hd;
        this.A0A = c3184ln;
        this.A05 = Math.max(1, c3184ln.A04 / 10);
        C21864v scratch = new C21864v(c3184ln.A06);
        scratch.A0G();
        this.A04 = scratch.A0G();
        int i2 = c3184ln.A05;
        int i3 = (((c3184ln.A02 - (i2 * 4)) * 8) / (c3184ln.A01 * i2)) + 1;
        if (this.A04 == i3) {
            int numChannels = AbstractC22035C.A05(this.A05, this.A04);
            this.A0B = new byte[c3184ln.A02 * numChannels];
            int maxBlocksToDecode = A02(this.A04, i2);
            this.A07 = new C21864v(maxBlocksToDecode * numChannels);
            int maxBlocksToDecode2 = c3184ln.A04;
            int constantBitrate = ((maxBlocksToDecode2 * c3184ln.A02) * 8) / this.A04;
            this.A06 = new C20592p().A11(A03(34, 9, 83)).A0a(constantBitrate).A0j(constantBitrate).A0h(A02(this.A05, i2)).A0b(c3184ln.A05).A0m(c3184ln.A04).A0i(2).A14();
            return;
        }
        throw C20883K.A01(A03(7, 27, 67) + i3 + A03(0, 7, 8) + this.A04, null);
    }

    private int A00(int i2) {
        return i2 / (this.A0A.A05 * 2);
    }

    private int A01(int i2) {
        return A02(i2, this.A0A.A05);
    }

    public static int A02(int i2, int i3) {
        return i2 * 2 * i3;
    }

    private void A05(int i2) {
        long jA0U = this.A03 + AbstractC22035C.A0U(this.A02, 1000000L, this.A0A.A04);
        int iA01 = A01(i2);
        this.A09.AIu(jA0U, 1, iA01, this.A01 - iA01, null);
        long timeUs = i2;
        this.A02 += timeUs;
        this.A01 -= iA01;
    }

    private void A07(byte[] bArr, int i2, C21864v c21864v) {
        for (int i3 = 0; i3 < i2; i3++) {
            for (int channelIndex = 0; channelIndex < blockIndex; channelIndex++) {
                A06(bArr, i3, channelIndex, c21864v.A0l());
            }
        }
        int blockIndex = this.A04;
        int iA01 = A01(blockIndex * i2);
        c21864v.A0f(0);
        c21864v.A0e(iA01);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3182LL
    public final void AA8(int i2, long j2) {
        this.A08.AJ7(new C4749ky(this.A0A, this.A04, i2, j2));
        this.A09.A6e(this.A06);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3182LL
    public final void AIk(long j2) {
        this.A00 = 0;
        this.A03 = j2;
        this.A01 = 0;
        this.A02 = 0L;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3182LL
    public final boolean AIt(InterfaceC4855ms interfaceC4855ms, long j2) throws IOException {
        int iA00 = this.A05 - A00(this.A01);
        int targetFramesRemaining = this.A04;
        int blocksToDecode = AbstractC22035C.A05(iA00, targetFramesRemaining);
        int i2 = this.A0A.A02 * blocksToDecode;
        boolean z = j2 == 0;
        while (!z) {
            int targetFramesRemaining2 = this.A00;
            if (targetFramesRemaining2 >= i2) {
                break;
            }
            int targetFramesRemaining3 = this.A00;
            int targetReadBytes = (int) Math.min(i2 - targetFramesRemaining3, j2);
            byte[] bArr = this.A0B;
            int targetFramesRemaining4 = this.A00;
            int blocksToDecode2 = interfaceC4855ms.read(bArr, targetFramesRemaining4, targetReadBytes);
            if (blocksToDecode2 == -1) {
                z = true;
            } else {
                int targetFramesRemaining5 = this.A00;
                this.A00 = targetFramesRemaining5 + blocksToDecode2;
            }
        }
        int targetReadBytes2 = this.A00;
        int targetFramesRemaining6 = this.A0A.A02;
        int targetReadBytes3 = targetReadBytes2 / targetFramesRemaining6;
        if (targetReadBytes3 > 0) {
            A07(this.A0B, targetReadBytes3, this.A07);
            int blocksToDecode3 = this.A00;
            int targetFramesRemaining7 = this.A0A.A02;
            this.A00 = blocksToDecode3 - (targetFramesRemaining7 * targetReadBytes3);
            int blocksToDecode4 = A0D[3].charAt(16);
            if (blocksToDecode4 != 84) {
                throw new RuntimeException();
            }
            A0D[0] = "TvVFAtGQ";
            int targetReadBytes4 = this.A07.A0A();
            this.A09.AIr(this.A07, targetReadBytes4);
            int targetFramesRemaining8 = this.A01;
            this.A01 = targetFramesRemaining8 + targetReadBytes4;
            int targetFramesRemaining9 = this.A01;
            int blocksToDecode5 = A00(targetFramesRemaining9);
            int targetFramesRemaining10 = this.A05;
            if (blocksToDecode5 >= targetFramesRemaining10) {
                int targetFramesRemaining11 = this.A05;
                A05(targetFramesRemaining11);
            }
        }
        if (z) {
            int targetFramesRemaining12 = this.A01;
            int targetFramesRemaining13 = A00(targetFramesRemaining12);
            if (targetFramesRemaining13 > 0) {
                A05(targetFramesRemaining13);
            }
        }
        return z;
    }
}
