package p035T0;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC6452k;
import p033S0.C0613g;
import p033S0.InterfaceC0603C;

/* JADX INFO: renamed from: T0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0813e implements InterfaceC0603C {

    /* JADX INFO: renamed from: s */
    public final InterfaceC0603C f2127s;

    /* JADX INFO: renamed from: t */
    public final long f2128t;

    /* JADX INFO: renamed from: u */
    public final boolean f2129u;

    /* JADX INFO: renamed from: v */
    public long f2130v;

    public C0813e(InterfaceC0603C interfaceC0603C, long j2, boolean z) {
        this.f2127s = interfaceC0603C;
        this.f2128t = j2;
        this.f2129u = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f2127s.close();
    }

    @Override // p033S0.InterfaceC0603C
    /* JADX INFO: renamed from: m */
    public final long mo1359m(C0613g sink, long j2) throws IOException {
        AbstractC6452k.m12181e(sink, "sink");
        long j3 = this.f2130v;
        long j4 = this.f2128t;
        if (j3 > j4) {
            j2 = 0;
        } else if (this.f2129u) {
            long j5 = j4 - j3;
            if (j5 == 0) {
                return -1L;
            }
            j2 = Math.min(j2, j5);
        }
        long jMo1359m = this.f2127s.mo1359m(sink, j2);
        if (jMo1359m != -1) {
            this.f2130v += jMo1359m;
        }
        long j6 = this.f2130v;
        if ((j6 >= j4 || jMo1359m != -1) && j6 <= j4) {
            return jMo1359m;
        }
        if (jMo1359m > 0 && j6 > j4) {
            long j7 = sink.f1342t - (j6 - j4);
            C0613g c0613g = new C0613g();
            while (sink.mo1359m(c0613g, 8192L) != -1) {
            }
            sink.mo1356s(c0613g, j7);
            c0613g.m1382J(c0613g.f1342t);
        }
        throw new IOException("expected " + j4 + " bytes but got " + this.f2130v);
    }

    public final String toString() {
        return C0813e.class.getSimpleName() + '(' + this.f2127s + ')';
    }
}
