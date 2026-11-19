package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
final class zzbrr implements zzhbn {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbrj f9302a;

    public zzbrr(zzbrv zzbrvVar, zzbrj zzbrjVar) {
        this.f9302a = zzbrjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    /* JADX INFO: renamed from: b */
    public final ListenableFuture mo3248b(Object obj) {
        zzbrp zzbrpVar = (zzbrp) obj;
        zzcgd zzcgdVar = new zzcgd();
        zzbrq zzbrqVar = new zzbrq(this, zzcgdVar);
        Parcel parcelM4810u = zzbrpVar.m4810u();
        zzben.m4815c(parcelM4810u, this.f9302a);
        zzben.m4817e(parcelM4810u, zzbrqVar);
        zzbrpVar.m4812x0(2, parcelM4810u);
        return zzcgdVar;
    }
}
