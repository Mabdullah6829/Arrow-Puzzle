package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgge implements zzhbn {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzggj f17190a;

    public zzgge(zzggj zzggjVar) {
        Objects.requireNonNull(zzggjVar);
        this.f17190a = zzggjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    /* JADX INFO: renamed from: b */
    public final ListenableFuture mo3248b(Object obj) {
        zzggc zzggcVar = (zzggc) obj;
        if (zzggcVar != null) {
            return zzhcf.m7367a(zzggcVar);
        }
        zzggj zzggjVar = this.f17190a;
        zzggjVar.f17200e.m7061b(51);
        return (zzhbx) zzhcf.m7374h(zzhbx.m7360q(zzhcf.m7369c(zzggjVar.f17199d, new zzggf(zzggjVar, zzggjVar.f17201f))), zzggg.f17193a, zzhbu.f18506s);
    }
}
