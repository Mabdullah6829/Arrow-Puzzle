package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzffr implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzetz f15587a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzfqq f15588b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzfqg f15589c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzffs f15590d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzffv f15591e;

    public zzffr(zzffv zzffvVar, zzetz zzetzVar, zzfqq zzfqqVar, zzfqg zzfqgVar, zzffs zzffsVar) {
        this.f15587a = zzetzVar;
        this.f15588b = zzfqqVar;
        this.f15589c = zzfqgVar;
        this.f15590d = zzffsVar;
        this.f15591e = zzffvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        zzfqq zzfqqVar;
        zzffv zzffvVar = this.f15591e;
        zzcya zzcyaVar = (zzcya) obj;
        synchronized (zzffvVar) {
            if (zzcyaVar != null) {
                try {
                    zzcyaVar.m5868b();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzffvVar.f15604j = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8717q9)).booleanValue()) {
                zzcyaVar.f11765g.f12193s.f12167a.f12196v = zzffvVar.f15598d;
            }
            this.f15587a.mo6334a(zzcyaVar);
            if (!((Boolean) zzbkq.f9009c.m5057c()).booleanValue() || (zzfqqVar = this.f15588b) == null) {
                zzfqt zzfqtVar = zzffvVar.f15602h;
                zzfqg zzfqgVar = this.f15589c;
                zzfqgVar.mo6567i(zzcyaVar.f11759a.f16006b);
                zzfqgVar.mo6571p0(zzcyaVar.f11764f.f12046s);
                zzfqgVar.mo6563L(true);
                zzfqtVar.m6588b(zzfqgVar.mo6564e());
            } else {
                zzfqqVar.m6582e(zzcyaVar.f11759a.f16006b);
                zzfqqVar.m6584g(zzcyaVar.f11764f.f12046s);
                zzfqg zzfqgVar2 = this.f15589c;
                zzfqgVar2.mo6563L(true);
                zzfqqVar.m6578a(zzfqgVar2);
                zzfqqVar.m6585h();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        zzfqq zzfqqVar;
        zzbio zzbioVar = zzbix.f8145I6;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.m3151l("App open ad failed to load", th);
        }
        zzffv zzffvVar = this.f15591e;
        zzcvc zzcvcVar = (zzcvc) zzffvVar.f15599e.mo6449d();
        final com.google.android.gms.ads.internal.client.zze zzeVarM6533b = zzcvcVar == null ? zzfmi.m6533b(th, null) : zzfmi.m6533b(th, zzcvcVar.zza().f11819l);
        synchronized (zzffvVar) {
            try {
                zzffvVar.f15604j = null;
                if (zzcvcVar != null) {
                    zzcvcVar.mo5742a().mo5830v(zzeVarM6533b);
                    if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8717q9)).booleanValue()) {
                        zzffvVar.f15596b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffq
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.f15585s.f15591e.f15598d.mo5830v(zzeVarM6533b);
                            }
                        });
                    }
                } else {
                    zzffvVar.f15598d.mo5830v(zzeVarM6533b);
                    ((zzcvc) zzffvVar.m6434c(this.f15590d).zzh()).zza().f11813f.mo5882j();
                }
                zzfmd.m6526a(zzeVarM6533b.f3106s, th, "AppOpenAdLoader.onFailure");
                this.f15587a.zza();
                if (!((Boolean) zzbkq.f9009c.m5057c()).booleanValue() || (zzfqqVar = this.f15588b) == null) {
                    zzfqt zzfqtVar = zzffvVar.f15602h;
                    zzfqg zzfqgVar = this.f15589c;
                    zzfqgVar.mo6568j(zzeVarM6533b);
                    zzfqgVar.mo6566h(th);
                    zzfqgVar.mo6563L(false);
                    zzfqtVar.m6588b(zzfqgVar.mo6564e());
                } else {
                    zzfqqVar.m6583f(zzeVarM6533b);
                    zzfqg zzfqgVar2 = this.f15589c;
                    zzfqgVar2.mo6566h(th);
                    zzfqgVar2.mo6563L(false);
                    zzfqqVar.m6578a(zzfqgVar2);
                    zzfqqVar.m6585h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
