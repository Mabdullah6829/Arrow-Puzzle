package androidx.collection;

import kotlin.jvm.internal.AbstractC6452k;
import p057d0.C6283e;

/* JADX INFO: loaded from: classes.dex */
public final class ArrayMapKt {
    public static final <K, V> ArrayMap<K, V> arrayMapOf() {
        return new ArrayMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> ArrayMap<K, V> arrayMapOf(C6283e... pairs) {
        AbstractC6452k.m12181e(pairs, "pairs");
        ArrayMap<K, V> arrayMap = (ArrayMap<K, V>) new ArrayMap(pairs.length);
        for (C6283e c6283e : pairs) {
            arrayMap.put(c6283e.f24308s, c6283e.f24309t);
        }
        return arrayMap;
    }
}
