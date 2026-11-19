package com.google.android.gms.internal.consent_sdk;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrk extends LinkedHashMap {

    /* JADX INFO: renamed from: t */
    public static final zzrk f21774t;

    /* JADX INFO: renamed from: s */
    public boolean f21775s = true;

    static {
        zzrk zzrkVar = new zzrk();
        f21774t = zzrkVar;
        zzrkVar.f21775s = false;
    }

    private zzrk() {
    }

    /* JADX INFO: renamed from: a */
    public static int m9234a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof zzqo) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = zzqs.f21747a;
        int length = bArr.length;
        for (byte b : bArr) {
            length = (length * 31) + b;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    /* JADX INFO: renamed from: b */
    public final void m9235b() {
        if (!this.f21775s) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m9235b();
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
        int iM9234a = 0;
        for (Map.Entry entry : entrySet()) {
            iM9234a += m9234a(entry.getValue()) ^ m9234a(entry.getKey());
        }
        return iM9234a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m9235b();
        Charset charset = zzqs.f21747a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m9235b();
        for (Object obj : map.keySet()) {
            Charset charset = zzqs.f21747a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m9235b();
        return super.remove(obj);
    }
}
