package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import com.google.android.material.internal.ViewUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafz {

    /* JADX INFO: renamed from: a */
    public static final int[] f5231a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b */
    public static final int[] f5232b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c */
    public static final int[] f5233c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, ViewUtils.EDGE_TO_EDGE_FLAGS, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: d */
    public static final int[] f5234d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: e */
    public static final int[] f5235e = {5, 8, 10, 12};

    /* JADX INFO: renamed from: f */
    public static final int[] f5236f = {6, 9, 12, 15};

    /* JADX INFO: renamed from: g */
    public static final int[] f5237g = {2, 4, 6, 8};

    /* JADX INFO: renamed from: h */
    public static final int[] f5238h = {9, 11, 13, 16};

    /* JADX INFO: renamed from: i */
    public static final int[] f5239i = {5, 8, 10, 12};

    /* JADX INFO: renamed from: a */
    public static int m4099a(int i2) {
        if (i2 == 2147385345 || i2 == -25230976 || i2 == 536864768 || i2 == -14745368) {
            return 1;
        }
        if (i2 == 1683496997 || i2 == 622876772) {
            return 2;
        }
        if (i2 == 1078008818 || i2 == -233094848) {
            return 3;
        }
        return (i2 == 1908687592 || i2 == -398277519) ? 4 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005e  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static int m4100b(byte[] bArr) {
        int i2;
        int i3;
        byte b;
        int i4;
        int i5;
        int i6;
        byte b2;
        boolean z = false;
        byte b3 = bArr[0];
        if (b3 != -2) {
            if (b3 == -1) {
                i5 = (bArr[7] & 3) << 12;
                i6 = (bArr[6] & 255) << 4;
                b2 = bArr[9];
            } else if (b3 != 31) {
                i2 = (bArr[5] & 3) << 12;
                i3 = (bArr[6] & 255) << 4;
                b = bArr[7];
            } else {
                i5 = (bArr[6] & 3) << 12;
                i6 = (bArr[7] & 255) << 4;
                b2 = bArr[8];
            }
            i4 = (((b2 & 60) >> 2) | i5 | i6) + 1;
            z = true;
            if (z) {
                return (i4 * 16) / 14;
            }
            return i4;
        }
        i2 = (bArr[4] & 3) << 12;
        i3 = (bArr[7] & 255) << 4;
        b = bArr[6];
        i4 = (((b & 240) >> 4) | i2 | i3) + 1;
        if (z) {
            return (i4 * 16) / 14;
        }
        return i4;
    }

    /* JADX INFO: renamed from: c */
    public static int m4101c(zzet zzetVar, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && zzetVar.m6344g(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return zzetVar.m6345h(iArr[i2]) + i4;
    }

    /* JADX INFO: renamed from: d */
    public static zzet m4102d(byte[] bArr) {
        byte b = bArr[0];
        if (b == 127 || b == 100 || b == 64 || b == 113) {
            return new zzet(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b2 = bArrCopyOf[0];
        if (b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b3 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b3;
            }
        }
        int length = bArrCopyOf.length;
        zzet zzetVar = new zzet(bArrCopyOf, length);
        if (bArrCopyOf[0] == 31) {
            zzet zzetVar2 = new zzet(bArrCopyOf, length);
            while (zzetVar2.m6339b() >= 16) {
                zzetVar2.m6343f(2);
                int iM6345h = zzetVar2.m6345h(14);
                int iMin = Math.min(8 - zzetVar.f14825c, 14);
                int i4 = zzetVar.f14825c;
                int i5 = (8 - i4) - iMin;
                int i6 = MotionEventCompat.ACTION_POINTER_INDEX_MASK >> i4;
                byte[] bArr2 = zzetVar.f14823a;
                int i7 = zzetVar.f14824b;
                byte b4 = (byte) ((i6 | ((1 << i5) - 1)) & bArr2[i7]);
                bArr2[i7] = b4;
                int i8 = 14 - iMin;
                int i9 = iM6345h & 16383;
                bArr2[i7] = (byte) (b4 | ((i9 >>> i8) << i5));
                int i10 = i7 + 1;
                while (i8 > 8) {
                    i8 -= 8;
                    zzetVar.f14823a[i10] = (byte) (i9 >>> i8);
                    i10++;
                }
                int i11 = 8 - i8;
                byte[] bArr3 = zzetVar.f14823a;
                byte b5 = (byte) (bArr3[i10] & ((1 << i11) - 1));
                bArr3[i10] = b5;
                bArr3[i10] = (byte) (((i9 & ((1 << i8) - 1)) << i11) | b5);
                zzetVar.m6343f(14);
                zzetVar.m6350m();
            }
        }
        int length2 = bArrCopyOf.length;
        zzetVar.f14823a = bArrCopyOf;
        zzetVar.f14824b = 0;
        zzetVar.f14825c = 0;
        zzetVar.f14826d = length2;
        return zzetVar;
    }
}
