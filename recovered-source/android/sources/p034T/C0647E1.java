package p034T;

import java.io.IOException;
import java.io.InputStream;
import p030R.InterfaceC0532N;

/* JADX INFO: renamed from: T.E1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0647E1 extends InputStream implements InterfaceC0532N {

    /* JADX INFO: renamed from: s */
    public AbstractC0722d f1442s;

    @Override // java.io.InputStream
    public final int available() {
        return this.f1442s.mo1496p();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f1442s.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i2) {
        this.f1442s.mo1490e();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f1442s.mo1502h();
    }

    @Override // java.io.InputStream
    public final int read() {
        AbstractC0722d abstractC0722d = this.f1442s;
        if (abstractC0722d.mo1496p() == 0) {
            return -1;
        }
        return abstractC0722d.mo1495o();
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f1442s.mo1497r();
    }

    @Override // java.io.InputStream
    public final long skip(long j2) {
        AbstractC0722d abstractC0722d = this.f1442s;
        int iMin = (int) Math.min(abstractC0722d.mo1496p(), j2);
        abstractC0722d.mo1498u(iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        AbstractC0722d abstractC0722d = this.f1442s;
        if (abstractC0722d.mo1496p() == 0) {
            return -1;
        }
        int iMin = Math.min(abstractC0722d.mo1496p(), i3);
        abstractC0722d.mo1494n(bArr, i2, iMin);
        return iMin;
    }
}
