package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p057d0.C6283e;
import p058e0.AbstractC6302j;
import p078p0.InterfaceC6487a;
import p078p0.InterfaceC6502p;
import p089x0.InterfaceC6563f;

/* JADX INFO: loaded from: classes.dex */
public final class MutableScatterMap<K, V> extends ScatterMap<K, V> {
    private int growthLimit;

    public final class MutableMapWrapper extends ScatterMap<K, V>.MapWrapper implements Map<K, V> {
        public MutableMapWrapper() {
            super();
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public void clear() {
            MutableScatterMap.this.clear();
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        public Set<Map.Entry<K, V>> getEntries() {
            return new MutableScatterMap$MutableMapWrapper$entries$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        public Set<K> getKeys() {
            return new MutableScatterMap$MutableMapWrapper$keys$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        public Collection<V> getValues() {
            return new MutableScatterMap$MutableMapWrapper$values$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public V put(K k2, V v) {
            return MutableScatterMap.this.put(k2, v);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public void putAll(Map<? extends K, ? extends V> from) {
            AbstractC6452k.m12181e(from, "from");
            for (Map.Entry<? extends K, ? extends V> entry : from.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public V remove(Object obj) {
            return MutableScatterMap.this.remove(obj);
        }
    }

    public MutableScatterMap() {
        this(0, 1, null);
    }

    private final void adjustStorage() {
        int i2 = this._capacity;
        if (i2 > 8) {
            if (Long.compare((((long) this._size) * 32) ^ Long.MIN_VALUE, (((long) i2) * 25) ^ Long.MIN_VALUE) <= 0) {
                resizeStorage(this._capacity);
                return;
            }
        }
        resizeStorage(ScatterMapKt.nextCapacity(this._capacity));
    }

    private final int findFirstAvailableSlot(int i2) {
        int i3 = this._capacity;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = j2 & ((~j2) << 7) & (-9187201950435737472L);
            if (j3 != 0) {
                return (i4 + (Long.numberOfTrailingZeros(j3) >> 3)) & i3;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    private final void initializeMetadata(int i2) {
        long[] jArr;
        if (i2 == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            jArr = new long[((i2 + 15) & (-8)) >> 3];
            AbstractC6302j.m12091B(jArr);
        }
        this.metadata = jArr;
        int i3 = i2 >> 3;
        long j2 = 255 << ((i2 & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        initializeGrowth();
    }

    private final void initializeStorage(int i2) {
        int iMax = i2 > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(i2)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.keys = new Object[iMax];
        this.values = new Object[iMax];
    }

    private final void removeDeletedMarkers() {
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i4 >> 3;
            int i6 = (i4 & 7) << 3;
            if (((jArr[i5] >> i6) & 255) == 254) {
                long[] jArr2 = this.metadata;
                jArr2[i5] = (128 << i6) | (jArr2[i5] & (~(255 << i6)));
                int i7 = this._capacity;
                int i8 = ((i4 - 7) & i7) + (i7 & 7);
                int i9 = i8 >> 3;
                int i10 = (i8 & 7) << 3;
                jArr2[i9] = ((~(255 << i10)) & jArr2[i9]) | (128 << i10);
                i3++;
            }
        }
        this.growthLimit += i3;
    }

    private final void resizeStorage(int i2) {
        int i3;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i4 = this._capacity;
        initializeStorage(i2);
        Object[] objArr3 = this.keys;
        Object[] objArr4 = this.values;
        int i5 = 0;
        while (i5 < i4) {
            if (((jArr[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i5];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
                int i6 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i6 >>> 7);
                long j2 = i6 & 127;
                long[] jArr2 = this.metadata;
                int i7 = iFindFirstAvailableSlot >> 3;
                int i8 = (iFindFirstAvailableSlot & 7) << 3;
                i3 = i5;
                jArr2[i7] = (jArr2[i7] & (~(255 << i8))) | (j2 << i8);
                int i9 = this._capacity;
                int i10 = ((iFindFirstAvailableSlot - 7) & i9) + (i9 & 7);
                int i11 = i10 >> 3;
                int i12 = (i10 & 7) << 3;
                jArr2[i11] = (jArr2[i11] & (~(255 << i12))) | (j2 << i12);
                objArr3[iFindFirstAvailableSlot] = obj;
                objArr4[iFindFirstAvailableSlot] = objArr2[i3];
            } else {
                i3 = i5;
            }
            i5 = i3 + 1;
        }
    }

    private final void writeMetadata(int i2, long j2) {
        long[] jArr = this.metadata;
        int i3 = i2 >> 3;
        int i4 = (i2 & 7) << 3;
        jArr[i3] = (jArr[i3] & (~(255 << i4))) | (j2 << i4);
        int i5 = this._capacity;
        int i6 = ((i2 - 7) & i5) + (i5 & 7);
        int i7 = i6 >> 3;
        int i8 = (i6 & 7) << 3;
        jArr[i7] = (j2 << i8) | (jArr[i7] & (~(255 << i8)));
    }

    public final Map<K, V> asMutableMap() {
        return new MutableMapWrapper();
    }

    public final void clear() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMapKt.EmptyGroup) {
            AbstractC6302j.m12091B(jArr);
            long[] jArr2 = this.metadata;
            int i2 = this._capacity;
            int i3 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j2)) | j2;
        }
        AbstractC6302j.m12090A(this.values, 0, this._capacity);
        AbstractC6302j.m12090A(this.keys, 0, this._capacity);
        initializeGrowth();
    }

    public final V compute(K k2, InterfaceC6502p computeBlock) {
        AbstractC6452k.m12181e(computeBlock, "computeBlock");
        int iFindInsertIndex = findInsertIndex(k2);
        boolean z = iFindInsertIndex < 0;
        V v = (V) computeBlock.invoke(k2, z ? null : this.values[iFindInsertIndex]);
        if (!z) {
            this.values[iFindInsertIndex] = v;
            return v;
        }
        int i2 = ~iFindInsertIndex;
        this.keys[i2] = k2;
        this.values[i2] = v;
        return v;
    }

    public final int findInsertIndex(K k2) {
        int iHashCode = (k2 != null ? k2.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this._capacity;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j2 = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j3 = i4;
            int i10 = i4;
            long j4 = j2 ^ (j3 * ScatterMapKt.BitmaskLsb);
            for (long j5 = (~j4) & (j4 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int iNumberOfTrailingZeros = (i6 + (Long.numberOfTrailingZeros(j5) >> 3)) & i5;
                if (AbstractC6452k.m12177a(this.keys[iNumberOfTrailingZeros], k2)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j2) << 6) & j2 & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                }
                this._size++;
                int i11 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i12 = iFindFirstAvailableSlot >> 3;
                long j6 = jArr2[i12];
                int i13 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit = i11 - (((j6 >> i13) & 255) == 128 ? 1 : 0);
                jArr2[i12] = (j6 & (~(255 << i13))) | (j3 << i13);
                int i14 = this._capacity;
                int i15 = ((iFindFirstAvailableSlot - 7) & i14) + (i14 & 7);
                int i16 = i15 >> 3;
                int i17 = (i15 & 7) << 3;
                jArr2[i16] = ((~(255 << i17)) & jArr2[i16]) | (j3 << i17);
                return ~iFindFirstAvailableSlot;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i4 = i10;
        }
    }

    public final V getOrPut(K k2, InterfaceC6487a defaultValue) {
        AbstractC6452k.m12181e(defaultValue, "defaultValue");
        V v = get(k2);
        if (v != null) {
            return v;
        }
        V v2 = (V) defaultValue.invoke();
        set(k2, v2);
        return v2;
    }

    public final void minusAssign(K k2) {
        remove(k2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(C6283e pair) {
        AbstractC6452k.m12181e(pair, "pair");
        set(pair.f24308s, pair.f24309t);
    }

    public final V put(K k2, V v) {
        int iFindInsertIndex = findInsertIndex(k2);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        Object[] objArr = this.values;
        V v2 = (V) objArr[iFindInsertIndex];
        this.keys[iFindInsertIndex] = k2;
        objArr[iFindInsertIndex] = v;
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(C6283e[] pairs) {
        AbstractC6452k.m12181e(pairs, "pairs");
        for (C6283e c6283e : pairs) {
            set(c6283e.f24308s, c6283e.f24309t);
        }
    }

    public final V remove(K k2) {
        int iNumberOfTrailingZeros;
        int i2 = 0;
        int iHashCode = (k2 != null ? k2.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 & 127;
        int i5 = this._capacity;
        int i6 = i3 >>> 7;
        loop0: while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.metadata;
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j2 = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j3 = (((long) i4) * ScatterMapKt.BitmaskLsb) ^ j2;
            for (long j4 = (~j3) & (j3 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i7) & i5;
                if (AbstractC6452k.m12177a(this.keys[iNumberOfTrailingZeros], k2)) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i2 += 8;
            i6 = i7 + i2;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return removeValueAt(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final void removeIf(InterfaceC6502p predicate) {
        AbstractC6452k.m12181e(predicate, "predicate");
        long[] jArr = this.metadata;
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
                        int i5 = (i2 << 3) + i4;
                        if (((Boolean) predicate.invoke(this.keys[i5], this.values[i5])).booleanValue()) {
                            removeValueAt(i5);
                        }
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

    public final V removeValueAt(int i2) {
        this._size--;
        long[] jArr = this.metadata;
        int i3 = i2 >> 3;
        int i4 = (i2 & 7) << 3;
        jArr[i3] = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        int i5 = this._capacity;
        int i6 = ((i2 - 7) & i5) + (i5 & 7);
        int i7 = i6 >> 3;
        int i8 = (i6 & 7) << 3;
        jArr[i7] = (jArr[i7] & (~(255 << i8))) | (254 << i8);
        this.keys[i2] = null;
        Object[] objArr = this.values;
        V v = (V) objArr[i2];
        objArr[i2] = null;
        return v;
    }

    public final void set(K k2, V v) {
        int iFindInsertIndex = findInsertIndex(k2);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.keys[iFindInsertIndex] = k2;
        this.values[iFindInsertIndex] = v;
    }

    public final int trim() {
        int i2 = this._capacity;
        int iNormalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (iNormalizeCapacity >= i2) {
            return 0;
        }
        resizeStorage(iNormalizeCapacity);
        return i2 - this._capacity;
    }

    public /* synthetic */ MutableScatterMap(int i2, int i3, AbstractC6447f abstractC6447f) {
        this((i3 & 1) != 0 ? 6 : i2);
    }

    public final void minusAssign(K[] keys) {
        AbstractC6452k.m12181e(keys, "keys");
        for (K k2 : keys) {
            remove(k2);
        }
    }

    public MutableScatterMap(int i2) {
        super(null);
        if (i2 >= 0) {
            initializeStorage(ScatterMapKt.unloadedCapacity(i2));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }

    public final void minusAssign(Iterable<? extends K> keys) {
        AbstractC6452k.m12181e(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(C6283e[] pairs) {
        AbstractC6452k.m12181e(pairs, "pairs");
        putAll(pairs);
    }

    public final void plusAssign(Iterable<? extends C6283e> pairs) {
        AbstractC6452k.m12181e(pairs, "pairs");
        putAll(pairs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(Iterable<? extends C6283e> pairs) {
        AbstractC6452k.m12181e(pairs, "pairs");
        for (C6283e c6283e : pairs) {
            set(c6283e.f24308s, c6283e.f24309t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(InterfaceC6563f keys) {
        AbstractC6452k.m12181e(keys, "keys");
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(InterfaceC6563f pairs) {
        AbstractC6452k.m12181e(pairs, "pairs");
        putAll(pairs);
    }

    public final void plusAssign(Map<K, ? extends V> from) {
        AbstractC6452k.m12181e(from, "from");
        putAll(from);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<K> keys) {
        AbstractC6452k.m12181e(keys, "keys");
        Object[] objArr = keys.elements;
        long[] jArr = keys.metadata;
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

    public final void plusAssign(ScatterMap<K, V> from) {
        AbstractC6452k.m12181e(from, "from");
        putAll(from);
    }

    public final boolean remove(K k2, V v) {
        int iNumberOfTrailingZeros;
        int iHashCode = (k2 != null ? k2.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this._capacity;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (((long) i3) * ScatterMapKt.BitmaskLsb) ^ j2;
            for (long j4 = (~j3) & (j3 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (AbstractC6452k.m12177a(this.keys[iNumberOfTrailingZeros], k2)) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (iNumberOfTrailingZeros < 0 || !AbstractC6452k.m12177a(this.values[iNumberOfTrailingZeros], v)) {
            return false;
        }
        removeValueAt(iNumberOfTrailingZeros);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(InterfaceC6563f pairs) {
        AbstractC6452k.m12181e(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            C6283e c6283e = (C6283e) it.next();
            set(c6283e.f24308s, c6283e.f24309t);
        }
    }

    public final void putAll(Map<K, ? extends V> from) {
        AbstractC6452k.m12181e(from, "from");
        for (Map.Entry<K, ? extends V> entry : from.entrySet()) {
            set(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<K> keys) {
        AbstractC6452k.m12181e(keys, "keys");
        Object[] objArr = keys.content;
        int i2 = keys._size;
        for (int i3 = 0; i3 < i2; i3++) {
            remove(objArr[i3]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(ScatterMap<K, V> from) {
        AbstractC6452k.m12181e(from, "from");
        Object[] objArr = from.keys;
        Object[] objArr2 = from.values;
        long[] jArr = from.metadata;
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
                        int i5 = (i2 << 3) + i4;
                        set(objArr[i5], objArr2[i5]);
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
}
