package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzgvj extends zzgvm implements Serializable {

    /* JADX INFO: renamed from: v */
    public final transient Map f18256v;

    /* JADX INFO: renamed from: w */
    public transient int f18257w;

    public zzgvj(Map map) {
        zzgtr.m7128a(map.isEmpty());
        this.f18256v = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    /* JADX INFO: renamed from: a */
    public Map mo7169a() {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public Collection mo7154c(Collection collection) {
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public Collection mo7155d(Object obj, Collection collection) {
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public abstract Collection mo7156e();

    /* JADX INFO: renamed from: f */
    public final void m7170f() {
        Map map = this.f18256v;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f18257w = 0;
    }

    /* JADX INFO: renamed from: g */
    public Set mo7171g() {
        throw null;
    }
}
