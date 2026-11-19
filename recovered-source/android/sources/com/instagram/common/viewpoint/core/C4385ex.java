package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ex */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4385ex extends InputStream {
    public int A00;
    public long A01;
    public InterfaceC5000pF A02;
    public final Uri A03;
    public final InterfaceC22255Y A04;
    public final C4490ge A05;
    public final String A06;

    public C4385ex(C4490ge c4490ge, Uri uri, InterfaceC22255Y interfaceC22255Y) throws IOException {
        this.A05 = c4490ge;
        this.A04 = interfaceC22255Y;
        this.A03 = uri;
        this.A06 = C4425fb.A09(this.A05, this.A03);
        A00(0);
    }

    private void A00(int i2) throws IOException {
        if (this.A02 != null) {
            this.A02.close();
        }
        this.A02 = this.A04.A5I();
        this.A01 = (int) this.A02.AGi(new C22355i(this.A03, i2, -1L, this.A06));
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((int) this.A01) - this.A00;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b = new byte[1];
        return read(b);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.A02.read(bArr, i2, i3);
        int read = this.A00;
        this.A00 = read + i4;
        return i4;
    }

    @Override // java.io.InputStream
    public final long skip(long j2) throws IOException {
        long j3 = this.A01 - ((long) this.A00);
        if (j3 <= 0) {
            return 0L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        this.A00 = (int) (((long) this.A00) + j2);
        A00(this.A00);
        return j2;
    }
}
