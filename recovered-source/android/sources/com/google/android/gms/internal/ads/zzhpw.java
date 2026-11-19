package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhpw {

    /* JADX INFO: renamed from: a */
    public static final zzhnl f19139a;

    /* JADX INFO: renamed from: b */
    public static final zzhni f19140b;

    /* JADX INFO: renamed from: c */
    public static final zzhmh f19141c;

    /* JADX INFO: renamed from: d */
    public static final zzhme f19142d;

    static {
        zzibk zzibkVarM7596a = zzhok.m7596a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f19139a = new zzhnj(zzhot.class, new zzhnk() { // from class: com.google.android.gms.internal.ads.zzhpv
            @Override // com.google.android.gms.internal.ads.zzhnk
            /* JADX INFO: renamed from: a */
            public final zzhoa mo7458a(zzheq zzheqVar) {
                zzhot zzhotVar = (zzhot) zzheqVar;
                zzhnl zzhnlVar = zzhpw.f19139a;
                zzhtd zzhtdVarM7800H = zzhte.m7800H();
                zzhtdVarM7800H.m7796q("type.googleapis.com/google.crypto.tink.AesCmacKey");
                zzhqw zzhqwVarM7627G = zzhqx.m7627G();
                zzhqy zzhqyVarM7632E = zzhqz.m7632E();
                int i2 = zzhotVar.f19081b;
                zzhqyVarM7632E.m8326l();
                ((zzhqz) zzhqyVarM7632E.f19780t).m7635G(i2);
                zzhqz zzhqzVar = (zzhqz) zzhqyVarM7632E.m8328o();
                zzhqwVarM7627G.m8326l();
                ((zzhqx) zzhqwVarM7627G.f19780t).m7631I(zzhqzVar);
                int i3 = zzhotVar.f19080a;
                zzhqwVarM7627G.m8326l();
                ((zzhqx) zzhqwVarM7627G.f19780t).m7630H(i3);
                zzhtdVarM7800H.m7797r(((zzhqx) zzhqwVarM7627G.m8328o()).m8098g());
                zzhtdVarM7800H.m7798s(zzhpw.m7611a(zzhotVar.f19082c));
                return zzhoa.m7589a((zzhte) zzhtdVarM7800H.m8328o());
            }
        });
        f19140b = new zzhng(zzibkVarM7596a, new zzhnh() { // from class: com.google.android.gms.internal.ads.zzhps
            @Override // com.google.android.gms.internal.ads.zzhnh
            /* JADX INFO: renamed from: a */
            public final zzheq mo7455a(zzhoa zzhoaVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhpw.f19139a;
                zzhte zzhteVar = zzhoaVar.f19043b;
                if (!zzhteVar.m7803D().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzhteVar.m7803D())));
                }
                try {
                    zzidl zzidlVarM7804E = zzhteVar.m7804E();
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhqx zzhqxVarM7626F = zzhqx.m7626F(zzidlVarM7804E, zzidz.f19759c);
                    zzhor zzhorVar = new zzhor(0);
                    zzhorVar.m7601a(zzhqxVarM7626F.m7628D());
                    zzhorVar.m7602b(zzhqxVarM7626F.m7629E().m7634D());
                    zzhorVar.f19074c = zzhpw.m7612b(zzhteVar.m7805F());
                    return zzhorVar.m7603c();
                } catch (zzifh e) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
                }
            }
        });
        f19141c = new zzhmf(zzhom.class, new zzhmg() { // from class: com.google.android.gms.internal.ads.zzhpt
            @Override // com.google.android.gms.internal.ads.zzhmg
            /* JADX INFO: renamed from: a */
            public final zzhnz mo7456a(zzhdz zzhdzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhom zzhomVar = (zzhom) zzhdzVar;
                zzhnl zzhnlVar = zzhpw.f19139a;
                zzhqu zzhquVarM7619H = zzhqv.m7619H();
                zzhot zzhotVar = zzhomVar.f19061a;
                zzhqy zzhqyVarM7632E = zzhqz.m7632E();
                int i2 = zzhotVar.f19081b;
                zzhqyVarM7632E.m8326l();
                ((zzhqz) zzhqyVarM7632E.f19780t).m7635G(i2);
                zzhqz zzhqzVar = (zzhqz) zzhqyVarM7632E.m8328o();
                zzhquVarM7619H.m8326l();
                ((zzhqv) zzhquVarM7619H.f19780t).m7625K(zzhqzVar);
                byte[] bArrM8051b = zzhomVar.f19062b.f19616a.m8051b();
                zzidl zzidlVarM8149y = zzidl.m8149y(bArrM8051b, 0, bArrM8051b.length);
                zzhquVarM7619H.m8326l();
                ((zzhqv) zzhquVarM7619H.f19780t).m7624J(zzidlVarM8149y);
                return zzhnz.m7588a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzhqv) zzhquVarM7619H.m8328o()).m8098g(), zzhta.SYMMETRIC, zzhpw.m7611a(zzhomVar.f19061a.f19082c), zzhomVar.f19064d);
            }
        });
        f19142d = new zzhmc(zzibkVarM7596a, new zzhmd() { // from class: com.google.android.gms.internal.ads.zzhpu
            @Override // com.google.android.gms.internal.ads.zzhmd
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7457a(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhpw.f19139a;
                if (!zzhnzVar.f19030a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                }
                try {
                    zzidl zzidlVar = zzhnzVar.f19032c;
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhqv zzhqvVarM7618G = zzhqv.m7618G(zzidlVar, zzidz.f19759c);
                    if (zzhqvVarM7618G.m7621D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzhor zzhorVar = new zzhor(0);
                    zzhorVar.m7601a(zzhqvVarM7618G.m7622E().mo8132h());
                    zzhorVar.m7602b(zzhqvVarM7618G.m7623F().m7634D());
                    zzhorVar.f19074c = zzhpw.m7612b(zzhnzVar.f19034e);
                    zzhot zzhotVarM7603c = zzhorVar.m7603c();
                    zzhol zzholVar = new zzhol(0);
                    zzholVar.f19058a = zzhotVarM7603c;
                    zzholVar.f19059b = new zzibm(zzibk.m8050a(zzhqvVarM7618G.m7622E().m8151a()));
                    zzholVar.f19060c = zzhnzVar.f19035f;
                    return zzholVar.m7599a();
                } catch (zzifh | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static zzhtx m7611a(zzhos zzhosVar) throws GeneralSecurityException {
        if (zzhos.f19075b.equals(zzhosVar)) {
            return zzhtx.TINK;
        }
        if (zzhos.f19076c.equals(zzhosVar)) {
            return zzhtx.CRUNCHY;
        }
        if (zzhos.f19078e.equals(zzhosVar)) {
            return zzhtx.RAW;
        }
        if (zzhos.f19077d.equals(zzhosVar)) {
            return zzhtx.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhosVar)));
    }

    /* JADX INFO: renamed from: b */
    public static zzhos m7612b(zzhtx zzhtxVar) throws GeneralSecurityException {
        int iOrdinal = zzhtxVar.ordinal();
        if (iOrdinal == 1) {
            return zzhos.f19075b;
        }
        if (iOrdinal == 2) {
            return zzhos.f19077d;
        }
        if (iOrdinal == 3) {
            return zzhos.f19078e;
        }
        if (iOrdinal == 4) {
            return zzhos.f19076c;
        }
        int iZza = zzhtxVar.zza();
        throw new GeneralSecurityException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iZza).length() + 34), "Unable to parse OutputPrefixType: ", iZza));
    }
}
