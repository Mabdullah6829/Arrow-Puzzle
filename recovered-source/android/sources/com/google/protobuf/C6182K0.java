package com.google.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.protobuf.K0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6182K0 extends AbstractMap {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f24096y = 0;

    /* JADX INFO: renamed from: s */
    public final int f24097s;

    /* JADX INFO: renamed from: t */
    public List f24098t = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: u */
    public Map f24099u;

    /* JADX INFO: renamed from: v */
    public boolean f24100v;

    /* JADX INFO: renamed from: w */
    public volatile C6194Q0 f24101w;

    /* JADX INFO: renamed from: x */
    public Map f24102x;

    public C6182K0(int i2) {
        this.f24097s = i2;
        Map map = Collections.EMPTY_MAP;
        this.f24099u = map;
        this.f24102x = map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final int m11770a(Comparable comparable) {
        int i2;
        int i3;
        int i4;
        int iCompareTo;
        int size = this.f24098t.size();
        int i5 = size - 1;
        if (i5 < 0) {
            i2 = 0;
            while (i2 <= i5) {
                i4 = (i2 + i5) / 2;
                iCompareTo = comparable.compareTo(((C6190O0) this.f24098t.get(i4)).f24113s);
                if (iCompareTo < 0) {
                    i5 = i4 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i4;
                    }
                    i2 = i4 + 1;
                }
            }
            i3 = i2 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((C6190O0) this.f24098t.get(i5)).f24113s);
            if (iCompareTo2 > 0) {
                i3 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i5;
                }
                i2 = 0;
                while (i2 <= i5) {
                    i4 = (i2 + i5) / 2;
                    iCompareTo = comparable.compareTo(((C6190O0) this.f24098t.get(i4)).f24113s);
                    if (iCompareTo < 0) {
                        i5 = i4 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i4;
                        }
                        i2 = i4 + 1;
                    }
                }
                i3 = i2 + 1;
            }
        }
        return -i3;
    }

    /* JADX INFO: renamed from: b */
    public final void m11771b() {
        if (this.f24100v) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final Map.Entry m11772c(int i2) {
        return (Map.Entry) this.f24098t.get(i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m11771b();
        if (!this.f24098t.isEmpty()) {
            this.f24098t.clear();
        }
        if (this.f24099u.isEmpty()) {
            return;
        }
        this.f24099u.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m11770a(comparable) >= 0 || this.f24099u.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final Iterable m11773d() {
        return this.f24099u.isEmpty() ? AbstractC6188N0.f24112b : this.f24099u.entrySet();
    }

    /* JADX INFO: renamed from: e */
    public final SortedMap m11774e() {
        m11771b();
        if (this.f24099u.isEmpty() && !(this.f24099u instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f24099u = treeMap;
            this.f24102x = treeMap.descendingMap();
        }
        return (SortedMap) this.f24099u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f24101w == null) {
            this.f24101w = new C6194Q0(this);
        }
        return this.f24101w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6182K0)) {
            return super.equals(obj);
        }
        C6182K0 c6182k0 = (C6182K0) obj;
        int size = size();
        if (size == c6182k0.size()) {
            int size2 = this.f24098t.size();
            if (size2 != c6182k0.f24098t.size()) {
                return ((AbstractSet) entrySet()).equals(c6182k0.entrySet());
            }
            for (int i2 = 0; i2 < size2; i2++) {
                if (m11772c(i2).equals(c6182k0.m11772c(i2))) {
                }
            }
            if (size2 != size) {
                return this.f24099u.equals(c6182k0.f24099u);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m11771b();
        int iM11770a = m11770a(comparable);
        if (iM11770a >= 0) {
            return ((C6190O0) this.f24098t.get(iM11770a)).setValue(obj);
        }
        m11771b();
        boolean zIsEmpty = this.f24098t.isEmpty();
        int i2 = this.f24097s;
        if (zIsEmpty && !(this.f24098t instanceof ArrayList)) {
            this.f24098t = new ArrayList(i2);
        }
        int i3 = -(iM11770a + 1);
        if (i3 >= i2) {
            return m11774e().put(comparable, obj);
        }
        if (this.f24098t.size() == i2) {
            C6190O0 c6190o0 = (C6190O0) this.f24098t.remove(i2 - 1);
            m11774e().put(c6190o0.f24113s, c6190o0.f24114t);
        }
        this.f24098t.add(i3, new C6190O0(this, comparable, obj));
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final Object m11776g(int i2) {
        m11771b();
        Object obj = ((C6190O0) this.f24098t.remove(i2)).f24114t;
        if (!this.f24099u.isEmpty()) {
            Iterator it = m11774e().entrySet().iterator();
            List list = this.f24098t;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C6190O0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM11770a = m11770a(comparable);
        return iM11770a >= 0 ? ((C6190O0) this.f24098t.get(iM11770a)).f24114t : this.f24099u.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f24098t.size();
        int iHashCode = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iHashCode += ((C6190O0) this.f24098t.get(i2)).hashCode();
        }
        return this.f24099u.size() > 0 ? this.f24099u.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m11771b();
        Comparable comparable = (Comparable) obj;
        int iM11770a = m11770a(comparable);
        if (iM11770a >= 0) {
            return m11776g(iM11770a);
        }
        if (this.f24099u.isEmpty()) {
            return null;
        }
        return this.f24099u.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f24099u.size() + this.f24098t.size();
    }
}
