package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzezo implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzhcp f15230a;

    public zzezo(zzhcp zzhcpVar) {
        this.f15230a = zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.f15230a.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzezn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
                com.google.android.gms.ads.internal.util.zzax zzaxVar = zztVar.f3715o;
                synchronized (zzaxVar.f3500a) {
                    str = zzaxVar.f3502c;
                }
                return new zzezp(str, zztVar.f3715o.m3103h());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 20;
    }
}
