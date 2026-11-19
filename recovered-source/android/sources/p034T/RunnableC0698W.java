package p034T;

/* JADX INFO: renamed from: T.W */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0698W implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f1605s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ int f1606t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C0707Z f1607u;

    public /* synthetic */ RunnableC0698W(C0707Z c0707z, int i2, int i3) {
        this.f1605s = i3;
        this.f1607u = c0707z;
        this.f1606t = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1605s) {
            case 0:
                this.f1607u.f1646c.mo1544f(this.f1606t);
                break;
            case 1:
                this.f1607u.f1646c.mo1545g(this.f1606t);
                break;
            default:
                this.f1607u.f1646c.mo1541c(this.f1606t);
                break;
        }
    }
}
