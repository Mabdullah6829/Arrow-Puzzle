package com.google.firebase.database.collection;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ArraySortedMap<K, V> extends ImmutableSortedMap<K, V> {
    private final Comparator<K> comparator;
    private final K[] keys;
    private final V[] values;

    public ArraySortedMap(Comparator<K> comparator) {
        this.keys = (K[]) new Object[0];
        this.values = (V[]) new Object[0];
        this.comparator = comparator;
    }

    private static <T> T[] addToArray(T[] tArr, int i2, T t) {
        int length = tArr.length + 1;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, i2);
        tArr2[i2] = t;
        System.arraycopy(tArr, i2, tArr2, i2 + 1, (length - i2) - 1);
        return tArr2;
    }

    public static <A, B, C> ArraySortedMap<A, C> buildFrom(List<A> list, Map<B, C> map, ImmutableSortedMap.Builder.KeyTranslator<A, B> keyTranslator, Comparator<A> comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i2 = 0;
        for (A a2 : list) {
            objArr[i2] = a2;
            objArr2[i2] = map.get(keyTranslator.translate(a2));
            i2++;
        }
        return new ArraySortedMap<>(comparator, objArr, objArr2);
    }

    private int findKey(K k2) {
        int i2 = 0;
        for (K k3 : this.keys) {
            if (this.comparator.compare(k2, k3) == 0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private int findKeyOrInsertPosition(K k2) {
        int i2 = 0;
        while (true) {
            K[] kArr = this.keys;
            if (i2 >= kArr.length || this.comparator.compare(kArr[i2], k2) >= 0) {
                break;
            }
            i2++;
        }
        return i2;
    }

    public static <K, V> ArraySortedMap<K, V> fromMap(Map<K, V> map, Comparator<K> comparator) {
        return buildFrom(new ArrayList(map.keySet()), map, ImmutableSortedMap.Builder.identityTranslator(), comparator);
    }

    private Iterator<Map.Entry<K, V>> iterator(int i2, boolean z) {
        return new Iterator<Map.Entry<K, V>>(i2, z) { // from class: com.google.firebase.database.collection.ArraySortedMap.1
            int currentPos;
            final /* synthetic */ int val$pos;
            final /* synthetic */ boolean val$reverse;

            {
                this.val$pos = i2;
                this.val$reverse = z;
                this.currentPos = i2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.val$reverse) {
                    return this.currentPos >= 0;
                }
                return this.currentPos < ArraySortedMap.this.keys.length;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                Object obj = ArraySortedMap.this.keys[this.currentPos];
                Object[] objArr = ArraySortedMap.this.values;
                int i3 = this.currentPos;
                Object obj2 = objArr[i3];
                this.currentPos = this.val$reverse ? i3 - 1 : i3 + 1;
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
        };
    }

    private static <T> T[] removeFromArray(T[] tArr, int i2) {
        int length = tArr.length - 1;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, i2);
        System.arraycopy(tArr, i2 + 1, tArr2, i2, length - i2);
        return tArr2;
    }

    private static <T> T[] replaceInArray(T[] tArr, int i2, T t) {
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        tArr2[i2] = t;
        return tArr2;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public boolean containsKey(K k2) {
        return findKey(k2) != -1;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public V get(K k2) {
        int iFindKey = findKey(k2);
        if (iFindKey != -1) {
            return this.values[iFindKey];
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public Comparator<K> getComparator() {
        return this.comparator;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public K getMaxKey() {
        K[] kArr = this.keys;
        if (kArr.length > 0) {
            return kArr[kArr.length - 1];
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public K getMinKey() {
        K[] kArr = this.keys;
        if (kArr.length > 0) {
            return kArr[0];
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public K getPredecessorKey(K k2) {
        int iFindKey = findKey(k2);
        if (iFindKey == -1) {
            throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
        }
        if (iFindKey > 0) {
            return this.keys[iFindKey - 1];
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public K getSuccessorKey(K k2) {
        int iFindKey = findKey(k2);
        if (iFindKey == -1) {
            throw new IllegalArgumentException("Can't find successor of nonexistent key");
        }
        K[] kArr = this.keys;
        if (iFindKey < kArr.length - 1) {
            return kArr[iFindKey + 1];
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public void inOrderTraversal(LLRBNode.NodeVisitor<K, V> nodeVisitor) {
        int i2 = 0;
        while (true) {
            K[] kArr = this.keys;
            if (i2 >= kArr.length) {
                return;
            }
            nodeVisitor.visitEntry(kArr[i2], this.values[i2]);
            i2++;
        }
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public int indexOf(K k2) {
        return findKey(k2);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public ImmutableSortedMap<K, V> insert(K k2, V v) {
        int iFindKey = findKey(k2);
        if (iFindKey != -1) {
            K[] kArr = this.keys;
            if (kArr[iFindKey] == k2 && this.values[iFindKey] == v) {
                return this;
            }
            return new ArraySortedMap(this.comparator, replaceInArray(kArr, iFindKey, k2), replaceInArray(this.values, iFindKey, v));
        }
        if (this.keys.length <= 25) {
            int iFindKeyOrInsertPosition = findKeyOrInsertPosition(k2);
            return new ArraySortedMap(this.comparator, addToArray(this.keys, iFindKeyOrInsertPosition, k2), addToArray(this.values, iFindKeyOrInsertPosition, v));
        }
        HashMap map = new HashMap(this.keys.length + 1);
        int i2 = 0;
        while (true) {
            K[] kArr2 = this.keys;
            if (i2 >= kArr2.length) {
                map.put(k2, v);
                return RBTreeSortedMap.fromMap(map, this.comparator);
            }
            map.put(kArr2[i2], this.values[i2]);
            i2++;
        }
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public boolean isEmpty() {
        return this.keys.length == 0;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public Iterator<Map.Entry<K, V>> iteratorFrom(K k2) {
        return iterator(findKeyOrInsertPosition(k2), false);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public ImmutableSortedMap<K, V> remove(K k2) {
        int iFindKey = findKey(k2);
        if (iFindKey == -1) {
            return this;
        }
        return new ArraySortedMap(this.comparator, removeFromArray(this.keys, iFindKey), removeFromArray(this.values, iFindKey));
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public Iterator<Map.Entry<K, V>> reverseIterator() {
        return iterator(this.keys.length - 1, true);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public Iterator<Map.Entry<K, V>> reverseIteratorFrom(K k2) {
        int iFindKeyOrInsertPosition = findKeyOrInsertPosition(k2);
        K[] kArr = this.keys;
        return (iFindKeyOrInsertPosition >= kArr.length || this.comparator.compare(kArr[iFindKeyOrInsertPosition], k2) != 0) ? iterator(iFindKeyOrInsertPosition - 1, true) : iterator(iFindKeyOrInsertPosition, true);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public int size() {
        return this.keys.length;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return iterator(0, false);
    }

    private ArraySortedMap(Comparator<K> comparator, K[] kArr, V[] vArr) {
        this.keys = kArr;
        this.values = vArr;
        this.comparator = comparator;
    }
}
