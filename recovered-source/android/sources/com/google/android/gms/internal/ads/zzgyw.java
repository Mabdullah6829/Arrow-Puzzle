package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class zzgyw extends zzgyn implements Serializable {

    /* JADX INFO: renamed from: s */
    public final zzgyn f18379s;

    public zzgyw(zzgyn zzgynVar) {
        this.f18379s = zzgynVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f18379s.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgyw) {
            return this.f18379s.equals(((zzgyw) obj).f18379s);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f18379s.hashCode();
    }

    public final String toString() {
        return this.f18379s.toString().concat(".reverse()");
    }
}
