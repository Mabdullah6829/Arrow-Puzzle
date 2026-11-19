package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgwx extends zzgzh {

    /* JADX INFO: renamed from: s */
    public final Iterator f18313s;

    /* JADX INFO: renamed from: t */
    public Object f18314t;

    /* JADX INFO: renamed from: u */
    public zzgzh f18315u;

    public zzgwx(zzgxb zzgxbVar) {
        Objects.requireNonNull(zzgxbVar);
        zzgww zzgwwVar = zzgxbVar.f18319v;
        zzgxd zzgxdVarMo7230b = zzgwwVar.f18310s;
        if (zzgxdVarMo7230b == null) {
            zzgxdVarMo7230b = zzgwwVar.mo7230b();
            zzgwwVar.f18310s = zzgxdVarMo7230b;
        }
        this.f18313s = zzgxdVarMo7230b.mo7211h().listIterator(0);
        this.f18314t = null;
        this.f18315u = zzgxj.f18329v;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18315u.hasNext() || ((zzguq) this.f18313s).hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.f18315u.hasNext()) {
            Map.Entry entry = (Map.Entry) ((zzguq) this.f18313s).next();
            this.f18314t = entry.getKey();
            this.f18315u = ((zzgwp) entry.getValue()).iterator();
        }
        Object obj = this.f18314t;
        Objects.requireNonNull(obj);
        return new AbstractMap.SimpleImmutableEntry(obj, this.f18315u.next());
    }
}
