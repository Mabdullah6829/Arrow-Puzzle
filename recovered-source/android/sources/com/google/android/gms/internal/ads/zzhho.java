package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
final class zzhho {

    /* JADX INFO: renamed from: a */
    public static final zzhnl f18737a;

    /* JADX INFO: renamed from: b */
    public static final zzhni f18738b;

    /* JADX INFO: renamed from: c */
    public static final zzhmh f18739c;

    /* JADX INFO: renamed from: d */
    public static final zzhme f18740d;

    static {
        zzibk zzibkVarM7596a = zzhok.m7596a("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f18737a = new zzhnj(zzhhj.class, new zzhnk() { // from class: com.google.android.gms.internal.ads.zzhhn
            @Override // com.google.android.gms.internal.ads.zzhnk
            /* JADX INFO: renamed from: a */
            public final zzhoa mo7458a(zzheq zzheqVar) {
                zzhhj zzhhjVar = (zzhhj) zzheqVar;
                zzhnl zzhnlVar = zzhho.f18737a;
                zzhtd zzhtdVarM7800H = zzhte.m7800H();
                zzhtdVarM7800H.m7796q("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                zzhtr zzhtrVarM7843F = zzhts.m7843F();
                String str = zzhhjVar.f18731a;
                zzhtrVarM7843F.m8326l();
                ((zzhts) zzhtrVarM7843F.f19780t).m7846H(str);
                zzhtdVarM7800H.m7797r(((zzhts) zzhtrVarM7843F.m8328o()).m8098g());
                zzhtdVarM7800H.m7798s(zzhho.m7459a(zzhhjVar.f18732b));
                return zzhoa.m7589a((zzhte) zzhtdVarM7800H.m8328o());
            }
        });
        f18738b = new zzhng(zzibkVarM7596a, new zzhnh() { // from class: com.google.android.gms.internal.ads.zzhhk
            @Override // com.google.android.gms.internal.ads.zzhnh
            /* JADX INFO: renamed from: a */
            public final zzheq mo7455a(zzhoa zzhoaVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhho.f18737a;
                zzhte zzhteVar = zzhoaVar.f19043b;
                if (!zzhteVar.m7803D().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzhteVar.m7803D())));
                }
                try {
                    zzidl zzidlVarM7804E = zzhteVar.m7804E();
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    return new zzhhj(zzhts.m7842E(zzidlVarM7804E, zzidz.f19759c).m7845D(), zzhho.m7460b(zzhteVar.m7805F()));
                } catch (zzifh e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
                }
            }
        });
        f18739c = new zzhmf(zzhhh.class, new zzhmg() { // from class: com.google.android.gms.internal.ads.zzhhl
            @Override // com.google.android.gms.internal.ads.zzhmg
            /* JADX INFO: renamed from: a */
            public final zzhnz mo7456a(zzhdz zzhdzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhhh zzhhhVar = (zzhhh) zzhdzVar;
                zzhnl zzhnlVar = zzhho.f18737a;
                zzhtp zzhtpVarM7837G = zzhtq.m7837G();
                zzhtr zzhtrVarM7843F = zzhts.m7843F();
                String str = zzhhhVar.f18725a.f18731a;
                zzhtrVarM7843F.m8326l();
                ((zzhts) zzhtrVarM7843F.f19780t).m7846H(str);
                zzhts zzhtsVar = (zzhts) zzhtrVarM7843F.m8328o();
                zzhtpVarM7837G.m8326l();
                ((zzhtq) zzhtpVarM7837G.f19780t).m7841I(zzhtsVar);
                return zzhnz.m7588a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzhtq) zzhtpVarM7837G.m8328o()).m8098g(), zzhta.REMOTE, zzhho.m7459a(zzhhhVar.f18725a.f18732b), zzhhhVar.f18727c);
            }
        });
        f18740d = new zzhmc(zzibkVarM7596a, new zzhmd() { // from class: com.google.android.gms.internal.ads.zzhhm
            @Override // com.google.android.gms.internal.ads.zzhmd
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7457a(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhho.f18737a;
                if (!zzhnzVar.f19030a.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                }
                try {
                    zzidl zzidlVar = zzhnzVar.f19032c;
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhtq zzhtqVarM7836F = zzhtq.m7836F(zzidlVar, zzidz.f19759c);
                    if (zzhtqVarM7836F.m7839D() == 0) {
                        return zzhhh.m7454d(new zzhhj(zzhtqVarM7836F.m7840E().m7845D(), zzhho.m7460b(zzhnzVar.f19034e)), zzhnzVar.f19035f);
                    }
                    String strValueOf = String.valueOf(zzhtqVarM7836F);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 49);
                    sb.append("KmsAeadKey are only accepted with version 0, got ");
                    sb.append(strValueOf);
                    throw new GeneralSecurityException(sb.toString());
                } catch (zzifh e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static zzhtx m7459a(zzhhi zzhhiVar) throws GeneralSecurityException {
        if (zzhhi.f18728b.equals(zzhhiVar)) {
            return zzhtx.TINK;
        }
        if (zzhhi.f18729c.equals(zzhhiVar)) {
            return zzhtx.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhhiVar.f18730a));
    }

    /* JADX INFO: renamed from: b */
    public static zzhhi m7460b(zzhtx zzhtxVar) throws GeneralSecurityException {
        int iOrdinal = zzhtxVar.ordinal();
        if (iOrdinal == 1) {
            return zzhhi.f18728b;
        }
        if (iOrdinal == 3) {
            return zzhhi.f18729c;
        }
        int iZza = zzhtxVar.zza();
        throw new GeneralSecurityException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iZza).length() + 34), "Unable to parse OutputPrefixType: ", iZza));
    }
}
