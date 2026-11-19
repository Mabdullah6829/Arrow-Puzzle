package p066i0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC6452k;
import p001B.C0086l;
import p011H.AbstractC0243G;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;

/* JADX INFO: renamed from: i0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6371a implements InterfaceC6348c, InterfaceC6374d, Serializable {
    private final InterfaceC6348c completion;

    public AbstractC6371a(InterfaceC6348c interfaceC6348c) {
        this.completion = interfaceC6348c;
    }

    public InterfaceC6348c create(InterfaceC6348c completion) {
        AbstractC6452k.m12181e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public InterfaceC6374d getCallerFrame() {
        InterfaceC6348c interfaceC6348c = this.completion;
        if (interfaceC6348c instanceof InterfaceC6374d) {
            return (InterfaceC6374d) interfaceC6348c;
        }
        return null;
    }

    public final InterfaceC6348c getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strM12158c;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        InterfaceC6375e interfaceC6375e = (InterfaceC6375e) getClass().getAnnotation(InterfaceC6375e.class);
        String str = null;
        if (interfaceC6375e == null) {
            return null;
        }
        int iM12162v = interfaceC6375e.m12162v();
        if (iM12162v > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iM12162v + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField(Constants.ScionAnalytics.PARAM_LABEL);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i2 = iIntValue >= 0 ? interfaceC6375e.m12160l()[iIntValue] : -1;
        C0086l c0086l = AbstractC6376f.f24445b;
        C0086l c0086l2 = AbstractC6376f.f24444a;
        if (c0086l == null) {
            try {
                C0086l c0086l3 = new C0086l(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(AppMeasurementSdk.ConditionalUserProperty.NAME, null), 7);
                AbstractC6376f.f24445b = c0086l3;
                c0086l = c0086l3;
            } catch (Exception unused2) {
                AbstractC6376f.f24445b = c0086l2;
                c0086l = c0086l2;
            }
        }
        if (c0086l != c0086l2 && (method = (Method) c0086l.f112t) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) c0086l.f113u) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) c0086l.f114v;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strM12158c = interfaceC6375e.m12158c();
        } else {
            strM12158c = str + '/' + interfaceC6375e.m12158c();
        }
        return new StackTraceElement(strM12158c, interfaceC6375e.m12161m(), interfaceC6375e.m12159f(), i2);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // p062g0.InterfaceC6348c
    public final void resumeWith(Object obj) {
        InterfaceC6348c interfaceC6348c = this;
        while (true) {
            AbstractC6371a abstractC6371a = (AbstractC6371a) interfaceC6348c;
            InterfaceC6348c interfaceC6348c2 = abstractC6371a.completion;
            AbstractC6452k.m12178b(interfaceC6348c2);
            try {
                obj = abstractC6371a.invokeSuspend(obj);
                if (obj == EnumC6363a.f24419s) {
                    return;
                }
            } catch (Throwable th) {
                obj = AbstractC0243G.m372j(th);
            }
            abstractC6371a.releaseIntercepted();
            if (!(interfaceC6348c2 instanceof AbstractC6371a)) {
                interfaceC6348c2.resumeWith(obj);
                return;
            }
            interfaceC6348c = interfaceC6348c2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public InterfaceC6348c create(Object obj, InterfaceC6348c completion) {
        AbstractC6452k.m12181e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
