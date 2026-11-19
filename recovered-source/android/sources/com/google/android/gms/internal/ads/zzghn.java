package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzghn {

    /* JADX INFO: renamed from: a */
    public final byte[] f17284a = new byte[256];

    public zzghn(byte[] bArr) {
        for (int i2 = 0; i2 < 256; i2++) {
            this.f17284a[i2] = (byte) i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            byte[] bArr2 = this.f17284a;
            byte b = bArr2[i4];
            i3 = (i3 + b + bArr[i4 % bArr.length]) & 255;
            bArr2[i4] = bArr2[i3];
            bArr2[i3] = b;
        }
    }
}
