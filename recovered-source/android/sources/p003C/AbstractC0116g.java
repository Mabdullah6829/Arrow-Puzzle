package p003C;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p001B.AbstractC0076b;
import p011H.AbstractC0243G;

/* JADX INFO: renamed from: C.g */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0116g extends AbstractC0111b implements List, RandomAccess {

    /* JADX INFO: renamed from: t */
    public static final C0113d f168t = new C0113d(C0129t.f192w, 0);

    /* JADX INFO: renamed from: m */
    public static C0129t m191m(int i2, Object[] objArr) {
        return i2 == 0 ? C0129t.f192w : new C0129t(i2, objArr);
    }

    /* JADX INFO: renamed from: n */
    public static C0112c m192n() {
        return new C0112c(4);
    }

    /* JADX INFO: renamed from: q */
    public static AbstractC0116g m193q(Iterable iterable) {
        if (iterable instanceof Collection) {
            return m194r((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return C0129t.f192w;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            Object[] objArr = {next};
            AbstractC0243G.m368f(1, objArr);
            return m191m(1, objArr);
        }
        C0112c c0112c = new C0112c(4);
        c0112c.m185a(next);
        while (it.hasNext()) {
            c0112c.m185a(it.next());
        }
        return c0112c.m187d();
    }

    /* JADX INFO: renamed from: r */
    public static AbstractC0116g m194r(Collection collection) {
        if (!(collection instanceof AbstractC0111b)) {
            Object[] array = collection.toArray();
            AbstractC0243G.m368f(array.length, array);
            return m191m(array.length, array);
        }
        AbstractC0116g abstractC0116gMo174a = ((AbstractC0111b) collection).mo174a();
        if (!abstractC0116gMo174a.mo179j()) {
            return abstractC0116gMo174a;
        }
        Object[] array2 = abstractC0116gMo174a.toArray(AbstractC0111b.f160s);
        return m191m(array2.length, array2);
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: b */
    public int mo175b(int i2, Object[] objArr) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i2 + i3] = get(i3);
        }
        return i2 + size;
    }

    @Override // p003C.AbstractC0111b, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && AbstractC0076b.m140o(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i2 = 0; i2 < size; i2++) {
                        if (AbstractC0076b.m140o(get(i2), list.get(i2))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = ~(~(get(i3).hashCode() + (i2 * 31)));
        }
        return i2;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (obj.equals(get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p003C.AbstractC0111b, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: k */
    public final AbstractC0109D iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final C0113d listIterator(int i2) {
        AbstractC0076b.m135j(i2, size());
        return isEmpty() ? f168t : new C0113d(this, i2);
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: t */
    public AbstractC0116g mo189t() {
        return size() <= 1 ? this : new C0114e(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public AbstractC0116g subList(int i2, int i3) {
        AbstractC0076b.m136k(i2, i3, size());
        int i4 = i3 - i2;
        if (i4 == size()) {
            return this;
        }
        return i4 == 0 ? C0129t.f192w : new C0115f(this, i2, i4);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: a */
    public final AbstractC0116g mo174a() {
        return this;
    }
}
