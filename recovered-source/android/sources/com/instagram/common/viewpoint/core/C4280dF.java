package com.instagram.common.viewpoint.core;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dF */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4280dF extends InputStream {
    public static byte[] A04;
    public MessageDigest A00;
    public final C4490ge A01;
    public final InterfaceC4279dE A02;
    public final FileInputStream A03;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 43);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-52, -61, -76, -23, -8, -15};
    }

    public C4280dF(C4490ge c4490ge, FileInputStream fileInputStream, InterfaceC4279dE interfaceC4279dE) {
        this.A03 = fileInputStream;
        this.A02 = interfaceC4279dE;
        this.A01 = c4490ge;
        try {
            this.A00 = MessageDigest.getInstance(A00(0, 3, 84));
        } catch (NoSuchAlgorithmException unused) {
            this.A00 = null;
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.A03.available();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b = new byte[1];
        return read(b);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.A03.read(bArr, i2, i3);
        if (this.A00 != null) {
            try {
                if (i4 > 0) {
                    this.A00.update(bArr, i2, i4);
                } else if (i4 == -1) {
                    this.A02.A9s(C3929Xa.A05(this.A00.digest()));
                    this.A00 = null;
                }
            } catch (Exception e) {
                this.A00 = null;
                this.A01.A08().ABz(A00(3, 3, 90), AbstractC3690Td.A13, new C3691Te(e));
            }
        }
        return i4;
    }

    @Override // java.io.InputStream
    public final long skip(long j2) throws IOException {
        int actuallyRead = (int) j2;
        byte[] bArr = new byte[1024];
        long j3 = 0;
        while (actuallyRead > 0) {
            int bytesToRead = read(bArr, 0, Math.min(actuallyRead, 1024));
            if (bytesToRead <= 0) {
                break;
            }
            actuallyRead -= bytesToRead;
            j3 += (long) bytesToRead;
        }
        return j3;
    }
}
