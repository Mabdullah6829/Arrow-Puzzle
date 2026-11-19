package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzz {

    /* JADX INFO: renamed from: a */
    public final TreeMap f23129a = new TreeMap();

    /* JADX INFO: renamed from: b */
    public final TreeMap f23130b = new TreeMap();

    /* JADX INFO: renamed from: a */
    public final void m10738a(zzg zzgVar, zzab zzabVar) {
        zzl zzlVar = new zzl(zzabVar);
        TreeMap treeMap = this.f23129a;
        for (Integer num : treeMap.keySet()) {
            zzaa zzaaVarClone = zzabVar.f21889b.clone();
            zzao zzaoVarMo9793c = ((zzan) treeMap.get(num)).mo9793c(zzgVar, Collections.singletonList(zzlVar));
            int iM10009g = zzaoVarMo9793c instanceof zzah ? zzh.m10009g(((zzah) zzaoVarMo9793c).f22163s.doubleValue()) : -1;
            if (iM10009g == 2 || iM10009g == -1) {
                zzabVar.f21889b = zzaaVarClone;
            }
        }
        TreeMap treeMap2 = this.f23130b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            zzao zzaoVarMo9793c2 = ((zzan) treeMap2.get((Integer) it.next())).mo9793c(zzgVar, Collections.singletonList(zzlVar));
            if (zzaoVarMo9793c2 instanceof zzah) {
                zzh.m10009g(((zzah) zzaoVarMo9793c2).f22163s.doubleValue());
            }
        }
    }
}
