package p001B;

/* JADX INFO: renamed from: B.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0075a extends AbstractC0088n {

    /* JADX INFO: renamed from: s */
    public static final C0075a f101s = new C0075a();

    @Override // p001B.AbstractC0088n
    /* JADX INFO: renamed from: a */
    public final Object mo122a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // p001B.AbstractC0088n
    /* JADX INFO: renamed from: b */
    public final boolean mo123b() {
        return false;
    }

    @Override // p001B.AbstractC0088n
    /* JADX INFO: renamed from: c */
    public final Object mo124c(InterfaceC0097w interfaceC0097w) {
        return interfaceC0097w.get();
    }

    @Override // p001B.AbstractC0088n
    /* JADX INFO: renamed from: d */
    public final Object mo125d() {
        return null;
    }

    @Override // p001B.AbstractC0088n
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // p001B.AbstractC0088n
    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
