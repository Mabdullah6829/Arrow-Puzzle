package p044a0;

import java.util.concurrent.ScheduledExecutorService;
import p001B.AbstractC0076b;
import p001B.C0087m;
import p030R.AbstractC0522D;
import p030R.AbstractC0536S;
import p030R.AbstractC0558h;
import p030R.C0533O;
import p030R.EnumC0578r;
import p030R.ExecutorC0517A0;

/* JADX INFO: renamed from: a0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0879a extends AbstractC0558h {
    @Override // p030R.AbstractC0558h
    /* JADX INFO: renamed from: a */
    public AbstractC0522D mo1295a(C0533O c0533o) {
        return mo1806l().mo1295a(c0533o);
    }

    @Override // p030R.AbstractC0558h
    /* JADX INFO: renamed from: b */
    public final AbstractC0558h mo1296b() {
        return mo1806l().mo1296b();
    }

    @Override // p030R.AbstractC0558h
    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService mo1297c() {
        return mo1806l().mo1297c();
    }

    @Override // p030R.AbstractC0558h
    /* JADX INFO: renamed from: d */
    public final ExecutorC0517A0 mo1298d() {
        return mo1806l().mo1298d();
    }

    @Override // p030R.AbstractC0558h
    /* JADX INFO: renamed from: j */
    public final void mo1303j() {
        mo1806l().mo1303j();
    }

    @Override // p030R.AbstractC0558h
    /* JADX INFO: renamed from: k */
    public void mo1304k(EnumC0578r enumC0578r, AbstractC0536S abstractC0536S) {
        mo1806l().mo1304k(enumC0578r, abstractC0536S);
    }

    /* JADX INFO: renamed from: l */
    public abstract AbstractC0558h mo1806l();

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m158b(mo1806l(), "delegate");
        return c0087mM143s.toString();
    }
}
