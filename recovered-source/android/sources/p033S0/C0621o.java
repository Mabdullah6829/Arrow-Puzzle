package p033S0;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC6452k;
import p035T0.C0813e;

/* JADX INFO: renamed from: S0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0621o implements InterfaceC0603C {

    /* JADX INFO: renamed from: s */
    public final C0629w f1361s;

    /* JADX INFO: renamed from: t */
    public final Inflater f1362t;

    /* JADX INFO: renamed from: u */
    public int f1363u;

    /* JADX INFO: renamed from: v */
    public boolean f1364v;

    public C0621o(C0813e c0813e, Inflater inflater) {
        this.f1361s = AbstractC0608b.m1369b(c0813e);
        this.f1362t = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1364v) {
            return;
        }
        this.f1362t.end();
        this.f1364v = true;
        this.f1361s.close();
    }

    @Override // p033S0.InterfaceC0603C
    /* JADX INFO: renamed from: m */
    public final long mo1359m(C0613g sink, long j2) throws IOException {
        long j3;
        AbstractC6452k.m12181e(sink, "sink");
        while (j2 >= 0) {
            if (this.f1364v) {
                throw new IllegalStateException("closed");
            }
            C0629w c0629w = this.f1361s;
            Inflater inflater = this.f1362t;
            if (j2 == 0) {
                j3 = 0;
            } else {
                try {
                    C0630x c0630xM1385M = sink.m1385M(1);
                    int iMin = (int) Math.min(j2, 8192 - c0630xM1385M.f1381c);
                    if (inflater.needsInput() && !c0629w.m1462c()) {
                        C0630x c0630x = c0629w.f1377t.f1341s;
                        AbstractC6452k.m12178b(c0630x);
                        int i2 = c0630x.f1381c;
                        int i3 = c0630x.f1380b;
                        int i4 = i2 - i3;
                        this.f1363u = i4;
                        inflater.setInput(c0630x.f1379a, i3, i4);
                    }
                    int iInflate = inflater.inflate(c0630xM1385M.f1379a, c0630xM1385M.f1381c, iMin);
                    int i5 = this.f1363u;
                    if (i5 != 0) {
                        int remaining = i5 - inflater.getRemaining();
                        this.f1363u -= remaining;
                        c0629w.m1471r(remaining);
                    }
                    if (iInflate > 0) {
                        c0630xM1385M.f1381c += iInflate;
                        j3 = iInflate;
                        sink.f1342t += j3;
                    } else {
                        if (c0630xM1385M.f1380b == c0630xM1385M.f1381c) {
                            sink.f1341s = c0630xM1385M.m1472a();
                            AbstractC0631y.m1476a(c0630xM1385M);
                        }
                        j3 = 0;
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            if (j3 > 0) {
                return j3;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (c0629w.m1462c()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
    }
}
