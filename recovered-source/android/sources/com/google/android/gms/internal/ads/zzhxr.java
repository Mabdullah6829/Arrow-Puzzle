package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhxr {

    /* JADX INFO: renamed from: a */
    public static final zzhns f19417a = new zzhnq(zzhxl.class, zzheu.class, new zzhnr() { // from class: com.google.android.gms.internal.ads.zzhxo
        @Override // com.google.android.gms.internal.ads.zzhnr
        /* JADX INFO: renamed from: a */
        public final Object mo7428a(zzhdz zzhdzVar) throws GeneralSecurityException {
            zzhxl zzhxlVar = (zzhxl) zzhdzVar;
            try {
                return zzhzg.m8016a(zzhxlVar);
            } catch (NoSuchProviderException unused) {
                KeyFactory keyFactory = (KeyFactory) zziak.f19577g.f19578a.zza("RSA");
                zzhxn zzhxnVar = zzhxlVar.f19400a;
                zzhxn zzhxnVar2 = zzhxlVar.f19400a;
                BigInteger bigInteger = zzhxnVar.f19411b;
                zzhxj zzhxjVar = zzhxnVar2.f19410a;
                zzhxj zzhxjVar2 = zzhxnVar2.f19410a;
                BigInteger bigInteger2 = zzhxjVar.f19388b;
                zzibl zziblVar = zzhxlVar.f19401b;
                zzhey zzheyVar = zzhey.f18574a;
                BigInteger bigInteger3 = zziblVar.f19615a;
                zzibl zziblVar2 = zzhxlVar.f19402c;
                zzhey zzheyVar2 = zzhey.f18574a;
                BigInteger bigInteger4 = zziblVar2.f19615a;
                zzibl zziblVar3 = zzhxlVar.f19403d;
                zzhey zzheyVar3 = zzhey.f18574a;
                BigInteger bigInteger5 = zziblVar3.f19615a;
                zzibl zziblVar4 = zzhxlVar.f19404e;
                zzhey zzheyVar4 = zzhey.f18574a;
                BigInteger bigInteger6 = zziblVar4.f19615a;
                zzibl zziblVar5 = zzhxlVar.f19405f;
                zzhey zzheyVar5 = zzhey.f18574a;
                BigInteger bigInteger7 = zziblVar5.f19615a;
                zzibl zziblVar6 = zzhxlVar.f19406g;
                zzhey zzheyVar6 = zzhey.f18574a;
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5, bigInteger6, bigInteger7, zziblVar6.f19615a));
                zzhlv zzhlvVar = zzibg.f19609a;
                zziat zziatVar = (zziat) zzhlvVar.m7540b(zzhxjVar2.f19390d);
                zziat zziatVar2 = (zziat) zzhlvVar.m7540b(zzhxjVar2.f19391e);
                zzhxnVar2.f19412c.m8051b();
                zzhxjVar2.f19389c.getClass();
                zzibd zzibdVar = new zzibd();
                if (zzhlf.m7505a()) {
                    throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
                }
                zzibi.m8046b(zziatVar);
                if (!zziatVar.equals(zziatVar2)) {
                    throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
                }
                zzibi.m8047c(rSAPrivateCrtKey.getModulus().bitLength());
                zzibi.m8048d(rSAPrivateCrtKey.getPublicExponent());
                return zzibdVar;
            }
        }
    });

    /* JADX INFO: renamed from: b */
    public static final zzhns f19418b = new zzhnq(zzhxn.class, zzhev.class, new zzhnr() { // from class: com.google.android.gms.internal.ads.zzhxq
        @Override // com.google.android.gms.internal.ads.zzhnr
        /* JADX INFO: renamed from: a */
        public final Object mo7428a(zzhdz zzhdzVar) {
            zzhxn zzhxnVar = (zzhxn) zzhdzVar;
            zzhlv zzhlvVar = zzibg.f19609a;
            try {
                return zzhzh.m8019d(zzhxnVar);
            } catch (NoSuchProviderException unused) {
                KeyFactory keyFactory = (KeyFactory) zziak.f19577g.f19578a.zza("RSA");
                BigInteger bigInteger = zzhxnVar.f19411b;
                zzhxj zzhxjVar = zzhxnVar.f19410a;
                RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, zzhxjVar.f19388b));
                zzhlv zzhlvVar2 = zzibg.f19609a;
                return new zzibf(rSAPublicKey, (zziat) zzhlvVar2.m7540b(zzhxjVar.f19390d), (zziat) zzhlvVar2.m7540b(zzhxjVar.f19391e), zzhxjVar.f19392f, zzhxnVar.f19412c.m8051b(), zzhxjVar.f19389c.equals(zzhxi.f19383d) ? zzibg.f19611c : zzibg.f19610b);
            }
        }
    });

    /* JADX INFO: renamed from: c */
    public static final zzher f19419c;

    /* JADX INFO: renamed from: d */
    public static final zzhmj f19420d;

    /* JADX INFO: renamed from: e */
    public static final zzhma f19421e;

    /* JADX INFO: renamed from: f */
    public static final int f19422f;

    static {
        zzhun.m7922N();
        f19419c = new zzhmi("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", zzheu.class, zzhta.ASYMMETRIC_PRIVATE);
        zzhup.m7942K();
        f19420d = new zzhmj("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", zzhev.class, zzhta.ASYMMETRIC_PUBLIC);
        f19421e = new zzhma() { // from class: com.google.android.gms.internal.ads.zzhxp
            @Override // com.google.android.gms.internal.ads.zzhma
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7431a(zzheq zzheqVar, Integer num) throws GeneralSecurityException {
                zzhxj zzhxjVar = (zzhxj) zzheqVar;
                zzhns zzhnsVar = zzhxr.f19417a;
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zziak.f19576f.f19578a.zza("RSA");
                keyPairGenerator.initialize(new RSAKeyGenParameterSpec(zzhxjVar.f19387a, new BigInteger(1, zzhxjVar.f19388b.toByteArray())));
                KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
                zzhxm zzhxmVar = new zzhxm(0);
                zzhxmVar.f19407a = zzhxjVar;
                zzhxmVar.f19408b = rSAPublicKey.getModulus();
                zzhxmVar.f19409c = num;
                zzhxn zzhxnVarM7993a = zzhxmVar.m7993a();
                zzhxk zzhxkVar = new zzhxk(0);
                zzhxkVar.f19393a = zzhxnVarM7993a;
                BigInteger primeP = rSAPrivateCrtKey.getPrimeP();
                zzhey zzheyVar = zzhey.f18574a;
                zzibl zziblVar = new zzibl(primeP);
                zzibl zziblVar2 = new zzibl(rSAPrivateCrtKey.getPrimeQ());
                zzhxkVar.f19395c = zziblVar;
                zzhxkVar.f19396d = zziblVar2;
                zzhxkVar.f19394b = new zzibl(rSAPrivateCrtKey.getPrivateExponent());
                zzibl zziblVar3 = new zzibl(rSAPrivateCrtKey.getPrimeExponentP());
                zzibl zziblVar4 = new zzibl(rSAPrivateCrtKey.getPrimeExponentQ());
                zzhxkVar.f19397e = zziblVar3;
                zzhxkVar.f19398f = zziblVar4;
                zzhxkVar.f19399g = new zzibl(rSAPrivateCrtKey.getCrtCoefficient());
                return zzhxkVar.m7992a();
            }
        };
        f19422f = 2;
    }
}
