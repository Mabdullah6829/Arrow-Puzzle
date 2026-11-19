package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhyw {

    /* JADX INFO: renamed from: a */
    public static final zzhnl f19480a;

    /* JADX INFO: renamed from: b */
    public static final zzhni f19481b;

    /* JADX INFO: renamed from: c */
    public static final zzhmh f19482c;

    /* JADX INFO: renamed from: d */
    public static final zzhme f19483d;

    /* JADX INFO: renamed from: e */
    public static final zzhmh f19484e;

    /* JADX INFO: renamed from: f */
    public static final zzhme f19485f;

    /* JADX INFO: renamed from: g */
    public static final zzhlv f19486g;

    /* JADX INFO: renamed from: h */
    public static final zzhlv f19487h;

    static {
        zzibk zzibkVarM7596a = zzhok.m7596a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        zzibk zzibkVarM7596a2 = zzhok.m7596a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        f19480a = new zzhnj(zzhwx.class, new zzhnk() { // from class: com.google.android.gms.internal.ads.zzhyv
            @Override // com.google.android.gms.internal.ads.zzhnk
            /* JADX INFO: renamed from: a */
            public final zzhoa mo7458a(zzheq zzheqVar) {
                zzhwx zzhwxVar = (zzhwx) zzheqVar;
                zzhnl zzhnlVar = zzhyw.f19480a;
                zzhtd zzhtdVarM7800H = zzhte.m7800H();
                zzhtdVarM7800H.m7796q("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
                zzhua zzhuaVarM7863H = zzhub.m7863H();
                zzhuc zzhucVarM7870E = zzhud.m7870E();
                zzhss zzhssVar = (zzhss) zzhyw.f19487h.m7540b(zzhwxVar.f19327d);
                zzhucVarM7870E.m8326l();
                ((zzhud) zzhucVarM7870E.f19780t).m7873G(zzhssVar);
                zzhud zzhudVar = (zzhud) zzhucVarM7870E.m8328o();
                zzhuaVarM7863H.m8326l();
                ((zzhub) zzhuaVarM7863H.f19780t).m7867I(zzhudVar);
                int i2 = zzhwxVar.f19324a;
                zzhuaVarM7863H.m8326l();
                ((zzhub) zzhuaVarM7863H.f19780t).m7868J(i2);
                byte[] bArrM7507a = zzhlh.m7507a(zzhwxVar.f19325b);
                zzidl zzidlVar = zzidl.f19719t;
                zzidl zzidlVarM8149y = zzidl.m8149y(bArrM7507a, 0, bArrM7507a.length);
                zzhuaVarM7863H.m8326l();
                ((zzhub) zzhuaVarM7863H.f19780t).m7869K(zzidlVarM8149y);
                zzhtdVarM7800H.m7797r(((zzhub) zzhuaVarM7863H.m8328o()).m8098g());
                zzhtdVarM7800H.m7798s((zzhtx) zzhyw.f19486g.m7540b(zzhwxVar.f19326c));
                return zzhoa.m7589a((zzhte) zzhtdVarM7800H.m8328o());
            }
        });
        f19481b = new zzhng(zzibkVarM7596a, new zzhnh() { // from class: com.google.android.gms.internal.ads.zzhyq
            @Override // com.google.android.gms.internal.ads.zzhnh
            /* JADX INFO: renamed from: a */
            public final zzheq mo7455a(zzhoa zzhoaVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhyw.f19480a;
                zzhte zzhteVar = zzhoaVar.f19043b;
                if (!zzhteVar.m7803D().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhteVar.m7803D())));
                }
                try {
                    zzidl zzidlVarM7804E = zzhteVar.m7804E();
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhub zzhubVarM7862G = zzhub.m7862G(zzidlVarM7804E, zzidz.f19759c);
                    BigInteger bigInteger = zzhwx.f19323e;
                    zzhwu zzhwuVar = new zzhwu(0);
                    zzhwuVar.f19312c = (zzhwv) zzhyw.f19487h.m7541c(zzhubVarM7862G.m7864D().m7872D());
                    zzhwuVar.f19311b = new BigInteger(1, zzhubVarM7862G.m7866F().m8151a());
                    zzhwuVar.m7983a(zzhubVarM7862G.m7865E());
                    zzhwuVar.f19313d = (zzhww) zzhyw.f19486g.m7541c(zzhteVar.m7805F());
                    return zzhwuVar.m7984b();
                } catch (zzifh e) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e);
                }
            }
        });
        f19482c = new zzhmf(zzhxb.class, new zzhmg() { // from class: com.google.android.gms.internal.ads.zzhyr
            @Override // com.google.android.gms.internal.ads.zzhmg
            /* JADX INFO: renamed from: a */
            public final zzhnz mo7456a(zzhdz zzhdzVar, zzhey zzheyVar) {
                zzhxb zzhxbVar = (zzhxb) zzhdzVar;
                return zzhnz.m7588a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", zzhyw.m8009a(zzhxbVar).m8098g(), zzhta.ASYMMETRIC_PUBLIC, (zzhtx) zzhyw.f19486g.m7540b(zzhxbVar.f19356a.f19326c), zzhxbVar.f19359d);
            }
        });
        f19483d = new zzhmc(zzibkVarM7596a2, new zzhmd() { // from class: com.google.android.gms.internal.ads.zzhys
            @Override // com.google.android.gms.internal.ads.zzhmd
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7457a(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhyw.f19480a;
                String str = zzhnzVar.f19030a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
                }
                try {
                    zzidl zzidlVar = zzhnzVar.f19032c;
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhuh zzhuhVarM7893H = zzhuh.m7893H(zzidlVar, zzidz.f19759c);
                    if (zzhuhVarM7893H.m7897D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger = new BigInteger(1, zzhuhVarM7893H.m7899F().m8151a());
                    int iBitLength = bigInteger.bitLength();
                    BigInteger bigInteger2 = zzhwx.f19323e;
                    zzhwu zzhwuVar = new zzhwu(0);
                    zzhwuVar.f19312c = (zzhwv) zzhyw.f19487h.m7541c(zzhuhVarM7893H.m7898E().m7872D());
                    zzhwuVar.f19311b = new BigInteger(1, zzhuhVarM7893H.m7900G().m8151a());
                    zzhwuVar.m7983a(iBitLength);
                    zzhwuVar.f19313d = (zzhww) zzhyw.f19486g.m7541c(zzhnzVar.f19034e);
                    zzhwx zzhwxVarM7984b = zzhwuVar.m7984b();
                    zzhxa zzhxaVar = new zzhxa(0);
                    zzhxaVar.f19353a = zzhwxVarM7984b;
                    zzhxaVar.f19354b = bigInteger;
                    zzhxaVar.f19355c = zzhnzVar.f19035f;
                    return zzhxaVar.m7988a();
                } catch (zzifh | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
                }
            }
        });
        f19484e = new zzhmf(zzhwz.class, new zzhmg() { // from class: com.google.android.gms.internal.ads.zzhyt
            @Override // com.google.android.gms.internal.ads.zzhmg
            /* JADX INFO: renamed from: a */
            public final zzhnz mo7456a(zzhdz zzhdzVar, zzhey zzheyVar) {
                zzhwz zzhwzVar = (zzhwz) zzhdzVar;
                zzhnl zzhnlVar = zzhyw.f19480a;
                zzhue zzhueVarM7875M = zzhuf.m7875M();
                zzhueVarM7875M.m8326l();
                ((zzhuf) zzhueVarM7875M.f19780t).m7885O();
                zzhuh zzhuhVarM8009a = zzhyw.m8009a(zzhwzVar.f19335a);
                zzhueVarM7875M.m8326l();
                ((zzhuf) zzhueVarM7875M.f19780t).m7886P(zzhuhVarM8009a);
                byte[] bArrM7507a = zzhlh.m7507a(zzhwzVar.f19336b.f19615a);
                zzidl zzidlVar = zzidl.f19719t;
                zzidl zzidlVarM8149y = zzidl.m8149y(bArrM7507a, 0, bArrM7507a.length);
                zzhueVarM7875M.m8326l();
                ((zzhuf) zzhueVarM7875M.f19780t).m7887Q(zzidlVarM8149y);
                byte[] bArrM7507a2 = zzhlh.m7507a(zzhwzVar.f19337c.f19615a);
                zzidl zzidlVarM8149y2 = zzidl.m8149y(bArrM7507a2, 0, bArrM7507a2.length);
                zzhueVarM7875M.m8326l();
                ((zzhuf) zzhueVarM7875M.f19780t).m7888R(zzidlVarM8149y2);
                byte[] bArrM7507a3 = zzhlh.m7507a(zzhwzVar.f19338d.f19615a);
                zzidl zzidlVarM8149y3 = zzidl.m8149y(bArrM7507a3, 0, bArrM7507a3.length);
                zzhueVarM7875M.m8326l();
                ((zzhuf) zzhueVarM7875M.f19780t).m7889S(zzidlVarM8149y3);
                byte[] bArrM7507a4 = zzhlh.m7507a(zzhwzVar.f19339e.f19615a);
                zzidl zzidlVarM8149y4 = zzidl.m8149y(bArrM7507a4, 0, bArrM7507a4.length);
                zzhueVarM7875M.m8326l();
                ((zzhuf) zzhueVarM7875M.f19780t).m7890T(zzidlVarM8149y4);
                byte[] bArrM7507a5 = zzhlh.m7507a(zzhwzVar.f19340f.f19615a);
                zzidl zzidlVarM8149y5 = zzidl.m8149y(bArrM7507a5, 0, bArrM7507a5.length);
                zzhueVarM7875M.m8326l();
                ((zzhuf) zzhueVarM7875M.f19780t).m7891U(zzidlVarM8149y5);
                byte[] bArrM7507a6 = zzhlh.m7507a(zzhwzVar.f19341g.f19615a);
                zzidl zzidlVarM8149y6 = zzidl.m8149y(bArrM7507a6, 0, bArrM7507a6.length);
                zzhueVarM7875M.m8326l();
                ((zzhuf) zzhueVarM7875M.f19780t).m7892V(zzidlVarM8149y6);
                zzidl zzidlVarM8098g = ((zzhuf) zzhueVarM7875M.m8328o()).m8098g();
                zzhlv zzhlvVar = zzhyw.f19486g;
                zzhxb zzhxbVar = zzhwzVar.f19335a;
                return zzhnz.m7588a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", zzidlVarM8098g, zzhta.ASYMMETRIC_PRIVATE, (zzhtx) zzhlvVar.m7540b(zzhxbVar.f19356a.f19326c), zzhxbVar.f19359d);
            }
        });
        f19485f = new zzhmc(zzibkVarM7596a, new zzhmd() { // from class: com.google.android.gms.internal.ads.zzhyu
            @Override // com.google.android.gms.internal.ads.zzhmd
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7457a(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhyw.f19480a;
                String str = zzhnzVar.f19030a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str)));
                }
                try {
                    zzidl zzidlVar = zzhnzVar.f19032c;
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhuf zzhufVarM7874L = zzhuf.m7874L(zzidlVar, zzidz.f19759c);
                    if (zzhufVarM7874L.m7877D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzhuh zzhuhVarM7878E = zzhufVarM7874L.m7878E();
                    if (zzhuhVarM7878E.m7897D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger = new BigInteger(1, zzhuhVarM7878E.m7899F().m8151a());
                    int iBitLength = bigInteger.bitLength();
                    BigInteger bigInteger2 = new BigInteger(1, zzhuhVarM7878E.m7900G().m8151a());
                    BigInteger bigInteger3 = zzhwx.f19323e;
                    zzhwu zzhwuVar = new zzhwu(0);
                    zzhwuVar.f19312c = (zzhwv) zzhyw.f19487h.m7541c(zzhuhVarM7878E.m7898E().m7872D());
                    zzhwuVar.f19311b = bigInteger2;
                    zzhwuVar.m7983a(iBitLength);
                    zzhwuVar.f19313d = (zzhww) zzhyw.f19486g.m7541c(zzhnzVar.f19034e);
                    zzhwx zzhwxVarM7984b = zzhwuVar.m7984b();
                    zzhxa zzhxaVar = new zzhxa(0);
                    zzhxaVar.f19353a = zzhwxVarM7984b;
                    zzhxaVar.f19354b = bigInteger;
                    zzhxaVar.f19355c = zzhnzVar.f19035f;
                    zzhxb zzhxbVarM7988a = zzhxaVar.m7988a();
                    zzhwy zzhwyVar = new zzhwy(0);
                    zzhwyVar.f19328a = zzhxbVarM7988a;
                    zzibl zziblVarM8010b = zzhyw.m8010b(zzhufVarM7874L.m7880G());
                    zzibl zziblVarM8010b2 = zzhyw.m8010b(zzhufVarM7874L.m7881H());
                    zzhwyVar.f19330c = zziblVarM8010b;
                    zzhwyVar.f19331d = zziblVarM8010b2;
                    zzhwyVar.f19329b = zzhyw.m8010b(zzhufVarM7874L.m7879F());
                    zzibl zziblVarM8010b3 = zzhyw.m8010b(zzhufVarM7874L.m7882I());
                    zzibl zziblVarM8010b4 = zzhyw.m8010b(zzhufVarM7874L.m7883J());
                    zzhwyVar.f19332e = zziblVarM8010b3;
                    zzhwyVar.f19333f = zziblVarM8010b4;
                    zzhwyVar.f19334g = zzhyw.m8010b(zzhufVarM7874L.m7884K());
                    return zzhwyVar.m7985a();
                } catch (zzifh | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
                }
            }
        });
        zzhlu zzhluVarM7539a = zzhlv.m7539a();
        zzhluVarM7539a.m7537a(zzhtx.RAW, zzhww.f19321e);
        zzhluVarM7539a.m7537a(zzhtx.TINK, zzhww.f19318b);
        zzhluVarM7539a.m7537a(zzhtx.CRUNCHY, zzhww.f19319c);
        zzhluVarM7539a.m7537a(zzhtx.LEGACY, zzhww.f19320d);
        f19486g = zzhluVarM7539a.m7538b();
        zzhlu zzhluVarM7539a2 = zzhlv.m7539a();
        zzhluVarM7539a2.m7537a(zzhss.SHA256, zzhwv.f19314b);
        zzhluVarM7539a2.m7537a(zzhss.SHA384, zzhwv.f19315c);
        zzhluVarM7539a2.m7537a(zzhss.SHA512, zzhwv.f19316d);
        f19487h = zzhluVarM7539a2.m7538b();
    }

    /* JADX INFO: renamed from: a */
    public static zzhuh m8009a(zzhxb zzhxbVar) {
        zzhug zzhugVarM7894I = zzhuh.m7894I();
        zzhwx zzhwxVar = zzhxbVar.f19356a;
        zzhuc zzhucVarM7870E = zzhud.m7870E();
        zzhss zzhssVar = (zzhss) f19487h.m7540b(zzhwxVar.f19327d);
        zzhucVarM7870E.m8326l();
        ((zzhud) zzhucVarM7870E.f19780t).m7873G(zzhssVar);
        zzhud zzhudVar = (zzhud) zzhucVarM7870E.m8328o();
        zzhugVarM7894I.m8326l();
        ((zzhuh) zzhugVarM7894I.f19780t).m7901L(zzhudVar);
        byte[] bArrM7507a = zzhlh.m7507a(zzhxbVar.f19357b);
        zzidl zzidlVar = zzidl.f19719t;
        zzidl zzidlVarM8149y = zzidl.m8149y(bArrM7507a, 0, bArrM7507a.length);
        zzhugVarM7894I.m8326l();
        ((zzhuh) zzhugVarM7894I.f19780t).m7902M(zzidlVarM8149y);
        byte[] bArrM7507a2 = zzhlh.m7507a(zzhxbVar.f19356a.f19325b);
        zzidl zzidlVarM8149y2 = zzidl.m8149y(bArrM7507a2, 0, bArrM7507a2.length);
        zzhugVarM7894I.m8326l();
        ((zzhuh) zzhugVarM7894I.f19780t).m7903N(zzidlVarM8149y2);
        return (zzhuh) zzhugVarM7894I.m8328o();
    }

    /* JADX INFO: renamed from: b */
    public static zzibl m8010b(zzidl zzidlVar) {
        return new zzibl(new BigInteger(1, zzidlVar.m8151a()));
    }
}
