package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfqp {
    /* JADX INFO: renamed from: a */
    public static void m6575a(ListenableFuture listenableFuture, zzfqg zzfqgVar) {
        if (((Boolean) zzbkq.f9009c.m5057c()).booleanValue()) {
            zzhbx zzhbxVarM7360q = zzhbx.m7360q(listenableFuture);
            zzfql zzfqlVar = new zzfql(zzfqgVar);
            zzhbxVarM7360q.addListener(new zzhcd(zzhbxVarM7360q, zzfqlVar), zzcfy.f9953h);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m6576b(zzflg zzflgVar) {
        int iM3349e = com.google.android.gms.ads.nonagon.signalgeneration.zzv.m3349e(zzflgVar) - 1;
        return (iM3349e == 0 || iM3349e == 1) ? 7 : 23;
    }

    /* JADX INFO: renamed from: c */
    public static void m6577c(ListenableFuture listenableFuture, zzfqq zzfqqVar, zzfqg zzfqgVar, boolean z) {
        if (((Boolean) zzbkq.f9009c.m5057c()).booleanValue()) {
            zzhbx zzhbxVarM7360q = zzhbx.m7360q(listenableFuture);
            zzfqm zzfqmVar = new zzfqm(zzfqqVar, zzfqgVar, z);
            zzhbxVarM7360q.addListener(new zzhcd(zzhbxVarM7360q, zzfqmVar), zzcfy.f9953h);
        }
    }
}
