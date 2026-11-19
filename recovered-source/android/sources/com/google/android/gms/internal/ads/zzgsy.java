package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzgsy implements Iterator {

    /* JADX INFO: renamed from: s */
    public Object f18166s;

    /* JADX INFO: renamed from: t */
    public int f18167t = 2;

    /* JADX INFO: renamed from: a */
    public abstract String mo7118a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzgtr.m7133f(this.f18167t != 4);
        int i2 = this.f18167t;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            return true;
        }
        if (i3 != 2) {
            this.f18167t = 4;
            this.f18166s = mo7118a();
            if (this.f18167t != 3) {
                this.f18167t = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f18167t = 2;
        Object obj = this.f18166s;
        this.f18166s = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
