package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfgw implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzfqq f15659a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzfqg f15660b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzcwx f15661c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzfha f15662d;

    public zzfgw(zzfha zzfhaVar, zzfqq zzfqqVar, zzfqg zzfqgVar, zzcwx zzcwxVar) {
        this.f15659a = zzfqqVar;
        this.f15660b = zzfqgVar;
        this.f15661c = zzcwxVar;
        this.f15662d = zzfhaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        zzfqq zzfqqVar;
        zzfha zzfhaVar = this.f15662d;
        zzcvs zzcvsVar = (zzcvs) obj;
        synchronized (zzfhaVar) {
            if (zzcvsVar != null) {
                try {
                    zzcvsVar.m5868b();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (zzfhaVar.f15681m) {
                zzfhaVar.m6444c();
            }
            if (!((Boolean) zzbkq.f9009c.m5057c()).booleanValue() || (zzfqqVar = this.f15659a) == null) {
                zzfqt zzfqtVar = zzfhaVar.f15677i;
                zzfqg zzfqgVar = this.f15660b;
                zzfqgVar.mo6567i(zzcvsVar.f11759a.f16006b);
                zzfqgVar.mo6571p0(zzcvsVar.f11764f.f12046s);
                zzfqgVar.mo6563L(true);
                zzfqtVar.m6588b(zzfqgVar.mo6564e());
            } else {
                zzfqqVar.m6582e(zzcvsVar.f11759a.f16006b);
                zzfqqVar.m6584g(zzcvsVar.f11764f.f12046s);
                zzfqg zzfqgVar2 = this.f15660b;
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
        int i2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8145I6)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.m3151l("Banner ad failed to load", th);
        }
        zzfha zzfhaVar = this.f15662d;
        synchronized (zzfhaVar) {
            zzcwx zzcwxVar = this.f15661c;
            com.google.android.gms.ads.internal.client.zze zzeVarM6533b = zzfmi.m6533b(th, zzcwxVar.mo5754b().f11819l);
            zzfhaVar.f15682n = zzeVarM6533b;
            zzcwxVar.mo5753a().mo5830v(zzeVarM6533b);
            zzfmd.m6526a(zzeVarM6533b.f3106s, th, "BannerAdLoader.onFailure");
            if (zzfhaVar.f15681m) {
                zzfhaVar.m6446e();
                zzdga zzdgaVar = zzfhaVar.f15676h;
                zzdif zzdifVar = zzfhaVar.f15678j;
                synchronized (zzdifVar) {
                    i2 = zzdifVar.f12208s;
                }
                zzdgaVar.m5916K0(i2);
            }
            if (!((Boolean) zzbkq.f9009c.m5057c()).booleanValue() || (zzfqqVar = this.f15659a) == null) {
                zzfqt zzfqtVar = zzfhaVar.f15677i;
                zzfqg zzfqgVar = this.f15660b;
                zzfqgVar.mo6568j(zzeVarM6533b);
                zzfqgVar.mo6566h(th);
                zzfqgVar.mo6563L(false);
                zzfqtVar.m6588b(zzfqgVar.mo6564e());
            } else {
                zzfqqVar.m6583f(zzeVarM6533b);
                zzfqg zzfqgVar2 = this.f15660b;
                zzfqgVar2.mo6566h(th);
                zzfqgVar2.mo6563L(false);
                zzfqqVar.m6578a(zzfqgVar2);
                zzfqqVar.m6585h();
            }
        }
    }
}
