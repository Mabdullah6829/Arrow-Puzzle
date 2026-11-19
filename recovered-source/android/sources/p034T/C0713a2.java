package p034T;

import androidx.core.app.NotificationManagerCompat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: T.a2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0713a2 {

    /* JADX INFO: renamed from: a */
    public final int f1669a;

    /* JADX INFO: renamed from: b */
    public final int f1670b;

    /* JADX INFO: renamed from: c */
    public final int f1671c;

    /* JADX INFO: renamed from: d */
    public final AtomicInteger f1672d;

    public C0713a2(float f2, float f3) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.f1672d = atomicInteger;
        this.f1671c = (int) (f3 * 1000.0f);
        int i2 = (int) (f2 * 1000.0f);
        this.f1669a = i2;
        this.f1670b = i2 / 2;
        atomicInteger.set(i2);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1584a() {
        AtomicInteger atomicInteger;
        int i2;
        int i3;
        do {
            atomicInteger = this.f1672d;
            i2 = atomicInteger.get();
            if (i2 == 0) {
                return false;
            }
            i3 = i2 + NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        } while (!atomicInteger.compareAndSet(i2, Math.max(i3, 0)));
        return i3 > this.f1670b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0713a2)) {
            return false;
        }
        C0713a2 c0713a2 = (C0713a2) obj;
        return this.f1669a == c0713a2.f1669a && this.f1671c == c0713a2.f1671c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1669a), Integer.valueOf(this.f1671c)});
    }
}
