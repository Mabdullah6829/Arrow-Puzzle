package p058e0;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: renamed from: e0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C6301i extends AbstractC6299g {

    /* JADX INFO: renamed from: v */
    public static final Object[] f24331v = new Object[0];

    /* JADX INFO: renamed from: s */
    public int f24332s;

    /* JADX INFO: renamed from: t */
    public Object[] f24333t = f24331v;

    /* JADX INFO: renamed from: u */
    public int f24334u;

    @Override // p058e0.AbstractC6299g
    /* JADX INFO: renamed from: a */
    public final int mo12081a() {
        return this.f24334u;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        AbstractC6452k.m12181e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        m12089n();
        m12084g(elements.size() + mo12081a());
        m12083d(m12088m(mo12081a() + this.f24332s), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        m12089n();
        m12084g(this.f24334u + 1);
        int length = this.f24332s;
        if (length == 0) {
            Object[] objArr = this.f24333t;
            AbstractC6452k.m12181e(objArr, "<this>");
            length = objArr.length;
        }
        int i2 = length - 1;
        this.f24332s = i2;
        this.f24333t[i2] = obj;
        this.f24334u++;
    }

    public final void addLast(Object obj) {
        m12089n();
        m12084g(mo12081a() + 1);
        this.f24333t[m12088m(mo12081a() + this.f24332s)] = obj;
        this.f24334u = mo12081a() + 1;
    }

    @Override // p058e0.AbstractC6299g
    /* JADX INFO: renamed from: b */
    public final Object mo12082b(int i2) {
        C6294b c6294b = AbstractC6298f.Companion;
        int i3 = this.f24334u;
        c6294b.getClass();
        C6294b.m12077a(i2, i3);
        if (i2 == AbstractC6306n.m12119q(this)) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        m12089n();
        int iM12088m = m12088m(this.f24332s + i2);
        Object[] objArr = this.f24333t;
        Object obj = objArr[iM12088m];
        if (i2 < (this.f24334u >> 1)) {
            int i4 = this.f24332s;
            if (iM12088m >= i4) {
                AbstractC6302j.m12097s(i4 + 1, i4, iM12088m, objArr, objArr);
            } else {
                AbstractC6302j.m12097s(1, 0, iM12088m, objArr, objArr);
                Object[] objArr2 = this.f24333t;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.f24332s;
                AbstractC6302j.m12097s(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f24333t;
            int i6 = this.f24332s;
            objArr3[i6] = null;
            this.f24332s = m12085h(i6);
        } else {
            int iM12088m2 = m12088m(AbstractC6306n.m12119q(this) + this.f24332s);
            if (iM12088m <= iM12088m2) {
                Object[] objArr4 = this.f24333t;
                AbstractC6302j.m12097s(iM12088m, iM12088m + 1, iM12088m2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f24333t;
                AbstractC6302j.m12097s(iM12088m, iM12088m + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f24333t;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC6302j.m12097s(0, 1, iM12088m2 + 1, objArr6, objArr6);
            }
            this.f24333t[iM12088m2] = null;
        }
        this.f24334u--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m12089n();
            m12087k(this.f24332s, m12088m(mo12081a() + this.f24332s));
        }
        this.f24332s = 0;
        this.f24334u = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m12083d(int i2, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f24333t.length;
        while (i2 < length && it.hasNext()) {
            this.f24333t[i2] = it.next();
            i2++;
        }
        int i3 = this.f24332s;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.f24333t[i4] = it.next();
        }
        this.f24334u = collection.size() + this.f24334u;
    }

    /* JADX INFO: renamed from: g */
    public final void m12084g(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f24333t;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == f24331v) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f24333t = new Object[i2];
            return;
        }
        C6294b c6294b = AbstractC6298f.Companion;
        int length = objArr.length;
        c6294b.getClass();
        Object[] objArr2 = new Object[C6294b.m12080d(length, i2)];
        Object[] objArr3 = this.f24333t;
        AbstractC6302j.m12097s(0, this.f24332s, objArr3.length, objArr3, objArr2);
        Object[] objArr4 = this.f24333t;
        int length2 = objArr4.length;
        int i3 = this.f24332s;
        AbstractC6302j.m12097s(length2 - i3, 0, i3, objArr4, objArr2);
        this.f24332s = 0;
        this.f24333t = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        C6294b c6294b = AbstractC6298f.Companion;
        int i3 = this.f24334u;
        c6294b.getClass();
        C6294b.m12077a(i2, i3);
        return this.f24333t[m12088m(this.f24332s + i2)];
    }

    /* JADX INFO: renamed from: h */
    public final int m12085h(int i2) {
        Object[] objArr = this.f24333t;
        AbstractC6452k.m12181e(objArr, "<this>");
        if (i2 == objArr.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i2;
        int iM12088m = m12088m(mo12081a() + this.f24332s);
        int length = this.f24332s;
        if (length < iM12088m) {
            while (length < iM12088m) {
                if (AbstractC6452k.m12177a(obj, this.f24333t[length])) {
                    i2 = this.f24332s;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM12088m) {
            return -1;
        }
        int length2 = this.f24333t.length;
        while (length < length2) {
            if (AbstractC6452k.m12177a(obj, this.f24333t[length])) {
                i2 = this.f24332s;
            } else {
                length++;
            }
        }
        for (int i3 = 0; i3 < iM12088m; i3++) {
            if (AbstractC6452k.m12177a(obj, this.f24333t[i3])) {
                length = i3 + this.f24333t.length;
                i2 = this.f24332s;
            }
        }
        return -1;
        return length - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo12081a() == 0;
    }

    /* JADX INFO: renamed from: j */
    public final int m12086j(int i2) {
        return i2 < 0 ? i2 + this.f24333t.length : i2;
    }

    /* JADX INFO: renamed from: k */
    public final void m12087k(int i2, int i3) {
        if (i2 < i3) {
            AbstractC6302j.m12090A(this.f24333t, i2, i3);
            return;
        }
        Object[] objArr = this.f24333t;
        AbstractC6302j.m12090A(objArr, i2, objArr.length);
        AbstractC6302j.m12090A(this.f24333t, 0, i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i2;
        int iM12088m = m12088m(this.f24334u + this.f24332s);
        int i3 = this.f24332s;
        if (i3 < iM12088m) {
            length = iM12088m - 1;
            if (i3 <= length) {
                while (!AbstractC6452k.m12177a(obj, this.f24333t[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i2 = this.f24332s;
                return length - i2;
            }
            return -1;
        }
        if (i3 > iM12088m) {
            for (int i4 = iM12088m - 1; -1 < i4; i4--) {
                if (AbstractC6452k.m12177a(obj, this.f24333t[i4])) {
                    length = i4 + this.f24333t.length;
                    i2 = this.f24332s;
                    return length - i2;
                }
            }
            Object[] objArr = this.f24333t;
            AbstractC6452k.m12181e(objArr, "<this>");
            length = objArr.length - 1;
            int i5 = this.f24332s;
            if (i5 <= length) {
                while (!AbstractC6452k.m12177a(obj, this.f24333t[length])) {
                    if (length != i5) {
                        length--;
                    }
                }
                i2 = this.f24332s;
                return length - i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: m */
    public final int m12088m(int i2) {
        Object[] objArr = this.f24333t;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    /* JADX INFO: renamed from: n */
    public final void m12089n() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        mo12082b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int iM12088m;
        AbstractC6452k.m12181e(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f24333t.length != 0) {
            int iM12088m2 = m12088m(this.f24334u + this.f24332s);
            int i2 = this.f24332s;
            if (i2 < iM12088m2) {
                iM12088m = i2;
                while (i2 < iM12088m2) {
                    Object obj = this.f24333t[i2];
                    if (elements.contains(obj)) {
                        z = true;
                    } else {
                        this.f24333t[iM12088m] = obj;
                        iM12088m++;
                    }
                    i2++;
                }
                AbstractC6302j.m12090A(this.f24333t, iM12088m, iM12088m2);
            } else {
                int length = this.f24333t.length;
                boolean z2 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr = this.f24333t;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (elements.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f24333t[i3] = obj2;
                        i3++;
                    }
                    i2++;
                }
                iM12088m = m12088m(i3);
                for (int i4 = 0; i4 < iM12088m2; i4++) {
                    Object[] objArr2 = this.f24333t;
                    Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (elements.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f24333t[iM12088m] = obj3;
                        iM12088m = m12085h(iM12088m);
                    }
                }
                z = z2;
            }
            if (z) {
                m12089n();
                this.f24334u = m12086j(iM12088m - this.f24332s);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m12089n();
        Object[] objArr = this.f24333t;
        int i2 = this.f24332s;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f24332s = m12085h(i2);
        this.f24334u = mo12081a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m12089n();
        int iM12088m = m12088m(AbstractC6306n.m12119q(this) + this.f24332s);
        Object[] objArr = this.f24333t;
        Object obj = objArr[iM12088m];
        objArr[iM12088m] = null;
        this.f24334u = mo12081a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        C6294b c6294b = AbstractC6298f.Companion;
        int i4 = this.f24334u;
        c6294b.getClass();
        C6294b.m12079c(i2, i3, i4);
        int i5 = i3 - i2;
        if (i5 == 0) {
            return;
        }
        if (i5 == this.f24334u) {
            clear();
            return;
        }
        if (i5 == 1) {
            mo12082b(i2);
            return;
        }
        m12089n();
        if (i2 < this.f24334u - i3) {
            int iM12088m = m12088m((i2 - 1) + this.f24332s);
            int iM12088m2 = m12088m((i3 - 1) + this.f24332s);
            while (i2 > 0) {
                int i6 = iM12088m + 1;
                int iMin = Math.min(i2, Math.min(i6, iM12088m2 + 1));
                Object[] objArr = this.f24333t;
                int i7 = iM12088m2 - iMin;
                int i8 = iM12088m - iMin;
                AbstractC6302j.m12097s(i7 + 1, i8 + 1, i6, objArr, objArr);
                iM12088m = m12086j(i8);
                iM12088m2 = m12086j(i7);
                i2 -= iMin;
            }
            int iM12088m3 = m12088m(this.f24332s + i5);
            m12087k(this.f24332s, iM12088m3);
            this.f24332s = iM12088m3;
        } else {
            int iM12088m4 = m12088m(this.f24332s + i3);
            int iM12088m5 = m12088m(this.f24332s + i2);
            int i9 = this.f24334u;
            while (true) {
                i9 -= i3;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f24333t;
                i3 = Math.min(i9, Math.min(objArr2.length - iM12088m4, objArr2.length - iM12088m5));
                Object[] objArr3 = this.f24333t;
                int i10 = iM12088m4 + i3;
                AbstractC6302j.m12097s(iM12088m5, iM12088m4, i10, objArr3, objArr3);
                iM12088m4 = m12088m(i10);
                iM12088m5 = m12088m(iM12088m5 + i3);
            }
            int iM12088m6 = m12088m(this.f24334u + this.f24332s);
            m12087k(m12086j(iM12088m6 - i5), iM12088m6);
        }
        this.f24334u -= i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int iM12088m;
        AbstractC6452k.m12181e(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f24333t.length != 0) {
            int iM12088m2 = m12088m(this.f24334u + this.f24332s);
            int i2 = this.f24332s;
            if (i2 < iM12088m2) {
                iM12088m = i2;
                while (i2 < iM12088m2) {
                    Object obj = this.f24333t[i2];
                    if (elements.contains(obj)) {
                        this.f24333t[iM12088m] = obj;
                        iM12088m++;
                    } else {
                        z = true;
                    }
                    i2++;
                }
                AbstractC6302j.m12090A(this.f24333t, iM12088m, iM12088m2);
            } else {
                int length = this.f24333t.length;
                boolean z2 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr = this.f24333t;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (elements.contains(obj2)) {
                        this.f24333t[i3] = obj2;
                        i3++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                iM12088m = m12088m(i3);
                for (int i4 = 0; i4 < iM12088m2; i4++) {
                    Object[] objArr2 = this.f24333t;
                    Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (elements.contains(obj3)) {
                        this.f24333t[iM12088m] = obj3;
                        iM12088m = m12085h(iM12088m);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m12089n();
                this.f24334u = m12086j(iM12088m - this.f24332s);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        C6294b c6294b = AbstractC6298f.Companion;
        int i3 = this.f24334u;
        c6294b.getClass();
        C6294b.m12077a(i2, i3);
        int iM12088m = m12088m(this.f24332s + i2);
        Object[] objArr = this.f24333t;
        Object obj2 = objArr[iM12088m];
        objArr[iM12088m] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo12081a()]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int length;
        C6294b c6294b = AbstractC6298f.Companion;
        int i3 = this.f24334u;
        c6294b.getClass();
        C6294b.m12078b(i2, i3);
        if (i2 == this.f24334u) {
            addLast(obj);
            return;
        }
        if (i2 == 0) {
            addFirst(obj);
            return;
        }
        m12089n();
        m12084g(this.f24334u + 1);
        int iM12088m = m12088m(this.f24332s + i2);
        int i4 = this.f24334u;
        if (i2 < ((i4 + 1) >> 1)) {
            if (iM12088m == 0) {
                Object[] objArr = this.f24333t;
                AbstractC6452k.m12181e(objArr, "<this>");
                iM12088m = objArr.length;
            }
            int i5 = iM12088m - 1;
            int i6 = this.f24332s;
            if (i6 == 0) {
                Object[] objArr2 = this.f24333t;
                AbstractC6452k.m12181e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i6 - 1;
            }
            int i7 = this.f24332s;
            if (i5 >= i7) {
                Object[] objArr3 = this.f24333t;
                objArr3[length] = objArr3[i7];
                AbstractC6302j.m12097s(i7, i7 + 1, i5 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f24333t;
                AbstractC6302j.m12097s(i7 - 1, i7, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f24333t;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC6302j.m12097s(0, 1, i5 + 1, objArr5, objArr5);
            }
            this.f24333t[i5] = obj;
            this.f24332s = length;
        } else {
            int iM12088m2 = m12088m(i4 + this.f24332s);
            if (iM12088m < iM12088m2) {
                Object[] objArr6 = this.f24333t;
                AbstractC6302j.m12097s(iM12088m + 1, iM12088m, iM12088m2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f24333t;
                AbstractC6302j.m12097s(1, 0, iM12088m2, objArr7, objArr7);
                Object[] objArr8 = this.f24333t;
                objArr8[0] = objArr8[objArr8.length - 1];
                AbstractC6302j.m12097s(iM12088m + 1, iM12088m, objArr8.length - 1, objArr8, objArr8);
            }
            this.f24333t[iM12088m] = obj;
        }
        this.f24334u++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        AbstractC6452k.m12181e(array, "array");
        int length = array.length;
        int i2 = this.f24334u;
        if (length < i2) {
            Object objNewInstance = Array.newInstance(array.getClass().getComponentType(), i2);
            AbstractC6452k.m12179c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) objNewInstance;
        }
        Object[] objArr = array;
        int iM12088m = m12088m(this.f24334u + this.f24332s);
        int i3 = this.f24332s;
        if (i3 < iM12088m) {
            AbstractC6302j.m12103y(this.f24333t, objArr, 0, i3, iM12088m, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f24333t;
            AbstractC6302j.m12097s(0, this.f24332s, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f24333t;
            AbstractC6302j.m12097s(objArr3.length - this.f24332s, 0, iM12088m, objArr3, objArr);
        }
        int i4 = this.f24334u;
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection elements) {
        AbstractC6452k.m12181e(elements, "elements");
        C6294b c6294b = AbstractC6298f.Companion;
        int i3 = this.f24334u;
        c6294b.getClass();
        C6294b.m12078b(i2, i3);
        if (elements.isEmpty()) {
            return false;
        }
        if (i2 == this.f24334u) {
            return addAll(elements);
        }
        m12089n();
        m12084g(elements.size() + this.f24334u);
        int iM12088m = m12088m(this.f24334u + this.f24332s);
        int iM12088m2 = m12088m(this.f24332s + i2);
        int size = elements.size();
        if (i2 < ((this.f24334u + 1) >> 1)) {
            int i4 = this.f24332s;
            int length = i4 - size;
            if (iM12088m2 < i4) {
                Object[] objArr = this.f24333t;
                AbstractC6302j.m12097s(length, i4, objArr.length, objArr, objArr);
                if (size >= iM12088m2) {
                    Object[] objArr2 = this.f24333t;
                    AbstractC6302j.m12097s(objArr2.length - size, 0, iM12088m2, objArr2, objArr2);
                } else {
                    Object[] objArr3 = this.f24333t;
                    AbstractC6302j.m12097s(objArr3.length - size, 0, size, objArr3, objArr3);
                    Object[] objArr4 = this.f24333t;
                    AbstractC6302j.m12097s(0, size, iM12088m2, objArr4, objArr4);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f24333t;
                AbstractC6302j.m12097s(length, i4, iM12088m2, objArr5, objArr5);
            } else {
                Object[] objArr6 = this.f24333t;
                length += objArr6.length;
                int i5 = iM12088m2 - i4;
                int length2 = objArr6.length - length;
                if (length2 >= i5) {
                    AbstractC6302j.m12097s(length, i4, iM12088m2, objArr6, objArr6);
                } else {
                    AbstractC6302j.m12097s(length, i4, i4 + length2, objArr6, objArr6);
                    Object[] objArr7 = this.f24333t;
                    AbstractC6302j.m12097s(0, this.f24332s + length2, iM12088m2, objArr7, objArr7);
                }
            }
            this.f24332s = length;
            m12083d(m12086j(iM12088m2 - size), elements);
            return true;
        }
        int i6 = iM12088m2 + size;
        if (iM12088m2 < iM12088m) {
            int i7 = size + iM12088m;
            Object[] objArr8 = this.f24333t;
            if (i7 <= objArr8.length) {
                AbstractC6302j.m12097s(i6, iM12088m2, iM12088m, objArr8, objArr8);
            } else if (i6 >= objArr8.length) {
                AbstractC6302j.m12097s(i6 - objArr8.length, iM12088m2, iM12088m, objArr8, objArr8);
            } else {
                int length3 = iM12088m - (i7 - objArr8.length);
                AbstractC6302j.m12097s(0, length3, iM12088m, objArr8, objArr8);
                Object[] objArr9 = this.f24333t;
                AbstractC6302j.m12097s(i6, iM12088m2, length3, objArr9, objArr9);
            }
        } else {
            Object[] objArr10 = this.f24333t;
            AbstractC6302j.m12097s(size, 0, iM12088m, objArr10, objArr10);
            Object[] objArr11 = this.f24333t;
            if (i6 >= objArr11.length) {
                AbstractC6302j.m12097s(i6 - objArr11.length, iM12088m2, objArr11.length, objArr11, objArr11);
            } else {
                AbstractC6302j.m12097s(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                Object[] objArr12 = this.f24333t;
                AbstractC6302j.m12097s(i6, iM12088m2, objArr12.length - size, objArr12, objArr12);
            }
        }
        m12083d(iM12088m2, elements);
        return true;
    }
}
