package p044a0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001B.AbstractC0076b;
import p003C.AbstractC0116g;
import p003C.C0113d;
import p006D0.C0177l;
import p030R.AbstractC0536S;
import p030R.AbstractC0538U;
import p030R.AbstractC0539V;
import p030R.AbstractC0558h;
import p030R.C0534P;
import p030R.C0535Q;
import p030R.C0544a;
import p030R.C0546b;
import p030R.C0589w0;
import p030R.C0594z;
import p030R.EnumC0578r;
import p034T.C0638B1;
import p034T.C0679P0;

/* JADX INFO: renamed from: a0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0902x extends AbstractC0538U {

    /* JADX INFO: renamed from: m */
    public static final Logger f2535m = Logger.getLogger(C0902x.class.getName());

    /* JADX INFO: renamed from: g */
    public final AbstractC0558h f2537g;

    /* JADX INFO: renamed from: h */
    public boolean f2538h;

    /* JADX INFO: renamed from: j */
    public EnumC0578r f2540j;

    /* JADX INFO: renamed from: k */
    public final AtomicInteger f2541k;

    /* JADX INFO: renamed from: l */
    public AbstractC0536S f2542l;

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f2536f = new LinkedHashMap();

    /* JADX INFO: renamed from: i */
    public final C0638B1 f2539i = new C0638B1();

    public C0902x(AbstractC0558h abstractC0558h) {
        this.f2537g = abstractC0558h;
        f2535m.log(Level.FINE, "Created");
        this.f2541k = new AtomicInteger(new Random().nextInt());
        this.f2542l = new C0900v();
    }

    @Override // p030R.AbstractC0538U
    /* JADX INFO: renamed from: a */
    public final C0589w0 mo1264a(C0535Q c0535q) {
        try {
            this.f2538h = true;
            C0177l c0177lM1821g = m1821g(c0535q);
            C0589w0 c0589w0 = (C0589w0) c0177lM1821g.f333u;
            if (!c0589w0.m1352e()) {
                this.f2538h = false;
                return c0589w0;
            }
            m1824j();
            for (C0887i c0887i : (List) c0177lM1821g.f332t) {
                c0887i.f2482b.mo1269f();
                c0887i.f2484d = EnumC0578r.f1236w;
                f2535m.log(Level.FINE, "Child balancer {0} deleted", c0887i.f2481a);
            }
            this.f2538h = false;
            return c0589w0;
        } catch (Throwable th) {
            this.f2538h = false;
            throw th;
        }
    }

    @Override // p030R.AbstractC0538U
    /* JADX INFO: renamed from: c */
    public final void mo1266c(C0589w0 c0589w0) {
        if (this.f2540j != EnumC0578r.f1233t) {
            this.f2537g.mo1304k(EnumC0578r.f1234u, new C0679P0(C0534P.m1260a(c0589w0)));
        }
    }

    @Override // p030R.AbstractC0538U
    /* JADX INFO: renamed from: f */
    public final void mo1269f() {
        Level level = Level.FINE;
        Logger logger = f2535m;
        logger.log(level, "Shutdown");
        LinkedHashMap linkedHashMap = this.f2536f;
        for (C0887i c0887i : linkedHashMap.values()) {
            c0887i.f2482b.mo1269f();
            c0887i.f2484d = EnumC0578r.f1236w;
            logger.log(Level.FINE, "Child balancer {0} deleted", c0887i.f2481a);
        }
        linkedHashMap.clear();
    }

    /* JADX INFO: renamed from: g */
    public final C0177l m1821g(C0535Q c0535q) {
        LinkedHashMap linkedHashMap;
        C0888j c0888j;
        C0594z c0594z;
        Level level = Level.FINE;
        Logger logger = f2535m;
        logger.log(level, "Received resolution result: {0}", c0535q);
        HashMap map = new HashMap();
        List list = c0535q.f1140a;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap = this.f2536f;
            if (!zHasNext) {
                break;
            }
            C0888j c0888j2 = new C0888j((C0594z) it.next());
            C0887i c0887i = (C0887i) linkedHashMap.get(c0888j2);
            if (c0887i != null) {
                map.put(c0888j2, c0887i);
            } else {
                map.put(c0888j2, new C0887i(this, c0888j2, this.f2539i, new C0679P0(C0534P.f1135e)));
            }
        }
        int i2 = 13;
        Object obj = null;
        if (map.isEmpty()) {
            C0589w0 c0589w0M1354g = C0589w0.f1284n.m1354g("NameResolver returned no usable address. " + c0535q);
            mo1266c(c0589w0M1354g);
            return new C0177l(i2, c0589w0M1354g, obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            AbstractC0539V abstractC0539V = ((C0887i) entry.getValue()).f2483c;
            ((C0887i) entry.getValue()).getClass();
            if (linkedHashMap.containsKey(key)) {
                C0887i c0887i2 = (C0887i) linkedHashMap.get(key);
                if (c0887i2.f2486f) {
                    c0887i2.f2486f = false;
                }
            } else {
                linkedHashMap.put(key, (C0887i) entry.getValue());
            }
            C0887i c0887i3 = (C0887i) linkedHashMap.get(key);
            if (key instanceof C0594z) {
                c0888j = new C0888j((C0594z) key);
            } else {
                AbstractC0076b.m131f(key instanceof C0888j, "key is wrong type");
                c0888j = (C0888j) key;
            }
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    c0594z = null;
                    break;
                }
                c0594z = (C0594z) it2.next();
            } while (!c0888j.equals(new C0888j(c0594z)));
            AbstractC0076b.m133h(c0594z, key + " no longer present in load balancer children");
            C0546b c0546b = C0546b.f1154b;
            List listSingletonList = Collections.singletonList(c0594z);
            C0546b c0546b2 = C0546b.f1154b;
            Boolean bool = Boolean.TRUE;
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            identityHashMap.put(AbstractC0538U.f1146e, bool);
            for (Map.Entry entry2 : c0546b2.f1155a.entrySet()) {
                if (!identityHashMap.containsKey(entry2.getKey())) {
                    identityHashMap.put((C0544a) entry2.getKey(), entry2.getValue());
                }
            }
            C0535Q c0535q2 = new C0535Q(listSingletonList, new C0546b(identityHashMap), null);
            ((C0887i) linkedHashMap.get(key)).getClass();
            if (!c0887i3.f2486f) {
                c0887i3.f2482b.mo1267d(c0535q2);
            }
        }
        ArrayList arrayList = new ArrayList();
        C0113d c0113dListIterator = AbstractC0116g.m194r(linkedHashMap.keySet()).listIterator(0);
        while (c0113dListIterator.hasNext()) {
            Object next = c0113dListIterator.next();
            if (!map.containsKey(next)) {
                C0887i c0887i4 = (C0887i) linkedHashMap.get(next);
                C0888j c0888j3 = c0887i4.f2481a;
                if (!c0887i4.f2486f) {
                    c0887i4.f2487g.f2536f.remove(c0888j3);
                    c0887i4.f2486f = true;
                    logger.log(Level.FINE, "Child balancer {0} deactivated", c0888j3);
                }
                arrayList.add(c0887i4);
            }
        }
        return new C0177l(i2, C0589w0.f1275e, arrayList);
    }

    /* JADX INFO: renamed from: h */
    public final C0901w m1822h(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0887i) it.next()).f2485e);
        }
        return new C0901w(arrayList, this.f2541k);
    }

    /* JADX INFO: renamed from: i */
    public final void m1823i(EnumC0578r enumC0578r, AbstractC0536S abstractC0536S) {
        if (enumC0578r == this.f2540j && abstractC0536S.equals(this.f2542l)) {
            return;
        }
        this.f2537g.mo1304k(enumC0578r, abstractC0536S);
        this.f2540j = enumC0578r;
        this.f2542l = abstractC0536S;
    }

    /* JADX INFO: renamed from: j */
    public final void m1824j() {
        EnumC0578r enumC0578r;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = this.f2536f;
        Iterator it = linkedHashMap.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            enumC0578r = EnumC0578r.f1233t;
            if (!zHasNext) {
                break;
            }
            C0887i c0887i = (C0887i) it.next();
            if (!c0887i.f2486f && c0887i.f2484d == enumC0578r) {
                arrayList.add(c0887i);
            }
        }
        if (!arrayList.isEmpty()) {
            m1823i(enumC0578r, m1822h(arrayList));
            return;
        }
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            EnumC0578r enumC0578r2 = ((C0887i) it2.next()).f2484d;
            EnumC0578r enumC0578r3 = EnumC0578r.f1232s;
            if (enumC0578r2 == enumC0578r3 || enumC0578r2 == EnumC0578r.f1235v) {
                m1823i(enumC0578r3, new C0900v());
                return;
            }
        }
        m1823i(EnumC0578r.f1234u, m1822h(linkedHashMap.values()));
    }
}
