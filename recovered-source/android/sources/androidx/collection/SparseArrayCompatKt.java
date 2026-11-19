package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0271e0;
import p058e0.AbstractC6302j;

/* JADX INFO: loaded from: classes.dex */
public final class SparseArrayCompatKt {
    private static final Object DELETED = new Object();

    public static final <E> void commonAppend(SparseArrayCompat<E> sparseArrayCompat, int i2, E e) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        int i3 = sparseArrayCompat.size;
        if (i3 != 0 && i2 <= sparseArrayCompat.keys[i3 - 1]) {
            sparseArrayCompat.put(i2, e);
            return;
        }
        if (sparseArrayCompat.garbage && i3 >= sparseArrayCompat.keys.length) {
            m1972gc(sparseArrayCompat);
        }
        int i4 = sparseArrayCompat.size;
        if (i4 >= sparseArrayCompat.keys.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i4 + 1);
            int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
            AbstractC6452k.m12180d(iArrCopyOf, "copyOf(this, newSize)");
            sparseArrayCompat.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
            AbstractC6452k.m12180d(objArrCopyOf, "copyOf(this, newSize)");
            sparseArrayCompat.values = objArrCopyOf;
        }
        sparseArrayCompat.keys[i4] = i2;
        sparseArrayCompat.values[i4] = e;
        sparseArrayCompat.size = i4 + 1;
    }

    public static final <E> void commonClear(SparseArrayCompat<E> sparseArrayCompat) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        int i2 = sparseArrayCompat.size;
        Object[] objArr = sparseArrayCompat.values;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        sparseArrayCompat.size = 0;
        sparseArrayCompat.garbage = false;
    }

    public static final <E> boolean commonContainsKey(SparseArrayCompat<E> sparseArrayCompat, int i2) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        return sparseArrayCompat.indexOfKey(i2) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0021 A[RETURN] */
    public static final <E> boolean commonContainsValue(SparseArrayCompat<E> sparseArrayCompat, E e) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m1972gc(sparseArrayCompat);
        }
        int i2 = sparseArrayCompat.size;
        int i3 = 0;
        while (i3 < i2) {
            if (sparseArrayCompat.values[i3] == e) {
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

    public static final <E> E commonGet(SparseArrayCompat<E> sparseArrayCompat, int i2) {
        E e;
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
        if (iBinarySearch < 0 || (e = (E) sparseArrayCompat.values[iBinarySearch]) == DELETED) {
            return null;
        }
        return e;
    }

    public static final <E> int commonIndexOfKey(SparseArrayCompat<E> sparseArrayCompat, int i2) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m1972gc(sparseArrayCompat);
        }
        return ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
    }

    public static final <E> int commonIndexOfValue(SparseArrayCompat<E> sparseArrayCompat, E e) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m1972gc(sparseArrayCompat);
        }
        int i2 = sparseArrayCompat.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (sparseArrayCompat.values[i3] == e) {
                return i3;
            }
        }
        return -1;
    }

    public static final <E> boolean commonIsEmpty(SparseArrayCompat<E> sparseArrayCompat) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        return sparseArrayCompat.size() == 0;
    }

    public static final <E> int commonKeyAt(SparseArrayCompat<E> sparseArrayCompat, int i2) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m1972gc(sparseArrayCompat);
        }
        return sparseArrayCompat.keys[i2];
    }

    public static final <E> void commonPut(SparseArrayCompat<E> sparseArrayCompat, int i2, E e) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
        if (iBinarySearch >= 0) {
            sparseArrayCompat.values[iBinarySearch] = e;
            return;
        }
        int i3 = ~iBinarySearch;
        if (i3 < sparseArrayCompat.size && sparseArrayCompat.values[i3] == DELETED) {
            sparseArrayCompat.keys[i3] = i2;
            sparseArrayCompat.values[i3] = e;
            return;
        }
        if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
            m1972gc(sparseArrayCompat);
            i3 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
        }
        int i4 = sparseArrayCompat.size;
        if (i4 >= sparseArrayCompat.keys.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i4 + 1);
            int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
            AbstractC6452k.m12180d(iArrCopyOf, "copyOf(this, newSize)");
            sparseArrayCompat.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
            AbstractC6452k.m12180d(objArrCopyOf, "copyOf(this, newSize)");
            sparseArrayCompat.values = objArrCopyOf;
        }
        int i5 = sparseArrayCompat.size;
        if (i5 - i3 != 0) {
            int[] iArr = sparseArrayCompat.keys;
            int i6 = i3 + 1;
            AbstractC6302j.m12098t(i6, i3, iArr, iArr, i5);
            Object[] objArr = sparseArrayCompat.values;
            AbstractC6302j.m12097s(i6, i3, sparseArrayCompat.size, objArr, objArr);
        }
        sparseArrayCompat.keys[i3] = i2;
        sparseArrayCompat.values[i3] = e;
        sparseArrayCompat.size++;
    }

    public static final <E> void commonPutAll(SparseArrayCompat<E> sparseArrayCompat, SparseArrayCompat<? extends E> other) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        AbstractC6452k.m12181e(other, "other");
        int size = other.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = other.keyAt(i2);
            E eValueAt = other.valueAt(i2);
            int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, iKeyAt);
            if (iBinarySearch >= 0) {
                sparseArrayCompat.values[iBinarySearch] = eValueAt;
            } else {
                int i3 = ~iBinarySearch;
                if (i3 >= sparseArrayCompat.size || sparseArrayCompat.values[i3] != DELETED) {
                    if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                        m1972gc(sparseArrayCompat);
                        i3 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, iKeyAt);
                    }
                    int i4 = sparseArrayCompat.size;
                    if (i4 >= sparseArrayCompat.keys.length) {
                        int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i4 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
                        AbstractC6452k.m12180d(iArrCopyOf, "copyOf(this, newSize)");
                        sparseArrayCompat.keys = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
                        AbstractC6452k.m12180d(objArrCopyOf, "copyOf(this, newSize)");
                        sparseArrayCompat.values = objArrCopyOf;
                    }
                    int i5 = sparseArrayCompat.size;
                    if (i5 - i3 != 0) {
                        int[] iArr = sparseArrayCompat.keys;
                        int i6 = i3 + 1;
                        AbstractC6302j.m12098t(i6, i3, iArr, iArr, i5);
                        Object[] objArr = sparseArrayCompat.values;
                        AbstractC6302j.m12097s(i6, i3, sparseArrayCompat.size, objArr, objArr);
                    }
                    sparseArrayCompat.keys[i3] = iKeyAt;
                    sparseArrayCompat.values[i3] = eValueAt;
                    sparseArrayCompat.size++;
                } else {
                    sparseArrayCompat.keys[i3] = iKeyAt;
                    sparseArrayCompat.values[i3] = eValueAt;
                }
            }
        }
    }

    public static final <E> E commonPutIfAbsent(SparseArrayCompat<E> sparseArrayCompat, int i2, E e) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        E e2 = (E) commonGet(sparseArrayCompat, i2);
        if (e2 == null) {
            int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
            if (iBinarySearch >= 0) {
                sparseArrayCompat.values[iBinarySearch] = e;
                return e2;
            }
            int i3 = ~iBinarySearch;
            if (i3 < sparseArrayCompat.size && sparseArrayCompat.values[i3] == DELETED) {
                sparseArrayCompat.keys[i3] = i2;
                sparseArrayCompat.values[i3] = e;
                return e2;
            }
            if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                m1972gc(sparseArrayCompat);
                i3 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
            }
            int i4 = sparseArrayCompat.size;
            if (i4 >= sparseArrayCompat.keys.length) {
                int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i4 + 1);
                int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
                AbstractC6452k.m12180d(iArrCopyOf, "copyOf(this, newSize)");
                sparseArrayCompat.keys = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
                AbstractC6452k.m12180d(objArrCopyOf, "copyOf(this, newSize)");
                sparseArrayCompat.values = objArrCopyOf;
            }
            int i5 = sparseArrayCompat.size;
            if (i5 - i3 != 0) {
                int[] iArr = sparseArrayCompat.keys;
                int i6 = i3 + 1;
                AbstractC6302j.m12098t(i6, i3, iArr, iArr, i5);
                Object[] objArr = sparseArrayCompat.values;
                AbstractC6302j.m12097s(i6, i3, sparseArrayCompat.size, objArr, objArr);
            }
            sparseArrayCompat.keys[i3] = i2;
            sparseArrayCompat.values[i3] = e;
            sparseArrayCompat.size++;
        }
        return e2;
    }

    public static final <E> void commonRemove(SparseArrayCompat<E> sparseArrayCompat, int i2) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
        if (iBinarySearch >= 0) {
            Object[] objArr = sparseArrayCompat.values;
            Object obj = objArr[iBinarySearch];
            Object obj2 = DELETED;
            if (obj != obj2) {
                objArr[iBinarySearch] = obj2;
                sparseArrayCompat.garbage = true;
            }
        }
    }

    public static final <E> void commonRemoveAt(SparseArrayCompat<E> sparseArrayCompat, int i2) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.values[i2] != DELETED) {
            sparseArrayCompat.values[i2] = DELETED;
            sparseArrayCompat.garbage = true;
        }
    }

    public static final <E> void commonRemoveAtRange(SparseArrayCompat<E> sparseArrayCompat, int i2, int i3) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        int iMin = Math.min(i3, i2 + i3);
        while (i2 < iMin) {
            sparseArrayCompat.removeAt(i2);
            i2++;
        }
    }

    public static final <E> E commonReplace(SparseArrayCompat<E> sparseArrayCompat, int i2, E e) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        int iIndexOfKey = sparseArrayCompat.indexOfKey(i2);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = sparseArrayCompat.values;
        E e2 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e;
        return e2;
    }

    public static final <E> void commonSetValueAt(SparseArrayCompat<E> sparseArrayCompat, int i2, E e) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m1972gc(sparseArrayCompat);
        }
        sparseArrayCompat.values[i2] = e;
    }

    public static final <E> int commonSize(SparseArrayCompat<E> sparseArrayCompat) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m1972gc(sparseArrayCompat);
        }
        return sparseArrayCompat.size;
    }

    public static final <E> String commonToString(SparseArrayCompat<E> sparseArrayCompat) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(sparseArrayCompat.size * 28);
        sb.append('{');
        int i2 = sparseArrayCompat.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(sparseArrayCompat.keyAt(i3));
            sb.append('=');
            E eValueAt = sparseArrayCompat.valueAt(i3);
            if (eValueAt != sparseArrayCompat) {
                sb.append(eValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        return AbstractC0271e0.m400h(sb, '}', "buffer.toString()");
    }

    public static final <E> E commonValueAt(SparseArrayCompat<E> sparseArrayCompat, int i2) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m1972gc(sparseArrayCompat);
        }
        return (E) sparseArrayCompat.values[i2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: gc */
    public static final <E> void m1972gc(SparseArrayCompat<E> sparseArrayCompat) {
        int i2 = sparseArrayCompat.size;
        int[] iArr = sparseArrayCompat.keys;
        Object[] objArr = sparseArrayCompat.values;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != DELETED) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        sparseArrayCompat.garbage = false;
        sparseArrayCompat.size = i3;
    }

    private static final <E, T extends E> T internalGet(SparseArrayCompat<E> sparseArrayCompat, int i2, T t) {
        T t2;
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
        return (iBinarySearch < 0 || (t2 = (T) sparseArrayCompat.values[iBinarySearch]) == DELETED) ? t : t2;
    }

    public static final <E> E commonGet(SparseArrayCompat<E> sparseArrayCompat, int i2, E e) {
        E e2;
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
        return (iBinarySearch < 0 || (e2 = (E) sparseArrayCompat.values[iBinarySearch]) == DELETED) ? e : e2;
    }

    public static final <E> boolean commonReplace(SparseArrayCompat<E> sparseArrayCompat, int i2, E e, E e2) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        int iIndexOfKey = sparseArrayCompat.indexOfKey(i2);
        if (iIndexOfKey < 0 || !AbstractC6452k.m12177a(sparseArrayCompat.values[iIndexOfKey], e)) {
            return false;
        }
        sparseArrayCompat.values[iIndexOfKey] = e2;
        return true;
    }

    public static final <E> boolean commonRemove(SparseArrayCompat<E> sparseArrayCompat, int i2, Object obj) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        int iIndexOfKey = sparseArrayCompat.indexOfKey(i2);
        if (iIndexOfKey < 0 || !AbstractC6452k.m12177a(obj, sparseArrayCompat.valueAt(iIndexOfKey))) {
            return false;
        }
        sparseArrayCompat.removeAt(iIndexOfKey);
        return true;
    }
}
