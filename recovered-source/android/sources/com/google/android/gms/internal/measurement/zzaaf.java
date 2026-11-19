package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaaf {

    /* JADX INFO: renamed from: a */
    public final zzabn f21857a;

    /* JADX INFO: renamed from: b */
    public final String f21858b;

    public zzaaf(zzabn zzabnVar, String str) {
        zzabr.m9334a(zzabnVar, "parser");
        this.f21857a = zzabnVar;
        this.f21858b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaaf) {
            zzaaf zzaafVar = (zzaaf) obj;
            if (this.f21857a.equals(zzaafVar.f21857a) && this.f21858b.equals(zzaafVar.f21858b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f21857a.hashCode() ^ this.f21858b.hashCode();
    }
}
