package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzhnu {

    /* JADX INFO: renamed from: a */
    public final Class f19024a;

    /* JADX INFO: renamed from: b */
    public final Class f19025b;

    public /* synthetic */ zzhnu(Class cls, Class cls2) {
        this.f19024a = cls;
        this.f19025b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhnu)) {
            return false;
        }
        zzhnu zzhnuVar = (zzhnu) obj;
        return zzhnuVar.f19024a.equals(this.f19024a) && zzhnuVar.f19025b.equals(this.f19025b);
    }

    public final int hashCode() {
        return Objects.hash(this.f19024a, this.f19025b);
    }

    public final String toString() {
        String simpleName = this.f19024a.getSimpleName();
        String simpleName2 = this.f19025b.getSimpleName();
        return AbstractC1456a.m2450q(new StringBuilder(simpleName.length() + 22 + simpleName2.length()), simpleName, " with primitive type: ", simpleName2);
    }
}
