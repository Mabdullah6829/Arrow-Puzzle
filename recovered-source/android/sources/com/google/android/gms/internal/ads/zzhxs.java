package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhxs {
    static {
        int i2 = zzhtz.zza;
        try {
            m7994a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m7994a() {
        zzhwr zzhwrVar = zzhwr.f19303a;
        zzhnb zzhnbVar = zzhnb.f19001b;
        zzhnbVar.m7570b(zzhwr.f19303a);
        zzhnbVar.m7569a(zzhwr.f19304b);
        zzhnbVar.m7570b(zzhwt.f19306a);
        zzhnbVar.m7569a(zzhwt.f19307b);
        int i2 = zzhvn.f19244f;
        if (!zzhle.m7504a(i2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzhnl zzhnlVar = zzhyc.f19435a;
        zzhne zzhneVar = zzhne.f19005b;
        zzhneVar.m7573c(zzhyc.f19435a);
        zzhneVar.m7574d(zzhyc.f19436b);
        zzhneVar.m7571a(zzhyc.f19437c);
        zzhneVar.m7572b(zzhyc.f19438d);
        zzhneVar.m7571a(zzhyc.f19439e);
        zzhneVar.m7572b(zzhyc.f19440f);
        zzhna zzhnaVar = zzhna.f18999b;
        HashMap map = new HashMap();
        map.put("ECDSA_P256", zzhwp.f19290a);
        map.put("ECDSA_P256_IEEE_P1363", zzhwp.f19293d);
        zzhva zzhvaVar = new zzhva(0);
        zzhvaVar.f19202c = zzhvc.f19209b;
        zzhvaVar.f19201b = zzhvb.f19204c;
        zzhvaVar.f19200a = zzhvd.f19213b;
        zzhvaVar.f19203d = zzhve.f19219e;
        map.put("ECDSA_P256_RAW", zzhvaVar.m7976a());
        map.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", zzhwp.f19295f);
        map.put("ECDSA_P384", zzhwp.f19291b);
        map.put("ECDSA_P384_IEEE_P1363", zzhwp.f19294e);
        zzhva zzhvaVar2 = new zzhva(0);
        zzhvaVar2.f19202c = zzhvc.f19211d;
        zzhvb zzhvbVar = zzhvb.f19205d;
        zzhvaVar2.f19201b = zzhvbVar;
        zzhvd zzhvdVar = zzhvd.f19214c;
        zzhvaVar2.f19200a = zzhvdVar;
        zzhve zzhveVar = zzhve.f19216b;
        zzhvaVar2.f19203d = zzhveVar;
        map.put("ECDSA_P384_SHA512", zzhvaVar2.m7976a());
        zzhva zzhvaVar3 = new zzhva(0);
        zzhvaVar3.f19202c = zzhvc.f19210c;
        zzhvaVar3.f19201b = zzhvbVar;
        zzhvaVar3.f19200a = zzhvdVar;
        zzhvaVar3.f19203d = zzhveVar;
        map.put("ECDSA_P384_SHA384", zzhvaVar3.m7976a());
        map.put("ECDSA_P521", zzhwp.f19292c);
        map.put("ECDSA_P521_IEEE_P1363", zzhwp.f19296g);
        zzhnaVar.m7568b(Collections.unmodifiableMap(map));
        zzhnbVar.m7569a(zzhvn.f19239a);
        zzhnbVar.m7569a(zzhvn.f19240b);
        zzhmv zzhmvVar = zzhmv.f18992c;
        zzhmvVar.m7564a(zzhvn.f19243e, zzhvf.class);
        zzhmb zzhmbVar = zzhmb.f18972d;
        zzhmbVar.m7557c(zzhvn.f19241c, i2, true);
        zzhmbVar.m7557c(zzhvn.f19242d, i2, false);
        int i3 = zzhxf.f19368f;
        if (!zzhle.m7504a(i3)) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzhneVar.m7573c(zzhyw.f19480a);
        zzhneVar.m7574d(zzhyw.f19481b);
        zzhneVar.m7571a(zzhyw.f19482c);
        zzhneVar.m7572b(zzhyw.f19483d);
        zzhneVar.m7571a(zzhyw.f19484e);
        zzhneVar.m7572b(zzhyw.f19485f);
        HashMap map2 = new HashMap();
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4", zzhwp.f19297h);
        BigInteger bigInteger = zzhwx.f19323e;
        zzhwu zzhwuVar = new zzhwu(0);
        zzhwuVar.f19312c = zzhwv.f19314b;
        zzhwuVar.m7983a(3072);
        BigInteger bigInteger2 = zzhwx.f19323e;
        zzhwuVar.f19311b = bigInteger2;
        zzhww zzhwwVar = zzhww.f19321e;
        zzhwuVar.f19313d = zzhwwVar;
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", zzhwuVar.m7984b());
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", zzhwp.f19298i);
        map2.put("RSA_SSA_PKCS1_4096_SHA512_F4", zzhwp.f19299j);
        zzhwu zzhwuVar2 = new zzhwu(0);
        zzhwuVar2.f19312c = zzhwv.f19316d;
        zzhwuVar2.m7983a(4096);
        zzhwuVar2.f19311b = bigInteger2;
        zzhwuVar2.f19313d = zzhwwVar;
        map2.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", zzhwuVar2.m7984b());
        zzhnaVar.m7568b(map2);
        zzhnbVar.m7569a(zzhxf.f19363a);
        zzhnbVar.m7569a(zzhxf.f19364b);
        zzhmvVar.m7564a(zzhxf.f19367e, zzhwx.class);
        zzhmbVar.m7557c(zzhxf.f19365c, i3, true);
        zzhmbVar.m7557c(zzhxf.f19366d, i3, false);
        int i4 = zzhxr.f19422f;
        if (!zzhle.m7504a(i4)) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzhneVar.m7573c(zzhzf.f19511a);
        zzhneVar.m7574d(zzhzf.f19512b);
        zzhneVar.m7571a(zzhzf.f19513c);
        zzhneVar.m7572b(zzhzf.f19514d);
        zzhneVar.m7571a(zzhzf.f19515e);
        zzhneVar.m7572b(zzhzf.f19516f);
        HashMap map3 = new HashMap();
        BigInteger bigInteger3 = zzhxj.f19386g;
        zzhxg zzhxgVar = new zzhxg(0);
        zzhxh zzhxhVar = zzhxh.f19377b;
        zzhxgVar.f19373c = zzhxhVar;
        zzhxgVar.f19374d = zzhxhVar;
        zzhxgVar.m7990b(32);
        zzhxgVar.m7989a(3072);
        BigInteger bigInteger4 = zzhxj.f19386g;
        zzhxgVar.f19372b = bigInteger4;
        zzhxi zzhxiVar = zzhxi.f19381b;
        zzhxgVar.f19376f = zzhxiVar;
        map3.put("RSA_SSA_PSS_3072_SHA256_F4", zzhxgVar.m7991c());
        zzhxg zzhxgVar2 = new zzhxg(0);
        zzhxgVar2.f19373c = zzhxhVar;
        zzhxgVar2.f19374d = zzhxhVar;
        zzhxgVar2.m7990b(32);
        zzhxgVar2.m7989a(3072);
        zzhxgVar2.f19372b = bigInteger4;
        zzhxi zzhxiVar2 = zzhxi.f19384e;
        zzhxgVar2.f19376f = zzhxiVar2;
        map3.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", zzhxgVar2.m7991c());
        map3.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", zzhwp.f19300k);
        zzhxg zzhxgVar3 = new zzhxg(0);
        zzhxh zzhxhVar2 = zzhxh.f19379d;
        zzhxgVar3.f19373c = zzhxhVar2;
        zzhxgVar3.f19374d = zzhxhVar2;
        zzhxgVar3.m7990b(64);
        zzhxgVar3.m7989a(4096);
        zzhxgVar3.f19372b = bigInteger4;
        zzhxgVar3.f19376f = zzhxiVar;
        map3.put("RSA_SSA_PSS_4096_SHA512_F4", zzhxgVar3.m7991c());
        zzhxg zzhxgVar4 = new zzhxg(0);
        zzhxgVar4.f19373c = zzhxhVar2;
        zzhxgVar4.f19374d = zzhxhVar2;
        zzhxgVar4.m7990b(64);
        zzhxgVar4.m7989a(4096);
        zzhxgVar4.f19372b = bigInteger4;
        zzhxgVar4.f19376f = zzhxiVar2;
        map3.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", zzhxgVar4.m7991c());
        map3.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", zzhwp.f19301l);
        zzhnaVar.m7568b(Collections.unmodifiableMap(map3));
        zzhnbVar.m7569a(zzhxr.f19417a);
        zzhnbVar.m7569a(zzhxr.f19418b);
        zzhmvVar.m7564a(zzhxr.f19421e, zzhxj.class);
        zzhmbVar.m7557c(zzhxr.f19419c, i4, true);
        zzhmbVar.m7557c(zzhxr.f19420d, i4, false);
        if (zzhlf.m7505a()) {
            return;
        }
        zzhns zzhnsVar = zzhvv.f19257a;
        if (!zzhle.m7504a(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        zzhneVar.m7573c(zzhyl.f19458a);
        zzhneVar.m7574d(zzhyl.f19459b);
        zzhneVar.m7571a(zzhyl.f19460c);
        zzhneVar.m7572b(zzhyl.f19461d);
        zzhneVar.m7571a(zzhyl.f19462e);
        zzhneVar.m7572b(zzhyl.f19463f);
        HashMap map4 = new HashMap();
        map4.put("ED25519", new zzhvp(zzhvo.f19245b));
        zzhvo zzhvoVar = zzhvo.f19248e;
        map4.put("ED25519_RAW", new zzhvp(zzhvoVar));
        map4.put("ED25519WithRawOutput", new zzhvp(zzhvoVar));
        zzhnaVar.m7568b(Collections.unmodifiableMap(map4));
        zzhmvVar.m7564a(zzhvv.f19262f, zzhvp.class);
        zzhmx.f18994b.m7566a(zzhvv.f19261e, zzhvp.class);
        zzhnbVar.m7569a(zzhvv.f19257a);
        zzhnbVar.m7569a(zzhvv.f19258b);
        zzhmbVar.m7555a(zzhvv.f19259c, true);
        zzhmbVar.m7555a(zzhvv.f19260d, false);
    }
}
