package androidx.collection;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0271e0;
import p078p0.InterfaceC6487a;
import p078p0.InterfaceC6498l;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes.dex */
public abstract class FloatLongMap {
    public int _capacity;
    public int _size;
    public float[] keys;
    public long[] metadata;
    public long[] values;

    public /* synthetic */ FloatLongMap(AbstractC6447f abstractC6447f) {
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

    public static /* synthetic */ String joinToString$default(FloatLongMap floatLongMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
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
        return floatLongMap.joinToString(charSequence, charSequence2, charSequence6, i2, charSequence5);
    }

    public final boolean all(InterfaceC6502p predicate) {
        AbstractC6452k.m12181e(predicate, "predicate");
        float[] fArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr2[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        if (!((Boolean) predicate.invoke(Float.valueOf(fArr[i5]), Long.valueOf(jArr[i5]))).booleanValue()) {
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

    public final boolean contains(float f2) {
        return findKeyIndex(f2) >= 0;
    }

    public final boolean containsKey(float f2) {
        return findKeyIndex(f2) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0043 A[LOOP:0: B:5:0x000b->B:18:0x0043, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0046 A[SYNTHETIC] */
    public final boolean containsValue(long j2) {
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j3 = jArr2[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j3) < 128 && j2 == jArr[(i2 << 3) + i4]) {
                            return true;
                        }
                        j3 >>= 8;
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

    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0064 A[LOOP:0: B:14:0x0027->B:26:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0067 A[SYNTHETIC] */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FloatLongMap)) {
            return false;
        }
        FloatLongMap floatLongMap = (FloatLongMap) obj;
        if (floatLongMap.getSize() != getSize()) {
            return false;
        }
        float[] fArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr2[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (jArr[i5] != floatLongMap.get(fArr[i5])) {
                                return false;
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
        return true;
    }

    public final int findKeyIndex(float f2) {
        int iHashCode = Float.hashCode(f2) * ScatterMapKt.MurmurHashC1;
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this._capacity;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (((long) i3) * ScatterMapKt.BitmaskLsb) ^ j2;
            for (long j4 = (~j3) & (j3 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.keys[iNumberOfTrailingZeros] == f2) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final void forEach(InterfaceC6502p block) {
        AbstractC6452k.m12181e(block, "block");
        float[] fArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr2[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        block.invoke(Float.valueOf(fArr[i5]), Long.valueOf(jArr[i5]));
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
        float[] fArr = this.keys;
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
                        block.invoke(Float.valueOf(fArr[(i2 << 3) + i4]));
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
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr2[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        block.invoke(Long.valueOf(jArr[(i2 << 3) + i4]));
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

    public final long get(float f2) {
        int iFindKeyIndex = findKeyIndex(f2);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        throw new NoSuchElementException("Cannot find value for key " + f2);
    }

    public final int getCapacity() {
        return this._capacity;
    }

    public final long getOrDefault(float f2, long j2) {
        int iFindKeyIndex = findKeyIndex(f2);
        return iFindKeyIndex >= 0 ? this.values[iFindKeyIndex] : j2;
    }

    public final long getOrElse(float f2, InterfaceC6487a defaultValue) {
        AbstractC6452k.m12181e(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(f2);
        return iFindKeyIndex < 0 ? ((Number) defaultValue.invoke()).longValue() : this.values[iFindKeyIndex];
    }

    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        float[] fArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int iHashCode = 0;
        while (true) {
            long j2 = jArr2[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        iHashCode += Float.hashCode(fArr[i5]) ^ Long.hashCode(jArr[i5]);
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

    public String toString() {
        int i2;
        int i3;
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        float[] fArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                long j2 = jArr2[i4];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((255 & j2) < 128) {
                            int i8 = (i4 << 3) + i7;
                            float f2 = fArr[i8];
                            i3 = i4;
                            long j3 = jArr[i8];
                            sb.append(f2);
                            sb.append("=");
                            sb.append(j3);
                            i5++;
                            if (i5 < this._size) {
                                sb.append(", ");
                            }
                        } else {
                            i3 = i4;
                        }
                        j2 >>= 8;
                        i7++;
                        i4 = i3;
                    }
                    int i9 = i4;
                    if (i6 != 8) {
                        break;
                    }
                    i2 = i9;
                } else {
                    i2 = i4;
                }
                if (i2 == length) {
                    break;
                }
                i4 = i2 + 1;
            }
        }
        return AbstractC0271e0.m400h(sb, '}', "s.append('}').toString()");
    }

    private FloatLongMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = FloatSetKt.getEmptyFloatArray();
        this.values = LongSetKt.getEmptyLongArray();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0060 A[LOOP:0: B:5:0x0016->B:18:0x0060, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0063 A[SYNTHETIC] */
    public final boolean any(InterfaceC6502p predicate) {
        AbstractC6452k.m12181e(predicate, "predicate");
        float[] fArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr2[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (((Boolean) predicate.invoke(Float.valueOf(fArr[i5]), Long.valueOf(jArr[i5]))).booleanValue()) {
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
        float[] fArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            long j2 = jArr2[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j2) < 128) {
                        int i6 = (i2 << 3) + i5;
                        if (((Boolean) predicate.invoke(Float.valueOf(fArr[i6]), Long.valueOf(jArr[i6]))).booleanValue()) {
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

    public static /* synthetic */ String joinToString$default(FloatLongMap floatLongMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, InterfaceC6502p interfaceC6502p, int i3, Object obj) {
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
            float[] fArr = floatLongMap.keys;
            long[] jArr2 = floatLongMap.values;
            long[] jArr3 = floatLongMap.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                sbM407o.append(postfix);
                break;
            }
            int i5 = 0;
            int i6 = 0;
            loop0: while (true) {
                long j2 = jArr3[i5];
                int i7 = i5;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8;
                    int i9 = 8 - ((~(i7 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j2 & 255) < 128) {
                            int i11 = (i7 << 3) + i10;
                            float f2 = fArr[i11];
                            long j3 = jArr2[i11];
                            if (i6 == i4) {
                                sbM407o.append(charSequence5);
                                break loop0;
                            }
                            if (i6 != 0) {
                                sbM407o.append(separator);
                            }
                            sbM407o.append((CharSequence) interfaceC6502p.invoke(Float.valueOf(f2), Long.valueOf(j3)));
                            i6++;
                        }
                        j2 >>= i8;
                        i10++;
                        i8 = i8;
                        jArr3 = jArr3;
                    }
                    jArr = jArr3;
                    if (i9 == i8) {
                    }
                    sbM407o.append(postfix);
                    break;
                }
                jArr = jArr3;
                if (i7 == length) {
                    sbM407o.append(postfix);
                    break;
                }
                i5 = i7 + 1;
                jArr3 = jArr;
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
        float[] fArr;
        long[] jArr;
        long[] jArr2;
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        StringBuilder sbM405m = AbstractC0271e0.m405m(charSequence, "postfix", charSequence2, "truncated", prefix);
        float[] fArr2 = this.keys;
        long[] jArr3 = this.values;
        long[] jArr4 = this.metadata;
        int length = jArr4.length - 2;
        if (length < 0) {
            sbM405m.append(charSequence);
            break;
        }
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            long j2 = jArr4[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i3 - length)) >>> 31);
                int i7 = 0;
                while (i7 < i6) {
                    if ((j2 & 255) < 128) {
                        int i8 = (i3 << 3) + i7;
                        float f2 = fArr2[i8];
                        jArr2 = jArr3;
                        long j3 = jArr2[i8];
                        if (i4 == i2) {
                            sbM405m.append(charSequence2);
                            break loop0;
                        }
                        if (i4 != 0) {
                            sbM405m.append(separator);
                        }
                        sbM405m.append(f2);
                        sbM405m.append('=');
                        sbM405m.append(j3);
                        i4++;
                    } else {
                        jArr2 = jArr3;
                    }
                    j2 >>= i5;
                    i7++;
                    i5 = i5;
                    fArr2 = fArr2;
                    jArr3 = jArr2;
                }
                fArr = fArr2;
                jArr = jArr3;
                if (i6 == i5) {
                }
                sbM405m.append(charSequence);
                break;
            }
            fArr = fArr2;
            jArr = jArr3;
            if (i3 == length) {
                sbM405m.append(charSequence);
                break;
            }
            i3++;
            fArr2 = fArr;
            jArr3 = jArr;
        }
        String string = sbM405m.toString();
        AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0091 A[DONT_INVERT, PHI: r12
  0x0091: PHI (r12v2 int) = (r12v1 int), (r12v3 int) binds: [B:6:0x0042, B:19:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0093 A[LOOP:0: B:5:0x0030->B:21:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x009a A[SYNTHETIC] */
    public final String joinToString(CharSequence charSequence, CharSequence prefix, CharSequence postfix, int i2, CharSequence charSequence2, InterfaceC6502p interfaceC6502p) {
        CharSequence separator = charSequence;
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        AbstractC6452k.m12181e(postfix, "postfix");
        StringBuilder sbM407o = AbstractC0271e0.m407o(charSequence2, "truncated", interfaceC6502p, "transform", prefix);
        float[] fArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sbM407o.append(postfix);
            break;
        }
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            long j2 = jArr2[i3];
            int i5 = i3;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i5 == length) {
                    sbM407o.append(postfix);
                    break;
                }
                i3 = i5 + 1;
                separator = charSequence;
            } else {
                int i6 = 8 - ((~(i5 - length)) >>> 31);
                int i7 = 0;
                while (i7 < i6) {
                    if ((j2 & 255) < 128) {
                        int i8 = (i5 << 3) + i7;
                        float f2 = fArr[i8];
                        long j3 = jArr[i8];
                        if (i4 == i2) {
                            sbM407o.append(charSequence2);
                            break loop0;
                        }
                        if (i4 != 0) {
                            sbM407o.append(separator);
                        }
                        sbM407o.append((CharSequence) interfaceC6502p.invoke(Float.valueOf(f2), Long.valueOf(j3)));
                        i4++;
                    }
                    j2 >>= 8;
                    i7++;
                    separator = charSequence;
                }
                if (i6 == 8) {
                    if (i5 == length) {
                        i3 = i5 + 1;
                        separator = charSequence;
                    }
                }
                sbM407o.append(postfix);
                break;
            }
        }
        String string = sbM407o.toString();
        AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String joinToString(CharSequence charSequence, CharSequence prefix, CharSequence charSequence2, int i2, InterfaceC6502p interfaceC6502p) {
        CharSequence separator = charSequence;
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        StringBuilder sbM407o = AbstractC0271e0.m407o(charSequence2, "postfix", interfaceC6502p, "transform", prefix);
        float[] fArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sbM407o.append(charSequence2);
            break;
        }
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            long j2 = jArr2[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i3 - length)) >>> 31);
                int i7 = 0;
                while (i7 < i6) {
                    if ((j2 & 255) < 128) {
                        int i8 = (i3 << 3) + i7;
                        float f2 = fArr[i8];
                        long j3 = jArr[i8];
                        if (i4 == i2) {
                            sbM407o.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i4 != 0) {
                            sbM407o.append(separator);
                        }
                        sbM407o.append((CharSequence) interfaceC6502p.invoke(Float.valueOf(f2), Long.valueOf(j3)));
                        i4++;
                    }
                    j2 >>= i5;
                    i7++;
                    separator = charSequence;
                    i5 = i5;
                }
                if (i6 == i5) {
                }
                sbM407o.append(charSequence2);
                break;
            }
            if (i3 == length) {
                sbM407o.append(charSequence2);
                break;
            }
            i3++;
            separator = charSequence;
        }
        String string = sbM407o.toString();
        AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008c A[DONT_INVERT, PHI: r11
  0x008c: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x003a, B:20:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x008e A[LOOP:0: B:5:0x0029->B:22:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0093 A[SYNTHETIC] */
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, InterfaceC6502p interfaceC6502p) {
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        StringBuilder sbM407o = AbstractC0271e0.m407o(charSequence, "postfix", interfaceC6502p, "transform", prefix);
        float[] fArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sbM407o.append(charSequence);
            break;
        }
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            long j2 = jArr2[i2];
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
                        float f2 = fArr[i7];
                        long j3 = jArr[i7];
                        if (i3 == -1) {
                            sbM407o.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i3 != 0) {
                            sbM407o.append(separator);
                        }
                        sbM407o.append((CharSequence) interfaceC6502p.invoke(Float.valueOf(f2), Long.valueOf(j3)));
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

    /* JADX WARN: Code duplicated, block: B:21:0x0080 A[DONT_INVERT, PHI: r10
  0x0080: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x0030, B:20:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0082 A[LOOP:0: B:5:0x0022->B:22:0x0082, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0085 A[SYNTHETIC] */
    public final String joinToString(CharSequence separator, CharSequence charSequence, InterfaceC6502p interfaceC6502p) {
        AbstractC6452k.m12181e(separator, "separator");
        StringBuilder sbM407o = AbstractC0271e0.m407o(charSequence, "prefix", interfaceC6502p, "transform", charSequence);
        float[] fArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sbM407o.append((CharSequence) "");
            break;
        }
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            long j2 = jArr2[i2];
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
                        float f2 = fArr[i7];
                        long j3 = jArr[i7];
                        if (i3 == -1) {
                            sbM407o.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i3 != 0) {
                            sbM407o.append(separator);
                        }
                        sbM407o.append((CharSequence) interfaceC6502p.invoke(Float.valueOf(f2), Long.valueOf(j3)));
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

    /* JADX WARN: Code duplicated, block: B:21:0x0087 A[DONT_INVERT, PHI: r11
  0x0087: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x0035, B:20:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0089 A[LOOP:0: B:5:0x0024->B:22:0x0089, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x008e A[SYNTHETIC] */
    public final String joinToString(CharSequence separator, InterfaceC6502p transform) {
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(transform, "transform");
        StringBuilder sb = new StringBuilder("");
        float[] fArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "");
            break;
        }
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            long j2 = jArr2[i2];
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
                        float f2 = fArr[i7];
                        long j3 = jArr[i7];
                        if (i3 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i3 != 0) {
                            sb.append(separator);
                        }
                        sb.append((CharSequence) transform.invoke(Float.valueOf(f2), Long.valueOf(j3)));
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

    /* JADX WARN: Code duplicated, block: B:21:0x007d A[DONT_INVERT, PHI: r10
  0x007d: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x002b, B:20:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007f A[LOOP:0: B:5:0x001d->B:22:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0082 A[SYNTHETIC] */
    public final String joinToString(InterfaceC6502p transform) {
        AbstractC6452k.m12181e(transform, "transform");
        StringBuilder sb = new StringBuilder("");
        float[] fArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "");
            break;
        }
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            long j2 = jArr2[i2];
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
                        float f2 = fArr[i7];
                        long j3 = jArr[i7];
                        if (i3 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i3 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) transform.invoke(Float.valueOf(f2), Long.valueOf(j3)));
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
