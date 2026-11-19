package p058e0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6452k;
import p043a.AbstractC0878a;
import p057d0.C6283e;

/* JADX INFO: renamed from: e0.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6318z extends AbstractC0878a {
    /* JADX INFO: renamed from: s */
    public static Object m12125s(Object obj, Map map) {
        AbstractC6452k.m12181e(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    /* JADX INFO: renamed from: t */
    public static int m12126t(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: u */
    public static Map m12127u(C6283e pair) {
        AbstractC6452k.m12181e(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.f24308s, pair.f24309t);
        AbstractC6452k.m12180d(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    /* JADX INFO: renamed from: v */
    public static Map m12128v(Map map, C6283e c6283e) {
        if (map.isEmpty()) {
            return m12127u(c6283e);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(c6283e.f24308s, c6283e.f24309t);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: w */
    public static final void m12129w(LinkedHashMap linkedHashMap, C6283e[] c6283eArr) {
        for (C6283e c6283e : c6283eArr) {
            linkedHashMap.put(c6283e.f24308s, c6283e.f24309t);
        }
    }

    /* JADX INFO: renamed from: x */
    public static Map m12130x(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return C6314v.f24339s;
        }
        if (size == 1) {
            return m12127u((C6283e) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m12126t(arrayList.size()));
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            C6283e c6283e = (C6283e) obj;
            linkedHashMap.put(c6283e.f24308s, c6283e.f24309t);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: y */
    public static Map m12131y(Map map) {
        AbstractC6452k.m12181e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return C6314v.f24339s;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        AbstractC6452k.m12181e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC6452k.m12180d(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
