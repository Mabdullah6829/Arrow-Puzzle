package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzath {

    /* JADX INFO: renamed from: a */
    public final int f6879a;

    /* JADX INFO: renamed from: b */
    public final byte[] f6880b;

    /* JADX INFO: renamed from: c */
    public final Map f6881c;

    /* JADX INFO: renamed from: d */
    public final List f6882d;

    /* JADX INFO: renamed from: e */
    public final boolean f6883e;

    public zzath(int i2, byte[] bArr, Map map, List list, boolean z) {
        this.f6879a = i2;
        this.f6880b = bArr;
        this.f6881c = map;
        this.f6882d = list == null ? null : Collections.unmodifiableList(list);
        this.f6883e = z;
    }

    /* JADX INFO: renamed from: a */
    public static List m4387a(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new zzatd((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.Map] */
    public zzath(int i2, byte[] bArr, boolean z, List list) {
        ?? treeMap;
        if (list == null) {
            treeMap = 0;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzatd zzatdVar = (zzatd) it.next();
                treeMap.put(zzatdVar.f6872a, zzatdVar.f6873b);
            }
        }
        this(i2, bArr, treeMap, list, z);
    }
}
