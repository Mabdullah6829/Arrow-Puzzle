package androidx.collection;

import java.util.Map;
import kotlin.jvm.internal.AbstractC6452k;
import p080q0.InterfaceC6521b;

/* JADX INFO: loaded from: classes.dex */
final class MutableMapEntry<K, V> implements Map.Entry<K, V>, InterfaceC6521b {
    private final int index;
    private final Object[] keys;
    private final Object[] values;

    public MutableMapEntry(Object[] keys, Object[] values, int i2) {
        AbstractC6452k.m12181e(keys, "keys");
        AbstractC6452k.m12181e(values, "values");
        this.keys = keys;
        this.values = values;
        this.index = i2;
    }

    public static /* synthetic */ void getKey$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return (K) this.keys[this.index];
    }

    public final Object[] getKeys() {
        return this.keys;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return (V) this.values[this.index];
    }

    public final Object[] getValues() {
        return this.values;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        Object[] objArr = this.values;
        int i2 = this.index;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }
}
