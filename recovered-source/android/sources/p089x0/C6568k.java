package p089x0;

import java.util.Iterator;
import p080q0.InterfaceC6520a;

/* JADX INFO: renamed from: x0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C6568k implements Iterator, InterfaceC6520a {

    /* JADX INFO: renamed from: s */
    public final Iterator f24792s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C6561d f24793t;

    public C6568k(C6561d c6561d) {
        this.f24793t = c6561d;
        this.f24792s = ((InterfaceC6563f) c6561d.f24783b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24792s.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f24793t.f24784c.invoke(this.f24792s.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
