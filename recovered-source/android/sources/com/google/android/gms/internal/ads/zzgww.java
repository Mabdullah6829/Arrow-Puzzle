package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgww<K, V> implements Map<K, V>, Serializable {

    /* JADX INFO: renamed from: s */
    public transient zzgxd f18310s;

    /* JADX INFO: renamed from: t */
    public transient zzgxd f18311t;

    /* JADX INFO: renamed from: u */
    public transient zzgwp f18312u;

    /* JADX INFO: renamed from: a */
    public static zzgww m7229a(Map map) {
        if ((map instanceof zzgww) && !(map instanceof SortedMap)) {
            zzgww zzgwwVar = (zzgww) map;
            zzgwwVar.getClass();
            return zzgwwVar;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        zzgwv zzgwvVar = new zzgwv(setEntrySet != null ? setEntrySet.size() : 4);
        zzgwvVar.m7226b(setEntrySet);
        return zzgwvVar.m7228d(true);
    }

    /* JADX INFO: renamed from: b */
    public abstract zzgxd mo7230b();

    /* JADX INFO: renamed from: c */
    public abstract zzgxd mo7231c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        zzgwp zzgwpVarMo7232d = this.f18312u;
        if (zzgwpVarMo7232d == null) {
            zzgwpVarMo7232d = mo7232d();
            this.f18312u = zzgwpVarMo7232d;
        }
        return zzgwpVarMo7232d.contains(obj);
    }

    /* JADX INFO: renamed from: d */
    public abstract zzgwp mo7232d();

    @Override // java.util.Map
    public final Set entrySet() {
        zzgxd zzgxdVar = this.f18310s;
        if (zzgxdVar != null) {
            return zzgxdVar;
        }
        zzgxd zzgxdVarMo7230b = mo7230b();
        this.f18310s = zzgxdVarMo7230b;
        return zzgxdVarMo7230b;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return zzgya.m7261a(obj, this);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        zzgxd zzgxdVarMo7230b = this.f18310s;
        if (zzgxdVarMo7230b == null) {
            zzgxdVarMo7230b = mo7230b();
            this.f18310s = zzgxdVarMo7230b;
        }
        return zzgzd.m7270c(zzgxdVarMo7230b);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        zzgxd zzgxdVar = this.f18311t;
        if (zzgxdVar != null) {
            return zzgxdVar;
        }
        zzgxd zzgxdVarMo7231c = mo7231c();
        this.f18311t = zzgxdVarMo7231c;
        return zzgxdVarMo7231c;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzgvp.m7175b(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        zzgwp zzgwpVar = this.f18312u;
        if (zzgwpVar != null) {
            return zzgwpVar;
        }
        zzgwp zzgwpVarMo7232d = mo7232d();
        this.f18312u = zzgwpVarMo7232d;
        return zzgwpVarMo7232d;
    }
}
