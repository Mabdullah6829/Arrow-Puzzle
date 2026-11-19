package p034T;

import java.util.logging.Level;
import java.util.logging.Logger;
import p001B.AbstractC0072B;

/* JADX INFO: renamed from: T.L0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0667L0 implements Runnable {

    /* JADX INFO: renamed from: t */
    public static final Logger f1498t = Logger.getLogger(RunnableC0667L0.class.getName());

    /* JADX INFO: renamed from: s */
    public final Runnable f1499s;

    public RunnableC0667L0(Runnable runnable) {
        this.f1499s = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f1499s;
        try {
            runnable.run();
        } catch (Throwable th) {
            f1498t.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            Object obj = AbstractC0072B.f99a;
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new AssertionError(th);
            }
            throw ((Error) th);
        }
    }

    public final String toString() {
        return "LogExceptionRunnable(" + this.f1499s + ")";
    }
}
