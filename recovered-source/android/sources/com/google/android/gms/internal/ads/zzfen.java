package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfen implements zzfcs {
    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        final ListenableFuture listenableFuture = zzhcj.f18518t;
        ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8196L6)).getClass();
        return new zzhce(zzgwt.m7221u(new ListenableFuture[]{listenableFuture, listenableFuture}), true).m7366a(zzcfy.f9946a, new Callable() { // from class: com.google.android.gms.internal.ads.zzfem

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListenableFuture f15548b = zzhcj.f18518t;

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzfeo((String) ((zzhcj) listenableFuture).f18520s, (String) ((zzhcj) zzhcj.f18518t).f18520s);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 47;
    }
}
