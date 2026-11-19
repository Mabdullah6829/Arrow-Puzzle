package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbg extends zzav {
    public zzbg() {
        this.f22252a.add(zzbk.FOR_IN);
        this.f22252a.add(zzbk.FOR_IN_CONST);
        this.f22252a.add(zzbk.FOR_IN_LET);
        this.f22252a.add(zzbk.FOR_LET);
        this.f22252a.add(zzbk.FOR_OF);
        this.f22252a.add(zzbk.FOR_OF_CONST);
        this.f22252a.add(zzbk.FOR_OF_LET);
        this.f22252a.add(zzbk.WHILE);
    }

    /* JADX INFO: renamed from: c */
    public static zzao m9816c(zzbe zzbeVar, zzao zzaoVar, zzao zzaoVar2) {
        if (zzaoVar instanceof Iterable) {
            return m9817d(zzbeVar, ((Iterable) zzaoVar).iterator(), zzaoVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* JADX INFO: renamed from: d */
    public static zzao m9817d(zzbe zzbeVar, Iterator it, zzao zzaoVar) {
        if (it != null) {
            while (it.hasNext()) {
                zzao zzaoVarM9951b = zzbeVar.mo9815a((zzao) it.next()).m9951b((zzae) zzaoVar);
                if (zzaoVarM9951b instanceof zzag) {
                    zzag zzagVar = (zzag) zzaoVarM9951b;
                    if ("break".equals(zzagVar.f22120t)) {
                        return zzao.f22237k;
                    }
                    if ("return".equals(zzagVar.f22120t)) {
                        return zzagVar;
                    }
                }
            }
        }
        return zzao.f22237k;
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    /* JADX INFO: renamed from: a */
    public final zzao mo9805a(String str, zzg zzgVar, ArrayList arrayList) {
        zzbk zzbkVar = zzbk.ADD;
        int iOrdinal = zzh.m10007e(str).ordinal();
        if (iOrdinal == 65) {
            zzh.m10003a("WHILE", 4, arrayList);
            zzao zzaoVar = (zzao) arrayList.get(0);
            zzao zzaoVar2 = (zzao) arrayList.get(1);
            zzao zzaoVar3 = (zzao) arrayList.get(2);
            zzao zzaoVar4 = (zzao) arrayList.get(3);
            zzaw zzawVar = zzgVar.f22494b;
            zzaw zzawVar2 = zzgVar.f22494b;
            zzao zzaoVarM9808b = zzawVar.m9808b(zzgVar, zzaoVar4);
            if (zzawVar2.m9808b(zzgVar, zzaoVar3).mo9579a().booleanValue()) {
                zzao zzaoVarM9951b = zzgVar.m9951b((zzae) zzaoVarM9808b);
                if (zzaoVarM9951b instanceof zzag) {
                    zzag zzagVar = (zzag) zzaoVarM9951b;
                    if ("break".equals(zzagVar.f22120t)) {
                        return zzao.f22237k;
                    }
                    if ("return".equals(zzagVar.f22120t)) {
                        return zzagVar;
                    }
                }
            }
            while (zzawVar2.m9808b(zzgVar, zzaoVar).mo9579a().booleanValue()) {
                zzao zzaoVarM9951b2 = zzgVar.m9951b((zzae) zzaoVarM9808b);
                if (zzaoVarM9951b2 instanceof zzag) {
                    zzag zzagVar2 = (zzag) zzaoVarM9951b2;
                    if ("break".equals(zzagVar2.f22120t)) {
                        return zzao.f22237k;
                    }
                    if ("return".equals(zzagVar2.f22120t)) {
                        return zzagVar2;
                    }
                }
                zzgVar.m9950a(zzaoVar2);
            }
            return zzao.f22237k;
        }
        switch (iOrdinal) {
            case 26:
                zzh.m10003a("FOR_IN", 3, arrayList);
                if (!(arrayList.get(0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                return m9817d(new zzbf(zzgVar, ((zzao) arrayList.get(0)).zzc()), zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1)).mo9580b(), zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(2)));
            case 27:
                zzh.m10003a("FOR_IN_CONST", 3, arrayList);
                if (!(arrayList.get(0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return m9817d(new zzbc(zzgVar, ((zzao) arrayList.get(0)).zzc()), zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1)).mo9580b(), zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(2)));
            case 28:
                zzh.m10003a("FOR_IN_LET", 3, arrayList);
                if (!(arrayList.get(0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                return m9817d(new zzbd(zzgVar, ((zzao) arrayList.get(0)).zzc()), zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1)).mo9580b(), zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(2)));
            case 29:
                zzh.m10003a("FOR_LET", 4, arrayList);
                zzao zzaoVar5 = (zzao) arrayList.get(0);
                zzaw zzawVar3 = zzgVar.f22494b;
                zzaw zzawVar4 = zzgVar.f22494b;
                zzao zzaoVarM9808b2 = zzawVar3.m9808b(zzgVar, zzaoVar5);
                if (!(zzaoVarM9808b2 instanceof zzae)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                zzae zzaeVar = (zzae) zzaoVarM9808b2;
                zzao zzaoVar6 = (zzao) arrayList.get(1);
                zzao zzaoVar7 = (zzao) arrayList.get(2);
                zzao zzaoVarM9808b3 = zzawVar4.m9808b(zzgVar, (zzao) arrayList.get(3));
                zzg zzgVarM9952c = zzgVar.m9952c();
                for (int i2 = 0; i2 < zzaeVar.m9589s(); i2++) {
                    String strZzc = zzaeVar.m9590t(i2).zzc();
                    zzgVarM9952c.m9954e(strZzc, zzgVar.m9956g(strZzc));
                }
                while (zzawVar4.m9808b(zzgVar, zzaoVar6).mo9579a().booleanValue()) {
                    zzao zzaoVarM9951b3 = zzgVar.m9951b((zzae) zzaoVarM9808b3);
                    if (zzaoVarM9951b3 instanceof zzag) {
                        zzag zzagVar3 = (zzag) zzaoVarM9951b3;
                        if ("break".equals(zzagVar3.f22120t)) {
                            return zzao.f22237k;
                        }
                        if ("return".equals(zzagVar3.f22120t)) {
                            return zzagVar3;
                        }
                    }
                    zzg zzgVarM9952c2 = zzgVar.m9952c();
                    for (int i3 = 0; i3 < zzaeVar.m9589s(); i3++) {
                        String strZzc2 = zzaeVar.m9590t(i3).zzc();
                        zzgVarM9952c2.m9954e(strZzc2, zzgVarM9952c.m9956g(strZzc2));
                    }
                    zzgVarM9952c2.m9950a(zzaoVar7);
                    zzgVarM9952c = zzgVarM9952c2;
                }
                return zzao.f22237k;
            case 30:
                zzh.m10003a("FOR_OF", 3, arrayList);
                if (!(arrayList.get(0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return m9816c(new zzbf(zzgVar, ((zzao) arrayList.get(0)).zzc()), zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1)), zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(2)));
            case 31:
                zzh.m10003a("FOR_OF_CONST", 3, arrayList);
                if (!(arrayList.get(0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return m9816c(new zzbc(zzgVar, ((zzao) arrayList.get(0)).zzc()), zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1)), zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(2)));
            case 32:
                zzh.m10003a("FOR_OF_LET", 3, arrayList);
                if (!(arrayList.get(0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return m9816c(new zzbd(zzgVar, ((zzao) arrayList.get(0)).zzc()), zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1)), zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(2)));
            default:
                m9806b(str);
                throw null;
        }
    }
}
