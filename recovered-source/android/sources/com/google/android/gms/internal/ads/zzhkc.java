package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzhkc {

    /* JADX INFO: renamed from: a */
    public final int[] f18884a;

    /* JADX INFO: renamed from: b */
    public final int f18885b;

    public zzhkc(byte[] bArr, int i2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f18884a = zzhka.m7488c(bArr);
        this.f18885b = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract int[] mo7490a(int i2, int[] iArr);

    /* JADX INFO: renamed from: b */
    public abstract int mo7491b();

    /* JADX INFO: renamed from: c */
    public final ByteBuffer m7492c(int i2, byte[] bArr) {
        int[] iArrMo7490a = mo7490a(i2, zzhka.m7488c(bArr));
        int[] iArr = (int[]) iArrMo7490a.clone();
        zzhka.m7486a(iArr);
        for (int i3 = 0; i3 < 16; i3++) {
            iArrMo7490a[i3] = iArrMo7490a[i3] + iArr[i3];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrMo7490a, 0, 16);
        return byteBufferOrder;
    }
}
