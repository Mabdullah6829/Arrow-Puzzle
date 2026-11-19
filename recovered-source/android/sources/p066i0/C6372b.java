package p066i0;

import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;

/* JADX INFO: renamed from: i0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6372b implements InterfaceC6348c {

    /* JADX INFO: renamed from: s */
    public static final C6372b f24443s = new C6372b();

    @Override // p062g0.InterfaceC6348c
    public final InterfaceC6353h getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // p062g0.InterfaceC6348c
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
