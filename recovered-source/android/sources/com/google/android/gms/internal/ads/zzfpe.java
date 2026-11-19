package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfpe implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzfoz f16229a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzfpj f16230b;

    public zzfpe(zzfpj zzfpjVar, zzfoz zzfozVar) {
        this.f16229a = zzfozVar;
        this.f16230b = zzfpjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        zzfpr zzfprVar = (zzfpr) this.f16230b.f16240f.f16244c;
        final zzfoz zzfozVar = this.f16229a;
        zzfprVar.m5923J0(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzfpp
            @Override // com.google.android.gms.internal.ads.zzdiw
            /* JADX INFO: renamed from: b */
            public final void mo5900b(Object obj2) {
                zzfoz zzfozVar2 = zzfozVar;
                ((zzfpt) obj2).mo6090e((zzfpm) zzfozVar2.f16219s, zzfozVar2.f16220t);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(final Throwable th) {
        zzfpr zzfprVar = (zzfpr) this.f16230b.f16240f.f16244c;
        final zzfoz zzfozVar = this.f16229a;
        zzfprVar.m5923J0(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzfpo
            @Override // com.google.android.gms.internal.ads.zzdiw
            /* JADX INFO: renamed from: b */
            public final void mo5900b(Object obj) {
                zzfoz zzfozVar2 = zzfozVar;
                ((zzfpt) obj).mo6093t((zzfpm) zzfozVar2.f16219s, zzfozVar2.f16220t, th);
            }
        });
    }
}
