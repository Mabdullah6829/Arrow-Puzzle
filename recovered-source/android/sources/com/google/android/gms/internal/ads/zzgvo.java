package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgvo extends zzgyn implements Serializable {

    /* JADX INFO: renamed from: s */
    public final zzgti f18262s;

    /* JADX INFO: renamed from: t */
    public final zzgyn f18263t;

    public zzgvo(zzgti zzgtiVar, zzgyn zzgynVar) {
        this.f18262s = zzgtiVar;
        this.f18263t = zzgynVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzgti zzgtiVar = this.f18262s;
        return this.f18263t.compare(zzgtiVar.apply(obj), zzgtiVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgvo) {
            zzgvo zzgvoVar = (zzgvo) obj;
            if (this.f18262s.equals(zzgvoVar.f18262s) && this.f18263t.equals(zzgvoVar.f18263t)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f18262s, this.f18263t);
    }

    public final String toString() {
        String string = this.f18263t.toString();
        int length = string.length();
        String string2 = this.f18262s.toString();
        return AbstractC1456a.m2451r(new StringBuilder(length + 12 + string2.length() + 1), string, ".onResultOf(", string2, ")");
    }
}
