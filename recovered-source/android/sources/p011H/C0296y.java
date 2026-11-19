package p011H;

import java.util.Set;

/* JADX INFO: renamed from: H.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C0296y extends AbstractC0242F {
    @Override // p011H.AbstractC0242F
    /* JADX INFO: renamed from: e */
    public final void mo361e(C0241E c0241e, Set set) {
        synchronized (c0241e) {
            try {
                if (c0241e.f581z == null) {
                    c0241e.f581z = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p011H.AbstractC0242F
    /* JADX INFO: renamed from: g */
    public final int mo362g(C0241E c0241e) {
        int i2;
        synchronized (c0241e) {
            i2 = c0241e.f580A - 1;
            c0241e.f580A = i2;
        }
        return i2;
    }
}
