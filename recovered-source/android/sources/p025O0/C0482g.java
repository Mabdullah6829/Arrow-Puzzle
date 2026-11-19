package p025O0;

import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0242F;
import p011H.AbstractC0271e0;
import p021M0.C0341f;
import p021M0.InterfaceC0339d;
import p058e0.C6313u;
import p091y0.AbstractC6581k;

/* JADX INFO: renamed from: O0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0482g implements InterfaceC0339d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0339d f1012a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0339d f1013b;

    public C0482g(InterfaceC0339d keyDesc, InterfaceC0339d valueDesc) {
        AbstractC6452k.m12181e(keyDesc, "keyDesc");
        AbstractC6452k.m12181e(valueDesc, "valueDesc");
        this.f1012a = keyDesc;
        this.f1013b = valueDesc;
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: a */
    public final String mo496a() {
        return "kotlin.collections.LinkedHashMap";
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
        Integer numM12231p = AbstractC6581k.m12231p(name);
        if (numM12231p != null) {
            return numM12231p.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: e */
    public final int mo499e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0482g)) {
            return false;
        }
        C0482g c0482g = (C0482g) obj;
        c0482g.getClass();
        return AbstractC6452k.m12177a(this.f1012a, c0482g.f1012a) && AbstractC6452k.m12177a(this.f1013b, c0482g.f1013b);
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: f */
    public final String mo500f(int i2) {
        return String.valueOf(i2);
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: g */
    public final List mo501g(int i2) {
        if (i2 >= 0) {
            return C6313u.f24338s;
        }
        throw new IllegalArgumentException(AbstractC0271e0.m397e(i2, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // p021M0.InterfaceC0339d
    public final List getAnnotations() {
        return C6313u.f24338s;
    }

    @Override // p021M0.InterfaceC0339d
    public final AbstractC0242F getKind() {
        return C0341f.f682d;
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: h */
    public final InterfaceC0339d mo502h(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0271e0.m397e(i2, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i3 = i2 % 2;
        if (i3 == 0) {
            return this.f1012a;
        }
        if (i3 == 1) {
            return this.f1013b;
        }
        throw new IllegalStateException("Unreached");
    }

    public final int hashCode() {
        return this.f1013b.hashCode() + ((this.f1012a.hashCode() + 710441009) * 31);
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: i */
    public final boolean mo503i(int i2) {
        if (i2 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(AbstractC0271e0.m397e(i2, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // p021M0.InterfaceC0339d
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f1012a + ", " + this.f1013b + ')';
    }
}
