package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzau extends zzav {
    public zzau() {
        this.f22252a.add(zzbk.BITWISE_AND);
        this.f22252a.add(zzbk.BITWISE_LEFT_SHIFT);
        this.f22252a.add(zzbk.BITWISE_NOT);
        this.f22252a.add(zzbk.BITWISE_OR);
        this.f22252a.add(zzbk.BITWISE_RIGHT_SHIFT);
        this.f22252a.add(zzbk.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f22252a.add(zzbk.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    /* JADX INFO: renamed from: a */
    public final zzao mo9805a(String str, zzg zzgVar, ArrayList arrayList) {
        zzbk zzbkVar = zzbk.ADD;
        switch (zzh.m10007e(str).ordinal()) {
            case 4:
                zzh.m10003a("BITWISE_AND", 2, arrayList);
                return new zzah(Double.valueOf(zzh.m10009g(zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0)).mo9581d().doubleValue()) & zzh.m10009g(zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1)).mo9581d().doubleValue())));
            case 5:
                zzh.m10003a("BITWISE_LEFT_SHIFT", 2, arrayList);
                return new zzah(Double.valueOf(zzh.m10009g(zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0)).mo9581d().doubleValue()) << ((int) (((long) zzh.m10009g(zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1)).mo9581d().doubleValue())) & 31))));
            case 6:
                zzh.m10003a("BITWISE_NOT", 1, arrayList);
                return new zzah(Double.valueOf(~zzh.m10009g(zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0)).mo9581d().doubleValue())));
            case 7:
                zzh.m10003a("BITWISE_OR", 2, arrayList);
                return new zzah(Double.valueOf(zzh.m10009g(zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0)).mo9581d().doubleValue()) | zzh.m10009g(zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1)).mo9581d().doubleValue())));
            case 8:
                zzh.m10003a("BITWISE_RIGHT_SHIFT", 2, arrayList);
                return new zzah(Double.valueOf(zzh.m10009g(zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0)).mo9581d().doubleValue()) >> ((int) (((long) zzh.m10009g(zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1)).mo9581d().doubleValue())) & 31))));
            case 9:
                zzh.m10003a("BITWISE_UNSIGNED_RIGHT_SHIFT", 2, arrayList);
                return new zzah(Double.valueOf((((long) zzh.m10009g(zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0)).mo9581d().doubleValue())) & 4294967295L) >>> ((int) (((long) zzh.m10009g(zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1)).mo9581d().doubleValue())) & 31))));
            case 10:
                zzh.m10003a("BITWISE_XOR", 2, arrayList);
                return new zzah(Double.valueOf(zzh.m10009g(zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0)).mo9581d().doubleValue()) ^ zzh.m10009g(zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1)).mo9581d().doubleValue())));
            default:
                m9806b(str);
                throw null;
        }
    }
}
