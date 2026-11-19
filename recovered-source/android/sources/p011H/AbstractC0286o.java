package p011H;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: H.o */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0286o {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m427a(Unsafe unsafe, AbstractC0290s abstractC0290s, long j2, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractC0290s, j2, obj, obj2)) {
            if (unsafe.getObject(abstractC0290s, j2) != obj) {
                return false;
            }
        }
        return true;
    }
}
