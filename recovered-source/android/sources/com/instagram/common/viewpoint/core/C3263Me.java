package com.instagram.common.viewpoint.core;

import androidx.core.location.LocationRequestCompat;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Me */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3263Me {
    public static String[] A0A = {"Zahrr4TzPnlvzL1ryUDBJHiLrNQrc0do", "gdtiLcJnOI63VIDKC4FZh", "mcKRdr7QIVfArpWMDov87T9yp6nn6XkX", "hh9PATM4XXQMpkTMp0yEe4VjsJayobMb", "DHsdxhl2jOmdOKqNSGjxb8rQV1nmB92A", "YMP8jok2HwiV", "9", "S"};
    public long A00;
    public long A01;
    public long A02;
    public final C22355i A03;
    public final InterfaceC3248MP A04;
    public final C23888B A05;
    public final InterfaceC3262Md A06;
    public final String A07;
    public final byte[] A08;
    public volatile boolean A09;

    public C3263Me(C23888B c23888b, C22355i c22355i, byte[] bArr, InterfaceC3262Md interfaceC3262Md) {
        this.A05 = c23888b;
        this.A04 = c23888b.A0E();
        this.A03 = c22355i;
        this.A08 = bArr == null ? new byte[131072] : bArr;
        this.A06 = interfaceC3262Md;
        this.A07 = c23888b.A0F().A4l(c22355i);
        this.A02 = c22355i.A04;
    }

    private long A00() {
        if (this.A01 == -1) {
            return -1L;
        }
        return this.A01 - this.A03.A04;
    }

    private long A01(long j2, long j3) throws Throwable {
        boolean z = j2 + j3 == this.A01 || j3 == -1;
        long jAGi = -1;
        boolean z2 = false;
        if (j3 != -1) {
            try {
                jAGi = this.A05.AGi(this.A03.A04().A04(j2).A03(j3).A09());
                z2 = true;
            } catch (IOException unused) {
                AbstractC22305d.A00(this.A05);
            }
        }
        if (!z2) {
            A02();
            try {
                jAGi = this.A05.AGi(this.A03.A04().A04(j2).A03(-1L).A09());
            } catch (IOException e) {
                AbstractC22305d.A00(this.A05);
                throw e;
            }
        }
        int bytesRead = 0;
        if (A0A[3].charAt(20) != 'e') {
            throw new RuntimeException();
        }
        A0A[0] = "hZR9VwpKkwuUXqoAcu0MC0lnjZxabJfZ";
        if (z && jAGi != -1) {
            try {
                A04(j2 + jAGi);
            } catch (IOException e2) {
                AbstractC22305d.A00(this.A05);
                throw e2;
            }
        }
        int i2 = 0;
        while (i2 != -1) {
            A02();
            i2 = this.A05.read(this.A08, 0, this.A08.length);
            if (i2 != -1) {
                A03(i2);
                bytesRead += i2;
            }
        }
        if (z) {
            A04(((long) bytesRead) + j2);
        }
        this.A05.close();
        long j4 = bytesRead;
        String[] strArr = A0A;
        if (strArr[5].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[5] = "HblyszVHSCLV";
        strArr2[7] = "g";
        return j4;
    }

    private void A02() throws InterruptedIOException {
        if (!this.A09) {
        } else {
            throw new InterruptedIOException();
        }
    }

    private void A03(long j2) {
        this.A00 += j2;
        if (this.A06 != null) {
            this.A06.AFX(A00(), this.A00, j2);
        }
    }

    private void A04(long j2) {
        if (this.A01 == j2) {
            return;
        }
        this.A01 = j2;
        if (this.A06 != null) {
            this.A06.AFX(A00(), this.A00, 0L);
        }
    }

    public final void A05() throws IOException {
        long nextRequestLength;
        A02();
        this.A00 = this.A04.A7B(this.A07, this.A03.A04, this.A03.A03);
        if (this.A03.A03 != -1) {
            this.A01 = this.A03.A04 + this.A03.A03;
        } else {
            long jA00 = AbstractC3268Mj.A00(this.A04.A7S(this.A07));
            if (A0A[3].charAt(20) == 'e') {
                String[] strArr = A0A;
                strArr[4] = "d2NeaqM7PiJwxNK1Ah3bQ5GZkUsby9uw";
                strArr[2] = "tLvOBlFvjcFhEySGIYecGT7qbHBlIMmD";
                if (jA00 == -1) {
                    jA00 = -1;
                }
                this.A01 = jA00;
            }
            throw new RuntimeException();
        }
        if (this.A06 != null) {
            this.A06.AFX(A00(), this.A00, 0L);
        }
        while (true) {
            long j2 = this.A01;
            if (A0A[6].length() == 13) {
                break;
            }
            A0A[1] = "NGuGGBYtFkRF3XmDWlB70";
            if (j2 == -1 || this.A02 < this.A01) {
                A02();
                if (this.A01 == -1) {
                    nextRequestLength = Long.MAX_VALUE;
                } else {
                    long nextRequestLength2 = this.A01;
                    long blockLength = this.A02;
                    nextRequestLength = nextRequestLength2 - blockLength;
                }
                long jA7C = this.A04.A7C(this.A07, this.A02, nextRequestLength);
                if (jA7C > 0) {
                    long blockLength2 = this.A02;
                    this.A02 = blockLength2 + jA7C;
                } else {
                    long nextRequestLength3 = -jA7C;
                    if (nextRequestLength3 == LocationRequestCompat.PASSIVE_INTERVAL) {
                        nextRequestLength3 = -1;
                    }
                    long j3 = this.A02;
                    long blockLength3 = this.A02;
                    this.A02 = j3 + A01(blockLength3, nextRequestLength3);
                }
            } else {
                return;
            }
        }
        throw new RuntimeException();
    }

    public final void A06() {
        this.A09 = true;
    }
}
