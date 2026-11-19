package p058e0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6452k;
import p080q0.InterfaceC6520a;

/* JADX INFO: renamed from: e0.c */
/* JADX INFO: loaded from: classes.dex */
public class C6295c implements Iterator, InterfaceC6520a {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f24322s = 0;

    /* JADX INFO: renamed from: t */
    public int f24323t;

    /* JADX INFO: renamed from: u */
    public final Object f24324u;

    public C6295c(Object[] array) {
        AbstractC6452k.m12181e(array, "array");
        this.f24324u = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f24322s) {
            case 0:
                return this.f24323t < ((AbstractC6298f) this.f24324u).size();
            default:
                return this.f24323t < ((Object[]) this.f24324u).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f24322s) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                AbstractC6298f abstractC6298f = (AbstractC6298f) this.f24324u;
                int i2 = this.f24323t;
                this.f24323t = i2 + 1;
                return abstractC6298f.get(i2);
            default:
                try {
                    Object[] objArr = (Object[]) this.f24324u;
                    int i3 = this.f24323t;
                    this.f24323t = i3 + 1;
                    return objArr[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f24323t--;
                    throw new NoSuchElementException(e.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f24322s) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C6295c(AbstractC6298f abstractC6298f) {
        this.f24324u = abstractC6298f;
    }
}
