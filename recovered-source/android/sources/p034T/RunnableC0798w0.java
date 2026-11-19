package p034T;

/* JADX INFO: renamed from: T.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0798w0 implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ C0804y0 f2074s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ boolean f2075t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C0643D0 f2076u;

    public RunnableC0798w0(C0643D0 c0643d0, C0804y0 c0804y0, boolean z) {
        this.f2076u = c0643d0;
        this.f2074s = c0804y0;
        this.f2075t = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2076u.f1431t.m1664a(this.f2074s, this.f2075t);
    }
}
