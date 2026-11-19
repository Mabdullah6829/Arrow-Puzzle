package p044a0;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p022N.AbstractC0355G;

/* JADX INFO: renamed from: a0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0890l extends AbstractC0355G implements Map {

    /* JADX INFO: renamed from: H */
    public final HashMap f2496H;

    public C0890l() {
        super(1);
        this.f2496H = new HashMap();
    }

    @Override // java.util.Map
    public final void clear() {
        this.f2496H.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f2496H.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f2496H.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f2496H.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj == this || this.f2496H.equals(obj);
    }

    @Override // p022N.AbstractC0355G
    /* JADX INFO: renamed from: f */
    public final Object mo390f() {
        return this.f2496H;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f2496H.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f2496H.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f2496H.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f2496H.keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f2496H.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f2496H.putAll(map);
    }

    /* JADX INFO: renamed from: q */
    public final double m1816q() {
        HashMap map = this.f2496H;
        if (map.isEmpty()) {
            return 0.0d;
        }
        Iterator it = map.values().iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            i3++;
            if (((C0889k) it.next()).m1814d()) {
                i2++;
            }
        }
        return (((double) i2) / ((double) i3)) * 100.0d;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f2496H.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f2496H.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f2496H.values();
    }
}
