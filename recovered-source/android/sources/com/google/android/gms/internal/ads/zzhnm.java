package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzhnm implements Iterable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ List f19012s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ List f19013t;

    public zzhnm(zzhnp zzhnpVar, List list, List list2) {
        this.f19012s = list;
        this.f19013t = list2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzhno(this.f19012s.iterator(), this.f19013t.iterator());
    }
}
