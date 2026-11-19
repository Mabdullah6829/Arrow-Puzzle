package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfio implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzetz f15756a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzfqq f15757b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzfqg f15758c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzdno f15759d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzfiq f15760e;

    public zzfio(zzfiq zzfiqVar, zzetz zzetzVar, zzfqq zzfqqVar, zzfqg zzfqgVar, zzdno zzdnoVar) {
        this.f15756a = zzetzVar;
        this.f15757b = zzfqqVar;
        this.f15758c = zzfqgVar;
        this.f15759d = zzdnoVar;
        this.f15760e = zzfiqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        zzfqq zzfqqVar;
        zzfiq zzfiqVar = this.f15760e;
        zzdmh zzdmhVar = (zzdmh) obj;
        synchronized (zzfiqVar) {
            if (zzdmhVar != null) {
                try {
                    zzdmhVar.m5868b();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzfiqVar.f15770i = null;
            zzbio zzbioVar = zzbix.f8734r9;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                zzdgp zzdgpVar = zzdmhVar.f11765g.f12193s;
                zzetk zzetkVar = zzfiqVar.f15765d;
                zzdhq zzdhqVar = zzdgpVar.f12167a;
                zzdhqVar.f12194t = zzetkVar;
                zzdhqVar.f12197w = zzfiqVar.f15766e;
            }
            this.f15756a.mo6334a(zzdmhVar);
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                zzfiqVar.f15763b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfin
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f15755s.f15760e.f15765d.mo5833c();
                    }
                });
                zzfiqVar.f15763b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfik
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f15750s.f15760e.f15766e.mo5833c();
                    }
                });
            }
            if (!((Boolean) zzbkq.f9009c.m5057c()).booleanValue() || (zzfqqVar = this.f15757b) == null) {
                zzfqt zzfqtVar = zzfiqVar.f15768g;
                zzfqg zzfqgVar = this.f15758c;
                zzfqgVar.mo6567i(zzdmhVar.f11759a.f16006b);
                zzfqgVar.mo6571p0(zzdmhVar.f11764f.f12046s);
                zzfqgVar.mo6563L(true);
                zzfqtVar.m6588b(zzfqgVar.mo6564e());
            } else {
                zzfqqVar.m6582e(zzdmhVar.f11759a.f16006b);
                zzfqqVar.m6584g(zzdmhVar.f11764f.f12046s);
                zzfqg zzfqgVar2 = this.f15758c;
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
            com.google.android.gms.ads.internal.util.zze.m3151l("Interstitial ad failed to load", th);
        }
        zzdno zzdnoVar = this.f15759d;
        final com.google.android.gms.ads.internal.client.zze zzeVarM6533b = zzfmi.m6533b(th, zzdnoVar.mo5775b().f11819l);
        zzfiq zzfiqVar = this.f15760e;
        synchronized (zzfiqVar) {
            try {
                zzfiqVar.f15770i = null;
                zzdnoVar.mo5774a().mo5830v(zzeVarM6533b);
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8734r9)).booleanValue()) {
                    zzfiqVar.f15763b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfil
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f15751s.f15760e.f15765d.mo5830v(zzeVarM6533b);
                        }
                    });
                    zzfiqVar.f15763b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfim
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f15753s.f15760e.f15766e.mo5830v(zzeVarM6533b);
                        }
                    });
                }
                zzfmd.m6526a(zzeVarM6533b.f3106s, th, "InterstitialAdLoader.onFailure");
                this.f15756a.zza();
                if (!((Boolean) zzbkq.f9009c.m5057c()).booleanValue() || (zzfqqVar = this.f15757b) == null) {
                    zzfqt zzfqtVar = zzfiqVar.f15768g;
                    zzfqg zzfqgVar = this.f15758c;
                    zzfqgVar.mo6568j(zzeVarM6533b);
                    zzfqgVar.mo6566h(th);
                    zzfqgVar.mo6563L(false);
                    zzfqtVar.m6588b(zzfqgVar.mo6564e());
                } else {
                    zzfqqVar.m6583f(zzeVarM6533b);
                    zzfqg zzfqgVar2 = this.f15758c;
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
