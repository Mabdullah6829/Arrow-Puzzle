package p036U;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0271e0;
import p033S0.AbstractC0608b;
import p033S0.AbstractC0631y;
import p033S0.C0613g;
import p033S0.C0630x;
import p034T.AbstractC0722d;

/* JADX INFO: renamed from: U.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0837r extends AbstractC0722d {

    /* JADX INFO: renamed from: s */
    public final C0613g f2300s;

    public C0837r(C0613g c0613g) {
        this.f2300s = c0613g;
    }

    @Override // p034T.AbstractC0722d, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0613g c0613g = this.f2300s;
        c0613g.m1382J(c0613g.f1342t);
    }

    @Override // p034T.AbstractC0722d
    /* JADX INFO: renamed from: i */
    public final AbstractC0722d mo1491i(int i2) {
        C0613g c0613g = new C0613g();
        c0613g.mo1356s(this.f2300s, i2);
        return new C0837r(c0613g);
    }

    @Override // p034T.AbstractC0722d
    /* JADX INFO: renamed from: j */
    public final void mo1492j(OutputStream out, int i2) throws IOException {
        long j2 = i2;
        C0613g c0613g = this.f2300s;
        c0613g.getClass();
        AbstractC6452k.m12181e(out, "out");
        AbstractC0608b.m1370c(c0613g.f1342t, 0L, j2);
        C0630x c0630x = c0613g.f1341s;
        while (j2 > 0) {
            AbstractC6452k.m12178b(c0630x);
            int iMin = (int) Math.min(j2, c0630x.f1381c - c0630x.f1380b);
            out.write(c0630x.f1379a, c0630x.f1380b, iMin);
            int i3 = c0630x.f1380b + iMin;
            c0630x.f1380b = i3;
            long j3 = iMin;
            c0613g.f1342t -= j3;
            j2 -= j3;
            if (i3 == c0630x.f1381c) {
                C0630x c0630xM1472a = c0630x.m1472a();
                c0613g.f1341s = c0630xM1472a;
                AbstractC0631y.m1476a(c0630x);
                c0630x = c0630xM1472a;
            }
        }
    }

    @Override // p034T.AbstractC0722d
    /* JADX INFO: renamed from: l */
    public final void mo1493l(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // p034T.AbstractC0722d
    /* JADX INFO: renamed from: n */
    public final void mo1494n(byte[] bArr, int i2, int i3) {
        while (i3 > 0) {
            int i4 = this.f2300s.read(bArr, i2, i3);
            if (i4 == -1) {
                throw new IndexOutOfBoundsException(AbstractC0271e0.m397e(i3, "EOF trying to read ", " bytes"));
            }
            i3 -= i4;
            i2 += i4;
        }
    }

    @Override // p034T.AbstractC0722d
    /* JADX INFO: renamed from: o */
    public final int mo1495o() {
        try {
            return this.f2300s.m1395p() & 255;
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

    @Override // p034T.AbstractC0722d
    /* JADX INFO: renamed from: p */
    public final int mo1496p() {
        return (int) this.f2300s.f1342t;
    }

    @Override // p034T.AbstractC0722d
    /* JADX INFO: renamed from: u */
    public final void mo1498u(int i2) {
        try {
            this.f2300s.m1382J(i2);
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }
}
