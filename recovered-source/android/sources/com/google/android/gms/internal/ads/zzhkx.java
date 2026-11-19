package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhkx {

    /* JADX INFO: renamed from: a */
    public static final zzhnl f18910a;

    /* JADX INFO: renamed from: b */
    public static final zzhni f18911b;

    /* JADX INFO: renamed from: c */
    public static final zzhmh f18912c;

    /* JADX INFO: renamed from: d */
    public static final zzhme f18913d;

    static {
        zzibk zzibkVarM7596a = zzhok.m7596a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f18910a = new zzhnj(zzhiv.class, new zzhnk() { // from class: com.google.android.gms.internal.ads.zzhkw
            @Override // com.google.android.gms.internal.ads.zzhnk
            /* JADX INFO: renamed from: a */
            public final zzhoa mo7458a(zzheq zzheqVar) {
                zzhnl zzhnlVar = zzhkx.f18910a;
                zzhtd zzhtdVarM7800H = zzhte.m7800H();
                zzhtdVarM7800H.m7796q("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
                zzhtdVarM7800H.m7797r(zzhuz.m7974F().m8098g());
                zzhtdVarM7800H.m7798s(zzhkx.m7501a(((zzhiv) zzheqVar).f18822a));
                return zzhoa.m7589a((zzhte) zzhtdVarM7800H.m8328o());
            }
        });
        f18911b = new zzhng(zzibkVarM7596a, new zzhnh() { // from class: com.google.android.gms.internal.ads.zzhkt
            @Override // com.google.android.gms.internal.ads.zzhnh
            /* JADX INFO: renamed from: a */
            public final zzheq mo7455a(zzhoa zzhoaVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhkx.f18910a;
                zzhte zzhteVar = zzhoaVar.f19043b;
                if (!zzhteVar.m7803D().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhteVar.m7803D())));
                }
                try {
                    zzidl zzidlVarM7804E = zzhteVar.m7804E();
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    if (zzhuz.m7973E(zzidlVarM7804E, zzidz.f19759c).m7975D() == 0) {
                        return new zzhiv(zzhkx.m7502b(zzhteVar.m7805F()));
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (zzifh e) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e);
                }
            }
        });
        f18912c = new zzhmf(zzhip.class, new zzhmg() { // from class: com.google.android.gms.internal.ads.zzhku
            @Override // com.google.android.gms.internal.ads.zzhmg
            /* JADX INFO: renamed from: a */
            public final zzhnz mo7456a(zzhdz zzhdzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhip zzhipVar = (zzhip) zzhdzVar;
                zzhnl zzhnlVar = zzhkx.f18910a;
                zzhuw zzhuwVarM7968G = zzhux.m7968G();
                byte[] bArrM8051b = zzhipVar.f18808b.f19616a.m8051b();
                zzidl zzidlVarM8149y = zzidl.m8149y(bArrM8051b, 0, bArrM8051b.length);
                zzhuwVarM7968G.m8326l();
                ((zzhux) zzhuwVarM7968G.f19780t).m7972I(zzidlVarM8149y);
                return zzhnz.m7588a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzhux) zzhuwVarM7968G.m8328o()).m8098g(), zzhta.SYMMETRIC, zzhkx.m7501a(zzhipVar.f18807a.f18822a), zzhipVar.f18810d);
            }
        });
        f18913d = new zzhmc(zzibkVarM7596a, new zzhmd() { // from class: com.google.android.gms.internal.ads.zzhkv
            @Override // com.google.android.gms.internal.ads.zzhmd
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7457a(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhkx.f18910a;
                if (!zzhnzVar.f19030a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    zzidl zzidlVar = zzhnzVar.f19032c;
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhux zzhuxVarM7967F = zzhux.m7967F(zzidlVar, zzidz.f19759c);
                    if (zzhuxVarM7967F.m7970D() == 0) {
                        return zzhip.m7467d(zzhkx.m7502b(zzhnzVar.f19034e), new zzibm(zzibk.m8050a(zzhuxVarM7967F.m7971E().m8151a())), zzhnzVar.f19035f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (zzifh unused) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static zzhtx m7501a(zzhiu zzhiuVar) throws GeneralSecurityException {
        if (zzhiu.f18818b.equals(zzhiuVar)) {
            return zzhtx.TINK;
        }
        if (zzhiu.f18819c.equals(zzhiuVar)) {
            return zzhtx.CRUNCHY;
        }
        if (zzhiu.f18820d.equals(zzhiuVar)) {
            return zzhtx.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhiuVar.f18821a));
    }

    /* JADX INFO: renamed from: b */
    public static zzhiu m7502b(zzhtx zzhtxVar) throws GeneralSecurityException {
        int iOrdinal = zzhtxVar.ordinal();
        if (iOrdinal == 1) {
            return zzhiu.f18818b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhiu.f18820d;
            }
            if (iOrdinal != 4) {
                int iZza = zzhtxVar.zza();
                throw new GeneralSecurityException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iZza).length() + 34), "Unable to parse OutputPrefixType: ", iZza));
            }
        }
        return zzhiu.f18819c;
    }
}
