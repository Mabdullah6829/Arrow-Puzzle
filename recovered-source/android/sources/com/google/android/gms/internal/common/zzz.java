package com.google.android.gms.internal.common;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzz extends zzal {

    /* JADX INFO: renamed from: s */
    public final int f21592s;

    /* JADX INFO: renamed from: t */
    public int f21593t;

    public zzz(int i2, int i3) {
        zzr.m9109b(i3, i2);
        this.f21592s = i2;
        this.f21593t = i3;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo9095a(int i2);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f21593t < this.f21592s;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f21593t > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f21593t;
        this.f21593t = i2 + 1;
        return mo9095a(i2);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f21593t;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f21593t - 1;
        this.f21593t = i2;
        return mo9095a(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f21593t - 1;
    }
}
