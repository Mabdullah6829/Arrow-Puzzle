package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.google.android.material.internal.ViewUtils;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.H7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2921H7 {
    public static byte[] A00;
    public static String[] A01 = {"Y8HEI18e1GadHrln0qmDFCEaxi", "oL2ricEuOMEwxHFhMskly09xAYMP2tCR", "T", "KMY19rMWfOVULyqsMixIRosvw7BV", "hLcN9Ked", "HwmbqduaXfn6sstptA", "kxZRIOPiX6BuamdrhGUbsB3Guhn0rTOf", "HgYihtPWg4cBhJSwUBMvBFzsg3tZPPZN"};
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;

    public static String A05(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 125);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{7, 19, 2, 15, 9, 73, 16, 8, 2, 72, 2, 18, 21};
    }

    static {
        A06();
        A02 = new int[]{1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
        A03 = new int[]{-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
        A04 = new int[]{64, 112, 128, 192, 224, 256, 384, 448, 512, 640, ViewUtils.EDGE_TO_EDGE_FLAGS, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    }

    public static int A00(ByteBuffer byteBuffer) {
        int nblks;
        int iPosition = byteBuffer.position();
        int position = byteBuffer.get(iPosition);
        switch (position) {
            case -2:
                int position2 = iPosition + 5;
                int i2 = (byteBuffer.get(position2) & 1) << 6;
                int position3 = iPosition + 4;
                nblks = i2 | ((byteBuffer.get(position3) & 252) >> 2);
                break;
            case -1:
                int position4 = iPosition + 4;
                int i3 = (byteBuffer.get(position4) & 7) << 4;
                int position5 = iPosition + 7;
                nblks = i3 | ((byteBuffer.get(position5) & 60) >> 2);
                break;
            case 31:
                int position6 = iPosition + 5;
                int i4 = (byteBuffer.get(position6) & 7) << 4;
                int position7 = iPosition + 6;
                nblks = i4 | ((byteBuffer.get(position7) & 60) >> 2);
                break;
            default:
                int position8 = iPosition + 4;
                int i5 = (byteBuffer.get(position8) & 1) << 6;
                int position9 = iPosition + 5;
                nblks = i5 | ((byteBuffer.get(position9) & 252) >> 2);
                break;
        }
        int position10 = nblks + 1;
        return position10 * 32;
    }

    public static int A01(byte[] bArr) {
        int i2;
        boolean z = false;
        switch (bArr[0]) {
            case -2:
                byte b = bArr[4];
                String[] strArr = A01;
                if (strArr[5].length() == strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[5] = "4XRrhZnjb0Sc0OiDCf";
                strArr2[0] = "emycfV24cXaR3M70231yELMb9K";
                i2 = (((b & 3) << 12) | ((bArr[7] & 255) << 4) | ((bArr[6] & 240) >> 4)) + 1;
                break;
                break;
            case -1:
                i2 = (((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4) | ((bArr[9] & 60) >> 2)) + 1;
                z = true;
                break;
            case 31:
                i2 = (((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4) | ((bArr[8] & 60) >> 2)) + 1;
                z = true;
                break;
            default:
                i2 = (((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4) | ((bArr[7] & 240) >> 4)) + 1;
                break;
        }
        return z ? (i2 * 16) / 14 : i2;
    }

    public static int A02(byte[] bArr) {
        int i2;
        switch (bArr[0]) {
            case -2:
                int nblks = bArr[5];
                i2 = ((nblks & 1) << 6) | ((bArr[4] & 252) >> 2);
                break;
            case -1:
                i2 = ((bArr[4] & 7) << 4) | ((bArr[7] & 60) >> 2);
                break;
            case 31:
                i2 = ((bArr[5] & 7) << 4) | ((bArr[6] & 60) >> 2);
                break;
            default:
                i2 = ((bArr[4] & 1) << 6) | ((bArr[5] & 252) >> 2);
                break;
        }
        int nblks2 = i2 + 1;
        return nblks2 * 32;
    }

    public static C5064qI A03(byte[] bArr, String str, String str2, DrmInitData drmInitData) {
        int i2;
        C21854u c21854uA04 = A04(bArr);
        c21854uA04.A09(60);
        int amode = c21854uA04.A04(6);
        int bitrate = A02[amode];
        int amode2 = c21854uA04.A04(4);
        int rate = A03[amode2];
        int amode3 = c21854uA04.A04(5);
        if (amode3 >= A04.length) {
            i2 = -1;
        } else {
            i2 = (A04[amode3] * 1000) / 2;
        }
        c21854uA04.A09(10);
        int amode4 = c21854uA04.A04(2);
        int amode5 = amode4 > 0 ? 1 : 0;
        return new C20592p().A0y(str).A11(A05(0, 13, 27)).A0a(i2).A0b(bitrate + amode5).A0m(rate).A0u(drmInitData).A10(str2).A14();
    }

    public static C21854u A04(byte[] bArr) {
        if (bArr[0] == 127) {
            return new C21854u(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (A08(bArrCopyOf)) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b = bArrCopyOf[i2];
                bArrCopyOf[i2] = bArrCopyOf[i2 + 1];
                bArrCopyOf[i2 + 1] = b;
            }
        }
        C21854u c21854u = new C21854u(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            C21854u c21854u2 = new C21854u(bArrCopyOf);
            while (c21854u2.A01() >= 16) {
                c21854u2.A09(2);
                int iA04 = c21854u2.A04(14);
                if (A01[4].length() == 13) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[1] = "nbIesC19CiuPXGAO1XmsVCjTSWLNlLKJ";
                strArr[7] = "ltOJbsz7vYOuZPV8QSj4f10zt4SJvXCJ";
                c21854u.A0B(iA04, 14);
            }
        }
        c21854u.A0D(bArrCopyOf);
        return c21854u;
    }

    public static boolean A07(int i2) {
        return i2 == 2147385345 || i2 == -25230976 || i2 == 536864768 || i2 == -14745368;
    }

    public static boolean A08(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }
}
