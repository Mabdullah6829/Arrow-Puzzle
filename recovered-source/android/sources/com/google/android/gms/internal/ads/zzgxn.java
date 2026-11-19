package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzgxn extends zzgyn implements Serializable {

    /* JADX INFO: renamed from: s */
    public final zzawp f18335s;

    public zzgxn(zzawp zzawpVar) {
        this.f18335s = zzawpVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Iterator it = ((Iterable) obj).iterator();
        Iterator it2 = ((Iterable) obj2).iterator();
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return 1;
            }
            int iCompare = this.f18335s.compare(it.next(), it2.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return it2.hasNext() ? -1 : 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgxn) {
            return this.f18335s.equals(((zzgxn) obj).f18335s);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18335s.hashCode() ^ 2075626741;
    }

    public final String toString() {
        return this.f18335s.toString().concat(".lexicographical()");
    }
}
