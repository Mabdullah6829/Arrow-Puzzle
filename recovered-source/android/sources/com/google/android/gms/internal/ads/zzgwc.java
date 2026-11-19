package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class zzgwc extends zzgyn implements Serializable {

    /* JADX INFO: renamed from: s */
    public final Comparator f18289s;

    public zzgwc(Comparator comparator) {
        this.f18289s = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f18289s.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgwc) {
            return this.f18289s.equals(((zzgwc) obj).f18289s);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18289s.hashCode();
    }

    public final String toString() {
        return this.f18289s.toString();
    }
}
