package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzdc implements Iterator {

    /* JADX INFO: renamed from: s */
    public Object f21624s;

    /* JADX INFO: renamed from: t */
    public int f21625t = 2;

    /* JADX INFO: renamed from: a */
    public abstract String mo9122a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f21625t;
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
            this.f21625t = 4;
            this.f21624s = mo9122a();
            if (this.f21625t != 3) {
                this.f21625t = 1;
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
        this.f21625t = 2;
        Object obj = this.f21624s;
        this.f21624s = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
