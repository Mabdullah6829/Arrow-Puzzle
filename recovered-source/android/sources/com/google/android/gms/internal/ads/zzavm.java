package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzavm implements zzavl {
    @Override // com.google.android.gms.internal.ads.zzavl
    /* JADX INFO: renamed from: a */
    public final byte mo4439a(zzavx zzavxVar, int i2) {
        return zzavxVar.m4448b(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzavl
    /* JADX INFO: renamed from: b */
    public final zzavx mo4440b(zzavx zzavxVar, int i2, int i3) {
        byte[] bArr;
        int length;
        byte[] bArr2;
        if (i2 < 0 || i2 > i3 || i3 > (length = (bArr = zzavxVar.f7096a).length) || i2 > i3 || i3 > length) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = i3 - i2;
        if (i4 == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr3 = new byte[i4];
            System.arraycopy(bArr, i2, bArr3, 0, i4);
            bArr2 = bArr3;
        }
        return new zzavx(bArr2);
    }

    @Override // com.google.android.gms.internal.ads.zzavl
    public final zzavl zzc() {
        return new zzavm();
    }
}
