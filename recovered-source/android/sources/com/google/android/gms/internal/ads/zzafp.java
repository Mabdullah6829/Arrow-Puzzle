package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafp {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f5203a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m4073a(zzafo zzafoVar) {
        long[] jArr = zzafoVar.f5201e;
        if (jArr.length > 0) {
            Long lValueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.f5203a;
            if (linkedHashMap.containsKey(lValueOf)) {
                return;
            }
            linkedHashMap.put(Long.valueOf(jArr[0]), zzafoVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public final zzafo m4074b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (zzafo zzafoVar : this.f5203a.values()) {
            arrayList.add(zzafoVar.f5198b);
            arrayList2.add(zzafoVar.f5199c);
            arrayList3.add(zzafoVar.f5200d);
            arrayList4.add(zzafoVar.f5201e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int i2 = (int) length;
        zzgtr.m7131d(length, length == ((long) i2), "the total number of elements (%s) in the arrays must fit in an int");
        int[] iArr3 = new int[i2];
        int i3 = 0;
        for (int[] iArr4 : iArr) {
            int length2 = iArr4.length;
            System.arraycopy(iArr4, 0, iArr3, i3, length2);
            i3 += length2;
        }
        return new zzafo(iArr3, zzhat.m7310a((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), zzhat.m7310a((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), zzhat.m7310a((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }
}
