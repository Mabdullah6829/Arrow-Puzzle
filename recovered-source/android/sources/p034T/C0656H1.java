package p034T;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: T.H1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0656H1 implements InterfaceC0670M0 {

    /* JADX INFO: renamed from: b */
    public static final Logger f1460b = Logger.getLogger(C0656H1.class.getName());

    /* JADX INFO: renamed from: c */
    public static final Constructor f1461c;

    /* JADX INFO: renamed from: d */
    public static final Method f1462d;

    /* JADX INFO: renamed from: e */
    public static final RuntimeException f1463e;

    /* JADX INFO: renamed from: f */
    public static final Object[] f1464f;

    /* JADX INFO: renamed from: a */
    public final Object f1465a;

    static {
        Method method;
        Constructor<?> constructor;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
            try {
                cls.getMethod("sum", null);
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        constructor = null;
                        break;
                    }
                    constructor = constructors[i2];
                    if (constructor.getParameterTypes().length == 0) {
                        break;
                    } else {
                        i2++;
                    }
                }
                th = null;
            } catch (Throwable th) {
                th = th;
                f1460b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                constructor = null;
            }
        } catch (Throwable th2) {
            th = th2;
            method = null;
        }
        if (th != null || constructor == null) {
            f1461c = null;
            f1462d = null;
            f1463e = new RuntimeException(th);
        } else {
            f1461c = constructor;
            f1462d = method;
            f1463e = null;
        }
        f1464f = new Object[]{1L};
    }

    public C0656H1() {
        RuntimeException runtimeException = f1463e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f1465a = f1461c.newInstance(null);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // p034T.InterfaceC0670M0
    /* JADX INFO: renamed from: a */
    public final void mo1516a() {
        try {
            f1462d.invoke(this.f1465a, f1464f);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
