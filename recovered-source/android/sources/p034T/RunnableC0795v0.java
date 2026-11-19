package p034T;

import java.util.ArrayList;
import p006D0.C0177l;
import p030R.C0589w0;
import p030R.EnumC0578r;

/* JADX INFO: renamed from: T.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0795v0 implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2065s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C0589w0 f2066t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C0643D0 f2067u;

    public /* synthetic */ RunnableC0795v0(C0643D0 c0643d0, C0589w0 c0589w0, int i2) {
        this.f2065s = i2;
        this.f2067u = c0643d0;
        this.f2066t = c0589w0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2065s) {
            case 0:
                EnumC0578r enumC0578r = this.f2067u.f1434w.f1238a;
                EnumC0578r enumC0578r2 = EnumC0578r.f1236w;
                if (enumC0578r != enumC0578r2) {
                    C0643D0 c0643d0 = this.f2067u;
                    c0643d0.f1435x = this.f2066t;
                    C0804y0 c0804y0 = c0643d0.f1433v;
                    C0643D0 c0643d1 = this.f2067u;
                    C0804y0 c0804y1 = c0643d1.f1432u;
                    c0643d1.f1433v = null;
                    C0643D0 c0643d2 = this.f2067u;
                    c0643d2.f1432u = null;
                    C0643D0.m1484f(c0643d2, enumC0578r2);
                    this.f2067u.f1423l.m1680d();
                    if (this.f2067u.f1430s.isEmpty()) {
                        C0643D0 c0643d3 = this.f2067u;
                        c0643d3.f1422k.execute(new RunnableC0791u0(c0643d3, 2));
                    }
                    C0643D0 c0643d4 = this.f2067u;
                    c0643d4.f1422k.m1237d();
                    C0177l c0177l = c0643d4.f1427p;
                    if (c0177l != null) {
                        c0177l.m271c();
                        c0643d4.f1427p = null;
                        c0643d4.f1425n = null;
                    }
                    C0177l c0177l2 = this.f2067u.f1428q;
                    if (c0177l2 != null) {
                        c0177l2.m271c();
                        this.f2067u.f1429r.mo1563b(this.f2066t);
                        C0643D0 c0643d5 = this.f2067u;
                        c0643d5.f1428q = null;
                        c0643d5.f1429r = null;
                    }
                    if (c0804y0 != null) {
                        c0804y0.mo1563b(this.f2066t);
                    }
                    if (c0804y1 != null) {
                        c0804y1.mo1563b(this.f2066t);
                    }
                    break;
                }
                break;
            default:
                ArrayList arrayList = new ArrayList(this.f2067u.f1430s);
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((InterfaceC0752k1) obj).mo1564e(this.f2066t);
                }
                break;
        }
    }
}
