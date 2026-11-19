package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzift extends LinkedHashMap {

    /* JADX INFO: renamed from: t */
    public static final zzift f19836t;

    /* JADX INFO: renamed from: s */
    public boolean f19837s = true;

    static {
        zzift zziftVar = new zzift();
        f19836t = zziftVar;
        zziftVar.f19837s = false;
    }

    private zzift() {
    }

    /* JADX INFO: renamed from: b */
    public static int m8365b(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof zziet) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = zzifc.f19794a;
        int length = bArr.length;
        int iM8356b = zzifc.m8356b(length, bArr, 0, length);
        if (iM8356b == 0) {
            return 1;
        }
        return iM8356b;
    }

    /* JADX INFO: renamed from: a */
    public final zzift m8366a() {
        if (isEmpty()) {
            return new zzift();
        }
        zzift zziftVar = new zzift(this);
        zziftVar.f19837s = true;
        return zziftVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m8367c() {
        if (!this.f19837s) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m8367c();
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
        int iM8365b = 0;
        for (Map.Entry entry : entrySet()) {
            iM8365b += m8365b(entry.getValue()) ^ m8365b(entry.getKey());
        }
        return iM8365b;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m8367c();
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m8367c();
        for (Object obj : map.keySet()) {
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m8367c();
        return super.remove(obj);
    }
}
