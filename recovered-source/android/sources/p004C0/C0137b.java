package p004C0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0069y;
import p000A0.C0039h;
import p000A0.InterfaceC0064t0;
import p001B.C0084j;
import p006D0.C0172g;
import p010F0.AbstractC0232r;
import p010F0.AbstractC0233s;
import p011H.AbstractC0243G;
import p043a.AbstractC0878a;
import p064h0.EnumC6363a;

/* JADX INFO: renamed from: C0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0137b implements InterfaceC0064t0 {

    /* JADX INFO: renamed from: s */
    public Object f219s = AbstractC0140e.f248p;

    /* JADX INFO: renamed from: t */
    public C0039h f220t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C0138c f221u;

    public C0137b(C0138c c0138c) {
        this.f221u = c0138c;
    }

    @Override // p000A0.InterfaceC0064t0
    /* JADX INFO: renamed from: a */
    public final void mo78a(AbstractC0232r abstractC0232r, int i2) {
        C0039h c0039h = this.f220t;
        if (c0039h != null) {
            c0039h.mo78a(abstractC0232r, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m212b(C0172g c0172g) throws Throwable {
        C0146k c0146k;
        Boolean bool;
        C0146k c0146kM234o;
        Object obj = this.f219s;
        boolean z = true;
        if (obj == AbstractC0140e.f248p || obj == AbstractC0140e.f244l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0138c.f229y;
            C0138c c0138c = this.f221u;
            C0146k c0146k2 = (C0146k) atomicReferenceFieldUpdater.get(c0138c);
            while (!c0138c.m239u(true, C0138c.f224t.get(c0138c))) {
                long andIncrement = C0138c.f225u.getAndIncrement(c0138c);
                long j2 = AbstractC0140e.f234b;
                long j3 = andIncrement / j2;
                int i2 = (int) (andIncrement % j2);
                if (c0146k2.f466c != j3) {
                    C0146k c0146kM234o2 = c0138c.m234o(j3, c0146k2);
                    if (c0146kM234o2 == null) {
                        continue;
                    } else {
                        c0146k = c0146kM234o2;
                    }
                } else {
                    c0146k = c0146k2;
                }
                Object objM220D = c0138c.m220D(c0146k, i2, andIncrement, null);
                C0084j c0084j = AbstractC0140e.f245m;
                if (objM220D == c0084j) {
                    throw new IllegalStateException("unreachable");
                }
                C0084j c0084j2 = AbstractC0140e.f247o;
                if (objM220D == c0084j2) {
                    if (andIncrement < c0138c.m238s()) {
                        c0146k.m307a();
                    }
                    c0146k2 = c0146k;
                } else if (objM220D == AbstractC0140e.f246n) {
                    C0039h c0039hM108g = AbstractC0069y.m108g(AbstractC0878a.m1802m(c0172g));
                    try {
                        this.f220t = c0039hM108g;
                        try {
                            Object objM220D2 = c0138c.m220D(c0146k, i2, andIncrement, this);
                            if (objM220D2 != c0084j) {
                                if (objM220D2 == c0084j2) {
                                    if (andIncrement < c0138c.m238s()) {
                                        c0146k.m307a();
                                    }
                                    C0146k c0146k3 = (C0146k) C0138c.f229y.get(c0138c);
                                    while (true) {
                                        if (c0138c.m239u(true, C0138c.f224t.get(c0138c))) {
                                            C0039h c0039h = this.f220t;
                                            AbstractC6452k.m12178b(c0039h);
                                            this.f220t = null;
                                            this.f219s = AbstractC0140e.f244l;
                                            Throwable thM235p = c0138c.m235p();
                                            if (thM235p != null) {
                                                c0039h.resumeWith(AbstractC0243G.m372j(thM235p));
                                                break;
                                            }
                                            c0039h.resumeWith(Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = C0138c.f225u.getAndIncrement(c0138c);
                                        long j4 = AbstractC0140e.f234b;
                                        long j5 = andIncrement2 / j4;
                                        int i3 = (int) (andIncrement2 % j4);
                                        if (c0146k3.f466c != j5) {
                                            c0146kM234o = c0138c.m234o(j5, c0146k3);
                                            if (c0146kM234o == null) {
                                            }
                                        } else {
                                            c0146kM234o = c0146k3;
                                        }
                                        Object objM220D3 = c0138c.m220D(c0146kM234o, i3, andIncrement2, this);
                                        if (objM220D3 == AbstractC0140e.f245m) {
                                            mo78a(c0146kM234o, i3);
                                            break;
                                        }
                                        if (objM220D3 == AbstractC0140e.f247o) {
                                            if (andIncrement2 < c0138c.m238s()) {
                                                c0146kM234o.m307a();
                                            }
                                            c0146k3 = c0146kM234o;
                                        } else {
                                            if (objM220D3 == AbstractC0140e.f246n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            c0146kM234o.m307a();
                                            this.f219s = objM220D3;
                                            this.f220t = null;
                                            bool = Boolean.TRUE;
                                        }
                                    }
                                } else {
                                    c0146k.m307a();
                                    this.f219s = objM220D2;
                                    this.f220t = null;
                                    bool = Boolean.TRUE;
                                }
                                c0039hM108g.m92z(bool, null);
                                break;
                            }
                            mo78a(c0146k, i2);
                            Object objM85q = c0039hM108g.m85q();
                            EnumC6363a enumC6363a = EnumC6363a.f24419s;
                            return objM85q;
                        } catch (Throwable th) {
                            th = th;
                            c0039hM108g.m91y();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    c0146k.m307a();
                    this.f219s = objM220D;
                }
            }
            this.f219s = AbstractC0140e.f244l;
            Throwable thM235p2 = c0138c.m235p();
            if (thM235p2 != null) {
                int i4 = AbstractC0233s.f467a;
                throw thM235p2;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
