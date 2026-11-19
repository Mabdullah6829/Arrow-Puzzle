package p089x0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p058e0.C6303k;

/* JADX INFO: renamed from: x0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6558a implements InterfaceC6563f {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f24776a;

    public C6558a(C6303k c6303k) {
        this.f24776a = new AtomicReference(c6303k);
    }

    @Override // p089x0.InterfaceC6563f
    public final Iterator iterator() {
        InterfaceC6563f interfaceC6563f = (InterfaceC6563f) this.f24776a.getAndSet(null);
        if (interfaceC6563f != null) {
            return interfaceC6563f.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
