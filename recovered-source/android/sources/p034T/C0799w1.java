package p034T;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001B.AbstractC0089o;
import p003C.AbstractC0111b;
import p003C.AbstractC0116g;
import p003C.C0112c;
import p003C.C0113d;
import p003C.C0129t;
import p006D0.C0177l;
import p011H.AbstractC0243G;
import p022N.AbstractC0355G;
import p030R.AbstractC0522D;
import p030R.AbstractC0536S;
import p030R.AbstractC0538U;
import p030R.AbstractC0558h;
import p030R.C0533O;
import p030R.C0534P;
import p030R.C0535Q;
import p030R.C0580s;
import p030R.C0589w0;
import p030R.C0594z;
import p030R.EnumC0578r;
import p030R.InterfaceC0537T;
import p030R.RunnableC0595z0;

/* JADX INFO: renamed from: T.w1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0799w1 extends AbstractC0538U {

    /* JADX INFO: renamed from: o */
    public static final Logger f2077o = Logger.getLogger(C0799w1.class.getName());

    /* JADX INFO: renamed from: f */
    public final AbstractC0558h f2078f;

    /* JADX INFO: renamed from: h */
    public C0807z0 f2080h;

    /* JADX INFO: renamed from: k */
    public C0177l f2083k;

    /* JADX INFO: renamed from: l */
    public EnumC0578r f2084l;

    /* JADX INFO: renamed from: m */
    public EnumC0578r f2085m;

    /* JADX INFO: renamed from: n */
    public final boolean f2086n;

    /* JADX INFO: renamed from: g */
    public final HashMap f2079g = new HashMap();

    /* JADX INFO: renamed from: i */
    public int f2081i = 0;

    /* JADX INFO: renamed from: j */
    public boolean f2082j = true;

    public C0799w1(AbstractC0558h abstractC0558h) {
        boolean z = false;
        EnumC0578r enumC0578r = EnumC0578r.f1235v;
        this.f2084l = enumC0578r;
        this.f2085m = enumC0578r;
        Logger logger = AbstractC0759m0.f1919a;
        String property = System.getenv("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS");
        property = property == null ? System.getProperty("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS") : property;
        if (!AbstractC0089o.m161a(property) && Boolean.parseBoolean(property)) {
            z = true;
        }
        this.f2086n = z;
        this.f2078f = abstractC0558h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p030R.AbstractC0538U
    /* JADX INFO: renamed from: a */
    public final C0589w0 mo1264a(C0535Q c0535q) {
        List list;
        EnumC0578r enumC0578r;
        if (this.f2084l == EnumC0578r.f1236w) {
            return C0589w0.f1282l.m1354g("Already shut down");
        }
        List list2 = c0535q.f1140a;
        Object obj = c0535q.f1141b;
        if (list2.isEmpty()) {
            C0589w0 c0589w0M1354g = C0589w0.f1284n.m1354g("NameResolver returned no usable address. addrs=" + list2 + ", attrs=" + obj);
            mo1266c(c0589w0M1354g);
            return c0589w0M1354g;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((C0594z) it.next()) == null) {
                C0589w0 c0589w0M1354g2 = C0589w0.f1284n.m1354g("NameResolver returned address list with null endpoint. addrs=" + list2 + ", attrs=" + obj);
                mo1266c(c0589w0M1354g2);
                return c0589w0M1354g2;
            }
        }
        this.f2082j = true;
        C0112c c0112cM192n = AbstractC0116g.m192n();
        c0112cM192n.m186c(list2.size() + c0112cM192n.f158b);
        if (list2 instanceof AbstractC0111b) {
            c0112cM192n.f158b = ((AbstractC0111b) list2).mo175b(c0112cM192n.f158b, c0112cM192n.f157a);
        } else {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                c0112cM192n.m185a(it2.next());
            }
        }
        C0129t c0129tM187d = c0112cM192n.m187d();
        C0807z0 c0807z0 = this.f2080h;
        EnumC0578r enumC0578r2 = EnumC0578r.f1233t;
        if (c0807z0 == null) {
            C0807z0 c0807z1 = new C0807z0();
            c0807z1.f2113a = c0129tM187d != null ? c0129tM187d : Collections.EMPTY_LIST;
            this.f2080h = c0807z1;
        } else if (this.f2084l == enumC0578r2) {
            SocketAddress socketAddressM1677a = c0807z0.m1677a();
            C0807z0 c0807z2 = this.f2080h;
            if (c0129tM187d != null) {
                list = c0129tM187d;
            } else {
                c0807z2.getClass();
                list = Collections.EMPTY_LIST;
            }
            c0807z2.f2113a = list;
            c0807z2.f2114b = 0;
            c0807z2.f2115c = 0;
            if (this.f2080h.m1681e(socketAddressM1677a)) {
                return C0589w0.f1275e;
            }
            C0807z0 c0807z3 = this.f2080h;
            c0807z3.f2114b = 0;
            c0807z3.f2115c = 0;
        } else {
            c0807z0.f2113a = c0129tM187d != null ? c0129tM187d : Collections.EMPTY_LIST;
            c0807z0.f2114b = 0;
            c0807z0.f2115c = 0;
        }
        HashMap map = this.f2079g;
        HashSet<SocketAddress> hashSet = new HashSet(map.keySet());
        HashSet hashSet2 = new HashSet();
        C0113d c0113dListIterator = c0129tM187d.listIterator(0);
        while (c0113dListIterator.hasNext()) {
            hashSet2.addAll(((C0594z) c0113dListIterator.next()).f1305a);
        }
        for (SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                ((C0796v1) map.remove(socketAddress)).f2068a.mo1248n();
            }
        }
        int size = hashSet.size();
        EnumC0578r enumC0578r3 = EnumC0578r.f1232s;
        if (size == 0 || (enumC0578r = this.f2084l) == enumC0578r3 || enumC0578r == enumC0578r2) {
            this.f2084l = enumC0578r3;
            m1671i(enumC0578r3, new C0788t1(C0534P.f1135e));
            m1669g();
            mo1268e();
        } else {
            EnumC0578r enumC0578r4 = EnumC0578r.f1235v;
            if (enumC0578r == enumC0578r4) {
                m1671i(enumC0578r4, new C0792u1(this, this));
            } else if (enumC0578r == EnumC0578r.f1234u) {
                m1669g();
                mo1268e();
            }
        }
        return C0589w0.f1275e;
    }

    @Override // p030R.AbstractC0538U
    /* JADX INFO: renamed from: c */
    public final void mo1266c(C0589w0 c0589w0) {
        HashMap map = this.f2079g;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C0796v1) it.next()).f2068a.mo1248n();
        }
        map.clear();
        m1671i(EnumC0578r.f1234u, new C0788t1(C0534P.m1260a(c0589w0)));
    }

    @Override // p030R.AbstractC0538U
    /* JADX INFO: renamed from: e */
    public final void mo1268e() {
        AbstractC0522D abstractC0522D;
        C0807z0 c0807z0 = this.f2080h;
        if (c0807z0 == null || !c0807z0.m1679c() || this.f2084l == EnumC0578r.f1236w) {
            return;
        }
        SocketAddress socketAddressM1677a = this.f2080h.m1677a();
        HashMap map = this.f2079g;
        boolean zContainsKey = map.containsKey(socketAddressM1677a);
        Logger logger = f2077o;
        if (zContainsKey) {
            abstractC0522D = ((C0796v1) map.get(socketAddressM1677a)).f2068a;
        } else {
            C0784s1 c0784s1 = new C0784s1(this);
            C0533O c0533oM1256c = C0533O.m1256c();
            C0594z[] c0594zArr = {new C0594z(socketAddressM1677a)};
            AbstractC0243G.m371i(1, "arraySize");
            ArrayList arrayList = new ArrayList(AbstractC0355G.m559m(((long) 1) + 5 + ((long) 0)));
            Collections.addAll(arrayList, c0594zArr);
            c0533oM1256c.m1259d(arrayList);
            c0533oM1256c.m1257a(c0784s1);
            final AbstractC0522D abstractC0522DMo1295a = this.f2078f.mo1295a(new C0533O(c0533oM1256c.f1132b, c0533oM1256c.f1133c, c0533oM1256c.f1134d));
            if (abstractC0522DMo1295a == null) {
                logger.warning("Was not able to create subchannel for " + socketAddressM1677a);
                throw new IllegalStateException("Can't create subchannel");
            }
            C0796v1 c0796v1 = new C0796v1(abstractC0522DMo1295a, c0784s1);
            c0784s1.f2035b = c0796v1;
            map.put(socketAddressM1677a, c0796v1);
            if (abstractC0522DMo1295a.getAttributes().f1155a.get(AbstractC0538U.f1145d) == null) {
                c0784s1.f2034a = C0580s.m1341a(EnumC0578r.f1233t);
            }
            abstractC0522DMo1295a.mo1250p(new InterfaceC0537T() { // from class: T.r1
                @Override // p030R.InterfaceC0537T
                /* JADX INFO: renamed from: a */
                public final void mo1263a(C0580s c0580s) {
                    AbstractC0522D abstractC0522D2;
                    C0799w1 c0799w1 = this.f2030a;
                    AbstractC0558h abstractC0558h = c0799w1.f2078f;
                    EnumC0578r enumC0578r = c0580s.f1238a;
                    HashMap map2 = c0799w1.f2079g;
                    AbstractC0522D abstractC0522D3 = abstractC0522DMo1295a;
                    C0796v1 c0796v2 = (C0796v1) map2.get((SocketAddress) abstractC0522D3.m1240f().f1305a.get(0));
                    if (c0796v2 == null || (abstractC0522D2 = c0796v2.f2068a) != abstractC0522D3 || enumC0578r == EnumC0578r.f1236w) {
                        return;
                    }
                    EnumC0578r enumC0578r2 = EnumC0578r.f1235v;
                    if (enumC0578r == enumC0578r2) {
                        abstractC0558h.mo1303j();
                    }
                    C0796v1.m1668a(c0796v2, enumC0578r);
                    EnumC0578r enumC0578r3 = c0799w1.f2084l;
                    EnumC0578r enumC0578r4 = EnumC0578r.f1232s;
                    EnumC0578r enumC0578r5 = EnumC0578r.f1234u;
                    if (enumC0578r3 == enumC0578r5 || c0799w1.f2085m == enumC0578r5) {
                        if (enumC0578r == enumC0578r4) {
                            return;
                        }
                        if (enumC0578r == enumC0578r2) {
                            c0799w1.mo1268e();
                            return;
                        }
                    }
                    int iOrdinal = enumC0578r.ordinal();
                    if (iOrdinal == 0) {
                        c0799w1.f2084l = enumC0578r4;
                        c0799w1.m1671i(enumC0578r4, new C0788t1(C0534P.f1135e));
                        return;
                    }
                    if (iOrdinal == 1) {
                        c0799w1.m1669g();
                        for (C0796v1 c0796v3 : map2.values()) {
                            if (!c0796v3.f2068a.equals(abstractC0522D2)) {
                                c0796v3.f2068a.mo1248n();
                            }
                        }
                        map2.clear();
                        EnumC0578r enumC0578r6 = EnumC0578r.f1233t;
                        C0796v1.m1668a(c0796v2, enumC0578r6);
                        map2.put((SocketAddress) abstractC0522D2.m1240f().f1305a.get(0), c0796v2);
                        c0799w1.f2080h.m1681e((SocketAddress) abstractC0522D3.m1240f().f1305a.get(0));
                        c0799w1.f2084l = enumC0578r6;
                        c0799w1.m1672j(c0796v2);
                        return;
                    }
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            throw new IllegalArgumentException("Unsupported state:" + enumC0578r);
                        }
                        C0807z0 c0807z1 = c0799w1.f2080h;
                        c0807z1.f2114b = 0;
                        c0807z1.f2115c = 0;
                        c0799w1.f2084l = enumC0578r2;
                        c0799w1.m1671i(enumC0578r2, new C0792u1(c0799w1, c0799w1));
                        return;
                    }
                    if (c0799w1.f2080h.m1679c() && ((C0796v1) map2.get(c0799w1.f2080h.m1677a())).f2068a == abstractC0522D3 && c0799w1.f2080h.m1678b()) {
                        c0799w1.m1669g();
                        c0799w1.mo1268e();
                    }
                    C0807z0 c0807z2 = c0799w1.f2080h;
                    if (c0807z2 == null || c0807z2.m1679c()) {
                        return;
                    }
                    int size = map2.size();
                    List list = (List) c0799w1.f2080h.f2113a;
                    if (size < (list != null ? list.size() : 0)) {
                        return;
                    }
                    Iterator it = map2.values().iterator();
                    while (it.hasNext()) {
                        if (!((C0796v1) it.next()).f2071d) {
                            return;
                        }
                    }
                    c0799w1.f2084l = enumC0578r5;
                    c0799w1.m1671i(enumC0578r5, new C0788t1(C0534P.m1260a(c0580s.f1239b)));
                    int i2 = c0799w1.f2081i + 1;
                    c0799w1.f2081i = i2;
                    List list2 = (List) c0799w1.f2080h.f2113a;
                    if (i2 >= (list2 != null ? list2.size() : 0) || c0799w1.f2082j) {
                        c0799w1.f2082j = false;
                        c0799w1.f2081i = 0;
                        abstractC0558h.mo1303j();
                    }
                }
            });
            abstractC0522D = abstractC0522DMo1295a;
        }
        int iOrdinal = ((C0796v1) map.get(socketAddressM1677a)).f2069b.ordinal();
        if (iOrdinal == 0) {
            if (this.f2086n) {
                m1670h();
                return;
            } else {
                abstractC0522D.mo1247m();
                return;
            }
        }
        if (iOrdinal == 1) {
            logger.warning("Requesting a connection even though we have a READY subchannel");
            return;
        }
        if (iOrdinal == 2) {
            this.f2080h.m1678b();
            mo1268e();
        } else {
            if (iOrdinal != 3) {
                return;
            }
            abstractC0522D.mo1247m();
            C0796v1.m1668a((C0796v1) map.get(socketAddressM1677a), EnumC0578r.f1232s);
            m1670h();
        }
    }

    @Override // p030R.AbstractC0538U
    /* JADX INFO: renamed from: f */
    public final void mo1269f() {
        Level level = Level.FINE;
        HashMap map = this.f2079g;
        f2077o.log(level, "Shutting down, currently have {} subchannels created", Integer.valueOf(map.size()));
        EnumC0578r enumC0578r = EnumC0578r.f1236w;
        this.f2084l = enumC0578r;
        this.f2085m = enumC0578r;
        m1669g();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C0796v1) it.next()).f2068a.mo1248n();
        }
        map.clear();
    }

    /* JADX INFO: renamed from: g */
    public final void m1669g() {
        C0177l c0177l = this.f2083k;
        if (c0177l != null) {
            c0177l.m271c();
            this.f2083k = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m1670h() {
        if (this.f2086n) {
            C0177l c0177l = this.f2083k;
            if (c0177l != null) {
                RunnableC0595z0 runnableC0595z0 = (RunnableC0595z0) c0177l.f333u;
                if (!runnableC0595z0.f1310u && !runnableC0595z0.f1309t) {
                    return;
                }
            }
            AbstractC0558h abstractC0558h = this.f2078f;
            this.f2083k = abstractC0558h.mo1298d().m1236c(new RunnableC0681Q(this, 6), 250L, TimeUnit.MILLISECONDS, abstractC0558h.mo1297c());
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m1671i(EnumC0578r enumC0578r, AbstractC0536S abstractC0536S) {
        if (enumC0578r == this.f2085m && (enumC0578r == EnumC0578r.f1235v || enumC0578r == EnumC0578r.f1232s)) {
            return;
        }
        this.f2085m = enumC0578r;
        this.f2078f.mo1304k(enumC0578r, abstractC0536S);
    }

    /* JADX INFO: renamed from: j */
    public final void m1672j(C0796v1 c0796v1) {
        EnumC0578r enumC0578r = c0796v1.f2069b;
        EnumC0578r enumC0578r2 = EnumC0578r.f1233t;
        if (enumC0578r != enumC0578r2) {
            return;
        }
        C0580s c0580s = c0796v1.f2070c.f2034a;
        EnumC0578r enumC0578r3 = c0580s.f1238a;
        if (enumC0578r3 == enumC0578r2) {
            m1671i(enumC0578r2, new C0679P0(C0534P.m1261b(c0796v1.f2068a, null)));
            return;
        }
        EnumC0578r enumC0578r4 = EnumC0578r.f1234u;
        if (enumC0578r3 == enumC0578r4) {
            m1671i(enumC0578r4, new C0788t1(C0534P.m1260a(c0580s.f1239b)));
        } else if (this.f2085m != enumC0578r4) {
            m1671i(enumC0578r3, new C0788t1(C0534P.f1135e));
        }
    }
}
