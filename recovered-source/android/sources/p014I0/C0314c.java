package p014I0;

import p000A0.C0037g;
import p000A0.C0039h;
import p000A0.InterfaceC0035f;
import p000A0.InterfaceC0064t0;
import p001B.C0084j;
import p010F0.AbstractC0232r;
import p057d0.C6289k;
import p062g0.InterfaceC6353h;
import p078p0.InterfaceC6503q;

/* JADX INFO: renamed from: I0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0314c implements InterfaceC0035f, InterfaceC0064t0 {

    /* JADX INFO: renamed from: s */
    public final C0039h f630s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C0315d f631t;

    public C0314c(C0315d c0315d, C0039h c0039h) {
        this.f631t = c0315d;
        this.f630s = c0039h;
    }

    @Override // p000A0.InterfaceC0064t0
    /* JADX INFO: renamed from: a */
    public final void mo78a(AbstractC0232r abstractC0232r, int i2) {
        this.f630s.mo78a(abstractC0232r, i2);
    }

    @Override // p000A0.InterfaceC0035f
    /* JADX INFO: renamed from: f */
    public final C0084j mo71f(Object obj, InterfaceC6503q interfaceC6503q) {
        C0315d c0315d = this.f631t;
        C0037g c0037g = new C0037g(c0315d, this);
        C0084j c0084jMo71f = this.f630s.mo71f((C6289k) obj, c0037g);
        if (c0084jMo71f != null) {
            C0315d.f632g.set(c0315d, null);
        }
        return c0084jMo71f;
    }

    @Override // p062g0.InterfaceC6348c
    public final InterfaceC6353h getContext() {
        return this.f630s.f52w;
    }

    @Override // p000A0.InterfaceC0035f
    /* JADX INFO: renamed from: j */
    public final void mo72j(Object obj) {
        this.f630s.mo72j(obj);
    }

    @Override // p062g0.InterfaceC6348c
    public final void resumeWith(Object obj) {
        this.f630s.resumeWith(obj);
    }
}
