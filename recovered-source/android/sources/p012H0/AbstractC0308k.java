package p012H0;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.TimeUnit;
import p010F0.AbstractC0215a;
import p010F0.AbstractC0234t;

/* JADX INFO: renamed from: H0.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0308k {

    /* JADX INFO: renamed from: a */
    public static final String f616a;

    /* JADX INFO: renamed from: b */
    public static final long f617b;

    /* JADX INFO: renamed from: c */
    public static final int f618c;

    /* JADX INFO: renamed from: d */
    public static final int f619d;

    /* JADX INFO: renamed from: e */
    public static final long f620e;

    /* JADX INFO: renamed from: f */
    public static final C0304g f621f;

    static {
        String property;
        int i2 = AbstractC0234t.f468a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f616a = property;
        f617b = AbstractC0215a.m303i(100000L, 1L, LocationRequestCompat.PASSIVE_INTERVAL, "kotlinx.coroutines.scheduler.resolution.ns");
        int i3 = AbstractC0234t.f468a;
        if (i3 < 2) {
            i3 = 2;
        }
        f618c = AbstractC0215a.m304j(i3, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f619d = AbstractC0215a.m304j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f620e = TimeUnit.SECONDS.toNanos(AbstractC0215a.m303i(60L, 1L, LocationRequestCompat.PASSIVE_INTERVAL, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f621f = C0304g.f611a;
    }
}
