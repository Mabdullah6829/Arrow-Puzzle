package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
final class zzhfe implements zzhdw {
    @Override // com.google.android.gms.internal.ads.zzhdw
    /* JADX INFO: renamed from: a */
    public final Object mo7402a(zzhek zzhekVar, Class cls) throws GeneralSecurityException {
        if (cls == zzhdr.class) {
            return cls.cast(zzhkl.m7498a(zzhekVar, new zzhnx() { // from class: com.google.android.gms.internal.ads.zzhfd
                @Override // com.google.android.gms.internal.ads.zzhnx
                /* JADX INFO: renamed from: a */
                public final Object mo7426a(zzhei zzheiVar) throws GeneralSecurityException {
                    zzhdz zzhdzVarM7409a = zzheiVar.m7409a();
                    if (zzhdzVarM7409a instanceof zzhfl) {
                        return zziaf.m8037b((zzhfl) zzhdzVarM7409a);
                    }
                    if (zzhdzVarM7409a instanceof zzhgd) {
                        zzhgd zzhgdVar = (zzhgd) zzhdzVarM7409a;
                        zzhgdVar.getClass();
                        zzibm zzibmVar = zzhgdVar.f18654b;
                        zzhey zzheyVar = zzhey.f18574a;
                        return new zzhzs(zzibmVar.f19616a.m8051b(), zzhgdVar.f18655c);
                    }
                    if (zzhdzVarM7409a instanceof zzhgm) {
                        return zzhla.m7503b((zzhgm) zzhdzVarM7409a);
                    }
                    if (zzhdzVarM7409a instanceof zzhfv) {
                        return zzhzr.m8020b((zzhfv) zzhdzVarM7409a);
                    }
                    if (zzhdzVarM7409a instanceof zzhgu) {
                        zzhgu zzhguVar = (zzhgu) zzhdzVarM7409a;
                        try {
                            zzhju.m7483b();
                            Cipher cipherM7483b = zzhju.m7483b();
                            zzibm zzibmVar2 = zzhguVar.f18698b;
                            zzhey zzheyVar2 = zzhey.f18574a;
                            return new zzhju(zzibmVar2.f19616a.m8051b(), zzhguVar.f18699c.m8051b(), cipherM7483b.getProvider());
                        } catch (GeneralSecurityException unused) {
                            zzibm zzibmVar3 = zzhguVar.f18698b;
                            zzhey zzheyVar3 = zzhey.f18574a;
                            return new zzhzx(zzibmVar3.f19616a.m8051b(), zzhguVar.f18699c.m8051b());
                        }
                    }
                    if (!(zzhdzVarM7409a instanceof zzhip)) {
                        if (!(zzhdzVarM7409a instanceof zzhij)) {
                            throw new GeneralSecurityException("Unknown key class: ".concat(String.valueOf(zzhdzVarM7409a.getClass())));
                        }
                        zzhij zzhijVar = (zzhij) zzhdzVarM7409a;
                        zzhijVar.getClass();
                        zzibm zzibmVar4 = zzhijVar.f18795b;
                        zzhey zzheyVar4 = zzhey.f18574a;
                        return new zzhkm(zzibmVar4.f19616a.m8051b(), zzhijVar.f18796c, zzhijVar.f18794a.f18806b);
                    }
                    zzhip zzhipVar = (zzhip) zzhdzVarM7409a;
                    try {
                        zzhju.m7483b();
                        Cipher cipherM7483b2 = zzhju.m7483b();
                        zzibm zzibmVar5 = zzhipVar.f18808b;
                        zzhey zzheyVar5 = zzhey.f18574a;
                        return new zzhks(zzibmVar5.f19616a.m8051b(), zzhipVar.f18809c.m8051b(), cipherM7483b2.getProvider());
                    } catch (GeneralSecurityException unused2) {
                        zzibm zzibmVar6 = zzhipVar.f18808b;
                        zzhey zzheyVar6 = zzhey.f18574a;
                        return new zzibj(zzibmVar6.f19616a.m8051b(), zzhipVar.f18809c.m8051b());
                    }
                }
            }));
        }
        throw new GeneralSecurityException("AeadConfigurationV1 can only create AEADs");
    }
}
