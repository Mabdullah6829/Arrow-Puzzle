package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcyi implements zzepm {

    /* JADX INFO: renamed from: a */
    public final List f11774a;

    public zzcyi(List list) {
        this.f11774a = list;
    }

    @Override // com.google.android.gms.internal.ads.zzepm
    /* JADX INFO: renamed from: e */
    public final void mo5869e() {
        Iterator it = this.f11774a.iterator();
        while (it.hasNext()) {
            zzhcf.m7377k((ListenableFuture) it.next(), new zzcyf(), zzhbu.f18506s);
        }
    }

    public zzcyi(zzcya zzcyaVar) {
        this.f11774a = Collections.singletonList(zzhcf.m7367a(zzcyaVar));
    }
}
