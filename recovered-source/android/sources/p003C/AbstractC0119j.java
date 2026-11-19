package p003C;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p011H.AbstractC0243G;
import p022N.AbstractC0355G;

/* JADX INFO: renamed from: C.j */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0119j implements Map, Serializable {

    /* JADX INFO: renamed from: s */
    public transient C0131v f176s;

    /* JADX INFO: renamed from: t */
    public transient C0132w f177t;

    /* JADX INFO: renamed from: u */
    public transient C0133x f178u;

    @Override // java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AbstractC0120k entrySet() {
        C0131v c0131v = this.f176s;
        if (c0131v != null) {
            return c0131v;
        }
        C0134y c0134y = (C0134y) this;
        C0131v c0131v2 = new C0131v(c0134y, c0134y.f206w, c0134y.f207x);
        this.f176s = c0131v2;
        return c0131v2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C0133x c0133x = this.f178u;
        if (c0133x == null) {
            C0134y c0134y = (C0134y) this;
            C0133x c0133x2 = new C0133x(c0134y.f206w, 1, c0134y.f207x);
            this.f178u = c0133x2;
            c0133x = c0133x2;
        }
        return c0133x.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC0355G.m556j(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((C0134y) this).size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0132w c0132w = this.f177t;
        if (c0132w != null) {
            return c0132w;
        }
        C0134y c0134y = (C0134y) this;
        C0132w c0132w2 = new C0132w(c0134y, new C0133x(c0134y.f206w, 0, c0134y.f207x));
        this.f177t = c0132w2;
        return c0132w2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int i2 = ((C0134y) this).f207x;
        AbstractC0243G.m371i(i2, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i2) * 8, 1073741824L));
        sb.append('{');
        AbstractC0109D it = ((C0131v) entrySet()).iterator();
        boolean z = true;
        while (true) {
            C0113d c0113d = (C0113d) it;
            if (!c0113d.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) c0113d.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C0133x c0133x = this.f178u;
        if (c0133x != null) {
            return c0133x;
        }
        C0134y c0134y = (C0134y) this;
        C0133x c0133x2 = new C0133x(c0134y.f206w, 1, c0134y.f207x);
        this.f178u = c0133x2;
        return c0133x2;
    }
}
