package p060f0;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
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

/* JADX INFO: renamed from: f0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6335c extends AbstractC6299g implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: v */
    public static final C6335c f24372v;

    /* JADX INFO: renamed from: s */
    public Object[] f24373s;

    /* JADX INFO: renamed from: t */
    public int f24374t;

    /* JADX INFO: renamed from: u */
    public boolean f24375u;

    static {
        C6335c c6335c = new C6335c(0);
        c6335c.f24375u = true;
        f24372v = c6335c;
    }

    public C6335c(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f24373s = new Object[i2];
    }

    @Override // p058e0.AbstractC6299g
    /* JADX INFO: renamed from: a */
    public final int mo12081a() {
        return this.f24374t;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m12146j();
        int i2 = this.f24374t;
        ((AbstractList) this).modCount++;
        m12147k(i2, 1);
        this.f24373s[i2] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        AbstractC6452k.m12181e(elements, "elements");
        m12146j();
        int size = elements.size();
        m12144g(this.f24374t, elements, size);
        return size > 0;
    }

    @Override // p058e0.AbstractC6299g
    /* JADX INFO: renamed from: b */
    public final Object mo12082b(int i2) {
        m12146j();
        C6294b c6294b = AbstractC6298f.Companion;
        int i3 = this.f24374t;
        c6294b.getClass();
        C6294b.m12077a(i2, i3);
        return m12148m(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m12146j();
        m12149n(0, this.f24374t);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f24373s;
            int i2 = this.f24374t;
            if (i2 == list.size()) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (AbstractC6452k.m12177a(objArr[i3], list.get(i3))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m12144g(int i2, Collection collection, int i3) {
        ((AbstractList) this).modCount++;
        m12147k(i2, i3);
        Iterator it = collection.iterator();
        for (int i4 = 0; i4 < i3; i4++) {
            this.f24373s[i2 + i4] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        C6294b c6294b = AbstractC6298f.Companion;
        int i3 = this.f24374t;
        c6294b.getClass();
        C6294b.m12077a(i2, i3);
        return this.f24373s[i2];
    }

    /* JADX INFO: renamed from: h */
    public final void m12145h(int i2, Object obj) {
        ((AbstractList) this).modCount++;
        m12147k(i2, 1);
        this.f24373s[i2] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f24373s;
        int i2 = this.f24374t;
        int iHashCode = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i3];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i2 = 0; i2 < this.f24374t; i2++) {
            if (AbstractC6452k.m12177a(this.f24373s[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f24374t == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public final void m12146j() {
        if (this.f24375u) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m12147k(int i2, int i3) {
        int i4 = this.f24374t + i3;
        if (i4 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f24373s;
        if (i4 > objArr.length) {
            C6294b c6294b = AbstractC6298f.Companion;
            int length = objArr.length;
            c6294b.getClass();
            int iM12080d = C6294b.m12080d(length, i4);
            Object[] objArr2 = this.f24373s;
            AbstractC6452k.m12181e(objArr2, "<this>");
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, iM12080d);
            AbstractC6452k.m12180d(objArrCopyOf, "copyOf(...)");
            this.f24373s = objArrCopyOf;
        }
        Object[] objArr3 = this.f24373s;
        AbstractC6302j.m12097s(i2 + i3, i2, this.f24374t, objArr3, objArr3);
        this.f24374t += i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i2 = this.f24374t - 1; i2 >= 0; i2--) {
            if (AbstractC6452k.m12177a(this.f24373s[i2], obj)) {
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
    public final Object m12148m(int i2) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f24373s;
        Object obj = objArr[i2];
        AbstractC6302j.m12097s(i2, i2 + 1, this.f24374t, objArr, objArr);
        Object[] objArr2 = this.f24373s;
        int i3 = this.f24374t - 1;
        AbstractC6452k.m12181e(objArr2, "<this>");
        objArr2[i3] = null;
        this.f24374t--;
        return obj;
    }

    /* JADX INFO: renamed from: n */
    public final void m12149n(int i2, int i3) {
        if (i3 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f24373s;
        AbstractC6302j.m12097s(i2, i2 + i3, this.f24374t, objArr, objArr);
        Object[] objArr2 = this.f24373s;
        int i4 = this.f24374t;
        AbstractC0243G.m376n(objArr2, i4 - i3, i4);
        this.f24374t -= i3;
    }

    /* JADX INFO: renamed from: q */
    public final int m12150q(int i2, int i3, Collection collection, boolean z) {
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = i2 + i4;
            if (collection.contains(this.f24373s[i6]) == z) {
                Object[] objArr = this.f24373s;
                i4++;
                objArr[i5 + i2] = objArr[i6];
                i5++;
            } else {
                i4++;
            }
        }
        int i7 = i3 - i5;
        Object[] objArr2 = this.f24373s;
        AbstractC6302j.m12097s(i2 + i5, i3 + i2, this.f24374t, objArr2, objArr2);
        Object[] objArr3 = this.f24373s;
        int i8 = this.f24374t;
        AbstractC0243G.m376n(objArr3, i8 - i7, i8);
        if (i7 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f24374t -= i7;
        return i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m12146j();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo12082b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        AbstractC6452k.m12181e(elements, "elements");
        m12146j();
        return m12150q(0, this.f24374t, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        AbstractC6452k.m12181e(elements, "elements");
        m12146j();
        return m12150q(0, this.f24374t, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        m12146j();
        C6294b c6294b = AbstractC6298f.Companion;
        int i3 = this.f24374t;
        c6294b.getClass();
        C6294b.m12077a(i2, i3);
        Object[] objArr = this.f24373s;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i2, int i3) {
        C6294b c6294b = AbstractC6298f.Companion;
        int i4 = this.f24374t;
        c6294b.getClass();
        C6294b.m12079c(i2, i3, i4);
        return new C6334b(this.f24373s, i2, i3 - i2, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        AbstractC6452k.m12181e(array, "array");
        int length = array.length;
        int i2 = this.f24374t;
        if (length < i2) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f24373s, 0, i2, array.getClass());
            AbstractC6452k.m12180d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        AbstractC6302j.m12097s(0, 0, i2, this.f24373s, array);
        int i3 = this.f24374t;
        if (i3 < array.length) {
            array[i3] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC0243G.m365c(this.f24373s, 0, this.f24374t, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        C6294b c6294b = AbstractC6298f.Companion;
        int i3 = this.f24374t;
        c6294b.getClass();
        C6294b.m12078b(i2, i3);
        return new C6333a(this, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection elements) {
        AbstractC6452k.m12181e(elements, "elements");
        m12146j();
        C6294b c6294b = AbstractC6298f.Companion;
        int i3 = this.f24374t;
        c6294b.getClass();
        C6294b.m12078b(i2, i3);
        int size = elements.size();
        m12144g(i2, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        m12146j();
        C6294b c6294b = AbstractC6298f.Companion;
        int i3 = this.f24374t;
        c6294b.getClass();
        C6294b.m12078b(i2, i3);
        ((AbstractList) this).modCount++;
        m12147k(i2, 1);
        this.f24373s[i2] = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return AbstractC6302j.m12104z(this.f24373s, 0, this.f24374t);
    }
}
