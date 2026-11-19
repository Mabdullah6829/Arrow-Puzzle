package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import p037U0.AbstractC0846b;
import p058e0.AbstractC6302j;
import p058e0.AbstractC6306n;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateViewModelFactoryKt {
    private static final List<Class<?>> ANDROID_VIEWMODEL_SIGNATURE = AbstractC6306n.m12120r(Application.class, SavedStateHandle.class);
    private static final List<Class<?>> VIEWMODEL_SIGNATURE = AbstractC0846b.m1752k(SavedStateHandle.class);

    public static final <T> Constructor<T> findMatchingConstructor(Class<T> modelClass, List<? extends Class<?>> signature) {
        AbstractC6452k.m12181e(modelClass, "modelClass");
        AbstractC6452k.m12181e(signature, "signature");
        Object[] constructors = modelClass.getConstructors();
        AbstractC6452k.m12180d(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC6452k.m12180d(parameterTypes, "constructor.parameterTypes");
            List listM12094E = AbstractC6302j.m12094E(parameterTypes);
            if (signature.equals(listM12094E)) {
                return constructor;
            }
            if (signature.size() == listM12094E.size() && listM12094E.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final <T extends ViewModel> T newInstance(Class<T> modelClass, Constructor<T> constructor, Object... params) {
        AbstractC6452k.m12181e(modelClass, "modelClass");
        AbstractC6452k.m12181e(constructor, "constructor");
        AbstractC6452k.m12181e(params, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + modelClass, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e3.getCause());
        }
    }
}
