package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public interface zzak {
    /* JADX INFO: renamed from: j */
    static zzao m9804j(zzak zzakVar, zzas zzasVar, zzg zzgVar, ArrayList arrayList) {
        String str = zzasVar.f22251s;
        if (zzakVar.mo9585m(str)) {
            zzao zzaoVarMo9582g = zzakVar.mo9582g(str);
            if (zzaoVarMo9582g instanceof zzai) {
                return ((zzai) zzaoVarMo9582g).mo9793c(zzgVar, arrayList);
            }
            throw new IllegalArgumentException(AbstractC0271e0.m414v(str, " is not a function"));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(AbstractC0271e0.m398f("Object has no function ", str));
        }
        zzh.m10003a("hasOwnProperty", 1, arrayList);
        return zzakVar.mo9585m(zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0)).zzc()) ? zzao.f22242p : zzao.f22243q;
    }

    /* JADX INFO: renamed from: g */
    zzao mo9582g(String str);

    /* JADX INFO: renamed from: h */
    void mo9583h(String str, zzao zzaoVar);

    /* JADX INFO: renamed from: m */
    boolean mo9585m(String str);
}
