package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzabc extends AbstractMap {

    /* JADX INFO: renamed from: x */
    public static final Comparator f21895x = new zzaaz();

    /* JADX INFO: renamed from: s */
    public final Object[] f21896s;

    /* JADX INFO: renamed from: t */
    public final int[] f21897t;

    /* JADX INFO: renamed from: u */
    public final Set f21898u;

    /* JADX INFO: renamed from: v */
    public Integer f21899v;

    /* JADX INFO: renamed from: w */
    public String f21900w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.zzabc, java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.measurement.zzabc] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public zzabc(zzabc zzabcVar, zzabc zzabcVar2) {
        Object obj;
        Object[] objArr;
        ?? abstractMap = new AbstractMap();
        abstractMap.f21898u = new zzabb(abstractMap, -1);
        abstractMap.f21899v = null;
        abstractMap.f21900w = null;
        int size = zzabcVar2.size() + zzabcVar.size();
        int i2 = zzabcVar.f21897t[zzabcVar.size()] + zzabcVar2.f21897t[zzabcVar2.size()];
        int i3 = size + 1;
        Object[] objArr2 = new Object[i2];
        int[] iArr = new int[i3];
        int i4 = 0;
        iArr[0] = size;
        Map.Entry entryM9324c = zzabcVar.m9324c(0);
        Map.Entry entryM9324c2 = zzabcVar2.m9324c(0);
        int i5 = 0;
        int i6 = 0;
        int iM9323a = size;
        int i7 = 0;
        while (true) {
            if (entryM9324c == null && entryM9324c2 == null) {
                break;
            }
            i7++;
            if (entryM9324c != null) {
                if (entryM9324c2 != null) {
                    int iCompareTo = ((String) entryM9324c.getKey()).compareTo((String) entryM9324c2.getKey());
                    if (iCompareTo == 0) {
                        int i8 = i5 + 1;
                        int i9 = i6 + 1;
                        objArr2[i7] = new AbstractMap.SimpleImmutableEntry((String) entryM9324c.getKey(), new zzabb(abstractMap, i7));
                        zzabb zzabbVar = (zzabb) entryM9324c.getValue();
                        zzabb zzabbVar2 = (zzabb) entryM9324c2.getValue();
                        int i10 = 0;
                        int i11 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            int iM9321b = zzabbVar.m9321b();
                            zzabc zzabcVar3 = zzabbVar.f21894t;
                            if (i10 >= iM9321b - zzabbVar.m9320a() && i11 >= zzabbVar2.m9321b() - zzabbVar2.m9320a()) {
                                break;
                            }
                            int iCompare = i10 == zzabbVar.m9321b() - zzabbVar.m9320a() ? 1 : i11 == zzabbVar2.m9321b() - zzabbVar2.m9320a() ? -1 : 0;
                            if (iCompare == 0) {
                                Comparator comparator = zzabe.f21906b;
                                iCompare = ((zzaax) zzabe.f21906b).compare(zzabcVar3.f21896s[zzabbVar.m9320a() + i10], zzabbVar2.f21894t.f21896s[zzabbVar2.m9320a() + i11]);
                            }
                            if (iCompare < 0) {
                                i10++;
                                obj = zzabcVar3.f21896s[zzabbVar.m9320a() + i10];
                            } else {
                                int i12 = i11 + 1;
                                Object obj2 = zzabbVar2.f21894t.f21896s[zzabbVar2.m9320a() + i11];
                                if (iCompare == 0) {
                                    i11 = i12;
                                    obj = obj2;
                                    i10++;
                                } else {
                                    i11 = i12;
                                    obj = obj2;
                                    i10 = i10;
                                }
                            }
                            objArr2[iM9323a] = obj;
                            abstractMap = this;
                            iM9323a++;
                        }
                        iArr[i7] = iM9323a;
                        entryM9324c = zzabcVar.m9324c(i9);
                        entryM9324c2 = zzabcVar2.m9324c(i8);
                        i6 = i9;
                        i5 = i8;
                        i4 = 0;
                    } else {
                        if (iCompareTo < 0) {
                        }
                        i4 = 0;
                        abstractMap = this;
                    }
                }
                i6++;
                iM9323a = m9323a(entryM9324c, i7, iM9323a, objArr2, iArr);
                entryM9324c = zzabcVar.m9324c(i6);
                i4 = 0;
                abstractMap = this;
            }
            Map.Entry entry = entryM9324c;
            i5++;
            int iM9323a2 = m9323a(entryM9324c2, i7, iM9323a, objArr2, iArr);
            entryM9324c2 = zzabcVar2.m9324c(i5);
            iM9323a = iM9323a2;
            entryM9324c = entry;
            i4 = 0;
            abstractMap = this;
        }
        int i13 = iArr[i4];
        int i14 = i13 - i7;
        if (i14 != 0) {
            for (int i15 = i4; i15 <= i7; i15++) {
                iArr[i15] = iArr[i15] - i14;
            }
            int i16 = iArr[i7];
            int i17 = i16 - i7;
            if (m9322b(i2, i16)) {
                objArr = new Object[i16];
                System.arraycopy(objArr2, i4, objArr, i4, i7);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i13, objArr, i7, i17);
            objArr2 = objArr;
        }
        abstractMap.f21896s = objArr2;
        int i18 = iArr[i4] + 1;
        abstractMap.f21897t = m9322b(i3, i18) ? Arrays.copyOf(iArr, i18) : iArr;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9322b(int i2, int i3) {
        return i2 > 16 && i2 * 9 > i3 * 10;
    }

    /* JADX INFO: renamed from: a */
    public final int m9323a(Map.Entry entry, int i2, int i3, Object[] objArr, int[] iArr) {
        zzabb zzabbVar = (zzabb) entry.getValue();
        int iM9321b = zzabbVar.m9321b() - zzabbVar.m9320a();
        System.arraycopy(zzabbVar.f21894t.f21896s, zzabbVar.m9320a(), objArr, i3, iM9321b);
        objArr[i2] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new zzabb(this, i2));
        int i4 = i3 + iM9321b;
        iArr[i2 + 1] = i4;
        return i4;
    }

    /* JADX INFO: renamed from: c */
    public final Map.Entry m9324c(int i2) {
        if (i2 < this.f21897t[0]) {
            return (Map.Entry) this.f21896s[i2];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.f21898u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.f21899v == null) {
            this.f21899v = Integer.valueOf(super.hashCode());
        }
        return this.f21899v.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.f21900w == null) {
            this.f21900w = super.toString();
        }
        return this.f21900w;
    }

    public zzabc() {
        List list = Collections.EMPTY_LIST;
        this.f21898u = new zzabb(this, -1);
        this.f21899v = null;
        this.f21900w = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.f21896s = m9322b(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.f21897t = iArr;
                return;
            }
            throw null;
        }
        throw null;
    }
}
