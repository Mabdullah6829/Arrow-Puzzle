package p002B0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0243G;
import p057d0.C6284f;

/* JADX INFO: renamed from: B0.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0105e {
    private static volatile Choreographer choreographer;

    static {
        Object objM372j;
        try {
            objM372j = new C0104d(m173a(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            objM372j = AbstractC0243G.m372j(th);
        }
        if (objM372j instanceof C6284f) {
            objM372j = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Handler m173a(Looper looper) throws IllegalAccessException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            AbstractC6452k.m12179c(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
