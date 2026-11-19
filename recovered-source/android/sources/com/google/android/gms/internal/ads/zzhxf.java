package com.google.android.gms.internal.ads;

import android.os.Build;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhxf {

    /* JADX INFO: renamed from: a */
    public static final zzhns f19363a = new zzhnq(zzhwz.class, zzheu.class, new zzhnr() { // from class: com.google.android.gms.internal.ads.zzhxc
        @Override // com.google.android.gms.internal.ads.zzhnr
        /* JADX INFO: renamed from: a */
        public final Object mo7428a(zzhdz zzhdzVar) throws GeneralSecurityException {
            zzhwz zzhwzVar = (zzhwz) zzhdzVar;
            int i2 = zzhok.f19057a;
            if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
            }
            Provider providerM7509a = zzhli.m7509a();
            KeyFactory keyFactory = providerM7509a != null ? KeyFactory.getInstance("RSA", providerM7509a) : (KeyFactory) zziak.f19577g.f19578a.zza("RSA");
            zzhxb zzhxbVar = zzhwzVar.f19335a;
            BigInteger bigInteger = zzhxbVar.f19357b;
            zzhwx zzhwxVar = zzhxbVar.f19356a;
            BigInteger bigInteger2 = zzhwxVar.f19325b;
            zzibl zziblVar = zzhwzVar.f19336b;
            zzhey zzheyVar = zzhey.f18574a;
            zzhyx zzhyxVar = new zzhyx((RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, bigInteger2, zziblVar.f19615a, zzhwzVar.f19337c.f19615a, zzhwzVar.f19338d.f19615a, zzhwzVar.f19339e.f19615a, zzhwzVar.f19340f.f19615a, zzhwzVar.f19341g.f19615a)), zzhwxVar.f19327d, zzhxbVar.f19358c.m8051b(), zzhwxVar.f19326c.equals(zzhww.f19320d) ? zzhyx.f19489h : zzhyx.f19488g, providerM7509a != null ? zzhyy.m8012c(zzhxbVar, providerM7509a) : zzibc.m8042b(zzhxbVar), providerM7509a);
            String str = zzhyxVar.f19492b;
            Provider provider = zzhyxVar.f19496f;
            Signature signature = provider != null ? Signature.getInstance(str, provider) : (Signature) zziak.f19574d.f19578a.zza(str);
            signature.initSign(zzhyxVar.f19491a);
            byte[] bArr = zzhyx.f19490i;
            signature.update(bArr);
            byte[] bArr2 = zzhyxVar.f19494d;
            if (bArr2.length > 0) {
                signature.update(bArr2);
            }
            byte[] bArrSign = signature.sign();
            byte[] bArr3 = zzhyxVar.f19493c;
            if (bArr3.length > 0) {
                bArrSign = zzhzw.m8023a(bArr3, bArrSign);
            }
            try {
                zzhyxVar.f19495e.mo7422a(bArrSign, bArr);
                return zzhyxVar;
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException("RSA signature computation error", e);
            }
        }
    });

    /* JADX INFO: renamed from: b */
    public static final zzhns f19364b = new zzhnq(zzhxb.class, zzhev.class, new zzhnr() { // from class: com.google.android.gms.internal.ads.zzhxe
        @Override // com.google.android.gms.internal.ads.zzhnr
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object mo7428a(zzhdz zzhdzVar) {
            return zzibc.m8042b((zzhxb) zzhdzVar);
        }
    });

    /* JADX INFO: renamed from: c */
    public static final zzher f19365c;

    /* JADX INFO: renamed from: d */
    public static final zzhmj f19366d;

    /* JADX INFO: renamed from: e */
    public static final zzhma f19367e;

    /* JADX INFO: renamed from: f */
    public static final int f19368f;

    static {
        zzhuf.m7876N();
        f19365c = new zzhmi("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", zzheu.class, zzhta.ASYMMETRIC_PRIVATE);
        zzhuh.m7896K();
        f19366d = new zzhmj("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", zzhev.class, zzhta.ASYMMETRIC_PUBLIC);
        f19367e = new zzhma() { // from class: com.google.android.gms.internal.ads.zzhxd
            @Override // com.google.android.gms.internal.ads.zzhma
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7431a(zzheq zzheqVar, Integer num) throws GeneralSecurityException {
                zzhwx zzhwxVar = (zzhwx) zzheqVar;
                zzhns zzhnsVar = zzhxf.f19363a;
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zziak.f19576f.f19578a.zza("RSA");
                keyPairGenerator.initialize(new RSAKeyGenParameterSpec(zzhwxVar.f19324a, new BigInteger(1, zzhwxVar.f19325b.toByteArray())));
                KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
                zzhxa zzhxaVar = new zzhxa(0);
                zzhxaVar.f19353a = zzhwxVar;
                zzhxaVar.f19354b = rSAPublicKey.getModulus();
                zzhxaVar.f19355c = num;
                zzhxb zzhxbVarM7988a = zzhxaVar.m7988a();
                zzhwy zzhwyVar = new zzhwy(0);
                zzhwyVar.f19328a = zzhxbVarM7988a;
                BigInteger primeP = rSAPrivateCrtKey.getPrimeP();
                zzhey zzheyVar = zzhey.f18574a;
                zzibl zziblVar = new zzibl(primeP);
                zzibl zziblVar2 = new zzibl(rSAPrivateCrtKey.getPrimeQ());
                zzhwyVar.f19330c = zziblVar;
                zzhwyVar.f19331d = zziblVar2;
                zzhwyVar.f19329b = new zzibl(rSAPrivateCrtKey.getPrivateExponent());
                zzibl zziblVar3 = new zzibl(rSAPrivateCrtKey.getPrimeExponentP());
                zzibl zziblVar4 = new zzibl(rSAPrivateCrtKey.getPrimeExponentQ());
                zzhwyVar.f19332e = zziblVar3;
                zzhwyVar.f19333f = zziblVar4;
                zzhwyVar.f19334g = new zzibl(rSAPrivateCrtKey.getCrtCoefficient());
                return zzhwyVar.m7985a();
            }
        };
        f19368f = 2;
    }
}
