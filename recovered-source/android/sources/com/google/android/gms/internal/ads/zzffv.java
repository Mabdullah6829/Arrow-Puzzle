package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzffv implements zzeua {

    /* JADX INFO: renamed from: a */
    public final Context f15595a;

    /* JADX INFO: renamed from: b */
    public final Executor f15596b;

    /* JADX INFO: renamed from: c */
    public final zzcnq f15597c;

    /* JADX INFO: renamed from: d */
    public final zzfgm f15598d;

    /* JADX INFO: renamed from: e */
    public final zzfie f15599e;

    /* JADX INFO: renamed from: f */
    public final VersionInfoParcel f15600f;

    /* JADX INFO: renamed from: g */
    public final FrameLayout f15601g;

    /* JADX INFO: renamed from: h */
    public final zzfqt f15602h;

    /* JADX INFO: renamed from: i */
    public final zzflf f15603i;

    /* JADX INFO: renamed from: j */
    public ListenableFuture f15604j;

    public zzffv(Context context, Executor executor, zzcnq zzcnqVar, zzfie zzfieVar, zzfgm zzfgmVar, zzflf zzflfVar, VersionInfoParcel versionInfoParcel) {
        this.f15595a = context;
        this.f15596b = executor;
        this.f15597c = zzcnqVar;
        this.f15599e = zzfieVar;
        this.f15598d = zzfgmVar;
        this.f15603i = zzflfVar;
        this.f15600f = versionInfoParcel;
        this.f15601g = new FrameLayout(context);
        this.f15602h = zzcnqVar.mo5680A();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX INFO: renamed from: a */
    public final synchronized boolean m6432a(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzety zzetyVar, zzetz zzetzVar) throws Throwable {
        Throwable th;
        boolean z;
        zzfqq zzfqqVar;
        zzcvc zzcvcVar;
        try {
            try {
                if (!zzmVar.m2976H()) {
                    if (((Boolean) zzbkv.f9042d.m5057c()).booleanValue()) {
                        try {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8049Cc)).booleanValue()) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        z = false;
                    }
                    if (this.f15600f.f3398u < ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8066Dc)).intValue() || !z) {
                        Preconditions.m3540d("loadAd must be called on the main UI thread.");
                    }
                }
                if (str == null) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3070c("Ad unit ID should not be null for app open ad.");
                    this.f15596b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffu
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f15594s.f15598d.mo5830v(zzfmi.m6535d(6, null, null));
                        }
                    });
                    return false;
                }
                if (this.f15604j != null) {
                    return false;
                }
                zzbio zzbioVar = zzbix.f8508e3;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                    com.google.android.gms.ads.internal.client.zzay.m2812a();
                }
                if (!((Boolean) zzbkq.f9009c.m5057c()).booleanValue() || (zzcvcVar = (zzcvc) this.f15599e.mo6449d()) == null) {
                    zzfqqVar = null;
                } else {
                    zzfqq zzfqqVarMo5744d = zzcvcVar.mo5744d();
                    zzfqqVarMo5744d.m6586i(7);
                    zzfqqVarMo5744d.m6580c(zzmVar.f3213H);
                    zzfqqVarMo5744d.m6581d(zzmVar.f3210E);
                    zzfqqVar = zzfqqVarMo5744d;
                }
                Context context = this.f15595a;
                boolean z2 = zzmVar.f3232x;
                zzfmd.m6527b(context, z2);
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8616ka)).booleanValue() && z2) {
                    this.f15597c.mo5707z().m6163b(true);
                }
                Pair pair = new Pair("api-call", Long.valueOf(zzmVar.f3223R));
                com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                Bundle bundleM6101a = zzdze.m6101a(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
                zzflf zzflfVar = this.f15603i;
                zzflfVar.f16015c = str;
                zzflfVar.f16014b = com.google.android.gms.ads.internal.client.zzr.m2980H();
                zzflfVar.f16013a = zzmVar;
                zzflfVar.f16032t = bundleM6101a;
                zzflg zzflgVarM6485a = zzflfVar.m6485a();
                zzfqg zzfqgVarM6561k = zzfqg.m6561k(context, zzfqp.m6576b(zzflgVarM6485a), 7, zzmVar);
                zzffs zzffsVar = new zzffs();
                zzffsVar.f15592a = zzflgVarM6485a;
                ListenableFuture listenableFutureMo6447a = this.f15599e.mo6447a(new zzfif(zzffsVar, null), new zzfid() { // from class: com.google.android.gms.internal.ads.zzfft
                    @Override // com.google.android.gms.internal.ads.zzfid
                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ zzdcg mo6431a(zzfic zzficVar) {
                        return this.f15593a.m6434c(zzficVar);
                    }
                });
                this.f15604j = listenableFutureMo6447a;
                listenableFutureMo6447a.addListener(new zzhcd(listenableFutureMo6447a, new zzffr(this, zzetzVar, zzfqqVar, zzfqgVarM6561k, zzffsVar)), this.f15596b);
                return true;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public abstract zzcvf mo6433b(zzdcj zzdcjVar, zzdiz zzdizVar);

    /* JADX INFO: renamed from: c */
    public final synchronized zzdcg m6434c(zzfic zzficVar) {
        zzffs zzffsVar = (zzffs) zzficVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8717q9)).booleanValue()) {
            zzdci zzdciVar = new zzdci();
            zzdciVar.f12021a = this.f15595a;
            zzdciVar.f12022b = zzffsVar.f15592a;
            zzdcj zzdcjVar = new zzdcj(zzdciVar);
            zzdiy zzdiyVar = new zzdiy();
            zzfgm zzfgmVar = this.f15598d;
            Executor executor = this.f15596b;
            zzdiyVar.f12234l.add(new zzdky(zzfgmVar, executor));
            zzdiyVar.m5927c(zzfgmVar, executor);
            return mo6433b(zzdcjVar, new zzdiz(zzdiyVar));
        }
        zzfgm zzfgmVar2 = this.f15598d;
        zzfgm zzfgmVar3 = new zzfgm(zzfgmVar2.f15623s);
        zzfgmVar3.f15622A = zzfgmVar2;
        zzdiy zzdiyVar2 = new zzdiy();
        Executor executor2 = this.f15596b;
        zzdiyVar2.m5925a(zzfgmVar3, executor2);
        zzdiyVar2.f12229g.add(new zzdky(zzfgmVar3, executor2));
        zzdiyVar2.f12236n.add(new zzdky(zzfgmVar3, executor2));
        zzdiyVar2.f12235m.add(new zzdky(zzfgmVar3, executor2));
        zzdiyVar2.f12234l.add(new zzdky(zzfgmVar3, executor2));
        zzdiyVar2.m5927c(zzfgmVar3, executor2);
        zzdiyVar2.f12237o = zzfgmVar3;
        zzdci zzdciVar2 = new zzdci();
        zzdciVar2.f12021a = this.f15595a;
        zzdciVar2.f12022b = zzffsVar.f15592a;
        return mo6433b(new zzdcj(zzdciVar2), new zzdiz(zzdiyVar2));
    }
}
