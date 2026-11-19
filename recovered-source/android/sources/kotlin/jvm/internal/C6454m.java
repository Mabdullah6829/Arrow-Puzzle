package kotlin.jvm.internal;

/* JADX INFO: renamed from: kotlin.jvm.internal.m */
/* JADX INFO: loaded from: classes.dex */
public final class C6454m implements InterfaceC6445d {

    /* JADX INFO: renamed from: s */
    public final Class f24632s;

    public C6454m(Class jClass) {
        AbstractC6452k.m12181e(jClass, "jClass");
        this.f24632s = jClass;
    }

    @Override // kotlin.jvm.internal.InterfaceC6445d
    /* JADX INFO: renamed from: a */
    public final Class mo12175a() {
        return this.f24632s;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6454m) {
            return AbstractC6452k.m12177a(this.f24632s, ((C6454m) obj).f24632s);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24632s.hashCode();
    }

    public final String toString() {
        return this.f24632s + " (Kotlin reflection is not available)";
    }
}
