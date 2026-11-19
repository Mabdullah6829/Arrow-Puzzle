package p034T;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.protobuf.C6161A;
import com.google.protobuf.InterfaceC6262s0;
import io.grpc.StatusRuntimeException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Locale;
import p001B.AbstractC0076b;
import p030R.AbstractC0570n;
import p030R.C0572o;
import p030R.C0589w0;
import p030R.InterfaceC0574p;
import p033S0.C0612f;
import p036U.C0840u;
import p041Y.AbstractC0875c;
import p041Y.C0873a;
import p049b0.C1887c;

/* JADX INFO: renamed from: T.o1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0768o1 implements InterfaceC0747j0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0718c f1974a;

    /* JADX INFO: renamed from: c */
    public C0840u f1976c;

    /* JADX INFO: renamed from: h */
    public final C1887c f1981h;

    /* JADX INFO: renamed from: i */
    public final C0777q2 f1982i;

    /* JADX INFO: renamed from: j */
    public boolean f1983j;

    /* JADX INFO: renamed from: k */
    public int f1984k;

    /* JADX INFO: renamed from: m */
    public long f1986m;

    /* JADX INFO: renamed from: b */
    public int f1975b = -1;

    /* JADX INFO: renamed from: d */
    public InterfaceC0574p f1977d = C0572o.f1219t;

    /* JADX INFO: renamed from: e */
    public boolean f1978e = true;

    /* JADX INFO: renamed from: f */
    public final C0612f f1979f = new C0612f(this, 2);

    /* JADX INFO: renamed from: g */
    public final ByteBuffer f1980g = ByteBuffer.allocate(5);

    /* JADX INFO: renamed from: l */
    public int f1985l = -1;

    public C0768o1(AbstractC0718c abstractC0718c, C1887c c1887c, C0777q2 c0777q2) {
        this.f1974a = abstractC0718c;
        this.f1981h = c1887c;
        this.f1982i = c0777q2;
    }

    /* JADX INFO: renamed from: i */
    public static int m1640i(C0873a c0873a, OutputStream outputStream) throws IOException {
        InterfaceC6262s0 interfaceC6262s0 = c0873a.f2449s;
        if (interfaceC6262s0 != null) {
            int serializedSize = interfaceC6262s0.getSerializedSize();
            c0873a.f2449s.writeTo(outputStream);
            c0873a.f2449s = null;
            return serializedSize;
        }
        ByteArrayInputStream byteArrayInputStream = c0873a.f2451u;
        if (byteArrayInputStream == null) {
            return 0;
        }
        C6161A c6161a = AbstractC0875c.f2456a;
        AbstractC0076b.m133h(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j2 = 0;
        while (true) {
            int i2 = byteArrayInputStream.read(bArr);
            if (i2 == -1) {
                int i3 = (int) j2;
                c0873a.f2451u = null;
                return i3;
            }
            outputStream.write(bArr, 0, i2);
            j2 += (long) i2;
        }
    }

    @Override // p034T.InterfaceC0747j0
    /* JADX INFO: renamed from: a */
    public final InterfaceC0747j0 mo1311a(InterfaceC0574p interfaceC0574p) {
        this.f1977d = interfaceC0574p;
        return this;
    }

    @Override // p034T.InterfaceC0747j0
    /* JADX INFO: renamed from: b */
    public final InterfaceC0747j0 mo1312b(boolean z) {
        this.f1978e = z;
        return this;
    }

    @Override // p034T.InterfaceC0747j0
    /* JADX INFO: renamed from: c */
    public final void mo1313c(int i2) {
        AbstractC0076b.m139n(this.f1975b == -1, "max size already set");
        this.f1975b = i2;
    }

    @Override // p034T.InterfaceC0747j0
    public final void close() {
        if (this.f1983j) {
            return;
        }
        this.f1983j = true;
        C0840u c0840u = this.f1976c;
        if (c0840u != null && c0840u.f2304c == 0) {
            this.f1976c = null;
        }
        m1641e(true, true);
    }

    @Override // p034T.InterfaceC0747j0
    /* JADX INFO: renamed from: d */
    public final void mo1314d(C0873a c0873a) {
        if (this.f1983j) {
            throw new IllegalStateException("Framer already closed");
        }
        this.f1984k++;
        int i2 = this.f1985l + 1;
        this.f1985l = i2;
        this.f1986m = 0L;
        C0777q2 c0777q2 = this.f1982i;
        AbstractC0570n[] abstractC0570nArr = c0777q2.f2019a;
        AbstractC0570n[] abstractC0570nArr2 = c0777q2.f2019a;
        int i3 = 0;
        for (AbstractC0570n abstractC0570n : abstractC0570nArr) {
            abstractC0570n.mo1329i(i2);
        }
        boolean z = this.f1978e && this.f1977d != C0572o.f1219t;
        try {
            int iAvailable = c0873a.available();
            int iM1645j = (iAvailable == 0 || !z) ? m1645j(c0873a, iAvailable) : m1643g(c0873a);
            if (iAvailable != -1 && iM1645j != iAvailable) {
                throw new StatusRuntimeException(C0589w0.f1283m.m1354g(AbstractC1456a.m2443j(iM1645j, iAvailable, "Message length inaccurate ", " != ")));
            }
            long j2 = iM1645j;
            for (AbstractC0570n abstractC0570n2 : abstractC0570nArr2) {
                abstractC0570n2.mo1331k(j2);
            }
            long j3 = this.f1986m;
            for (AbstractC0570n abstractC0570n3 : abstractC0570nArr2) {
                abstractC0570n3.mo1332l(j3);
            }
            int i4 = this.f1985l;
            long j4 = this.f1986m;
            AbstractC0570n[] abstractC0570nArr3 = c0777q2.f2019a;
            int length = abstractC0570nArr3.length;
            while (i3 < length) {
                long j5 = j2;
                abstractC0570nArr3[i3].mo1330j(i4, j4, j5);
                i3++;
                j2 = j5;
            }
        } catch (StatusRuntimeException e) {
            throw e;
        } catch (IOException e2) {
            throw new StatusRuntimeException(C0589w0.f1283m.m1354g("Failed to frame message").m1353f(e2));
        } catch (RuntimeException e3) {
            throw new StatusRuntimeException(C0589w0.f1283m.m1354g("Failed to frame message").m1353f(e3));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1641e(boolean z, boolean z2) {
        C0840u c0840u = this.f1976c;
        this.f1976c = null;
        this.f1974a.m1592v(c0840u, z, z2, this.f1984k);
        this.f1984k = 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m1642f(C0764n1 c0764n1, boolean z) {
        ArrayList arrayList = c0764n1.f1965s;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            i2 += ((C0840u) obj).f2304c;
        }
        int i4 = this.f1975b;
        if (i4 >= 0 && i2 > i4) {
            C0589w0 c0589w0 = C0589w0.f1281k;
            Locale locale = Locale.US;
            throw new StatusRuntimeException(c0589w0.m1354g("message too large " + i2 + " > " + i4));
        }
        ByteBuffer byteBuffer = this.f1980g;
        byteBuffer.clear();
        byteBuffer.put(z ? (byte) 1 : (byte) 0).putInt(i2);
        this.f1981h.getClass();
        C0840u c0840uM2717c = C1887c.m2717c(5);
        c0840uM2717c.m1737a(byteBuffer.array(), 0, byteBuffer.position());
        if (i2 == 0) {
            this.f1976c = c0840uM2717c;
            return;
        }
        int i5 = this.f1984k - 1;
        AbstractC0718c abstractC0718c = this.f1974a;
        abstractC0718c.m1592v(c0840uM2717c, false, false, i5);
        this.f1984k = 1;
        for (int i6 = 0; i6 < arrayList.size() - 1; i6++) {
            abstractC0718c.m1592v((C0840u) arrayList.get(i6), false, false, 0);
        }
        this.f1976c = (C0840u) arrayList.get(arrayList.size() - 1);
        this.f1986m = i2;
    }

    @Override // p034T.InterfaceC0747j0
    public final void flush() {
        C0840u c0840u = this.f1976c;
        if (c0840u == null || c0840u.f2304c <= 0) {
            return;
        }
        m1641e(false, true);
    }

    /* JADX INFO: renamed from: g */
    public final int m1643g(C0873a c0873a) throws IOException {
        C0764n1 c0764n1 = new C0764n1(this);
        OutputStream outputStreamMo1336c = this.f1977d.mo1336c(c0764n1);
        try {
            int iM1640i = m1640i(c0873a, outputStreamMo1336c);
            outputStreamMo1336c.close();
            int i2 = this.f1975b;
            if (i2 < 0 || iM1640i <= i2) {
                m1642f(c0764n1, true);
                return iM1640i;
            }
            C0589w0 c0589w0 = C0589w0.f1281k;
            Locale locale = Locale.US;
            throw new StatusRuntimeException(c0589w0.m1354g("message too large " + iM1640i + " > " + i2));
        } catch (Throwable th) {
            outputStreamMo1336c.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m1644h(byte[] bArr, int i2, int i3) {
        while (i3 > 0) {
            C0840u c0840u = this.f1976c;
            if (c0840u != null && c0840u.f2303b == 0) {
                m1641e(false, false);
            }
            if (this.f1976c == null) {
                this.f1981h.getClass();
                this.f1976c = C1887c.m2717c(i3);
            }
            int iMin = Math.min(i3, this.f1976c.f2303b);
            this.f1976c.m1737a(bArr, i2, iMin);
            i2 += iMin;
            i3 -= iMin;
        }
    }

    @Override // p034T.InterfaceC0747j0
    public final boolean isClosed() {
        return this.f1983j;
    }

    /* JADX INFO: renamed from: j */
    public final int m1645j(C0873a c0873a, int i2) throws IOException {
        if (i2 == -1) {
            C0764n1 c0764n1 = new C0764n1(this);
            int iM1640i = m1640i(c0873a, c0764n1);
            m1642f(c0764n1, false);
            return iM1640i;
        }
        this.f1986m = i2;
        int i3 = this.f1975b;
        if (i3 >= 0 && i2 > i3) {
            C0589w0 c0589w0 = C0589w0.f1281k;
            Locale locale = Locale.US;
            throw new StatusRuntimeException(c0589w0.m1354g("message too large " + i2 + " > " + i3));
        }
        ByteBuffer byteBuffer = this.f1980g;
        byteBuffer.clear();
        byteBuffer.put((byte) 0).putInt(i2);
        if (this.f1976c == null) {
            int iPosition = byteBuffer.position() + i2;
            this.f1981h.getClass();
            this.f1976c = C1887c.m2717c(iPosition);
        }
        m1644h(byteBuffer.array(), 0, byteBuffer.position());
        return m1640i(c0873a, this.f1979f);
    }
}
