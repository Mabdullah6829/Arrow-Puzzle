package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzhog {

    /* JADX INFO: renamed from: a */
    public final Class f19051a;

    /* JADX INFO: renamed from: b */
    public final Class f19052b;

    public /* synthetic */ zzhog(Class cls, Class cls2) {
        this.f19051a = cls;
        this.f19052b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhog)) {
            return false;
        }
        zzhog zzhogVar = (zzhog) obj;
        return zzhogVar.f19051a.equals(this.f19051a) && zzhogVar.f19052b.equals(this.f19052b);
    }

    public final int hashCode() {
        return Objects.hash(this.f19051a, this.f19052b);
    }

    public final String toString() {
        String simpleName = this.f19051a.getSimpleName();
        String simpleName2 = this.f19052b.getSimpleName();
        return AbstractC1456a.m2450q(new StringBuilder(simpleName.length() + 26 + simpleName2.length()), simpleName, " with serialization type: ", simpleName2);
    }
}
