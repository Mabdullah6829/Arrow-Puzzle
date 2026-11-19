package p066i0;

import p062g0.C6354i;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;

/* JADX INFO: renamed from: i0.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6377g extends AbstractC6371a {
    public AbstractC6377g(InterfaceC6348c interfaceC6348c) {
        super(interfaceC6348c);
        if (interfaceC6348c != null && interfaceC6348c.getContext() != C6354i.f24409s) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // p062g0.InterfaceC6348c
    public InterfaceC6353h getContext() {
        return C6354i.f24409s;
    }
}
