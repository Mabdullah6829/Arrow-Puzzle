package p070k0;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: renamed from: k0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6441a {

    /* JADX INFO: renamed from: a */
    public static final Method f24626a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        AbstractC6452k.m12178b(methods);
        int length = methods.length;
        int i2 = 0;
        while (true) {
            method = null;
            if (i2 >= length) {
                break;
            }
            Method method2 = methods[i2];
            if (AbstractC6452k.m12177a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                AbstractC6452k.m12180d(parameterTypes, "getParameterTypes(...)");
                if (AbstractC6452k.m12177a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i2++;
        }
        f24626a = method;
        int length2 = methods.length;
        for (int i3 = 0; i3 < length2 && !AbstractC6452k.m12177a(methods[i3].getName(), "getSuppressed"); i3++) {
        }
    }
}
