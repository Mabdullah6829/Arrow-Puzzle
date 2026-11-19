package androidx.collection;

import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class FloatObjectMapKt {
    private static final MutableFloatObjectMap EmptyFloatObjectMap = new MutableFloatObjectMap(0);

    public static final <V> FloatObjectMap<V> emptyFloatObjectMap() {
        MutableFloatObjectMap mutableFloatObjectMap = EmptyFloatObjectMap;
        AbstractC6452k.m12179c(mutableFloatObjectMap, "null cannot be cast to non-null type androidx.collection.FloatObjectMap<V of androidx.collection.FloatObjectMapKt.emptyFloatObjectMap>");
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf() {
        MutableFloatObjectMap mutableFloatObjectMap = EmptyFloatObjectMap;
        AbstractC6452k.m12179c(mutableFloatObjectMap, "null cannot be cast to non-null type androidx.collection.FloatObjectMap<V of androidx.collection.FloatObjectMapKt.floatObjectMapOf>");
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf() {
        return new MutableFloatObjectMap<>(0, 1, null);
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f2, V v) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f2, v);
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f2, V v) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f2, v);
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f2, V v, float f3, V v2) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f2, v);
        mutableFloatObjectMap.set(f3, v2);
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f2, V v, float f3, V v2) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f2, v);
        mutableFloatObjectMap.set(f3, v2);
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f2, V v, float f3, V v2, float f4, V v3) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f2, v);
        mutableFloatObjectMap.set(f3, v2);
        mutableFloatObjectMap.set(f4, v3);
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f2, V v, float f3, V v2, float f4, V v3) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f2, v);
        mutableFloatObjectMap.set(f3, v2);
        mutableFloatObjectMap.set(f4, v3);
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f2, V v, float f3, V v2, float f4, V v3, float f5, V v4) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f2, v);
        mutableFloatObjectMap.set(f3, v2);
        mutableFloatObjectMap.set(f4, v3);
        mutableFloatObjectMap.set(f5, v4);
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f2, V v, float f3, V v2, float f4, V v3, float f5, V v4) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f2, v);
        mutableFloatObjectMap.set(f3, v2);
        mutableFloatObjectMap.set(f4, v3);
        mutableFloatObjectMap.set(f5, v4);
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f2, V v, float f3, V v2, float f4, V v3, float f5, V v4, float f6, V v5) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f2, v);
        mutableFloatObjectMap.set(f3, v2);
        mutableFloatObjectMap.set(f4, v3);
        mutableFloatObjectMap.set(f5, v4);
        mutableFloatObjectMap.set(f6, v5);
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f2, V v, float f3, V v2, float f4, V v3, float f5, V v4, float f6, V v5) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f2, v);
        mutableFloatObjectMap.set(f3, v2);
        mutableFloatObjectMap.set(f4, v3);
        mutableFloatObjectMap.set(f5, v4);
        mutableFloatObjectMap.set(f6, v5);
        return mutableFloatObjectMap;
    }
}
