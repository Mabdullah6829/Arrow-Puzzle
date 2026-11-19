package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaew extends LinkedHashMap {

    /* JADX INFO: renamed from: t */
    public static final zzaew f22069t;

    /* JADX INFO: renamed from: s */
    public boolean f22070s = true;

    static {
        zzaew zzaewVar = new zzaew();
        f22069t = zzaewVar;
        zzaewVar.f22070s = false;
    }

    private zzaew() {
    }

    /* JADX INFO: renamed from: b */
    public static int m9604b(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof zzady) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = zzaed.f22038a;
        int length = bArr.length;
        int iM9595a = zzaed.m9595a(length, bArr, 0, length);
        if (iM9595a == 0) {
            return 1;
        }
        return iM9595a;
    }

    /* JADX INFO: renamed from: a */
    public final zzaew m9605a() {
        if (isEmpty()) {
            return new zzaew();
        }
        zzaew zzaewVar = new zzaew(this);
        zzaewVar.f22070s = true;
        return zzaewVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m9606c() {
        if (!this.f22070s) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m9606c();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM9604b = 0;
        for (Map.Entry entry : entrySet()) {
            iM9604b += m9604b(entry.getValue()) ^ m9604b(entry.getKey());
        }
        return iM9604b;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m9606c();
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m9606c();
        for (Object obj : map.keySet()) {
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m9606c();
        return super.remove(obj);
    }
}
