package p003C;

import java.util.Objects;
import p001B.AbstractC0076b;

/* JADX INFO: renamed from: C.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C0129t extends AbstractC0116g {

    /* JADX INFO: renamed from: w */
    public static final C0129t f192w = new C0129t(0, new Object[0]);

    /* JADX INFO: renamed from: u */
    public final transient Object[] f193u;

    /* JADX INFO: renamed from: v */
    public final transient int f194v;

    public C0129t(int i2, Object[] objArr) {
        this.f193u = objArr;
        this.f194v = i2;
    }

    @Override // p003C.AbstractC0116g, p003C.AbstractC0111b
    /* JADX INFO: renamed from: b */
    public final int mo175b(int i2, Object[] objArr) {
        Object[] objArr2 = this.f193u;
        int i3 = this.f194v;
        System.arraycopy(objArr2, 0, objArr, i2, i3);
        return i2 + i3;
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: d */
    public final Object[] mo176d() {
        return this.f193u;
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: g */
    public final int mo177g() {
        return this.f194v;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        AbstractC0076b.m132g(i2, this.f194v);
        Object obj = this.f193u[i2];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: h */
    public final int mo178h() {
        return 0;
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: j */
    public final boolean mo179j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f194v;
    }
}
