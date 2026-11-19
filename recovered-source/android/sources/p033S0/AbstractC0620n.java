package p033S0;

import kotlin.jvm.internal.AbstractC6452k;
import p035T0.C0815g;
import p049b0.C1887c;

/* JADX INFO: renamed from: S0.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0620n {

    /* JADX INFO: renamed from: a */
    public static final C0623q f1360a;

    static {
        C0623q c0623q;
        try {
            Class.forName("java.nio.file.Files");
            c0623q = new C0625s();
        } catch (ClassNotFoundException unused) {
            c0623q = new C0623q();
        }
        f1360a = c0623q;
        String str = C0627u.f1371t;
        String property = System.getProperty("java.io.tmpdir");
        AbstractC6452k.m12180d(property, "getProperty(\"java.io.tmpdir\")");
        C1887c.m2718e(property, false);
        ClassLoader classLoader = C0815g.class.getClassLoader();
        AbstractC6452k.m12180d(classLoader, "ResourceFileSystem::class.java.classLoader");
        new C0815g(classLoader);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo1361a(C0627u c0627u, C0627u c0627u2);

    /* JADX INFO: renamed from: b */
    public abstract void mo1362b(C0627u c0627u);

    /* JADX INFO: renamed from: c */
    public abstract void mo1363c(C0627u c0627u);

    /* JADX INFO: renamed from: d */
    public final boolean m1417d(C0627u path) {
        AbstractC6452k.m12181e(path, "path");
        return mo1364e(path) != null;
    }

    /* JADX INFO: renamed from: e */
    public abstract C0619m mo1364e(C0627u c0627u);

    /* JADX INFO: renamed from: f */
    public abstract C0622p mo1365f(C0627u c0627u);

    /* JADX INFO: renamed from: g */
    public abstract C0622p mo1366g(C0627u c0627u);

    /* JADX INFO: renamed from: h */
    public abstract InterfaceC0603C mo1367h(C0627u c0627u);
}
