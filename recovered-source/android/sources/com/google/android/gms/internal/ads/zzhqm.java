package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhqm extends zzhqp {

    /* JADX INFO: renamed from: a */
    public final zzhqn f19153a;

    /* JADX INFO: renamed from: b */
    public final zzibm f19154b;

    public zzhqm(zzhqn zzhqnVar, zzibm zzibmVar) {
        this.f19153a = zzhqnVar;
        this.f19154b = zzibmVar;
    }

    /* JADX INFO: renamed from: c */
    public static zzhqm m7615c(zzhqn zzhqnVar, zzibm zzibmVar) throws GeneralSecurityException {
        if (zzhqnVar.f19155a == zzibmVar.f19616a.f19614a.length) {
            return new zzhqm(zzhqnVar, zzibmVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // com.google.android.gms.internal.ads.zzhqp, com.google.android.gms.internal.ads.zzhdz
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzheq mo7405a() {
        return this.f19153a;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    /* JADX INFO: renamed from: b */
    public final Integer mo7406b() {
        return null;
    }
}
