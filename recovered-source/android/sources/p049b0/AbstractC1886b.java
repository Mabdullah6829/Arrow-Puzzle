package p049b0;

/* JADX INFO: renamed from: b0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1886b {

    /* JADX INFO: renamed from: a */
    public static final C1885a f2862a;

    static {
        Object obj;
        Class<?> cls;
        C1885a c1885a;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th) {
            obj = th;
            cls = null;
        }
        if (cls != null) {
            try {
                c1885a = (C1885a) cls.asSubclass(C1885a.class).getConstructor(C1887c.class).newInstance(C1885a.f2860a);
            } catch (Throwable th2) {
                obj = th2;
                c1885a = null;
            }
        } else {
            c1885a = null;
        }
        if (c1885a != null) {
            f2862a = c1885a;
        } else {
            f2862a = new C1885a();
        }
        if (obj != null) {
            try {
                if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    Class<?> cls2 = Class.forName("java.util.logging.Logger");
                    Object objInvoke = cls2.getMethod("getLogger", String.class).invoke(null, AbstractC1886b.class.getName());
                    Class<?> cls3 = Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2713a() {
        f2862a.getClass();
    }

    /* JADX INFO: renamed from: b */
    public static void m2714b() {
        f2862a.getClass();
    }

    /* JADX INFO: renamed from: c */
    public static void m2715c() {
        f2862a.getClass();
    }
}
