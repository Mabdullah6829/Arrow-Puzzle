package androidx.collection;

import java.util.Map;
import p080q0.InterfaceC6520a;

/* JADX INFO: loaded from: classes.dex */
final class MapEntry<K, V> implements Map.Entry<K, V>, InterfaceC6520a {
    private final K key;
    private final V value;

    public MapEntry(K k2, V v) {
        this.key = k2;
        this.value = v;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
