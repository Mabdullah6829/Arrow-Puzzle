package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzv extends zzai {

    /* JADX INFO: renamed from: u */
    public final zzz f22967u;

    public zzv(zzz zzzVar) {
        super("internal.registerCallback");
        this.f22967u = zzzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    /* JADX INFO: renamed from: c */
    public final zzao mo9793c(zzg zzgVar, List list) {
        TreeMap treeMap;
        zzh.m10003a(this.f22198s, 3, list);
        zzgVar.f22494b.m9808b(zzgVar, (zzao) list.get(0)).zzc();
        zzao zzaoVar = (zzao) list.get(1);
        zzaw zzawVar = zzgVar.f22494b;
        zzao zzaoVarM9808b = zzawVar.m9808b(zzgVar, zzaoVar);
        if (!(zzaoVarM9808b instanceof zzan)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        zzao zzaoVarM9808b2 = zzawVar.m9808b(zzgVar, (zzao) list.get(2));
        if (!(zzaoVarM9808b2 instanceof zzal)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        zzal zzalVar = (zzal) zzaoVarM9808b2;
        if (!zzalVar.f22233s.containsKey("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        String strZzc = zzalVar.mo9582g("type").zzc();
        int iM10009g = zzalVar.f22233s.containsKey("priority") ? zzh.m10009g(zzalVar.mo9582g("priority").mo9581d().doubleValue()) : 1000;
        zzan zzanVar = (zzan) zzaoVarM9808b;
        zzz zzzVar = this.f22967u;
        zzzVar.getClass();
        if ("create".equals(strZzc)) {
            treeMap = zzzVar.f23130b;
        } else {
            if (!"edit".equals(strZzc)) {
                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(strZzc)));
            }
            treeMap = zzzVar.f23129a;
        }
        if (treeMap.containsKey(Integer.valueOf(iM10009g))) {
            iM10009g = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(iM10009g), zzanVar);
        return zzao.f22237k;
    }
}
