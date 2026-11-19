package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgwt extends zzgwp implements List, RandomAccess {

    /* JADX INFO: renamed from: t */
    public static final zzgzi f18303t = new zzgwr(0, zzgyo.f18355w);

    /* JADX INFO: renamed from: n */
    public static zzgwt m7216n(Object obj) {
        Object[] objArr = {obj};
        zzgym.m7263a(1, objArr);
        return m7222v(1, objArr);
    }

    /* JADX INFO: renamed from: q */
    public static zzgwt m7217q(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzgym.m7263a(2, objArr);
        return m7222v(2, objArr);
    }

    /* JADX INFO: renamed from: r */
    public static zzgwt m7218r(Long l2, Long l3, Long l4, Long l5, Long l6) {
        Object[] objArr = {l2, l3, l4, l5, l6};
        zzgym.m7263a(5, objArr);
        return m7222v(5, objArr);
    }

    /* JADX INFO: renamed from: s */
    public static zzgwt m7219s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i2 = length + 12;
        Object[] objArr2 = new Object[i2];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        zzgym.m7263a(i2, objArr2);
        return m7222v(i2, objArr2);
    }

    /* JADX INFO: renamed from: t */
    public static zzgwt m7220t(Collection collection) {
        if (!(collection instanceof zzgwp)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzgym.m7263a(length, array);
            return m7222v(length, array);
        }
        zzgwt zzgwtVarMo7211h = ((zzgwp) collection).mo7211h();
        if (!zzgwtVarMo7211h.mo7212j()) {
            return zzgwtVarMo7211h;
        }
        Object[] array2 = zzgwtVarMo7211h.toArray(zzgwp.f18298s);
        return m7222v(array2.length, array2);
    }

    /* JADX INFO: renamed from: u */
    public static zzgwt m7221u(Object[] objArr) {
        if (objArr.length == 0) {
            return zzgyo.f18355w;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzgym.m7263a(length, objArr2);
        return m7222v(length, objArr2);
    }

    /* JADX INFO: renamed from: v */
    public static zzgwt m7222v(int i2, Object[] objArr) {
        return i2 == 0 ? zzgyo.f18355w : new zzgyo(i2, objArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: a */
    public final zzgzh iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i2 = 0; i2 < size; i2++) {
                if (!Objects.equals(get(i2), list.get(i2))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: h */
    public final zzgwt mo7211h() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i2 = 0; i2 < size; i2++) {
            iHashCode = (iHashCode * 31) + get(i2).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (obj.equals(get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: k */
    public int mo7213k(int i2, Object[] objArr) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i2 + i3] = get(i3);
        }
        return i2 + size;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public zzgwt subList(int i2, int i3) {
        zzgtr.m7138k(i2, i3, size());
        int i4 = i3 - i2;
        if (i4 == size()) {
            return this;
        }
        return i4 == 0 ? zzgyo.f18355w : new zzgws(this, i2, i4);
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final zzgzi listIterator(int i2) {
        zzgtr.m7137j(i2, size());
        return isEmpty() ? f18303t : new zzgwr(i2, this);
    }
}
