package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzhbo extends zzhbq {
    public zzhbo(zzgwt zzgwtVar, boolean z) {
        List arrayList;
        super(zzgwtVar, z, true);
        if (zzgwtVar.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            int size = zzgwtVar.size();
            zzgvp.m7175b(size, "initialArraySize");
            arrayList = new ArrayList(size);
        }
        for (int i2 = 0; i2 < zzgwtVar.size(); i2++) {
            arrayList.add(null);
        }
        this.f18500H = arrayList;
        m7348u();
    }

    @Override // com.google.android.gms.internal.ads.zzhbq
    /* JADX INFO: renamed from: x */
    public final List mo7353x(List list) {
        int size = list.size();
        zzgvp.m7175b(size, "initialArraySize");
        ArrayList arrayList = new ArrayList(size);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzhbp zzhbpVar = (zzhbp) it.next();
            arrayList.add(zzhbpVar != null ? zzhbpVar.f18499a : null);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
