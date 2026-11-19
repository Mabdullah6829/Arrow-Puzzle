package p034T;

import java.util.ArrayList;
import java.util.List;
import p001B.C0092r;
import p030R.C0559h0;
import p030R.C0589w0;

/* JADX INFO: renamed from: T.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C0704Y implements InterfaceC0636B {

    /* JADX INFO: renamed from: s */
    public final InterfaceC0636B f1624s;

    /* JADX INFO: renamed from: t */
    public volatile boolean f1625t;

    /* JADX INFO: renamed from: u */
    public List f1626u = new ArrayList();

    public C0704Y(InterfaceC0636B interfaceC0636B) {
        this.f1624s = interfaceC0636B;
    }

    @Override // p034T.InterfaceC0636B
    /* JADX INFO: renamed from: a */
    public final void mo148a(C0589w0 c0589w0, EnumC0633A enumC0633A, C0559h0 c0559h0) {
        m1573e(new RunnableC0710a(this, c0589w0, enumC0633A, c0559h0, 1));
    }

    @Override // p034T.InterfaceC0636B
    /* JADX INFO: renamed from: b */
    public final void mo149b(C0559h0 c0559h0) {
        m1573e(new RunnableC0666L(12, this, c0559h0));
    }

    @Override // p034T.InterfaceC0636B
    /* JADX INFO: renamed from: c */
    public final void mo150c(C0092r c0092r) {
        if (this.f1625t) {
            this.f1624s.mo150c(c0092r);
        } else {
            m1573e(new RunnableC0666L(11, this, c0092r));
        }
    }

    @Override // p034T.InterfaceC0636B
    /* JADX INFO: renamed from: d */
    public final void mo151d() {
        if (this.f1625t) {
            this.f1624s.mo151d();
        } else {
            m1573e(new RunnableC0681Q(this, 1));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1573e(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f1625t) {
                    runnable.run();
                } else {
                    this.f1626u.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
