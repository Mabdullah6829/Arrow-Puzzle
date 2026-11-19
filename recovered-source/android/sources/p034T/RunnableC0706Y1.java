package p034T;

import p001B.C0086l;
import p030R.C0559h0;
import p030R.C0589w0;

/* JADX INFO: renamed from: T.Y1 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0706Y1 implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f1642s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C0793u2 f1643t;

    public /* synthetic */ RunnableC0706Y1(C0793u2 c0793u2, int i2) {
        this.f1642s = i2;
        this.f1643t = c0793u2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1642s) {
            case 0:
                C0684R0 c0684r0 = (C0684R0) this.f1643t.f2061u;
                c0684r0.f1562z = true;
                InterfaceC0636B interfaceC0636B = c0684r0.f1557u;
                C0086l c0086l = c0684r0.f1555s;
                interfaceC0636B.mo148a((C0589w0) c0086l.f112t, (EnumC0633A) c0086l.f113u, (C0559h0) c0086l.f114v);
                break;
            default:
                C0684R0 c0684r1 = (C0684R0) this.f1643t.f2061u;
                if (!c0684r1.f1562z) {
                    c0684r1.f1557u.mo151d();
                }
                break;
        }
    }
}
