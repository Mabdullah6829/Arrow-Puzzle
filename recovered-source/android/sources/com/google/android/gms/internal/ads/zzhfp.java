package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhfp {

    /* JADX INFO: renamed from: a */
    public static final zzhns f18600a = new zzhnq(zzhfl.class, zzhdr.class, new zzhnr() { // from class: com.google.android.gms.internal.ads.zzhfo
        @Override // com.google.android.gms.internal.ads.zzhnr
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object mo7428a(zzhdz zzhdzVar) {
            return zziaf.m8037b((zzhfl) zzhdzVar);
        }
    });

    /* JADX INFO: renamed from: b */
    public static final zzhmj f18601b;

    /* JADX INFO: renamed from: c */
    public static final zzhmw f18602c;

    /* JADX INFO: renamed from: d */
    public static final zzhma f18603d;

    /* JADX INFO: renamed from: e */
    public static final int f18604e;

    static {
        zzhrb.m7638I();
        f18601b = new zzhmj("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzhdr.class, zzhta.SYMMETRIC);
        f18602c = new zzhmw() { // from class: com.google.android.gms.internal.ads.zzhfn
        };
        f18603d = new zzhma() { // from class: com.google.android.gms.internal.ads.zzhfm
            @Override // com.google.android.gms.internal.ads.zzhma
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7431a(zzheq zzheqVar, Integer num) throws GeneralSecurityException {
                zzhft zzhftVar = (zzhft) zzheqVar;
                zzhns zzhnsVar = zzhfp.f18600a;
                int i2 = zzhftVar.f18621a;
                if (i2 != 16 && i2 != 32) {
                    throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
                }
                zzhfk zzhfkVar = new zzhfk(0);
                zzhfkVar.f18588a = zzhftVar;
                zzhfkVar.f18591d = num;
                zzhfkVar.f18589b = zzibm.m8052a(i2);
                zzhfkVar.f18590c = zzibm.m8052a(zzhftVar.f18622b);
                return zzhfkVar.m7430a();
            }
        };
        f18604e = 2;
    }
}
