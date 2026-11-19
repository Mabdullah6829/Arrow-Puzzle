package p034T;

import io.grpc.StatusRuntimeException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p030R.AbstractC0570n;
import p030R.C0589w0;

/* JADX INFO: renamed from: T.l1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0756l1 extends FilterInputStream {

    /* JADX INFO: renamed from: s */
    public final int f1910s;

    /* JADX INFO: renamed from: t */
    public final C0777q2 f1911t;

    /* JADX INFO: renamed from: u */
    public long f1912u;

    /* JADX INFO: renamed from: v */
    public long f1913v;

    /* JADX INFO: renamed from: w */
    public long f1914w;

    public C0756l1(InputStream inputStream, int i2, C0777q2 c0777q2) {
        super(inputStream);
        this.f1914w = -1L;
        this.f1910s = i2;
        this.f1911t = c0777q2;
    }

    /* JADX INFO: renamed from: c */
    public final void m1618c() {
        long j2 = this.f1913v;
        long j3 = this.f1912u;
        if (j2 > j3) {
            long j4 = j2 - j3;
            for (AbstractC0570n abstractC0570n : this.f1911t.f2019a) {
                abstractC0570n.mo1326f(j4);
            }
            this.f1912u = this.f1913v;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1619e() {
        long j2 = this.f1913v;
        int i2 = this.f1910s;
        if (j2 <= i2) {
            return;
        }
        throw new StatusRuntimeException(C0589w0.f1281k.m1354g("Decompressed gRPC message exceeds maximum size " + i2));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i2) {
        ((FilterInputStream) this).in.mark(i2);
        this.f1914w = this.f1913v;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i2 = ((FilterInputStream) this).in.read();
        if (i2 != -1) {
            this.f1913v++;
        }
        m1619e();
        m1618c();
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f1914w == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f1913v = this.f1914w;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(j2);
        this.f1913v += jSkip;
        m1619e();
        m1618c();
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = ((FilterInputStream) this).in.read(bArr, i2, i3);
        if (i4 != -1) {
            this.f1913v += (long) i4;
        }
        m1619e();
        m1618c();
        return i4;
    }
}
