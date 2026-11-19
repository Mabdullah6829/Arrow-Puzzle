package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgwj extends zzgwk implements Map {
    @Override // com.google.android.gms.internal.ads.zzgwk
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ Object mo6718b() {
        throw null;
    }

    @Override // java.util.Map
    public final void clear() {
        mo7199g().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return mo7199g().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return mo7199g().containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        return mo7199g().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || mo7199g().equals(obj);
    }

    /* JADX INFO: renamed from: g */
    public abstract Map mo7199g();

    @Override // java.util.Map
    public Object get(Object obj) {
        return mo7199g().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return mo7199g().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return mo7199g().isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return mo7199g().keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return mo7199g().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        mo7199g().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return mo7199g().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return mo7199g().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return mo7199g().values();
    }
}
