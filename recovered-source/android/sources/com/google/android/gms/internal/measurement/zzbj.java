package com.google.android.gms.internal.measurement;

import androidx.browser.trusted.sharing.ShareTarget;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbj extends zzav {
    public zzbj() {
        this.f22252a.add(zzbk.ASSIGN);
        this.f22252a.add(zzbk.CONST);
        this.f22252a.add(zzbk.CREATE_ARRAY);
        this.f22252a.add(zzbk.CREATE_OBJECT);
        this.f22252a.add(zzbk.EXPRESSION_LIST);
        this.f22252a.add(zzbk.GET);
        this.f22252a.add(zzbk.GET_INDEX);
        this.f22252a.add(zzbk.GET_PROPERTY);
        this.f22252a.add(zzbk.NULL);
        this.f22252a.add(zzbk.SET_PROPERTY);
        this.f22252a.add(zzbk.TYPEOF);
        this.f22252a.add(zzbk.UNDEFINED);
        this.f22252a.add(zzbk.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    /* JADX INFO: renamed from: a */
    public final zzao mo9805a(String str, zzg zzgVar, ArrayList arrayList) {
        String str2;
        zzbk zzbkVar = zzbk.ADD;
        int iOrdinal = zzh.m10007e(str).ordinal();
        int i2 = 0;
        if (iOrdinal == 3) {
            zzh.m10003a("ASSIGN", 2, arrayList);
            zzao zzaoVarM9808b = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0));
            if (!(zzaoVarM9808b instanceof zzas)) {
                throw new IllegalArgumentException(AbstractC0271e0.m398f("Expected string for assign var. got ", zzaoVarM9808b.getClass().getCanonicalName()));
            }
            zzas zzasVar = (zzas) zzaoVarM9808b;
            String str3 = zzasVar.f22251s;
            String str4 = zzasVar.f22251s;
            if (!zzgVar.m9953d(str3)) {
                throw new IllegalArgumentException(AbstractC0271e0.m398f("Attempting to assign undefined value ", str4));
            }
            zzao zzaoVarM9808b2 = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1));
            zzgVar.m9954e(str4, zzaoVarM9808b2);
            return zzaoVarM9808b2;
        }
        if (iOrdinal == 14) {
            zzh.m10004b("CONST", 2, arrayList);
            if (arrayList.size() % 2 != 0) {
                throw new IllegalArgumentException(AbstractC0271e0.m396d(arrayList.size(), "CONST requires an even number of arguments, found "));
            }
            while (i2 < arrayList.size() - 1) {
                zzao zzaoVarM9808b3 = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(i2));
                if (!(zzaoVarM9808b3 instanceof zzas)) {
                    throw new IllegalArgumentException(AbstractC0271e0.m398f("Expected string for const name. got ", zzaoVarM9808b3.getClass().getCanonicalName()));
                }
                String str5 = ((zzas) zzaoVarM9808b3).f22251s;
                zzgVar.m9955f(str5, zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(i2 + 1)));
                zzgVar.f22496d.put(str5, Boolean.TRUE);
                i2 += 2;
            }
            return zzao.f22237k;
        }
        if (iOrdinal == 24) {
            zzh.m10004b("EXPRESSION_LIST", 1, arrayList);
            zzao zzaoVarM9808b4 = zzao.f22237k;
            while (i2 < arrayList.size()) {
                zzaoVarM9808b4 = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(i2));
                if (zzaoVarM9808b4 instanceof zzag) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i2++;
            }
            return zzaoVarM9808b4;
        }
        if (iOrdinal == 33) {
            zzh.m10003a(ShareTarget.METHOD_GET, 1, arrayList);
            zzao zzaoVarM9808b5 = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0));
            if (zzaoVarM9808b5 instanceof zzas) {
                return zzgVar.m9956g(((zzas) zzaoVarM9808b5).f22251s);
            }
            throw new IllegalArgumentException(AbstractC0271e0.m398f("Expected string for get var. got ", zzaoVarM9808b5.getClass().getCanonicalName()));
        }
        if (iOrdinal == 49) {
            zzh.m10003a("NULL", 0, arrayList);
            return zzao.f22238l;
        }
        if (iOrdinal == 58) {
            zzh.m10003a("SET_PROPERTY", 3, arrayList);
            zzao zzaoVar = (zzao) arrayList.get(0);
            zzaw zzawVar = zzgVar.f22494b;
            zzaw zzawVar2 = zzgVar.f22494b;
            zzao zzaoVarM9808b6 = zzawVar.m9808b(zzgVar, zzaoVar);
            zzao zzaoVarM9808b7 = zzawVar2.m9808b(zzgVar, (zzao) arrayList.get(1));
            zzao zzaoVarM9808b8 = zzawVar2.m9808b(zzgVar, (zzao) arrayList.get(2));
            if (zzaoVarM9808b6 == zzao.f22237k || zzaoVarM9808b6 == zzao.f22238l) {
                throw new IllegalStateException("Can't set property " + zzaoVarM9808b7.zzc() + " of " + zzaoVarM9808b6.zzc());
            }
            if ((zzaoVarM9808b6 instanceof zzae) && (zzaoVarM9808b7 instanceof zzah)) {
                ((zzae) zzaoVarM9808b6).m9591u(((zzah) zzaoVarM9808b7).f22163s.intValue(), zzaoVarM9808b8);
                return zzaoVarM9808b8;
            }
            if (!(zzaoVarM9808b6 instanceof zzak)) {
                return zzaoVarM9808b8;
            }
            ((zzak) zzaoVarM9808b6).mo9583h(zzaoVarM9808b7.zzc(), zzaoVarM9808b8);
            return zzaoVarM9808b8;
        }
        if (iOrdinal == 17) {
            if (arrayList.isEmpty()) {
                return new zzae();
            }
            zzae zzaeVar = new zzae();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                zzao zzaoVarM9808b9 = zzgVar.f22494b.m9808b(zzgVar, (zzao) obj);
                if (zzaoVarM9808b9 instanceof zzag) {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
                zzaeVar.m9591u(i2, zzaoVarM9808b9);
                i2++;
            }
            return zzaeVar;
        }
        if (iOrdinal == 18) {
            if (arrayList.isEmpty()) {
                return new zzal();
            }
            if (arrayList.size() % 2 != 0) {
                throw new IllegalArgumentException(AbstractC0271e0.m396d(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
            }
            zzal zzalVar = new zzal();
            while (i2 < arrayList.size() - 1) {
                zzao zzaoVarM9808b10 = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(i2));
                zzao zzaoVarM9808b11 = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(i2 + 1));
                if ((zzaoVarM9808b10 instanceof zzag) || (zzaoVarM9808b11 instanceof zzag)) {
                    throw new IllegalStateException("Failed to evaluate map entry");
                }
                zzalVar.mo9583h(zzaoVarM9808b10.zzc(), zzaoVarM9808b11);
                i2 += 2;
            }
            return zzalVar;
        }
        if (iOrdinal == 35 || iOrdinal == 36) {
            zzh.m10003a("GET_PROPERTY", 2, arrayList);
            zzao zzaoVarM9808b12 = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0));
            zzao zzaoVarM9808b13 = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1));
            if ((zzaoVarM9808b12 instanceof zzae) && zzh.m10006d(zzaoVarM9808b13)) {
                return ((zzae) zzaoVarM9808b12).m9590t(zzaoVarM9808b13.mo9581d().intValue());
            }
            if (zzaoVarM9808b12 instanceof zzak) {
                return ((zzak) zzaoVarM9808b12).mo9582g(zzaoVarM9808b13.zzc());
            }
            if (zzaoVarM9808b12 instanceof zzas) {
                if ("length".equals(zzaoVarM9808b13.zzc())) {
                    return new zzah(Double.valueOf(((zzas) zzaoVarM9808b12).f22251s.length()));
                }
                if (zzh.m10006d(zzaoVarM9808b13)) {
                    zzas zzasVar2 = (zzas) zzaoVarM9808b12;
                    if (zzaoVarM9808b13.mo9581d().doubleValue() < zzasVar2.f22251s.length()) {
                        return new zzas(String.valueOf(zzasVar2.f22251s.charAt(zzaoVarM9808b13.mo9581d().intValue())));
                    }
                }
            }
            return zzao.f22237k;
        }
        switch (iOrdinal) {
            case 62:
                zzh.m10003a("TYPEOF", 1, arrayList);
                zzao zzaoVarM9808b14 = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0));
                if (zzaoVarM9808b14 instanceof zzat) {
                    str2 = "undefined";
                } else if (zzaoVarM9808b14 instanceof zzaf) {
                    str2 = TypedValues.Custom.S_BOOLEAN;
                } else if (zzaoVarM9808b14 instanceof zzah) {
                    str2 = "number";
                } else if (zzaoVarM9808b14 instanceof zzas) {
                    str2 = TypedValues.Custom.S_STRING;
                } else if (zzaoVarM9808b14 instanceof zzan) {
                    str2 = "function";
                } else {
                    if ((zzaoVarM9808b14 instanceof zzap) || (zzaoVarM9808b14 instanceof zzag)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", zzaoVarM9808b14));
                    }
                    str2 = "object";
                }
                return new zzas(str2);
            case 63:
                zzh.m10003a("UNDEFINED", 0, arrayList);
                return zzao.f22237k;
            case 64:
                zzh.m10004b("VAR", 1, arrayList);
                int size2 = arrayList.size();
                while (i2 < size2) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    zzao zzaoVarM9808b15 = zzgVar.f22494b.m9808b(zzgVar, (zzao) obj2);
                    if (!(zzaoVarM9808b15 instanceof zzas)) {
                        throw new IllegalArgumentException(AbstractC0271e0.m398f("Expected string for var name. got ", zzaoVarM9808b15.getClass().getCanonicalName()));
                    }
                    zzgVar.m9955f(((zzas) zzaoVarM9808b15).f22251s, zzao.f22237k);
                }
                return zzao.f22237k;
            default:
                m9806b(str);
                throw null;
        }
    }
}
