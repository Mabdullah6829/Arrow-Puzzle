package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgzc extends AbstractSet {
    private zzgzc() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract zzgzh iterator();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo7267b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        int size;
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                boolean z = set instanceof zzgzc;
                int iMo7267b = z ? ((zzgzc) set).mo7267b() : set.size();
                if (iMo7267b >= 0) {
                    if (z) {
                        ((zzgzc) set).getClass();
                        size = 0;
                    } else {
                        size = set.size();
                    }
                    if (mo7267b() >= size) {
                        zzgzh it = iterator();
                        int i2 = 0;
                        while (true) {
                            zzgur zzgurVar = (zzgur) it;
                            if (!zzgurVar.hasNext()) {
                                if (i2 != iMo7267b) {
                                    if (i2 < size) {
                                        break;
                                    }
                                    Iterator it2 = set.iterator();
                                    int i3 = 0;
                                    while (it2.hasNext()) {
                                        it2.next();
                                        i3++;
                                        if (i3 > i2) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                try {
                                    if (!set.contains(zzgurVar.next())) {
                                        break;
                                    }
                                    i2++;
                                } catch (ClassCastException | NullPointerException unused) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }
}
