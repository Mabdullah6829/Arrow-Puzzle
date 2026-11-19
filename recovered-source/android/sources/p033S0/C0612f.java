package p033S0;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC6452k;
import p034T.C0768o1;

/* JADX INFO: renamed from: S0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0612f extends OutputStream {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f1339s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f1340t;

    public /* synthetic */ C0612f(Object obj, int i2) {
        this.f1339s = i2;
        this.f1340t = obj;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f1339s) {
            case 0:
                break;
            case 1:
                ((C0628v) this.f1340t).close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        switch (this.f1339s) {
            case 0:
                break;
            case 1:
                C0628v c0628v = (C0628v) this.f1340t;
                if (!c0628v.f1375u) {
                    c0628v.flush();
                }
                break;
            default:
                super.flush();
                break;
        }
    }

    public String toString() {
        switch (this.f1339s) {
            case 0:
                return ((C0613g) this.f1340t) + ".outputStream()";
            case 1:
                return ((C0628v) this.f1340t) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i2) throws IOException {
        int i3 = this.f1339s;
        Object obj = this.f1340t;
        switch (i3) {
            case 0:
                ((C0613g) obj).m1387O(i2);
                return;
            case 1:
                C0628v c0628v = (C0628v) obj;
                if (c0628v.f1375u) {
                    throw new IOException("closed");
                }
                c0628v.f1374t.m1387O((byte) i2);
                c0628v.m1457c();
                return;
            default:
                write(new byte[]{(byte) i2}, 0, 1);
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i2, int i3) throws IOException {
        switch (this.f1339s) {
            case 0:
                AbstractC6452k.m12181e(data, "data");
                ((C0613g) this.f1340t).write(data, i2, i3);
                return;
            case 1:
                AbstractC6452k.m12181e(data, "data");
                C0628v c0628v = (C0628v) this.f1340t;
                if (!c0628v.f1375u) {
                    c0628v.f1374t.write(data, i2, i3);
                    c0628v.m1457c();
                    return;
                }
                throw new IOException("closed");
            default:
                ((C0768o1) this.f1340t).m1644h(data, i2, i3);
                return;
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m1375c() {
    }

    /* JADX INFO: renamed from: e */
    private final void m1376e() {
    }
}
