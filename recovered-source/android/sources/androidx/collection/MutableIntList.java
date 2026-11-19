package androidx.collection;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0271e0;
import p058e0.AbstractC6298f;
import p058e0.AbstractC6302j;
import p058e0.C6294b;

/* JADX INFO: loaded from: classes.dex */
public final class MutableIntList extends IntList {
    public MutableIntList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableIntList mutableIntList, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = mutableIntList._size;
        }
        mutableIntList.trim(i2);
    }

    public final boolean add(int i2) {
        ensureCapacity(this._size + 1);
        int[] iArr = this.content;
        int i3 = this._size;
        iArr[i3] = i2;
        this._size = i3 + 1;
        return true;
    }

    public final boolean addAll(int i2, int[] elements) {
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
        int[] iArr = this.content;
        int i4 = this._size;
        if (i2 != i4) {
            AbstractC6302j.m12098t(elements.length + i2, i2, iArr, iArr, i4);
        }
        AbstractC6302j.m12102x(i2, 0, elements, iArr, 12);
        this._size += elements.length;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i2) {
        int[] iArr = this.content;
        if (iArr.length < i2) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i2, (iArr.length * 3) / 2));
            AbstractC6452k.m12180d(iArrCopyOf, "copyOf(this, newSize)");
            this.content = iArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(int i2) {
        remove(i2);
    }

    public final void plusAssign(IntList elements) {
        AbstractC6452k.m12181e(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(int i2) {
        int iIndexOf = indexOf(i2);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(int[] elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int i2 = this._size;
        for (int i3 : elements) {
            remove(i3);
        }
        return i2 != this._size;
    }

    public final int removeAt(int i2) {
        int i3;
        if (i2 < 0 || i2 >= (i3 = this._size)) {
            StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index ", " must be in 0..");
            sbM404l.append(this._size - 1);
            throw new IndexOutOfBoundsException(sbM404l.toString());
        }
        int[] iArr = this.content;
        int i4 = iArr[i2];
        if (i2 != i3 - 1) {
            AbstractC6302j.m12098t(i2, i2 + 1, iArr, iArr, i3);
        }
        this._size--;
        return i4;
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
                int[] iArr = this.content;
                AbstractC6302j.m12098t(i2, i3, iArr, iArr, i4);
            }
            this._size -= i3 - i2;
        }
    }

    public final boolean retainAll(int[] elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int i2 = this._size;
        int[] iArr = this.content;
        int i3 = i2 - 1;
        while (true) {
            int i4 = -1;
            if (-1 >= i3) {
                break;
            }
            int i5 = iArr[i3];
            int length = elements.length;
            for (int i6 = 0; i6 < length; i6++) {
                if (elements[i6] == i5) {
                    i4 = i6;
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

    public final int set(int i2, int i3) {
        if (i2 < 0 || i2 >= this._size) {
            StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "set index ", " must be between 0 .. ");
            sbM404l.append(this._size - 1);
            throw new IndexOutOfBoundsException(sbM404l.toString());
        }
        int[] iArr = this.content;
        int i4 = iArr[i2];
        iArr[i2] = i3;
        return i4;
    }

    public final void sort() {
        int[] iArr = this.content;
        int i2 = this._size;
        AbstractC6452k.m12181e(iArr, "<this>");
        Arrays.sort(iArr, 0, i2);
    }

    public final void sortDescending() {
        int[] iArr = this.content;
        int i2 = this._size;
        AbstractC6452k.m12181e(iArr, "<this>");
        Arrays.sort(iArr, 0, i2);
        C6294b c6294b = AbstractC6298f.Companion;
        int length = iArr.length;
        c6294b.getClass();
        C6294b.m12079c(0, i2, length);
        int i3 = i2 / 2;
        if (i3 == 0) {
            return;
        }
        int i4 = i2 - 1;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = iArr[i5];
            iArr[i5] = iArr[i4];
            iArr[i4] = i6;
            i4--;
        }
    }

    public final void trim(int i2) {
        int iMax = Math.max(i2, this._size);
        int[] iArr = this.content;
        if (iArr.length > iMax) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            AbstractC6452k.m12180d(iArrCopyOf, "copyOf(this, newSize)");
            this.content = iArrCopyOf;
        }
    }

    public /* synthetic */ MutableIntList(int i2, int i3, AbstractC6447f abstractC6447f) {
        this((i3 & 1) != 0 ? 16 : i2);
    }

    public final void minusAssign(int[] elements) {
        AbstractC6452k.m12181e(elements, "elements");
        for (int i2 : elements) {
            remove(i2);
        }
    }

    public final void plusAssign(int[] elements) {
        AbstractC6452k.m12181e(elements, "elements");
        addAll(this._size, elements);
    }

    public MutableIntList(int i2) {
        super(i2, null);
    }

    public final void plusAssign(int i2) {
        add(i2);
    }

    public final void add(int i2, int i3) {
        int i4;
        if (i2 >= 0 && i2 <= (i4 = this._size)) {
            ensureCapacity(i4 + 1);
            int[] iArr = this.content;
            int i5 = this._size;
            if (i2 != i5) {
                AbstractC6302j.m12098t(i2 + 1, i2, iArr, iArr, i5);
            }
            iArr[i2] = i3;
            this._size++;
            return;
        }
        StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index ", " must be in 0..");
        sbM404l.append(this._size);
        throw new IndexOutOfBoundsException(sbM404l.toString());
    }

    public final void minusAssign(IntList elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int[] iArr = elements.content;
        int i2 = elements._size;
        for (int i3 = 0; i3 < i2; i3++) {
            remove(iArr[i3]);
        }
    }

    public final boolean removeAll(IntList elements) {
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

    public final boolean retainAll(IntList elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int i2 = this._size;
        int[] iArr = this.content;
        for (int i3 = i2 - 1; -1 < i3; i3--) {
            if (!elements.contains(iArr[i3])) {
                removeAt(i3);
            }
        }
        return i2 != this._size;
    }

    public final boolean addAll(int i2, IntList elements) {
        AbstractC6452k.m12181e(elements, "elements");
        if (i2 >= 0 && i2 <= this._size) {
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements._size);
            int[] iArr = this.content;
            int i3 = this._size;
            if (i2 != i3) {
                AbstractC6302j.m12098t(elements._size + i2, i2, iArr, iArr, i3);
            }
            AbstractC6302j.m12098t(i2, 0, elements.content, iArr, elements._size);
            this._size += elements._size;
            return true;
        }
        StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index ", " must be in 0..");
        sbM404l.append(this._size);
        throw new IndexOutOfBoundsException(sbM404l.toString());
    }

    public final boolean addAll(IntList elements) {
        AbstractC6452k.m12181e(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(int[] elements) {
        AbstractC6452k.m12181e(elements, "elements");
        return addAll(this._size, elements);
    }
}
