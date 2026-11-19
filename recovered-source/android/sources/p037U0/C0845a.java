package p037U0;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: U0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0845a implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final Object f2313a;

    public C0845a(Object obj) {
        this.f2313a = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Object obj2 = this.f2313a;
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, obj2.getClass().getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(obj2, objArr);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Reflection failed for method " + method, e2);
        }
    }
}
