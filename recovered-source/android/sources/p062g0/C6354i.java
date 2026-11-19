package p062g0;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6452k;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: g0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C6354i implements InterfaceC6353h, Serializable {

    /* JADX INFO: renamed from: s */
    public static final C6354i f24409s = new C6354i();

    @Override // p062g0.InterfaceC6353h
    public final InterfaceC6351f get(InterfaceC6352g key) {
        AbstractC6452k.m12181e(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // p062g0.InterfaceC6353h
    public final InterfaceC6353h minusKey(InterfaceC6352g key) {
        AbstractC6452k.m12181e(key, "key");
        return this;
    }

    @Override // p062g0.InterfaceC6353h
    public final InterfaceC6353h plus(InterfaceC6353h context) {
        AbstractC6452k.m12181e(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // p062g0.InterfaceC6353h
    public final Object fold(Object obj, InterfaceC6502p interfaceC6502p) {
        return obj;
    }
}
