package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhmp implements zzhds {
    static {
        zzhmo zzhmoVar = new zzhmo();
        HashMap map = zzhmoVar.f18988a;
        if (map == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Collections.unmodifiableMap(map);
        zzhmoVar.f18988a = null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhmp)) {
            return false;
        }
        ((zzhmp) obj).getClass();
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
