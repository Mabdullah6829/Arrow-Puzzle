package p003C;

/* JADX INFO: renamed from: C.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C0132w extends AbstractC0120k {

    /* JADX INFO: renamed from: v */
    public final transient AbstractC0119j f199v;

    /* JADX INFO: renamed from: w */
    public final transient C0133x f200w;

    public C0132w(AbstractC0119j abstractC0119j, C0133x c0133x) {
        this.f199v = abstractC0119j;
        this.f200w = c0133x;
    }

    @Override // p003C.AbstractC0120k, p003C.AbstractC0111b
    /* JADX INFO: renamed from: a */
    public final AbstractC0116g mo174a() {
        return this.f200w;
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: b */
    public final int mo175b(int i2, Object[] objArr) {
        return this.f200w.mo175b(i2, objArr);
    }

    @Override // p003C.AbstractC0111b, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f199v.get(obj) != null;
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: j */
    public final boolean mo179j() {
        return true;
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: k */
    public final AbstractC0109D iterator() {
        return this.f200w.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((C0134y) this.f199v).f207x;
    }
}
