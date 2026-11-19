package androidx.collection;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0271e0;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public abstract class LongSet {
    public int _capacity;
    public int _size;
    public long[] elements;
    public long[] metadata;

    public /* synthetic */ LongSet(AbstractC6447f abstractC6447f) {
        this();
    }

    public static /* synthetic */ void getElements$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ String joinToString$default(LongSet longSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
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
        return longSet.joinToString(charSequence, charSequence2, charSequence6, i2, charSequence5);
    }

    public final boolean all(InterfaceC6498l predicate) {
        AbstractC6452k.m12181e(predicate, "predicate");
        long[] jArr = this.elements;
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
                    if ((255 & j2) < 128 && !((Boolean) predicate.invoke(Long.valueOf(jArr[(i2 << 3) + i4]))).booleanValue()) {
                        return false;
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

    public final boolean contains(long j2) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j2) * ScatterMapKt.MurmurHashC1;
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this._capacity;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j3 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j4 = (((long) i3) * ScatterMapKt.BitmaskLsb) ^ j3;
            for (long j5 = (~j4) & (j4 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i5) & i4;
                if (this.elements[iNumberOfTrailingZeros] == j2) {
                    break loop0;
                }
            }
            if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int count() {
        return this._size;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LongSet)) {
            return false;
        }
        LongSet longSet = (LongSet) obj;
        if (longSet._size != this._size) {
            return false;
        }
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr2[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128 && !longSet.contains(jArr[(i2 << 3) + i4])) {
                            return false;
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

    public final int findElementIndex$collection(long j2) {
        int iHashCode = Long.hashCode(j2) * ScatterMapKt.MurmurHashC1;
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this._capacity;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j3 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j4 = (((long) i3) * ScatterMapKt.BitmaskLsb) ^ j3;
            for (long j5 = (~j4) & (j4 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i5) & i4;
                if (this.elements[iNumberOfTrailingZeros] == j2) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x003e A[LOOP:0: B:5:0x000b->B:16:0x003e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0041 A[SYNTHETIC] */
    public final long first() {
        long[] jArr = this.elements;
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
                            return jArr[(i2 << 3) + i4];
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
        throw new NoSuchElementException("The LongSet is empty");
    }

    public final void forEach(InterfaceC6498l block) {
        AbstractC6452k.m12181e(block, "block");
        long[] jArr = this.elements;
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

    public final void forEachIndex(InterfaceC6498l block) {
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

    public final int getCapacity() {
        return this._capacity;
    }

    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        long[] jArr = this.elements;
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
                        iHashCode = Long.hashCode(jArr[(i2 << 3) + i4]) + iHashCode;
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
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    private LongSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = LongSetKt.getEmptyLongArray();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0054 A[LOOP:0: B:5:0x0010->B:18:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0057 A[SYNTHETIC] */
    public final boolean any(InterfaceC6498l predicate) {
        AbstractC6452k.m12181e(predicate, "predicate");
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr2[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128 && ((Boolean) predicate.invoke(Long.valueOf(jArr[(i2 << 3) + i4]))).booleanValue()) {
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

    public final int count(InterfaceC6498l predicate) {
        AbstractC6452k.m12181e(predicate, "predicate");
        long[] jArr = this.elements;
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
                    if ((255 & j2) < 128 && ((Boolean) predicate.invoke(Long.valueOf(jArr[(i2 << 3) + i5]))).booleanValue()) {
                        i3++;
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

    /* JADX WARN: Code duplicated, block: B:43:0x00ab A[DONT_INVERT, PHI: r11
  0x00ab: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:28:0x0064, B:42:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad A[LOOP:0: B:27:0x0053->B:44:0x00ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b0 A[SYNTHETIC] */
    public static /* synthetic */ String joinToString$default(LongSet longSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, InterfaceC6498l interfaceC6498l, int i3, Object obj) {
        if (obj == null) {
            CharSequence separator = (i3 & 1) != 0 ? ", " : charSequence;
            CharSequence prefix = (i3 & 2) != 0 ? "" : charSequence2;
            CharSequence postfix = (i3 & 4) == 0 ? charSequence3 : "";
            int i4 = (i3 & 8) != 0 ? -1 : i2;
            CharSequence charSequence5 = (i3 & 16) != 0 ? "..." : charSequence4;
            AbstractC6452k.m12181e(separator, "separator");
            AbstractC6452k.m12181e(prefix, "prefix");
            AbstractC6452k.m12181e(postfix, "postfix");
            StringBuilder sbM406n = AbstractC0271e0.m406n(charSequence5, "truncated", interfaceC6498l, "transform", prefix);
            long[] jArr = longSet.elements;
            long[] jArr2 = longSet.metadata;
            int length = jArr2.length - 2;
            if (length < 0) {
                sbM406n.append(postfix);
                break;
            }
            int i5 = 0;
            int i6 = 0;
            loop0: while (true) {
                long j2 = jArr2[i5];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i5 == length) {
                        sbM406n.append(postfix);
                        break;
                    }
                    i5++;
                } else {
                    int i7 = 8;
                    int i8 = 8 - ((~(i5 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j2 & 255) < 128) {
                            long j3 = jArr[(i5 << 3) + i9];
                            if (i6 == i4) {
                                sbM406n.append(charSequence5);
                                break loop0;
                            }
                            if (i6 != 0) {
                                sbM406n.append(separator);
                            }
                            sbM406n.append((CharSequence) interfaceC6498l.invoke(Long.valueOf(j3)));
                            i6++;
                        }
                        j2 >>= i7;
                        i9++;
                        i7 = i7;
                    }
                    if (i8 == i7) {
                        if (i5 == length) {
                            i5++;
                        }
                    }
                    sbM406n.append(postfix);
                    break;
                }
            }
            String string = sbM406n.toString();
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
        int i3;
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        StringBuilder sbM405m = AbstractC0271e0.m405m(charSequence, "postfix", charSequence2, "truncated", prefix);
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sbM405m.append(charSequence);
            break;
        }
        int i4 = 0;
        int i5 = 0;
        loop0: while (true) {
            long j2 = jArr2[i4];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8;
                int i7 = 8 - ((~(i4 - length)) >>> 31);
                int i8 = 0;
                while (i8 < i7) {
                    if ((j2 & 255) < 128) {
                        long j3 = jArr[(i4 << 3) + i8];
                        if (i5 == i2) {
                            sbM405m.append(charSequence2);
                            break loop0;
                        }
                        if (i5 != 0) {
                            sbM405m.append(separator);
                        }
                        sbM405m.append(j3);
                        i5++;
                    }
                    j2 >>= i6;
                    i8++;
                    i6 = i6;
                    i4 = i4;
                }
                int i9 = i4;
                if (i7 == i6) {
                    i3 = i9;
                }
                sbM405m.append(charSequence);
                break;
            }
            i3 = i4;
            if (i3 == length) {
                sbM405m.append(charSequence);
                break;
            }
            i4 = i3 + 1;
        }
        String string = sbM405m.toString();
        AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[LOOP:0: B:5:0x0010->B:17:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0056 A[SYNTHETIC] */
    public final long first(InterfaceC6498l predicate) {
        AbstractC6452k.m12181e(predicate, "predicate");
        long[] jArr = this.elements;
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
                            long j3 = jArr[(i2 << 3) + i4];
                            if (((Boolean) predicate.invoke(Long.valueOf(j3))).booleanValue()) {
                                return j3;
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
        throw new NoSuchElementException("Could not find a match");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i2, CharSequence charSequence, InterfaceC6498l interfaceC6498l) {
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        AbstractC6452k.m12181e(postfix, "postfix");
        StringBuilder sbM406n = AbstractC0271e0.m406n(charSequence, "truncated", interfaceC6498l, "transform", prefix);
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sbM406n.append(postfix);
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
                        long j3 = jArr[(i3 << 3) + i7];
                        if (i4 == i2) {
                            sbM406n.append(charSequence);
                            break loop0;
                        }
                        if (i4 != 0) {
                            sbM406n.append(separator);
                        }
                        sbM406n.append((CharSequence) interfaceC6498l.invoke(Long.valueOf(j3)));
                        i4++;
                    }
                    j2 >>= i5;
                    i7++;
                    i5 = i5;
                }
                if (i6 == i5) {
                }
                sbM406n.append(postfix);
                break;
            }
            if (i3 == length) {
                sbM406n.append(postfix);
                break;
            }
            i3++;
        }
        String string = sbM406n.toString();
        AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, int i2, InterfaceC6498l interfaceC6498l) {
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        StringBuilder sbM406n = AbstractC0271e0.m406n(charSequence, "postfix", interfaceC6498l, "transform", prefix);
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sbM406n.append(charSequence);
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
                        long j3 = jArr[(i3 << 3) + i7];
                        if (i4 == i2) {
                            sbM406n.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i4 != 0) {
                            sbM406n.append(separator);
                        }
                        sbM406n.append((CharSequence) interfaceC6498l.invoke(Long.valueOf(j3)));
                        i4++;
                    }
                    j2 >>= i5;
                    i7++;
                    i5 = i5;
                }
                if (i6 == i5) {
                }
                sbM406n.append(charSequence);
                break;
            }
            if (i3 == length) {
                sbM406n.append(charSequence);
                break;
            }
            i3++;
        }
        String string = sbM406n.toString();
        AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0076 A[DONT_INVERT, PHI: r10
  0x0076: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x0035, B:18:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0078 A[LOOP:0: B:5:0x0027->B:20:0x0078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007b A[SYNTHETIC] */
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, InterfaceC6498l interfaceC6498l) {
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        StringBuilder sbM406n = AbstractC0271e0.m406n(charSequence, "postfix", interfaceC6498l, "transform", prefix);
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sbM406n.append(charSequence);
            break;
        }
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            long j2 = jArr2[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((j2 & 255) < 128) {
                        long j3 = jArr[(i2 << 3) + i5];
                        if (i3 == -1) {
                            sbM406n.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i3 != 0) {
                            sbM406n.append(separator);
                        }
                        sbM406n.append((CharSequence) interfaceC6498l.invoke(Long.valueOf(j3)));
                        i3++;
                    }
                    j2 >>= 8;
                }
                if (i4 == 8) {
                    if (i2 == length) {
                        i2++;
                    }
                }
                sbM406n.append(charSequence);
                break;
            }
            if (i2 == length) {
                sbM406n.append(charSequence);
                break;
            }
            i2++;
        }
        String string = sbM406n.toString();
        AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d A[DONT_INVERT, PHI: r9
  0x006d: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:6:0x002e, B:18:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x006f A[LOOP:0: B:5:0x0020->B:20:0x006f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[SYNTHETIC] */
    public final String joinToString(CharSequence separator, CharSequence charSequence, InterfaceC6498l interfaceC6498l) {
        AbstractC6452k.m12181e(separator, "separator");
        StringBuilder sbM406n = AbstractC0271e0.m406n(charSequence, "prefix", interfaceC6498l, "transform", charSequence);
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sbM406n.append((CharSequence) "");
            break;
        }
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            long j2 = jArr2[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j2) < 128) {
                        long j3 = jArr[(i2 << 3) + i5];
                        if (i3 == -1) {
                            sbM406n.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i3 != 0) {
                            sbM406n.append(separator);
                        }
                        sbM406n.append((CharSequence) interfaceC6498l.invoke(Long.valueOf(j3)));
                        i3++;
                    }
                    j2 >>= 8;
                }
                if (i4 == 8) {
                    if (i2 == length) {
                        i2++;
                    }
                }
                sbM406n.append((CharSequence) "");
                break;
            }
            if (i2 == length) {
                sbM406n.append((CharSequence) "");
                break;
            }
            i2++;
        }
        String string = sbM406n.toString();
        AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0071 A[DONT_INVERT, PHI: r10
  0x0071: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x0030, B:18:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0073 A[LOOP:0: B:5:0x0022->B:20:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0076 A[SYNTHETIC] */
    public final String joinToString(CharSequence separator, InterfaceC6498l transform) {
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(transform, "transform");
        StringBuilder sb = new StringBuilder("");
        long[] jArr = this.elements;
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
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((j2 & 255) < 128) {
                        long j3 = jArr[(i2 << 3) + i5];
                        if (i3 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i3 != 0) {
                            sb.append(separator);
                        }
                        sb.append((CharSequence) transform.invoke(Long.valueOf(j3)));
                        i3++;
                    }
                    j2 >>= 8;
                }
                if (i4 == 8) {
                    if (i2 == length) {
                        i2++;
                    }
                }
                sb.append((CharSequence) "");
                break;
            }
            if (i2 == length) {
                sb.append((CharSequence) "");
                break;
            }
            i2++;
        }
        String string = sb.toString();
        AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006a A[DONT_INVERT, PHI: r9
  0x006a: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:6:0x0029, B:18:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x006c A[LOOP:0: B:5:0x001b->B:20:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x006f A[SYNTHETIC] */
    public final String joinToString(InterfaceC6498l transform) {
        AbstractC6452k.m12181e(transform, "transform");
        StringBuilder sb = new StringBuilder("");
        long[] jArr = this.elements;
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
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j2) < 128) {
                        long j3 = jArr[(i2 << 3) + i5];
                        if (i3 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i3 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) transform.invoke(Long.valueOf(j3)));
                        i3++;
                    }
                    j2 >>= 8;
                }
                if (i4 == 8) {
                    if (i2 == length) {
                        i2++;
                    }
                }
                sb.append((CharSequence) "");
                break;
            }
            if (i2 == length) {
                sb.append((CharSequence) "");
                break;
            }
            i2++;
        }
        String string = sb.toString();
        AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
