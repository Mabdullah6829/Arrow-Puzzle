package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaw {

    /* JADX INFO: renamed from: a */
    public final HashMap f22253a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final zzbi f22254b = new zzbi();

    public zzaw() {
        m9807a(new zzau());
        m9807a(new zzax());
        m9807a(new zzay());
        m9807a(new zzbb());
        m9807a(new zzbg());
        m9807a(new zzbh());
        m9807a(new zzbj());
    }

    /* JADX INFO: renamed from: a */
    public final void m9807a(zzav zzavVar) {
        ArrayList arrayList = zzavVar.f22252a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            this.f22253a.put(Integer.valueOf(((zzbk) obj).f22328s).toString(), zzavVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public final zzao m9808b(zzg zzgVar, zzao zzaoVar) {
        zzh.m10013k(zzgVar);
        if (!(zzaoVar instanceof zzap)) {
            return zzaoVar;
        }
        zzap zzapVar = (zzap) zzaoVar;
        ArrayList arrayList = zzapVar.f22246t;
        String str = zzapVar.f22245s;
        HashMap map = this.f22253a;
        return (map.containsKey(str) ? (zzav) map.get(str) : this.f22254b).mo9805a(str, zzgVar, arrayList);
    }
}
