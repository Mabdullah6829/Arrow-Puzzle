package androidx.core.util;

/* JADX INFO: renamed from: androidx.core.util.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1233b implements Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2709a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2710b;

    public /* synthetic */ C1233b(Object obj, int i2) {
        this.f2709a = i2;
        this.f2710b = obj;
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        switch (this.f2709a) {
            case 0:
                return this.f2710b.equals(obj);
            default:
                return ((Predicate) this.f2710b).lambda$negate$1(obj);
        }
    }
}
