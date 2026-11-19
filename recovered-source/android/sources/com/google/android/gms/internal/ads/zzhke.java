package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzhke {

    /* JADX INFO: renamed from: a */
    public final zzhkc f18886a;

    /* JADX INFO: renamed from: b */
    public final zzhkc f18887b;

    public zzhke(byte[] bArr) throws GeneralSecurityException {
        if (!zzhle.m7504a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f18886a = mo7493a(1, bArr);
        this.f18887b = mo7493a(0, bArr);
    }

    /* JADX INFO: renamed from: a */
    public abstract zzhkc mo7493a(int i2, byte[] bArr);

    /* JADX INFO: renamed from: b */
    public final byte[] m7494b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            this.f18887b.m7492c(0, bArr).get(bArr4);
            int length = bArr2.length;
            int i2 = length & 15;
            int i3 = i2 == 0 ? length : (length + 16) - i2;
            int iRemaining = byteBuffer.remaining();
            int i4 = iRemaining % 16;
            int i5 = (i4 == 0 ? iRemaining : (iRemaining + 16) - i4) + i3;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i5 + 16).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put(bArr2);
            byteBufferOrder.position(i3);
            byteBufferOrder.put(byteBuffer);
            byteBufferOrder.position(i5);
            byteBufferOrder.putLong(length);
            byteBufferOrder.putLong(iRemaining);
            if (!MessageDigest.isEqual(zzhki.m7495a(bArr4, byteBufferOrder.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            zzhkc zzhkcVar = this.f18886a;
            zzhkcVar.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            if (bArr.length != zzhkcVar.mo7491b()) {
                int iMo7491b = zzhkcVar.mo7491b();
                throw new GeneralSecurityException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iMo7491b).length() + 36), "The nonce length (in bytes) must be ", iMo7491b));
            }
            int iRemaining2 = byteBuffer.remaining();
            int i6 = iRemaining2 / 64;
            for (int i7 = 0; i7 < i6 + 1; i7++) {
                ByteBuffer byteBufferM7492c = zzhkcVar.m7492c(zzhkcVar.f18885b + i7, bArr);
                if (i7 == i6) {
                    zzhzw.m8025c(byteBufferAllocate, byteBuffer, byteBufferM7492c, iRemaining2 % 64);
                } else {
                    zzhzw.m8025c(byteBufferAllocate, byteBuffer, byteBufferM7492c, 64);
                }
            }
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }
}
