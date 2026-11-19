package p033S0;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import kotlin.jvm.internal.AbstractC6452k;
import p091y0.AbstractC6571a;

/* JADX INFO: renamed from: S0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0608b {
    /* JADX INFO: renamed from: a */
    public static final boolean m1368a(byte[] a2, int i2, byte[] b, int i3, int i4) {
        AbstractC6452k.m12181e(a2, "a");
        AbstractC6452k.m12181e(b, "b");
        for (int i5 = 0; i5 < i4; i5++) {
            if (a2[i5 + i2] != b[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final C0629w m1369b(InterfaceC0603C interfaceC0603C) {
        AbstractC6452k.m12181e(interfaceC0603C, "<this>");
        return new C0629w(interfaceC0603C);
    }

    /* JADX INFO: renamed from: c */
    public static final void m1370c(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    /* JADX INFO: renamed from: d */
    public static C0616j m1371d(String str) {
        AbstractC6452k.m12181e(str, "<this>");
        byte[] bytes = str.getBytes(AbstractC6571a.f24799a);
        AbstractC6452k.m12180d(bytes, "this as java.lang.String).getBytes(charset)");
        C0616j c0616j = new C0616j(bytes);
        c0616j.f1346u = str;
        return c0616j;
    }

    /* JADX INFO: renamed from: e */
    public static final C0609c m1372e(Socket socket) throws IOException {
        int i2 = AbstractC0626t.f1370a;
        C0602B c0602b = new C0602B(socket);
        OutputStream outputStream = socket.getOutputStream();
        AbstractC6452k.m12180d(outputStream, "getOutputStream()");
        return new C0609c(c0602b, new C0609c(outputStream, c0602b));
    }

    /* JADX INFO: renamed from: f */
    public static final C0610d m1373f(Socket socket) throws IOException {
        int i2 = AbstractC0626t.f1370a;
        C0602B c0602b = new C0602B(socket);
        InputStream inputStream = socket.getInputStream();
        AbstractC6452k.m12180d(inputStream, "getInputStream()");
        return new C0610d(0, c0602b, new C0610d(1, inputStream, c0602b));
    }
}
