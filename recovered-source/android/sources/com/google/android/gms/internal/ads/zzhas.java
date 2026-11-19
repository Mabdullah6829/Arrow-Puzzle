package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzhas {

    /* JADX INFO: renamed from: a */
    public static final byte[] f18436a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i2 = 0; i2 < 10; i2++) {
            bArr[i2 + 48] = (byte) i2;
        }
        for (int i3 = 0; i3 < 26; i3++) {
            byte b = (byte) (i3 + 10);
            bArr[i3 + 65] = b;
            bArr[i3 + 97] = b;
        }
        f18436a = bArr;
    }
}
