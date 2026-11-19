package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzahb {

    /* JADX INFO: renamed from: a */
    public final zzahe f5304a;

    /* JADX INFO: renamed from: b */
    public final zzahe f5305b;

    public zzahb(zzahe zzaheVar, zzahe zzaheVar2) {
        this.f5304a = zzaheVar;
        this.f5305b = zzaheVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahb.class == obj.getClass()) {
            zzahb zzahbVar = (zzahb) obj;
            if (this.f5304a.equals(zzahbVar.f5304a) && this.f5305b.equals(zzahbVar.f5305b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5305b.hashCode() + (this.f5304a.hashCode() * 31);
    }

    public final String toString() {
        zzahe zzaheVar = this.f5304a;
        String string = zzaheVar.toString();
        zzahe zzaheVar2 = this.f5305b;
        String strConcat = zzaheVar.equals(zzaheVar2) ? "" : ", ".concat(zzaheVar2.toString());
        return AbstractC1456a.m2451r(new StringBuilder(AbstractC1456a.m2438e(string.length() + 1, 1, strConcat)), "[", string, strConcat, "]");
    }
}
