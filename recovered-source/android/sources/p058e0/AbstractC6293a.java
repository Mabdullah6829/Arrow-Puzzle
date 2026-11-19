package p058e0;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6452k;
import p014I0.C0313b;
import p080q0.InterfaceC6520a;

/* JADX INFO: renamed from: e0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6293a implements Collection, InterfaceC6520a {
    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (AbstractC6452k.m12177a(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract int getSize();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC6452k.m12186j(this);
    }

    public String toString() {
        return AbstractC6305m.m12105A(this, ", ", "[", "]", new C0313b(this, 3), 24);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        AbstractC6452k.m12181e(array, "array");
        return (T[]) AbstractC6452k.m12187k(this, array);
    }
}
