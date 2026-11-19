package androidx.core.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6452k;
import p058e0.AbstractC6305m;
import p058e0.AbstractC6306n;
import p078p0.InterfaceC6498l;
import p080q0.InterfaceC6520a;

/* JADX INFO: loaded from: classes.dex */
public final class TreeIterator<T> implements Iterator<T>, InterfaceC6520a {
    private final InterfaceC6498l getChildIterator;
    private Iterator<? extends T> iterator;
    private final List<Iterator<T>> stack = new ArrayList();

    public TreeIterator(Iterator<? extends T> it, InterfaceC6498l interfaceC6498l) {
        this.getChildIterator = interfaceC6498l;
        this.iterator = it;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private final void prepareNextIterator(T t) {
        Iterator<? extends T> it = (Iterator) this.getChildIterator.invoke(t);
        if (it != null && it.hasNext()) {
            this.stack.add((Iterator<T>) this.iterator);
            this.iterator = it;
            return;
        }
        while (!this.iterator.hasNext() && !this.stack.isEmpty()) {
            this.iterator = (Iterator) AbstractC6305m.m12106B(this.stack);
            List<Iterator<T>> list = this.stack;
            AbstractC6452k.m12181e(list, "<this>");
            if (list.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            list.remove(AbstractC6306n.m12119q(list));
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        T next = this.iterator.next();
        prepareNextIterator(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
