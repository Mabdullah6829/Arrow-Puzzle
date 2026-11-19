package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzgtt implements Serializable, zzgts {

    /* JADX INFO: renamed from: s */
    public final List f18180s;

    @Override // com.google.android.gms.internal.ads.zzgts
    /* JADX INFO: renamed from: b */
    public final boolean mo3897b(Object obj) {
        int i2 = 0;
        while (true) {
            List list = this.f18180s;
            if (i2 >= list.size()) {
                return true;
            }
            if (!((zzgts) list.get(i2)).mo3897b(obj)) {
                return false;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgtt) {
            return this.f18180s.equals(((zzgtt) obj).f18180s);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18180s.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.f18180s) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
