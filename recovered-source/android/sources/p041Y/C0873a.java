package p041Y;

import com.google.protobuf.AbstractC6269w;
import com.google.protobuf.C6265u;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6262s0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.logging.Logger;
import p030R.InterfaceC0532N;

/* JADX INFO: renamed from: Y.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0873a extends InputStream implements InterfaceC0532N {

    /* JADX INFO: renamed from: s */
    public InterfaceC6262s0 f2449s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC6162A0 f2450t;

    /* JADX INFO: renamed from: u */
    public ByteArrayInputStream f2451u;

    public C0873a(InterfaceC6262s0 interfaceC6262s0, InterfaceC6162A0 interfaceC6162A0) {
        this.f2449s = interfaceC6262s0;
        this.f2450t = interfaceC6162A0;
    }

    @Override // java.io.InputStream
    public final int available() {
        InterfaceC6262s0 interfaceC6262s0 = this.f2449s;
        if (interfaceC6262s0 != null) {
            return interfaceC6262s0.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.f2451u;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f2449s != null) {
            this.f2451u = new ByteArrayInputStream(this.f2449s.toByteArray());
            this.f2449s = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f2451u;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        InterfaceC6262s0 interfaceC6262s0 = this.f2449s;
        if (interfaceC6262s0 != null) {
            int serializedSize = interfaceC6262s0.getSerializedSize();
            if (serializedSize == 0) {
                this.f2449s = null;
                this.f2451u = null;
                return -1;
            }
            if (i3 >= serializedSize) {
                Logger logger = AbstractC6269w.f24289d;
                C6265u c6265u = new C6265u(bArr, i2, serializedSize);
                this.f2449s.writeTo(c6265u);
                if (c6265u.m12016b0() == 0) {
                    this.f2449s = null;
                    this.f2451u = null;
                    return serializedSize;
                }
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            this.f2451u = new ByteArrayInputStream(this.f2449s.toByteArray());
            this.f2449s = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f2451u;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i2, i3);
        }
        return -1;
    }
}
