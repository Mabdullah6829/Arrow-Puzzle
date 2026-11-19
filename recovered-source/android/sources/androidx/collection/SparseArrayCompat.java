package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0271e0;
import p058e0.AbstractC6302j;

/* JADX INFO: loaded from: classes.dex */
public class SparseArrayCompat<E> implements Cloneable {
    public /* synthetic */ boolean garbage;
    public /* synthetic */ int[] keys;
    public /* synthetic */ int size;
    public /* synthetic */ Object[] values;

    public SparseArrayCompat() {
        this(0, 1, null);
    }

    public void append(int i2, E e) {
        int i3 = this.size;
        if (i3 != 0 && i2 <= this.keys[i3 - 1]) {
            put(i2, e);
            return;
        }
        if (this.garbage && i3 >= this.keys.length) {
            SparseArrayCompatKt.m1972gc(this);
        }
        int i4 = this.size;
        if (i4 >= this.keys.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i4 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.keys, iIdealIntArraySize);
            AbstractC6452k.m12180d(iArrCopyOf, "copyOf(this, newSize)");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
            AbstractC6452k.m12180d(objArrCopyOf, "copyOf(this, newSize)");
            this.values = objArrCopyOf;
        }
        this.keys[i4] = i2;
        this.values[i4] = e;
        this.size = i4 + 1;
    }

    public void clear() {
        int i2 = this.size;
        Object[] objArr = this.values;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    public boolean containsKey(int i2) {
        return indexOfKey(i2) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x001c A[RETURN] */
    public boolean containsValue(E e) {
        if (this.garbage) {
            SparseArrayCompatKt.m1972gc(this);
        }
        int i2 = this.size;
        int i3 = 0;
        while (i3 < i2) {
            if (this.values[i3] == e) {
                if (i3 >= 0) {
                    return true;
                }
                return false;
            }
            i3++;
        }
        i3 = -1;
        if (i3 >= 0) {
            return true;
        }
        return false;
    }

    public void delete(int i2) {
        remove(i2);
    }

    public E get(int i2) {
        return (E) SparseArrayCompatKt.commonGet(this, i2);
    }

    public final boolean getIsEmpty() {
        return isEmpty();
    }

    public int indexOfKey(int i2) {
        if (this.garbage) {
            SparseArrayCompatKt.m1972gc(this);
        }
        return ContainerHelpersKt.binarySearch(this.keys, this.size, i2);
    }

    public int indexOfValue(E e) {
        if (this.garbage) {
            SparseArrayCompatKt.m1972gc(this);
        }
        int i2 = this.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.values[i3] == e) {
                return i3;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int keyAt(int i2) {
        if (this.garbage) {
            SparseArrayCompatKt.m1972gc(this);
        }
        return this.keys[i2];
    }

    public void put(int i2, E e) {
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, i2);
        if (iBinarySearch >= 0) {
            this.values[iBinarySearch] = e;
            return;
        }
        int i3 = ~iBinarySearch;
        if (i3 < this.size && this.values[i3] == SparseArrayCompatKt.DELETED) {
            this.keys[i3] = i2;
            this.values[i3] = e;
            return;
        }
        if (this.garbage && this.size >= this.keys.length) {
            SparseArrayCompatKt.m1972gc(this);
            i3 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, i2);
        }
        int i4 = this.size;
        if (i4 >= this.keys.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i4 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.keys, iIdealIntArraySize);
            AbstractC6452k.m12180d(iArrCopyOf, "copyOf(this, newSize)");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
            AbstractC6452k.m12180d(objArrCopyOf, "copyOf(this, newSize)");
            this.values = objArrCopyOf;
        }
        int i5 = this.size;
        if (i5 - i3 != 0) {
            int[] iArr = this.keys;
            int i6 = i3 + 1;
            AbstractC6302j.m12098t(i6, i3, iArr, iArr, i5);
            Object[] objArr = this.values;
            AbstractC6302j.m12097s(i6, i3, this.size, objArr, objArr);
        }
        this.keys[i3] = i2;
        this.values[i3] = e;
        this.size++;
    }

    public void putAll(SparseArrayCompat<? extends E> other) {
        AbstractC6452k.m12181e(other, "other");
        int size = other.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = other.keyAt(i2);
            E eValueAt = other.valueAt(i2);
            int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, iKeyAt);
            if (iBinarySearch >= 0) {
                this.values[iBinarySearch] = eValueAt;
            } else {
                int i3 = ~iBinarySearch;
                if (i3 >= this.size || this.values[i3] != SparseArrayCompatKt.DELETED) {
                    if (this.garbage && this.size >= this.keys.length) {
                        SparseArrayCompatKt.m1972gc(this);
                        i3 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, iKeyAt);
                    }
                    int i4 = this.size;
                    if (i4 >= this.keys.length) {
                        int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i4 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(this.keys, iIdealIntArraySize);
                        AbstractC6452k.m12180d(iArrCopyOf, "copyOf(this, newSize)");
                        this.keys = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
                        AbstractC6452k.m12180d(objArrCopyOf, "copyOf(this, newSize)");
                        this.values = objArrCopyOf;
                    }
                    int i5 = this.size;
                    if (i5 - i3 != 0) {
                        int[] iArr = this.keys;
                        int i6 = i3 + 1;
                        AbstractC6302j.m12098t(i6, i3, iArr, iArr, i5);
                        Object[] objArr = this.values;
                        AbstractC6302j.m12097s(i6, i3, this.size, objArr, objArr);
                    }
                    this.keys[i3] = iKeyAt;
                    this.values[i3] = eValueAt;
                    this.size++;
                } else {
                    this.keys[i3] = iKeyAt;
                    this.values[i3] = eValueAt;
                }
            }
        }
    }

    public E putIfAbsent(int i2, E e) {
        E e2 = (E) SparseArrayCompatKt.commonGet(this, i2);
        if (e2 == null) {
            int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, i2);
            if (iBinarySearch >= 0) {
                this.values[iBinarySearch] = e;
                return e2;
            }
            int i3 = ~iBinarySearch;
            if (i3 < this.size && this.values[i3] == SparseArrayCompatKt.DELETED) {
                this.keys[i3] = i2;
                this.values[i3] = e;
                return e2;
            }
            if (this.garbage && this.size >= this.keys.length) {
                SparseArrayCompatKt.m1972gc(this);
                i3 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, i2);
            }
            int i4 = this.size;
            if (i4 >= this.keys.length) {
                int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i4 + 1);
                int[] iArrCopyOf = Arrays.copyOf(this.keys, iIdealIntArraySize);
                AbstractC6452k.m12180d(iArrCopyOf, "copyOf(this, newSize)");
                this.keys = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
                AbstractC6452k.m12180d(objArrCopyOf, "copyOf(this, newSize)");
                this.values = objArrCopyOf;
            }
            int i5 = this.size;
            if (i5 - i3 != 0) {
                int[] iArr = this.keys;
                int i6 = i3 + 1;
                AbstractC6302j.m12098t(i6, i3, iArr, iArr, i5);
                Object[] objArr = this.values;
                AbstractC6302j.m12097s(i6, i3, this.size, objArr, objArr);
            }
            this.keys[i3] = i2;
            this.values[i3] = e;
            this.size++;
        }
        return e2;
    }

    public void remove(int i2) {
        SparseArrayCompatKt.commonRemove(this, i2);
    }

    public void removeAt(int i2) {
        if (this.values[i2] != SparseArrayCompatKt.DELETED) {
            this.values[i2] = SparseArrayCompatKt.DELETED;
            this.garbage = true;
        }
    }

    public void removeAtRange(int i2, int i3) {
        int iMin = Math.min(i3, i2 + i3);
        while (i2 < iMin) {
            removeAt(i2);
            i2++;
        }
    }

    public E replace(int i2, E e) {
        int iIndexOfKey = indexOfKey(i2);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.values;
        E e2 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e;
        return e2;
    }

    public void setValueAt(int i2, E e) {
        if (this.garbage) {
            SparseArrayCompatKt.m1972gc(this);
        }
        this.values[i2] = e;
    }

    public int size() {
        if (this.garbage) {
            SparseArrayCompatKt.m1972gc(this);
        }
        return this.size;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i2 = this.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i3));
            sb.append('=');
            E eValueAt = valueAt(i3);
            if (eValueAt != this) {
                sb.append(eValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        return AbstractC0271e0.m400h(sb, '}', "buffer.toString()");
    }

    public E valueAt(int i2) {
        if (this.garbage) {
            SparseArrayCompatKt.m1972gc(this);
        }
        return (E) this.values[i2];
    }

    public SparseArrayCompat(int i2) {
        if (i2 == 0) {
            this.keys = ContainerHelpersKt.EMPTY_INTS;
            this.values = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i2);
            this.keys = new int[iIdealIntArraySize];
            this.values = new Object[iIdealIntArraySize];
        }
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SparseArrayCompat<E> m12271clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC6452k.m12179c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        SparseArrayCompat<E> sparseArrayCompat = (SparseArrayCompat) objClone;
        sparseArrayCompat.keys = (int[]) this.keys.clone();
        sparseArrayCompat.values = (Object[]) this.values.clone();
        return sparseArrayCompat;
    }

    public E get(int i2, E e) {
        return (E) SparseArrayCompatKt.commonGet(this, i2, e);
    }

    public boolean remove(int i2, Object obj) {
        int iIndexOfKey = indexOfKey(i2);
        if (iIndexOfKey < 0 || !AbstractC6452k.m12177a(obj, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public boolean replace(int i2, E e, E e2) {
        int iIndexOfKey = indexOfKey(i2);
        if (iIndexOfKey < 0 || !AbstractC6452k.m12177a(this.values[iIndexOfKey], e)) {
            return false;
        }
        this.values[iIndexOfKey] = e2;
        return true;
    }

    public /* synthetic */ SparseArrayCompat(int i2, int i3, AbstractC6447f abstractC6447f) {
        this((i3 & 1) != 0 ? 10 : i2);
    }
}
