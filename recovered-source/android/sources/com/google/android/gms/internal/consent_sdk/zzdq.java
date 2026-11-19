package com.google.android.gms.internal.consent_sdk;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzdq extends zzec {

    /* JADX INFO: renamed from: s */
    public final int f21630s;

    /* JADX INFO: renamed from: t */
    public int f21631t;

    public zzdq(int i2, int i3) {
        zzdj.m9124b(i3, i2);
        this.f21630s = i2;
        this.f21631t = i3;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo9131a(int i2);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f21631t < this.f21630s;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f21631t > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f21631t;
        this.f21631t = i2 + 1;
        return mo9131a(i2);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f21631t;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f21631t - 1;
        this.f21631t = i2;
        return mo9131a(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f21631t - 1;
    }
}
