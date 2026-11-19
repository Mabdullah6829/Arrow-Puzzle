package p030R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: R.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0558h {

    /* JADX INFO: renamed from: a */
    public static final C0544a f1183a = new C0544a("io.grpc.Grpc.TRANSPORT_ATTR_REMOTE_ADDR");

    /* JADX INFO: renamed from: b */
    public static final C0544a f1184b = new C0544a("io.grpc.Grpc.TRANSPORT_ATTR_LOCAL_ADDR");

    /* JADX INFO: renamed from: c */
    public static final C0544a f1185c = new C0544a("io.grpc.Grpc.TRANSPORT_ATTR_SSL_SESSION");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: e */
    public static List m1294e(Class cls, Iterable iterable, ClassLoader classLoader, InterfaceC0585u0 interfaceC0585u0) {
        ?? Load;
        try {
            Class.forName("android.app.Application", false, classLoader);
            Load = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Class cls2 = (Class) it.next();
                Object objNewInstance = null;
                try {
                    objNewInstance = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                } catch (ClassCastException unused) {
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
                if (objNewInstance != null) {
                    Load.add(objNewInstance);
                }
            }
        } catch (Exception unused2) {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(cls, classLoader);
            Load = !serviceLoaderLoad.iterator().hasNext() ? ServiceLoader.load(cls) : serviceLoaderLoad;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : Load) {
            if (interfaceC0585u0.mo1337d(obj)) {
                arrayList.add(obj);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new C0583t0(interfaceC0585u0)));
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC0522D mo1295a(C0533O c0533o);

    /* JADX INFO: renamed from: b */
    public abstract AbstractC0558h mo1296b();

    /* JADX INFO: renamed from: c */
    public abstract ScheduledExecutorService mo1297c();

    /* JADX INFO: renamed from: d */
    public abstract ExecutorC0517A0 mo1298d();

    /* JADX INFO: renamed from: f */
    public abstract void mo1299f(int i2, String str);

    /* JADX INFO: renamed from: g */
    public abstract void mo1300g(String str, Object[] objArr, int i2);

    /* JADX INFO: renamed from: h */
    public abstract void mo1301h(C0589w0 c0589w0);

    /* JADX INFO: renamed from: i */
    public abstract void mo1302i(C0573o0 c0573o0);

    /* JADX INFO: renamed from: j */
    public abstract void mo1303j();

    /* JADX INFO: renamed from: k */
    public abstract void mo1304k(EnumC0578r enumC0578r, AbstractC0536S abstractC0536S);
}
