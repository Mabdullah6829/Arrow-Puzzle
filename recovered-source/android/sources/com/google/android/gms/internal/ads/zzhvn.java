package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPublicKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhvn {

    /* JADX INFO: renamed from: a */
    public static final zzhns f19239a = new zzhnq(zzhvh.class, zzheu.class, new zzhnr() { // from class: com.google.android.gms.internal.ads.zzhvk
        @Override // com.google.android.gms.internal.ads.zzhnr
        /* JADX INFO: renamed from: a */
        public final Object mo7428a(zzhdz zzhdzVar) throws GeneralSecurityException {
            zzhvh zzhvhVar = (zzhvh) zzhdzVar;
            Provider providerM7509a = zzhli.m7509a();
            zziat zziatVar = (zziat) zzhye.f19443i.m7540b(zzhvhVar.f19227a.f19232a.f19223c);
            zzhlv zzhlvVar = zzhye.f19444j;
            zzhvj zzhvjVar = zzhvhVar.f19227a;
            zzhlv zzhlvVar2 = zzhye.f19445k;
            zzhvf zzhvfVar = zzhvjVar.f19232a;
            ECParameterSpec eCParameterSpecM8035a = zziae.m8035a((zziac) zzhlvVar2.m7540b(zzhvfVar.f19222b));
            zzibl zziblVar = zzhvhVar.f19228b;
            zzhey zzheyVar = zzhey.f18574a;
            zzhvjVar.f19234c.m8051b();
            zzhvfVar.f19224d.getClass();
            zzhyd zzhydVar = new zzhyd();
            if (!zzhle.m7504a(2)) {
                throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
            }
            zzibi.m8046b(zziatVar);
            zziatVar.toString().concat("withECDSA");
            return zzhydVar;
        }
    });

    /* JADX INFO: renamed from: b */
    public static final zzhns f19240b = new zzhnq(zzhvj.class, zzhev.class, new zzhnr() { // from class: com.google.android.gms.internal.ads.zzhvm
        @Override // com.google.android.gms.internal.ads.zzhnr
        /* JADX INFO: renamed from: a */
        public final Object mo7428a(zzhdz zzhdzVar) {
            zzhvj zzhvjVar = (zzhvj) zzhdzVar;
            byte[] bArr = zzhye.f19441g;
            Provider providerM7509a = zzhli.m7509a();
            zzhlv zzhlvVar = zzhye.f19445k;
            zzhvf zzhvfVar = zzhvjVar.f19232a;
            return new zzhye((ECPublicKey) (providerM7509a != null ? KeyFactory.getInstance("EC", providerM7509a) : (KeyFactory) zziak.f19577g.f19578a.zza("EC")).generatePublic(new ECPublicKeySpec(zzhvjVar.f19233b, zziae.m8035a((zziac) zzhlvVar.m7540b(zzhvfVar.f19222b)))), (zziat) zzhye.f19443i.m7540b(zzhvfVar.f19223c), (zziad) zzhye.f19444j.m7540b(zzhvfVar.f19221a), zzhvjVar.f19234c.m8051b(), zzhvfVar.f19224d.equals(zzhve.f19218d) ? zzhye.f19442h : zzhye.f19441g, providerM7509a);
        }
    });

    /* JADX INFO: renamed from: c */
    public static final zzher f19241c;

    /* JADX INFO: renamed from: d */
    public static final zzhmj f19242d;

    /* JADX INFO: renamed from: e */
    public static final zzhma f19243e;

    /* JADX INFO: renamed from: f */
    public static final int f19244f;

    static {
        zzhsh.m7729I();
        f19241c = new zzhmi("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", zzheu.class, zzhta.ASYMMETRIC_PRIVATE);
        zzhsj.m7738K();
        f19242d = new zzhmj("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", zzhev.class, zzhta.ASYMMETRIC_PUBLIC);
        f19243e = new zzhma() { // from class: com.google.android.gms.internal.ads.zzhvl
            @Override // com.google.android.gms.internal.ads.zzhma
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7431a(zzheq zzheqVar, Integer num) throws GeneralSecurityException {
                zzhvf zzhvfVar = (zzhvf) zzheqVar;
                zzhns zzhnsVar = zzhvn.f19239a;
                ECParameterSpec eCParameterSpec = zzhvfVar.f19222b.f19208b;
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zziak.f19576f.f19578a.zza("EC");
                keyPairGenerator.initialize(eCParameterSpec);
                KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
                ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
                zzhvi zzhviVar = new zzhvi(0);
                zzhviVar.f19229a = zzhvfVar;
                zzhviVar.f19231c = num;
                zzhviVar.f19230b = eCPublicKey.getW();
                zzhvj zzhvjVarM7979a = zzhviVar.m7979a();
                zzhvg zzhvgVar = new zzhvg(0);
                zzhvgVar.f19225a = zzhvjVarM7979a;
                BigInteger s2 = eCPrivateKey.getS();
                zzhey zzheyVar = zzhey.f18574a;
                zzhvgVar.f19226b = new zzibl(s2);
                return zzhvgVar.m7977a();
            }
        };
        f19244f = 2;
    }
}
