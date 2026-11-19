package p003C;

import java.util.Map;

/* JADX INFO: renamed from: C.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C0131v extends AbstractC0120k {

    /* JADX INFO: renamed from: v */
    public final transient AbstractC0119j f196v;

    /* JADX INFO: renamed from: w */
    public final transient Object[] f197w;

    /* JADX INFO: renamed from: x */
    public final transient int f198x;

    public C0131v(AbstractC0119j abstractC0119j, Object[] objArr, int i2) {
        this.f196v = abstractC0119j;
        this.f197w = objArr;
        this.f198x = i2;
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: b */
    public final int mo175b(int i2, Object[] objArr) {
        return mo174a().mo175b(i2, objArr);
    }

    @Override // p003C.AbstractC0111b, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f196v.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: j */
    public final boolean mo179j() {
        return true;
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: k */
    public final AbstractC0109D iterator() {
        return mo174a().listIterator(0);
    }

    @Override // p003C.AbstractC0120k
    /* JADX INFO: renamed from: r */
    public final AbstractC0116g mo206r() {
        return new C0130u(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f198x;
    }
}
