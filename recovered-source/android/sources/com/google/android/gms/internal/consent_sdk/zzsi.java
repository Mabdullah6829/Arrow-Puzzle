package com.google.android.gms.internal.consent_sdk;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
class zzsi extends AbstractMap {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f21811y = 0;

    /* JADX INFO: renamed from: s */
    public Object[] f21812s;

    /* JADX INFO: renamed from: t */
    public int f21813t;

    /* JADX INFO: renamed from: u */
    public Map f21814u;

    /* JADX INFO: renamed from: v */
    public boolean f21815v;

    /* JADX INFO: renamed from: w */
    public volatile zzsg f21816w;

    /* JADX INFO: renamed from: x */
    public Map f21817x;

    private zzsi() {
        Map map = Collections.EMPTY_MAP;
        this.f21814u = map;
        this.f21817x = map;
    }

    /* JADX INFO: renamed from: a */
    public void mo9268a() {
        if (this.f21815v) {
            return;
        }
        this.f21814u = this.f21814u.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f21814u);
        this.f21817x = this.f21817x.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f21817x);
        this.f21815v = true;
    }

    /* JADX INFO: renamed from: b */
    public final Set m9270b() {
        return this.f21814u.isEmpty() ? Collections.EMPTY_SET : this.f21814u.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m9276h();
        int iM9273e = m9273e(comparable);
        if (iM9273e >= 0) {
            return ((zzse) this.f21812s[iM9273e]).setValue(obj);
        }
        m9276h();
        if (this.f21812s == null) {
            this.f21812s = new Object[16];
        }
        int i2 = -(iM9273e + 1);
        if (i2 >= 16) {
            return m9275g().put(comparable, obj);
        }
        if (this.f21813t == 16) {
            zzse zzseVar = (zzse) this.f21812s[15];
            this.f21813t = 15;
            m9275g().put(zzseVar.f21803s, zzseVar.f21804t);
        }
        Object[] objArr = this.f21812s;
        int length = objArr.length;
        System.arraycopy(objArr, i2, objArr, i2 + 1, 15 - i2);
        this.f21812s[i2] = new zzse(this, comparable, obj);
        this.f21813t++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m9276h();
        if (this.f21813t != 0) {
            this.f21812s = null;
            this.f21813t = 0;
        }
        if (this.f21814u.isEmpty()) {
            return;
        }
        this.f21814u.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m9273e(comparable) >= 0 || this.f21814u.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final Map.Entry m9272d(int i2) {
        if (i2 < this.f21813t) {
            return (zzse) this.f21812s[i2];
        }
        throw new ArrayIndexOutOfBoundsException(i2);
    }

    /* JADX INFO: renamed from: e */
    public final int m9273e(Comparable comparable) {
        int i2 = this.f21813t;
        int i3 = i2 - 1;
        int i4 = 0;
        if (i3 >= 0) {
            int iCompareTo = comparable.compareTo(((zzse) this.f21812s[i3]).f21803s);
            if (iCompareTo > 0) {
                return -(i2 + 1);
            }
            if (iCompareTo == 0) {
                return i3;
            }
        }
        while (i4 <= i3) {
            int i5 = (i4 + i3) / 2;
            int iCompareTo2 = comparable.compareTo(((zzse) this.f21812s[i5]).f21803s);
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

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f21816w == null) {
            this.f21816w = new zzsg(this);
        }
        return this.f21816w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzsi)) {
            return super.equals(obj);
        }
        zzsi zzsiVar = (zzsi) obj;
        int size = size();
        if (size != zzsiVar.size()) {
            return false;
        }
        int i2 = this.f21813t;
        if (i2 != zzsiVar.f21813t) {
            return entrySet().equals(zzsiVar.entrySet());
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!m9272d(i3).equals(zzsiVar.m9272d(i3))) {
                return false;
            }
        }
        if (i2 != size) {
            return this.f21814u.equals(zzsiVar.f21814u);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final Object m9274f(int i2) {
        m9276h();
        Object[] objArr = this.f21812s;
        Object obj = ((zzse) objArr[i2]).f21804t;
        System.arraycopy(objArr, i2 + 1, objArr, i2, (this.f21813t - i2) - 1);
        this.f21813t--;
        if (!this.f21814u.isEmpty()) {
            Iterator it = m9275g().entrySet().iterator();
            Object[] objArr2 = this.f21812s;
            int i3 = this.f21813t;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i3] = new zzse(this, (Comparable) entry.getKey(), entry.getValue());
            this.f21813t++;
            it.remove();
        }
        return obj;
    }

    /* JADX INFO: renamed from: g */
    public final SortedMap m9275g() {
        m9276h();
        if (this.f21814u.isEmpty() && !(this.f21814u instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f21814u = treeMap;
            this.f21817x = treeMap.descendingMap();
        }
        return (SortedMap) this.f21814u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM9273e = m9273e(comparable);
        return iM9273e >= 0 ? ((zzse) this.f21812s[iM9273e]).f21804t : this.f21814u.get(comparable);
    }

    /* JADX INFO: renamed from: h */
    public final void m9276h() {
        if (this.f21815v) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i2 = this.f21813t;
        int iHashCode = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iHashCode += this.f21812s[i3].hashCode();
        }
        return this.f21814u.size() > 0 ? this.f21814u.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m9276h();
        Comparable comparable = (Comparable) obj;
        int iM9273e = m9273e(comparable);
        if (iM9273e >= 0) {
            return m9274f(iM9273e);
        }
        if (this.f21814u.isEmpty()) {
            return null;
        }
        return this.f21814u.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f21814u.size() + this.f21813t;
    }

    public /* synthetic */ zzsi(int i2) {
        Map map = Collections.EMPTY_MAP;
        this.f21814u = map;
        this.f21817x = map;
    }
}
