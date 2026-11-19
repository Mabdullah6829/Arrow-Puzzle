package p034T;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;
import p030R.C0589w0;

/* JADX INFO: renamed from: T.X0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0702X0 implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f1619s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C0708Z0 f1620t;

    public /* synthetic */ RunnableC0702X0(C0708Z0 c0708z0, int i2) {
        this.f1619s = i2;
        this.f1620t = c0708z0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        switch (this.f1619s) {
            case 0:
                C0708Z0 c0708z0 = this.f1620t;
                C0720c1 c0720c1 = c0708z0.f1656d;
                AtomicReference atomicReference = c0708z0.f1653a;
                if (c0720c1.f1745B == null) {
                    if (atomicReference.get() == C0720c1.f1742j0) {
                        atomicReference.set(null);
                    }
                    c0708z0.f1656d.f1749F.m1614a(C0720c1.f1739g0);
                    return;
                }
                return;
            case 1:
                if (this.f1620t.f1653a.get() == C0720c1.f1742j0) {
                    this.f1620t.f1653a.set(null);
                }
                LinkedHashSet linkedHashSet = this.f1620t.f1656d.f1745B;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        ((C0705Y0) it.next()).cancel("Channel is forcefully shutdown", null);
                    }
                }
                C0742i c0742i = this.f1620t.f1656d.f1749F;
                C0589w0 c0589w0 = C0720c1.f1738f0;
                c0742i.m1614a(c0589w0);
                synchronized (c0742i.f1886s) {
                    arrayList = new ArrayList((HashSet) c0742i.f1887t);
                    break;
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((InterfaceC0806z) obj).mo1548j(c0589w0);
                }
                ((C0720c1) c0742i.f1889v).f1748E.mo1564e(c0589w0);
                return;
            default:
                this.f1620t.f1656d.m1603B();
                return;
        }
    }
}
