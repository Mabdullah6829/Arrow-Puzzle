package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzhka {

    /* JADX INFO: renamed from: a */
    public static final int[] f18883a = m7488c(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* JADX INFO: renamed from: a */
    public static void m7486a(int[] iArr) {
        for (int i2 = 0; i2 < 10; i2++) {
            m7487b(0, 4, 8, 12, iArr);
            m7487b(1, 5, 9, 13, iArr);
            m7487b(2, 6, 10, 14, iArr);
            m7487b(3, 7, 11, 15, iArr);
            m7487b(0, 5, 10, 15, iArr);
            m7487b(1, 6, 11, 12, iArr);
            m7487b(2, 7, 8, 13, iArr);
            m7487b(3, 4, 9, 14, iArr);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7487b(int i2, int i3, int i4, int i5, int[] iArr) {
        int i6 = iArr[i2] + iArr[i3];
        iArr[i2] = i6;
        int i7 = i6 ^ iArr[i5];
        int i8 = (i7 >>> (-16)) | (i7 << 16);
        iArr[i5] = i8;
        int i9 = iArr[i4] + i8;
        iArr[i4] = i9;
        int i10 = iArr[i3] ^ i9;
        int i11 = (i10 >>> (-12)) | (i10 << 12);
        iArr[i3] = i11;
        int i12 = iArr[i2] + i11;
        iArr[i2] = i12;
        int i13 = iArr[i5] ^ i12;
        int i14 = (i13 >>> (-8)) | (i13 << 8);
        iArr[i5] = i14;
        int i15 = iArr[i4] + i14;
        iArr[i4] = i15;
        int i16 = iArr[i3] ^ i15;
        iArr[i3] = (i16 >>> (-7)) | (i16 << 7);
    }

    /* JADX INFO: renamed from: c */
    public static int[] m7488c(byte[] bArr) {
        if ((bArr.length & 3) != 0) {
            throw new IllegalArgumentException("invalid input length");
        }
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    public static int[] m7489d(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        int[] iArr4 = f18883a;
        int length = iArr4.length;
        System.arraycopy(iArr4, 0, iArr3, 0, length);
        System.arraycopy(iArr, 0, iArr3, length, 8);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        m7486a(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }
}
