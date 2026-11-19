package p034T;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import p030R.AbstractC0541X;

/* JADX INFO: renamed from: T.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0732f1 extends AbstractC0743i0 {

    /* JADX INFO: renamed from: c */
    public static final ReferenceQueue f1859c = new ReferenceQueue();

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f1860d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public static final Logger f1861e = Logger.getLogger(C0732f1.class.getName());

    /* JADX INFO: renamed from: b */
    public final C0728e1 f1862b;

    public C0732f1(C0720c1 c0720c1) {
        super(c0720c1);
        this.f1862b = new C0728e1(this, c0720c1, f1859c, f1860d);
    }

    @Override // p030R.AbstractC0541X
    /* JADX INFO: renamed from: v */
    public final AbstractC0541X mo1280v() {
        C0728e1 c0728e1 = this.f1862b;
        if (!c0728e1.f1848e.getAndSet(true)) {
            c0728e1.clear();
        }
        C0720c1 c0720c1 = this.f1890a;
        c0720c1.m1605E();
        return c0720c1;
    }

    @Override // p030R.AbstractC0541X
    /* JADX INFO: renamed from: w */
    public final AbstractC0541X mo1281w() {
        C0728e1 c0728e1 = this.f1862b;
        if (!c0728e1.f1848e.getAndSet(true)) {
            c0728e1.clear();
        }
        C0720c1 c0720c1 = this.f1890a;
        c0720c1.mo1281w();
        return c0720c1;
    }
}
