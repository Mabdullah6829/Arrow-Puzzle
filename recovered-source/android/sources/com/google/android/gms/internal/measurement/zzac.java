package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class zzac implements Iterator {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Iterator f21953s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Iterator f21954t;

    public zzac(zzae zzaeVar, Iterator it, Iterator it2) {
        this.f21953s = it;
        this.f21954t = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f21953s.hasNext()) {
            return true;
        }
        return this.f21954t.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f21953s;
        if (it.hasNext()) {
            return new zzas(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f21954t;
        if (it2.hasNext()) {
            return new zzas((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
