package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhkb extends zzhkc {
    @Override // com.google.android.gms.internal.ads.zzhkc
    /* JADX INFO: renamed from: a */
    public final int[] mo7490a(int i2, int[] iArr) {
        int length = iArr.length;
        if (length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = zzhka.f18883a;
        int length2 = iArr3.length;
        System.arraycopy(iArr3, 0, iArr2, 0, length2);
        System.arraycopy(this.f18884a, 0, iArr2, length2, 8);
        iArr2[12] = i2;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzhkc
    /* JADX INFO: renamed from: b */
    public final int mo7491b() {
        return 12;
    }
}
