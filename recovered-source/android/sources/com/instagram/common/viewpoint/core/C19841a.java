package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1a */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C19841a extends AbstractC24679j {
    public static byte[] A0H;
    public static String[] A0I = {"m5Q3aiQKICJZrVflAtkG72aHaW7D7vzV", "Te6TlfxhDkM1nSnzhWnFswazR8GhYsIL", "RAA", "kEgqAeLW1EWE377lDOv4M7tHjIvdZKXO", "06ys5nuQ5LNcvNVR71UhF3Tfl10HYLje", "yFo", "kDpjkJehLDjfyQcmHJ0GXPIrbeMaoLDA", "wnjbAtiJPFcw6YA"};
    public AbstractC24699l A00;
    public float A01;
    public int A02;
    public int A03;
    public long A04;
    public final float A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final AbstractC2570BP<C2759EU> A0B;
    public final float A0C;
    public final int A0D;
    public final long A0E;
    public final InterfaceC213445 A0F;
    public final InterfaceC2797F6 A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C19841a(@MetaExoPlayerCustomization("Used for OculusAdaptiveTrackSelection") C5027pg c5027pg, @MetaExoPlayerCustomization("Used to retain old value for Oculus") int[] iArr, int i2, InterfaceC2797F6 interfaceC2797F6, int i3, long j2, long j3, long j4, int i4, int i5, float f2, float f3, long j5, List<C2759EU> list, InterfaceC213445 interfaceC213445) {
        super(c5027pg, iArr, i2);
        if (j4 < j2) {
            AbstractC21714g.A07(A03(0, 22, 43), A03(22, 90, 50));
            j4 = j2;
        }
        this.A0G = interfaceC2797F6;
        this.A0D = i3;
        this.A08 = j2 * 1000;
        this.A0E = j3 * 1000;
        this.A09 = 1000 * j4;
        this.A07 = i4;
        this.A06 = i5;
        this.A0C = f2;
        this.A05 = f3;
        this.A0B = AbstractC2570BP.A05(list);
        this.A0A = j5;
        this.A0F = interfaceC213445;
        this.A01 = 1.0f;
        this.A02 = 0;
        this.A04 = -9223372036854775807L;
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 89);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0H = new byte[]{-59, -24, -27, -12, -8, -19, -6, -23, -40, -10, -27, -25, -17, -41, -23, -16, -23, -25, -8, -19, -13, -14, -52, -17, -11, 0, -2, -1, -12, -7, -14, -85, -8, -12, -7, -49, 0, -3, -20, -1, -12, -6, -7, -33, -6, -35, -16, -1, -20, -12, -7, -52, -15, -1, -16, -3, -49, -12, -2, -18, -20, -3, -17, -40, -2, -85, -1, -6, -85, -19, -16, -85, -20, -1, -85, -9, -16, -20, -2, -1, -85, -8, -12, -7, -49, 0, -3, -20, -1, -12, -6, -7, -47, -6, -3, -36, 0, -20, -9, -12, -1, 4, -44, -7, -18, -3, -16, -20, -2, -16, -40, -2};
    }

    static {
        A04();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0110  */
    /* JADX WARN: Code duplicated, block: B:48:0x011a  */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint>> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<java.lang.Integer> */
    public static AbstractC2570BP<AbstractC2570BP<C2759EU>> A00(C2776El[] c2776ElArr) {
        C20302K c20302k;
        AbstractC2570BP abstractC2570BPA05;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < c2776ElArr.length; i2++) {
            if (c2776ElArr[i2] != null && c2776ElArr[i2].A02.length > 1) {
                C20302K c20302kA01 = AbstractC2570BP.A01();
                c20302kA01.A04(new C2759EU(0L, 0L));
                arrayList.add(c20302kA01);
            } else {
                arrayList.add(null);
            }
        }
        long[][] jArrA06 = A06(c2776ElArr);
        int length = jArrA06.length;
        if (A0I[0].charAt(10) != 'x') {
            A0I[0] = "UXetESR07W40Ugl2KcKxfZnSKo41RBjF";
            int[] iArr = new int[length];
            long[] jArr = new long[jArrA06.length];
            for (int i3 = 0; i3 < jArrA06.length; i3++) {
                int length2 = jArrA06[i3].length;
                if (A0I[0].charAt(10) == 'x') {
                    throw new RuntimeException();
                }
                A0I[7] = "x";
                jArr[i3] = length2 == 0 ? 0L : jArrA06[i3][0];
                String[] strArr = A0I;
                if (strArr[1].charAt(10) != strArr[4].charAt(10)) {
                    String[] strArr2 = A0I;
                    strArr2[1] = "cSuX5sbs1mm7BtC5NofnfdI255eKyli3";
                    strArr2[4] = "Z411JjDvpqHs7gscP9Mv86ZFtFCMjIgX";
                }
            }
            A05(arrayList, jArr);
            AbstractC2570BP<Integer> abstractC2570BPA02 = A02(jArrA06);
            for (int i4 = 0; i4 < abstractC2570BPA02.size(); i4++) {
                int iIntValue = abstractC2570BPA02.get(i4).intValue();
                int i5 = iArr[iIntValue] + 1;
                iArr[iIntValue] = i5;
                jArr[iIntValue] = jArrA06[iIntValue][i5];
                A05(arrayList, jArr);
            }
            for (int i6 = 0; i6 < c2776ElArr.length; i6++) {
                if (arrayList.get(i6) != null) {
                    jArr[i6] = jArr[i6] * 2;
                }
            }
            A05(arrayList, jArr);
            C20302K c20302kA02 = AbstractC2570BP.A01();
            int i7 = 0;
            while (true) {
                int size = arrayList.size();
                String[] strArr3 = A0I;
                if (strArr3[5].length() != strArr3[2].length()) {
                    String[] strArr4 = A0I;
                    strArr4[5] = "B5d";
                    strArr4[2] = "E7u";
                    if (i7 >= size) {
                        break;
                    }
                    c20302k = (C20302K) arrayList.get(i7);
                    if (c20302k == null) {
                        abstractC2570BPA05 = AbstractC2570BP.A03();
                    } else {
                        abstractC2570BPA05 = c20302k.A05();
                    }
                    c20302kA02.A04(abstractC2570BPA05);
                    i7++;
                } else {
                    String[] strArr5 = A0I;
                    strArr5[6] = "P6lwie0zupyVMIziqYi4GtWsnZGWabHp";
                    strArr5[3] = "HBKI3D47JNzwp3E4fcvtN9y7FoJFPrZj";
                    if (i7 >= size) {
                        break;
                    }
                    c20302k = (C20302K) arrayList.get(i7);
                    if (c20302k == null) {
                        abstractC2570BPA05 = AbstractC2570BP.A03();
                    } else {
                        abstractC2570BPA05 = c20302k.A05();
                    }
                    c20302kA02.A04(abstractC2570BPA05);
                    i7++;
                }
            }
            return c20302kA02.A05();
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.q3 != com.google.common.collect.Multimap<java.lang.Double, java.lang.Integer> */
    public static AbstractC2570BP<Integer> A02(long[][] jArr) {
        InterfaceC5049q3 interfaceC5049q3A00 = AbstractC5051q5.A02().A03().A00();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            if (jArr[i2].length > 1) {
                double[] logBitrates = new double[jArr[i2].length];
                int i3 = 0;
                while (true) {
                    double dLog = 0.0d;
                    if (i3 >= jArr[i2].length) {
                        break;
                    }
                    if (jArr[i2][i3] != -1) {
                        dLog = Math.log(jArr[i2][i3]);
                    }
                    logBitrates[i3] = dLog;
                    i3++;
                }
                double d = logBitrates[logBitrates.length - 1] - logBitrates[0];
                int i4 = 0;
                for (int i5 = 1; i4 < logBitrates.length - i5; i5 = 1) {
                    interfaceC5049q3A00.AHE(Double.valueOf(d == 0.0d ? 1.0d : (((logBitrates[i4] + logBitrates[i4 + 1]) * 0.5d) - logBitrates[0]) / d), Integer.valueOf(i2));
                    i4++;
                }
            }
        }
        return AbstractC2570BP.A05(interfaceC5049q3A00.values());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    public static void A05(List<C20302K<C2759EU>> list, long[] jArr) {
        long j2 = 0;
        for (long j3 : jArr) {
            String[] strArr = A0I;
            if (strArr[5].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A0I[0] = "hzQzkxJwAHZ0fRiIn7Pvrd3jIUiof14p";
            j2 += j3;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            C20302K<C2759EU> c20302k = list.get(i2);
            if (A0I[0].charAt(10) == 'x') {
                throw new RuntimeException();
            }
            A0I[0] = "0V4VZlbFayh1Opq7Ah9Nva0ccysrREXP";
            if (c20302k != null) {
                c20302k.A04(new C2759EU(j2, jArr[i2]));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006e A[PHI: r5
  0x006e: PHI (r5v2 long[]) = (r5v0 long[]), (r5v3 long[]) binds: [B:21:0x007c, B:17:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    public static long[][] A06(C2776El[] c2776ElArr) {
        long j2;
        long[] jArr;
        long[][] jArr2 = new long[c2776ElArr.length][];
        for (int i2 = 0; i2 < c2776ElArr.length; i2++) {
            C2776El c2776El = c2776ElArr[i2];
            if (c2776El == null) {
                jArr2[i2] = new long[0];
            } else {
                long[] jArr3 = new long[c2776El.A02.length];
                String[] strArr = A0I;
                String str = strArr[6];
                String str2 = strArr[3];
                int i3 = str.charAt(18);
                if (i3 == str2.charAt(18)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[5] = "e4C";
                strArr2[2] = "lZL";
                jArr2[i2] = jArr3;
                for (int i4 = 0; i4 < c2776El.A02.length; i4++) {
                    int j3 = c2776El.A01.A08(c2776El.A02[i4]).A05;
                    int i5 = A0I[7].length();
                    if (i5 != 11) {
                        String[] strArr3 = A0I;
                        strArr3[5] = "HL2";
                        strArr3[2] = "liv";
                        j2 = j3;
                        jArr = jArr2[i2];
                        if (j2 == -1) {
                            j2 = 0;
                        }
                    } else {
                        j2 = j3;
                        jArr = jArr2[i2];
                        if (j2 == -1) {
                            j2 = 0;
                        }
                    }
                    jArr[i4] = j2;
                }
                Arrays.sort(jArr2[i2]);
            }
        }
        return jArr2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC24679j, com.instagram.common.viewpoint.core.InterfaceC4876nE
    public final void A5x() {
        this.A00 = null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC24679j, com.instagram.common.viewpoint.core.InterfaceC4876nE
    public final void A6K() {
        this.A04 = -9223372036854775807L;
        this.A00 = null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4876nE
    public final int A93() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC24679j, com.instagram.common.viewpoint.core.InterfaceC4876nE
    public final void AFJ(float f2) {
        this.A01 = f2;
    }
}
