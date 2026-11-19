package p003C;

import p037U0.AbstractC0846b;

/* JADX INFO: renamed from: C.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C0135z extends AbstractC0120k {

    /* JADX INFO: renamed from: A */
    public static final Object[] f208A;

    /* JADX INFO: renamed from: B */
    public static final C0135z f209B;

    /* JADX INFO: renamed from: v */
    public final transient Object[] f210v;

    /* JADX INFO: renamed from: w */
    public final transient int f211w;

    /* JADX INFO: renamed from: x */
    public final transient Object[] f212x;

    /* JADX INFO: renamed from: y */
    public final transient int f213y;

    /* JADX INFO: renamed from: z */
    public final transient int f214z;

    static {
        Object[] objArr = new Object[0];
        f208A = objArr;
        f209B = new C0135z(0, 0, 0, objArr, objArr);
    }

    public C0135z(int i2, int i3, int i4, Object[] objArr, Object[] objArr2) {
        this.f210v = objArr;
        this.f211w = i2;
        this.f212x = objArr2;
        this.f213y = i3;
        this.f214z = i4;
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: b */
    public final int mo175b(int i2, Object[] objArr) {
        Object[] objArr2 = this.f210v;
        int i3 = this.f214z;
        System.arraycopy(objArr2, 0, objArr, i2, i3);
        return i2 + i3;
    }

    @Override // p003C.AbstractC0111b, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f212x;
            if (objArr.length != 0) {
                int iM1755n = AbstractC0846b.m1755n(obj.hashCode());
                while (true) {
                    int i2 = iM1755n & this.f213y;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM1755n = i2 + 1;
                }
            }
        }
        return false;
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: d */
    public final Object[] mo176d() {
        return this.f210v;
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: g */
    public final int mo177g() {
        return this.f214z;
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: h */
    public final int mo178h() {
        return 0;
    }

    @Override // p003C.AbstractC0120k, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f211w;
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: j */
    public final boolean mo179j() {
        return false;
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: k */
    public final AbstractC0109D iterator() {
        return mo174a().listIterator(0);
    }

    @Override // p003C.AbstractC0120k
    /* JADX INFO: renamed from: r */
    public final AbstractC0116g mo206r() {
        return AbstractC0116g.m191m(this.f214z, this.f210v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f214z;
    }
}
