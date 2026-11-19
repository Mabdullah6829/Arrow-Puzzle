package androidx.collection;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0271e0;
import p058e0.AbstractC6298f;
import p058e0.AbstractC6302j;
import p058e0.C6294b;

/* JADX INFO: loaded from: classes.dex */
public final class MutableLongList extends LongList {
    public MutableLongList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableLongList mutableLongList, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = mutableLongList._size;
        }
        mutableLongList.trim(i2);
    }

    public final boolean add(long j2) {
        ensureCapacity(this._size + 1);
        long[] jArr = this.content;
        int i2 = this._size;
        jArr[i2] = j2;
        this._size = i2 + 1;
        return true;
    }

    public final boolean addAll(int i2, long[] elements) {
        int i3;
        AbstractC6452k.m12181e(elements, "elements");
        if (i2 < 0 || i2 > (i3 = this._size)) {
            StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index ", " must be in 0..");
            sbM404l.append(this._size);
            throw new IndexOutOfBoundsException(sbM404l.toString());
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(i3 + elements.length);
        long[] jArr = this.content;
        int i4 = this._size;
        if (i2 != i4) {
            AbstractC6302j.m12101w(jArr, jArr, elements.length + i2, i2, i4);
        }
        AbstractC6302j.m12101w(elements, jArr, i2, 0, elements.length);
        this._size += elements.length;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i2) {
        long[] jArr = this.content;
        if (jArr.length < i2) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i2, (jArr.length * 3) / 2));
            AbstractC6452k.m12180d(jArrCopyOf, "copyOf(this, newSize)");
            this.content = jArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(long j2) {
        remove(j2);
    }

    public final void plusAssign(LongList elements) {
        AbstractC6452k.m12181e(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(long j2) {
        int iIndexOf = indexOf(j2);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(long[] elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int i2 = this._size;
        for (long j2 : elements) {
            remove(j2);
        }
        return i2 != this._size;
    }

    public final long removeAt(int i2) {
        int i3;
        if (i2 < 0 || i2 >= (i3 = this._size)) {
            StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index ", " must be in 0..");
            sbM404l.append(this._size - 1);
            throw new IndexOutOfBoundsException(sbM404l.toString());
        }
        long[] jArr = this.content;
        long j2 = jArr[i2];
        if (i2 != i3 - 1) {
            AbstractC6302j.m12101w(jArr, jArr, i2, i2 + 1, i3);
        }
        this._size--;
        return j2;
    }

    public final void removeRange(int i2, int i3) {
        int i4;
        if (i2 < 0 || i2 > (i4 = this._size) || i3 < 0 || i3 > i4) {
            StringBuilder sbM409q = AbstractC0271e0.m409q("Start (", i2, ") and end (", i3, ") must be in 0..");
            sbM409q.append(this._size);
            throw new IndexOutOfBoundsException(sbM409q.toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException("Start (" + i2 + ") is more than end (" + i3 + ')');
        }
        if (i3 != i2) {
            if (i3 < i4) {
                long[] jArr = this.content;
                AbstractC6302j.m12101w(jArr, jArr, i2, i3, i4);
            }
            this._size -= i3 - i2;
        }
    }

    public final boolean retainAll(long[] elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int i2 = this._size;
        long[] jArr = this.content;
        int i3 = i2 - 1;
        while (true) {
            int i4 = -1;
            if (-1 >= i3) {
                break;
            }
            long j2 = jArr[i3];
            int length = elements.length;
            for (int i5 = 0; i5 < length; i5++) {
                if (elements[i5] == j2) {
                    i4 = i5;
                    break;
                }
            }
            if (i4 < 0) {
                removeAt(i3);
            }
            i3--;
        }
        return i2 != this._size;
    }

    public final long set(int i2, long j2) {
        if (i2 < 0 || i2 >= this._size) {
            StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "set index ", " must be between 0 .. ");
            sbM404l.append(this._size - 1);
            throw new IndexOutOfBoundsException(sbM404l.toString());
        }
        long[] jArr = this.content;
        long j3 = jArr[i2];
        jArr[i2] = j2;
        return j3;
    }

    public final void sort() {
        long[] jArr = this.content;
        int i2 = this._size;
        AbstractC6452k.m12181e(jArr, "<this>");
        Arrays.sort(jArr, 0, i2);
    }

    public final void sortDescending() {
        long[] jArr = this.content;
        int i2 = this._size;
        AbstractC6452k.m12181e(jArr, "<this>");
        Arrays.sort(jArr, 0, i2);
        C6294b c6294b = AbstractC6298f.Companion;
        int length = jArr.length;
        c6294b.getClass();
        C6294b.m12079c(0, i2, length);
        int i3 = i2 / 2;
        if (i3 == 0) {
            return;
        }
        int i4 = i2 - 1;
        for (int i5 = 0; i5 < i3; i5++) {
            long j2 = jArr[i5];
            jArr[i5] = jArr[i4];
            jArr[i4] = j2;
            i4--;
        }
    }

    public final void trim(int i2) {
        int iMax = Math.max(i2, this._size);
        long[] jArr = this.content;
        if (jArr.length > iMax) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            AbstractC6452k.m12180d(jArrCopyOf, "copyOf(this, newSize)");
            this.content = jArrCopyOf;
        }
    }

    public /* synthetic */ MutableLongList(int i2, int i3, AbstractC6447f abstractC6447f) {
        this((i3 & 1) != 0 ? 16 : i2);
    }

    public final void minusAssign(long[] elements) {
        AbstractC6452k.m12181e(elements, "elements");
        for (long j2 : elements) {
            remove(j2);
        }
    }

    public final void plusAssign(long[] elements) {
        AbstractC6452k.m12181e(elements, "elements");
        addAll(this._size, elements);
    }

    public MutableLongList(int i2) {
        super(i2, null);
    }

    public final void plusAssign(long j2) {
        add(j2);
    }

    public final void add(int i2, long j2) {
        int i3;
        if (i2 >= 0 && i2 <= (i3 = this._size)) {
            ensureCapacity(i3 + 1);
            long[] jArr = this.content;
            int i4 = this._size;
            if (i2 != i4) {
                AbstractC6302j.m12101w(jArr, jArr, i2 + 1, i2, i4);
            }
            jArr[i2] = j2;
            this._size++;
            return;
        }
        StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index ", " must be in 0..");
        sbM404l.append(this._size);
        throw new IndexOutOfBoundsException(sbM404l.toString());
    }

    public final void minusAssign(LongList elements) {
        AbstractC6452k.m12181e(elements, "elements");
        long[] jArr = elements.content;
        int i2 = elements._size;
        for (int i3 = 0; i3 < i2; i3++) {
            remove(jArr[i3]);
        }
    }

    public final boolean removeAll(LongList elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int i2 = this._size;
        int i3 = elements._size - 1;
        if (i3 >= 0) {
            int i4 = 0;
            while (true) {
                remove(elements.get(i4));
                if (i4 == i3) {
                    break;
                }
                i4++;
            }
        }
        return i2 != this._size;
    }

    public final boolean retainAll(LongList elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int i2 = this._size;
        long[] jArr = this.content;
        for (int i3 = i2 - 1; -1 < i3; i3--) {
            if (!elements.contains(jArr[i3])) {
                removeAt(i3);
            }
        }
        return i2 != this._size;
    }

    public final boolean addAll(int i2, LongList elements) {
        AbstractC6452k.m12181e(elements, "elements");
        if (i2 >= 0 && i2 <= this._size) {
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements._size);
            long[] jArr = this.content;
            int i3 = this._size;
            if (i2 != i3) {
                AbstractC6302j.m12101w(jArr, jArr, elements._size + i2, i2, i3);
            }
            AbstractC6302j.m12101w(elements.content, jArr, i2, 0, elements._size);
            this._size += elements._size;
            return true;
        }
        StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index ", " must be in 0..");
        sbM404l.append(this._size);
        throw new IndexOutOfBoundsException(sbM404l.toString());
    }

    public final boolean addAll(LongList elements) {
        AbstractC6452k.m12181e(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(long[] elements) {
        AbstractC6452k.m12181e(elements, "elements");
        return addAll(this._size, elements);
    }
}
