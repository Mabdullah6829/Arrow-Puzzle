package p034T;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import p001B.AbstractC0076b;

/* JADX INFO: renamed from: T.F1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0650F1 extends AbstractC0722d {

    /* JADX INFO: renamed from: s */
    public int f1444s;

    /* JADX INFO: renamed from: t */
    public final int f1445t;

    /* JADX INFO: renamed from: u */
    public final byte[] f1446u;

    /* JADX INFO: renamed from: v */
    public int f1447v = -1;

    public C0650F1(byte[] bArr, int i2, int i3) {
        AbstractC0076b.m131f(i2 >= 0, "offset must be >= 0");
        AbstractC0076b.m131f(i3 >= 0, "length must be >= 0");
        int i4 = i3 + i2;
        AbstractC0076b.m131f(i4 <= bArr.length, "offset + length exceeds array boundary");
        this.f1446u = bArr;
        this.f1444s = i2;
        this.f1445t = i4;
    }

    @Override // p034T.AbstractC0722d
    /* JADX INFO: renamed from: e */
    public final void mo1490e() {
        this.f1447v = this.f1444s;
    }

    @Override // p034T.AbstractC0722d
    /* JADX INFO: renamed from: i */
    public final AbstractC0722d mo1491i(int i2) {
        m1607c(i2);
        int i3 = this.f1444s;
        this.f1444s = i3 + i2;
        return new C0650F1(this.f1446u, i3, i2);
    }

    @Override // p034T.AbstractC0722d
    /* JADX INFO: renamed from: j */
    public final void mo1492j(OutputStream outputStream, int i2) throws IOException {
        m1607c(i2);
        outputStream.write(this.f1446u, this.f1444s, i2);
        this.f1444s += i2;
    }

    @Override // p034T.AbstractC0722d
    /* JADX INFO: renamed from: l */
    public final void mo1493l(ByteBuffer byteBuffer) {
        AbstractC0076b.m133h(byteBuffer, "dest");
        int iRemaining = byteBuffer.remaining();
        m1607c(iRemaining);
        byteBuffer.put(this.f1446u, this.f1444s, iRemaining);
        this.f1444s += iRemaining;
    }

    @Override // p034T.AbstractC0722d
    /* JADX INFO: renamed from: n */
    public final void mo1494n(byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f1446u, this.f1444s, bArr, i2, i3);
        this.f1444s += i3;
    }

    @Override // p034T.AbstractC0722d
    /* JADX INFO: renamed from: o */
    public final int mo1495o() {
        m1607c(1);
        int i2 = this.f1444s;
        this.f1444s = i2 + 1;
        return this.f1446u[i2] & 255;
    }

    @Override // p034T.AbstractC0722d
    /* JADX INFO: renamed from: p */
    public final int mo1496p() {
        return this.f1445t - this.f1444s;
    }

    @Override // p034T.AbstractC0722d
    /* JADX INFO: renamed from: r */
    public final void mo1497r() {
        int i2 = this.f1447v;
        if (i2 == -1) {
            throw new InvalidMarkException();
        }
        this.f1444s = i2;
    }

    @Override // p034T.AbstractC0722d
    /* JADX INFO: renamed from: u */
    public final void mo1498u(int i2) {
        m1607c(i2);
        this.f1444s += i2;
    }
}
