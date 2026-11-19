package p000A0;

import kotlin.jvm.internal.AbstractC6452k;
import p037U0.AbstractC0846b;
import p062g0.C6354i;
import p062g0.InterfaceC6351f;
import p062g0.InterfaceC6352g;
import p062g0.InterfaceC6353h;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: A0.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0062s0 implements InterfaceC6351f, InterfaceC6352g {

    /* JADX INFO: renamed from: s */
    public static final C0062s0 f78s = new C0062s0();

    @Override // p062g0.InterfaceC6353h
    public final Object fold(Object obj, InterfaceC6502p interfaceC6502p) {
        return interfaceC6502p.invoke(obj, this);
    }

    @Override // p062g0.InterfaceC6353h
    public final InterfaceC6351f get(InterfaceC6352g interfaceC6352g) {
        return AbstractC0846b.m1749h(this, interfaceC6352g);
    }

    @Override // p062g0.InterfaceC6353h
    public final InterfaceC6353h minusKey(InterfaceC6352g interfaceC6352g) {
        return AbstractC0846b.m1753l(this, interfaceC6352g);
    }

    @Override // p062g0.InterfaceC6353h
    public final InterfaceC6353h plus(InterfaceC6353h context) {
        AbstractC6452k.m12181e(context, "context");
        return context == C6354i.f24409s ? this : (InterfaceC6353h) context.fold(this, new C0057q(10));
    }

    @Override // p062g0.InterfaceC6351f
    public final InterfaceC6352g getKey() {
        return this;
    }
}
