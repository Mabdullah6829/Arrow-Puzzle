package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lC */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4763lC extends AbstractC2916H2 {
    public C4763lC(C219453 c219453, long j2, long j3) {
        super(new C4861mz(), new C4764lD(c219453), j2, 0L, j2 + 1, 0L, j3, 188L, 1000);
    }

    public static int A00(byte[] bArr, int i2) {
        return ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8) | (bArr[i2 + 3] & 255);
    }
}
