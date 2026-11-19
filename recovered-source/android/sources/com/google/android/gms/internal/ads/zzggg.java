package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzggg implements zzhbn {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ zzggg f17193a = new zzggg();

    private /* synthetic */ zzggg() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
        final zzggc zzggcVar = (zzggc) obj;
        return zzhcf.m7375i(zzggcVar.zzb(), new zzgti() { // from class: com.google.android.gms.internal.ads.zzggh
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj2) {
                return zzggcVar;
            }
        }, zzhbu.f18506s);
    }
}
