package p058e0;

import java.util.List;
import java.util.ListIterator;
import p011H.AbstractC0271e0;
import p080q0.InterfaceC6520a;
import p087v0.C6545d;

/* JADX INFO: renamed from: e0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C6290A implements ListIterator, InterfaceC6520a {

    /* JADX INFO: renamed from: s */
    public final ListIterator f24319s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C6291B f24320t;

    public C6290A(C6291B c6291b, int i2) {
        this.f24320t = c6291b;
        List list = c6291b.f24321s;
        if (i2 >= 0 && i2 <= c6291b.size()) {
            this.f24319s = list.listIterator(c6291b.size() - i2);
            return;
        }
        StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Position index ", " must be in range [");
        sbM404l.append(new C6545d(0, c6291b.size(), 1));
        sbM404l.append("].");
        throw new IndexOutOfBoundsException(sbM404l.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f24319s.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f24319s.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f24319s.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return AbstractC6306n.m12119q(this.f24320t) - this.f24319s.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f24319s.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return AbstractC6306n.m12119q(this.f24320t) - this.f24319s.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
