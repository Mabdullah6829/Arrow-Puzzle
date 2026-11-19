package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzhof {

    /* JADX INFO: renamed from: a */
    public final Class f19049a;

    /* JADX INFO: renamed from: b */
    public final zzibk f19050b;

    public /* synthetic */ zzhof(Class cls, zzibk zzibkVar) {
        this.f19049a = cls;
        this.f19050b = zzibkVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhof)) {
            return false;
        }
        zzhof zzhofVar = (zzhof) obj;
        return zzhofVar.f19049a.equals(this.f19049a) && zzhofVar.f19050b.equals(this.f19050b);
    }

    public final int hashCode() {
        return Objects.hash(this.f19049a, this.f19050b);
    }

    public final String toString() {
        String simpleName = this.f19049a.getSimpleName();
        String strValueOf = String.valueOf(this.f19050b);
        return AbstractC1456a.m2450q(new StringBuilder(simpleName.length() + 21 + strValueOf.length()), simpleName, ", object identifier: ", strValueOf);
    }
}
