package p034T;

import java.util.logging.Level;
import java.util.logging.Logger;
import p030R.EnumC0578r;

/* JADX INFO: renamed from: T.Q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0682Q0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0720c1 f1526a;

    public C0682Q0(C0720c1 c0720c1) {
        this.f1526a = c0720c1;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Logger logger = C0720c1.f1736d0;
        Level level = Level.SEVERE;
        StringBuilder sb = new StringBuilder("[");
        C0720c1 c0720c1 = this.f1526a;
        sb.append(c0720c1.f1770a);
        sb.append("] Uncaught exception in the SynchronizationContext. Panic!");
        logger.log(level, sb.toString(), th);
        if (c0720c1.f1798z) {
            return;
        }
        c0720c1.f1798z = true;
        c0720c1.m1602A(true);
        c0720c1.m1606F(false);
        C0679P0 c0679p0 = new C0679P0(th);
        c0720c1.f1797y = c0679p0;
        c0720c1.f1748E.m1567h(c0679p0);
        c0720c1.f1760Q.m1583s(null);
        c0720c1.f1758O.mo1299f(4, "PANIC! Entering TRANSIENT_FAILURE");
        c0720c1.f1790r.m1518b(EnumC0578r.f1234u);
    }
}
