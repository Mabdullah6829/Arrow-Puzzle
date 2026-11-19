package p007E;

import java.io.OutputStream;
import p001B.AbstractC0076b;

/* JADX INFO: renamed from: E.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C0196e extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        bArr.getClass();
        AbstractC0076b.m136k(i2, i3 + i2, bArr.length);
    }
}
