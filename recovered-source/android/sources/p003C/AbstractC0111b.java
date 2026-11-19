package p003C;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: C.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0111b extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: s */
    public static final Object[] f160s = new Object[0];

    /* JADX INFO: renamed from: a */
    public abstract AbstractC0116g mo174a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo175b(int i2, Object[] objArr);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    /* JADX INFO: renamed from: d */
    public Object[] mo176d() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public int mo177g() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: h */
    public int mo178h() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: j */
    public abstract boolean mo179j();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC0109D iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f160s);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] objArrMo176d = mo176d();
            if (objArrMo176d != null) {
                return Arrays.copyOfRange(objArrMo176d, mo178h(), mo177g(), objArr.getClass());
            }
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        mo175b(0, objArr);
        return objArr;
    }
}
