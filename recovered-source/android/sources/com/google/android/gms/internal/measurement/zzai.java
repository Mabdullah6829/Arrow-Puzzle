package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzai implements zzao, zzak {

    /* JADX INFO: renamed from: s */
    public final String f22198s;

    /* JADX INFO: renamed from: t */
    public final HashMap f22199t = new HashMap();

    public zzai(String str) {
        this.f22198s = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: a */
    public final Boolean mo9579a() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: b */
    public final Iterator mo9580b() {
        return new zzaj(this.f22199t.keySet().iterator());
    }

    /* JADX INFO: renamed from: c */
    public abstract zzao mo9793c(zzg zzgVar, List list);

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: d */
    public final Double mo9581d() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        String str = this.f22198s;
        if (str != null) {
            return str.equals(zzaiVar.f22198s);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    /* JADX INFO: renamed from: g */
    public final zzao mo9582g(String str) {
        HashMap map = this.f22199t;
        return map.containsKey(str) ? (zzao) map.get(str) : zzao.f22237k;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    /* JADX INFO: renamed from: h */
    public final void mo9583h(String str, zzao zzaoVar) {
        HashMap map = this.f22199t;
        if (zzaoVar == null) {
            map.remove(str);
        } else {
            map.put(str, zzaoVar);
        }
    }

    public final int hashCode() {
        String str = this.f22198s;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: k */
    public final zzao mo9584k(String str, zzg zzgVar, ArrayList arrayList) {
        return "toString".equals(str) ? new zzas(this.f22198s) : zzak.m9804j(this, new zzas(str), zzgVar, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    /* JADX INFO: renamed from: m */
    public final boolean mo9585m(String str) {
        return this.f22199t.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: r */
    public zzao mo9588r() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return this.f22198s;
    }
}
