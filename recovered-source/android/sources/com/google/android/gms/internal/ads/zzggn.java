package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzggn implements zzgfo {

    /* JADX INFO: renamed from: a */
    public final zzgdq f17210a;

    /* JADX INFO: renamed from: b */
    public final zzggj f17211b;

    /* JADX INFO: renamed from: c */
    public final zzggd f17212c;

    /* JADX INFO: renamed from: d */
    public final ExecutorService f17213d;

    /* JADX INFO: renamed from: e */
    public final zzgqo f17214e;

    /* JADX INFO: renamed from: f */
    public final AtomicReference f17215f = new AtomicReference();

    public zzggn(zzgdq zzgdqVar, zzggj zzggjVar, zzggd zzggdVar, ExecutorService executorService, zzgqo zzgqoVar) {
        this.f17210a = zzgdqVar;
        this.f17211b = zzggjVar;
        this.f17212c = zzggdVar;
        this.f17213d = executorService;
        this.f17214e = zzgqoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfo
    public final ListenableFuture zza() {
        zzgdq zzgdqVar = this.f17210a;
        int iM6913M = zzgdqVar.m6913M();
        boolean zM6918R = zzgdqVar.m6918R();
        zzggj zzggjVar = this.f17211b;
        zzggjVar.getClass();
        zzhbx zzhbxVarM7360q = zzhbx.m7360q(zzhcf.m7369c(zzggjVar.f17199d, new zzggf(zzggjVar, iM6913M)));
        zzggg zzgggVar = zzggg.f17193a;
        zzhbu zzhbuVar = zzhbu.f18506s;
        zzhbx zzhbxVar = (zzhbx) zzhcf.m7374h(zzhbxVarM7360q, zzgggVar, zzhbuVar);
        if (zM6918R && iM6913M != zzggjVar.f17201f) {
            zzhbxVar = (zzhbx) zzhcf.m7374h((zzhbx) zzhcf.m7371e(zzhbx.m7360q(zzhbxVar), Throwable.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzggi
                @Override // com.google.android.gms.internal.ads.zzgti
                public final /* synthetic */ Object apply(Object obj) {
                    return null;
                }
            }, zzhbuVar), new zzgge(zzggjVar), zzhbuVar);
        }
        zzhbx zzhbxVar2 = (zzhbx) zzhcf.m7375i(zzhbx.m7360q(zzhbxVar), new zzgti() { // from class: com.google.android.gms.internal.ads.zzggm
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                zzggc zzggcVar = (zzggc) obj;
                this.f17209a.f17215f.set(zzggcVar);
                return zzggcVar;
            }
        }, zzhbuVar);
        zzhbxVar2.addListener(new zzhcd(zzhbxVar2, new zzggl(this)), this.f17213d);
        return zzhbxVar2;
    }
}
