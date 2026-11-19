package p058e0;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: e0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6296d extends C6295c implements ListIterator {

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ AbstractC6298f f24325v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6296d(AbstractC6298f abstractC6298f, int i2) {
        super(abstractC6298f);
        this.f24325v = abstractC6298f;
        C6294b c6294b = AbstractC6298f.Companion;
        int size = abstractC6298f.size();
        c6294b.getClass();
        C6294b.m12078b(i2, size);
        this.f24323t = i2;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f24323t > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f24323t;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f24323t - 1;
        this.f24323t = i2;
        return this.f24325v.get(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f24323t - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
