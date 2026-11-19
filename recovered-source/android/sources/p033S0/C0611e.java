package p033S0;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: renamed from: S0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0611e extends InputStream {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f1337s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC0615i f1338t;

    public /* synthetic */ C0611e(InterfaceC0615i interfaceC0615i, int i2) {
        this.f1337s = i2;
        this.f1338t = interfaceC0615i;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long jMin;
        switch (this.f1337s) {
            case 0:
                jMin = Math.min(((C0613g) this.f1338t).f1342t, Integer.MAX_VALUE);
                break;
            default:
                C0629w c0629w = (C0629w) this.f1338t;
                if (c0629w.f1378u) {
                    throw new IOException("closed");
                }
                jMin = Math.min(c0629w.f1377t.f1342t, Integer.MAX_VALUE);
                break;
        }
        return (int) jMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f1337s) {
            case 0:
                break;
            default:
                ((C0629w) this.f1338t).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f1337s) {
            case 0:
                C0613g c0613g = (C0613g) this.f1338t;
                if (c0613g.f1342t > 0) {
                    return c0613g.m1395p() & 255;
                }
                return -1;
            default:
                C0629w c0629w = (C0629w) this.f1338t;
                C0613g c0613g2 = c0629w.f1377t;
                if (c0629w.f1378u) {
                    throw new IOException("closed");
                }
                if (c0613g2.f1342t == 0 && c0629w.f1376s.mo1359m(c0613g2, 8192L) == -1) {
                    return -1;
                }
                return c0613g2.m1395p() & 255;
        }
    }

    public final String toString() {
        switch (this.f1337s) {
            case 0:
                return ((C0613g) this.f1338t) + ".inputStream()";
            default:
                return ((C0629w) this.f1338t) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] sink, int i2, int i3) throws IOException {
        switch (this.f1337s) {
            case 0:
                AbstractC6452k.m12181e(sink, "sink");
                return ((C0613g) this.f1338t).read(sink, i2, i3);
            default:
                AbstractC6452k.m12181e(sink, "data");
                C0629w c0629w = (C0629w) this.f1338t;
                C0613g c0613g = c0629w.f1377t;
                if (!c0629w.f1378u) {
                    AbstractC0608b.m1370c(sink.length, i2, i3);
                    if (c0613g.f1342t == 0 && c0629w.f1376s.mo1359m(c0613g, 8192L) == -1) {
                        return -1;
                    }
                    return c0613g.read(sink, i2, i3);
                }
                throw new IOException("closed");
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m1374c() {
    }
}
