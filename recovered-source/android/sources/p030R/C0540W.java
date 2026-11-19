package p030R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001B.AbstractC0076b;
import p034T.C0638B1;
import p044a0.C0903y;

/* JADX INFO: renamed from: R.W */
/* JADX INFO: loaded from: classes.dex */
public final class C0540W {

    /* JADX INFO: renamed from: c */
    public static final Logger f1148c;

    /* JADX INFO: renamed from: d */
    public static C0540W f1149d;

    /* JADX INFO: renamed from: e */
    public static final List f1150e;

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f1151a = new LinkedHashSet();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f1152b = new LinkedHashMap();

    static {
        Logger logger = Logger.getLogger(C0540W.class.getName());
        f1148c = logger;
        ArrayList arrayList = new ArrayList();
        try {
            boolean z = C0638B1.f1404a;
            arrayList.add(C0638B1.class);
        } catch (ClassNotFoundException e) {
            logger.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e);
        }
        try {
            arrayList.add(C0903y.class);
        } catch (ClassNotFoundException e2) {
            logger.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e2);
        }
        f1150e = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C0540W m1273a() {
        try {
            if (f1149d == null) {
                List<AbstractC0539V> listM1294e = AbstractC0558h.m1294e(AbstractC0539V.class, f1150e, AbstractC0539V.class.getClassLoader(), new C0572o(6));
                f1149d = new C0540W();
                for (AbstractC0539V abstractC0539V : listM1294e) {
                    f1148c.fine("Service loader found " + abstractC0539V);
                    C0540W c0540w = f1149d;
                    synchronized (c0540w) {
                        abstractC0539V.getClass();
                        c0540w.f1151a.add(abstractC0539V);
                    }
                }
                f1149d.m1275c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1149d;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized AbstractC0539V m1274b(String str) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = this.f1152b;
        AbstractC0076b.m133h(str, "policy");
        return (AbstractC0539V) linkedHashMap.get(str);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m1275c() {
        this.f1152b.clear();
        for (AbstractC0539V abstractC0539V : this.f1151a) {
            String strMo1270a = abstractC0539V.mo1270a();
            if (((AbstractC0539V) this.f1152b.get(strMo1270a)) == null) {
                this.f1152b.put(strMo1270a, abstractC0539V);
            }
        }
    }
}
