package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzeue implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzetz f14894a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzfqq f14895b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzfqg f14896c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzdok f14897d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzeuh f14898e;

    public zzeue(zzeuh zzeuhVar, zzetz zzetzVar, zzfqq zzfqqVar, zzfqg zzfqgVar, zzdok zzdokVar) {
        this.f14894a = zzetzVar;
        this.f14895b = zzfqqVar;
        this.f14896c = zzfqgVar;
        this.f14897d = zzdokVar;
        this.f14898e = zzeuhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        zzfqq zzfqqVar;
        zzeuh zzeuhVar = this.f14898e;
        zzcya zzcyaVar = (zzcya) obj;
        synchronized (zzeuhVar) {
            if (zzcyaVar != null) {
                try {
                    zzcyaVar.m5868b();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzcyaVar.f11765g.f12193s.f12167a.f12194t = zzeuhVar.f14904d.f14881b;
            ((zzetu) this.f14894a).mo6334a(zzcyaVar);
            zzeuhVar.f14902b.mo5688g().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeud
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14893s.f14898e.f14904d.f14881b.mo5833c();
                }
            });
            if (!((Boolean) zzbkq.f9009c.m5057c()).booleanValue() || (zzfqqVar = this.f14895b) == null) {
                zzfqt zzfqtVar = zzeuhVar.f14905e;
                zzfqg zzfqgVar = this.f14896c;
                zzfqgVar.mo6567i(zzcyaVar.f11759a.f16006b);
                zzfqgVar.mo6571p0(zzcyaVar.f11764f.f12046s);
                zzfqgVar.mo6563L(true);
                zzfqtVar.m6588b(zzfqgVar.mo6564e());
            } else {
                zzfqqVar.m6582e(zzcyaVar.f11759a.f16006b);
                zzfqqVar.m6584g(zzcyaVar.f11764f.f12046s);
                zzfqg zzfqgVar2 = this.f14896c;
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
            com.google.android.gms.ads.internal.util.zze.m3151l("Native ad failed to load", th);
        }
        zzdok zzdokVar = this.f14897d;
        final com.google.android.gms.ads.internal.client.zze zzeVarM6533b = zzfmi.m6533b(th, zzdokVar.mo5725a().f11819l);
        zzdokVar.mo5726b().mo5830v(zzeVarM6533b);
        zzeuh zzeuhVar = this.f14898e;
        zzeuhVar.f14902b.mo5688g().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeuc
            @Override // java.lang.Runnable
            public final void run() {
                ((zzetw) this.f14891s.f14898e.f14904d.f14882c).mo5830v(zzeVarM6533b);
            }
        });
        zzfmd.m6526a(zzeVarM6533b.f3106s, th, "NativeAdLoader.onFailure");
        ((zzetu) this.f14894a).zza();
        boolean zBooleanValue = ((Boolean) zzbkq.f9009c.m5057c()).booleanValue();
        zzfqg zzfqgVar = this.f14896c;
        if (!zBooleanValue || (zzfqqVar = this.f14895b) == null) {
            zzfqt zzfqtVar = zzeuhVar.f14905e;
            zzfqgVar.mo6568j(zzeVarM6533b);
            zzfqgVar.mo6566h(th);
            zzfqgVar.mo6563L(false);
            zzfqtVar.m6588b(zzfqgVar.mo6564e());
            return;
        }
        zzfqqVar.m6583f(zzeVarM6533b);
        zzfqgVar.mo6566h(th);
        zzfqgVar.mo6563L(false);
        zzfqqVar.m6578a(zzfqgVar);
        zzfqqVar.m6585h();
    }
}
