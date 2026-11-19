package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzigu implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: s */
    public final Comparable f19882s;

    /* JADX INFO: renamed from: t */
    public Object f19883t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzigx f19884u;

    public zzigu(zzigx zzigxVar, Comparable comparable, Object obj) {
        this.f19884u = zzigxVar;
        this.f19882s = comparable;
        this.f19883t = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f19882s.compareTo(((zzigu) obj).f19882s);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f19882s;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f19883t;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f19882s;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f19883t;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f19882s;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f19883t;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f19884u.m8440g();
        Object obj2 = this.f19883t;
        this.f19883t = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f19882s);
        String strValueOf2 = String.valueOf(this.f19883t);
        return AbstractC1456a.m2450q(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}
