package p010F0;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlin.jvm.internal.AbstractC6452k;
import p002B0.AbstractC0105e;
import p002B0.C0101a;
import p002B0.C0104d;
import p058e0.C6303k;
import p089x0.AbstractC6566i;
import p089x0.C6558a;

/* JADX INFO: renamed from: F0.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0227m {

    /* JADX INFO: renamed from: a */
    public static final C0104d f459a;

    static {
        String property;
        int i2 = AbstractC0234t.f468a;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            Iterator it = Arrays.asList(new C0101a()).iterator();
            AbstractC6452k.m12181e(it, "<this>");
            Iterator it2 = AbstractC6566i.m12221w(new C6558a(new C6303k(it, 3))).iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    ((C0101a) next).getClass();
                    do {
                        ((C0101a) it2.next()).getClass();
                    } while (it2.hasNext());
                }
            }
            if (((C0101a) next) == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null) {
                throw new IllegalStateException("The main looper is not available");
            }
            f459a = new C0104d(AbstractC0105e.m173a(mainLooper), false);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
