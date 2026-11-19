package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class zzar implements Iterator {

    /* JADX INFO: renamed from: s */
    public int f22249s = 0;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzas f22250t;

    public zzar(zzas zzasVar) {
        this.f22250t = zzasVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22249s < this.f22250t.f22251s.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        zzas zzasVar = this.f22250t;
        String str = zzasVar.f22251s;
        int i2 = this.f22249s;
        if (i2 >= str.length()) {
            throw new NoSuchElementException();
        }
        this.f22249s = i2 + 1;
        return new zzas(String.valueOf(zzasVar.f22251s.charAt(i2)));
    }
}
