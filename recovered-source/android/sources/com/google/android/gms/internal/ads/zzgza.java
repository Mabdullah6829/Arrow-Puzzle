package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
final class zzgza extends zzgyz implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f18264s).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f18264s.iterator();
        it.getClass();
        zzgts zzgtsVar = this.f18265t;
        zzgtsVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (zzgtsVar.mo3897b(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new zzgza(((SortedSet) this.f18264s).headSet(obj), this.f18265t);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f18264s;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f18265t.mo3897b(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new zzgza(((SortedSet) this.f18264s).subSet(obj, obj2), this.f18265t);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new zzgza(((SortedSet) this.f18264s).tailSet(obj), this.f18265t);
    }
}
