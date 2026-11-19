package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzfjw implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzetz f15821a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzfqq f15822b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzfqg f15823c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzfjz f15824d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzfka f15825e;

    public zzfjw(zzfka zzfkaVar, zzetz zzetzVar, zzfqq zzfqqVar, zzfqg zzfqgVar, zzfjz zzfjzVar) {
        this.f15821a = zzetzVar;
        this.f15822b = zzfqqVar;
        this.f15823c = zzfqgVar;
        this.f15824d = zzfjzVar;
        this.f15825e = zzfkaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        zzfqq zzfqqVar;
        zzfka zzfkaVar = this.f15825e;
        zzdvu zzdvuVar = (zzdvu) obj;
        synchronized (zzfkaVar) {
            if (zzdvuVar != null) {
                try {
                    zzdvuVar.m5868b();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzdvuVar.f11765g.f12193s.f12167a.f12197w = zzfkaVar.f15832d;
            this.f15821a.mo6334a(zzdvuVar);
            Executor executor = zzfkaVar.f15830b;
            final zzfjr zzfjrVar = zzfkaVar.f15832d;
            Objects.requireNonNull(zzfjrVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfju
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfjrVar.mo5833c();
                }
            });
            zzfkaVar.f15832d.mo3359g();
            if (!((Boolean) zzbkq.f9009c.m5057c()).booleanValue() || (zzfqqVar = this.f15822b) == null) {
                zzfqt zzfqtVar = zzfkaVar.f15835g;
                zzfqg zzfqgVar = this.f15823c;
                zzfqgVar.mo6567i(zzdvuVar.f11759a.f16006b);
                zzfqgVar.mo6571p0(zzdvuVar.f11764f.f12046s);
                zzfqgVar.mo6563L(true);
                zzfqtVar.m6588b(zzfqgVar.mo6564e());
            } else {
                zzfqqVar.m6582e(zzdvuVar.f11759a.f16006b);
                zzfqqVar.m6584g(zzdvuVar.f11764f.f12046s);
                zzfqg zzfqgVar2 = this.f15823c;
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
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8145I6)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.m3151l("Rewarded ad failed to load", th);
        }
        zzfka zzfkaVar = this.f15825e;
        zzdvz zzdvzVar = (zzdvz) zzfkaVar.f15833e.mo6449d();
        final com.google.android.gms.ads.internal.client.zze zzeVarM6533b = zzdvzVar == null ? zzfmi.m6533b(th, null) : zzfmi.m6533b(th, ((zzcqi) zzdvzVar).zza().f11819l);
        synchronized (zzfkaVar) {
            try {
                if (zzdvzVar != null) {
                    zzdvzVar.mo5794a().mo5830v(zzeVarM6533b);
                    zzfkaVar.f15830b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfjv
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f15819s.f15825e.f15832d.mo5830v(zzeVarM6533b);
                        }
                    });
                } else {
                    zzfkaVar.f15832d.mo5830v(zzeVarM6533b);
                    ((zzcqi) ((zzcqh) zzfkaVar.m6470b(this.f15824d)).zzh()).zza().f11813f.mo5882j();
                }
                zzfmd.m6526a(zzeVarM6533b.f3106s, th, "RewardedAdLoader.onFailure");
                this.f15821a.zza();
                if (!((Boolean) zzbkq.f9009c.m5057c()).booleanValue() || (zzfqqVar = this.f15822b) == null) {
                    zzfqt zzfqtVar = zzfkaVar.f15835g;
                    zzfqg zzfqgVar = this.f15823c;
                    zzfqgVar.mo6568j(zzeVarM6533b);
                    zzfqgVar.mo6566h(th);
                    zzfqgVar.mo6563L(false);
                    zzfqtVar.m6588b(zzfqgVar.mo6564e());
                } else {
                    zzfqqVar.m6583f(zzeVarM6533b);
                    zzfqg zzfqgVar2 = this.f15823c;
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
