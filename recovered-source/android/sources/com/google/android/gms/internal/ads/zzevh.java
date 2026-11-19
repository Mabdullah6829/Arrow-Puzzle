package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzevh implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final Set f14973a;

    public zzevh(Set set) {
        this.f14973a = set;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f14973a.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zzhcf.m7367a(new zzevg(arrayList));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 8;
    }
}
