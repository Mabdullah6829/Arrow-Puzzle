package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfqm implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzfqq f16326a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzfqg f16327b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f16328c;

    public zzfqm(zzfqq zzfqqVar, zzfqg zzfqgVar, boolean z) {
        this.f16326a = zzfqqVar;
        this.f16327b = zzfqgVar;
        this.f16328c = z;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        zzfqg zzfqgVar = this.f16327b;
        zzfqgVar.mo6563L(true);
        zzfqq zzfqqVar = this.f16326a;
        zzfqqVar.m6578a(zzfqgVar);
        if (this.f16328c) {
            zzfqqVar.m6585h();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        zzfqg zzfqgVar = this.f16327b;
        if (zzfqgVar.zzb()) {
            zzfqgVar.mo6566h(th);
            zzfqgVar.mo6563L(false);
            zzfqq zzfqqVar = this.f16326a;
            zzfqqVar.m6578a(zzfqgVar);
            if (this.f16328c) {
                zzfqqVar.m6585h();
            }
        }
    }
}
