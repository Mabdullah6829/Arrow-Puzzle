package p034T;

import p030R.C0549c0;

/* JADX INFO: renamed from: T.X1 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0703X1 implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f1621s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C0709Z1 f1622t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C0793u2 f1623u;

    public /* synthetic */ RunnableC0703X1(C0793u2 c0793u2, C0709Z1 c0709z1, int i2) {
        this.f1621s = i2;
        this.f1623u = c0793u2;
        this.f1622t = c0709z1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f1621s;
        C0793u2 c0793u2 = this.f1623u;
        switch (i2) {
            case 0:
                ((C0684R0) c0793u2.f2061u).f1538b.execute(new RunnableC0681Q(this, 9));
                break;
            default:
                C0684R0 c0684r0 = (C0684R0) c0793u2.f2061u;
                C0549c0 c0549c0 = C0684R0.f1529E;
                c0684r0.m1555r(this.f1622t);
                break;
        }
    }
}
