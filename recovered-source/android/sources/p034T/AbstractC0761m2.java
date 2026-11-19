package p034T;

import com.google.common.base.VerifyException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001B.AbstractC0076b;
import p030R.AbstractC0539V;
import p030R.C0540W;
import p030R.C0544a;
import p030R.C0571n0;
import p030R.C0589w0;
import p030R.EnumC0587v0;
import p030R.InterfaceC0574p;
import p036U.C0829j;
import p036U.C0830k;
import p041Y.C0873a;
import p049b0.AbstractC1886b;

/* JADX INFO: renamed from: T.m2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0761m2 implements InterfaceC0781r2 {

    /* JADX INFO: renamed from: a */
    public static final C0544a f1955a = new C0544a("io.grpc.internal.GrpcAttributes.securityLevel");

    /* JADX INFO: renamed from: b */
    public static final C0544a f1956b = new C0544a("io.grpc.internal.GrpcAttributes.clientEagAttrs");

    /* JADX INFO: renamed from: n */
    public static InterfaceC0670M0 m1632n() {
        return C0656H1.f1463e == null ? new C0656H1() : new C0738h(0);
    }

    /* JADX INFO: renamed from: o */
    public static Set m1633o(String str, Map map) {
        EnumC0587v0 enumC0587v0ValueOf;
        List listM1507c = AbstractC0655H0.m1507c(str, map);
        if (listM1507c == null) {
            return null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC0587v0.class);
        for (Object obj : listM1507c) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                int iIntValue = d.intValue();
                AbstractC0076b.m144t("Status code %s is not integral", ((double) iIntValue) == d.doubleValue(), obj);
                enumC0587v0ValueOf = C0589w0.m1349c(iIntValue).f1287a;
                AbstractC0076b.m144t("Status code %s is not valid", enumC0587v0ValueOf.f1265s == d.intValue(), obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new VerifyException("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
                }
                try {
                    enumC0587v0ValueOf = EnumC0587v0.valueOf((String) obj);
                } catch (IllegalArgumentException e) {
                    throw new VerifyException("Status code " + obj + " is not valid", e);
                }
            }
            enumSetNoneOf.add(enumC0587v0ValueOf);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    /* JADX INFO: renamed from: p */
    public static List m1634p(Map map) {
        String strM1512h;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            List listM1507c = AbstractC0655H0.m1507c("loadBalancingConfig", map);
            if (listM1507c == null) {
                listM1507c = null;
            } else {
                AbstractC0655H0.m1505a(listM1507c);
            }
            arrayList.addAll(listM1507c);
        }
        if (arrayList.isEmpty() && (strM1512h = AbstractC0655H0.m1512h("loadBalancingPolicy", map)) != null) {
            arrayList.add(Collections.singletonMap(strM1512h.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: t */
    public static C0571n0 m1635t(List list, C0540W c0540w) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0753k2 c0753k2 = (C0753k2) it.next();
            String str = c0753k2.f1903a;
            AbstractC0539V abstractC0539VM1274b = c0540w.m1274b(str);
            if (abstractC0539VM1274b != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(AbstractC0761m2.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                C0571n0 c0571n0Mo1272c = abstractC0539VM1274b.mo1272c(c0753k2.f1904b);
                return c0571n0Mo1272c.f1217a != null ? c0571n0Mo1272c : new C0571n0(new C0757l2(abstractC0539VM1274b, c0571n0Mo1272c.f1218b));
            }
            arrayList.add(str);
        }
        return new C0571n0(C0589w0.f1277g.m1354g("None of " + arrayList + " specified by Service Config are available."));
    }

    /* JADX INFO: renamed from: u */
    public static List m1636u(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            if (map.size() != 1) {
                throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
            }
            String str = (String) ((Map.Entry) map.entrySet().iterator().next()).getKey();
            arrayList.add(new C0753k2(str, AbstractC0655H0.m1511g(str, map)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // p034T.InterfaceC0781r2
    /* JADX INFO: renamed from: a */
    public void mo1539a(InterfaceC0574p interfaceC0574p) {
        ((AbstractC0718c) this).f1707d.mo1311a(interfaceC0574p);
    }

    @Override // p034T.InterfaceC0781r2
    /* JADX INFO: renamed from: b */
    public void mo1540b(boolean z) {
        ((AbstractC0718c) this).f1707d.mo1312b(z);
    }

    @Override // p034T.InterfaceC0781r2
    /* JADX INFO: renamed from: f */
    public void mo1544f(int i2) {
        C0829j c0829j = ((C0830k) this).f2231n;
        c0829j.getClass();
        AbstractC1886b.m2714b();
        RunnableC0726e runnableC0726e = new RunnableC0726e(c0829j, i2, 0);
        synchronized (c0829j.f2222w) {
            runnableC0726e.run();
        }
    }

    @Override // p034T.InterfaceC0781r2
    public void flush() {
        InterfaceC0747j0 interfaceC0747j0 = ((AbstractC0718c) this).f1707d;
        if (interfaceC0747j0.isClosed()) {
            return;
        }
        interfaceC0747j0.flush();
    }

    @Override // p034T.InterfaceC0781r2
    /* JADX INFO: renamed from: k */
    public void mo1549k(C0873a c0873a) {
        try {
            if (!((AbstractC0718c) this).f1707d.isClosed()) {
                ((AbstractC0718c) this).f1707d.mo1314d(c0873a);
            }
        } finally {
            AbstractC0759m0.m1621b(c0873a);
        }
    }

    @Override // p034T.InterfaceC0781r2
    /* JADX INFO: renamed from: m */
    public void mo1551m() {
        C0829j c0829j = ((C0830k) this).f2231n;
        C0760m1 c0760m1 = c0829j.f1676d;
        c0760m1.f1947s = c0829j;
        c0829j.f1673a = c0760m1;
    }

    /* JADX INFO: renamed from: q */
    public abstract int m1637q();

    /* JADX INFO: renamed from: r */
    public abstract boolean mo1612r(ExecutorC0749j2 executorC0749j2);

    /* JADX INFO: renamed from: s */
    public abstract void mo1613s(ExecutorC0749j2 executorC0749j2);
}
