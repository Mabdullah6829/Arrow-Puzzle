package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbgh extends zzbfz {

    /* JADX INFO: renamed from: c */
    public MessageDigest f7820c;

    /* JADX INFO: renamed from: d */
    public final int f7821d;

    /* JADX INFO: renamed from: e */
    public final int f7822e;

    public zzbgh(int i2) {
        int i3 = i2 >> 3;
        this.f7821d = (i2 & 7) > 0 ? i3 + 1 : i3;
        this.f7822e = i2;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m4868b(String str) {
        synchronized (this.f7806a) {
            try {
                MessageDigest messageDigestM4858a = m4858a();
                this.f7820c = messageDigestM4858a;
                if (messageDigestM4858a == null) {
                    return new byte[0];
                }
                messageDigestM4858a.reset();
                this.f7820c.update(str.getBytes(StandardCharsets.UTF_8));
                byte[] bArrDigest = this.f7820c.digest();
                int length = bArrDigest.length;
                int i2 = this.f7821d;
                if (length > i2) {
                    length = i2;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                int i3 = this.f7822e & 7;
                if (i3 > 0) {
                    long j2 = 0;
                    for (int i4 = 0; i4 < length; i4++) {
                        if (i4 > 0) {
                            j2 <<= 8;
                        }
                        j2 += (long) (bArr[i4] & 255);
                    }
                    long j3 = j2 >>> (8 - i3);
                    while (true) {
                        i2--;
                        if (i2 < 0) {
                            break;
                        }
                        bArr[i2] = (byte) (255 & j3);
                        j3 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
