package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbh extends zzav {
    public zzbh() {
        this.f22252a.add(zzbk.ADD);
        this.f22252a.add(zzbk.DIVIDE);
        this.f22252a.add(zzbk.MODULUS);
        this.f22252a.add(zzbk.MULTIPLY);
        this.f22252a.add(zzbk.NEGATE);
        this.f22252a.add(zzbk.POST_DECREMENT);
        this.f22252a.add(zzbk.POST_INCREMENT);
        this.f22252a.add(zzbk.PRE_DECREMENT);
        this.f22252a.add(zzbk.PRE_INCREMENT);
        this.f22252a.add(zzbk.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    /* JADX INFO: renamed from: a */
    public final zzao mo9805a(String str, zzg zzgVar, ArrayList arrayList) {
        zzbk zzbkVar = zzbk.ADD;
        int iOrdinal = zzh.m10007e(str).ordinal();
        if (iOrdinal == 0) {
            zzh.m10003a("ADD", 2, arrayList);
            zzao zzaoVarM9808b = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0));
            zzao zzaoVarM9808b2 = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1));
            if (!(zzaoVarM9808b instanceof zzak) && !(zzaoVarM9808b instanceof zzas) && !(zzaoVarM9808b2 instanceof zzak) && !(zzaoVarM9808b2 instanceof zzas)) {
                return new zzah(Double.valueOf(zzaoVarM9808b2.mo9581d().doubleValue() + zzaoVarM9808b.mo9581d().doubleValue()));
            }
            return new zzas(String.valueOf(zzaoVarM9808b.zzc()).concat(String.valueOf(zzaoVarM9808b2.zzc())));
        }
        if (iOrdinal == 21) {
            zzh.m10003a("DIVIDE", 2, arrayList);
            return new zzah(Double.valueOf(zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0)).mo9581d().doubleValue() / zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1)).mo9581d().doubleValue()));
        }
        if (iOrdinal == 59) {
            zzh.m10003a("SUBTRACT", 2, arrayList);
            zzao zzaoVarM9808b3 = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0));
            zzah zzahVar = new zzah(Double.valueOf(-zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1)).mo9581d().doubleValue()));
            return new zzah(Double.valueOf(zzahVar.f22163s.doubleValue() + zzaoVarM9808b3.mo9581d().doubleValue()));
        }
        if (iOrdinal == 52 || iOrdinal == 53) {
            zzh.m10003a(str, 2, arrayList);
            zzao zzaoVarM9808b4 = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0));
            zzgVar.m9950a((zzao) arrayList.get(1));
            return zzaoVarM9808b4;
        }
        if (iOrdinal == 55 || iOrdinal == 56) {
            zzh.m10003a(str, 1, arrayList);
            return zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0));
        }
        switch (iOrdinal) {
            case 44:
                zzh.m10003a("MODULUS", 2, arrayList);
                return new zzah(Double.valueOf(zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0)).mo9581d().doubleValue() % zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1)).mo9581d().doubleValue()));
            case 45:
                zzh.m10003a("MULTIPLY", 2, arrayList);
                return new zzah(Double.valueOf(zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1)).mo9581d().doubleValue() * zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0)).mo9581d().doubleValue()));
            case 46:
                zzh.m10003a("NEGATE", 1, arrayList);
                return new zzah(Double.valueOf(-zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0)).mo9581d().doubleValue()));
            default:
                m9806b(str);
                throw null;
        }
    }
}
