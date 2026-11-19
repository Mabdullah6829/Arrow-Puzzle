package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public final class zziax implements zzhqo {
    /* JADX INFO: renamed from: b */
    public static zzhqo m8040b(zzhqm zzhqmVar) {
        zzibm zzibmVar = zzhqmVar.f19154b;
        zzhey zzheyVar = zzhey.f18574a;
        zzhqs zzhqsVar = new zzhqs(zzibmVar.f19616a.m8051b());
        try {
            Provider providerM7509a = zzhli.m7509a();
            if (providerM7509a == null) {
                throw new GeneralSecurityException("Conscrypt not available");
            }
            Mac.getInstance("AESCMAC", providerM7509a);
            return new zziaw(zzhqsVar, new zzhqt(zzibmVar.f19616a.m8051b(), providerM7509a));
        } catch (GeneralSecurityException unused) {
            return zzhqsVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhqo
    /* JADX INFO: renamed from: a */
    public final byte[] mo7617a(int i2, byte[] bArr) {
        throw null;
    }
}
