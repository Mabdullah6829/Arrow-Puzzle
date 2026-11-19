package p001B;

/* JADX INFO: renamed from: B.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C0090p extends AbstractC0088n {

    /* JADX INFO: renamed from: s */
    public final Object f120s;

    public C0090p(Object obj) {
        this.f120s = obj;
    }

    @Override // p001B.AbstractC0088n
    /* JADX INFO: renamed from: a */
    public final Object mo122a() {
        return this.f120s;
    }

    @Override // p001B.AbstractC0088n
    /* JADX INFO: renamed from: b */
    public final boolean mo123b() {
        return true;
    }

    @Override // p001B.AbstractC0088n
    /* JADX INFO: renamed from: c */
    public final Object mo124c(InterfaceC0097w interfaceC0097w) {
        return this.f120s;
    }

    @Override // p001B.AbstractC0088n
    /* JADX INFO: renamed from: d */
    public final Object mo125d() {
        return this.f120s;
    }

    @Override // p001B.AbstractC0088n
    public final boolean equals(Object obj) {
        if (obj instanceof C0090p) {
            return this.f120s.equals(((C0090p) obj).f120s);
        }
        return false;
    }

    @Override // p001B.AbstractC0088n
    public final int hashCode() {
        return this.f120s.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f120s + ")";
    }
}
