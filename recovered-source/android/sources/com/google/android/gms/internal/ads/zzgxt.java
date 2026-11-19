package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgxt {
    /* JADX INFO: renamed from: a */
    public static ArrayList m7250a(zzgzh zzgzhVar) {
        ArrayList arrayList = new ArrayList();
        zzgzhVar.getClass();
        while (zzgzhVar.hasNext()) {
            arrayList.add(zzgzhVar.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static AbstractList m7251b(List list, zzgti zzgtiVar) {
        return list != null ? new zzgxq(list, zzgtiVar) : new zzgxs(list, zzgtiVar);
    }
}
