package p060f0;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import p058e0.AbstractC6299g;
import p080q0.InterfaceC6520a;

/* JADX INFO: renamed from: f0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6333a implements ListIterator, InterfaceC6520a {

    /* JADX INFO: renamed from: t */
    public int f24363t;

    /* JADX INFO: renamed from: v */
    public int f24365v;

    /* JADX INFO: renamed from: w */
    public final AbstractC6299g f24366w;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f24362s = 0;

    /* JADX INFO: renamed from: u */
    public int f24364u = -1;

    public C6333a(C6335c c6335c, int i2) {
        this.f24366w = c6335c;
        this.f24363t = i2;
        this.f24365v = ((AbstractList) c6335c).modCount;
    }

    /* JADX INFO: renamed from: a */
    public void m12133a() {
        if (((AbstractList) ((C6334b) this.f24366w).f24371w).modCount != this.f24365v) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f24362s) {
            case 0:
                m12133a();
                C6334b c6334b = (C6334b) this.f24366w;
                int i2 = this.f24363t;
                this.f24363t = i2 + 1;
                c6334b.add(i2, obj);
                this.f24364u = -1;
                this.f24365v = ((AbstractList) c6334b).modCount;
                break;
            default:
                m12134b();
                C6335c c6335c = (C6335c) this.f24366w;
                int i3 = this.f24363t;
                this.f24363t = i3 + 1;
                c6335c.add(i3, obj);
                this.f24364u = -1;
                this.f24365v = ((AbstractList) c6335c).modCount;
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m12134b() {
        if (((AbstractList) ((C6335c) this.f24366w)).modCount != this.f24365v) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f24362s) {
            case 0:
                return this.f24363t < ((C6334b) this.f24366w).f24369u;
            default:
                return this.f24363t < ((C6335c) this.f24366w).f24374t;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f24362s) {
            case 0:
                return this.f24363t > 0;
            default:
                return this.f24363t > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f24362s) {
            case 0:
                m12133a();
                int i2 = this.f24363t;
                C6334b c6334b = (C6334b) this.f24366w;
                if (i2 >= c6334b.f24369u) {
                    throw new NoSuchElementException();
                }
                this.f24363t = i2 + 1;
                this.f24364u = i2;
                return c6334b.f24367s[c6334b.f24368t + i2];
            default:
                m12134b();
                int i3 = this.f24363t;
                C6335c c6335c = (C6335c) this.f24366w;
                if (i3 >= c6335c.f24374t) {
                    throw new NoSuchElementException();
                }
                this.f24363t = i3 + 1;
                this.f24364u = i3;
                return c6335c.f24373s[i3];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f24362s) {
            case 0:
                break;
        }
        return this.f24363t;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f24362s) {
            case 0:
                m12133a();
                int i2 = this.f24363t;
                if (i2 <= 0) {
                    throw new NoSuchElementException();
                }
                int i3 = i2 - 1;
                this.f24363t = i3;
                this.f24364u = i3;
                C6334b c6334b = (C6334b) this.f24366w;
                return c6334b.f24367s[c6334b.f24368t + i3];
            default:
                m12134b();
                int i4 = this.f24363t;
                if (i4 <= 0) {
                    throw new NoSuchElementException();
                }
                int i5 = i4 - 1;
                this.f24363t = i5;
                this.f24364u = i5;
                return ((C6335c) this.f24366w).f24373s[i5];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i2;
        switch (this.f24362s) {
            case 0:
                i2 = this.f24363t;
                break;
            default:
                i2 = this.f24363t;
                break;
        }
        return i2 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f24362s) {
            case 0:
                C6334b c6334b = (C6334b) this.f24366w;
                m12133a();
                int i2 = this.f24364u;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c6334b.mo12082b(i2);
                this.f24363t = this.f24364u;
                this.f24364u = -1;
                this.f24365v = ((AbstractList) c6334b).modCount;
                return;
            default:
                C6335c c6335c = (C6335c) this.f24366w;
                m12134b();
                int i3 = this.f24364u;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c6335c.mo12082b(i3);
                this.f24363t = this.f24364u;
                this.f24364u = -1;
                this.f24365v = ((AbstractList) c6335c).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f24362s) {
            case 0:
                m12133a();
                int i2 = this.f24364u;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C6334b) this.f24366w).set(i2, obj);
                return;
            default:
                m12134b();
                int i3 = this.f24364u;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C6335c) this.f24366w).set(i3, obj);
                return;
        }
    }

    public C6333a(C6334b c6334b, int i2) {
        this.f24366w = c6334b;
        this.f24363t = i2;
        this.f24365v = ((AbstractList) c6334b).modCount;
    }
}
