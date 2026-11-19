package p034T;

/* JADX INFO: renamed from: T.X */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0701X implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f1617s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C0707Z f1618t;

    public /* synthetic */ RunnableC0701X(C0707Z c0707z, int i2) {
        this.f1617s = i2;
        this.f1618t = c0707z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1617s) {
            case 0:
                this.f1618t.f1646c.mo1551m();
                break;
            case 1:
                this.f1618t.m1579o();
                break;
            case 2:
                this.f1618t.f1646c.flush();
                break;
            default:
                this.f1618t.f1646c.mo1542d();
                break;
        }
    }
}
