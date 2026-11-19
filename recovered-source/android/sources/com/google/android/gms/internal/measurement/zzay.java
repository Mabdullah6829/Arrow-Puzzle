package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzay extends zzav {
    public zzay() {
        this.f22252a.add(zzbk.APPLY);
        this.f22252a.add(zzbk.BLOCK);
        this.f22252a.add(zzbk.BREAK);
        this.f22252a.add(zzbk.CASE);
        this.f22252a.add(zzbk.DEFAULT);
        this.f22252a.add(zzbk.CONTINUE);
        this.f22252a.add(zzbk.DEFINE_FUNCTION);
        this.f22252a.add(zzbk.FN);
        this.f22252a.add(zzbk.IF);
        this.f22252a.add(zzbk.QUOTE);
        this.f22252a.add(zzbk.RETURN);
        this.f22252a.add(zzbk.SWITCH);
        this.f22252a.add(zzbk.TERNARY);
    }

    /* JADX INFO: renamed from: c */
    public static zzan m9812c(zzg zzgVar, List list) {
        zzbk zzbkVar = zzbk.ADD;
        zzh.m10004b("FN", 2, list);
        zzao zzaoVarM9808b = zzgVar.f22494b.m9808b(zzgVar, (zzao) list.get(0));
        zzao zzaoVarM9808b2 = zzgVar.f22494b.m9808b(zzgVar, (zzao) list.get(1));
        if (!(zzaoVarM9808b2 instanceof zzae)) {
            throw new IllegalArgumentException(AbstractC0271e0.m398f("FN requires an ArrayValue of parameter names found ", zzaoVarM9808b2.getClass().getCanonicalName()));
        }
        List listM9586n = ((zzae) zzaoVarM9808b2).m9586n();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new zzan(zzaoVarM9808b.zzc(), (ArrayList) listM9586n, arrayList, zzgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    /* JADX INFO: renamed from: a */
    public final zzao mo9805a(String str, zzg zzgVar, ArrayList arrayList) {
        zzbk zzbkVar = zzbk.ADD;
        int iOrdinal = zzh.m10007e(str).ordinal();
        if (iOrdinal == 2) {
            zzh.m10003a("APPLY", 3, arrayList);
            zzao zzaoVar = (zzao) arrayList.get(0);
            zzaw zzawVar = zzgVar.f22494b;
            zzaw zzawVar2 = zzgVar.f22494b;
            zzao zzaoVarM9808b = zzawVar.m9808b(zzgVar, zzaoVar);
            String strZzc = zzawVar2.m9808b(zzgVar, (zzao) arrayList.get(1)).zzc();
            zzao zzaoVarM9808b2 = zzawVar2.m9808b(zzgVar, (zzao) arrayList.get(2));
            if (!(zzaoVarM9808b2 instanceof zzae)) {
                throw new IllegalArgumentException(AbstractC0271e0.m398f("Function arguments for Apply are not a list found ", zzaoVarM9808b2.getClass().getCanonicalName()));
            }
            if (strZzc.isEmpty()) {
                throw new IllegalArgumentException("Function name for apply is undefined");
            }
            return zzaoVarM9808b.mo9584k(strZzc, zzgVar, (ArrayList) ((zzae) zzaoVarM9808b2).m9586n());
        }
        if (iOrdinal == 15) {
            zzh.m10003a("BREAK", 0, arrayList);
            return zzao.f22239m;
        }
        if (iOrdinal == 25) {
            return m9812c(zzgVar, arrayList);
        }
        if (iOrdinal == 41) {
            zzh.m10004b("IF", 2, arrayList);
            zzao zzaoVar2 = (zzao) arrayList.get(0);
            zzaw zzawVar3 = zzgVar.f22494b;
            zzaw zzawVar4 = zzgVar.f22494b;
            zzao zzaoVarM9808b3 = zzawVar3.m9808b(zzgVar, zzaoVar2);
            zzao zzaoVarM9808b4 = zzawVar4.m9808b(zzgVar, (zzao) arrayList.get(1));
            zzao zzaoVarM9808b5 = arrayList.size() > 2 ? zzawVar4.m9808b(zzgVar, (zzao) arrayList.get(2)) : null;
            zzao zzaoVar3 = zzao.f22237k;
            zzao zzaoVarM9951b = zzaoVarM9808b3.mo9579a().booleanValue() ? zzgVar.m9951b((zzae) zzaoVarM9808b4) : zzaoVarM9808b5 != null ? zzgVar.m9951b((zzae) zzaoVarM9808b5) : zzaoVar3;
            return true != (zzaoVarM9951b instanceof zzag) ? zzaoVar3 : zzaoVarM9951b;
        }
        if (iOrdinal == 54) {
            return new zzae(arrayList);
        }
        if (iOrdinal == 57) {
            if (arrayList.isEmpty()) {
                return zzao.f22241o;
            }
            zzh.m10003a("RETURN", 1, arrayList);
            return new zzag("return", zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0)));
        }
        if (iOrdinal != 19) {
            if (iOrdinal == 20) {
                zzh.m10004b("DEFINE_FUNCTION", 2, arrayList);
                zzan zzanVarM9812c = m9812c(zzgVar, arrayList);
                String str2 = zzanVarM9812c.f22198s;
                if (str2 == null) {
                    zzgVar.m9954e("", zzanVarM9812c);
                    return zzanVarM9812c;
                }
                zzgVar.m9954e(str2, zzanVarM9812c);
                return zzanVarM9812c;
            }
            if (iOrdinal == 60) {
                zzh.m10003a("SWITCH", 3, arrayList);
                zzao zzaoVar4 = (zzao) arrayList.get(0);
                zzaw zzawVar5 = zzgVar.f22494b;
                zzaw zzawVar6 = zzgVar.f22494b;
                zzao zzaoVarM9808b6 = zzawVar5.m9808b(zzgVar, zzaoVar4);
                zzao zzaoVarM9808b7 = zzawVar6.m9808b(zzgVar, (zzao) arrayList.get(1));
                zzao zzaoVarM9808b8 = zzawVar6.m9808b(zzgVar, (zzao) arrayList.get(2));
                if (!(zzaoVarM9808b7 instanceof zzae)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(zzaoVarM9808b8 instanceof zzae)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                zzae zzaeVar = (zzae) zzaoVarM9808b7;
                zzae zzaeVar2 = (zzae) zzaoVarM9808b8;
                boolean z = false;
                for (int i2 = 0; i2 < zzaeVar.m9589s(); i2++) {
                    if (z || zzaoVarM9808b6.equals(zzawVar6.m9808b(zzgVar, zzaeVar.m9590t(i2)))) {
                        zzao zzaoVarM9808b9 = zzawVar6.m9808b(zzgVar, zzaeVar2.m9590t(i2));
                        if (zzaoVarM9808b9 instanceof zzag) {
                            return ((zzag) zzaoVarM9808b9).f22120t.equals("break") ? zzao.f22237k : zzaoVarM9808b9;
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (zzaeVar.m9589s() + 1 == zzaeVar2.m9589s()) {
                    zzao zzaoVarM9808b10 = zzawVar6.m9808b(zzgVar, zzaeVar2.m9590t(zzaeVar.m9589s()));
                    if (zzaoVarM9808b10 instanceof zzag) {
                        String str3 = ((zzag) zzaoVarM9808b10).f22120t;
                        if (str3.equals("return") || str3.equals("continue")) {
                            return zzaoVarM9808b10;
                        }
                    }
                }
                return zzao.f22237k;
            }
            if (iOrdinal == 61) {
                zzh.m10003a("TERNARY", 3, arrayList);
                zzao zzaoVar5 = (zzao) arrayList.get(0);
                zzaw zzawVar7 = zzgVar.f22494b;
                zzaw zzawVar8 = zzgVar.f22494b;
                return zzawVar7.m9808b(zzgVar, zzaoVar5).mo9579a().booleanValue() ? zzawVar8.m9808b(zzgVar, (zzao) arrayList.get(1)) : zzawVar8.m9808b(zzgVar, (zzao) arrayList.get(2));
            }
            switch (iOrdinal) {
                case 11:
                    return zzgVar.m9952c().m9951b(new zzae(arrayList));
                case 12:
                    zzh.m10003a("BREAK", 0, arrayList);
                    return zzao.f22240n;
                case 13:
                    break;
                default:
                    m9806b(str);
                    throw null;
            }
        }
        if (arrayList.isEmpty()) {
            return zzao.f22237k;
        }
        zzao zzaoVarM9808b11 = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0));
        return zzaoVarM9808b11 instanceof zzae ? zzgVar.m9951b((zzae) zzaoVarM9808b11) : zzao.f22237k;
    }
}
