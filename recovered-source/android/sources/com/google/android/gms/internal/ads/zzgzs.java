package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
final class zzgzs extends FilterInputStream {

    /* JADX INFO: renamed from: s */
    public long f18404s;

    /* JADX INFO: renamed from: t */
    public long f18405t;

    public zzgzs(InputStream inputStream, long j2) {
        super(inputStream);
        this.f18405t = -1L;
        inputStream.getClass();
        zzgtr.m7129b("limit must be non-negative", j2 >= 0);
        this.f18404s = j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f18404s);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i2) {
        ((FilterInputStream) this).in.mark(i2);
        this.f18405t = this.f18404s;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f18404s == 0) {
            return -1;
        }
        int i2 = ((FilterInputStream) this).in.read();
        if (i2 != -1) {
            this.f18404s--;
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f18405t == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f18404s = this.f18405t;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j2, this.f18404s));
        this.f18404s -= jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        long j2 = this.f18404s;
        if (j2 == 0) {
            return -1;
        }
        int i4 = ((FilterInputStream) this).in.read(bArr, i2, (int) Math.min(i3, j2));
        if (i4 != -1) {
            this.f18404s -= (long) i4;
        }
        return i4;
    }
}
