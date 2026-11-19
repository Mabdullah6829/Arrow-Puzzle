package p002B0;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p000A0.C0065u;
import p062g0.AbstractC6346a;
import p062g0.InterfaceC6351f;

/* JADX INFO: renamed from: B0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0102b extends AbstractC6346a implements InterfaceC6351f {
    private volatile Object _preHandler;

    public C0102b() {
        super(C0065u.f79s);
        this._preHandler = this;
    }

    /* JADX INFO: renamed from: j */
    public final void m171j(Throwable th) {
        Method declaredMethod;
        int i2 = Build.VERSION.SDK_INT;
        if (26 > i2 || i2 >= 28) {
            return;
        }
        Object obj = this._preHandler;
        if (obj != this) {
            declaredMethod = (Method) obj;
        } else {
            try {
                declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
                if (!Modifier.isPublic(declaredMethod.getModifiers()) || !Modifier.isStatic(declaredMethod.getModifiers())) {
                    declaredMethod = null;
                }
            } catch (Throwable unused) {
            }
            this._preHandler = declaredMethod;
        }
        Object objInvoke = declaredMethod != null ? declaredMethod.invoke(null, null) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
