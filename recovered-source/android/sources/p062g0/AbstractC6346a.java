package p062g0;

import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0057q;
import p037U0.AbstractC0846b;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: g0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6346a implements InterfaceC6351f {
    private final InterfaceC6352g key;

    public AbstractC6346a(InterfaceC6352g interfaceC6352g) {
        this.key = interfaceC6352g;
    }

    @Override // p062g0.InterfaceC6353h
    public <R> R fold(R r2, InterfaceC6502p operation) {
        AbstractC6452k.m12181e(operation, "operation");
        return (R) operation.invoke(r2, this);
    }

    @Override // p062g0.InterfaceC6353h
    public InterfaceC6351f get(InterfaceC6352g interfaceC6352g) {
        return AbstractC0846b.m1749h(this, interfaceC6352g);
    }

    @Override // p062g0.InterfaceC6351f
    public InterfaceC6352g getKey() {
        return this.key;
    }

    @Override // p062g0.InterfaceC6353h
    public InterfaceC6353h minusKey(InterfaceC6352g interfaceC6352g) {
        return AbstractC0846b.m1753l(this, interfaceC6352g);
    }

    @Override // p062g0.InterfaceC6353h
    public InterfaceC6353h plus(InterfaceC6353h context) {
        AbstractC6452k.m12181e(context, "context");
        return context == C6354i.f24409s ? this : (InterfaceC6353h) context.fold(this, new C0057q(10));
    }
}
