package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzib extends zzgwj {

    /* JADX INFO: renamed from: s */
    public final Map f19590s;

    public zzib(Map map) {
        this.f19590s = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, com.google.android.gms.internal.ads.zzgwk
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object mo6718b() {
        return this.f19590s;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = entrySet().iterator();
        zzgxv zzgxvVar = new zzgxv(it);
        if (obj == null) {
            while (it.hasNext()) {
                if (zzgxvVar.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(zzgxvVar.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, java.util.Map
    public final Set entrySet() {
        return zzgzd.m7269b(this.f19590s.entrySet(), new zzgts() { // from class: com.google.android.gms.internal.ads.zzhz
            @Override // com.google.android.gms.internal.ads.zzgts
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ boolean mo3897b(Object obj) {
                return ((Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && zzgya.m7261a(obj, this);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    /* JADX INFO: renamed from: g */
    public final Map mo7199g() {
        return this.f19590s;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f19590s.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, java.util.Map
    public final int hashCode() {
        return zzgzd.m7270c(entrySet());
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, java.util.Map
    public final boolean isEmpty() {
        if (this.f19590s.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, java.util.Map
    public final Set keySet() {
        return zzgzd.m7269b(this.f19590s.keySet(), new zzgts() { // from class: com.google.android.gms.internal.ads.zzia
            @Override // com.google.android.gms.internal.ads.zzgts
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ boolean mo3897b(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
