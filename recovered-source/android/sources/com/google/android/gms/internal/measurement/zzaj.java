package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzaj implements Iterator {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Iterator f22226s;

    public zzaj(Iterator it) {
        this.f22226s = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22226s.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new zzas((String) this.f22226s.next());
    }
}
