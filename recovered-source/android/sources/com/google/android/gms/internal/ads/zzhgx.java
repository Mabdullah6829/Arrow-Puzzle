package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhgx {

    /* JADX INFO: renamed from: a */
    public static final zzhns f18703a = new zzhnq(zzhgu.class, zzhdr.class, new zzhnr() { // from class: com.google.android.gms.internal.ads.zzhgw
        @Override // com.google.android.gms.internal.ads.zzhnr
        /* JADX INFO: renamed from: a */
        public final Object mo7428a(zzhdz zzhdzVar) throws GeneralSecurityException {
            zzhgu zzhguVar = (zzhgu) zzhdzVar;
            zzhns zzhnsVar = zzhgx.f18703a;
            try {
                zzhju.m7483b();
                Cipher cipherM7483b = zzhju.m7483b();
                zzibm zzibmVar = zzhguVar.f18698b;
                zzhey zzheyVar = zzhey.f18574a;
                return new zzhju(zzibmVar.f19616a.m8051b(), zzhguVar.f18699c.m8051b(), cipherM7483b.getProvider());
            } catch (GeneralSecurityException unused) {
                zzibm zzibmVar2 = zzhguVar.f18698b;
                zzhey zzheyVar2 = zzhey.f18574a;
                return new zzhzx(zzibmVar2.f19616a.m8051b(), zzhguVar.f18699c.m8051b());
            }
        }
    });

    /* JADX INFO: renamed from: b */
    public static final zzhma f18704b = new zzhma() { // from class: com.google.android.gms.internal.ads.zzhgv
        @Override // com.google.android.gms.internal.ads.zzhma
        /* JADX INFO: renamed from: a */
        public final zzhdz mo7431a(zzheq zzheqVar, Integer num) {
            zzhns zzhnsVar = zzhgx.f18703a;
            return zzhgu.m7453d(((zzhgz) zzheqVar).f18710a, zzibm.m8052a(32), num);
        }
    };

    /* JADX INFO: renamed from: c */
    public static final zzhmj f18705c;

    static {
        zzhrz.m7709H();
        f18705c = new zzhmj("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzhdr.class, zzhta.SYMMETRIC);
    }
}
