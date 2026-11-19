package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfcc implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzceg f15389a;

    /* JADX INFO: renamed from: b */
    public final zzhcp f15390b;

    /* JADX INFO: renamed from: c */
    public final Context f15391c;

    public zzfcc(zzceg zzcegVar, zzhcp zzhcpVar, Context context) {
        this.f15389a = zzcegVar;
        this.f15390b = zzhcpVar;
        this.f15391c = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.f15390b.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfcc zzfccVar = this.f15388a;
                zzceg zzcegVar = zzfccVar.f15389a;
                Context context = zzfccVar.f15391c;
                if (!zzcegVar.m5361a(context)) {
                    return new zzfcd(null, null, null, null, null);
                }
                String strM5362b = zzcegVar.m5362b(context);
                String str = strM5362b == null ? "" : strM5362b;
                String strM5363c = zzcegVar.m5363c(context);
                String str2 = strM5363c == null ? "" : strM5363c;
                String strM5364d = zzcegVar.m5364d(context);
                String str3 = strM5364d == null ? "" : strM5364d;
                boolean zM5361a = zzcegVar.m5361a(context);
                Long l2 = null;
                String str4 = true != zM5361a ? null : "fa";
                if ("TIME_OUT".equals(str2)) {
                    l2 = (Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8292R0);
                }
                return new zzfcd(str, str2, str3, str4 == null ? "" : str4, l2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 34;
    }
}
