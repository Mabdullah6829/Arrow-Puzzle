package p011H;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: H.m */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0284m {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m425a(Unsafe unsafe, AbstractC0290s abstractC0290s, long j2, C0289r c0289r, C0289r c0289r2) {
        while (!unsafe.compareAndSwapObject(abstractC0290s, j2, c0289r, c0289r2)) {
            if (unsafe.getObject(abstractC0290s, j2) != c0289r) {
                return false;
            }
        }
        return true;
    }
}
