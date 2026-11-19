package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.security.GeneralSecurityException;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhhy {

    /* JADX INFO: renamed from: a */
    public static final zzhnl f18766a;

    /* JADX INFO: renamed from: b */
    public static final zzhni f18767b;

    /* JADX INFO: renamed from: c */
    public static final zzhmh f18768c;

    /* JADX INFO: renamed from: d */
    public static final zzhme f18769d;

    static {
        zzibk zzibkVarM7596a = zzhok.m7596a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f18766a = new zzhnj(zzhht.class, new zzhnk() { // from class: com.google.android.gms.internal.ads.zzhhx
            @Override // com.google.android.gms.internal.ads.zzhnk
            /* JADX INFO: renamed from: a */
            public final zzhoa mo7458a(zzheq zzheqVar) {
                zzhht zzhhtVar = (zzhht) zzheqVar;
                zzhnl zzhnlVar = zzhhy.f18766a;
                zzhtd zzhtdVarM7800H = zzhte.m7800H();
                zzhtdVarM7800H.m7796q("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                zzhtdVarM7800H.m7797r(zzhhy.m7463b(zzhhtVar).m8098g());
                zzhtdVarM7800H.m7798s(zzhhy.m7462a(zzhhtVar.f18758a));
                return zzhoa.m7589a((zzhte) zzhtdVarM7800H.m8328o());
            }
        });
        f18767b = new zzhng(zzibkVarM7596a, new zzhnh() { // from class: com.google.android.gms.internal.ads.zzhhu
            @Override // com.google.android.gms.internal.ads.zzhnh
            /* JADX INFO: renamed from: a */
            public final zzheq mo7455a(zzhoa zzhoaVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhhy.f18766a;
                zzhte zzhteVar = zzhoaVar.f19043b;
                if (!zzhteVar.m7803D().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzhteVar.m7803D())));
                }
                try {
                    zzidl zzidlVarM7804E = zzhteVar.m7804E();
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    return zzhhy.m7464c(zzhtw.m7853F(zzidlVarM7804E, zzidz.f19759c), zzhteVar.m7805F());
                } catch (zzifh e) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
                }
            }
        });
        f18768c = new zzhmf(zzhhp.class, new zzhmg() { // from class: com.google.android.gms.internal.ads.zzhhv
            @Override // com.google.android.gms.internal.ads.zzhmg
            /* JADX INFO: renamed from: a */
            public final zzhnz mo7456a(zzhdz zzhdzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhhp zzhhpVar = (zzhhp) zzhdzVar;
                zzhnl zzhnlVar = zzhhy.f18766a;
                zzhtt zzhttVarM7848G = zzhtu.m7848G();
                zzhtw zzhtwVarM7463b = zzhhy.m7463b(zzhhpVar.f18741a);
                zzhttVarM7848G.m8326l();
                ((zzhtu) zzhttVarM7848G.f19780t).m7852I(zzhtwVarM7463b);
                return zzhnz.m7588a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzhtu) zzhttVarM7848G.m8328o()).m8098g(), zzhta.REMOTE, zzhhy.m7462a(zzhhpVar.f18741a.f18758a), zzhhpVar.f18743c);
            }
        });
        f18769d = new zzhmc(zzibkVarM7596a, new zzhmd() { // from class: com.google.android.gms.internal.ads.zzhhw
            @Override // com.google.android.gms.internal.ads.zzhmd
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7457a(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhhy.f18766a;
                if (!zzhnzVar.f19030a.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                }
                try {
                    zzidl zzidlVar = zzhnzVar.f19032c;
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhtu zzhtuVarM7847F = zzhtu.m7847F(zzidlVar, zzidz.f19759c);
                    if (zzhtuVarM7847F.m7850D() == 0) {
                        return zzhhp.m7461d(zzhhy.m7464c(zzhtuVarM7847F.m7851E(), zzhnzVar.f19034e), zzhnzVar.f19035f);
                    }
                    String strValueOf = String.valueOf(zzhtuVarM7847F);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 58);
                    sb.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
                    sb.append(strValueOf);
                    throw new GeneralSecurityException(sb.toString());
                } catch (zzifh e) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static zzhtx m7462a(zzhhs zzhhsVar) throws GeneralSecurityException {
        if (zzhhs.f18755b.equals(zzhhsVar)) {
            return zzhtx.TINK;
        }
        if (zzhhs.f18756c.equals(zzhhsVar)) {
            return zzhtx.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhhsVar)));
    }

    /* JADX INFO: renamed from: b */
    public static zzhtw m7463b(zzhht zzhhtVar) throws GeneralSecurityException {
        byte[] bArrM8099h = ((zzhoa) zzhne.f19005b.m7578h(zzhhtVar.f18761d)).f19043b.m8099h();
        try {
            zzidz zzidzVar = zzidz.f19758b;
            int i2 = zzicy.f19697a;
            zzhte zzhteVarM7799G = zzhte.m7799G(bArrM8099h, zzidz.f19759c);
            zzhtv zzhtvVarM7854G = zzhtw.m7854G();
            String str = zzhhtVar.f18759b;
            zzhtvVarM7854G.m8326l();
            ((zzhtw) zzhtvVarM7854G.f19780t).m7858I(str);
            zzhtvVarM7854G.m8326l();
            ((zzhtw) zzhtvVarM7854G.f19780t).m7859J(zzhteVarM7799G);
            return (zzhtw) zzhtvVarM7854G.m8328o();
        } catch (zzifh e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static zzhht m7464c(zzhtw zzhtwVar, zzhtx zzhtxVar) throws GeneralSecurityException {
        zzhhr zzhhrVar;
        zzhhs zzhhsVar;
        zzhtd zzhtdVarM7800H = zzhte.m7800H();
        zzhtdVarM7800H.m7796q(zzhtwVar.m7857E().m7803D());
        zzhtdVarM7800H.m7797r(zzhtwVar.m7857E().m7804E());
        zzhtdVarM7800H.m7798s(zzhtx.RAW);
        zzheq zzheqVarM7424a = zzhfa.m7424a(((zzhte) zzhtdVarM7800H.m8328o()).m8099h());
        boolean z = zzheqVarM7424a instanceof zzhgk;
        Object obj = zzhhr.f18753g;
        zzhhr zzhhrVar2 = zzhhr.f18752f;
        zzhhr zzhhrVar3 = zzhhr.f18751e;
        zzhhr zzhhrVar4 = zzhhr.f18749c;
        zzhhr zzhhrVar5 = zzhhr.f18750d;
        zzhhr zzhhrVar6 = zzhhr.f18748b;
        if (z) {
            zzhhrVar = zzhhrVar6;
        } else if (zzheqVarM7424a instanceof zzhgz) {
            zzhhrVar = zzhhrVar5;
        } else if (zzheqVarM7424a instanceof zzhiv) {
            zzhhrVar = zzhhrVar4;
        } else if (zzheqVarM7424a instanceof zzhft) {
            zzhhrVar = zzhhrVar3;
        } else if (zzheqVarM7424a instanceof zzhgb) {
            zzhhrVar = zzhhrVar2;
        } else {
            if (!(zzheqVarM7424a instanceof zzhgt)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zzheqVarM7424a.toString()));
            }
            zzhhrVar = obj;
        }
        zzhhq zzhhqVar = new zzhhq();
        int iOrdinal = zzhtxVar.ordinal();
        zzhhs zzhhsVar2 = zzhhs.f18756c;
        if (iOrdinal == 1) {
            zzhhsVar = zzhhs.f18755b;
        } else {
            if (iOrdinal != 3) {
                int iZza = zzhtxVar.zza();
                throw new GeneralSecurityException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iZza).length() + 34), "Unable to parse OutputPrefixType: ", iZza));
            }
            zzhhsVar = zzhhsVar2;
        }
        zzhhqVar.f18744a = zzhhsVar;
        String strM7856D = zzhtwVar.m7856D();
        zzhhqVar.f18745b = strM7856D;
        zzhfh zzhfhVar = (zzhfh) zzheqVarM7424a;
        zzhhqVar.f18747d = zzhfhVar;
        zzhhqVar.f18746c = zzhhrVar;
        if (zzhhqVar.f18744a == null) {
            zzhhqVar.f18744a = zzhhsVar2;
        }
        if (strM7856D == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        if (zzhfhVar == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (zzhfhVar.mo7421a()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((zzhhrVar.equals(zzhhrVar6) && (zzhfhVar instanceof zzhgk)) || ((zzhhrVar.equals(zzhhrVar5) && (zzhfhVar instanceof zzhgz)) || ((zzhhrVar.equals(zzhhrVar4) && (zzhfhVar instanceof zzhiv)) || ((zzhhrVar.equals(zzhhrVar3) && (zzhfhVar instanceof zzhft)) || ((zzhhrVar.equals(zzhhrVar2) && (zzhfhVar instanceof zzhgb)) || (zzhhrVar.equals(obj) && (zzhfhVar instanceof zzhgt))))))) {
            return new zzhht(zzhhqVar.f18744a, zzhhqVar.f18745b, zzhhqVar.f18746c, zzhhqVar.f18747d);
        }
        String str = zzhhqVar.f18746c.f18754a;
        String strValueOf = String.valueOf(zzhhqVar.f18747d);
        StringBuilder sb = new StringBuilder(strValueOf.length() + str.length() + 67 + 1);
        AbstractC0271e0.m413u(sb, "Cannot use parsing strategy ", str, " when new keys are picked according to ", strValueOf);
        sb.append(".");
        throw new GeneralSecurityException(sb.toString());
    }
}
