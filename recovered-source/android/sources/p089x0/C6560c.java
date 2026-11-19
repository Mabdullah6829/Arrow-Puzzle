package p089x0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p000A0.C0059r;
import p080q0.InterfaceC6520a;

/* JADX INFO: renamed from: x0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6560c implements Iterator, InterfaceC6520a {

    /* JADX INFO: renamed from: s */
    public final Iterator f24778s;

    /* JADX INFO: renamed from: t */
    public int f24779t = -1;

    /* JADX INFO: renamed from: u */
    public Object f24780u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C6561d f24781v;

    public C6560c(C6561d c6561d) {
        this.f24781v = c6561d;
        this.f24778s = new C6568k((C6561d) c6561d.f24783b);
    }

    /* JADX INFO: renamed from: a */
    public final void m12213a() {
        Object next;
        do {
            Iterator it = this.f24778s;
            if (!it.hasNext()) {
                this.f24779t = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((C0059r) this.f24781v.f24784c).invoke(next)).booleanValue());
        this.f24780u = next;
        this.f24779t = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f24779t == -1) {
            m12213a();
        }
        return this.f24779t == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f24779t == -1) {
            m12213a();
        }
        if (this.f24779t == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f24780u;
        this.f24780u = null;
        this.f24779t = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
