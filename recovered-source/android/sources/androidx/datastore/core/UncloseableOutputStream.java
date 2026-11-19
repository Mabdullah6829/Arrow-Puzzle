package androidx.datastore.core;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class UncloseableOutputStream extends OutputStream {
    private final FileOutputStream fileOutputStream;

    public UncloseableOutputStream(FileOutputStream fileOutputStream) {
        AbstractC6452k.m12181e(fileOutputStream, "fileOutputStream");
        this.fileOutputStream = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.fileOutputStream.flush();
    }

    public final FileOutputStream getFileOutputStream() {
        return this.fileOutputStream;
    }

    @Override // java.io.OutputStream
    public void write(int i2) throws IOException {
        this.fileOutputStream.write(i2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] b) throws IOException {
        AbstractC6452k.m12181e(b, "b");
        this.fileOutputStream.write(b);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bytes, int i2, int i3) throws IOException {
        AbstractC6452k.m12181e(bytes, "bytes");
        this.fileOutputStream.write(bytes, i2, i3);
    }
}
