package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhoq {

    /* JADX INFO: renamed from: a */
    public static final zzhma f19068a = new zzhma() { // from class: com.google.android.gms.internal.ads.zzhop
        @Override // com.google.android.gms.internal.ads.zzhma
        /* JADX INFO: renamed from: a */
        public final zzhdz mo7431a(zzheq zzheqVar, Integer num) throws GeneralSecurityException {
            zzhot zzhotVar = (zzhot) zzheqVar;
            zzhma zzhmaVar = zzhoq.f19068a;
            int i2 = zzhotVar.f19080a;
            if (i2 != 32) {
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            }
            zzhol zzholVar = new zzhol(0);
            zzholVar.f19058a = zzhotVar;
            zzholVar.f19059b = zzibm.m8052a(i2);
            zzholVar.f19060c = num;
            return zzholVar.m7599a();
        }
    };

    /* JADX INFO: renamed from: b */
    public static final zzhns f19069b = new zzhnq(zzhom.class, zzhou.class, new zzhnr() { // from class: com.google.android.gms.internal.ads.zzhon
        @Override // com.google.android.gms.internal.ads.zzhnr
        /* JADX INFO: renamed from: a */
        public final Object mo7428a(zzhdz zzhdzVar) throws GeneralSecurityException {
            zzhom zzhomVar = (zzhom) zzhdzVar;
            zzhma zzhmaVar = zzhoq.f19068a;
            if (zzhomVar.f19061a.f19080a != 32) {
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            }
            if (!zzhle.m7504a(1)) {
                throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
            }
            Provider providerM7509a = zzhli.m7509a();
            if (providerM7509a != null) {
                try {
                    return zzhpy.m7614a(zzhomVar, providerM7509a);
                } catch (GeneralSecurityException unused) {
                }
            }
            return new zzhpz();
        }
    });

    /* JADX INFO: renamed from: c */
    public static final zzhns f19070c = new zzhnq(zzhom.class, zzhep.class, new zzhnr() { // from class: com.google.android.gms.internal.ads.zzhoo
        @Override // com.google.android.gms.internal.ads.zzhnr
        /* JADX INFO: renamed from: a */
        public final Object mo7428a(zzhdz zzhdzVar) throws GeneralSecurityException {
            zzhom zzhomVar = (zzhom) zzhdzVar;
            zzhma zzhmaVar = zzhoq.f19068a;
            if (zzhomVar.f19061a.f19080a == 32) {
                return new zziba(zzhomVar);
            }
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    });

    /* JADX INFO: renamed from: d */
    public static final zzhmj f19071d;

    static {
        zzhqv.m7620I();
        f19071d = new zzhmj("type.googleapis.com/google.crypto.tink.AesCmacKey", zzhep.class, zzhta.SYMMETRIC);
    }
}
