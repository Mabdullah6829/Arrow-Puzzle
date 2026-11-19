package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfiq implements zzeua {

    /* JADX INFO: renamed from: a */
    public final Context f15762a;

    /* JADX INFO: renamed from: b */
    public final Executor f15763b;

    /* JADX INFO: renamed from: c */
    public final zzcnq f15764c;

    /* JADX INFO: renamed from: d */
    public final zzetk f15765d;

    /* JADX INFO: renamed from: e */
    public final zzfjr f15766e;

    /* JADX INFO: renamed from: f */
    public zzbjs f15767f;

    /* JADX INFO: renamed from: g */
    public final zzfqt f15768g;

    /* JADX INFO: renamed from: h */
    public final zzflf f15769h;

    /* JADX INFO: renamed from: i */
    public zzfoz f15770i;

    public zzfiq(Context context, Executor executor, zzcnq zzcnqVar, zzetk zzetkVar, zzfjr zzfjrVar, zzflf zzflfVar) {
        this.f15762a = context;
        this.f15763b = executor;
        this.f15764c = zzcnqVar;
        this.f15765d = zzetkVar;
        this.f15769h = zzflfVar;
        this.f15766e = zzfjrVar;
        this.f15768g = zzcnqVar.mo5680A();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6462a(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzety zzetyVar, zzetz zzetzVar) {
        zzdno zzdnoVarZzh;
        zzfqq zzfqqVarMo5776c;
        Executor executor = this.f15763b;
        if (str == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3070c("Ad unit ID should not be null for interstitial ad.");
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfip
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f15761s.f15765d.mo5830v(zzfmi.m6535d(6, null, null));
                }
            });
            return false;
        }
        if (m6463b()) {
            return false;
        }
        zzbio zzbioVar = zzbix.f8508e3;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.m2812a();
        }
        boolean zBooleanValue = ((Boolean) zzbivVar2.m5030a(zzbix.f8616ka)).booleanValue();
        zzcnq zzcnqVar = this.f15764c;
        if (zBooleanValue && zzmVar.f3232x) {
            zzcnqVar.mo5707z().m6163b(true);
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar = ((zzfij) zzetyVar).f15749a;
        Pair pair = new Pair("api-call", Long.valueOf(zzmVar.f3223R));
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        Bundle bundleM6101a = zzdze.m6101a(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        zzflf zzflfVar = this.f15769h;
        zzflfVar.f16015c = str;
        zzflfVar.f16014b = zzrVar;
        zzflfVar.f16013a = zzmVar;
        zzflfVar.f16032t = bundleM6101a;
        zzflg zzflgVarM6485a = zzflfVar.m6485a();
        int iM6576b = zzfqp.m6576b(zzflgVarM6485a);
        Context context = this.f15762a;
        zzfqg zzfqgVarM6561k = zzfqg.m6561k(context, iM6576b, 4, zzmVar);
        boolean zBooleanValue2 = ((Boolean) zzbivVar2.m5030a(zzbix.f8734r9)).booleanValue();
        zzetk zzetkVar = this.f15765d;
        if (zBooleanValue2) {
            zzdnn zzdnnVarMo5697p = zzcnqVar.mo5697p();
            zzdci zzdciVar = new zzdci();
            zzdciVar.f12021a = context;
            zzdciVar.f12022b = zzflgVarM6485a;
            ((zzcpw) zzdnnVarMo5697p).f11075e = new zzdcj(zzdciVar);
            zzdiy zzdiyVar = new zzdiy();
            zzdiyVar.m5928d(zzetkVar, executor);
            zzdiyVar.m5926b(zzetkVar, executor);
            zzcpw zzcpwVar = (zzcpw) zzdnnVarMo5697p;
            zzcpwVar.f11074d = new zzdiz(zzdiyVar);
            zzcpwVar.f11076f = new zzerq(this.f15767f);
            zzdnoVarZzh = zzcpwVar.zzh();
        } else {
            zzdiy zzdiyVar2 = new zzdiy();
            HashSet hashSet = zzdiyVar2.f12230h;
            HashSet hashSet2 = zzdiyVar2.f12227e;
            zzfjr zzfjrVar = this.f15766e;
            if (zzfjrVar != null) {
                hashSet2.add(new zzdky(zzfjrVar, executor));
                hashSet.add(new zzdky(zzfjrVar, executor));
                zzdiyVar2.m5925a(zzfjrVar, executor);
            }
            zzdnn zzdnnVarMo5697p2 = zzcnqVar.mo5697p();
            zzdci zzdciVar2 = new zzdci();
            zzdciVar2.f12021a = context;
            zzdciVar2.f12022b = zzflgVarM6485a;
            ((zzcpw) zzdnnVarMo5697p2).f11075e = new zzdcj(zzdciVar2);
            zzdiyVar2.m5928d(zzetkVar, executor);
            hashSet2.add(new zzdky(zzetkVar, executor));
            hashSet.add(new zzdky(zzetkVar, executor));
            zzdiyVar2.m5925a(zzetkVar, executor);
            zzdiyVar2.f12225c.add(new zzdky(zzetkVar, executor));
            zzdiyVar2.m5927c(zzetkVar, executor);
            zzdiyVar2.m5926b(zzetkVar, executor);
            zzdiyVar2.f12235m.add(new zzdky(zzetkVar, executor));
            zzdiyVar2.f12234l.add(new zzdky(zzetkVar, executor));
            zzcpw zzcpwVar2 = (zzcpw) zzdnnVarMo5697p2;
            zzcpwVar2.f11074d = new zzdiz(zzdiyVar2);
            zzcpwVar2.f11076f = new zzerq(this.f15767f);
            zzdnoVarZzh = zzcpwVar2.zzh();
        }
        zzdno zzdnoVar = zzdnoVarZzh;
        if (((Boolean) zzbkq.f9009c.m5057c()).booleanValue()) {
            zzfqqVarMo5776c = zzdnoVar.mo5776c();
            zzfqqVarMo5776c.m6586i(4);
            zzfqqVarMo5776c.m6580c(zzmVar.f3213H);
            zzfqqVarMo5776c.m6581d(zzmVar.f3210E);
        } else {
            zzfqqVarMo5776c = null;
        }
        zzfqq zzfqqVar = zzfqqVarMo5776c;
        zzcze zzczeVarMo5775b = zzdnoVar.mo5775b();
        zzfoz zzfozVarM5877c = zzczeVarMo5775b.m5877c(zzczeVarMo5775b.m5876b());
        this.f15770i = zzfozVarM5877c;
        zzfozVarM5877c.addListener(new zzhcd(zzfozVarM5877c, new zzfio(this, zzetzVar, zzfqqVar, zzfqgVarM6561k, zzdnoVar)), executor);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6463b() {
        zzfoz zzfozVar = this.f15770i;
        return (zzfozVar == null || zzfozVar.f16221u.isDone()) ? false : true;
    }
}
