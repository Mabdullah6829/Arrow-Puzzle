package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzafs implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: s */
    public final Comparable f22105s;

    /* JADX INFO: renamed from: t */
    public Object f22106t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzafv f22107u;

    public zzafs(zzafv zzafvVar, Comparable comparable, Object obj) {
        this.f22107u = zzafvVar;
        this.f22105s = comparable;
        this.f22106t = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f22105s.compareTo(((zzafs) obj).f22105s);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f22105s;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f22106t;
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
        return this.f22105s;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f22106t;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f22105s;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f22106t;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f22107u.m9671g();
        Object obj2 = this.f22106t;
        this.f22106t = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f22105s);
        String strValueOf2 = String.valueOf(this.f22106t);
        return AbstractC1456a.m2450q(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}
