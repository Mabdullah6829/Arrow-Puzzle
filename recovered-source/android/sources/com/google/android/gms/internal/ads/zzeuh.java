package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeuh implements zzeua {

    /* JADX INFO: renamed from: a */
    public final zzflf f14901a;

    /* JADX INFO: renamed from: b */
    public final zzcnq f14902b;

    /* JADX INFO: renamed from: c */
    public final Context f14903c;

    /* JADX INFO: renamed from: d */
    public final zzetx f14904d;

    /* JADX INFO: renamed from: e */
    public final zzfqt f14905e;

    /* JADX INFO: renamed from: f */
    public zzcyp f14906f;

    public zzeuh(zzcnq zzcnqVar, Context context, zzetx zzetxVar, zzflf zzflfVar) {
        this.f14902b = zzcnqVar;
        this.f14903c = context;
        this.f14904d = zzetxVar;
        this.f14901a = zzflfVar;
        this.f14905e = zzcnqVar.mo5680A();
        zzflfVar.f16030r = zzetxVar.f14881b;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6398a(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzety zzetyVar, zzetz zzetzVar) {
        zzetx zzetxVar = this.f14904d;
        zzetk zzetkVar = zzetxVar.f14881b;
        zzbio zzbioVar = zzbix.f8508e3;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.m2812a();
        }
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        com.google.android.gms.ads.internal.util.zzs zzsVar = zztVar.f3703c;
        Context context = this.f14903c;
        boolean zM3209h = com.google.android.gms.ads.internal.util.zzs.m3209h(context);
        zzcnq zzcnqVar = this.f14902b;
        if (zM3209h && zzmVar.f3216K == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3070c("Failed to load the ad because app ID is missing.");
            zzcnqVar.mo5688g().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeug
                @Override // java.lang.Runnable
                public final void run() {
                    ((zzetw) this.f14900s.f14904d.f14882c).mo5830v(zzfmi.m6535d(4, null, null));
                }
            });
            return false;
        }
        if (str == null) {
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3070c("Ad unit ID should not be null for NativeAdLoader.");
            zzcnqVar.mo5688g().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeuf
                @Override // java.lang.Runnable
                public final void run() {
                    ((zzetw) this.f14899s.f14904d.f14882c).mo5830v(zzfmi.m6535d(6, null, null));
                }
            });
            return false;
        }
        boolean z = zzmVar.f3232x;
        zzfmd.m6527b(context, z);
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8616ka)).booleanValue() && z) {
            zzcnqVar.mo5707z().m6163b(true);
        }
        int i4 = ((zzeub) zzetyVar).f14890a;
        zztVar.f3711k.getClass();
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        Bundle bundleM6101a = zzdze.m6101a(new Pair("api-call", lValueOf), new Pair("dynamite-enter", lValueOf));
        zzflf zzflfVar = this.f14901a;
        zzflfVar.f16013a = zzmVar;
        zzflfVar.f16032t = bundleM6101a;
        zzflfVar.f16025m = i4;
        zzflg zzflgVarM6485a = zzflfVar.m6485a();
        zzfqg zzfqgVarM6561k = zzfqg.m6561k(context, zzfqp.m6576b(zzflgVarM6485a), 8, zzmVar);
        com.google.android.gms.ads.internal.client.zzcl zzclVar = zzflgVarM6485a.f16051o;
        if (zzclVar != null) {
            zzetkVar.m6352g(zzclVar);
        }
        zzdoj zzdojVarMo5699r = zzcnqVar.mo5699r();
        zzdci zzdciVar = new zzdci();
        zzdciVar.f12021a = context;
        zzdciVar.f12022b = zzflgVarM6485a;
        ((zzcpb) zzdojVarMo5699r).f10660e = new zzdcj(zzdciVar);
        zzdiy zzdiyVar = new zzdiy();
        zzdiyVar.m5926b(zzetkVar, zzcnqVar.mo5688g());
        zzcpb zzcpbVar = (zzcpb) zzdojVarMo5699r;
        zzcpbVar.f10659d = new zzdiz(zzdiyVar);
        zzcpbVar.f10661f = new zzdof(zzetxVar.f14880a, zzetkVar.m6351d());
        zzfqq zzfqqVar = null;
        zzcpbVar.f10662g = new zzcvp(null);
        zzdok zzdokVarZzh = zzcpbVar.zzh();
        if (((Boolean) zzbkq.f9009c.m5057c()).booleanValue()) {
            zzfqqVar = (zzfqq) ((zzcpc) zzdokVarZzh).f10697e.zzb();
            zzfqqVar.m6586i(8);
            zzfqqVar.m6580c(zzmVar.f3213H);
            zzfqqVar.m6581d(zzmVar.f3210E);
        }
        zzcnqVar.mo5706y().m6530a(1);
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        ScheduledExecutorService scheduledExecutorServiceMo5689h = zzcnqVar.mo5689h();
        zzcze zzczeVarMo5725a = zzdokVarZzh.mo5725a();
        zzfoz zzfozVarM5877c = zzczeVarMo5725a.m5877c(zzczeVarMo5725a.m5876b());
        zzcyp zzcypVar = new zzcyp(zzhcpVar, scheduledExecutorServiceMo5689h, zzfozVarM5877c);
        this.f14906f = zzcypVar;
        zzfozVarM5877c.addListener(new zzhcd(zzfozVarM5877c, new zzcyj(zzcypVar, new zzeue(this, zzetzVar, zzfqqVar, zzfqgVarM6561k, zzdokVarZzh))), zzhcpVar);
        return true;
    }
}
