package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzba {
    /* JADX INFO: renamed from: a */
    public static zzao m9813a(zzae zzaeVar, zzg zzgVar, ArrayList arrayList, boolean z) {
        zzao zzaoVarMo9793c;
        zzh.m10004b("reduce", 1, arrayList);
        zzh.m10005c(2, "reduce", arrayList);
        zzao zzaoVarM9808b = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0));
        if (!(zzaoVarM9808b instanceof zzai)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            zzaoVarMo9793c = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1));
            if (zzaoVarMo9793c instanceof zzag) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (zzaeVar.m9589s() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            zzaoVarMo9793c = null;
        }
        zzai zzaiVar = (zzai) zzaoVarM9808b;
        int iM9589s = zzaeVar.m9589s();
        int i2 = z ? 0 : iM9589s - 1;
        int i3 = z ? iM9589s - 1 : 0;
        int i4 = true == z ? 1 : -1;
        if (zzaoVarMo9793c == null) {
            zzaoVarMo9793c = zzaeVar.m9590t(i2);
            i2 += i4;
        }
        while ((i3 - i2) * i4 >= 0) {
            if (zzaeVar.m9592v(i2)) {
                zzaoVarMo9793c = zzaiVar.mo9793c(zzgVar, Arrays.asList(zzaoVarMo9793c, zzaeVar.m9590t(i2), new zzah(Double.valueOf(i2)), zzaeVar));
                if (zzaoVarMo9793c instanceof zzag) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i2 += i4;
            } else {
                i2 += i4;
            }
        }
        return zzaoVarMo9793c;
    }

    /* JADX INFO: renamed from: b */
    public static zzae m9814b(zzae zzaeVar, zzg zzgVar, zzan zzanVar, Boolean bool, Boolean bool2) {
        zzae zzaeVar2 = new zzae();
        Iterator itM9587q = zzaeVar.m9587q();
        while (itM9587q.hasNext()) {
            int iIntValue = ((Integer) itM9587q.next()).intValue();
            if (zzaeVar.m9592v(iIntValue)) {
                zzao zzaoVarMo9793c = zzanVar.mo9793c(zzgVar, Arrays.asList(zzaeVar.m9590t(iIntValue), new zzah(Double.valueOf(iIntValue)), zzaeVar));
                if (zzaoVarMo9793c.mo9579a().equals(bool)) {
                    break;
                }
                if (bool2 == null || zzaoVarMo9793c.mo9579a().equals(bool2)) {
                    zzaeVar2.m9591u(iIntValue, zzaoVarMo9793c);
                }
            }
        }
        return zzaeVar2;
    }
}
