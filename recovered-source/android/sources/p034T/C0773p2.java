package p034T;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p001B.AbstractC0076b;

/* JADX INFO: renamed from: T.p2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0773p2 {

    /* JADX INFO: renamed from: d */
    public static final C0773p2 f2010d = new C0773p2(new C0785s2(17));

    /* JADX INFO: renamed from: a */
    public final IdentityHashMap f2011a = new IdentityHashMap();

    /* JADX INFO: renamed from: b */
    public final C0785s2 f2012b;

    /* JADX INFO: renamed from: c */
    public ScheduledExecutorService f2013c;

    public C0773p2(C0785s2 c0785s2) {
        this.f2012b = c0785s2;
    }

    /* JADX INFO: renamed from: a */
    public static Object m1652a(InterfaceC0769o2 interfaceC0769o2) {
        Object obj;
        C0773p2 c0773p2 = f2010d;
        synchronized (c0773p2) {
            try {
                C0765n2 c0765n2 = (C0765n2) c0773p2.f2011a.get(interfaceC0769o2);
                if (c0765n2 == null) {
                    c0765n2 = new C0765n2(interfaceC0769o2.mo1646b());
                    c0773p2.f2011a.put(interfaceC0769o2, c0765n2);
                }
                ScheduledFuture scheduledFuture = c0765n2.f1970c;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    c0765n2.f1970c = null;
                }
                c0765n2.f1969b++;
                obj = c0765n2.f1968a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public static void m1653b(InterfaceC0769o2 interfaceC0769o2, Object obj) {
        C0773p2 c0773p2 = f2010d;
        synchronized (c0773p2) {
            try {
                C0765n2 c0765n2 = (C0765n2) c0773p2.f2011a.get(interfaceC0769o2);
                if (c0765n2 == null) {
                    throw new IllegalArgumentException("No cached instance found for " + interfaceC0769o2);
                }
                AbstractC0076b.m131f(obj == c0765n2.f1968a, "Releasing the wrong instance");
                AbstractC0076b.m139n(c0765n2.f1969b > 0, "Refcount has already reached zero");
                int i2 = c0765n2.f1969b - 1;
                c0765n2.f1969b = i2;
                if (i2 == 0) {
                    AbstractC0076b.m139n(c0765n2.f1970c == null, "Destroy task already scheduled");
                    if (c0773p2.f2013c == null) {
                        c0773p2.f2012b.getClass();
                        c0773p2.f2013c = Executors.newSingleThreadScheduledExecutor(AbstractC0759m0.m1624e("grpc-shared-destroyer-%d"));
                    }
                    c0765n2.f1970c = c0773p2.f2013c.schedule(new RunnableC0667L0(new RunnableC0710a(c0773p2, c0765n2, interfaceC0769o2, obj, 3)), 1L, TimeUnit.SECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
