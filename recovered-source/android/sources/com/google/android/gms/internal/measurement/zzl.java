package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzl extends zzal {

    /* JADX INFO: renamed from: t */
    public final zzab f22598t;

    public zzl(zzab zzabVar) {
        this.f22598t = zzabVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    @Override // com.google.android.gms.internal.measurement.zzal, com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: k */
    public final zzao mo9584k(String str, zzg zzgVar, ArrayList arrayList) {
        byte b;
        switch (str) {
            case "getEventName":
                b = 0;
            case "getTimestamp":
                b = 3;
                break;
            case "getParamValue":
                b = 1;
                break;
            case "getParams":
                b = 2;
                break;
            case "setParamValue":
                b = 5;
            case "setEventName":
                b = 4;
                break;
            default:
                b = -1;
        }
        zzab zzabVar = this.f22598t;
        if (b == 0) {
            zzh.m10003a("getEventName", 0, arrayList);
            return new zzas(zzabVar.f21889b.f21850a);
        }
        if (b == 1) {
            zzh.m10003a("getParamValue", 1, arrayList);
            String strZzc = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0)).zzc();
            HashMap map = zzabVar.f21889b.f21852c;
            return zzi.m10179a(map.containsKey(strZzc) ? map.get(strZzc) : null);
        }
        if (b == 2) {
            zzh.m10003a("getParams", 0, arrayList);
            HashMap map2 = zzabVar.f21889b.f21852c;
            zzal zzalVar = new zzal();
            for (String str2 : map2.keySet()) {
                zzalVar.mo9583h(str2, zzi.m10179a(map2.get(str2)));
            }
            return zzalVar;
        }
        if (b == 3) {
            zzh.m10003a("getTimestamp", 0, arrayList);
            return new zzah(Double.valueOf(zzabVar.f21889b.f21851b));
        }
        if (b == 4) {
            zzh.m10003a("setEventName", 1, arrayList);
            zzao zzaoVarM9808b = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0));
            if (zzao.f22237k.equals(zzaoVarM9808b) || zzao.f22238l.equals(zzaoVarM9808b)) {
                throw new IllegalArgumentException("Illegal event name");
            }
            zzabVar.f21889b.f21850a = zzaoVarM9808b.zzc();
            return new zzas(zzaoVarM9808b.zzc());
        }
        if (b != 5) {
            return super.mo9584k(str, zzgVar, arrayList);
        }
        zzh.m10003a("setParamValue", 2, arrayList);
        String strZzc2 = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0)).zzc();
        zzao zzaoVarM9808b2 = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1));
        zzaa zzaaVar = zzabVar.f21889b;
        Object objM10011i = zzh.m10011i(zzaoVarM9808b2);
        HashMap map3 = zzaaVar.f21852c;
        if (objM10011i == null) {
            map3.remove(strZzc2);
            return zzaoVarM9808b2;
        }
        map3.put(strZzc2, zzaa.m9300b(map3.get(strZzc2), strZzc2, objM10011i));
        return zzaoVarM9808b2;
    }
}
