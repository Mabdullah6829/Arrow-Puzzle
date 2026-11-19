package p003C;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p001B.AbstractC0076b;

/* JADX INFO: renamed from: C.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C0113d extends AbstractC0109D implements ListIterator {

    /* JADX INFO: renamed from: s */
    public final int f161s;

    /* JADX INFO: renamed from: t */
    public int f162t;

    /* JADX INFO: renamed from: u */
    public final AbstractC0116g f163u;

    public C0113d(AbstractC0116g abstractC0116g, int i2) {
        int size = abstractC0116g.size();
        AbstractC0076b.m135j(i2, size);
        this.f161s = size;
        this.f162t = i2;
        this.f163u = abstractC0116g;
    }

    /* JADX INFO: renamed from: a */
    public final Object m188a(int i2) {
        return this.f163u.get(i2);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f162t < this.f161s;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f162t > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f162t;
        this.f162t = i2 + 1;
        return m188a(i2);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f162t;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f162t - 1;
        this.f162t = i2;
        return m188a(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f162t - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
