package p034T;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001B.C0086l;
import p030R.AbstractC0560i;
import p030R.C0586v;
import p030R.C0589w0;
import p049b0.AbstractC1886b;

/* JADX INFO: renamed from: T.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0797w extends AbstractRunnableC0663K {

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ int f2072u = 0;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f2073v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0797w(C0705Y0 c0705y0, C0586v c0586v) {
        super(c0586v, 0);
        this.f2073v = c0705y0;
    }

    @Override // p034T.AbstractRunnableC0663K
    /* JADX INFO: renamed from: b */
    public final void mo1520b() {
        List list;
        switch (this.f2072u) {
            case 0:
                C0086l c0086l = (C0086l) this.f2073v;
                AbstractC1886b.m2715c();
                try {
                    AbstractC1886b.m2713a();
                    AbstractC1886b.f2862a.getClass();
                    if (((C0589w0) c0086l.f113u) == null) {
                        try {
                            ((AbstractC0560i) c0086l.f112t).onReady();
                        } catch (Throwable th) {
                            C0589w0 c0589w0M1354g = C0589w0.f1276f.m1353f(th).m1354g("Failed to call onReady.");
                            c0086l.f113u = c0589w0M1354g;
                            ((C0803y) c0086l.f114v).f2103i.mo1548j(c0589w0M1354g);
                        }
                        break;
                    }
                    AbstractC1886b.f2862a.getClass();
                    return;
                } catch (Throwable th2) {
                    try {
                        AbstractC1886b.f2862a.getClass();
                        break;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            case 1:
                ((C0705Y0) this.f2073v).m1576c();
                return;
            default:
                C0686S c0686s = (C0686S) this.f2073v;
                c0686s.getClass();
                List arrayList = new ArrayList();
                while (true) {
                    synchronized (c0686s) {
                        try {
                            if (c0686s.f1566c.isEmpty()) {
                                c0686s.f1566c = null;
                                c0686s.f1565b = true;
                                return;
                            } else {
                                list = c0686s.f1566c;
                                c0686s.f1566c = arrayList;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    list.clear();
                    arrayList = list;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0797w(C0705Y0 c0705y0, C0686S c0686s) {
        super(c0705y0.f1630c, 0);
        this.f2073v = c0686s;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0797w(C0086l c0086l) {
        super(((C0803y) c0086l.f114v).f2099e, 0);
        this.f2073v = c0086l;
    }
}
