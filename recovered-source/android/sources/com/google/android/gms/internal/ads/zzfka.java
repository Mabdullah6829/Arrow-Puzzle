package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfka implements zzeua {

    /* JADX INFO: renamed from: a */
    public final Context f15829a;

    /* JADX INFO: renamed from: b */
    public final Executor f15830b;

    /* JADX INFO: renamed from: c */
    public final zzcnq f15831c;

    /* JADX INFO: renamed from: d */
    public final zzfjr f15832d;

    /* JADX INFO: renamed from: e */
    public final zzfie f15833e;

    /* JADX INFO: renamed from: f */
    public final zzfkz f15834f;

    /* JADX INFO: renamed from: g */
    public final zzfqt f15835g;

    /* JADX INFO: renamed from: h */
    public final zzflf f15836h;

    /* JADX INFO: renamed from: i */
    public ListenableFuture f15837i;

    public zzfka(Context context, Executor executor, zzcnq zzcnqVar, zzfie zzfieVar, zzfjr zzfjrVar, zzflf zzflfVar, zzfkz zzfkzVar) {
        this.f15829a = context;
        this.f15830b = executor;
        this.f15831c = zzcnqVar;
        this.f15833e = zzfieVar;
        this.f15832d = zzfjrVar;
        this.f15836h = zzflfVar;
        this.f15834f = zzfkzVar;
        this.f15835g = zzcnqVar.mo5680A();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6469a(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzety zzetyVar, zzetz zzetzVar) {
        zzfqq zzfqqVarMo5744d;
        zzccd zzccdVar = new zzccd(zzmVar, str);
        Executor executor = this.f15830b;
        String str2 = zzccdVar.f9739t;
        if (str2 == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3070c("Ad unit ID should not be null for rewarded video ad.");
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfjy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f15827s.f15832d.mo5830v(zzfmi.m6535d(6, null, null));
                }
            });
            return false;
        }
        ListenableFuture listenableFuture = this.f15837i;
        if (listenableFuture != null && !listenableFuture.isDone()) {
            return false;
        }
        zzbio zzbioVar = zzbix.f8508e3;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.m2812a();
        }
        boolean zBooleanValue = ((Boolean) zzbkq.f9009c.m5057c()).booleanValue();
        zzfie zzfieVar = this.f15833e;
        com.google.android.gms.ads.internal.client.zzm zzmVar2 = zzccdVar.f9738s;
        if (!zBooleanValue || zzfieVar.mo6449d() == null) {
            zzfqqVarMo5744d = null;
        } else {
            zzfqqVarMo5744d = ((zzcqi) ((zzdvz) zzfieVar.mo6449d())).mo5744d();
            zzfqqVarMo5744d.m6586i(5);
            zzfqqVarMo5744d.m6580c(zzmVar2.f3213H);
            zzfqqVarMo5744d.m6581d(zzmVar2.f3210E);
        }
        boolean z = zzmVar2.f3232x;
        Context context = this.f15829a;
        zzfmd.m6527b(context, z);
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8616ka)).booleanValue() && z) {
            this.f15831c.mo5707z().m6163b(true);
        }
        Pair pair = new Pair("api-call", Long.valueOf(zzmVar2.f3223R));
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        Bundle bundleM6101a = zzdze.m6101a(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        zzflf zzflfVar = this.f15836h;
        zzflfVar.f16015c = str2;
        zzflfVar.f16014b = new com.google.android.gms.ads.internal.client.zzr("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false, false);
        zzflfVar.f16013a = zzmVar2;
        zzflfVar.f16032t = bundleM6101a;
        zzflg zzflgVarM6485a = zzflfVar.m6485a();
        zzfqg zzfqgVarM6561k = zzfqg.m6561k(context, zzfqp.m6576b(zzflgVarM6485a), 5, zzmVar2);
        zzfjz zzfjzVar = new zzfjz();
        zzfjzVar.f15828a = zzflgVarM6485a;
        ListenableFuture listenableFutureMo6447a = zzfieVar.mo6447a(new zzfif(zzfjzVar, null), new zzfid() { // from class: com.google.android.gms.internal.ads.zzfjx
            @Override // com.google.android.gms.internal.ads.zzfid
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ zzdcg mo6431a(zzfic zzficVar) {
                return this.f15826a.m6470b(zzficVar);
            }
        });
        this.f15837i = listenableFutureMo6447a;
        listenableFutureMo6447a.addListener(new zzhcd(listenableFutureMo6447a, new zzfjw(this, zzetzVar, zzfqqVarMo5744d, zzfqgVarM6561k, zzfjzVar)), executor);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final zzdvy m6470b(zzfic zzficVar) {
        zzdvy zzdvyVarMo5700s = this.f15831c.mo5700s();
        zzdci zzdciVar = new zzdci();
        zzdciVar.f12021a = this.f15829a;
        zzdciVar.f12022b = ((zzfjz) zzficVar).f15828a;
        zzdciVar.f12024d = this.f15834f;
        ((zzcqh) zzdvyVarMo5700s).f11180e = new zzdcj(zzdciVar);
        ((zzcqh) zzdvyVarMo5700s).f11179d = new zzdiz(new zzdiy());
        return zzdvyVarMo5700s;
    }
}
