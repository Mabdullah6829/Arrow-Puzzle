package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhit {

    /* JADX INFO: renamed from: a */
    public static final zzhns f18814a = new zzhnq(zzhip.class, zzhdr.class, new zzhnr() { // from class: com.google.android.gms.internal.ads.zzhis
        @Override // com.google.android.gms.internal.ads.zzhnr
        /* JADX INFO: renamed from: a */
        public final Object mo7428a(zzhdz zzhdzVar) throws GeneralSecurityException {
            zzhip zzhipVar = (zzhip) zzhdzVar;
            zzhns zzhnsVar = zzhit.f18814a;
            try {
                zzhju.m7483b();
                Cipher cipherM7483b = zzhju.m7483b();
                zzibm zzibmVar = zzhipVar.f18808b;
                zzhey zzheyVar = zzhey.f18574a;
                return new zzhks(zzibmVar.f19616a.m8051b(), zzhipVar.f18809c.m8051b(), cipherM7483b.getProvider());
            } catch (GeneralSecurityException unused) {
                zzibm zzibmVar2 = zzhipVar.f18808b;
                zzhey zzheyVar2 = zzhey.f18574a;
                return new zzibj(zzibmVar2.f19616a.m8051b(), zzhipVar.f18809c.m8051b());
            }
        }
    });

    /* JADX INFO: renamed from: b */
    public static final zzhmj f18815b;

    /* JADX INFO: renamed from: c */
    public static final zzhmw f18816c;

    /* JADX INFO: renamed from: d */
    public static final zzhma f18817d;

    static {
        zzhux.m7969H();
        f18815b = new zzhmj("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzhdr.class, zzhta.SYMMETRIC);
        f18816c = new zzhmw() { // from class: com.google.android.gms.internal.ads.zzhiq
        };
        f18817d = new zzhma() { // from class: com.google.android.gms.internal.ads.zzhir
            @Override // com.google.android.gms.internal.ads.zzhma
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7431a(zzheq zzheqVar, Integer num) {
                zzhns zzhnsVar = zzhit.f18814a;
                return zzhip.m7467d(((zzhiv) zzheqVar).f18822a, zzibm.m8052a(32), num);
            }
        };
    }
}
