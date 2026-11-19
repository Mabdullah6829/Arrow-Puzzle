package p025O0;

import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0242F;
import p011H.AbstractC0271e0;
import p021M0.AbstractC0338c;
import p021M0.InterfaceC0339d;
import p058e0.C6313u;

/* JADX INFO: renamed from: O0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0489n implements InterfaceC0339d {

    /* JADX INFO: renamed from: a */
    public final String f1035a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0338c f1036b;

    public C0489n(String str, AbstractC0338c kind) {
        AbstractC6452k.m12181e(kind, "kind");
        this.f1035a = str;
        this.f1036b = kind;
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: a */
    public final String mo496a() {
        return this.f1035a;
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: c */
    public final boolean mo497c() {
        return false;
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: d */
    public final int mo498d(String name) {
        AbstractC6452k.m12181e(name, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: e */
    public final int mo499e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0489n)) {
            return false;
        }
        C0489n c0489n = (C0489n) obj;
        return AbstractC6452k.m12177a(this.f1035a, c0489n.f1035a) && AbstractC6452k.m12177a(this.f1036b, c0489n.f1036b);
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: f */
    public final String mo500f(int i2) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: g */
    public final List mo501g(int i2) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // p021M0.InterfaceC0339d
    public final List getAnnotations() {
        return C6313u.f24338s;
    }

    @Override // p021M0.InterfaceC0339d
    public final AbstractC0242F getKind() {
        return this.f1036b;
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: h */
    public final InterfaceC0339d mo502h(int i2) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.f1036b.hashCode() * 31) + this.f1035a.hashCode();
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: i */
    public final boolean mo503i(int i2) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // p021M0.InterfaceC0339d
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return AbstractC0271e0.m401i(new StringBuilder("PrimitiveDescriptor("), this.f1035a, ')');
    }
}
