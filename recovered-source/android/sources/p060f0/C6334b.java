package p060f0;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0243G;
import p058e0.AbstractC6298f;
import p058e0.AbstractC6299g;
import p058e0.AbstractC6302j;
import p058e0.C6294b;

/* JADX INFO: renamed from: f0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6334b extends AbstractC6299g implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: s */
    public Object[] f24367s;

    /* JADX INFO: renamed from: t */
    public final int f24368t;

    /* JADX INFO: renamed from: u */
    public int f24369u;

    /* JADX INFO: renamed from: v */
    public final C6334b f24370v;

    /* JADX INFO: renamed from: w */
    public final C6335c f24371w;

    public C6334b(Object[] backing, int i2, int i3, C6334b c6334b, C6335c root) {
        AbstractC6452k.m12181e(backing, "backing");
        AbstractC6452k.m12181e(root, "root");
        this.f24367s = backing;
        this.f24368t = i2;
        this.f24369u = i3;
        this.f24370v = c6334b;
        this.f24371w = root;
        ((AbstractList) this).modCount = ((AbstractList) root).modCount;
    }

    @Override // p058e0.AbstractC6299g
    /* JADX INFO: renamed from: a */
    public final int mo12081a() {
        m12138j();
        return this.f24369u;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m12139k();
        m12138j();
        m12137h(this.f24368t + this.f24369u, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        AbstractC6452k.m12181e(elements, "elements");
        m12139k();
        m12138j();
        int size = elements.size();
        m12136g(this.f24368t + this.f24369u, elements, size);
        return size > 0;
    }

    @Override // p058e0.AbstractC6299g
    /* JADX INFO: renamed from: b */
    public final Object mo12082b(int i2) {
        m12139k();
        m12138j();
        C6294b c6294b = AbstractC6298f.Companion;
        int i3 = this.f24369u;
        c6294b.getClass();
        C6294b.m12077a(i2, i3);
        return m12140m(this.f24368t + i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m12139k();
        m12138j();
        m12141n(this.f24368t, this.f24369u);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m12138j();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f24367s;
            int i2 = this.f24369u;
            if (i2 == list.size()) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (AbstractC6452k.m12177a(objArr[this.f24368t + i3], list.get(i3))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m12136g(int i2, Collection collection, int i3) {
        ((AbstractList) this).modCount++;
        C6335c c6335c = this.f24371w;
        C6334b c6334b = this.f24370v;
        if (c6334b != null) {
            c6334b.m12136g(i2, collection, i3);
        } else {
            C6335c c6335c2 = C6335c.f24372v;
            c6335c.m12144g(i2, collection, i3);
        }
        this.f24367s = c6335c.f24373s;
        this.f24369u += i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        m12138j();
        C6294b c6294b = AbstractC6298f.Companion;
        int i3 = this.f24369u;
        c6294b.getClass();
        C6294b.m12077a(i2, i3);
        return this.f24367s[this.f24368t + i2];
    }

    /* JADX INFO: renamed from: h */
    public final void m12137h(int i2, Object obj) {
        ((AbstractList) this).modCount++;
        C6335c c6335c = this.f24371w;
        C6334b c6334b = this.f24370v;
        if (c6334b != null) {
            c6334b.m12137h(i2, obj);
        } else {
            C6335c c6335c2 = C6335c.f24372v;
            c6335c.m12145h(i2, obj);
        }
        this.f24367s = c6335c.f24373s;
        this.f24369u++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m12138j();
        Object[] objArr = this.f24367s;
        int i2 = this.f24369u;
        int iHashCode = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[this.f24368t + i3];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m12138j();
        for (int i2 = 0; i2 < this.f24369u; i2++) {
            if (AbstractC6452k.m12177a(this.f24367s[this.f24368t + i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m12138j();
        return this.f24369u == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public final void m12138j() {
        if (((AbstractList) this.f24371w).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m12139k() {
        if (this.f24371w.f24375u) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m12138j();
        for (int i2 = this.f24369u - 1; i2 >= 0; i2--) {
            if (AbstractC6452k.m12177a(this.f24367s[this.f24368t + i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: m */
    public final Object m12140m(int i2) {
        Object objM12148m;
        ((AbstractList) this).modCount++;
        C6334b c6334b = this.f24370v;
        if (c6334b != null) {
            objM12148m = c6334b.m12140m(i2);
        } else {
            C6335c c6335c = C6335c.f24372v;
            objM12148m = this.f24371w.m12148m(i2);
        }
        this.f24369u--;
        return objM12148m;
    }

    /* JADX INFO: renamed from: n */
    public final void m12141n(int i2, int i3) {
        if (i3 > 0) {
            ((AbstractList) this).modCount++;
        }
        C6334b c6334b = this.f24370v;
        if (c6334b != null) {
            c6334b.m12141n(i2, i3);
        } else {
            C6335c c6335c = C6335c.f24372v;
            this.f24371w.m12149n(i2, i3);
        }
        this.f24369u -= i3;
    }

    /* JADX INFO: renamed from: q */
    public final int m12142q(int i2, int i3, Collection collection, boolean z) {
        int iM12150q;
        C6334b c6334b = this.f24370v;
        if (c6334b != null) {
            iM12150q = c6334b.m12142q(i2, i3, collection, z);
        } else {
            C6335c c6335c = C6335c.f24372v;
            iM12150q = this.f24371w.m12150q(i2, i3, collection, z);
        }
        if (iM12150q > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f24369u -= iM12150q;
        return iM12150q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m12139k();
        m12138j();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo12082b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        AbstractC6452k.m12181e(elements, "elements");
        m12139k();
        m12138j();
        return m12142q(this.f24368t, this.f24369u, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        AbstractC6452k.m12181e(elements, "elements");
        m12139k();
        m12138j();
        return m12142q(this.f24368t, this.f24369u, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        m12139k();
        m12138j();
        C6294b c6294b = AbstractC6298f.Companion;
        int i3 = this.f24369u;
        c6294b.getClass();
        C6294b.m12077a(i2, i3);
        Object[] objArr = this.f24367s;
        int i4 = this.f24368t + i2;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i2, int i3) {
        C6294b c6294b = AbstractC6298f.Companion;
        int i4 = this.f24369u;
        c6294b.getClass();
        C6294b.m12079c(i2, i3, i4);
        return new C6334b(this.f24367s, this.f24368t + i2, i3 - i2, this, this.f24371w);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        AbstractC6452k.m12181e(array, "array");
        m12138j();
        int length = array.length;
        int i2 = this.f24369u;
        int i3 = this.f24368t;
        if (length < i2) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f24367s, i3, i2 + i3, array.getClass());
            AbstractC6452k.m12180d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        AbstractC6302j.m12097s(0, i3, i2 + i3, this.f24367s, array);
        int i4 = this.f24369u;
        if (i4 < array.length) {
            array[i4] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m12138j();
        return AbstractC0243G.m365c(this.f24367s, this.f24368t, this.f24369u, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        m12138j();
        C6294b c6294b = AbstractC6298f.Companion;
        int i3 = this.f24369u;
        c6294b.getClass();
        C6294b.m12078b(i2, i3);
        return new C6333a(this, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        m12139k();
        m12138j();
        C6294b c6294b = AbstractC6298f.Companion;
        int i3 = this.f24369u;
        c6294b.getClass();
        C6294b.m12078b(i2, i3);
        m12137h(this.f24368t + i2, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection elements) {
        AbstractC6452k.m12181e(elements, "elements");
        m12139k();
        m12138j();
        C6294b c6294b = AbstractC6298f.Companion;
        int i3 = this.f24369u;
        c6294b.getClass();
        C6294b.m12078b(i2, i3);
        int size = elements.size();
        m12136g(this.f24368t + i2, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m12138j();
        Object[] objArr = this.f24367s;
        int i2 = this.f24369u;
        int i3 = this.f24368t;
        return AbstractC6302j.m12104z(objArr, i3, i2 + i3);
    }
}
