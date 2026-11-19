package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhzf {

    /* JADX INFO: renamed from: a */
    public static final zzhnl f19511a;

    /* JADX INFO: renamed from: b */
    public static final zzhni f19512b;

    /* JADX INFO: renamed from: c */
    public static final zzhmh f19513c;

    /* JADX INFO: renamed from: d */
    public static final zzhme f19514d;

    /* JADX INFO: renamed from: e */
    public static final zzhmh f19515e;

    /* JADX INFO: renamed from: f */
    public static final zzhme f19516f;

    /* JADX INFO: renamed from: g */
    public static final zzhlv f19517g;

    /* JADX INFO: renamed from: h */
    public static final zzhlv f19518h;

    static {
        zzibk zzibkVarM7596a = zzhok.m7596a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        zzibk zzibkVarM7596a2 = zzhok.m7596a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        f19511a = new zzhnj(zzhxj.class, new zzhnk() { // from class: com.google.android.gms.internal.ads.zzhze
            @Override // com.google.android.gms.internal.ads.zzhnk
            /* JADX INFO: renamed from: a */
            public final zzhoa mo7458a(zzheq zzheqVar) {
                zzhxj zzhxjVar = (zzhxj) zzheqVar;
                zzhnl zzhnlVar = zzhzf.f19511a;
                zzhtd zzhtdVarM7800H = zzhte.m7800H();
                zzhtdVarM7800H.m7796q("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
                zzhui zzhuiVarM7905H = zzhuj.m7905H();
                zzhul zzhulVarM8013a = zzhzf.m8013a(zzhxjVar);
                zzhuiVarM7905H.m8326l();
                ((zzhuj) zzhuiVarM7905H.f19780t).m7909I(zzhulVarM8013a);
                int i2 = zzhxjVar.f19387a;
                zzhuiVarM7905H.m8326l();
                ((zzhuj) zzhuiVarM7905H.f19780t).m7910J(i2);
                byte[] bArrM7507a = zzhlh.m7507a(zzhxjVar.f19388b);
                zzidl zzidlVar = zzidl.f19719t;
                zzidl zzidlVarM8149y = zzidl.m8149y(bArrM7507a, 0, bArrM7507a.length);
                zzhuiVarM7905H.m8326l();
                ((zzhuj) zzhuiVarM7905H.f19780t).m7911K(zzidlVarM8149y);
                zzhtdVarM7800H.m7797r(((zzhuj) zzhuiVarM7905H.m8328o()).m8098g());
                zzhtdVarM7800H.m7798s((zzhtx) zzhzf.f19517g.m7540b(zzhxjVar.f19389c));
                return zzhoa.m7589a((zzhte) zzhtdVarM7800H.m8328o());
            }
        });
        f19512b = new zzhng(zzibkVarM7596a, new zzhnh() { // from class: com.google.android.gms.internal.ads.zzhyz
            @Override // com.google.android.gms.internal.ads.zzhnh
            /* JADX INFO: renamed from: a */
            public final zzheq mo7455a(zzhoa zzhoaVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhzf.f19511a;
                zzhte zzhteVar = zzhoaVar.f19043b;
                if (!zzhteVar.m7803D().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(zzhteVar.m7803D())));
                }
                try {
                    zzidl zzidlVarM7804E = zzhteVar.m7804E();
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhuj zzhujVarM7904G = zzhuj.m7904G(zzidlVarM7804E, zzidz.f19759c);
                    BigInteger bigInteger = zzhxj.f19386g;
                    zzhxg zzhxgVar = new zzhxg(0);
                    zzhlv zzhlvVar = zzhzf.f19518h;
                    zzhxgVar.f19373c = (zzhxh) zzhlvVar.m7541c(zzhujVarM7904G.m7906D().m7914D());
                    zzhxgVar.f19374d = (zzhxh) zzhlvVar.m7541c(zzhujVarM7904G.m7906D().m7915E());
                    zzhxgVar.f19372b = new BigInteger(1, zzhujVarM7904G.m7908F().m8151a());
                    zzhxgVar.m7989a(zzhujVarM7904G.m7907E());
                    zzhxgVar.m7990b(zzhujVarM7904G.m7906D().m7916F());
                    zzhxgVar.f19376f = (zzhxi) zzhzf.f19517g.m7541c(zzhteVar.m7805F());
                    return zzhxgVar.m7991c();
                } catch (zzifh e) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e);
                }
            }
        });
        f19513c = new zzhmf(zzhxn.class, new zzhmg() { // from class: com.google.android.gms.internal.ads.zzhza
            @Override // com.google.android.gms.internal.ads.zzhmg
            /* JADX INFO: renamed from: a */
            public final zzhnz mo7456a(zzhdz zzhdzVar, zzhey zzheyVar) {
                zzhxn zzhxnVar = (zzhxn) zzhdzVar;
                return zzhnz.m7588a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", zzhzf.m8014b(zzhxnVar).m8098g(), zzhta.ASYMMETRIC_PUBLIC, (zzhtx) zzhzf.f19517g.m7540b(zzhxnVar.f19410a.f19389c), zzhxnVar.f19413d);
            }
        });
        f19514d = new zzhmc(zzibkVarM7596a2, new zzhmd() { // from class: com.google.android.gms.internal.ads.zzhzb
            @Override // com.google.android.gms.internal.ads.zzhmd
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7457a(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhzf.f19511a;
                String str = zzhnzVar.f19030a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
                }
                try {
                    zzidl zzidlVar = zzhnzVar.f19032c;
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhup zzhupVarM7939H = zzhup.m7939H(zzidlVar, zzidz.f19759c);
                    if (zzhupVarM7939H.m7943D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger = new BigInteger(1, zzhupVarM7939H.m7945F().m8151a());
                    int iBitLength = bigInteger.bitLength();
                    BigInteger bigInteger2 = zzhxj.f19386g;
                    zzhxg zzhxgVar = new zzhxg(0);
                    zzhlv zzhlvVar = zzhzf.f19518h;
                    zzhxgVar.f19373c = (zzhxh) zzhlvVar.m7541c(zzhupVarM7939H.m7944E().m7914D());
                    zzhxgVar.f19374d = (zzhxh) zzhlvVar.m7541c(zzhupVarM7939H.m7944E().m7915E());
                    zzhxgVar.f19372b = new BigInteger(1, zzhupVarM7939H.m7946G().m8151a());
                    zzhxgVar.m7989a(iBitLength);
                    zzhxgVar.m7990b(zzhupVarM7939H.m7944E().m7916F());
                    zzhxgVar.f19376f = (zzhxi) zzhzf.f19517g.m7541c(zzhnzVar.f19034e);
                    zzhxj zzhxjVarM7991c = zzhxgVar.m7991c();
                    zzhxm zzhxmVar = new zzhxm(0);
                    zzhxmVar.f19407a = zzhxjVarM7991c;
                    zzhxmVar.f19408b = bigInteger;
                    zzhxmVar.f19409c = zzhnzVar.f19035f;
                    return zzhxmVar.m7993a();
                } catch (zzifh | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
                }
            }
        });
        f19515e = new zzhmf(zzhxl.class, new zzhmg() { // from class: com.google.android.gms.internal.ads.zzhzc
            @Override // com.google.android.gms.internal.ads.zzhmg
            /* JADX INFO: renamed from: a */
            public final zzhnz mo7456a(zzhdz zzhdzVar, zzhey zzheyVar) {
                zzhxl zzhxlVar = (zzhxl) zzhdzVar;
                zzhnl zzhnlVar = zzhzf.f19511a;
                zzhum zzhumVarM7921M = zzhun.m7921M();
                zzhumVarM7921M.m8326l();
                ((zzhun) zzhumVarM7921M.f19780t).m7931O();
                zzhup zzhupVarM8014b = zzhzf.m8014b(zzhxlVar.f19400a);
                zzhumVarM7921M.m8326l();
                ((zzhun) zzhumVarM7921M.f19780t).m7932P(zzhupVarM8014b);
                byte[] bArrM7507a = zzhlh.m7507a(zzhxlVar.f19401b.f19615a);
                zzidl zzidlVar = zzidl.f19719t;
                zzidl zzidlVarM8149y = zzidl.m8149y(bArrM7507a, 0, bArrM7507a.length);
                zzhumVarM7921M.m8326l();
                ((zzhun) zzhumVarM7921M.f19780t).m7933Q(zzidlVarM8149y);
                byte[] bArrM7507a2 = zzhlh.m7507a(zzhxlVar.f19402c.f19615a);
                zzidl zzidlVarM8149y2 = zzidl.m8149y(bArrM7507a2, 0, bArrM7507a2.length);
                zzhumVarM7921M.m8326l();
                ((zzhun) zzhumVarM7921M.f19780t).m7934R(zzidlVarM8149y2);
                byte[] bArrM7507a3 = zzhlh.m7507a(zzhxlVar.f19403d.f19615a);
                zzidl zzidlVarM8149y3 = zzidl.m8149y(bArrM7507a3, 0, bArrM7507a3.length);
                zzhumVarM7921M.m8326l();
                ((zzhun) zzhumVarM7921M.f19780t).m7935S(zzidlVarM8149y3);
                byte[] bArrM7507a4 = zzhlh.m7507a(zzhxlVar.f19404e.f19615a);
                zzidl zzidlVarM8149y4 = zzidl.m8149y(bArrM7507a4, 0, bArrM7507a4.length);
                zzhumVarM7921M.m8326l();
                ((zzhun) zzhumVarM7921M.f19780t).m7936T(zzidlVarM8149y4);
                byte[] bArrM7507a5 = zzhlh.m7507a(zzhxlVar.f19405f.f19615a);
                zzidl zzidlVarM8149y5 = zzidl.m8149y(bArrM7507a5, 0, bArrM7507a5.length);
                zzhumVarM7921M.m8326l();
                ((zzhun) zzhumVarM7921M.f19780t).m7937U(zzidlVarM8149y5);
                byte[] bArrM7507a6 = zzhlh.m7507a(zzhxlVar.f19406g.f19615a);
                zzidl zzidlVarM8149y6 = zzidl.m8149y(bArrM7507a6, 0, bArrM7507a6.length);
                zzhumVarM7921M.m8326l();
                ((zzhun) zzhumVarM7921M.f19780t).m7938V(zzidlVarM8149y6);
                zzidl zzidlVarM8098g = ((zzhun) zzhumVarM7921M.m8328o()).m8098g();
                zzhlv zzhlvVar = zzhzf.f19517g;
                zzhxn zzhxnVar = zzhxlVar.f19400a;
                return zzhnz.m7588a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", zzidlVarM8098g, zzhta.ASYMMETRIC_PRIVATE, (zzhtx) zzhlvVar.m7540b(zzhxnVar.f19410a.f19389c), zzhxnVar.f19413d);
            }
        });
        f19516f = new zzhmc(zzibkVarM7596a, new zzhmd() { // from class: com.google.android.gms.internal.ads.zzhzd
            @Override // com.google.android.gms.internal.ads.zzhmd
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7457a(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhzf.f19511a;
                String str = zzhnzVar.f19030a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str)));
                }
                try {
                    zzidl zzidlVar = zzhnzVar.f19032c;
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhun zzhunVarM7920L = zzhun.m7920L(zzidlVar, zzidz.f19759c);
                    if (zzhunVarM7920L.m7923D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzhup zzhupVarM7924E = zzhunVarM7920L.m7924E();
                    if (zzhupVarM7924E.m7943D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger = new BigInteger(1, zzhupVarM7924E.m7945F().m8151a());
                    int iBitLength = bigInteger.bitLength();
                    BigInteger bigInteger2 = new BigInteger(1, zzhupVarM7924E.m7946G().m8151a());
                    BigInteger bigInteger3 = zzhxj.f19386g;
                    zzhxg zzhxgVar = new zzhxg(0);
                    zzhlv zzhlvVar = zzhzf.f19518h;
                    zzhxgVar.f19373c = (zzhxh) zzhlvVar.m7541c(zzhupVarM7924E.m7944E().m7914D());
                    zzhxgVar.f19374d = (zzhxh) zzhlvVar.m7541c(zzhupVarM7924E.m7944E().m7915E());
                    zzhxgVar.f19372b = bigInteger2;
                    zzhxgVar.m7989a(iBitLength);
                    zzhxgVar.m7990b(zzhupVarM7924E.m7944E().m7916F());
                    zzhxgVar.f19376f = (zzhxi) zzhzf.f19517g.m7541c(zzhnzVar.f19034e);
                    zzhxj zzhxjVarM7991c = zzhxgVar.m7991c();
                    zzhxm zzhxmVar = new zzhxm(0);
                    zzhxmVar.f19407a = zzhxjVarM7991c;
                    zzhxmVar.f19408b = bigInteger;
                    zzhxmVar.f19409c = zzhnzVar.f19035f;
                    zzhxn zzhxnVarM7993a = zzhxmVar.m7993a();
                    zzhxk zzhxkVar = new zzhxk(0);
                    zzhxkVar.f19393a = zzhxnVarM7993a;
                    zzibl zziblVarM8015c = zzhzf.m8015c(zzhunVarM7920L.m7926G());
                    zzibl zziblVarM8015c2 = zzhzf.m8015c(zzhunVarM7920L.m7927H());
                    zzhxkVar.f19395c = zziblVarM8015c;
                    zzhxkVar.f19396d = zziblVarM8015c2;
                    zzhxkVar.f19394b = zzhzf.m8015c(zzhunVarM7920L.m7925F());
                    zzibl zziblVarM8015c3 = zzhzf.m8015c(zzhunVarM7920L.m7928I());
                    zzibl zziblVarM8015c4 = zzhzf.m8015c(zzhunVarM7920L.m7929J());
                    zzhxkVar.f19397e = zziblVarM8015c3;
                    zzhxkVar.f19398f = zziblVarM8015c4;
                    zzhxkVar.f19399g = zzhzf.m8015c(zzhunVarM7920L.m7930K());
                    return zzhxkVar.m7992a();
                } catch (zzifh | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
                }
            }
        });
        zzhlu zzhluVarM7539a = zzhlv.m7539a();
        zzhluVarM7539a.m7537a(zzhtx.RAW, zzhxi.f19384e);
        zzhluVarM7539a.m7537a(zzhtx.TINK, zzhxi.f19381b);
        zzhluVarM7539a.m7537a(zzhtx.CRUNCHY, zzhxi.f19382c);
        zzhluVarM7539a.m7537a(zzhtx.LEGACY, zzhxi.f19383d);
        f19517g = zzhluVarM7539a.m7538b();
        zzhlu zzhluVarM7539a2 = zzhlv.m7539a();
        zzhluVarM7539a2.m7537a(zzhss.SHA256, zzhxh.f19377b);
        zzhluVarM7539a2.m7537a(zzhss.SHA384, zzhxh.f19378c);
        zzhluVarM7539a2.m7537a(zzhss.SHA512, zzhxh.f19379d);
        f19518h = zzhluVarM7539a2.m7538b();
    }

    /* JADX INFO: renamed from: a */
    public static zzhul m8013a(zzhxj zzhxjVar) {
        zzhuk zzhukVarM7912G = zzhul.m7912G();
        zzhxh zzhxhVar = zzhxjVar.f19390d;
        zzhlv zzhlvVar = f19518h;
        zzhss zzhssVar = (zzhss) zzhlvVar.m7540b(zzhxhVar);
        zzhukVarM7912G.m8326l();
        ((zzhul) zzhukVarM7912G.f19780t).m7917I(zzhssVar);
        zzhss zzhssVar2 = (zzhss) zzhlvVar.m7540b(zzhxjVar.f19391e);
        zzhukVarM7912G.m8326l();
        ((zzhul) zzhukVarM7912G.f19780t).m7918J(zzhssVar2);
        int i2 = zzhxjVar.f19392f;
        zzhukVarM7912G.m8326l();
        ((zzhul) zzhukVarM7912G.f19780t).m7919K(i2);
        return (zzhul) zzhukVarM7912G.m8328o();
    }

    /* JADX INFO: renamed from: b */
    public static zzhup m8014b(zzhxn zzhxnVar) {
        zzhuo zzhuoVarM7940I = zzhup.m7940I();
        zzhul zzhulVarM8013a = m8013a(zzhxnVar.f19410a);
        zzhuoVarM7940I.m8326l();
        ((zzhup) zzhuoVarM7940I.f19780t).m7948M(zzhulVarM8013a);
        byte[] bArrM7507a = zzhlh.m7507a(zzhxnVar.f19411b);
        zzidl zzidlVar = zzidl.f19719t;
        zzidl zzidlVarM8149y = zzidl.m8149y(bArrM7507a, 0, bArrM7507a.length);
        zzhuoVarM7940I.m8326l();
        ((zzhup) zzhuoVarM7940I.f19780t).m7949N(zzidlVarM8149y);
        byte[] bArrM7507a2 = zzhlh.m7507a(zzhxnVar.f19410a.f19388b);
        zzidl zzidlVarM8149y2 = zzidl.m8149y(bArrM7507a2, 0, bArrM7507a2.length);
        zzhuoVarM7940I.m8326l();
        ((zzhup) zzhuoVarM7940I.f19780t).m7950O(zzidlVarM8149y2);
        zzhuoVarM7940I.m8326l();
        ((zzhup) zzhuoVarM7940I.f19780t).m7947L(0);
        return (zzhup) zzhuoVarM7940I.m8328o();
    }

    /* JADX INFO: renamed from: c */
    public static zzibl m8015c(zzidl zzidlVar) {
        return new zzibl(new BigInteger(1, zzidlVar.m8151a()));
    }
}
