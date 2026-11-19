package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.protobuf.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6252n0 extends LinkedHashMap {

    /* JADX INFO: renamed from: t */
    public static final C6252n0 f24222t;

    /* JADX INFO: renamed from: s */
    public boolean f24223s = true;

    static {
        C6252n0 c6252n0 = new C6252n0();
        f24222t = c6252n0;
        c6252n0.f24223s = false;
    }

    /* JADX INFO: renamed from: a */
    public static int m11899a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof InterfaceC6200U) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = AbstractC6213a0.f24134a;
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
    public final void m11900b() {
        if (!this.f24223s) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final C6252n0 m11901c() {
        if (isEmpty()) {
            return new C6252n0();
        }
        C6252n0 c6252n0 = new C6252n0(this);
        c6252n0.f24223s = true;
        return c6252n0;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m11900b();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator it = entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            if (map.containsKey(entry.getKey())) {
                                Object value = entry.getValue();
                                Object obj2 = map.get(entry.getKey());
                                if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                                }
                            }
                        } else {
                            z = true;
                        }
                    }
                }
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM11899a = 0;
        for (Map.Entry entry : entrySet()) {
            iM11899a += m11899a(entry.getValue()) ^ m11899a(entry.getKey());
        }
        return iM11899a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m11900b();
        Charset charset = AbstractC6213a0.f24134a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m11900b();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC6213a0.f24134a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m11900b();
        return super.remove(obj);
    }
}
