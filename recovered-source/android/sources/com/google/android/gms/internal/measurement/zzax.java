package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzax extends zzav {
    public zzax() {
        this.f22252a.add(zzbk.EQUALS);
        this.f22252a.add(zzbk.GREATER_THAN);
        this.f22252a.add(zzbk.GREATER_THAN_EQUALS);
        this.f22252a.add(zzbk.IDENTITY_EQUALS);
        this.f22252a.add(zzbk.IDENTITY_NOT_EQUALS);
        this.f22252a.add(zzbk.LESS_THAN);
        this.f22252a.add(zzbk.LESS_THAN_EQUALS);
        this.f22252a.add(zzbk.NOT_EQUALS);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m9809c(zzao zzaoVar, zzao zzaoVar2) {
        if (zzaoVar instanceof zzak) {
            zzaoVar = new zzas(zzaoVar.zzc());
        }
        if (zzaoVar2 instanceof zzak) {
            zzaoVar2 = new zzas(zzaoVar2.zzc());
        }
        if ((zzaoVar instanceof zzas) && (zzaoVar2 instanceof zzas)) {
            return ((zzas) zzaoVar).f22251s.compareTo(((zzas) zzaoVar2).f22251s) < 0;
        }
        double dDoubleValue = zzaoVar.mo9581d().doubleValue();
        double dDoubleValue2 = zzaoVar2.mo9581d().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m9810d(zzao zzaoVar, zzao zzaoVar2) {
        if (zzaoVar.getClass().equals(zzaoVar2.getClass())) {
            if ((zzaoVar instanceof zzat) || (zzaoVar instanceof zzam)) {
                return true;
            }
            if (zzaoVar instanceof zzah) {
                return (Double.isNaN(zzaoVar.mo9581d().doubleValue()) || Double.isNaN(zzaoVar2.mo9581d().doubleValue()) || zzaoVar.mo9581d().doubleValue() != zzaoVar2.mo9581d().doubleValue()) ? false : true;
            }
            if (zzaoVar instanceof zzas) {
                return zzaoVar.zzc().equals(zzaoVar2.zzc());
            }
            if (zzaoVar instanceof zzaf) {
                return zzaoVar.mo9579a().equals(zzaoVar2.mo9579a());
            }
            return zzaoVar == zzaoVar2;
        }
        if (((zzaoVar instanceof zzat) || (zzaoVar instanceof zzam)) && ((zzaoVar2 instanceof zzat) || (zzaoVar2 instanceof zzam))) {
            return true;
        }
        boolean z = zzaoVar instanceof zzah;
        if (z && (zzaoVar2 instanceof zzas)) {
            return m9810d(zzaoVar, new zzah(zzaoVar2.mo9581d()));
        }
        boolean z2 = zzaoVar instanceof zzas;
        if (z2 && (zzaoVar2 instanceof zzah)) {
            return m9810d(new zzah(zzaoVar.mo9581d()), zzaoVar2);
        }
        if (zzaoVar instanceof zzaf) {
            return m9810d(new zzah(zzaoVar.mo9581d()), zzaoVar2);
        }
        if (zzaoVar2 instanceof zzaf) {
            return m9810d(zzaoVar, new zzah(zzaoVar2.mo9581d()));
        }
        if ((z2 || z) && (zzaoVar2 instanceof zzak)) {
            return m9810d(zzaoVar, new zzas(zzaoVar2.zzc()));
        }
        if ((zzaoVar instanceof zzak) && ((zzaoVar2 instanceof zzas) || (zzaoVar2 instanceof zzah))) {
            return m9810d(new zzas(zzaoVar.zzc()), zzaoVar2);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m9811e(zzao zzaoVar, zzao zzaoVar2) {
        if (zzaoVar instanceof zzak) {
            zzaoVar = new zzas(zzaoVar.zzc());
        }
        if (zzaoVar2 instanceof zzak) {
            zzaoVar2 = new zzas(zzaoVar2.zzc());
        }
        return (((zzaoVar instanceof zzas) && (zzaoVar2 instanceof zzas)) || !(Double.isNaN(zzaoVar.mo9581d().doubleValue()) || Double.isNaN(zzaoVar2.mo9581d().doubleValue()))) && !m9809c(zzaoVar2, zzaoVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    /* JADX INFO: renamed from: a */
    public final zzao mo9805a(String str, zzg zzgVar, ArrayList arrayList) {
        boolean zM9810d;
        boolean zM9810d2;
        zzh.m10003a(zzh.m10007e(str).name(), 2, arrayList);
        zzao zzaoVarM9808b = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0));
        zzao zzaoVarM9808b2 = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1));
        int iOrdinal = zzh.m10007e(str).ordinal();
        if (iOrdinal != 23) {
            if (iOrdinal == 48) {
                zM9810d2 = m9810d(zzaoVarM9808b, zzaoVarM9808b2);
            } else if (iOrdinal == 42) {
                zM9810d = m9809c(zzaoVarM9808b, zzaoVarM9808b2);
            } else if (iOrdinal != 43) {
                switch (iOrdinal) {
                    case 37:
                        zM9810d = m9809c(zzaoVarM9808b2, zzaoVarM9808b);
                        break;
                    case 38:
                        zM9810d = m9811e(zzaoVarM9808b2, zzaoVarM9808b);
                        break;
                    case 39:
                        zM9810d = zzh.m10008f(zzaoVarM9808b, zzaoVarM9808b2);
                        break;
                    case 40:
                        zM9810d2 = zzh.m10008f(zzaoVarM9808b, zzaoVarM9808b2);
                        break;
                    default:
                        m9806b(str);
                        throw null;
                }
            } else {
                zM9810d = m9811e(zzaoVarM9808b, zzaoVarM9808b2);
            }
            zM9810d = !zM9810d2;
        } else {
            zM9810d = m9810d(zzaoVarM9808b, zzaoVarM9808b2);
        }
        return zM9810d ? zzao.f22242p : zzao.f22243q;
    }
}
