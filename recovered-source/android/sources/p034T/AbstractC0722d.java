package p034T;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: T.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0722d implements Closeable {
    /* JADX INFO: renamed from: c */
    public final void m1607c(int i2) {
        if (mo1496p() < i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean mo1502h() {
        return this instanceof C0650F1;
    }

    /* JADX INFO: renamed from: i */
    public abstract AbstractC0722d mo1491i(int i2);

    /* JADX INFO: renamed from: j */
    public abstract void mo1492j(OutputStream outputStream, int i2);

    /* JADX INFO: renamed from: l */
    public abstract void mo1493l(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: n */
    public abstract void mo1494n(byte[] bArr, int i2, int i3);

    /* JADX INFO: renamed from: o */
    public abstract int mo1495o();

    /* JADX INFO: renamed from: p */
    public abstract int mo1496p();

    /* JADX INFO: renamed from: r */
    public void mo1497r() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: u */
    public abstract void mo1498u(int i2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* JADX INFO: renamed from: e */
    public void mo1490e() {
    }
}
