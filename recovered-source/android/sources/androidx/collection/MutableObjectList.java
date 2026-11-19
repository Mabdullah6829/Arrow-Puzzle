package androidx.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0271e0;
import p037U0.AbstractC0846b;
import p058e0.AbstractC6302j;
import p058e0.AbstractC6305m;
import p058e0.AbstractC6306n;
import p078p0.InterfaceC6498l;
import p080q0.InterfaceC6520a;
import p087v0.C6545d;
import p089x0.InterfaceC6563f;

/* JADX INFO: loaded from: classes.dex */
public final class MutableObjectList<E> extends ObjectList<E> {
    private ObjectListMutableList<E> list;

    public static final class MutableObjectListIterator<T> implements ListIterator<T>, InterfaceC6520a {
        private final List<T> list;
        private int prevIndex;

        public MutableObjectListIterator(List<T> list, int i2) {
            AbstractC6452k.m12181e(list, "list");
            this.list = list;
            this.prevIndex = i2 - 1;
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            List<T> list = this.list;
            int i2 = this.prevIndex + 1;
            this.prevIndex = i2;
            list.add(i2, t);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.prevIndex < this.list.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.prevIndex >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i2 = this.prevIndex + 1;
            this.prevIndex = i2;
            return list.get(i2);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.prevIndex + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            List<T> list = this.list;
            int i2 = this.prevIndex;
            this.prevIndex = i2 - 1;
            return list.get(i2);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.prevIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.list.remove(this.prevIndex);
            this.prevIndex--;
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            this.list.set(this.prevIndex, t);
        }
    }

    public static final class ObjectListMutableList<T> implements List<T>, InterfaceC6520a {
        private final MutableObjectList<T> objectList;

        public ObjectListMutableList(MutableObjectList<T> objectList) {
            AbstractC6452k.m12181e(objectList, "objectList");
            this.objectList = objectList;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t) {
            return this.objectList.add(t);
        }

        @Override // java.util.List
        public boolean addAll(int i2, Collection<? extends T> elements) {
            AbstractC6452k.m12181e(elements, "elements");
            return this.objectList.addAll(i2, elements);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.objectList.clear();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.objectList.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            AbstractC6452k.m12181e(elements, "elements");
            return this.objectList.containsAll(elements);
        }

        @Override // java.util.List
        public T get(int i2) {
            ObjectListKt.checkIndex(this, i2);
            return this.objectList.get(i2);
        }

        public int getSize() {
            return this.objectList.getSize();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.objectList.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.objectList.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.objectList.lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i2) {
            return removeAt(i2);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            AbstractC6452k.m12181e(elements, "elements");
            return this.objectList.removeAll(elements);
        }

        public T removeAt(int i2) {
            ObjectListKt.checkIndex(this, i2);
            return this.objectList.removeAt(i2);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            AbstractC6452k.m12181e(elements, "elements");
            return this.objectList.retainAll((Collection<? extends T>) elements);
        }

        @Override // java.util.List
        public T set(int i2, T t) {
            ObjectListKt.checkIndex(this, i2);
            return this.objectList.set(i2, t);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<T> subList(int i2, int i3) {
            ObjectListKt.checkSubIndex(this, i2, i3);
            return new SubList(this, i2, i3);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC6452k.m12186j(this);
        }

        @Override // java.util.List
        public void add(int i2, T t) {
            this.objectList.add(i2, t);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            AbstractC6452k.m12181e(elements, "elements");
            return this.objectList.addAll(elements);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i2) {
            return new MutableObjectListIterator(this, i2);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.objectList.remove(obj);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            AbstractC6452k.m12181e(array, "array");
            return (T[]) AbstractC6452k.m12187k(this, array);
        }
    }

    public static final class SubList<T> implements List<T>, InterfaceC6520a {
        private int end;
        private final List<T> list;
        private final int start;

