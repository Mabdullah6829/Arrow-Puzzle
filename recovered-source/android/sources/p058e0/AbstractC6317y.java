package p058e0;

import java.util.Iterator;
import p080q0.InterfaceC6520a;

/* JADX INFO: renamed from: e0.y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6317y implements Iterator, InterfaceC6520a {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(nextLong());
    }

    public abstract long nextLong();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final Long next() {
        return Long.valueOf(nextLong());
    }
}
