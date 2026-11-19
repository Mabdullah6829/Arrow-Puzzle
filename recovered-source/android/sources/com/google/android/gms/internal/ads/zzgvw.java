package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzgvw implements Iterator {

    /* JADX INFO: renamed from: s */
    public int f18270s;

    /* JADX INFO: renamed from: t */
    public int f18271t;

    /* JADX INFO: renamed from: u */
    public int f18272u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzgwa f18273v;

    public zzgvw(zzgwa zzgwaVar) {
        Objects.requireNonNull(zzgwaVar);
        this.f18273v = zzgwaVar;
        this.f18270s = zzgwaVar.f18285w;
        this.f18271t = zzgwaVar.isEmpty() ? -1 : 0;
        this.f18272u = -1;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo7176a(int i2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18271t >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzgwa zzgwaVar = this.f18273v;
        if (zzgwaVar.f18285w != this.f18270s) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f18271t;
        this.f18272u = i2;
        Object objMo7176a = mo7176a(i2);
        int i3 = this.f18271t + 1;
        if (i3 >= zzgwaVar.f18286x) {
            i3 = -1;
        }
        this.f18271t = i3;
        return objMo7176a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzgwa zzgwaVar = this.f18273v;
        if (zzgwaVar.f18285w != this.f18270s) {
            throw new ConcurrentModificationException();
        }
        zzgtr.m7134g("no calls to next() since the last call to remove()", this.f18272u >= 0);
        this.f18270s += 32;
        zzgwaVar.remove(zzgwaVar.m7180b()[this.f18272u]);
        this.f18271t--;
        this.f18272u = -1;
    }
}
