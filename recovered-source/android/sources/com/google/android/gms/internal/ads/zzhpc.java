package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhpc {

    /* JADX INFO: renamed from: a */
    public static final zzhns f19099a = new zzhnq(zzhox.class, zzhou.class, new zzhnr() { // from class: com.google.android.gms.internal.ads.zzhoy
        @Override // com.google.android.gms.internal.ads.zzhnr
        /* JADX INFO: renamed from: a */
        public final Object mo7428a(zzhdz zzhdzVar) throws GeneralSecurityException {
            zzhqa zzhqaVar = new zzhqa();
            if (zzhle.m7504a(2)) {
                return zzhqaVar;
            }
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
    });

    /* JADX INFO: renamed from: b */
    public static final zzhns f19100b = new zzhnq(zzhox.class, zzhep.class, new zzhnr() { // from class: com.google.android.gms.internal.ads.zzhpb
        @Override // com.google.android.gms.internal.ads.zzhnr
        /* JADX INFO: renamed from: a */
        public final Object mo7428a(zzhdz zzhdzVar) {
            return new zziba((zzhox) zzhdzVar);
        }
    });

    /* JADX INFO: renamed from: c */
    public static final zzhmj f19101c;

    /* JADX INFO: renamed from: d */
    public static final zzhmw f19102d;

    /* JADX INFO: renamed from: e */
    public static final zzhma f19103e;

    /* JADX INFO: renamed from: f */
    public static final int f19104f;

    static {
        zzhsu.m7768J();
        f19101c = new zzhmj("type.googleapis.com/google.crypto.tink.HmacKey", zzhep.class, zzhta.SYMMETRIC);
        f19102d = new zzhmw() { // from class: com.google.android.gms.internal.ads.zzhpa
        };
        f19103e = new zzhma() { // from class: com.google.android.gms.internal.ads.zzhoz
            @Override // com.google.android.gms.internal.ads.zzhma
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7431a(zzheq zzheqVar, Integer num) {
                zzhpg zzhpgVar = (zzhpg) zzheqVar;
                zzhns zzhnsVar = zzhpc.f19099a;
                zzhow zzhowVar = new zzhow(0);
                zzhowVar.f19084a = zzhpgVar;
                zzhowVar.f19085b = zzibm.m8052a(zzhpgVar.f19120a);
                zzhowVar.f19086c = num;
                return zzhowVar.m7605a();
            }
        };
        f19104f = 2;
    }
}
