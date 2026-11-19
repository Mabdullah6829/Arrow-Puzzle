package p011H;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: H.n */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0285n {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m426a(Unsafe unsafe, AbstractC0290s abstractC0290s, long j2, C0274g c0274g, C0274g c0274g2) {
        while (!unsafe.compareAndSwapObject(abstractC0290s, j2, c0274g, c0274g2)) {
            if (unsafe.getObject(abstractC0290s, j2) != c0274g) {
                return false;
            }
        }
        return true;
    }
}
