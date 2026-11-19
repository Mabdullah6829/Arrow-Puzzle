package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzguq extends zzgzi {

    /* JADX INFO: renamed from: s */
    public final int f18210s;

    /* JADX INFO: renamed from: t */
    public int f18211t;

    public zzguq(int i2, int i3) {
        zzgtr.m7137j(i3, i2);
        this.f18210s = i2;
        this.f18211t = i3;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo7152a(int i2);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f18211t < this.f18210s;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f18211t > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f18211t;
        this.f18211t = i2 + 1;
        return mo7152a(i2);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f18211t;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f18211t - 1;
        this.f18211t = i2;
        return mo7152a(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f18211t - 1;
    }
}
