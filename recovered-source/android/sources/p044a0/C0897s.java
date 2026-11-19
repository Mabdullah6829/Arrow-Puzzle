package p044a0;

import java.lang.reflect.Array;
import java.net.SocketAddress;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p001B.AbstractC0076b;
import p006D0.C0177l;
import p030R.AbstractC0522D;
import p030R.AbstractC0558h;
import p030R.C0533O;
import p030R.C0544a;
import p030R.C0546b;
import p030R.C0580s;
import p030R.C0589w0;
import p030R.C0594z;
import p030R.EnumC0578r;
import p030R.InterfaceC0537T;

/* JADX INFO: renamed from: a0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0897s extends AbstractC0880b {

    /* JADX INFO: renamed from: a */
    public final AbstractC0522D f2516a;

    /* JADX INFO: renamed from: b */
    public C0889k f2517b;

    /* JADX INFO: renamed from: c */
    public boolean f2518c;

    /* JADX INFO: renamed from: d */
    public C0580s f2519d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0537T f2520e;

    /* JADX INFO: renamed from: f */
    public final AbstractC0558h f2521f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0898t f2522g;

    public C0897s(C0898t c0898t, C0533O c0533o, C0886h c0886h) {
        this.f2522g = c0898t;
        InterfaceC0537T interfaceC0537T = (InterfaceC0537T) c0533o.m1258b();
        if (interfaceC0537T != null) {
            this.f2520e = interfaceC0537T;
            C0884f c0884f = new C0884f(this, interfaceC0537T, 1);
            C0533O c0533oM1256c = C0533O.m1256c();
            c0533oM1256c.m1259d(c0533o.f1132b);
            C0546b c0546b = c0533o.f1133c;
            AbstractC0076b.m133h(c0546b, "attrs");
            c0533oM1256c.f1133c = c0546b;
            Object[][] objArr = c0533o.f1134d;
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
            c0533oM1256c.f1134d = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            c0533oM1256c.m1257a(c0884f);
            this.f2516a = c0886h.mo1295a(new C0533O(c0533oM1256c.f1132b, c0533oM1256c.f1133c, c0533oM1256c.f1134d));
        } else {
            this.f2516a = c0886h.mo1295a(c0533o);
        }
        this.f2521f = this.f2516a.mo1242h();
    }

    @Override // p030R.AbstractC0522D
    public final C0546b getAttributes() {
        C0889k c0889k = this.f2517b;
        AbstractC0522D abstractC0522D = this.f2516a;
        if (c0889k == null) {
            return abstractC0522D.getAttributes();
        }
        C0546b attributes = abstractC0522D.getAttributes();
        attributes.getClass();
        C0889k c0889k2 = this.f2517b;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(C0898t.f2523n, c0889k2);
        for (Map.Entry entry : attributes.f1155a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C0544a) entry.getKey(), entry.getValue());
            }
        }
        return new C0546b(identityHashMap);
    }

    @Override // p044a0.AbstractC0880b, p030R.AbstractC0522D
    /* JADX INFO: renamed from: n */
    public final void mo1248n() {
        C0889k c0889k = this.f2517b;
        if (c0889k != null) {
            this.f2517b = null;
            c0889k.f2495f.remove(this);
        }
        super.mo1248n();
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: p */
    public final void mo1250p(InterfaceC0537T interfaceC0537T) {
        if (this.f2520e != null) {
            mo1807r().mo1250p(interfaceC0537T);
            return;
        }
        this.f2520e = interfaceC0537T;
        mo1807r().mo1250p(new C0884f(this, interfaceC0537T, 1));
    }

    @Override // p044a0.AbstractC0880b, p030R.AbstractC0522D
    /* JADX INFO: renamed from: q */
    public final void mo1251q(List list) {
        C0898t c0898t = this.f2522g;
        if (C0898t.m1818g(mo1241g()) && C0898t.m1818g(list)) {
            C0890l c0890l = c0898t.f2524f;
            if (c0890l.f2496H.containsValue(this.f2517b)) {
                C0889k c0889k = this.f2517b;
                c0889k.getClass();
                this.f2517b = null;
                c0889k.f2495f.remove(this);
            }
            SocketAddress socketAddress = (SocketAddress) ((C0594z) list.get(0)).f1305a.get(0);
            if (c0898t.f2524f.f2496H.containsKey(socketAddress)) {
                ((C0889k) c0898t.f2524f.f2496H.get(socketAddress)).m1811a(this);
            }
        } else if (C0898t.m1818g(mo1241g()) && !C0898t.m1818g(list)) {
            C0890l c0890l2 = c0898t.f2524f;
            if (c0890l2.f2496H.containsKey(m1240f().f1305a.get(0))) {
                C0890l c0890l3 = c0898t.f2524f;
                C0889k c0889k2 = (C0889k) c0890l3.f2496H.get(m1240f().f1305a.get(0));
                c0889k2.getClass();
                this.f2517b = null;
                c0889k2.f2495f.remove(this);
                C0177l c0177l = c0889k2.f2491b;
                ((AtomicLong) c0177l.f333u).set(0L);
                ((AtomicLong) c0177l.f332t).set(0L);
                C0177l c0177l2 = c0889k2.f2492c;
                ((AtomicLong) c0177l2.f333u).set(0L);
                ((AtomicLong) c0177l2.f332t).set(0L);
            }
        } else if (!C0898t.m1818g(mo1241g()) && C0898t.m1818g(list)) {
            SocketAddress socketAddress2 = (SocketAddress) ((C0594z) list.get(0)).f1305a.get(0);
            if (c0898t.f2524f.f2496H.containsKey(socketAddress2)) {
                ((C0889k) c0898t.f2524f.f2496H.get(socketAddress2)).m1811a(this);
            }
        }
        this.f2516a.mo1251q(list);
    }

    @Override // p044a0.AbstractC0880b
    /* JADX INFO: renamed from: r */
    public final AbstractC0522D mo1807r() {
        return this.f2516a;
    }

    /* JADX INFO: renamed from: s */
    public final void m1817s() {
        this.f2518c = true;
        InterfaceC0537T interfaceC0537T = this.f2520e;
        C0589w0 c0589w0 = C0589w0.f1284n;
        AbstractC0076b.m131f(true ^ c0589w0.m1352e(), "The error status must not be OK");
        interfaceC0537T.mo1263a(new C0580s(EnumC0578r.f1234u, c0589w0));
        this.f2521f.mo1300g("Subchannel ejected: {0}", new Object[]{this}, 2);
    }

    @Override // p044a0.AbstractC0880b
    public final String toString() {
        return "OutlierDetectionSubchannel{addresses=" + this.f2516a.mo1241g() + '}';
    }
}
