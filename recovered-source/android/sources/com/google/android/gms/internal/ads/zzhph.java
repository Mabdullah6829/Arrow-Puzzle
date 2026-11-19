package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhph {
    static {
        int i2 = zzhtz.zza;
        try {
            m7610a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m7610a() throws GeneralSecurityException {
        zzhpl zzhplVar = zzhpl.f19125a;
        zzhnb zzhnbVar = zzhnb.f19001b;
        zzhnbVar.m7570b(zzhpl.f19125a);
        zzhnbVar.m7569a(zzhpl.f19126b);
        zzhnbVar.m7570b(zzhov.f19083a);
        int i2 = zzhpc.f19104f;
        if (!zzhle.m7504a(i2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzhlv zzhlvVar = zzhqf.f19147a;
        zzhne zzhneVar = zzhne.f19005b;
        zzhneVar.m7573c(zzhqf.f19149c);
        zzhneVar.m7574d(zzhqf.f19150d);
        zzhneVar.m7571a(zzhqf.f19151e);
        zzhneVar.m7572b(zzhqf.f19152f);
        zzhnbVar.m7569a(zzhpc.f19099a);
        zzhnbVar.m7569a(zzhpc.f19100b);
        zzhna zzhnaVar = zzhna.f18999b;
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", zzhpr.f19132a);
        zzhpd zzhpdVar = new zzhpd(0);
        zzhpdVar.m7606a(32);
        zzhpdVar.m7607b(16);
        zzhpf zzhpfVar = zzhpf.f19118e;
        zzhpdVar.f19108d = zzhpfVar;
        zzhpe zzhpeVar = zzhpe.f19111d;
        zzhpdVar.f19107c = zzhpeVar;
        map.put("HMAC_SHA256_128BITTAG_RAW", zzhpdVar.m7608c());
        zzhpd zzhpdVar2 = new zzhpd(0);
        zzhpdVar2.m7606a(32);
        zzhpdVar2.m7607b(32);
        zzhpf zzhpfVar2 = zzhpf.f19115b;
        zzhpdVar2.f19108d = zzhpfVar2;
        zzhpdVar2.f19107c = zzhpeVar;
        map.put("HMAC_SHA256_256BITTAG", zzhpdVar2.m7608c());
        zzhpd zzhpdVar3 = new zzhpd(0);
        zzhpdVar3.m7606a(32);
        zzhpdVar3.m7607b(32);
        zzhpdVar3.f19108d = zzhpfVar;
        zzhpdVar3.f19107c = zzhpeVar;
        map.put("HMAC_SHA256_256BITTAG_RAW", zzhpdVar3.m7608c());
        zzhpd zzhpdVar4 = new zzhpd(0);
        zzhpdVar4.m7606a(64);
        zzhpdVar4.m7607b(16);
        zzhpdVar4.f19108d = zzhpfVar2;
        zzhpe zzhpeVar2 = zzhpe.f19113f;
        zzhpdVar4.f19107c = zzhpeVar2;
        map.put("HMAC_SHA512_128BITTAG", zzhpdVar4.m7608c());
        zzhpd zzhpdVar5 = new zzhpd(0);
        zzhpdVar5.m7606a(64);
        zzhpdVar5.m7607b(16);
        zzhpdVar5.f19108d = zzhpfVar;
        zzhpdVar5.f19107c = zzhpeVar2;
        map.put("HMAC_SHA512_128BITTAG_RAW", zzhpdVar5.m7608c());
        zzhpd zzhpdVar6 = new zzhpd(0);
        zzhpdVar6.m7606a(64);
        zzhpdVar6.m7607b(32);
        zzhpdVar6.f19108d = zzhpfVar2;
        zzhpdVar6.f19107c = zzhpeVar2;
        map.put("HMAC_SHA512_256BITTAG", zzhpdVar6.m7608c());
        zzhpd zzhpdVar7 = new zzhpd(0);
        zzhpdVar7.m7606a(64);
        zzhpdVar7.m7607b(32);
        zzhpdVar7.f19108d = zzhpfVar;
        zzhpdVar7.f19107c = zzhpeVar2;
        map.put("HMAC_SHA512_256BITTAG_RAW", zzhpdVar7.m7608c());
        map.put("HMAC_SHA512_512BITTAG", zzhpr.f19133b);
        zzhpd zzhpdVar8 = new zzhpd(0);
        zzhpdVar8.m7606a(64);
        zzhpdVar8.m7607b(64);
        zzhpdVar8.f19108d = zzhpfVar;
        zzhpdVar8.f19107c = zzhpeVar2;
        map.put("HMAC_SHA512_512BITTAG_RAW", zzhpdVar8.m7608c());
        zzhnaVar.m7568b(Collections.unmodifiableMap(map));
        zzhmv zzhmvVar = zzhmv.f18992c;
        zzhmvVar.m7564a(zzhpc.f19103e, zzhpg.class);
        zzhmx.f18994b.m7566a(zzhpc.f19102d, zzhpg.class);
        zzhmb zzhmbVar = zzhmb.f18972d;
        zzhmbVar.m7557c(zzhpc.f19101c, i2, true);
        if (zzhlf.m7505a()) {
            return;
        }
        zzhma zzhmaVar = zzhoq.f19068a;
        if (!zzhle.m7504a(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        zzhneVar.m7573c(zzhpw.f19139a);
        zzhneVar.m7574d(zzhpw.f19140b);
        zzhneVar.m7571a(zzhpw.f19141c);
        zzhneVar.m7572b(zzhpw.f19142d);
        zzhmvVar.m7564a(zzhoq.f19068a, zzhot.class);
        zzhnbVar.m7569a(zzhoq.f19069b);
        zzhnbVar.m7569a(zzhoq.f19070c);
        HashMap map2 = new HashMap();
        zzhot zzhotVar = zzhpr.f19134c;
        map2.put("AES_CMAC", zzhotVar);
        map2.put("AES256_CMAC", zzhotVar);
        zzhor zzhorVar = new zzhor(0);
        zzhorVar.m7601a(32);
        zzhorVar.m7602b(16);
        zzhorVar.f19074c = zzhos.f19078e;
        map2.put("AES256_CMAC_RAW", zzhorVar.m7603c());
        zzhnaVar.m7568b(Collections.unmodifiableMap(map2));
        zzhmbVar.m7555a(zzhoq.f19071d, true);
    }
}
