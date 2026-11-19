package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzgxz extends AbstractMap {

    /* JADX INFO: renamed from: s */
    public transient Set f18344s;

    /* JADX INFO: renamed from: t */
    public transient Set f18345t;

    /* JADX INFO: renamed from: u */
    public transient Collection f18346u;

    /* JADX INFO: renamed from: a */
    public abstract Set mo7158a();

    /* JADX INFO: renamed from: b */
    public Set mo7160b() {
        return new zzgxx(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f18344s;
        if (set != null) {
            return set;
        }
        Set setMo7158a = mo7158a();
        this.f18344s = setMo7158a;
        return setMo7158a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f18345t;
        if (set != null) {
            return set;
        }
        Set setMo7160b = mo7160b();
        this.f18345t = setMo7160b;
        return setMo7160b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f18346u;
        if (collection != null) {
            return collection;
        }
        zzgxy zzgxyVar = new zzgxy(this);
        this.f18346u = zzgxyVar;
        return zzgxyVar;
    }
}
