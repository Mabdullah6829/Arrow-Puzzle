package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgwy extends zzgzh {

    /* JADX INFO: renamed from: s */
    public final Iterator f18316s;

    /* JADX INFO: renamed from: t */
    public zzgzh f18317t;

    public zzgwy(zzgxb zzgxbVar) {
        Objects.requireNonNull(zzgxbVar);
        zzgww zzgwwVar = zzgxbVar.f18319v;
        zzgwp zzgwpVarMo7232d = zzgwwVar.f18312u;
        if (zzgwpVarMo7232d == null) {
            zzgwpVarMo7232d = zzgwwVar.mo7232d();
            zzgwwVar.f18312u = zzgwpVarMo7232d;
        }
        this.f18316s = ((zzgwt) zzgwpVarMo7232d).listIterator(0);
        this.f18317t = zzgxj.f18329v;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18317t.hasNext() || ((zzguq) this.f18316s).hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f18317t.hasNext()) {
            this.f18317t = ((zzgwp) ((zzguq) this.f18316s).next()).iterator();
        }
        return this.f18317t.next();
    }
}
