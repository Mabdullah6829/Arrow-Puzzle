package p062g0;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0057q;
import p011H.AbstractC0271e0;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: g0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6347b implements InterfaceC6353h, Serializable {

    /* JADX INFO: renamed from: s */
    public final InterfaceC6353h f24406s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC6351f f24407t;

    public C6347b(InterfaceC6353h left, InterfaceC6351f element) {
        AbstractC6452k.m12181e(left, "left");
        AbstractC6452k.m12181e(element, "element");
        this.f24406s = left;
        this.f24407t = element;
    }

    public final boolean equals(Object obj) {
        boolean zM12177a;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6347b) {
            C6347b c6347b = (C6347b) obj;
            c6347b.getClass();
            int i2 = 2;
            C6347b c6347b2 = c6347b;
            int i3 = 2;
            while (true) {
                InterfaceC6353h interfaceC6353h = c6347b2.f24406s;
                c6347b2 = interfaceC6353h instanceof C6347b ? (C6347b) interfaceC6353h : null;
                if (c6347b2 == null) {
                    break;
                }
                i3++;
            }
            C6347b c6347b3 = this;
            while (true) {
                InterfaceC6353h interfaceC6353h2 = c6347b3.f24406s;
                c6347b3 = interfaceC6353h2 instanceof C6347b ? (C6347b) interfaceC6353h2 : null;
                if (c6347b3 == null) {
                    break;
                }
                i2++;
            }
            if (i3 == i2) {
                C6347b c6347b4 = this;
                while (true) {
                    InterfaceC6351f interfaceC6351f = c6347b4.f24407t;
                    if (!AbstractC6452k.m12177a(c6347b.get(interfaceC6351f.getKey()), interfaceC6351f)) {
                        zM12177a = false;
                        break;
                    }
                    InterfaceC6353h interfaceC6353h3 = c6347b4.f24406s;
                    if (!(interfaceC6353h3 instanceof C6347b)) {
                        AbstractC6452k.m12179c(interfaceC6353h3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        InterfaceC6351f interfaceC6351f2 = (InterfaceC6351f) interfaceC6353h3;
                        zM12177a = AbstractC6452k.m12177a(c6347b.get(interfaceC6351f2.getKey()), interfaceC6351f2);
                        break;
                    }
                    c6347b4 = (C6347b) interfaceC6353h3;
                }
                if (zM12177a) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p062g0.InterfaceC6353h
    public final Object fold(Object obj, InterfaceC6502p interfaceC6502p) {
        return interfaceC6502p.invoke(this.f24406s.fold(obj, interfaceC6502p), this.f24407t);
    }

    @Override // p062g0.InterfaceC6353h
    public final InterfaceC6351f get(InterfaceC6352g key) {
        AbstractC6452k.m12181e(key, "key");
        C6347b c6347b = this;
        while (true) {
            InterfaceC6351f interfaceC6351f = c6347b.f24407t.get(key);
            if (interfaceC6351f != null) {
                return interfaceC6351f;
            }
            InterfaceC6353h interfaceC6353h = c6347b.f24406s;
            if (!(interfaceC6353h instanceof C6347b)) {
                return interfaceC6353h.get(key);
            }
            c6347b = (C6347b) interfaceC6353h;
        }
    }

    public final int hashCode() {
        return this.f24407t.hashCode() + this.f24406s.hashCode();
    }

    @Override // p062g0.InterfaceC6353h
    public final InterfaceC6353h minusKey(InterfaceC6352g key) {
        AbstractC6452k.m12181e(key, "key");
        InterfaceC6351f interfaceC6351f = this.f24407t;
        InterfaceC6351f interfaceC6351f2 = interfaceC6351f.get(key);
        InterfaceC6353h interfaceC6353h = this.f24406s;
        if (interfaceC6351f2 != null) {
            return interfaceC6353h;
        }
        InterfaceC6353h interfaceC6353hMinusKey = interfaceC6353h.minusKey(key);
        if (interfaceC6353hMinusKey == interfaceC6353h) {
            return this;
        }
        return interfaceC6353hMinusKey == C6354i.f24409s ? interfaceC6351f : new C6347b(interfaceC6353hMinusKey, interfaceC6351f);
    }

    @Override // p062g0.InterfaceC6353h
    public final InterfaceC6353h plus(InterfaceC6353h context) {
        AbstractC6452k.m12181e(context, "context");
        return context == C6354i.f24409s ? this : (InterfaceC6353h) context.fold(this, new C0057q(10));
    }

    public final String toString() {
        return AbstractC0271e0.m401i(new StringBuilder("["), (String) fold("", new C0057q(9)), ']');
    }
}
