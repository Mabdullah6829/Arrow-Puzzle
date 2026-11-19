package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzw extends zzai {

    /* JADX INFO: renamed from: u */
    public final zzj f23015u;

    /* JADX INFO: renamed from: v */
    public final HashMap f23016v;

    public zzw(zzj zzjVar) {
        super("require");
        this.f23016v = new HashMap();
        this.f23015u = zzjVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    /* JADX INFO: renamed from: c */
    public final zzao mo9793c(zzg zzgVar, List list) {
        zzao zzaoVar;
        zzh.m10003a("require", 1, list);
        String strZzc = zzgVar.f22494b.m9808b(zzgVar, (zzao) list.get(0)).zzc();
        HashMap map = this.f23016v;
        if (map.containsKey(strZzc)) {
            return (zzao) map.get(strZzc);
        }
        HashMap map2 = this.f23015u.f22522a;
        if (map2.containsKey(strZzc)) {
            try {
                zzaoVar = (zzao) ((Callable) map2.get(strZzc)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strZzc)));
            }
        } else {
            zzaoVar = zzao.f22237k;
        }
        if (zzaoVar instanceof zzai) {
            map.put(strZzc, (zzai) zzaoVar);
        }
        return zzaoVar;
    }
}