        public SubList(List<T> list, int i2, int i3) {
            AbstractC6452k.m12181e(list, "list");
            this.list = list;
            this.start = i2;
            this.end = i3;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t) {
            List<T> list = this.list;
            int i2 = this.end;
            this.end = i2 + 1;
            list.add(i2, t);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i2, Collection<? extends T> elements) {
            AbstractC6452k.m12181e(elements, "elements");
            this.list.addAll(i2 + this.start, elements);
            this.end = elements.size() + this.end;
            return elements.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i2 = this.end - 1;
            int i3 = this.start;
            if (i3 <= i2) {
                while (true) {
                    this.list.remove(i2);
                    if (i2 == i3) {
                        break;
                    } else {
                        i2--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i2 = this.end;
            for (int i3 = this.start; i3 < i2; i3++) {
                if (AbstractC6452k.m12177a(this.list.get(i3), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            AbstractC6452k.m12181e(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int i2) {
            ObjectListKt.checkIndex(this, i2);
            return this.list.get(i2 + this.start);
        }

        public int getSize() {
            return this.end - this.start;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i2 = this.end;
            for (int i3 = this.start; i3 < i2; i3++) {
                if (AbstractC6452k.m12177a(this.list.get(i3), obj)) {
                    return i3 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i2 = this.end - 1;
            int i3 = this.start;
            if (i3 > i2) {
                return -1;
            }
            while (!AbstractC6452k.m12177a(this.list.get(i2), obj)) {
                if (i2 == i3) {
                    return -1;
                }
                i2--;
            }
            return i2 - this.start;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i2) {
            return removeAt(i2);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            AbstractC6452k.m12181e(elements, "elements");
            int i2 = this.end;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i2 != this.end;
        }

        public T removeAt(int i2) {
            ObjectListKt.checkIndex(this, i2);
            T tRemove = this.list.remove(i2 + this.start);
            this.end--;
            return tRemove;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            AbstractC6452k.m12181e(elements, "elements");
            int i2 = this.end;
            int i3 = i2 - 1;
            int i4 = this.start;
            if (i4 <= i3) {
                while (true) {
                    if (!elements.contains(this.list.get(i3))) {
                        this.list.remove(i3);
                        this.end--;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3--;
                }
            }
            return i2 != this.end;
        }

        @Override // java.util.List
        public T set(int i2, T t) {
            ObjectListKt.checkIndex(this, i2);
            return this.list.set(i2 + this.start, t);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<T> subList(int i2, int i3) {
            ObjectListKt.checkSubIndex(this, i2, i3);
            return new SubList(this, i2, i3);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC6452k.m12186j(this);
        }

        @Override // java.util.List
        public void add(int i2, T t) {
            this.list.add(i2 + this.start, t);
            this.end++;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i2) {
            return new MutableObjectListIterator(this, i2);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i2 = this.end;
            for (int i3 = this.start; i3 < i2; i3++) {
                if (AbstractC6452k.m12177a(this.list.get(i3), obj)) {
                    this.list.remove(i3);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            AbstractC6452k.m12181e(array, "array");
            return (T[]) AbstractC6452k.m12187k(this, array);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            AbstractC6452k.m12181e(elements, "elements");
            this.list.addAll(this.end, elements);
            this.end = elements.size() + this.end;
            return elements.size() > 0;
        }
    }

    public MutableObjectList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableObjectList mutableObjectList, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = mutableObjectList._size;
        }
        mutableObjectList.trim(i2);
    }

    public final boolean add(E e) {
        ensureCapacity(this._size + 1);
        Object[] objArr = this.content;
        int i2 = this._size;
        objArr[i2] = e;
        this._size = i2 + 1;
        return true;
    }

    public final boolean addAll(int i2, E[] elements) {
        int i3;
        AbstractC6452k.m12181e(elements, "elements");
        if (i2 < 0 || i2 > (i3 = this._size)) {
            StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index ", " must be in 0..");
            sbM404l.append(this._size);
            throw new IndexOutOfBoundsException(sbM404l.toString());
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(i3 + elements.length);
        Object[] objArr = this.content;
        int i4 = this._size;
        if (i2 != i4) {
            AbstractC6302j.m12097s(elements.length + i2, i2, i4, objArr, objArr);
        }
        AbstractC6302j.m12103y(elements, objArr, i2, 0, 0, 12);
        this._size += elements.length;
        return true;
    }

    @Override // androidx.collection.ObjectList
    public List<E> asList() {
        return asMutableList();
    }

    public final List<E> asMutableList() {
        ObjectListMutableList<E> objectListMutableList = this.list;
        if (objectListMutableList != null) {
            return objectListMutableList;
        }
        ObjectListMutableList<E> objectListMutableList2 = new ObjectListMutableList<>(this);
        this.list = objectListMutableList2;
        return objectListMutableList2;
    }

    public final void clear() {
        AbstractC6302j.m12090A(this.content, 0, this._size);
        this._size = 0;
    }

    public final void ensureCapacity(int i2) {
        Object[] objArr = this.content;
        if (objArr.length < i2) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(i2, (objArr.length * 3) / 2));
            AbstractC6452k.m12180d(objArrCopyOf, "copyOf(this, newSize)");
            this.content = objArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(E e) {
        remove(e);
    }

    public final void plusAssign(ObjectList<E> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        ensureCapacity(this._size + elements._size);
        AbstractC6302j.m12097s(this._size, 0, elements._size, elements.content, this.content);
        this._size += elements._size;
    }

    public final boolean remove(E e) {
        int iIndexOf = indexOf(e);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(E[] elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int i2 = this._size;
        for (E e : elements) {
            remove(e);
        }
        return i2 != this._size;
    }

    public final E removeAt(int i2) {
        int i3;
        if (i2 < 0 || i2 >= (i3 = this._size)) {
            StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index ", " must be in 0..");
            sbM404l.append(this._size - 1);
            throw new IndexOutOfBoundsException(sbM404l.toString());
        }
        Object[] objArr = this.content;
        E e = (E) objArr[i2];
        if (i2 != i3 - 1) {
            AbstractC6302j.m12097s(i2, i2 + 1, i3, objArr, objArr);
        }
        int i4 = this._size - 1;
        this._size = i4;
        objArr[i4] = null;
        return e;
    }

    public final void removeIf(InterfaceC6498l predicate) {
        AbstractC6452k.m12181e(predicate, "predicate");
        int i2 = this._size;
        Object[] objArr = this.content;
        int i3 = 0;
        C6545d c6545dM1757p = AbstractC0846b.m1757p(0, i2);
        int i4 = c6545dM1757p.f24767s;
        int i5 = c6545dM1757p.f24768t;
        if (i4 <= i5) {
            while (true) {
                objArr[i4 - i3] = objArr[i4];
                if (((Boolean) predicate.invoke(objArr[i4])).booleanValue()) {
                    i3++;
                }
                if (i4 == i5) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        AbstractC6302j.m12090A(objArr, i2 - i3, i2);
        this._size -= i3;
    }

    public final void removeRange(int i2, int i3) {
        int i4;
        if (i2 < 0 || i2 > (i4 = this._size) || i3 < 0 || i3 > i4) {
            StringBuilder sbM409q = AbstractC0271e0.m409q("Start (", i2, ") and end (", i3, ") must be in 0..");
            sbM409q.append(this._size);
            throw new IndexOutOfBoundsException(sbM409q.toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException("Start (" + i2 + ") is more than end (" + i3 + ')');
        }
        if (i3 != i2) {
            if (i3 < i4) {
                Object[] objArr = this.content;
                AbstractC6302j.m12097s(i2, i3, i4, objArr, objArr);
            }
            int i5 = this._size;
            int i6 = i5 - (i3 - i2);
            AbstractC6302j.m12090A(this.content, i6, i5);
            this._size = i6;
        }
    }

    public final boolean retainAll(E[] elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int i2 = this._size;
        Object[] objArr = this.content;
        for (int i3 = i2 - 1; -1 < i3; i3--) {
            if (AbstractC6302j.m12092C(elements, objArr[i3]) < 0) {
                removeAt(i3);
            }
        }
        return i2 != this._size;
    }

    public final E set(int i2, E e) {
        if (i2 < 0 || i2 >= this._size) {
            StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "set index ", " must be between 0 .. ");
            sbM404l.append(this._size - 1);
            throw new IndexOutOfBoundsException(sbM404l.toString());
        }
        Object[] objArr = this.content;
        E e2 = (E) objArr[i2];
        objArr[i2] = e;
        return e2;
    }

    public final void trim(int i2) {
        int iMax = Math.max(i2, this._size);
        Object[] objArr = this.content;
        if (objArr.length > iMax) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, iMax);
            AbstractC6452k.m12180d(objArrCopyOf, "copyOf(this, newSize)");
            this.content = objArrCopyOf;
        }
    }

    public /* synthetic */ MutableObjectList(int i2, int i3, AbstractC6447f abstractC6447f) {
        this((i3 & 1) != 0 ? 16 : i2);
    }

    public final void minusAssign(List<? extends E> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int size = elements.size();
        for (int i2 = 0; i2 < size; i2++) {
            remove(elements.get(i2));
        }
    }

    public MutableObjectList(int i2) {
        super(i2, null);
    }

    public final void add(int i2, E e) {
        int i3;
        if (i2 >= 0 && i2 <= (i3 = this._size)) {
            ensureCapacity(i3 + 1);
            Object[] objArr = this.content;
            int i4 = this._size;
            if (i2 != i4) {
                AbstractC6302j.m12097s(i2 + 1, i2, i4, objArr, objArr);
            }
            objArr[i2] = e;
            this._size++;
            return;
        }
        StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index ", " must be in 0..");
        sbM404l.append(this._size);
        throw new IndexOutOfBoundsException(sbM404l.toString());
    }

    public final void minusAssign(E[] elements) {
        AbstractC6452k.m12181e(elements, "elements");
        for (E e : elements) {
            remove(e);
        }
    }

    public final boolean removeAll(ObjectList<E> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int i2 = this._size;
        minusAssign((ObjectList) elements);
        return i2 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<E> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        Object[] objArr = elements.content;
        int i2 = elements._size;
        for (int i3 = 0; i3 < i2; i3++) {
            remove(objArr[i3]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(ObjectList<E> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int i2 = this._size;
        Object[] objArr = this.content;
        for (int i3 = i2 - 1; -1 < i3; i3--) {
            if (!elements.contains(objArr[i3])) {
                removeAt(i3);
            }
        }
        return i2 != this._size;
    }

    public final boolean removeAll(ScatterSet<E> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int i2 = this._size;
        minusAssign((ScatterSet) elements);
        return i2 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(ScatterSet<E> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        ensureCapacity(elements.getSize() + this._size);
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        add(objArr[(i2 << 3) + i4]);
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<E> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        remove(objArr[(i2 << 3) + i4]);
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final boolean removeAll(List<? extends E> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int i2 = this._size;
        minusAssign((List) elements);
        return i2 != this._size;
    }

    public final boolean retainAll(Collection<? extends E> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int i2 = this._size;
        Object[] objArr = this.content;
        for (int i3 = i2 - 1; -1 < i3; i3--) {
            if (!elements.contains(objArr[i3])) {
                removeAt(i3);
            }
        }
        return i2 != this._size;
    }

    public final boolean removeAll(Iterable<? extends E> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int i2 = this._size;
        minusAssign((Iterable) elements);
        return i2 != this._size;
    }

    public final boolean addAll(int i2, Collection<? extends E> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        if (i2 >= 0 && i2 <= this._size) {
            int i3 = 0;
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(elements.size() + this._size);
            Object[] objArr = this.content;
            if (i2 != this._size) {
                AbstractC6302j.m12097s(elements.size() + i2, i2, this._size, objArr, objArr);
            }
            for (Object obj : elements) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    objArr[i3 + i2] = obj;
                    i3 = i4;
                } else {
                    AbstractC6306n.m12122t();
                    throw null;
                }
            }
            this._size = elements.size() + this._size;
            return true;
        }
        StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index ", " must be in 0..");
        sbM404l.append(this._size);
        throw new IndexOutOfBoundsException(sbM404l.toString());
    }

    public final void minusAssign(Iterable<? extends E> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(E[] elements) {
        AbstractC6452k.m12181e(elements, "elements");
        if (elements.length == 0) {
            return;
        }
        ensureCapacity(this._size + elements.length);
        AbstractC6302j.m12103y(elements, this.content, this._size, 0, 0, 12);
        this._size += elements.length;
    }

    public final boolean removeAll(InterfaceC6563f elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int i2 = this._size;
        minusAssign(elements);
        return i2 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(InterfaceC6563f elements) {
        AbstractC6452k.m12181e(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final boolean retainAll(Iterable<? extends E> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int i2 = this._size;
        Object[] objArr = this.content;
        for (int i3 = i2 - 1; -1 < i3; i3--) {
            if (!AbstractC6305m.m12115w(elements, objArr[i3])) {
                removeAt(i3);
            }
        }
        return i2 != this._size;
    }

    public final void plusAssign(List<? extends E> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int i2 = this._size;
        ensureCapacity(elements.size() + i2);
        Object[] objArr = this.content;
        int size = elements.size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i3 + i2] = elements.get(i3);
        }
        this._size = elements.size() + this._size;
    }

    public final boolean retainAll(InterfaceC6563f elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int i2 = this._size;
        Object[] objArr = this.content;
        int i3 = i2 - 1;
        while (true) {
            int i4 = -1;
            if (-1 >= i3) {
                return i2 != this._size;
            }
            Object obj = objArr[i3];
            int i5 = 0;
            for (Object obj2 : elements) {
                if (i5 >= 0) {
                    if (AbstractC6452k.m12177a(obj, obj2)) {
                        i4 = i5;
                        break;
                    }
                    i5++;
                } else {
                    AbstractC6306n.m12122t();
                    throw null;
                }
            }
            if (!(i4 >= 0)) {
                removeAt(i3);
            }
            i3--;
        }
    }

    public final void plusAssign(E e) {
        add(e);
    }

    public final void plusAssign(Iterable<? extends E> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(InterfaceC6563f elements) {
        AbstractC6452k.m12181e(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final boolean addAll(int i2, ObjectList<E> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        if (i2 >= 0 && i2 <= this._size) {
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements._size);
            Object[] objArr = this.content;
            int i3 = this._size;
            if (i2 != i3) {
                AbstractC6302j.m12097s(elements._size + i2, i2, i3, objArr, objArr);
            }
            AbstractC6302j.m12097s(i2, 0, elements._size, elements.content, objArr);
            this._size += elements._size;
            return true;
        }
        StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index ", " must be in 0..");
        sbM404l.append(this._size);
        throw new IndexOutOfBoundsException(sbM404l.toString());
    }

    public final boolean addAll(ObjectList<E> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int i2 = this._size;
        plusAssign((ObjectList) elements);
        return i2 != this._size;
    }

    public final boolean addAll(ScatterSet<E> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int i2 = this._size;
        plusAssign((ScatterSet) elements);
        return i2 != this._size;
    }

    public final boolean addAll(E[] elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int i2 = this._size;
        plusAssign((Object[]) elements);
        return i2 != this._size;
    }

    public final boolean addAll(List<? extends E> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int i2 = this._size;
        plusAssign((List) elements);
        return i2 != this._size;
    }

    public final boolean addAll(Iterable<? extends E> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int i2 = this._size;
        plusAssign((Iterable) elements);
        return i2 != this._size;
    }

    public final boolean addAll(InterfaceC6563f elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int i2 = this._size;
        plusAssign(elements);
        return i2 != this._size;
    }
}
