package p034T;

import p001B.AbstractC0076b;
import p001B.C0087m;
import p030R.C0546b;
import p030R.C0588w;
import p030R.C0589w0;
import p030R.C0592y;
import p030R.InterfaceC0574p;
import p041Y.C0873a;

/* JADX INFO: renamed from: T.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0801x0 implements InterfaceC0806z {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0806z f2089a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0804y0 f2090b;

    public C0801x0(C0804y0 c0804y0, InterfaceC0806z interfaceC0806z) {
        this.f2090b = c0804y0;
        this.f2089a = interfaceC0806z;
    }

    @Override // p034T.InterfaceC0781r2
    /* JADX INFO: renamed from: a */
    public final void mo1539a(InterfaceC0574p interfaceC0574p) {
        this.f2089a.mo1539a(interfaceC0574p);
    }

    @Override // p034T.InterfaceC0781r2
    /* JADX INFO: renamed from: b */
    public final void mo1540b(boolean z) {
        this.f2089a.mo1540b(z);
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: c */
    public final void mo1541c(int i2) {
        this.f2089a.mo1541c(i2);
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: d */
    public final void mo1542d() {
        this.f2089a.mo1542d();
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: e */
    public final void mo1543e(C0783s0 c0783s0) {
        this.f2089a.mo1543e(c0783s0);
    }

    @Override // p034T.InterfaceC0781r2
    /* JADX INFO: renamed from: f */
    public final void mo1544f(int i2) {
        this.f2089a.mo1544f(i2);
    }

    @Override // p034T.InterfaceC0781r2
    public final void flush() {
        this.f2089a.flush();
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: g */
    public final void mo1545g(int i2) {
        this.f2089a.mo1545g(i2);
    }

    @Override // p034T.InterfaceC0806z
    public final C0546b getAttributes() {
        return this.f2089a.getAttributes();
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: h */
    public final void mo1546h(C0588w c0588w) {
        this.f2089a.mo1546h(c0588w);
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: i */
    public final void mo1547i(C0592y c0592y) {
        this.f2089a.mo1547i(c0592y);
    }

    @Override // p034T.InterfaceC0781r2
    public final boolean isReady() {
        return this.f2089a.isReady();
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: j */
    public final void mo1548j(C0589w0 c0589w0) {
        this.f2089a.mo1548j(c0589w0);
    }

    @Override // p034T.InterfaceC0781r2
    /* JADX INFO: renamed from: k */
    public final void mo1549k(C0873a c0873a) {
        this.f2089a.mo1549k(c0873a);
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: l */
    public final void mo1550l(InterfaceC0636B interfaceC0636B) {
        C0742i c0742i = this.f2090b.f2111b;
        ((InterfaceC0670M0) c0742i.f1887t).mo1516a();
        ((C0785s2) c0742i.f1886s).m1661e();
        this.f2089a.mo1550l(new C0793u2(2, this, interfaceC0636B));
    }

    @Override // p034T.InterfaceC0781r2
    /* JADX INFO: renamed from: m */
    public final void mo1551m() {
        this.f2089a.mo1551m();
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m158b(this.f2089a, "delegate");
        return c0087mM143s.toString();
    }
}
