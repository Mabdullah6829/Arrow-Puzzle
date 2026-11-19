package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgxl extends zzgzh {

    /* JADX INFO: renamed from: s */
    public final Object f18333s;

    /* JADX INFO: renamed from: t */
    public boolean f18334t;

    public zzgxl(Object obj) {
        this.f18333s = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f18334t;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f18334t) {
            throw new NoSuchElementException();
        }
        this.f18334t = true;
        return this.f18333s;
    }
}
