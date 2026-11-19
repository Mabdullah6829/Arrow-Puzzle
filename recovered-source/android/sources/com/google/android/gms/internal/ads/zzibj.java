package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzibj implements zzhdr {

    /* JADX INFO: renamed from: a */
    public final zzhkg f19612a;

    /* JADX INFO: renamed from: b */
    public final byte[] f19613b;

    public zzibj(byte[] bArr, byte[] bArr2) {
        this.f19612a = new zzhkg(bArr);
        this.f19613b = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    /* JADX INFO: renamed from: a */
    public final byte[] mo7400a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f19613b;
        int length = bArr3.length;
        if (length == 0) {
            return m8049b(bArr, bArr2);
        }
        if (zzhok.m7598c(bArr3, bArr)) {
            return m8049b(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m8049b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.f19612a.m7494b(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }
}
