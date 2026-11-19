package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzk extends zzai {

    /* JADX INFO: renamed from: u */
    public final zzab f22569u;

    public zzk(zzab zzabVar) {
        super("internal.eventLogger");
        this.f22569u = zzabVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    /* JADX INFO: renamed from: c */
    public final zzao mo9793c(zzg zzgVar, List list) {
        zzh.m10003a(this.f22198s, 3, list);
        String strZzc = zzgVar.f22494b.m9808b(zzgVar, (zzao) list.get(0)).zzc();
        zzao zzaoVar = (zzao) list.get(1);
        zzaw zzawVar = zzgVar.f22494b;
        long jM10010h = (long) zzh.m10010h(zzawVar.m9808b(zzgVar, zzaoVar).mo9581d().doubleValue());
        zzao zzaoVarM9808b = zzawVar.m9808b(zzgVar, (zzao) list.get(2));
        HashMap mapM10012j = zzaoVarM9808b instanceof zzal ? zzh.m10012j((zzal) zzaoVarM9808b) : new HashMap();
        zzab zzabVar = this.f22569u;
        zzabVar.getClass();
        HashMap map = new HashMap();
        for (String str : mapM10012j.keySet()) {
            HashMap map2 = zzabVar.f21888a.f21852c;
            map.put(str, zzaa.m9300b(map2.containsKey(str) ? map2.get(str) : null, str, mapM10012j.get(str)));
        }
        zzabVar.f21890c.add(new zzaa(strZzc, jM10010h, map));
        return zzao.f22237k;
    }
}
