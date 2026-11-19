package com.google.android.gms.internal.consent_sdk;

import java.util.Map;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
final class zzse implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: s */
    public final Comparable f21803s;

    /* JADX INFO: renamed from: t */
    public Object f21804t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzsi f21805u;

    public zzse(zzsi zzsiVar, Comparable comparable, Object obj) {
        this.f21805u = zzsiVar;
        this.f21803s = comparable;
        this.f21804t = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f21803s.compareTo(((zzse) obj).f21803s);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f21803s;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f21804t;
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
        return this.f21803s;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f21804t;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f21803s;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f21804t;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i2 = zzsi.f21811y;
        this.f21805u.m9276h();
        Object obj2 = this.f21804t;
        this.f21804t = obj;
        return obj2;
    }

    public final String toString() {
        return AbstractC0271e0.m415w(String.valueOf(this.f21803s), "=", String.valueOf(this.f21804t));
    }
}
