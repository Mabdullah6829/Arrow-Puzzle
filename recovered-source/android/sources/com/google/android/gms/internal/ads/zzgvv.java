package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgvv extends AbstractSet {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzgwa f18269s;

    public /* synthetic */ zzgvv(zzgwa zzgwaVar) {
        this.f18269s = zzgwaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f18269s.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        zzgwa zzgwaVar = this.f18269s;
        Map mapM7183e = zzgwaVar.m7183e();
        if (mapM7183e != null) {
            return mapM7183e.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iM7187i = zzgwaVar.m7187i(entry.getKey());
            if (iM7187i != -1 && Objects.equals(zzgwaVar.m7181c()[iM7187i], entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzgwa zzgwaVar = this.f18269s;
        Map mapM7183e = zzgwaVar.m7183e();
        return mapM7183e != null ? mapM7183e.entrySet().iterator() : new zzgvt(zzgwaVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        zzgwa zzgwaVar = this.f18269s;
        Map mapM7183e = zzgwaVar.m7183e();
        if (mapM7183e != null) {
            return mapM7183e.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (zzgwaVar.m7182d()) {
            return false;
        }
        int iM7185g = zzgwaVar.m7185g();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object obj2 = zzgwaVar.f18281s;
        Objects.requireNonNull(obj2);
        int iM7192d = zzgwb.m7192d(key, value, iM7185g, obj2, zzgwaVar.m7179a(), zzgwaVar.m7180b(), zzgwaVar.m7181c());
        if (iM7192d == -1) {
            return false;
        }
        zzgwaVar.m7184f(iM7192d, iM7185g);
        zzgwaVar.f18286x--;
        zzgwaVar.f18285w += 32;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18269s.size();
    }
}
