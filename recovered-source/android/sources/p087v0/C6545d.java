package p087v0;

/* JADX INFO: renamed from: v0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6545d extends C6543b implements InterfaceC6542a {

    /* JADX INFO: renamed from: v */
    public static final C6545d f24774v = new C6545d(1, 0, 1);

    @Override // p087v0.C6543b
    public final boolean equals(Object obj) {
        if (!(obj instanceof C6545d)) {
            return false;
        }
        if (isEmpty() && ((C6545d) obj).isEmpty()) {
            return true;
        }
        C6545d c6545d = (C6545d) obj;
        return this.f24767s == c6545d.f24767s && this.f24768t == c6545d.f24768t;
    }

    @Override // p087v0.InterfaceC6542a
    public final Comparable getEndInclusive() {
        return Integer.valueOf(this.f24768t);
    }

    @Override // p087v0.InterfaceC6542a
    public final Comparable getStart() {
        return Integer.valueOf(this.f24767s);
    }

    @Override // p087v0.C6543b
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f24767s * 31) + this.f24768t;
    }

    @Override // p087v0.C6543b
    public final boolean isEmpty() {
        return this.f24767s > this.f24768t;
    }

    @Override // p087v0.C6543b
    public final String toString() {
        return this.f24767s + ".." + this.f24768t;
    }
}
