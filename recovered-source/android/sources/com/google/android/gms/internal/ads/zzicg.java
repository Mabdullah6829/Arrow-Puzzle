package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzicg implements Map.Entry {

    /* JADX INFO: renamed from: A */
    public int f19648A;

    /* JADX INFO: renamed from: s */
    public zzicg f19649s;

    /* JADX INFO: renamed from: t */
    public zzicg f19650t;

    /* JADX INFO: renamed from: u */
    public zzicg f19651u;

    /* JADX INFO: renamed from: v */
    public zzicg f19652v;

    /* JADX INFO: renamed from: w */
    public zzicg f19653w;

    /* JADX INFO: renamed from: x */
    public final Object f19654x;

    /* JADX INFO: renamed from: y */
    public final boolean f19655y;

    /* JADX INFO: renamed from: z */
    public Object f19656z;

    public zzicg(boolean z) {
        this.f19654x = null;
        this.f19655y = z;
        this.f19653w = this;
        this.f19652v = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f19654x;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f19656z;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f19654x;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f19656z;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f19654x;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f19656z;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f19655y) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f19656z;
        this.f19656z = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f19654x);
        String strValueOf2 = String.valueOf(this.f19656z);
        return AbstractC1456a.m2450q(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }

    public zzicg(boolean z, zzicg zzicgVar, Object obj, zzicg zzicgVar2, zzicg zzicgVar3) {
        this.f19649s = zzicgVar;
        this.f19654x = obj;
        this.f19655y = z;
        this.f19648A = 1;
        this.f19652v = zzicgVar2;
        this.f19653w = zzicgVar3;
        zzicgVar3.f19652v = this;
        zzicgVar2.f19653w = this;
    }
}
