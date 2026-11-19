package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzauv {
    /* JADX INFO: renamed from: a */
    public static long m4429a(ByteBuffer byteBuffer) {
        long j2 = byteBuffer.getInt();
        return j2 < 0 ? j2 + 4294967296L : j2;
    }

    /* JADX INFO: renamed from: b */
    public static long m4430b(ByteBuffer byteBuffer) {
        long jM4429a = m4429a(byteBuffer) << 32;
        if (jM4429a >= 0) {
            return m4429a(byteBuffer) + jM4429a;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    /* JADX INFO: renamed from: c */
    public static double m4431c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        int i2 = bArr[0] << 24;
        int i3 = bArr[1] << 16;
        int i4 = bArr[2] << 8;
        return ((double) ((((i2 & ViewCompat.MEASURED_STATE_MASK) | (i3 & 16711680)) | (65280 & i4)) | (bArr[3] & 255))) / 65536.0d;
    }

    /* JADX INFO: renamed from: d */
    public static double m4432d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        int i2 = bArr[0] << 24;
        int i3 = bArr[1] << 16;
        int i4 = bArr[2] << 8;
        return ((double) ((((i2 & ViewCompat.MEASURED_STATE_MASK) | (i3 & 16711680)) | (65280 & i4)) | (bArr[3] & 255))) / 1.073741824E9d;
    }
}
