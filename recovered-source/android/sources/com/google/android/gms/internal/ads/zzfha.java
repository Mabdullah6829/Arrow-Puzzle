package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfha implements zzeua {

    /* JADX INFO: renamed from: a */
    public final Context f15669a;

    /* JADX INFO: renamed from: b */
    public final Executor f15670b;

    /* JADX INFO: renamed from: c */
    public final zzcnq f15671c;

    /* JADX INFO: renamed from: d */
    public final zzetk f15672d;

    /* JADX INFO: renamed from: e */
    public final zzeto f15673e;

    /* JADX INFO: renamed from: f */
    public final FrameLayout f15674f;

    /* JADX INFO: renamed from: g */
    public zzbjs f15675g;

    /* JADX INFO: renamed from: h */
    public final zzdga f15676h;

    /* JADX INFO: renamed from: i */
    public final zzfqt f15677i;

    /* JADX INFO: renamed from: j */
    public final zzdif f15678j;

    /* JADX INFO: renamed from: k */
    public final zzflf f15679k;

    /* JADX INFO: renamed from: l */
    public zzfoz f15680l;

    /* JADX INFO: renamed from: m */
    public boolean f15681m;

    /* JADX INFO: renamed from: n */
    public com.google.android.gms.ads.internal.client.zze f15682n;

    /* JADX INFO: renamed from: o */
    public zzetz f15683o;

    public zzfha(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzr zzrVar, zzcnq zzcnqVar, zzetk zzetkVar, zzeto zzetoVar, zzflf zzflfVar, zzdif zzdifVar) {
        this.f15669a = context;
        this.f15670b = executor;
        this.f15671c = zzcnqVar;
        this.f15672d = zzetkVar;
        this.f15673e = zzetoVar;
        this.f15679k = zzflfVar;
        this.f15676h = zzcnqVar.mo5690i();
        this.f15677i = zzcnqVar.mo5680A();
        this.f15674f = new FrameLayout(context);
        this.f15678j = zzdifVar;
        zzflfVar.f16014b = zzrVar;
        this.f15681m = true;
        this.f15682n = null;
        this.f15683o = null;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6442a(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzety zzetyVar, zzetz zzetzVar) {
        zzcwx zzcwxVarZzh;
        Executor executor = this.f15670b;
        if (str == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3070c("Ad unit ID should not be null for banner ad.");
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f15665s.f15672d.mo5830v(zzfmi.m6535d(6, null, null));
                }
            });
            return false;
        }
        boolean zM6443b = m6443b();
        zzflf zzflfVar = this.f15679k;
        if (!zM6443b) {
            zzbio zzbioVar = zzbix.f8508e3;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            zzbiv zzbivVar = zzbaVar.f3098c;
            zzbiv zzbivVar2 = zzbaVar.f3098c;
            if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
                com.google.android.gms.ads.internal.client.zzay.m2812a();
            }
            boolean zBooleanValue = ((Boolean) zzbivVar2.m5030a(zzbix.f8616ka)).booleanValue();
            zzcnq zzcnqVar = this.f15671c;
            if (zBooleanValue && zzmVar.f3232x) {
                zzcnqVar.mo5707z().m6163b(true);
            }
            Pair pair = new Pair("api-call", Long.valueOf(zzmVar.f3223R));
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            Bundle bundleM6101a = zzdze.m6101a(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
            zzflfVar.f16015c = str;
            zzflfVar.f16013a = zzmVar;
            zzflfVar.f16032t = bundleM6101a;
            zzflg zzflgVarM6485a = zzflfVar.m6485a();
            int iM6576b = zzfqp.m6576b(zzflgVarM6485a);
            Context context = this.f15669a;
            zzfqg zzfqgVarM6561k = zzfqg.m6561k(context, iM6576b, 3, zzmVar);
            boolean zBooleanValue2 = ((Boolean) zzbld.f9117f.m5057c()).booleanValue();
            zzetk zzetkVar = this.f15672d;
            zzfqq zzfqqVarMo5755c = null;
            if (!zBooleanValue2 || !zzflfVar.f16014b.f3251C) {
                boolean zBooleanValue3 = ((Boolean) zzbivVar2.m5030a(zzbix.f8700p9)).booleanValue();
                FrameLayout frameLayout = this.f15674f;
                zzdif zzdifVar = this.f15678j;
                zzdga zzdgaVar = this.f15676h;
                if (zBooleanValue3) {
                    zzcww zzcwwVarMo5693l = zzcnqVar.mo5693l();
                    zzdci zzdciVar = new zzdci();
                    zzdciVar.f12021a = context;
                    zzdciVar.f12022b = zzflgVarM6485a;
                    ((zzcpl) zzcwwVarMo5693l).f10939e = new zzdcj(zzdciVar);
                    zzdiy zzdiyVar = new zzdiy();
                    zzdiyVar.m5928d(zzetkVar, executor);
                    zzdiyVar.m5926b(zzetkVar, executor);
                    zzcpl zzcplVar = (zzcpl) zzcwwVarMo5693l;
                    zzcplVar.f10938d = new zzdiz(zzdiyVar);
                    zzcplVar.f10940f = new zzerq(this.f15675g);
                    zzcplVar.f10944j = new zzdof(zzdql.f12653h, null);
                    zzcplVar.f10941g = new zzcxs(zzdgaVar, zzdifVar);
                    zzcplVar.f10943i = new zzcvp(frameLayout);
                    zzcwxVarZzh = zzcplVar.zzh();
                } else {
                    zzcww zzcwwVarMo5693l2 = zzcnqVar.mo5693l();
                    zzdci zzdciVar2 = new zzdci();
                    zzdciVar2.f12021a = context;
                    zzdciVar2.f12022b = zzflgVarM6485a;
                    ((zzcpl) zzcwwVarMo5693l2).f10939e = new zzdcj(zzdciVar2);
                    zzdiy zzdiyVar2 = new zzdiy();
                    zzdiyVar2.m5928d(zzetkVar, executor);
                    zzdky zzdkyVar = new zzdky(zzetkVar, executor);
                    HashSet hashSet = zzdiyVar2.f12225c;
                    hashSet.add(zzdkyVar);
                    hashSet.add(new zzdky(this.f15673e, executor));
                    zzdiyVar2.m5927c(zzetkVar, executor);
                    zzdiyVar2.f12228f.add(new zzdky(zzetkVar, executor));
                    zzdiyVar2.f12227e.add(new zzdky(zzetkVar, executor));
                    zzdiyVar2.f12230h.add(new zzdky(zzetkVar, executor));
                    zzdiyVar2.m5925a(zzetkVar, executor);
                    zzdiyVar2.m5926b(zzetkVar, executor);
                    zzdiyVar2.f12235m.add(new zzdky(zzetkVar, executor));
                    zzcpl zzcplVar2 = (zzcpl) zzcwwVarMo5693l2;
                    zzcplVar2.f10938d = new zzdiz(zzdiyVar2);
                    zzcplVar2.f10940f = new zzerq(this.f15675g);
                    zzcplVar2.f10944j = new zzdof(zzdql.f12653h, null);
                    zzcplVar2.f10941g = new zzcxs(zzdgaVar, zzdifVar);
                    zzcplVar2.f10943i = new zzcvp(frameLayout);
                    zzcwxVarZzh = zzcplVar2.zzh();
                }
                if (((Boolean) zzbkq.f9009c.m5057c()).booleanValue()) {
                    zzfqqVarMo5755c = zzcwxVarZzh.mo5755c();
                    zzfqqVarMo5755c.m6586i(3);
                    zzfqqVarMo5755c.m6580c(zzmVar.f3213H);
                    zzfqqVarMo5755c.m6581d(zzmVar.f3210E);
                }
                this.f15683o = zzetzVar;
                zzcze zzczeVarMo5754b = zzcwxVarZzh.mo5754b();
                zzfoz zzfozVarM5877c = zzczeVarMo5754b.m5877c(zzczeVarMo5754b.m5876b());
                this.f15680l = zzfozVarM5877c;
                zzfozVarM5877c.addListener(new zzhcd(zzfozVarM5877c, new zzfgw(this, zzfqqVarMo5755c, zzfqgVarM6561k, zzcwxVarZzh)), executor);
                return true;
            }
            if (zzetkVar != null) {
                zzetkVar.mo5830v(zzfmi.m6535d(7, null, null));
            }
        } else if (!zzflfVar.f16028p) {
            this.f15681m = true;
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6443b() {
        zzfoz zzfozVar = this.f15680l;
        return (zzfozVar == null || zzfozVar.f16221u.isDone()) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public final void m6444c() {
        synchronized (this) {
            try {
                zzfoz zzfozVar = this.f15680l;
                if (zzfozVar != null && zzfozVar.f16221u.isDone()) {
                    try {
                        zzcvs zzcvsVar = (zzcvs) this.f15680l.f16221u.get();
                        this.f15680l = null;
                        FrameLayout frameLayout = this.f15674f;
                        frameLayout.removeAllViews();
                        zzcvsVar.getClass();
                        ViewParent parent = zzcvsVar.mo5847c().getParent();
                        if (parent instanceof ViewGroup) {
                            String str = zzcvsVar.f11764f.f12046s;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
                            sb.append("Banner view provided from ");
                            sb.append(str);
                            sb.append(" already has a parent view. Removing its old parent.");
                            String string = sb.toString();
                            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                            com.google.android.gms.ads.internal.util.client.zzo.m3073f(string);
                            ((ViewGroup) parent).removeView(zzcvsVar.mo5847c());
                        }
                        zzbio zzbioVar = zzbix.f8700p9;
                        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                            zzdgp zzdgpVar = zzcvsVar.f11765g.f12193s;
                            zzetk zzetkVar = this.f15672d;
                            zzdhq zzdhqVar = zzdgpVar.f12167a;
                            zzdhqVar.f12194t = zzetkVar;
                            zzdhqVar.f12195u = this.f15673e;
                        }
                        frameLayout.addView(zzcvsVar.mo5847c());
                        zzetz zzetzVar = this.f15683o;
                        if (zzetzVar != null) {
                            zzetzVar.mo6334a(zzcvsVar);
                        }
                        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                            Executor executor = this.f15670b;
                            final zzetk zzetkVar2 = this.f15672d;
                            Objects.requireNonNull(zzetkVar2);
                            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgz
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzetkVar2.mo5833c();
                                }
                            });
                        }
                        if (zzcvsVar.mo5853j() >= 0) {
                            this.f15681m = false;
                            zzdga zzdgaVar = this.f15676h;
                            zzdgaVar.m5916K0(zzcvsVar.mo5853j());
                            zzdgaVar.m5917L0(zzcvsVar.mo5852i());
                        } else {
                            this.f15681m = true;
                            this.f15676h.m5916K0(zzcvsVar.mo5852i());
                        }
                    } catch (InterruptedException e) {
                        e = e;
                        m6446e();
                        com.google.android.gms.ads.internal.util.zze.m3151l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f15681m = true;
                        this.f15676h.zzc();
                    } catch (ExecutionException e2) {
                        e = e2;
                        m6446e();
                        com.google.android.gms.ads.internal.util.zze.m3151l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f15681m = true;
                        this.f15676h.zzc();
                    }
                } else if (this.f15680l != null) {
                    com.google.android.gms.ads.internal.util.zze.m3150k("Show timer went off but there is an ongoing ad request.");
                    this.f15681m = true;
                } else {
                    com.google.android.gms.ads.internal.util.zze.m3150k("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.f15681m = true;
                    this.f15676h.zzc();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6445d() {
        Object parent = this.f15674f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        Context context = view.getContext();
        com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzs.f3626l;
        Context applicationContext = context.getApplicationContext();
        KeyguardManager keyguardManager = null;
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return com.google.android.gms.ads.internal.util.zzs.m3219r(view, powerManager, keyguardManager);
    }

    /* JADX INFO: renamed from: e */
    public final void m6446e() {
        this.f15680l = null;
        final com.google.android.gms.ads.internal.client.zze zzeVar = this.f15682n;
        this.f15682n = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8700p9)).booleanValue() && zzeVar != null) {
            this.f15670b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f15663s.f15672d.mo5830v(zzeVar);
                }
            });
        }
        zzetz zzetzVar = this.f15683o;
        if (zzetzVar != null) {
            zzetzVar.zza();
        }
    }
}
