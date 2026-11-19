package p012H0;

import p000A0.AbstractC0063t;
import p010F0.AbstractC0215a;
import p010F0.C0228n;

/* JADX INFO: renamed from: H0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0302e extends AbstractC0305h {

    /* JADX INFO: renamed from: t */
    public static final C0302e f610t;

    static {
        int i2 = AbstractC0308k.f618c;
        int i3 = AbstractC0308k.f619d;
        long j2 = AbstractC0308k.f620e;
        String str = AbstractC0308k.f616a;
        C0302e c0302e = new C0302e();
        c0302e.f612s = new ExecutorC0300c(i2, i3, j2, str);
        f610t = c0302e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p000A0.AbstractC0063t
    public final AbstractC0063t limitedParallelism(int i2, String str) {
        AbstractC0215a.m295a(i2);
        if (i2 >= AbstractC0308k.f618c) {
            return str != null ? new C0228n(this, str) : this;
        }
        return super.limitedParallelism(i2, str);
    }

    @Override // p000A0.AbstractC0063t
    public final String toString() {
        return "Dispatchers.Default";
    }
}
