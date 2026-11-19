package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhfc {
    static {
        int i2 = zzhtz.zza;
        try {
            m7425a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m7425a() {
        zzhfj zzhfjVar = zzhfj.f18586a;
        zzhnb zzhnbVar = zzhnb.f19001b;
        zzhnbVar.m7570b(zzhfj.f18586a);
        zzhnbVar.m7569a(zzhfj.f18587b);
        zzhph.m7610a();
        int i2 = zzhfp.f18604e;
        if (!zzhle.m7504a(i2)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzhnl zzhnlVar = zzhja.f18831a;
        zzhne zzhneVar = zzhne.f19005b;
        zzhneVar.m7573c(zzhja.f18831a);
        zzhneVar.m7574d(zzhja.f18832b);
        zzhneVar.m7571a(zzhja.f18833c);
        zzhneVar.m7572b(zzhja.f18834d);
        zzhnbVar.m7569a(zzhfp.f18600a);
        zzhna zzhnaVar = zzhna.f18999b;
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", zzhii.f18788e);
        zzhfq zzhfqVar = new zzhfq(0);
        zzhfqVar.m7432a(16);
        zzhfqVar.m7433b(32);
        zzhfqVar.m7435d(16);
        zzhfqVar.m7434c(16);
        zzhfr zzhfrVar = zzhfr.f18613d;
        zzhfqVar.f18609e = zzhfrVar;
        zzhfs zzhfsVar = zzhfs.f18619d;
        zzhfqVar.f18610f = zzhfsVar;
        map.put("AES128_CTR_HMAC_SHA256_RAW", zzhfqVar.m7436e());
        map.put("AES256_CTR_HMAC_SHA256", zzhii.f18789f);
        zzhfq zzhfqVar2 = new zzhfq(0);
        zzhfqVar2.m7432a(32);
        zzhfqVar2.m7433b(32);
        zzhfqVar2.m7435d(32);
        zzhfqVar2.m7434c(16);
        zzhfqVar2.f18609e = zzhfrVar;
        zzhfqVar2.f18610f = zzhfsVar;
        map.put("AES256_CTR_HMAC_SHA256_RAW", zzhfqVar2.m7436e());
        zzhnaVar.m7568b(Collections.unmodifiableMap(map));
        zzhmx zzhmxVar = zzhmx.f18994b;
        zzhmxVar.m7566a(zzhfp.f18602c, zzhft.class);
        zzhmv zzhmvVar = zzhmv.f18992c;
        zzhmvVar.m7564a(zzhfp.f18603d, zzhft.class);
        zzhmb zzhmbVar = zzhmb.f18972d;
        zzhmbVar.m7557c(zzhfp.f18601b, i2, true);
        int i3 = zzhgh.f18664e;
        if (!zzhle.m7504a(i3)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzhneVar.m7573c(zzhjm.f18848a);
        zzhneVar.m7574d(zzhjm.f18849b);
        zzhneVar.m7571a(zzhjm.f18850c);
        zzhneVar.m7572b(zzhjm.f18851d);
        zzhnbVar.m7569a(zzhgh.f18660a);
        HashMap map2 = new HashMap();
        map2.put("AES128_GCM", zzhii.f18784a);
        zzhgi zzhgiVar = new zzhgi(0);
        zzhgiVar.m7447b();
        zzhgiVar.m7446a(16);
        zzhgiVar.m7448c();
        zzhgj zzhgjVar = zzhgj.f18671d;
        zzhgiVar.f18668d = zzhgjVar;
        map2.put("AES128_GCM_RAW", zzhgiVar.m7449d());
        map2.put("AES256_GCM", zzhii.f18785b);
        zzhgi zzhgiVar2 = new zzhgi(0);
        zzhgiVar2.m7447b();
        zzhgiVar2.m7446a(32);
        zzhgiVar2.m7448c();
        zzhgiVar2.f18668d = zzhgjVar;
        map2.put("AES256_GCM_RAW", zzhgiVar2.m7449d());
        zzhnaVar.m7568b(Collections.unmodifiableMap(map2));
        zzhmxVar.m7566a(zzhgh.f18662c, zzhgk.class);
        zzhmvVar.m7564a(zzhgh.f18663d, zzhgk.class);
        zzhmbVar.m7557c(zzhgh.f18661b, i3, true);
        if (zzhlf.m7505a()) {
            return;
        }
        zzhns zzhnsVar = zzhfy.f18636a;
        if (!zzhle.m7504a(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        zzhneVar.m7573c(zzhjf.f18839a);
        zzhneVar.m7574d(zzhjf.f18840b);
        zzhneVar.m7571a(zzhjf.f18841c);
        zzhneVar.m7572b(zzhjf.f18842d);
        zzhnbVar.m7569a(zzhfy.f18636a);
        HashMap map3 = new HashMap();
        map3.put("AES128_EAX", zzhii.f18786c);
        zzhfz zzhfzVar = new zzhfz(0);
        zzhfzVar.m7439b(16);
        zzhfzVar.m7438a(16);
        zzhfzVar.m7440c();
        zzhga zzhgaVar = zzhga.f18645d;
        zzhfzVar.f18642d = zzhgaVar;
        map3.put("AES128_EAX_RAW", zzhfzVar.m7441d());
        map3.put("AES256_EAX", zzhii.f18787d);
        zzhfz zzhfzVar2 = new zzhfz(0);
        zzhfzVar2.m7439b(16);
        zzhfzVar2.m7438a(32);
        zzhfzVar2.m7440c();
        zzhfzVar2.f18642d = zzhgaVar;
        map3.put("AES256_EAX_RAW", zzhfzVar2.m7441d());
        zzhnaVar.m7568b(Collections.unmodifiableMap(map3));
        zzhmvVar.m7564a(zzhfy.f18638c, zzhgb.class);
        zzhmbVar.m7555a(zzhfy.f18637b, true);
        zzhns zzhnsVar2 = zzhgq.f18685a;
        if (!zzhle.m7504a(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        zzhneVar.m7573c(zzhjt.f18864a);
        zzhneVar.m7574d(zzhjt.f18865b);
        zzhneVar.m7571a(zzhjt.f18866c);
        zzhneVar.m7572b(zzhjt.f18867d);
        HashMap map4 = new HashMap();
        zzhgr zzhgrVar = new zzhgr(0);
        zzhgrVar.m7451a(16);
        zzhgs zzhgsVar = zzhgs.f18691b;
        zzhgrVar.f18690b = zzhgsVar;
        map4.put("AES128_GCM_SIV", zzhgrVar.m7452b());
        zzhgr zzhgrVar2 = new zzhgr(0);
        zzhgrVar2.m7451a(16);
        zzhgs zzhgsVar2 = zzhgs.f18693d;
        zzhgrVar2.f18690b = zzhgsVar2;
        map4.put("AES128_GCM_SIV_RAW", zzhgrVar2.m7452b());
        zzhgr zzhgrVar3 = new zzhgr(0);
        zzhgrVar3.m7451a(32);
        zzhgrVar3.f18690b = zzhgsVar;
        map4.put("AES256_GCM_SIV", zzhgrVar3.m7452b());
        zzhgr zzhgrVar4 = new zzhgr(0);
        zzhgrVar4.m7451a(32);
        zzhgrVar4.f18690b = zzhgsVar2;
        map4.put("AES256_GCM_SIV_RAW", zzhgrVar4.m7452b());
        zzhnaVar.m7568b(Collections.unmodifiableMap(map4));
        zzhmxVar.m7566a(zzhgq.f18687c, zzhgt.class);
        zzhmvVar.m7564a(zzhgq.f18686b, zzhgt.class);
        zzhnbVar.m7569a(zzhgq.f18685a);
        zzhmbVar.m7555a(zzhgq.f18688d, true);
        zzhns zzhnsVar3 = zzhgx.f18703a;
        if (!zzhle.m7504a(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        zzhneVar.m7573c(zzhjz.f18878a);
        zzhneVar.m7574d(zzhjz.f18879b);
        zzhneVar.m7571a(zzhjz.f18880c);
        zzhneVar.m7572b(zzhjz.f18881d);
        zzhnbVar.m7569a(zzhgx.f18703a);
        zzhmvVar.m7564a(zzhgx.f18704b, zzhgz.class);
        HashMap map5 = new HashMap();
        map5.put("CHACHA20_POLY1305", new zzhgz(zzhgy.f18706b));
        map5.put("CHACHA20_POLY1305_RAW", new zzhgz(zzhgy.f18708d));
        zzhnaVar.m7568b(Collections.unmodifiableMap(map5));
        zzhmbVar.m7555a(zzhgx.f18705c, true);
        zzhns zzhnsVar4 = zzhhc.f18713a;
        if (!zzhle.m7504a(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        zzhneVar.m7573c(zzhho.f18737a);
        zzhneVar.m7574d(zzhho.f18738b);
        zzhneVar.m7571a(zzhho.f18739c);
        zzhneVar.m7572b(zzhho.f18740d);
        zzhnbVar.m7569a(zzhhc.f18713a);
        zzhmvVar.m7564a(zzhhc.f18715c, zzhhj.class);
        zzhmbVar.m7555a(zzhhc.f18714b, true);
        zzhmj zzhmjVar = zzhhg.f18722a;
        if (!zzhle.m7504a(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        zzhneVar.m7573c(zzhhy.f18766a);
        zzhneVar.m7574d(zzhhy.f18767b);
        zzhneVar.m7571a(zzhhy.f18768c);
        zzhneVar.m7572b(zzhhy.f18769d);
        zzhmvVar.m7564a(zzhhg.f18723b, zzhht.class);
        zzhnbVar.m7569a(zzhhg.f18724c);
        zzhmbVar.m7555a(zzhhg.f18722a, true);
        zzhns zzhnsVar5 = zzhit.f18814a;
        if (!zzhle.m7504a(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        zzhneVar.m7573c(zzhkx.f18910a);
        zzhneVar.m7574d(zzhkx.f18911b);
        zzhneVar.m7571a(zzhkx.f18912c);
        zzhneVar.m7572b(zzhkx.f18913d);
        zzhnbVar.m7569a(zzhit.f18814a);
        HashMap map6 = new HashMap();
        map6.put("XCHACHA20_POLY1305", new zzhiv(zzhiu.f18818b));
        map6.put("XCHACHA20_POLY1305_RAW", new zzhiv(zzhiu.f18820d));
        zzhnaVar.m7568b(Collections.unmodifiableMap(map6));
        zzhmvVar.m7564a(zzhit.f18817d, zzhiv.class);
        zzhmxVar.m7566a(zzhit.f18816c, zzhiv.class);
        zzhmbVar.m7555a(zzhit.f18815b, true);
        zzhma zzhmaVar = zzhim.f18800a;
        zzhneVar.m7573c(zzhkr.f18899a);
        zzhneVar.m7574d(zzhkr.f18900b);
        zzhneVar.m7571a(zzhkr.f18901c);
        zzhneVar.m7572b(zzhkr.f18902d);
        HashMap map7 = new HashMap();
        map7.put("XAES_256_GCM_192_BIT_NONCE", zzhii.f18790g);
        map7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", zzhii.f18791h);
        map7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", zzhii.f18792i);
        map7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzhii.f18793j);
        zzhnaVar.m7568b(Collections.unmodifiableMap(map7));
        zzhnbVar.m7569a(zzhim.f18801b);
        zzhmvVar.m7564a(zzhim.f18800a, zzhio.class);
    }
}
