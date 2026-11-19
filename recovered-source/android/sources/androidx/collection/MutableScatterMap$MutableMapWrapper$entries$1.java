package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6452k;
import p080q0.InterfaceC6520a;
import p080q0.InterfaceC6521b;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: classes.dex */
public final class MutableScatterMap$MutableMapWrapper$entries$1<K, V> implements Set<Map.Entry<K, V>>, InterfaceC6520a {
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    public MutableScatterMap$MutableMapWrapper$entries$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.this$0 = mutableScatterMap;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends Map.Entry<K, V>> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.this$0.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        if (!(obj instanceof InterfaceC6520a) || (obj instanceof InterfaceC6521b)) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!AbstractC6452k.m12177a(mutableScatterMap.get((K) entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.this$0._size;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.this$0.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new MutableScatterMap$MutableMapWrapper$entries$1$iterator$1(this.this$0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        if (!(obj instanceof InterfaceC6520a) || (obj instanceof InterfaceC6521b)) {
            return remove((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        int i2;
        AbstractC6452k.m12181e(elements, "elements");
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i3 = 0;
        boolean z = false;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((255 & j2) >= 128) {
                        i2 = i4;
                        break;
                        break;
                    }
                    int i7 = (i3 << 3) + i6;
                    Iterator<? extends Object> it = elements.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = i4;
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        i2 = i4;
                        if (AbstractC6452k.m12177a(entry.getKey(), mutableScatterMap.keys[i7]) && AbstractC6452k.m12177a(entry.getValue(), mutableScatterMap.values[i7])) {
                            mutableScatterMap.removeValueAt(i7);
                            z = true;
                            break;
                        }
                        i4 = i2;
                    }
                    j2 >>= i2;
                    i6++;
                    i4 = i2;
                }
                if (i5 != i4) {
                    return z;
                }
            }
            if (i3 == length) {
                return z;
            }
            i3++;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        int i2;
        AbstractC6452k.m12181e(elements, "elements");
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i3 = 0;
        boolean z = false;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((255 & j2) < 128) {
                        int i7 = (i3 << 3) + i6;
                        Iterator<? extends Object> it = elements.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i2 = i4;
                                mutableScatterMap.removeValueAt(i7);
                                z = true;
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            i2 = i4;
                            if (AbstractC6452k.m12177a(entry.getKey(), mutableScatterMap.keys[i7]) && AbstractC6452k.m12177a(entry.getValue(), mutableScatterMap.values[i7])) {
                                break;
                            }
                            i4 = i2;
                        }
                    } else {
                        i2 = i4;
                    }
                    j2 >>= i2;
                    i6++;
                    i4 = i2;
                }
                if (i5 != i4) {
                    return z;
                }
            }
            if (i3 == length) {
                return z;
            }
            i3++;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC6452k.m12186j(this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Map.Entry<K, V> element) {
        AbstractC6452k.m12181e(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        AbstractC6452k.m12181e(array, "array");
        return (T[]) AbstractC6452k.m12187k(this, array);
    }

    public boolean contains(Map.Entry<K, V> element) {
        AbstractC6452k.m12181e(element, "element");
        return AbstractC6452k.m12177a(this.this$0.get(element.getKey()), element.getValue());
    }

    public boolean remove(Map.Entry<K, V> element) {
        int iNumberOfTrailingZeros;
        AbstractC6452k.m12181e(element, "element");
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        K key = element.getKey();
        int iHashCode = (key != null ? key.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = mutableScatterMap._capacity;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = mutableScatterMap.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            int i9 = i5;
            long j2 = (((-i8) >> 63) & (jArr[i7 + 1] << (64 - i8))) | (jArr[i7] >>> i8);
            long j3 = (((long) i3) * ScatterMapKt.BitmaskLsb) ^ j2;
            long j4 = -9187201950435737472L;
            long j5 = (~j3) & (j3 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L);
            while (j5 != 0) {
                iNumberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j5) >> 3)) & i4;
                long j6 = j4;
                if (AbstractC6452k.m12177a(mutableScatterMap.keys[iNumberOfTrailingZeros], key)) {
                    break loop0;
                }
                j5 &= j5 - 1;
                j4 = j6;
            }
            if ((j2 & ((~j2) << 6) & j4) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i9 + i6) & i4;
        }
        if (iNumberOfTrailingZeros < 0 || !AbstractC6452k.m12177a(this.this$0.values[iNumberOfTrailingZeros], element.getValue())) {
            return false;
        }
        this.this$0.removeValueAt(iNumberOfTrailingZeros);
        return true;
    }
}
