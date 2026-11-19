package p012H0;

import p000A0.AbstractC0069y;
import p011H.AbstractC0271e0;

/* JADX INFO: renamed from: H0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0307j extends AbstractRunnableC0306i {

    /* JADX INFO: renamed from: u */
    public final Runnable f615u;

    public C0307j(Runnable runnable, long j2, boolean z) {
        super(z, j2);
        this.f615u = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f615u.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f615u;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0069y.m107f(runnable));
        sb.append(", ");
        sb.append(this.f613s);
        sb.append(", ");
        return AbstractC0271e0.m401i(sb, this.f614t ? "Blocking" : "Non-blocking", ']');
    }
}
