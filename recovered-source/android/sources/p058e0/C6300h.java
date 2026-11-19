package p058e0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6452k;
import p080q0.InterfaceC6520a;

/* JADX INFO: renamed from: e0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C6300h implements Collection, InterfaceC6520a {

    /* JADX INFO: renamed from: s */
    public final Object[] f24329s;

    /* JADX INFO: renamed from: t */
    public final boolean f24330t;

    public C6300h(Object[] values, boolean z) {
        AbstractC6452k.m12181e(values, "values");
        this.f24329s = values;
        this.f24330t = z;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        Object[] objArr = this.f24329s;
        AbstractC6452k.m12181e(objArr, "<this>");
        return AbstractC6302j.m12092C(objArr, obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC6452k.m12181e(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f24329s.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Object[] array = this.f24329s;
        AbstractC6452k.m12181e(array, "array");
        return new C6295c(array);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f24329s.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f24329s;
        AbstractC6452k.m12181e(objArr, "<this>");
        if (this.f24330t && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        AbstractC6452k.m12180d(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC6452k.m12181e(array, "array");
        return AbstractC6452k.m12187k(this, array);
    }
}
