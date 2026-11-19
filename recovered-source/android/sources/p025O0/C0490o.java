package p025O0;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0242F;
import p021M0.InterfaceC0339d;

/* JADX INFO: renamed from: O0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0490o implements InterfaceC0339d, InterfaceC0477b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0339d f1037a;

    /* JADX INFO: renamed from: b */
    public final String f1038b;

    /* JADX INFO: renamed from: c */
    public final Set f1039c;

    public C0490o(InterfaceC0339d original) {
        AbstractC6452k.m12181e(original, "original");
        this.f1037a = original;
        this.f1038b = original.mo496a() + '?';
        this.f1039c = AbstractC0486k.m1174a(original);
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: a */
    public final String mo496a() {
        return this.f1038b;
    }

    @Override // p025O0.InterfaceC0477b
    /* JADX INFO: renamed from: b */
    public final Set mo1173b() {
        return this.f1039c;
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: c */
    public final boolean mo497c() {
        return true;
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: d */
    public final int mo498d(String name) {
        AbstractC6452k.m12181e(name, "name");
        return this.f1037a.mo498d(name);
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: e */
    public final int mo499e() {
        return this.f1037a.mo499e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0490o) {
            return AbstractC6452k.m12177a(this.f1037a, ((C0490o) obj).f1037a);
        }
        return false;
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: f */
    public final String mo500f(int i2) {
        return this.f1037a.mo500f(i2);
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: g */
    public final List mo501g(int i2) {
        return this.f1037a.mo501g(i2);
    }

    @Override // p021M0.InterfaceC0339d
    public final List getAnnotations() {
        return this.f1037a.getAnnotations();
    }

    @Override // p021M0.InterfaceC0339d
    public final AbstractC0242F getKind() {
        return this.f1037a.getKind();
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: h */
    public final InterfaceC0339d mo502h(int i2) {
        return this.f1037a.mo502h(i2);
    }

    public final int hashCode() {
        return this.f1037a.hashCode() * 31;
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: i */
    public final boolean mo503i(int i2) {
        return this.f1037a.mo503i(i2);
    }

    @Override // p021M0.InterfaceC0339d
    public final boolean isInline() {
        return this.f1037a.isInline();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1037a);
        sb.append('?');
        return sb.toString();
    }
}
