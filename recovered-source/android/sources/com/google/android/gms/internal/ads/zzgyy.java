package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzgyy extends zzgzc {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Set f18382s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Set f18383t;

    public zzgyy(Set set, Set set2) {
        this.f18382s = set;
        this.f18383t = set2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzc, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: a */
    public final zzgzh iterator() {
        return new zzgyx(this, this.f18382s, this.f18383t);
    }

    @Override // com.google.android.gms.internal.ads.zzgzc
    /* JADX INFO: renamed from: b */
    public final int mo7267b() {
        Set set = this.f18382s;
        int iMo7267b = set instanceof zzgzc ? ((zzgzc) set).mo7267b() : set.size();
        Set set2 = this.f18383t;
        return Math.min(iMo7267b, set2 instanceof zzgzc ? ((zzgzc) set2).mo7267b() : set2.size());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f18382s.contains(obj) && this.f18383t.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f18382s.containsAll(collection) && this.f18383t.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f18383t, this.f18382s);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f18382s.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (this.f18383t.contains(it.next())) {
                i2++;
            }
        }
        return i2;
    }
}
