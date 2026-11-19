package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0271e0;
import p078p0.InterfaceC6487a;
import p078p0.InterfaceC6498l;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes.dex */
public abstract class IntObjectMap<V> {
    public int _capacity;
    public int _size;
    public int[] keys;
    public long[] metadata;
    public Object[] values;

    public /* synthetic */ IntObjectMap(AbstractC6447f abstractC6447f) {
        this();
    }

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    public static /* synthetic */ void get_capacity$collection$annotations() {
    }

    public static /* synthetic */ void get_size$collection$annotations() {
    }

    public static /* synthetic */ String joinToString$default(IntObjectMap intObjectMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i3 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i3 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return intObjectMap.joinToString(charSequence, charSequence2, charSequence6, i2, charSequence5);
    }

    public final boolean all(InterfaceC6502p predicate) {
        AbstractC6452k.m12181e(predicate, "predicate");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        if (!((Boolean) predicate.invoke(Integer.valueOf(iArr[i5]), objArr[i5])).booleanValue()) {
                            return false;
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return true;
                }
            }
            if (i2 == length) {
                return true;
            }
            i2++;
        }
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final boolean contains(int i2) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i2) * ScatterMapKt.MurmurHashC1;
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 & 127;
        int i5 = this._capacity;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j2 = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j3 = (((long) i4) * ScatterMapKt.BitmaskLsb) ^ j2;
            for (long j4 = (~j3) & (j3 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i6) & i5;
                if (this.keys[iNumberOfTrailingZeros] == i2) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final boolean containsKey(int i2) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i2) * ScatterMapKt.MurmurHashC1;
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 & 127;
        int i5 = this._capacity;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j2 = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j3 = (((long) i4) * ScatterMapKt.BitmaskLsb) ^ j2;
            for (long j4 = (~j3) & (j3 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i6) & i5;
                if (this.keys[iNumberOfTrailingZeros] == i2) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[LOOP:0: B:5:0x000b->B:18:0x0045, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[SYNTHETIC] */
    public final boolean containsValue(V v) {
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128 && AbstractC6452k.m12177a(v, objArr[(i2 << 3) + i4])) {
                            return true;
                        }
                        j2 >>= 8;
                    }
                    if (i3 == 8) {
                        if (i2 != length) {
                            i2++;
                        }
                    }
                } else if (i2 != length) {
                    i2++;
                }
            }
        }
        return false;
    }

    public final int count() {
        return getSize();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075 A[LOOP:0: B:14:0x0027->B:33:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0078 A[EDGE_INSN: B:35:0x0078->B:34:0x0078 BREAK  A[LOOP:0: B:14:0x0027->B:33:0x0075], SYNTHETIC] */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntObjectMap)) {
            return false;
        }
        IntObjectMap intObjectMap = (IntObjectMap) obj;
        if (intObjectMap.getSize() != getSize()) {
            return false;
        }
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            int i6 = iArr[i5];
                            Object obj2 = objArr[i5];
                            if (obj2 == null) {
                                if (intObjectMap.get(i6) != null || !intObjectMap.containsKey(i6)) {
                                    return false;
                                }
                            } else if (!obj2.equals(intObjectMap.get(i6))) {
                                return false;
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return true;
    }

    public final int findKeyIndex$collection(int i2) {
        int iHashCode = Integer.hashCode(i2) * ScatterMapKt.MurmurHashC1;
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 & 127;
        int i5 = this._capacity;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j2 = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j3 = (((long) i4) * ScatterMapKt.BitmaskLsb) ^ j2;
            for (long j4 = (~j3) & (j3 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i6) & i5;
                if (this.keys[iNumberOfTrailingZeros] == i2) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }

    public final void forEach(InterfaceC6502p block) {
        AbstractC6452k.m12181e(block, "block");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
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
                        block.invoke(Integer.valueOf(iArr[i5]), objArr[i5]);
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

    public final void forEachIndexed(InterfaceC6498l block) {
        AbstractC6452k.m12181e(block, "block");
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
                        AbstractC0271e0.m412t(i2 << 3, i4, block);
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

    public final void forEachKey(InterfaceC6498l block) {
        AbstractC6452k.m12181e(block, "block");
        int[] iArr = this.keys;
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
                        block.invoke(Integer.valueOf(iArr[(i2 << 3) + i4]));
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

    public final void forEachValue(InterfaceC6498l block) {
        AbstractC6452k.m12181e(block, "block");
        Object[] objArr = this.values;
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
                        block.invoke(objArr[(i2 << 3) + i4]);
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

    public final V get(int i2) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i2) * ScatterMapKt.MurmurHashC1;
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 & 127;
        int i5 = this._capacity;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j2 = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j3 = (((long) i4) * ScatterMapKt.BitmaskLsb) ^ j2;
            for (long j4 = (~j3) & (j3 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i6) & i5;
                if (this.keys[iNumberOfTrailingZeros] == i2) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return (V) this.values[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final int getCapacity() {
        return this._capacity;
    }

    public final V getOrDefault(int i2, V v) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i2) * ScatterMapKt.MurmurHashC1;
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 & 127;
        int i5 = this._capacity;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j2 = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j3 = (((long) i4) * ScatterMapKt.BitmaskLsb) ^ j2;
            for (long j4 = (~j3) & (j3 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i6) & i5;
                if (this.keys[iNumberOfTrailingZeros] == i2) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        return iNumberOfTrailingZeros >= 0 ? (V) this.values[iNumberOfTrailingZeros] : v;
    }

    public final V getOrElse(int i2, InterfaceC6487a defaultValue) {
        AbstractC6452k.m12181e(defaultValue, "defaultValue");
        V v = get(i2);
        return v == null ? (V) defaultValue.invoke() : v;
    }

    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int iHashCode = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        int i6 = iArr[i5];
                        Object obj = objArr[i5];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i6);
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return iHashCode;
                }
            }
            if (i2 == length) {
                return iHashCode;
            }
            i2++;
        }
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final boolean none() {
        return this._size == 0;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006c A[DONT_INVERT, PHI: r8
  0x006c: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002e, B:22:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006e A[LOOP:0: B:9:0x0020->B:24:0x006e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0071 A[EDGE_INSN: B:28:0x0071->B:25:0x0071 BREAK  A[LOOP:0: B:9:0x0020->B:24:0x006e], SYNTHETIC] */
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j2) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr[i6];
                            Object obj = objArr[i6];
                            sb.append(i7);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i3++;
                            if (i3 < this._size) {
                                sb.append(", ");
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return AbstractC0271e0.m400h(sb, '}', "s.append('}').toString()");
    }

    private IntObjectMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = IntSetKt.getEmptyIntArray();
        this.values = ContainerHelpersKt.EMPTY_OBJECTS;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x005c A[LOOP:0: B:5:0x0016->B:18:0x005c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x005f A[SYNTHETIC] */
    public final boolean any(InterfaceC6502p predicate) {
        AbstractC6452k.m12181e(predicate, "predicate");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (((Boolean) predicate.invoke(Integer.valueOf(iArr[i5]), objArr[i5])).booleanValue()) {
                                return true;
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 == 8) {
                        if (i2 != length) {
                            i2++;
                        }
                    }
                } else if (i2 != length) {
                    i2++;
                }
            }
        }
        return false;
    }

    public final int count(InterfaceC6502p predicate) {
        AbstractC6452k.m12181e(predicate, "predicate");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j2) < 128) {
                        int i6 = (i2 << 3) + i5;
                        if (((Boolean) predicate.invoke(Integer.valueOf(iArr[i6]), objArr[i6])).booleanValue()) {
                            i3++;
                        }
                    }
                    j2 >>= 8;
                }
                if (i4 != 8) {
                    return i3;
                }
            }
            if (i2 == length) {
                return i3;
            }
            i2++;
        }
    }

    public final String joinToString(CharSequence separator) {
        AbstractC6452k.m12181e(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        AbstractC6452k.m12181e(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(IntObjectMap intObjectMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, InterfaceC6502p interfaceC6502p, int i3, Object obj) {
        long[] jArr;
        if (obj == null) {
            CharSequence separator = (i3 & 1) != 0 ? ", " : charSequence;
            CharSequence prefix = (i3 & 2) != 0 ? "" : charSequence2;
            CharSequence postfix = (i3 & 4) == 0 ? charSequence3 : "";
            int i4 = (i3 & 8) != 0 ? -1 : i2;
            CharSequence charSequence5 = (i3 & 16) != 0 ? "..." : charSequence4;
            AbstractC6452k.m12181e(separator, "separator");
            AbstractC6452k.m12181e(prefix, "prefix");
            AbstractC6452k.m12181e(postfix, "postfix");
            StringBuilder sbM407o = AbstractC0271e0.m407o(charSequence5, "truncated", interfaceC6502p, "transform", prefix);
            int[] iArr = intObjectMap.keys;
            Object[] objArr = intObjectMap.values;
            long[] jArr2 = intObjectMap.metadata;
            int length = jArr2.length - 2;
            if (length < 0) {
                sbM407o.append(postfix);
                break;
            }
            int i5 = 0;
            int i6 = 0;
            loop0: while (true) {
                long j2 = jArr2[i5];
                int i7 = i5;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8;
                    int i9 = 8 - ((~(i7 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j2 & 255) < 128) {
                            int i11 = (i7 << 3) + i10;
                            int i12 = iArr[i11];
                            Object obj2 = objArr[i11];
                            if (i6 == i4) {
                                sbM407o.append(charSequence5);
                                break loop0;
                            }
                            if (i6 != 0) {
                                sbM407o.append(separator);
                            }
                            sbM407o.append((CharSequence) interfaceC6502p.invoke(Integer.valueOf(i12), obj2));
                            i6++;
                        }
                        j2 >>= i8;
                        i10++;
                        i8 = i8;
                        jArr2 = jArr2;
                    }
                    jArr = jArr2;
                    if (i9 == i8) {
                    }
                    sbM407o.append(postfix);
                    break;
                }
                jArr = jArr2;
                if (i7 == length) {
                    sbM407o.append(postfix);
                    break;
                }
                i5 = i7 + 1;
                jArr2 = jArr;
            }
            String string = sbM407o.toString();
            AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i2) {
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        AbstractC6452k.m12181e(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i2, null, 16, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, int i2, CharSequence charSequence2) {
        int[] iArr;
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        StringBuilder sbM405m = AbstractC0271e0.m405m(charSequence, "postfix", charSequence2, "truncated", prefix);
        int[] iArr2 = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sbM405m.append(charSequence);
            break;
        }
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i3 - length)) >>> 31);
                int i7 = 0;
                while (i7 < i6) {
                    if ((j2 & 255) < 128) {
                        int i8 = (i3 << 3) + i7;
                        int i9 = iArr2[i8];
                        Object obj = objArr[i8];
                        if (i4 == i2) {
                            sbM405m.append(charSequence2);
                            break loop0;
                        }
                        if (i4 != 0) {
                            sbM405m.append(separator);
                        }
                        sbM405m.append(i9);
                        sbM405m.append('=');
                        sbM405m.append(obj);
                        i4++;
                    }
                    j2 >>= i5;
                    i7++;
                    iArr2 = iArr2;
                    i5 = i5;
                }
                iArr = iArr2;
                if (i6 == i5) {
                }
                sbM405m.append(charSequence);
                break;
            }
            iArr = iArr2;
            if (i3 == length) {
                sbM405m.append(charSequence);
                break;
            }
            i3++;
            iArr2 = iArr;
        }
        String string = sbM405m.toString();
        AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String joinToString(CharSequence charSequence, CharSequence prefix, CharSequence postfix, int i2, CharSequence charSequence2, InterfaceC6502p interfaceC6502p) {
        int[] iArr;
        CharSequence separator = charSequence;
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        AbstractC6452k.m12181e(postfix, "postfix");
        StringBuilder sbM407o = AbstractC0271e0.m407o(charSequence2, "truncated", interfaceC6502p, "transform", prefix);
        int[] iArr2 = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sbM407o.append(postfix);
            break;
        }
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            long j2 = jArr[i3];
            int i5 = i3;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i5 - length)) >>> 31);
                int i7 = 0;
                while (i7 < i6) {
                    if ((j2 & 255) < 128) {
                        int i8 = (i5 << 3) + i7;
                        int i9 = iArr2[i8];
                        Object obj = objArr[i8];
                        if (i4 == i2) {
                            sbM407o.append(charSequence2);
                            break loop0;
                        }
                        if (i4 != 0) {
                            sbM407o.append(separator);
                        }
                        sbM407o.append((CharSequence) interfaceC6502p.invoke(Integer.valueOf(i9), obj));
                        i4++;
                    }
                    j2 >>= 8;
                    i7++;
                    separator = charSequence;
                    iArr2 = iArr2;
                }
                iArr = iArr2;
                if (i6 == 8) {
                }
                sbM407o.append(postfix);
                break;
            }
            iArr = iArr2;
            if (i5 == length) {
                sbM407o.append(postfix);
                break;
            }
            i3 = i5 + 1;
            separator = charSequence;
            iArr2 = iArr;
        }
        String string = sbM407o.toString();
        AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0089 A[DONT_INVERT, PHI: r11
  0x0089: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x003a, B:20:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x008b A[LOOP:0: B:5:0x0029->B:22:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0090 A[SYNTHETIC] */
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, int i2, InterfaceC6502p interfaceC6502p) {
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        StringBuilder sbM407o = AbstractC0271e0.m407o(charSequence, "postfix", interfaceC6502p, "transform", prefix);
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sbM407o.append(charSequence);
            break;
        }
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i3 == length) {
                    sbM407o.append(charSequence);
                    break;
                }
                i3++;
            } else {
                int i5 = 8;
                int i6 = 8 - ((~(i3 - length)) >>> 31);
                int i7 = 0;
                while (i7 < i6) {
                    if ((j2 & 255) < 128) {
                        int i8 = (i3 << 3) + i7;
                        int i9 = iArr[i8];
                        Object obj = objArr[i8];
                        if (i4 == i2) {
                            sbM407o.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i4 != 0) {
                            sbM407o.append(separator);
                        }
                        sbM407o.append((CharSequence) interfaceC6502p.invoke(Integer.valueOf(i9), obj));
                        i4++;
                    }
                    j2 >>= i5;
                    i7++;
                    i5 = i5;
                }
                if (i6 == i5) {
                    if (i3 == length) {
                        i3++;
                    }
                }
                sbM407o.append(charSequence);
                break;
            }
        }
        String string = sbM407o.toString();
        AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0088 A[DONT_INVERT, PHI: r11
  0x0088: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x003a, B:20:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x008a A[LOOP:0: B:5:0x0029->B:22:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x008f A[SYNTHETIC] */
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, InterfaceC6502p interfaceC6502p) {
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        StringBuilder sbM407o = AbstractC0271e0.m407o(charSequence, "postfix", interfaceC6502p, "transform", prefix);
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sbM407o.append(charSequence);
            break;
        }
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i2 == length) {
                    sbM407o.append(charSequence);
                    break;
                }
                i2++;
            } else {
                int i4 = 8;
                int i5 = 8 - ((~(i2 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j2 & 255) < 128) {
                        int i7 = (i2 << 3) + i6;
                        int i8 = iArr[i7];
                        Object obj = objArr[i7];
                        if (i3 == -1) {
                            sbM407o.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i3 != 0) {
                            sbM407o.append(separator);
                        }
                        sbM407o.append((CharSequence) interfaceC6502p.invoke(Integer.valueOf(i8), obj));
                        i3++;
                    }
                    j2 >>= i4;
                    i6++;
                    i4 = i4;
                }
                if (i5 == i4) {
                    if (i2 == length) {
                        i2++;
                    }
                }
                sbM407o.append(charSequence);
                break;
            }
        }
        String string = sbM407o.toString();
        AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007c A[DONT_INVERT, PHI: r10
  0x007c: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x0030, B:20:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007e A[LOOP:0: B:5:0x0022->B:22:0x007e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0081 A[SYNTHETIC] */
    public final String joinToString(CharSequence separator, CharSequence charSequence, InterfaceC6502p interfaceC6502p) {
        AbstractC6452k.m12181e(separator, "separator");
        StringBuilder sbM407o = AbstractC0271e0.m407o(charSequence, "prefix", interfaceC6502p, "transform", charSequence);
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sbM407o.append((CharSequence) "");
            break;
        }
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i2 == length) {
                    sbM407o.append((CharSequence) "");
                    break;
                }
                i2++;
            } else {
                int i4 = 8;
                int i5 = 8 - ((~(i2 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j2 & 255) < 128) {
                        int i7 = (i2 << 3) + i6;
                        int i8 = iArr[i7];
                        Object obj = objArr[i7];
                        if (i3 == -1) {
                            sbM407o.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i3 != 0) {
                            sbM407o.append(separator);
                        }
                        sbM407o.append((CharSequence) interfaceC6502p.invoke(Integer.valueOf(i8), obj));
                        i3++;
                    }
                    j2 >>= i4;
                    i6++;
                    i4 = i4;
                }
                if (i5 == i4) {
                    if (i2 == length) {
                        i2++;
                    }
                }
                sbM407o.append((CharSequence) "");
                break;
            }
        }
        String string = sbM407o.toString();
        AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0083 A[DONT_INVERT, PHI: r11
  0x0083: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x0035, B:20:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0085 A[LOOP:0: B:5:0x0024->B:22:0x0085, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x008a A[SYNTHETIC] */
    public final String joinToString(CharSequence separator, InterfaceC6502p transform) {
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(transform, "transform");
        StringBuilder sb = new StringBuilder("");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "");
            break;
        }
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i2 == length) {
                    sb.append((CharSequence) "");
                    break;
                }
                i2++;
            } else {
                int i4 = 8;
                int i5 = 8 - ((~(i2 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j2 & 255) < 128) {
                        int i7 = (i2 << 3) + i6;
                        int i8 = iArr[i7];
                        Object obj = objArr[i7];
                        if (i3 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i3 != 0) {
                            sb.append(separator);
                        }
                        sb.append((CharSequence) transform.invoke(Integer.valueOf(i8), obj));
                        i3++;
                    }
                    j2 >>= i4;
                    i6++;
                    i4 = i4;
                }
                if (i5 == i4) {
                    if (i2 == length) {
                        i2++;
                    }
                }
                sb.append((CharSequence) "");
                break;
            }
        }
        String string = sb.toString();
        AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0079 A[DONT_INVERT, PHI: r10
  0x0079: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x002b, B:20:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007b A[LOOP:0: B:5:0x001d->B:22:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x007e A[SYNTHETIC] */
    public final String joinToString(InterfaceC6502p transform) {
        AbstractC6452k.m12181e(transform, "transform");
        StringBuilder sb = new StringBuilder("");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "");
            break;
        }
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i2 == length) {
                    sb.append((CharSequence) "");
                    break;
                }
                i2++;
            } else {
                int i4 = 8;
                int i5 = 8 - ((~(i2 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j2 & 255) < 128) {
                        int i7 = (i2 << 3) + i6;
                        int i8 = iArr[i7];
                        Object obj = objArr[i7];
                        if (i3 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i3 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) transform.invoke(Integer.valueOf(i8), obj));
                        i3++;
                    }
                    j2 >>= i4;
                    i6++;
                    i4 = i4;
                }
                if (i5 == i4) {
                    if (i2 == length) {
                        i2++;
                    }
                }
                sb.append((CharSequence) "");
                break;
            }
        }
        String string = sb.toString();
        AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
