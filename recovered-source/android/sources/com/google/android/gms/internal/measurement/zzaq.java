package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class zzaq implements Iterator {

    /* JADX INFO: renamed from: s */
    public int f22247s = 0;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzas f22248t;

    public zzaq(zzas zzasVar) {
        this.f22248t = zzasVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22247s < this.f22248t.f22251s.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        String str = this.f22248t.f22251s;
        int i2 = this.f22247s;
        if (i2 >= str.length()) {
            throw new NoSuchElementException();
        }
        this.f22247s = i2 + 1;
        return new zzas(String.valueOf(i2));
    }
}
