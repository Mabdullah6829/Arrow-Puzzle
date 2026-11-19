package com.google.protobuf;

import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.O0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6190O0 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: s */
    public final Comparable f24113s;

    /* JADX INFO: renamed from: t */
    public Object f24114t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C6182K0 f24115u;

    public C6190O0(C6182K0 c6182k0, Comparable comparable, Object obj) {
        this.f24115u = c6182k0;
        this.f24113s = comparable;
        this.f24114t = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f24113s.compareTo(((C6190O0) obj).f24113s);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f24113s;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f24114t;
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
    public final Object getKey() {
        return this.f24113s;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f24114t;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f24113s;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f24114t;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f24115u.m11771b();
        Object obj2 = this.f24114t;
        this.f24114t = obj;
        return obj2;
    }

    public final String toString() {
        return this.f24113s + "=" + this.f24114t;
    }
}
