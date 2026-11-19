package p003C;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p001B.AbstractC0076b;

/* JADX INFO: renamed from: C.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C0125p implements ListIterator {

    /* JADX INFO: renamed from: s */
    public boolean f187s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ ListIterator f188t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C0126q f189u;

    public C0125p(C0126q c0126q, ListIterator listIterator) {
        this.f189u = c0126q;
        this.f188t = listIterator;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.f188t;
        listIterator.add(obj);
        listIterator.previous();
        this.f187s = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f188t.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f188t.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.f188t;
        if (!listIterator.hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f187s = true;
        return listIterator.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f189u.m210a(this.f188t.nextIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.f188t;
        if (!listIterator.hasNext()) {
            throw new NoSuchElementException();
        }
        this.f187s = true;
        return listIterator.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        AbstractC0076b.m139n(this.f187s, "no calls to next() since the last call to remove()");
        this.f188t.remove();
        this.f187s = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        AbstractC0076b.m138m(this.f187s);
        this.f188t.set(obj);
    }
}
