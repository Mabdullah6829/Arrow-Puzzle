package com.instagram.common.viewpoint.core;

import androidx.core.location.LocationRequestCompat;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kU */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4721kU implements InterfaceC22235W {
    public static byte[] A0A;
    public static String[] A0B = {"ZvdLZTVfwuIBTQP4GzYBT5X", "wbAZGHQ6rgrE49QWGCHGfuBznSfuy1uN", "V6XwnsY6foGeZeUf6zKrOXNqPWCT5H6x", "YVOcTVGnehAK6q3v9MTNJvITraIKZiNA", "KHrBPZHANML419JBBjaM9uFMM5JItkLu", "1WIXy5Awt7B4E86DpiV0tl9iGx9sIFx0", "LtMYCkXqs5nSRMey4EGdy6S", "9S3XCAL9m1K226khzcMpmZ28hR6Taq7A"};
    public long A00;
    public long A01;
    public long A02;
    public C22355i A03;
    public C3273Mo A04;
    public File A05;
    public OutputStream A06;
    public final int A07;
    public final long A08;
    public final InterfaceC3248MP A09;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 13);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{86, 116, 118, 125, 112, 81, 116, 97, 116, 70, 124, 123, 126, 32, 52, 39, 33, 43, 35, 40, 50, 21, 47, 60, 35, 102, 47, 53, 102, 36, 35, 42, 41, 49, 102, 50, 46, 35, 102, 43, 47, 40, 47, 43, 51, 43, 102, 52, 35, 37, 41, 43, 43, 35, 40, 34, 35, 34, 102, 48, 39, 42, 51, 35, 102, 41, 32, 102, 116, 118, 127, 113, 119, 115, 116, 104, 102, 18, 46, 47, 53, 102, 43, 39, 63, 102, 37, 39, 51, 53, 35, 102, 54, 41, 41, 52, 102, 37, 39, 37, 46, 35, 102, 54, 35, 52, 32, 41, 52, 43, 39, 40, 37, 35, 104, 35, 55, 36, 34, 40, 32, 43, 49, 22, 44, 63, 32, 101, 40, 48, 54, 49, 101, 39, 32, 101, 53, 42, 54, 44, 49, 44, 51, 32, 101, 42, 55, 101, 6, 107, 9, 0, 11, 2, 17, 13, 26, 16, 11, 22, 0, 17, 107};
    }

    static {
        A02();
    }

    public C4721kU(InterfaceC3248MP interfaceC3248MP, long j2, int i2) {
        AbstractC21273y.A0A(j2 > 0 || j2 == -1, A00(115, 48, 72));
        if (j2 != -1 && j2 < 2097152) {
            AbstractC21714g.A07(A00(0, 13, 24), A00(13, 102, 75));
        }
        this.A09 = (InterfaceC3248MP) AbstractC21273y.A01(interfaceC3248MP);
        this.A08 = j2 == -1 ? LocationRequestCompat.PASSIVE_INTERVAL : j2;
        this.A07 = i2;
    }

    private void A01() throws IOException {
        if (this.A06 == null) {
            return;
        }
        try {
            this.A06.flush();
            AbstractC22035C.A10(this.A06);
            this.A06 = null;
            File file = (File) AbstractC22035C.A0f(this.A05);
            this.A05 = null;
            String[] strArr = A0B;
            if (strArr[7].charAt(29) == strArr[2].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[0] = "UqCq1nJSNUsM2UdGgnorxCQ";
            strArr2[6] = "6grM2eqzP4bpAc7X7xQexiC";
            if (1 != 0) {
                this.A09.A55(file, this.A02);
            } else {
                file.delete();
            }
        } catch (Throwable th) {
            AbstractC22035C.A10(this.A06);
            this.A06 = null;
            File fileToCommit = (File) AbstractC22035C.A0f(this.A05);
            this.A05 = null;
            if (0 != 0) {
                this.A09.A55(fileToCommit, this.A02);
            } else {
                fileToCommit.delete();
            }
            throw th;
        }
    }

    private void A03(C22355i c22355i) throws IOException {
        this.A05 = this.A09.AK8((String) AbstractC22035C.A0f(c22355i.A08), c22355i.A04 + this.A00, c22355i.A03 != -1 ? Math.min(c22355i.A03 - this.A00, this.A01) : -1L);
        FileOutputStream fileOutputStream = new FileOutputStream(this.A05);
        if (this.A07 > 0) {
            if (this.A04 == null) {
                this.A04 = new C3273Mo(fileOutputStream, this.A07);
            } else {
                this.A04.A00(fileOutputStream);
            }
            this.A06 = this.A04;
        } else {
            this.A06 = fileOutputStream;
        }
        this.A02 = 0L;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC22235W
    public final void AGk(C22355i c22355i) throws IOException {
        AbstractC21273y.A01(c22355i.A08);
        if (c22355i.A03 == -1 && c22355i.A06(2)) {
            this.A03 = null;
            return;
        }
        this.A03 = c22355i;
        this.A01 = c22355i.A06(4) ? this.A08 : LocationRequestCompat.PASSIVE_INTERVAL;
        this.A00 = 0L;
        try {
            A03(c22355i);
        } catch (IOException e) {
            throw new C4723kW(e);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC22235W
    public final void close() throws IOException {
        if (this.A03 == null) {
            return;
        }
        try {
            A01();
        } catch (IOException e) {
            throw new C4723kW(e);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC22235W
    public final void write(byte[] bArr, int i2, int i3) throws C4723kW {
        C22355i c22355i = this.A03;
        if (c22355i == null) {
            return;
        }
        int i4 = 0;
        while (i4 < i3) {
            try {
                if (this.A02 == this.A01) {
                    A01();
                    A03(c22355i);
                }
                int iMin = (int) Math.min(i3 - i4, this.A01 - this.A02);
                ((OutputStream) AbstractC22035C.A0f(this.A06)).write(bArr, i2 + i4, iMin);
                i4 += iMin;
                this.A02 += (long) iMin;
                this.A00 += (long) iMin;
            } catch (IOException e) {
                throw new C4723kW(e);
            }
        }
    }
}
