package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhzx implements zzhdr {

    /* JADX INFO: renamed from: a */
    public final zzhkd f19544a;

    /* JADX INFO: renamed from: b */
    public final byte[] f19545b;

    public zzhzx(byte[] bArr, byte[] bArr2) {
        this.f19544a = new zzhkd(bArr);
        this.f19545b = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    /* JADX INFO: renamed from: a */
    public final byte[] mo7400a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f19545b;
        int length = bArr3.length;
        if (length == 0) {
            return m8026b(bArr, bArr2);
        }
        if (zzhok.m7598c(bArr3, bArr)) {
            return m8026b(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m8026b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.f19544a.m7494b(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }
}
