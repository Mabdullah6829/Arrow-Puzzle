package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
class zzigx extends AbstractMap {

    /* JADX INFO: renamed from: s */
    public Object[] f19890s;

    /* JADX INFO: renamed from: t */
    public int f19891t;

    /* JADX INFO: renamed from: u */
    public Map f19892u;

    /* JADX INFO: renamed from: v */
    public boolean f19893v;

    /* JADX INFO: renamed from: w */
    public volatile zzigw f19894w;

    /* JADX INFO: renamed from: x */
    public Map f19895x;

    private zzigx() {
        Map map = Collections.EMPTY_MAP;
        this.f19892u = map;
        this.f19895x = map;
    }

    /* JADX INFO: renamed from: a */
    public void mo8433a() {
        if (this.f19893v) {
            return;
        }
        this.f19892u = this.f19892u.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f19892u);
        this.f19895x = this.f19895x.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f19895x);
        this.f19893v = true;
    }

    /* JADX INFO: renamed from: b */
    public final Map.Entry m8435b(int i2) {
        if (i2 < this.f19891t) {
            return (zzigu) this.f19890s[i2];
        }
        throw new ArrayIndexOutOfBoundsException(i2);
    }

    /* JADX INFO: renamed from: c */
    public final Set m8436c() {
        return this.f19892u.isEmpty() ? Collections.EMPTY_SET : this.f19892u.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m8440g();
        if (this.f19891t != 0) {
            this.f19890s = null;
            this.f19891t = 0;
        }
        if (this.f19892u.isEmpty()) {
            return;
        }
        this.f19892u.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m8439f(comparable) >= 0 || this.f19892u.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m8440g();
        int iM8439f = m8439f(comparable);
        if (iM8439f >= 0) {
            return ((zzigu) this.f19890s[iM8439f]).setValue(obj);
        }
        m8440g();
        if (this.f19890s == null) {
            this.f19890s = new Object[16];
        }
        int i2 = -(iM8439f + 1);
        if (i2 >= 16) {
            return m8441h().put(comparable, obj);
        }
        if (this.f19891t == 16) {
            zzigu zziguVar = (zzigu) this.f19890s[15];
            this.f19891t = 15;
            m8441h().put(zziguVar.f19882s, zziguVar.f19883t);
        }
        Object[] objArr = this.f19890s;
        int length = objArr.length;
        System.arraycopy(objArr, i2, objArr, i2 + 1, 15 - i2);
        this.f19890s[i2] = new zzigu(this, comparable, obj);
        this.f19891t++;
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final Object m8438e(int i2) {
        m8440g();
        Object[] objArr = this.f19890s;
        Object obj = ((zzigu) objArr[i2]).f19883t;
        System.arraycopy(objArr, i2 + 1, objArr, i2, (this.f19891t - i2) - 1);
        this.f19891t--;
        if (!this.f19892u.isEmpty()) {
            Iterator it = m8441h().entrySet().iterator();
            Object[] objArr2 = this.f19890s;
            int i3 = this.f19891t;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i3] = new zzigu(this, (Comparable) entry.getKey(), entry.getValue());
            this.f19891t++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f19894w == null) {
            this.f19894w = new zzigw(this);
        }
        return this.f19894w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzigx)) {
            return super.equals(obj);
        }
        zzigx zzigxVar = (zzigx) obj;
        int size = size();
        if (size != zzigxVar.size()) {
            return false;
        }
        int i2 = this.f19891t;
        if (i2 != zzigxVar.f19891t) {
            return entrySet().equals(zzigxVar.entrySet());
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!m8435b(i3).equals(zzigxVar.m8435b(i3))) {
                return false;
            }
        }
        if (i2 != size) {
            return this.f19892u.equals(zzigxVar.f19892u);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final int m8439f(Comparable comparable) {
        int i2 = this.f19891t;
        int i3 = i2 - 1;
        int i4 = 0;
        if (i3 >= 0) {
            int iCompareTo = comparable.compareTo(((zzigu) this.f19890s[i3]).f19882s);
            if (iCompareTo > 0) {
                return -(i2 + 1);
            }
            if (iCompareTo == 0) {
                return i3;
            }
        }
        while (i4 <= i3) {
            int i5 = (i4 + i3) / 2;
            int iCompareTo2 = comparable.compareTo(((zzigu) this.f19890s[i5]).f19882s);
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
    public final void m8440g() {
        if (this.f19893v) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM8439f = m8439f(comparable);
        return iM8439f >= 0 ? ((zzigu) this.f19890s[iM8439f]).f19883t : this.f19892u.get(comparable);
    }

    /* JADX INFO: renamed from: h */
    public final SortedMap m8441h() {
        m8440g();
        if (this.f19892u.isEmpty() && !(this.f19892u instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f19892u = treeMap;
            this.f19895x = treeMap.descendingMap();
        }
        return (SortedMap) this.f19892u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i2 = this.f19891t;
        int iHashCode = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iHashCode += this.f19890s[i3].hashCode();
        }
        return this.f19892u.size() > 0 ? this.f19892u.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m8440g();
        Comparable comparable = (Comparable) obj;
        int iM8439f = m8439f(comparable);
        if (iM8439f >= 0) {
            return m8438e(iM8439f);
        }
        if (this.f19892u.isEmpty()) {
            return null;
        }
        return this.f19892u.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f19892u.size() + this.f19891t;
    }

    public /* synthetic */ zzigx(int i2) {
        Map map = Collections.EMPTY_MAP;
        this.f19892u = map;
        this.f19895x = map;
    }
}
