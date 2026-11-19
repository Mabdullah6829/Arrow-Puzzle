package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhgh {

    /* JADX INFO: renamed from: a */
    public static final zzhns f18660a = new zzhnq(zzhgd.class, zzhdr.class, new zzhnr() { // from class: com.google.android.gms.internal.ads.zzhge
        @Override // com.google.android.gms.internal.ads.zzhnr
        /* JADX INFO: renamed from: a */
        public final Object mo7428a(zzhdz zzhdzVar) {
            zzhgd zzhgdVar = (zzhgd) zzhdzVar;
            zzhgdVar.getClass();
            zzibm zzibmVar = zzhgdVar.f18654b;
            zzhey zzheyVar = zzhey.f18574a;
            return new zzhzs(zzibmVar.f19616a.m8051b(), zzhgdVar.f18655c);
        }
    });

    /* JADX INFO: renamed from: b */
    public static final zzhmj f18661b;

    /* JADX INFO: renamed from: c */
    public static final zzhmw f18662c;

    /* JADX INFO: renamed from: d */
    public static final zzhma f18663d;

    /* JADX INFO: renamed from: e */
    public static final int f18664e;

    static {
        zzhrr.m7687H();
        f18661b = new zzhmj("type.googleapis.com/google.crypto.tink.AesGcmKey", zzhdr.class, zzhta.SYMMETRIC);
        f18662c = new zzhmw() { // from class: com.google.android.gms.internal.ads.zzhgg
        };
        f18663d = new zzhma() { // from class: com.google.android.gms.internal.ads.zzhgf
            @Override // com.google.android.gms.internal.ads.zzhma
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7431a(zzheq zzheqVar, Integer num) throws GeneralSecurityException {
                zzhgk zzhgkVar = (zzhgk) zzheqVar;
                zzhns zzhnsVar = zzhgh.f18660a;
                int i2 = zzhgkVar.f18673a;
                if (i2 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                zzhgc zzhgcVar = new zzhgc(0);
                zzhgcVar.f18650a = zzhgkVar;
                zzhgcVar.f18652c = num;
                zzhgcVar.f18651b = zzibm.m8052a(i2);
                return zzhgcVar.m7445a();
            }
        };
        f18664e = 2;
    }
}
