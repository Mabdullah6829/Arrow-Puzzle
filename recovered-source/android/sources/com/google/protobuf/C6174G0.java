package com.google.protobuf;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.protobuf.G0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6174G0 implements Iterator {

    /* JADX INFO: renamed from: s */
    public final ArrayDeque f24079s;

    /* JADX INFO: renamed from: t */
    public C6248m f24080t;

    public C6174G0(AbstractC6251n abstractC6251n) {
        if (!(abstractC6251n instanceof C6176H0)) {
            this.f24079s = null;
            this.f24080t = (C6248m) abstractC6251n;
            return;
        }
        C6176H0 c6176h0 = (C6176H0) abstractC6251n;
        ArrayDeque arrayDeque = new ArrayDeque(c6176h0.f24086z);
        this.f24079s = arrayDeque;
        arrayDeque.push(c6176h0);
        AbstractC6251n abstractC6251n2 = c6176h0.f24083w;
        while (abstractC6251n2 instanceof C6176H0) {
            C6176H0 c6176h1 = (C6176H0) abstractC6251n2;
            this.f24079s.push(c6176h1);
            abstractC6251n2 = c6176h1.f24083w;
        }
        this.f24080t = (C6248m) abstractC6251n2;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C6248m next() {
        C6248m c6248m;
        C6248m c6248m2 = this.f24080t;
        if (c6248m2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f24079s;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                c6248m = null;
                break;
            }
            AbstractC6251n abstractC6251n = ((C6176H0) arrayDeque.pop()).f24084x;
            while (abstractC6251n instanceof C6176H0) {
                C6176H0 c6176h0 = (C6176H0) abstractC6251n;
                arrayDeque.push(c6176h0);
                abstractC6251n = c6176h0.f24083w;
            }
            c6248m = (C6248m) abstractC6251n;
        } while (c6248m.isEmpty());
        this.f24080t = c6248m;
        return c6248m2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24080t != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
