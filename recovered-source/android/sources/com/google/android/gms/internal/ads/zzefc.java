package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzefc implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f13781a;

    /* JADX INFO: renamed from: b */
    public final zzini f13782b;

    /* JADX INFO: renamed from: c */
    public final zzdcq f13783c;

    /* JADX INFO: renamed from: d */
    public final zzini f13784d;

    public zzefc(zzini zziniVar, zzini zziniVar2, zzdcq zzdcqVar, zzini zziniVar3) {
        this.f13781a = zziniVar;
        this.f13782b = zziniVar2;
        this.f13783c = zzdcqVar;
        this.f13784d = zziniVar3;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x004e  */
    /* JADX WARN: Code duplicated, block: B:8:0x006d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0079  */
    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        ListenableFuture listenableFutureSubmit;
        final zzbaw zzbawVar = (zzbaw) this.f13781a.zzb();
        final Context contextM5709a = ((zzcnz) this.f13782b).m5709a();
        zzflg zzflgVarM5898a = this.f13783c.m5898a();
        long jLongValue = ((Long) this.f13784d.zzb()).longValue();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        zzbio zzbioVar = zzbix.f8813w3;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        int iIntValue = ((Integer) zzbaVar.f3098c.m5030a(zzbioVar)).intValue();
        if (iIntValue != -1) {
            if (Integer.toString(iIntValue).equals(com.google.android.gms.ads.nonagon.signalgeneration.zzv.m3345a(com.google.android.gms.ads.nonagon.signalgeneration.zzv.m3346b(zzflgVarM5898a.f16040d)))) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                if (System.currentTimeMillis() - jLongValue < ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8847y3)).intValue()) {
                    listenableFutureSubmit = ((zzhbb) zzhcpVar).submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeex
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzbawVar.f7501b.mo3257d(contextM5709a);
                        }
                    });
                } else {
                    listenableFutureSubmit = ((zzhbb) zzhcpVar).submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeew
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzbawVar.f7501b.mo3259f(contextM5709a);
                        }
                    });
                }
            } else {
                listenableFutureSubmit = ((zzhbb) zzhcpVar).submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeew
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzbawVar.f7501b.mo3259f(contextM5709a);
                    }
                });
            }
        } else {
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            if (System.currentTimeMillis() - jLongValue < ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8847y3)).intValue()) {
                listenableFutureSubmit = ((zzhbb) zzhcpVar).submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeex
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzbawVar.f7501b.mo3257d(contextM5709a);
                    }
                });
            } else {
                listenableFutureSubmit = ((zzhbb) zzhcpVar).submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeew
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzbawVar.f7501b.mo3259f(contextM5709a);
                    }
                });
            }
        }
        zzinh.m8554a(listenableFutureSubmit);
        return listenableFutureSubmit;
    }
}
