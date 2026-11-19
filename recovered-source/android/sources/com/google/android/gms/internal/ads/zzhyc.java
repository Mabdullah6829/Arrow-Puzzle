package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhyc {

    /* JADX INFO: renamed from: a */
    public static final zzhnl f19435a;

    /* JADX INFO: renamed from: b */
    public static final zzhni f19436b;

    /* JADX INFO: renamed from: c */
    public static final zzhmh f19437c;

    /* JADX INFO: renamed from: d */
    public static final zzhme f19438d;

    /* JADX INFO: renamed from: e */
    public static final zzhmh f19439e;

    /* JADX INFO: renamed from: f */
    public static final zzhme f19440f;

    static {
        zzibk zzibkVarM7596a = zzhok.m7596a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        zzibk zzibkVarM7596a2 = zzhok.m7596a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        f19435a = new zzhnj(zzhvf.class, new zzhnk() { // from class: com.google.android.gms.internal.ads.zzhyb
            @Override // com.google.android.gms.internal.ads.zzhnk
            /* JADX INFO: renamed from: a */
            public final zzhoa mo7458a(zzheq zzheqVar) throws GeneralSecurityException {
                zzhvf zzhvfVar = (zzhvf) zzheqVar;
                zzhnl zzhnlVar = zzhyc.f19435a;
                zzhtd zzhtdVarM7800H = zzhte.m7800H();
                zzhtdVarM7800H.m7796q("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
                zzhsc zzhscVarM7716F = zzhsd.m7716F();
                zzhsf zzhsfVarM8000e = zzhyc.m8000e(zzhvfVar);
                zzhscVarM7716F.m8326l();
                ((zzhsd) zzhscVarM7716F.f19780t).m7718G(zzhsfVarM8000e);
                zzhtdVarM7800H.m7797r(((zzhsd) zzhscVarM7716F.m8328o()).m8098g());
                zzhtdVarM7800H.m7798s(zzhyc.m7996a(zzhvfVar.f19224d));
                return zzhoa.m7589a((zzhte) zzhtdVarM7800H.m8328o());
            }
        });
        f19436b = new zzhng(zzibkVarM7596a, new zzhnh() { // from class: com.google.android.gms.internal.ads.zzhxw
            @Override // com.google.android.gms.internal.ads.zzhnh
            /* JADX INFO: renamed from: a */
            public final zzheq mo7455a(zzhoa zzhoaVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhyc.f19435a;
                zzhte zzhteVar = zzhoaVar.f19043b;
                if (!zzhteVar.m7803D().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(String.valueOf(zzhteVar.m7803D())));
                }
                try {
                    zzidl zzidlVarM7804E = zzhteVar.m7804E();
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhsd zzhsdVarM7715E = zzhsd.m7715E(zzidlVarM7804E, zzidz.f19759c);
                    zzhva zzhvaVar = new zzhva(0);
                    zzhvaVar.f19202c = zzhyc.m7997b(zzhsdVarM7715E.m7717D().m7721D());
                    zzhvaVar.f19200a = zzhyc.m8003h(zzhsdVarM7715E.m7717D().m7724I());
                    zzhvaVar.f19201b = zzhyc.m8002g(zzhsdVarM7715E.m7717D().m7723H());
                    zzhvaVar.f19203d = zzhyc.m7998c(zzhteVar.m7805F());
                    return zzhvaVar.m7976a();
                } catch (zzifh e) {
                    throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e);
                }
            }
        });
        f19437c = new zzhmf(zzhvj.class, new zzhmg() { // from class: com.google.android.gms.internal.ads.zzhxx
            @Override // com.google.android.gms.internal.ads.zzhmg
            /* JADX INFO: renamed from: a */
            public final zzhnz mo7456a(zzhdz zzhdzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhvj zzhvjVar = (zzhvj) zzhdzVar;
                return zzhnz.m7588a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", zzhyc.m8001f(zzhvjVar).m8098g(), zzhta.ASYMMETRIC_PUBLIC, zzhyc.m7996a(zzhvjVar.f19232a.f19224d), zzhvjVar.f19235d);
            }
        });
        f19438d = new zzhmc(zzibkVarM7596a2, new zzhmd() { // from class: com.google.android.gms.internal.ads.zzhxy
            @Override // com.google.android.gms.internal.ads.zzhmd
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7457a(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhyc.f19435a;
                String str = zzhnzVar.f19030a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
                }
                try {
                    zzidl zzidlVar = zzhnzVar.f19032c;
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhsj zzhsjVarM7735H = zzhsj.m7735H(zzidlVar, zzidz.f19759c);
                    if (zzhsjVarM7735H.m7739D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzhva zzhvaVar = new zzhva(0);
                    zzhvaVar.f19202c = zzhyc.m7997b(zzhsjVarM7735H.m7740E().m7721D());
                    zzhvaVar.f19200a = zzhyc.m8003h(zzhsjVarM7735H.m7740E().m7724I());
                    zzhvaVar.f19201b = zzhyc.m8002g(zzhsjVarM7735H.m7740E().m7723H());
                    zzhvaVar.f19203d = zzhyc.m7998c(zzhnzVar.f19034e);
                    zzhvf zzhvfVarM7976a = zzhvaVar.m7976a();
                    zzhvi zzhviVar = new zzhvi(0);
                    zzhviVar.f19229a = zzhvfVarM7976a;
                    zzhviVar.f19230b = new ECPoint(new BigInteger(1, zzhsjVarM7735H.m7741F().m8151a()), new BigInteger(1, zzhsjVarM7735H.m7742G().m8151a()));
                    zzhviVar.f19231c = zzhnzVar.f19035f;
                    return zzhviVar.m7979a();
                } catch (zzifh | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
                }
            }
        });
        f19439e = new zzhmf(zzhvh.class, new zzhmg() { // from class: com.google.android.gms.internal.ads.zzhxz
            @Override // com.google.android.gms.internal.ads.zzhmg
            /* JADX INFO: renamed from: a */
            public final zzhnz mo7456a(zzhdz zzhdzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhvh zzhvhVar = (zzhvh) zzhdzVar;
                zzhnl zzhnlVar = zzhyc.f19435a;
                int iM7999d = zzhyc.m7999d(zzhvhVar.f19227a.f19232a.f19222b);
                zzhsg zzhsgVarM7728H = zzhsh.m7728H();
                zzhvj zzhvjVar = zzhvhVar.f19227a;
                zzhsj zzhsjVarM8001f = zzhyc.m8001f(zzhvjVar);
                zzhsgVarM7728H.m8326l();
                ((zzhsh) zzhsgVarM7728H.f19780t).m7733J(zzhsjVarM8001f);
                byte[] bArrM7508b = zzhlh.m7508b(zzhvhVar.f19228b.f19615a, iM7999d);
                zzidl zzidlVar = zzidl.f19719t;
                zzidl zzidlVarM8149y = zzidl.m8149y(bArrM7508b, 0, bArrM7508b.length);
                zzhsgVarM7728H.m8326l();
                ((zzhsh) zzhsgVarM7728H.f19780t).m7734K(zzidlVarM8149y);
                return zzhnz.m7588a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((zzhsh) zzhsgVarM7728H.m8328o()).m8098g(), zzhta.ASYMMETRIC_PRIVATE, zzhyc.m7996a(zzhvjVar.f19232a.f19224d), zzhvjVar.f19235d);
            }
        });
        f19440f = new zzhmc(zzibkVarM7596a, new zzhmd() { // from class: com.google.android.gms.internal.ads.zzhya
            @Override // com.google.android.gms.internal.ads.zzhmd
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7457a(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhyc.f19435a;
                String str = zzhnzVar.f19030a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str)));
                }
                try {
                    zzidl zzidlVar = zzhnzVar.f19032c;
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhsh zzhshVarM7727G = zzhsh.m7727G(zzidlVar, zzidz.f19759c);
                    if (zzhshVarM7727G.m7730D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzhsj zzhsjVarM7731E = zzhshVarM7727G.m7731E();
                    if (zzhsjVarM7731E.m7739D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzhva zzhvaVar = new zzhva(0);
                    zzhvaVar.f19202c = zzhyc.m7997b(zzhsjVarM7731E.m7740E().m7721D());
                    zzhvaVar.f19200a = zzhyc.m8003h(zzhsjVarM7731E.m7740E().m7724I());
                    zzhvaVar.f19201b = zzhyc.m8002g(zzhsjVarM7731E.m7740E().m7723H());
                    zzhvaVar.f19203d = zzhyc.m7998c(zzhnzVar.f19034e);
                    zzhvf zzhvfVarM7976a = zzhvaVar.m7976a();
                    zzhvi zzhviVar = new zzhvi(0);
                    zzhviVar.f19229a = zzhvfVarM7976a;
                    zzhviVar.f19230b = new ECPoint(new BigInteger(1, zzhsjVarM7731E.m7741F().m8151a()), new BigInteger(1, zzhsjVarM7731E.m7742G().m8151a()));
                    zzhviVar.f19231c = zzhnzVar.f19035f;
                    zzhvj zzhvjVarM7979a = zzhviVar.m7979a();
                    zzhvg zzhvgVar = new zzhvg(0);
                    zzhvgVar.f19225a = zzhvjVarM7979a;
                    zzhvgVar.f19226b = new zzibl(new BigInteger(1, zzhshVarM7727G.m7732F().m8151a()));
                    return zzhvgVar.m7977a();
                } catch (zzifh | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static zzhtx m7996a(zzhve zzhveVar) throws GeneralSecurityException {
        if (zzhve.f19216b.equals(zzhveVar)) {
            return zzhtx.TINK;
        }
        if (zzhve.f19217c.equals(zzhveVar)) {
            return zzhtx.CRUNCHY;
        }
        if (zzhve.f19219e.equals(zzhveVar)) {
            return zzhtx.RAW;
        }
        if (zzhve.f19218d.equals(zzhveVar)) {
            return zzhtx.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhveVar.f19220a));
    }

    /* JADX INFO: renamed from: b */
    public static zzhvc m7997b(zzhss zzhssVar) throws GeneralSecurityException {
        int iOrdinal = zzhssVar.ordinal();
        if (iOrdinal == 2) {
            return zzhvc.f19210c;
        }
        if (iOrdinal == 3) {
            return zzhvc.f19209b;
        }
        if (iOrdinal == 4) {
            return zzhvc.f19211d;
        }
        int iZza = zzhssVar.zza();
        throw new GeneralSecurityException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iZza).length() + 26), "Unable to parse HashType: ", iZza));
    }

    /* JADX INFO: renamed from: c */
    public static zzhve m7998c(zzhtx zzhtxVar) throws GeneralSecurityException {
        int iOrdinal = zzhtxVar.ordinal();
        if (iOrdinal == 1) {
            return zzhve.f19216b;
        }
        if (iOrdinal == 2) {
            return zzhve.f19218d;
        }
        if (iOrdinal == 3) {
            return zzhve.f19219e;
        }
        if (iOrdinal == 4) {
            return zzhve.f19217c;
        }
        int iZza = zzhtxVar.zza();
        throw new GeneralSecurityException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iZza).length() + 34), "Unable to parse OutputPrefixType: ", iZza));
    }

    /* JADX INFO: renamed from: d */
    public static int m7999d(zzhvb zzhvbVar) throws GeneralSecurityException {
        if (zzhvb.f19204c.equals(zzhvbVar)) {
            return 33;
        }
        if (zzhvb.f19205d.equals(zzhvbVar)) {
            return 49;
        }
        if (zzhvb.f19206e.equals(zzhvbVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(zzhvbVar.f19207a));
    }

    /* JADX INFO: renamed from: e */
    public static zzhsf m8000e(zzhvf zzhvfVar) throws GeneralSecurityException {
        zzhss zzhssVar;
        int i2;
        zzhse zzhseVarM7719E = zzhsf.m7719E();
        zzhvc zzhvcVar = zzhvfVar.f19223c;
        if (zzhvc.f19209b.equals(zzhvcVar)) {
            zzhssVar = zzhss.SHA256;
        } else if (zzhvc.f19210c.equals(zzhvcVar)) {
            zzhssVar = zzhss.SHA384;
        } else {
            if (!zzhvc.f19211d.equals(zzhvcVar)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(zzhvcVar.f19212a));
            }
            zzhssVar = zzhss.SHA512;
        }
        zzhseVarM7719E.m8326l();
        ((zzhsf) zzhseVarM7719E.f19780t).m7722G(zzhssVar);
        zzhvb zzhvbVar = zzhvfVar.f19222b;
        int i3 = 4;
        if (zzhvb.f19204c.equals(zzhvbVar)) {
            i2 = 4;
        } else if (zzhvb.f19205d.equals(zzhvbVar)) {
            i2 = 5;
        } else {
            if (!zzhvb.f19206e.equals(zzhvbVar)) {
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(zzhvbVar.f19207a));
            }
            i2 = 6;
        }
        zzhseVarM7719E.m8326l();
        ((zzhsf) zzhseVarM7719E.f19780t).m7725J(i2);
        zzhvd zzhvdVar = zzhvfVar.f19221a;
        if (zzhvd.f19213b.equals(zzhvdVar)) {
            i3 = 3;
        } else if (!zzhvd.f19214c.equals(zzhvdVar)) {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(zzhvdVar.f19215a));
        }
        zzhseVarM7719E.m8326l();
        ((zzhsf) zzhseVarM7719E.f19780t).m7726K(i3);
        return (zzhsf) zzhseVarM7719E.m8328o();
    }

    /* JADX INFO: renamed from: f */
    public static zzhsj m8001f(zzhvj zzhvjVar) throws GeneralSecurityException {
        int iM7999d = m7999d(zzhvjVar.f19232a.f19222b);
        ECPoint eCPoint = zzhvjVar.f19233b;
        zzhsi zzhsiVarM7736I = zzhsj.m7736I();
        zzhsf zzhsfVarM8000e = m8000e(zzhvjVar.f19232a);
        zzhsiVarM7736I.m8326l();
        ((zzhsj) zzhsiVarM7736I.f19780t).m7743L(zzhsfVarM8000e);
        byte[] bArrM7508b = zzhlh.m7508b(eCPoint.getAffineX(), iM7999d);
        zzidl zzidlVar = zzidl.f19719t;
        zzidl zzidlVarM8149y = zzidl.m8149y(bArrM7508b, 0, bArrM7508b.length);
        zzhsiVarM7736I.m8326l();
        ((zzhsj) zzhsiVarM7736I.f19780t).m7744M(zzidlVarM8149y);
        byte[] bArrM7508b2 = zzhlh.m7508b(eCPoint.getAffineY(), iM7999d);
        zzidl zzidlVarM8149y2 = zzidl.m8149y(bArrM7508b2, 0, bArrM7508b2.length);
        zzhsiVarM7736I.m8326l();
        ((zzhsj) zzhsiVarM7736I.f19780t).m7745N(zzidlVarM8149y2);
        return (zzhsj) zzhsiVarM7736I.m8328o();
    }

    /* JADX INFO: renamed from: g */
    public static zzhvb m8002g(int i2) throws GeneralSecurityException {
        int i3 = i2 - 2;
        if (i3 == 2) {
            return zzhvb.f19204c;
        }
        if (i3 == 3) {
            return zzhvb.f19205d;
        }
        if (i3 == 4) {
            return zzhvb.f19206e;
        }
        if (i2 != 1) {
            throw new GeneralSecurityException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i3).length() + 35), "Unable to parse EllipticCurveType: ", i3));
        }
        zzifc.m8355a();
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public static zzhvd m8003h(int i2) throws GeneralSecurityException {
        int i3 = i2 - 2;
        if (i3 == 1) {
            return zzhvd.f19213b;
        }
        if (i3 == 2) {
            return zzhvd.f19214c;
        }
        if (i2 != 1) {
            throw new GeneralSecurityException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i3).length() + 40), "Unable to parse EcdsaSignatureEncoding: ", i3));
        }
        zzifc.m8355a();
        throw null;
    }
}
