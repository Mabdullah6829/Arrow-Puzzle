package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzimp implements Iterator {

    /* JADX INFO: renamed from: s */
    public int f19980s = 0;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzimq f19981t;

    public zzimp(zzimq zzimqVar) {
        this.f19981t = zzimqVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f19980s;
        zzimq zzimqVar = this.f19981t;
        return i2 < zzimqVar.f19983s.size() || zzimqVar.f19984t.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f19980s;
        zzimq zzimqVar = this.f19981t;
        List list = zzimqVar.f19983s;
        if (i2 >= list.size()) {
            list.add(zzimqVar.f19984t.next());
            return next();
        }
        int i3 = this.f19980s;
        this.f19980s = i3 + 1;
        return list.get(i3);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
