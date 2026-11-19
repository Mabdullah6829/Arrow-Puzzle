package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgzd {
    /* JADX INFO: renamed from: a */
    public static zzgzc m7268a(Set set, zzgxd zzgxdVar) {
        zzgtr.m7135h(set, "set1");
        zzgtr.m7135h(zzgxdVar, "set2");
        return new zzgyy(set, zzgxdVar);
    }

    /* JADX INFO: renamed from: b */
    public static Set m7269b(Set set, zzgts zzgtsVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof zzgyz)) {
                set.getClass();
                return new zzgyz(set, zzgtsVar);
            }
            zzgyz zzgyzVar = (zzgyz) set;
            zzgts zzgtsVar2 = zzgyzVar.f18265t;
            zzgtsVar2.getClass();
            return new zzgyz((Set) zzgyzVar.f18264s, new zzgtt(Arrays.asList(zzgtsVar2, zzgtsVar)));
        }
        Collection collection = (SortedSet) set;
        if (!(collection instanceof zzgyz)) {
            collection.getClass();
            return new zzgza(collection, zzgtsVar);
        }
        zzgyz zzgyzVar2 = (zzgyz) collection;
        zzgts zzgtsVar3 = zzgyzVar2.f18265t;
        zzgtsVar3.getClass();
        return new zzgza((SortedSet) zzgyzVar2.f18264s, new zzgtt(Arrays.asList(zzgtsVar3, zzgtsVar)));
    }

    /* JADX INFO: renamed from: c */
    public static int m7270c(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m7271d(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m7272e(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzgyk) {
            collection = ((zzgyk) collection).zza();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= set.remove(it.next());
            }
            return zRemove;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }
}
