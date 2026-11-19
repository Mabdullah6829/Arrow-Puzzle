package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbge extends zzbfz {

    /* JADX INFO: renamed from: c */
    public MessageDigest f7816c;

    /* JADX INFO: renamed from: b */
    public final byte[] m4863b(String str) {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(" ");
        int length = strArrSplit.length;
        int i2 = 4;
        if (length == 1) {
            int iM4861a = zzbgd.m4861a(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iM4861a);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                    int iM4861a2 = zzbgd.m4861a(strArrSplit[i3]);
                    int i4 = (iM4861a2 >> 16) ^ ((char) iM4861a2);
                    byte b = (byte) i4;
                    byte b2 = (byte) (i4 >> 8);
                    int i5 = i3 + i3;
                    bArr[i5] = new byte[]{b, b2}[0];
                    bArr[i5 + 1] = b2;
                }
            } else {
                bArr = new byte[length];
                for (int i6 = 0; i6 < strArrSplit.length; i6++) {
                    int iM4861a3 = zzbgd.m4861a(strArrSplit[i6]);
                    bArr[i6] = (byte) ((iM4861a3 >> 24) ^ (((iM4861a3 & 255) ^ ((iM4861a3 >> 8) & 255)) ^ ((iM4861a3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.f7816c = m4858a();
        synchronized (this.f7806a) {
            try {
                MessageDigest messageDigest = this.f7816c;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.f7816c.update(bArrArray);
                byte[] bArrDigest = this.f7816c.digest();
                int length2 = bArrDigest.length;
                if (length2 <= 4) {
                    i2 = length2;
                }
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArrDigest, 0, bArr2, 0, i2);
                return bArr2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
