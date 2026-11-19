package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzicc extends AbstractSet {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzich f19642s;

    public zzicc(zzich zzichVar) {
        this.f19642s = zzichVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f19642s.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        zzicg zzicgVarM8064a;
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzich zzichVar = this.f19642s;
            zzichVar.getClass();
            Object key = entry.getKey();
            zzicg zzicgVar = null;
            if (key != null) {
                try {
                    zzicgVarM8064a = zzichVar.m8064a(key, false);
                } catch (ClassCastException unused) {
                    zzicgVarM8064a = null;
                }
            } else {
                zzicgVarM8064a = null;
            }
            if (zzicgVarM8064a != null && Objects.equals(zzicgVarM8064a.f19656z, entry.getValue())) {
                zzicgVar = zzicgVarM8064a;
            }
            if (zzicgVar != null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzicb(this.f19642s);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        zzicg zzicgVarM8064a;
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzich zzichVar = this.f19642s;
            zzichVar.getClass();
            Object key = entry.getKey();
            zzicg zzicgVar = null;
            if (key != null) {
                try {
                    zzicgVarM8064a = zzichVar.m8064a(key, false);
                } catch (ClassCastException unused) {
                    zzicgVarM8064a = null;
                }
            } else {
                zzicgVarM8064a = null;
            }
            if (zzicgVarM8064a != null && Objects.equals(zzicgVarM8064a.f19656z, entry.getValue())) {
                zzicgVar = zzicgVarM8064a;
            }
            if (zzicgVar != null) {
                zzichVar.m8065b(zzicgVar, true);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19642s.f19661v;
    }
}
