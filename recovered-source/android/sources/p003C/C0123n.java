package p003C;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: C.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C0123n extends AbstractC0109D {

    /* JADX INFO: renamed from: s */
    public boolean f185s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f186t;

    public C0123n(Object obj) {
        this.f186t = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f185s;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f185s) {
            throw new NoSuchElementException();
        }
        this.f185s = true;
        return this.f186t;
    }
}
