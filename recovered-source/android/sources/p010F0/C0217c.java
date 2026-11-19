package p010F0;

import p000A0.InterfaceC0066v;
import p062g0.InterfaceC6353h;

/* JADX INFO: renamed from: F0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0217c implements InterfaceC0066v {

    /* JADX INFO: renamed from: s */
    public final InterfaceC6353h f432s;

    public C0217c(InterfaceC6353h interfaceC6353h) {
        this.f432s = interfaceC6353h;
    }

    @Override // p000A0.InterfaceC0066v
    public final InterfaceC6353h getCoroutineContext() {
        return this.f432s;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f432s + ')';
    }
}
