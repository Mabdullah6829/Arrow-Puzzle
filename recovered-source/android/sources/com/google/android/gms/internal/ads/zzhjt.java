package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhjt {

    /* JADX INFO: renamed from: a */
    public static final zzhnl f18864a;

    /* JADX INFO: renamed from: b */
    public static final zzhni f18865b;

    /* JADX INFO: renamed from: c */
    public static final zzhmh f18866c;

    /* JADX INFO: renamed from: d */
    public static final zzhme f18867d;

    static {
        zzibk zzibkVarM7596a = zzhok.m7596a("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f18864a = new zzhnj(zzhgt.class, new zzhnk() { // from class: com.google.android.gms.internal.ads.zzhjs
            @Override // com.google.android.gms.internal.ads.zzhnk
            /* JADX INFO: renamed from: a */
            public final zzhoa mo7458a(zzheq zzheqVar) {
                zzhgt zzhgtVar = (zzhgt) zzheqVar;
                zzhnl zzhnlVar = zzhjt.f18864a;
                zzhtd zzhtdVarM7800H = zzhte.m7800H();
                zzhtdVarM7800H.m7796q("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                zzhrw zzhrwVarM7703G = zzhrx.m7703G();
                int i2 = zzhgtVar.f18695a;
                zzhrwVarM7703G.m8326l();
                ((zzhrx) zzhrwVarM7703G.f19780t).m7706H(i2);
                zzhtdVarM7800H.m7797r(((zzhrx) zzhrwVarM7703G.m8328o()).m8098g());
                zzhtdVarM7800H.m7798s(zzhjt.m7481a(zzhgtVar.f18696b));
                return zzhoa.m7589a((zzhte) zzhtdVarM7800H.m8328o());
            }
        });
        f18865b = new zzhng(zzibkVarM7596a, new zzhnh() { // from class: com.google.android.gms.internal.ads.zzhjp
            @Override // com.google.android.gms.internal.ads.zzhnh
            /* JADX INFO: renamed from: a */
            public final zzheq mo7455a(zzhoa zzhoaVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhjt.f18864a;
                zzhte zzhteVar = zzhoaVar.f19043b;
                if (!zzhteVar.m7803D().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzhteVar.m7803D())));
                }
                try {
                    zzidl zzidlVarM7804E = zzhteVar.m7804E();
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhrx zzhrxVarM7702F = zzhrx.m7702F(zzidlVarM7804E, zzidz.f19759c);
                    if (zzhrxVarM7702F.m7705E() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    zzhgr zzhgrVar = new zzhgr(0);
                    zzhgrVar.m7451a(zzhrxVarM7702F.m7704D());
                    zzhgrVar.f18690b = zzhjt.m7482b(zzhteVar.m7805F());
                    return zzhgrVar.m7452b();
                } catch (zzifh e) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
                }
            }
        });
        f18866c = new zzhmf(zzhgm.class, new zzhmg() { // from class: com.google.android.gms.internal.ads.zzhjq
            @Override // com.google.android.gms.internal.ads.zzhmg
            /* JADX INFO: renamed from: a */
            public final zzhnz mo7456a(zzhdz zzhdzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhgm zzhgmVar = (zzhgm) zzhdzVar;
                zzhnl zzhnlVar = zzhjt.f18864a;
                zzhru zzhruVarM7697G = zzhrv.m7697G();
                byte[] bArrM8051b = zzhgmVar.f18679b.f19616a.m8051b();
                zzidl zzidlVarM8149y = zzidl.m8149y(bArrM8051b, 0, bArrM8051b.length);
                zzhruVarM7697G.m8326l();
                ((zzhrv) zzhruVarM7697G.f19780t).m7701I(zzidlVarM8149y);
                return zzhnz.m7588a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzhrv) zzhruVarM7697G.m8328o()).m8098g(), zzhta.SYMMETRIC, zzhjt.m7481a(zzhgmVar.f18678a.f18696b), zzhgmVar.f18681d);
            }
        });
        f18867d = new zzhmc(zzibkVarM7596a, new zzhmd() { // from class: com.google.android.gms.internal.ads.zzhjr
            @Override // com.google.android.gms.internal.ads.zzhmd
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7457a(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhjt.f18864a;
                if (!zzhnzVar.f19030a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                }
                try {
                    zzidl zzidlVar = zzhnzVar.f19032c;
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhrv zzhrvVarM7696F = zzhrv.m7696F(zzidlVar, zzidz.f19759c);
                    if (zzhrvVarM7696F.m7699D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzhgr zzhgrVar = new zzhgr(0);
                    zzhgrVar.m7451a(zzhrvVarM7696F.m7700E().mo8132h());
                    zzhgrVar.f18690b = zzhjt.m7482b(zzhnzVar.f19034e);
                    zzhgt zzhgtVarM7452b = zzhgrVar.m7452b();
                    zzhgl zzhglVar = new zzhgl(0);
                    zzhglVar.f18675a = zzhgtVarM7452b;
                    zzhglVar.f18676b = new zzibm(zzibk.m8050a(zzhrvVarM7696F.m7700E().m8151a()));
                    zzhglVar.f18677c = zzhnzVar.f19035f;
                    return zzhglVar.m7450a();
                } catch (zzifh unused) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static zzhtx m7481a(zzhgs zzhgsVar) throws GeneralSecurityException {
        if (zzhgs.f18691b.equals(zzhgsVar)) {
            return zzhtx.TINK;
        }
        if (zzhgs.f18692c.equals(zzhgsVar)) {
            return zzhtx.CRUNCHY;
        }
        if (zzhgs.f18693d.equals(zzhgsVar)) {
            return zzhtx.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhgsVar)));
    }

    /* JADX INFO: renamed from: b */
    public static zzhgs m7482b(zzhtx zzhtxVar) throws GeneralSecurityException {
        int iOrdinal = zzhtxVar.ordinal();
        if (iOrdinal == 1) {
            return zzhgs.f18691b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhgs.f18693d;
            }
            if (iOrdinal != 4) {
                int iZza = zzhtxVar.zza();
                throw new GeneralSecurityException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iZza).length() + 34), "Unable to parse OutputPrefixType: ", iZza));
            }
        }
        return zzhgs.f18692c;
    }
}
