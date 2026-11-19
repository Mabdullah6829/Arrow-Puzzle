package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhfy {

    /* JADX INFO: renamed from: a */
    public static final zzhns f18636a = new zzhnq(zzhfv.class, zzhdr.class, new zzhnr() { // from class: com.google.android.gms.internal.ads.zzhfw
        @Override // com.google.android.gms.internal.ads.zzhnr
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object mo7428a(zzhdz zzhdzVar) {
            return zzhzr.m8020b((zzhfv) zzhdzVar);
        }
    });

    /* JADX INFO: renamed from: b */
    public static final zzhmj f18637b;

    /* JADX INFO: renamed from: c */
    public static final zzhma f18638c;

    static {
        zzhrl.m7669I();
        f18637b = new zzhmj("type.googleapis.com/google.crypto.tink.AesEaxKey", zzhdr.class, zzhta.SYMMETRIC);
        f18638c = new zzhma() { // from class: com.google.android.gms.internal.ads.zzhfx
            @Override // com.google.android.gms.internal.ads.zzhma
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7431a(zzheq zzheqVar, Integer num) throws GeneralSecurityException {
                zzhgb zzhgbVar = (zzhgb) zzheqVar;
                zzhns zzhnsVar = zzhfy.f18636a;
                int i2 = zzhgbVar.f18647a;
                if (i2 == 24) {
                    throw new GeneralSecurityException("192 bit AES EAX Parameters are not valid");
                }
                zzhfu zzhfuVar = new zzhfu(0);
                zzhfuVar.f18627a = zzhgbVar;
                zzhfuVar.f18629c = num;
                zzhfuVar.f18628b = zzibm.m8052a(i2);
                return zzhfuVar.m7437a();
            }
        };
    }
}
