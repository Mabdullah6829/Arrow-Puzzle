package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzhew implements zzhdw {
    @Override // com.google.android.gms.internal.ads.zzhdw
    /* JADX INFO: renamed from: a */
    public final Object mo7402a(zzhek zzhekVar, Class cls) throws GeneralSecurityException {
        zzhnw zzhnwVar = (zzhnw) zzhnb.f19001b.f19002a.get();
        HashMap map = zzhnwVar.f19029b;
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        zzhny zzhnyVar = (zzhny) map.get(cls);
        return zzhnyVar.mo7429a(zzhekVar, new zzhnv(zzhnwVar, zzhnyVar));
    }
}
