package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzi {
    /* JADX INFO: renamed from: a */
    public static zzao m10179a(Object obj) {
        if (obj == null) {
            return zzao.f22238l;
        }
        if (obj instanceof String) {
            return new zzas((String) obj);
        }
        if (obj instanceof Double) {
            return new zzah((Double) obj);
        }
        if (obj instanceof Long) {
            return new zzah(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new zzah(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new zzaf((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            zzae zzaeVar = new zzae();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzaeVar.m9591u(zzaeVar.m9589s(), m10179a(it.next()));
            }
            return zzaeVar;
        }
        zzal zzalVar = new zzal();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            zzao zzaoVarM10179a = m10179a(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                zzalVar.mo9583h((String) string, zzaoVarM10179a);
            }
        }
        return zzalVar;
    }

    /* JADX INFO: renamed from: b */
    public static zzao m10180b(zzje zzjeVar) {
        if (zzjeVar == null) {
            return zzao.f22237k;
        }
        int iM10453I = zzjeVar.m10453I() - 1;
        if (iM10453I == 1) {
            return zzjeVar.m10447C() ? new zzas(zzjeVar.m10448D()) : zzao.f22244r;
        }
        if (iM10453I == 2) {
            return zzjeVar.m10451G() ? new zzah(Double.valueOf(zzjeVar.m10452H())) : new zzah(null);
        }
        if (iM10453I == 3) {
            return zzjeVar.m10449E() ? new zzaf(Boolean.valueOf(zzjeVar.m10450F())) : new zzaf(null);
        }
        if (iM10453I != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listM10445A = zzjeVar.m10445A();
        ArrayList arrayList = new ArrayList();
        Iterator it = listM10445A.iterator();
        while (it.hasNext()) {
            arrayList.add(m10180b((zzje) it.next()));
        }
        return new zzap(zzjeVar.m10446B(), arrayList);
    }
}
