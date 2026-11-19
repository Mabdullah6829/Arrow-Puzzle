package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class zzal implements zzao, zzak {

    /* JADX INFO: renamed from: s */
    public final HashMap f22233s = new HashMap();

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: a */
    public final Boolean mo9579a() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: b */
    public final Iterator mo9580b() {
        return new zzaj(this.f22233s.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: d */
    public final Double mo9581d() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzal) {
            return this.f22233s.equals(((zzal) obj).f22233s);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    /* JADX INFO: renamed from: g */
    public final zzao mo9582g(String str) {
        HashMap map = this.f22233s;
        return map.containsKey(str) ? (zzao) map.get(str) : zzao.f22237k;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    /* JADX INFO: renamed from: h */
    public final void mo9583h(String str, zzao zzaoVar) {
        HashMap map = this.f22233s;
        if (zzaoVar == null) {
            map.remove(str);
        } else {
            map.put(str, zzaoVar);
        }
    }

    public final int hashCode() {
        return this.f22233s.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: k */
    public zzao mo9584k(String str, zzg zzgVar, ArrayList arrayList) {
        return "toString".equals(str) ? new zzas(toString()) : zzak.m9804j(this, new zzas(str), zzgVar, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    /* JADX INFO: renamed from: m */
    public final boolean mo9585m(String str) {
        return this.f22233s.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: r */
    public final zzao mo9588r() {
        zzal zzalVar = new zzal();
        for (Map.Entry entry : this.f22233s.entrySet()) {
            boolean z = entry.getValue() instanceof zzak;
            HashMap map = zzalVar.f22233s;
            if (z) {
                map.put((String) entry.getKey(), (zzao) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((zzao) entry.getValue()).mo9588r());
            }
        }
        return zzalVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.f22233s;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return "[object Object]";
    }
}
