package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Strings;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzexb implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzfhm f15076a;

    public zzexb(zzfhm zzfhmVar) {
        this.f15076a = zzfhmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        zzfhm zzfhmVar = this.f15076a;
        if (zzfhmVar == null) {
            return zzhcf.m7367a(new zzexa(null));
        }
        String str = zzfhmVar.f15716a;
        return Strings.m3656a(str) ? zzhcf.m7367a(new zzexa(null)) : zzhcf.m7367a(new zzexa(str));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 15;
    }
}
