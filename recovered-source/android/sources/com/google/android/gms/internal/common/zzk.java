package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzk implements Iterator {

    /* JADX INFO: renamed from: s */
    public Object f21587s;

    /* JADX INFO: renamed from: t */
    public int f21588t = 2;

    /* JADX INFO: renamed from: a */
    public abstract String mo9107a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f21588t;
        if (i2 == 4) {
            throw new IllegalStateException();
        }
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            return true;
        }
        if (i3 != 2) {
            this.f21588t = 4;
            this.f21587s = mo9107a();
            if (this.f21588t != 3) {
                this.f21588t = 1;
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
        this.f21588t = 2;
        Object obj = this.f21587s;
        this.f21587s = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
