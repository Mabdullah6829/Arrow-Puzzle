package p003C;

import p011H.AbstractC0243G;

/* JADX INFO: renamed from: C.B */
/* JADX INFO: loaded from: classes2.dex */
public final class C0107B extends AbstractC0120k {

    /* JADX INFO: renamed from: v */
    public final transient Object f156v;

    public C0107B(Object obj) {
        obj.getClass();
        this.f156v = obj;
    }

    @Override // p003C.AbstractC0120k, p003C.AbstractC0111b
    /* JADX INFO: renamed from: a */
    public final AbstractC0116g mo174a() {
        C0113d c0113d = AbstractC0116g.f168t;
        Object[] objArr = {this.f156v};
        AbstractC0243G.m368f(1, objArr);
        return AbstractC0116g.m191m(1, objArr);
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: b */
    public final int mo175b(int i2, Object[] objArr) {
        objArr[i2] = this.f156v;
        return i2 + 1;
    }

    @Override // p003C.AbstractC0111b, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f156v.equals(obj);
    }

    @Override // p003C.AbstractC0120k, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f156v.hashCode();
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: j */
    public final boolean mo179j() {
        return false;
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: k */
    public final AbstractC0109D iterator() {
        return new C0123n(this.f156v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f156v.toString() + ']';
    }
}
