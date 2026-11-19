package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbb extends zzav {
    public zzbb() {
        this.f22252a.add(zzbk.AND);
        this.f22252a.add(zzbk.NOT);
        this.f22252a.add(zzbk.OR);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    /* JADX INFO: renamed from: a */
    public final zzao mo9805a(String str, zzg zzgVar, ArrayList arrayList) {
        zzbk zzbkVar = zzbk.ADD;
        int iOrdinal = zzh.m10007e(str).ordinal();
        if (iOrdinal == 1) {
            zzh.m10003a("AND", 2, arrayList);
            zzao zzaoVarM9808b = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0));
            if (!zzaoVarM9808b.mo9579a().booleanValue()) {
                return zzaoVarM9808b;
            }
            return zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1));
        }
        if (iOrdinal == 47) {
            zzh.m10003a("NOT", 1, arrayList);
            return new zzaf(Boolean.valueOf(!zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0)).mo9579a().booleanValue()));
        }
        if (iOrdinal != 50) {
            m9806b(str);
            throw null;
        }
        zzh.m10003a("OR", 2, arrayList);
        zzao zzaoVarM9808b2 = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0));
        if (zzaoVarM9808b2.mo9579a().booleanValue()) {
            return zzaoVarM9808b2;
        }
        return zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1));
    }
}
