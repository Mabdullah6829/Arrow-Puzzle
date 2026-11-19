package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
class zzafv extends AbstractMap {

    /* JADX INFO: renamed from: s */
    public Object[] f22113s;

    /* JADX INFO: renamed from: t */
    public int f22114t;

    /* JADX INFO: renamed from: u */
    public Map f22115u;

    /* JADX INFO: renamed from: v */
    public boolean f22116v;

    /* JADX INFO: renamed from: w */
    public volatile zzafu f22117w;

    /* JADX INFO: renamed from: x */
    public Map f22118x;

    private zzafv() {
        Map map = Collections.EMPTY_MAP;
        this.f22115u = map;
        this.f22118x = map;
    }

    /* JADX INFO: renamed from: a */
    public void mo9664a() {
        if (this.f22116v) {
            return;
        }
        this.f22115u = this.f22115u.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f22115u);
        this.f22118x = this.f22118x.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f22118x);
        this.f22116v = true;
    }

    /* JADX INFO: renamed from: b */
    public final Map.Entry m9666b(int i2) {
        if (i2 < this.f22114t) {
            return (zzafs) this.f22113s[i2];
        }
        throw new ArrayIndexOutOfBoundsException(i2);
    }

    /* JADX INFO: renamed from: c */
    public final Set m9667c() {
        return this.f22115u.isEmpty() ? Collections.EMPTY_SET : this.f22115u.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m9671g();
        if (this.f22114t != 0) {
            this.f22113s = null;
            this.f22114t = 0;
        }
        if (this.f22115u.isEmpty()) {
            return;
        }
        this.f22115u.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m9670f(comparable) >= 0 || this.f22115u.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m9671g();
        int iM9670f = m9670f(comparable);
        if (iM9670f >= 0) {
            return ((zzafs) this.f22113s[iM9670f]).setValue(obj);
        }
        m9671g();
        if (this.f22113s == null) {
            this.f22113s = new Object[16];
        }
        int i2 = -(iM9670f + 1);
        if (i2 >= 16) {
            return m9672h().put(comparable, obj);
        }
        if (this.f22114t == 16) {
            zzafs zzafsVar = (zzafs) this.f22113s[15];
            this.f22114t = 15;
            m9672h().put(zzafsVar.f22105s, zzafsVar.f22106t);
        }
        Object[] objArr = this.f22113s;
        int length = objArr.length;
        System.arraycopy(objArr, i2, objArr, i2 + 1, 15 - i2);
        this.f22113s[i2] = new zzafs(this, comparable, obj);
        this.f22114t++;
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final Object m9669e(int i2) {
        m9671g();
        Object[] objArr = this.f22113s;
        Object obj = ((zzafs) objArr[i2]).f22106t;
        System.arraycopy(objArr, i2 + 1, objArr, i2, (this.f22114t - i2) - 1);
        this.f22114t--;
        if (!this.f22115u.isEmpty()) {
            Iterator it = m9672h().entrySet().iterator();
            Object[] objArr2 = this.f22113s;
            int i3 = this.f22114t;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i3] = new zzafs(this, (Comparable) entry.getKey(), entry.getValue());
            this.f22114t++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f22117w == null) {
            this.f22117w = new zzafu(this);
        }
        return this.f22117w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzafv)) {
            return super.equals(obj);
        }
        zzafv zzafvVar = (zzafv) obj;
        int size = size();
        if (size != zzafvVar.size()) {
            return false;
        }
        int i2 = this.f22114t;
        if (i2 != zzafvVar.f22114t) {
            return entrySet().equals(zzafvVar.entrySet());
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!m9666b(i3).equals(zzafvVar.m9666b(i3))) {
                return false;
            }
        }
        if (i2 != size) {
            return this.f22115u.equals(zzafvVar.f22115u);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final int m9670f(Comparable comparable) {
        int i2 = this.f22114t;
        int i3 = i2 - 1;
        int i4 = 0;
        if (i3 >= 0) {
            int iCompareTo = comparable.compareTo(((zzafs) this.f22113s[i3]).f22105s);
            if (iCompareTo > 0) {
                return -(i2 + 1);
            }
            if (iCompareTo == 0) {
                return i3;
            }
        }
        while (i4 <= i3) {
            int i5 = (i4 + i3) / 2;
            int iCompareTo2 = comparable.compareTo(((zzafs) this.f22113s[i5]).f22105s);
            if (iCompareTo2 < 0) {
                i3 = i5 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i5;
                }
                i4 = i5 + 1;
            }
        }
        return -(i4 + 1);
    }

    /* JADX INFO: renamed from: g */
    public final void m9671g() {
        if (this.f22116v) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM9670f = m9670f(comparable);
        return iM9670f >= 0 ? ((zzafs) this.f22113s[iM9670f]).f22106t : this.f22115u.get(comparable);
    }

    /* JADX INFO: renamed from: h */
    public final SortedMap m9672h() {
        m9671g();
        if (this.f22115u.isEmpty() && !(this.f22115u instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f22115u = treeMap;
            this.f22118x = treeMap.descendingMap();
        }
        return (SortedMap) this.f22115u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i2 = this.f22114t;
        int iHashCode = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iHashCode += this.f22113s[i3].hashCode();
        }
        return this.f22115u.size() > 0 ? this.f22115u.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m9671g();
        Comparable comparable = (Comparable) obj;
        int iM9670f = m9670f(comparable);
        if (iM9670f >= 0) {
            return m9669e(iM9670f);
        }
        if (this.f22115u.isEmpty()) {
            return null;
        }
        return this.f22115u.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f22115u.size() + this.f22114t;
    }

    public /* synthetic */ zzafv(int i2) {
        Map map = Collections.EMPTY_MAP;
        this.f22115u = map;
        this.f22118x = map;
    }
}
