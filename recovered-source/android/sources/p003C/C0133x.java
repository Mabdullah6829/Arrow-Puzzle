package p003C;

import java.util.Objects;
import p001B.AbstractC0076b;

/* JADX INFO: renamed from: C.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C0133x extends AbstractC0116g {

    /* JADX INFO: renamed from: u */
    public final transient Object[] f201u;

    /* JADX INFO: renamed from: v */
    public final transient int f202v;

    /* JADX INFO: renamed from: w */
    public final transient int f203w;

    public C0133x(Object[] objArr, int i2, int i3) {
        this.f201u = objArr;
        this.f202v = i2;
        this.f203w = i3;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        AbstractC0076b.m132g(i2, this.f203w);
        Object obj = this.f201u[(i2 * 2) + this.f202v];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: j */
    public final boolean mo179j() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f203w;
    }
}
